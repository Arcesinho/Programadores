import java.util.Objects;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Programador programador = new Programador("Adrián",22000,"java","python");

        int option = 1;

        while (option != 4){
            String LenguajePrincipalOriginal = programador.getLenguajePrincipal();
            System.out.println("\nBienvenido, "+ programador.getName()+ " que deseas hacer: \n1:Actualizar salario\n2:Actualizar lenguaje\n3:Mostrar datos\n4:Salir del programa");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();


            if (option == 1){

                System.out.println("Introduce tu nuevo salario (no puede ser menor al actual): ");
                Scanner sc1 = new Scanner(System.in);
                int getSalario = sc.nextInt();
                programador.setSalario(getSalario);


            } else if (option == 2) {
                System.out.println("Introduce el nuevo lenguaje de programacion: ");
                Scanner sc2 = new Scanner(System.in);
                String newLanguage = sc2.nextLine();


                if (Objects.equals(newLanguage, programador.getLenguajeSecundario())){

                    programador.setLenguajeSecundario(programador.getLenguajePrincipal());
                    programador.setLenguajePrincipal(newLanguage);

                } else if (Objects.equals(newLanguage, programador.getLenguajePrincipal())) {
                    System.out.println("El lenguaje introducido "+ newLanguage + " es igual al lenguaje principal "+ programador.getLenguajePrincipal());
                } else{
                    programador.setLenguajeSecundario(programador.getLenguajePrincipal());
                    programador.setLenguajePrincipal(newLanguage);
                }

            } else if (option == 3) {

                System.out.println("Estos son los datos almacenados: ");
                System.out.println("Nombre: "+programador.getName());
                System.out.println("Salario: "+programador.getSalario());
                System.out.println("Lenguaje Principal: "+programador.getLenguajePrincipal());
                System.out.println("Lenguaje Secundario: "+programador.getLenguajeSecundario());

            }
        }
    }
}
