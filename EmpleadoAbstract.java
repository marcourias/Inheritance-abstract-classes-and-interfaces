package actividad;

public abstract class EmpleadoAbstract{
    int noEmpleado;
    String nombreEmpleado;
    String puesto;

    //Constructor
    public EmpleadoAbstract(int noEmpleado, String nombreEmpleado, String puesto) {
        this.noEmpleado = noEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.puesto = puesto;
    }

    public abstract void calculaSueldoBase();

    public abstract void calculaComision();
    
}
