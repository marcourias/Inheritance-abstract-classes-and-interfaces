package actividad;

public class ejecutivo extends EmpleadoAbstract {

    Double sueldoBase;
    Double sueldoDia = 400.00;
    int dias;
    Double porcentajeBono = 0.04;
    Double ventas;
    Double comision;
    Double porcentajeProd = 0.02;
    Double productividad;
    

    public ejecutivo(int noEmpleado, String nombreEmpleado, String puesto, Double sueldoBase, 
    Double sueldoDia, int dias, Double porcentajeBono, Double ventas, Double comision, Double porcentajeProd, Double productividad) {
        super(noEmpleado, nombreEmpleado, puesto);
        this.sueldoBase = sueldoBase;
        this.sueldoDia = sueldoDia;
        this.dias = dias;
        this.porcentajeBono = porcentajeBono;
        this.ventas = ventas;
        this.comision = comision;
        this.porcentajeProd = porcentajeProd;
        this.productividad = productividad;
    }


    @Override
    public void calculaSueldoBase() {
        sueldoBase = sueldoDia * dias;
    }



    @Override
    public void calculaComision() {
        comision = ventas * porcentajeBono;
    }

    public void setnoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public int getnoEmpleado() {
        return noEmpleado;
    }


    public void setnombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getnombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPuesto (String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }





    //SET comisión
    public void getcalculaComision() {
        this.comision = comision;
    }

    //GET comisión
    public Double getComision() {
        return ventas * porcentajeBono;
    }
    



    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setVentas(Double ventas) {
        this.ventas = ventas;
    }

    public Double getVentas() {
        return ventas;
    }

    // Establece el sueldo
    public void setsueldoBase(double sueldoBase) {
        sueldoBase = sueldoDia * dias;
        this.sueldoBase = sueldoBase;
    }

    // Devuelve el sueldo
    public double getsueldoBase() {
        return sueldoDia * dias;
    }

    public void setporcentajeProd(Double porcentajeProd) {
        this.porcentajeProd = porcentajeProd;
    }

    public Double getporcentajeProd() {
        return porcentajeProd;
    }

    public void setProductividad(Double productividad) {
        this.productividad = productividad;
    }

    public Double getProductividad() {
        return porcentajeProd * ventas;
    }


}
