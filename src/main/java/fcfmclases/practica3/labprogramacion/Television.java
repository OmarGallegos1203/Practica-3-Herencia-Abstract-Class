package fcfmclases.practica3.labprogramacion;
/** PRACTICA 3 "CLASES ABSTRACTAS"
 * CLASE HIJA 
 * @since 10/02/2022
 * @author Omar Gallegos
 */
public class Television extends DispositivoElectronico{
    @Override
    public void encender(){
    System.out.println("ENCENDIENDO TELEVISION...");
    System.out.println("                  \tTELEVISION ENCENDIENDA!");
    }
    //PROPIEDADES
    private String color;
    //METODOS
    public String cambiarCanal(){
    return "CANAL CAMBIADO!";
    }
    //
    public String subirVolumen(){
    return "SUBIENDO VOLUMEN!"; 
    }

   //ENCAPSULAMIENTO DE COLOR (GET Y SET)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
 