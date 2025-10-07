import java.util.Scanner;

public class Programador {

    private String name;
    private int salario = 22000;
    private String lenguajePrincipal;
    private String lenguajeSecundario;

    public String getName(){
        return name;
    }

    public int getSalario(){
        return salario;
    }
    public int setSalario(int salario){
        System.out.println("Introduce tu nuevo salario (no puede ser menor al actual): ");
        Scanner sc = new Scanner(System.in);
        int newSalario = sc.nextInt();

        while (newSalario <= salario){
            System.out.println("El salario introducido no cumple con las normas, introducelo de nuevo: ");
            Scanner sc1 = new Scanner(System.in);
            newSalario = sc.nextInt();
        }
        return newSalario;
    }

    public String getLenguajePrincipal(){
        return lenguajePrincipal;
    }

    public String getLenguajeSecundario(){
        return lenguajeSecundario;
    }

    public String setLenguajePrincipal(){
        System.out.println("Introduce el nuevo lenguaje: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public Programador(String name, int salario, String lenguajePrincipal, String lenguajeSecundario) {
        this.name = name;
        this.salario = salario;
        this.lenguajePrincipal = lenguajePrincipal;
        this.lenguajeSecundario = lenguajeSecundario;
    }
}
