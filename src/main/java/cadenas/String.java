package cadenas;

import java.util.Scanner;


public class String {
    java.lang.String cadena;
    java.lang.String dd;
    java.lang.String mm;
    java.lang.String yyyy;

    public void capturarDatos(Scanner scanner){
        System.out.println("Ingresa una fecha en el siguiente formato: dd/mm/yyyy");
        java.lang.String temporal = scanner.nextLine();
        cadena = temporal.trim();
        procesarCadena();

    }

    private void procesarCadena(){
        int pos1 = cadena.indexOf("/");
        int pos2 = cadena.lastIndexOf("/");
        dd = cadena.substring(0,pos1);
        mm = cadena.substring(pos1+1,pos2);
        yyyy = cadena.substring(pos2+1);
    }






    @Override
    public java.lang.String toString() {
        return "dia: "+dd + "mes: "+ mm + "año: " + yyyy + cadena.trim() ;
    }


}
