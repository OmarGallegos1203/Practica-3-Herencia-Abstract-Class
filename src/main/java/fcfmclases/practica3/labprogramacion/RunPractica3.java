package fcfmclases.practica3.labprogramacion;
/** PRACTICA 3 "CLASES ABSTRACTAS"
 * CLASE PADRE 
 * @since 10/02/2022
 * @author Omar Gallegos
 */
public class RunPractica3 {
    public static void main(String[] args) {
        //SALIDA
        System.out.println("\tDISPOSITIVOS ELECTRONICOS");
        System.out.println("TELEVISION");
        //DATOS TELEVISION
        Television smartv = new Television();
        smartv.setMarca("Samsung");
        smartv.setModelo("QLED8K");
        smartv.setColor("#000000-Negro");
        //PRINT TELEVISION
        System.out.println("Marca: "+smartv.getMarca());
        System.out.println("Modelo: "+smartv.getModelo());
        System.out.println("Color: "+smartv.getColor());
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
        System.out.print("OPCION ENCENDER:\t");
        smartv.encender();
        System.out.println("OPCION CAMBIAR CANAL:\t"+smartv.cambiarCanal());
        System.out.println("OPCION SUBIR VOLUMEN:\t"+smartv.subirVolumen());
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
        //DATOS CALCULADORA
        Calculadora calcusio = new Calculadora();
        calcusio.setMarca("Casio");
        calcusio.setModelo("fx-115ES PLUS");
        //PRINT CALCULADORA
        System.out.println("CALCULADORA");
        System.out.println("Marca: "+calcusio.getMarca());
        System.out.println("Modelo: "+calcusio.getModelo());
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
        System.out.print("OPCION ENCENDER:\t");
        calcusio.encender();
        System.out.println("OPCION SUMA:             7.5+13.56= "+calcusio.suma(7.5, 13.56));
        System.out.println("OPCION RSTA:             8.48-6.96= "+calcusio.resta(8.48, 6.96));
        System.out.println("OPCION MULTIPLICACION:   (6.16)*(1.38)= "+calcusio.multpli(6.16, 1.38));
        System.out.println("OPCION DIVISION:         20/19= "+calcusio.divi(20, 19));
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
    }
}
