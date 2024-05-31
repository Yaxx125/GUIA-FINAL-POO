abstract class empleado {
    //son un modelo para las clases derivadas 
    private String nombre;
    private String numeroIdentificado;

    public empleado(String nombre, String numeroIdentificado){
        this.nombre = nombre;
        this.numeroIdentificado = numeroIdentificado;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNumeroIdentificado(){
        return numeroIdentificado;
    }

    //Merodo abstracto
    public abstract double CalcularSalario();
}
