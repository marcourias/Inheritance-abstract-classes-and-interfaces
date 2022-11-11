package actividad;

import actividad.EmpleadoInterface;

public class gerente implements EmpleadoInterface {
    //Variables
    int noEmpleado;
    String nombreEmpleado;
    String puesto;
    Double sueldoBase;
    Double sueldoDia = 600.00;
    int dias;
    Double ventas;
    Double porcentajeProd = 0.04;
    Double productividad;
    
    //Constructor
    public gerente (int noEmpleado, String nombreEmpleado, String puesto, Double sueldoBase, 
    Double sueldoDia, int dias, Double ventas, Double porcentajeProd, Double productividad) {
        this.noEmpleado = noEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.puesto = puesto;
        this.sueldoBase = sueldoBase;
        this.sueldoDia = sueldoDia;
        this.dias = dias;
        this.ventas = ventas;
        this.porcentajeProd = porcentajeProd;
        this.productividad = productividad;
    }

    //SETTERS

    public void setnoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public void setnombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setsueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setsueldoDia(Double sueldoDia) {
        this.sueldoDia = sueldoDia;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setVentas(Double ventas) {
        this.ventas = ventas;
    }

    public void setporcentajeProd(Double porcentajeProd) {
        this.porcentajeProd = porcentajeProd;
    }

    public void setProductividad(Double productividad) {
        this.productividad = productividad;
    }


    //GETTERS

    public int getnoEmpleado() {
        return noEmpleado;
    }

    public String getnombreEmpleado() {
        return nombreEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public Double getsueldoBase() {
        return sueldoBase;
    }

    public Double getsueldoDia() {
        return sueldoDia;
    }

    public int getDias() {
        return dias;
    }

    public Double getVentas() {
        return ventas;
    }

    public Double getporcentajeProd() {
        return porcentajeProd;
    }

    public Double getproductividad() {
        return productividad;
    }



    //Calcula el sueldo base del trabajador
    @Override
    public Double calculaSueldoBase() {
        return getsueldoDia() * getDias();
    }

    //Calcula el bono de productividad
    @Override
    public Double calculaBono() {
        return getporcentajeProd() * getVentas();
    }


    
}