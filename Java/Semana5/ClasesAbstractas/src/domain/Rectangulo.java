
package domain;

public class Rectangulo extends FiguraGeometrica{
    //Constructor
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
@Override
public void dibujar(){
    System.out.println("se imprime un: "+ this.getClass().getSimpleName());
}
    
}
