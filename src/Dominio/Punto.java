
package Dominio;

public class Punto {
    //Declaracion de variables
    private int x =0;
    private int y =0;
    private int j;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Las coordenadas es: " + "x= " + x + "; y= " + y + "\n La distancia es: " + j;
    }
   
    
    
    
}
