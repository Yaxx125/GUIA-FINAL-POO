public class App {
    public static void main(String[] args) throws Exception {
        empleado[] empleados = new empleado[4];

        empleados[0]= new empleadotiempocompleto("Juan Perez", "123", 48000.0);
        empleados[1]= new empleadomediotiempo("Mária López", "456", 15.0, 20);
        empleados[2]= new empleadomediotiempo("Alejandra Gutiérrez", "789", 16.0, 30);
        empleados[3]= new empleadomediotiempo("Carlos Rodríguez ", "142", 13.0, 15);

        for (empleado empleados : empleados){
            System.out.println("Empleado: "+empleado.getNombre() + ", Salario mensual: $" +empleado.CalcularSalario());
        }


        for(i = 0; empleados.length; i++){
            System.out.println("empleado: "+empleado.getNombre() + ", Salario mensual: $" +empleado.CalcularSalario());
        }
    }
}

