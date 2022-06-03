package fcfmclases.practica3.labprogramacion;
/** PRACTICA 3 "CLASES ABSTRACTAS"
 * CLASE HIJA 
 * @since 10/02/2022
 * @author Omar Gallegos
 */
public class Calculadora extends DispositivoElectronico {
    //METODOS
    @Override
    public void encender() {
    System.out.println(" ENCENDIENDO CALCULADORA...");
    System.out.println("                       \t CALCULADORA ENCENDIENDA!");
    }
    //
    public double suma(double a, double b){
    return a+b;
    }
    //
    public double resta(double a, double b){
    return a-b;
    }
    //
    public double multpli (double a, double b){
    return a*b;
    }
    //
    public double divi (double a, double b){
    return a/b;
    }

    
    
    
}
