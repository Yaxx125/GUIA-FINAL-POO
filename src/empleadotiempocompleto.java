public class empleadotiempocompleto extends empleado {
    private double Salarioanual;

    public empleadotiempocompleto(String nombre, String numeroIdentificado, double Salarioanual){
        super(nombre, numeroIdentificado);
        this.Salarioanual = Salarioanual;
    }

    @Override
    public double CalcularSalario() {
        return Salarioanual / 12; //Salario anual
    }
}
