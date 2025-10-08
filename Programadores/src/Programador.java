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

    public Programador(String name, String lenguajePrincipal, String lenguajeSecundario) {
        this.name = name;
        this.salario = 22000;
        this.lenguajePrincipal = lenguajePrincipal;
        this.lenguajeSecundario = lenguajeSecundario;
    }

    //Funciones

    /**
     *
     * @param nuevoSalario
     * @return -1 si el salario no se ha modificado. El nuevo salario si se ha modificado.
     */
    public int modificarSalario (int nuevoSalario){

        if(this.salario <= nuevoSalario){
            return -1;
        }

        this.salario = nuevoSalario;
        return this.salario;
    }
    /**
     *
     * @param nuevoLenguaje
     * @return true si se cambia y false si no
     */
    public boolean modificarLenguaje(String nuevoLenguaje){
        //Si el nuevo lenguaje es igual al principal -> no hago nada
        if (nuevoLenguaje.equals(this.lenguajePrincipal)){
            return false;
        }
        //si el nuevo lenguaje no es el principal
        //      -> El lenguaje principal pasa al secundario y el nuevo lenguaje pasa a ser principal
        if(!nuevoLenguaje.equals(this.lenguajePrincipal)){
            this.lenguajeSecundario = this.lenguajePrincipal;
            this.lenguajePrincipal = nuevoLenguaje;
        }
        return true;
    }
}

