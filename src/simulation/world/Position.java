package simulation.world;

import java.util.Vector;

/**
 * Created by Leelo on 10/11/2015.
 */
public class Position {

    private int x,y;

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public static Position getRandomPos(Position posMax){
        return new Position((int)(Math.random() * posMax.getX()),(int)(Math.random() * posMax.getY()));
    }

    public String toString(){
        return "Position [x = "+this.x+" ; y = "+this.y+"]";
    }

    public boolean equals(Position pos){
        return (this.x == pos.x && this.y == pos.y);
    }

    public boolean equals(Object o){
        if(o.getClass() == Position.class){
            Position pos;
            pos = (Position) o;
            return (this.x == pos.x && this.y == pos.y);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

}
