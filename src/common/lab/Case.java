package common.lab;

public class Case {
    String name;
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Case(int x, int y, String type){
        this.x=x;
        this.y=y;

    }

    public String toString(){
        return "posX : "+x+" posY : "+y;
    }
}
