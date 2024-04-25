import java.util.Scanner;

public class App2 {

    public static double activos [] = new double [3];
    public static double pasivos [] = new double [3];
    public static double capital [] = new double [3];

    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        double valordeactivo=0;
        double valordepasivo=0;
        double valordecapital=0;
        double totalactivo=0;
        double totalpasivo=0;
        double totalcapital=0;

        for (int i = 0; i < activos.length; i++) {
            System.out.print("Digite los activos:");
            valordeactivo = leer.nextInt();
            System.out.println((i+1) +". " +"Valor de activo: "  +valordeactivo);
            activos [i]= valordeactivo;
            totalactivo += activos[i];   
        }
        System.out.println("El total de los activos es: "  +totalactivo);

        for (int i = 0; i < pasivos.length; i++) {
            System.out.print("Digite los Pasivos:");
            valordepasivo = leer.nextInt();
            System.out.println((i+1) +". " +"Valor de Pasivo: "  +valordepasivo);
            pasivos [i]= valordepasivo;
            totalpasivo += pasivos[i]; 

    }
    System.out.println( "El total de los pasivos es: "+totalpasivo);

    for (int i = 0; i < capital.length; i++) {
        System.out.print("Digite el Capital:");
        valordecapital = leer.nextInt();
        System.out.println((i+1) +". " +"Valor de Capital: "  +valordecapital);
        capital [i]= valordecapital;
        totalcapital += capital[i];
        }
        System.out.println(totalcapital);

        if (totalactivo == (totalpasivo+totalcapital)) {

            System.out.println("El balance esta correcto.");

        } else {
            System.out.println("El balance esta incorrecto.");
            System.out.println("El valor del activo es "+totalactivo+ " la suma del pasivo y capital es: "+ (totalpasivo+totalcapital));
            System.out.println("La diferencia es:" + (totalactivo - (totalpasivo+totalcapital) *-1));
            System.out.println("Adios Ingeniero");
            leer.close();
             }
 
        }
  
    }

