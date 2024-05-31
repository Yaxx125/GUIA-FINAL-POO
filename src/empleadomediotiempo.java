public class empleadomediotiempo  extends empleado{
    private double salarioPorHora;
    private int horasTrabajadasPorSemana;

    public empleadomediotiempo(String nombre, String numeroIdentificado, double salarioPorHora, int horasTrabajadasPorSemana) {
        super(nombre, numeroIdentificado);
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double CalcularSalario() {
     return salarioPorHora * horasTrabajadasPorSemana * 4;// Salario mensual
    } 
}
