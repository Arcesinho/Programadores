import java.util.Scanner;

public class Programador {

    //Atributos

    private String name;
    private int salario;
    private String lenguajePrincipal;
    private String lenguajeSecundario;

    //Getters

    public String getName(){
        return name;
    }

    public int getSalario(){
        return salario;
    }

    public String getLenguajePrincipal(){
        return lenguajePrincipal;
    }

    public String getLenguajeSecundario(){
        return lenguajeSecundario;
    }

    //Setters

    public void  setSalario(int salario){

        int newSalario = salario;

        while (newSalario <= this.salario){
            System.out.println("El salario introducido no cumple con las normas, introducelo de nuevo: ");
            Scanner sc = new Scanner(System.in);
            newSalario = sc.nextInt();
        }

        this.salario = newSalario;
        System.out.println("Nuevo salario actualizado correctamente.");
    }

    public void  setLenguajePrincipal(String lenguajePrincipal){
        this.lenguajePrincipal =lenguajePrincipal;
    }
    public void  setLenguajeSecundario(String lenguajeSecundario){
        this.lenguajeSecundario = lenguajeSecundario ;
    }

    //Constructor

    public Programador(String name, int salario, String lenguajePrincipal, String lenguajeSecundario) {
        this.name = name;
        this.salario = salario;
        this.lenguajePrincipal = lenguajePrincipal;
        this.lenguajeSecundario = lenguajeSecundario;
    }
}
