package actividad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n".repeat(2));
        System.out.println("*".repeat(10)+" Bienvenido al sistema de cálculo de nómina "+"*".repeat(10));
        System.out.println("\n".repeat(3));

        System.out.println("Ingrese el tipo de empleado: \n\n"+"1. Cajero\n2. Ejecutivo\n3. Gerente\n9. Salir");
        
        //Validación de datos utilizando while, try, catch.
        int num;
        Scanner s = new Scanner(System.in);

        while (true) {
            try {
                num = s.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Dato inválido. Por favor ingrese un número entero.");
                s.nextLine();
            }
        }

        while (num<1 || num>10) {
            System.out.println("Dato inválido. Por favor, seleccione alguna de las opciones.");
            num = s.nextInt();
        }
        System.out.println("Ingresó el número: " + num);
        
        //Limpiar pantalla
        System.out.print("\033\033\n\n");
        System.out.flush();



        switch (num) {
            case 1:

                //Cálculo de nómina para cajeros.
                cajero c = new cajero(14, "Carlos Pérez","Cajero A",0.00,200.00,0,0.02,0.00, 0.00, 0.01,0.00);
                System.out.println("-".repeat(25)+"\nCálculo de nómina para cajeros.\nEl sueldo diario para este tipo de trabajadores es de "+c.sueldoDia+"\n\n");
                System.out.println("-".repeat(25)+"\nPara calcular el sueldo base, ingrese el número de días laborados: ");

                //Validación de datos para los días laborados
                int num1;
                Scanner t = new Scanner(System.in);
                while (true) {
                    try {
                        num1 = t.nextInt();
                        break;
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Dato inválido. Por favor ingrese un número entero.");
                        t.nextLine();
                    }
                }
                while (num1 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número entero positivo.");
                    num1 = t.nextInt();
                }

                //Asignamos el número ingresado a Días con SET.
                c.setDias(num1);
                System.out.println("Ingresó "+ c.getDias()+" días laborados.");


                //Cálculo del salario base multiplicando salario diario por días
                Double e = c.getsueldoBase();
                System.out.printf("El sueldo base es: " + e);



                System.out.println("\n".repeat(2)+"-".repeat(25)+"\nPara calcular la comisión por ventas se calcula el 2% del total de ventas.\nIngrese el monto total de ventas mensual: ");
                
                //Validación del monto de las ventas
                Double num2;
                Scanner u = new Scanner(System.in);
                while (true) {
                    try {
                        num2 = u.nextDouble();
                        break;
                    }
                    catch (InputMismatchException j) {
                        System.out.println("Dato inválido. Por favor ingrese un número con dos decimales.");
                        u.nextLine();
                    }
                }
                while (num2 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número con dos decimales positivo.");
                    num2 = u.nextDouble();
                }

                //Asignamos el número ingresado a Días con SET.
                c.setVentas(num2);
                System.out.println("Ingresó la cantidad de: "+ c.getVentas()+" como total de ventas mensual.\n");
                
                //Cálculo de la comisión de cajeros
                //Double f= c.getComision();
                System.out.printf("La comisión que le corresponde por ventas es de "+ c.getComision()+" pesos.\n\n");

                
                //Cálculo del bono de productividad
                System.out.println("-".repeat(25)+"\nSe toma en consideración el bono de productividad en caso de superar los $150,000.00 en ventas.");
                System.out.println("De acuerdo a la información proporcionada, se tuvieron "+ c.getVentas()+" en ventas. Por lo tanto: ");

                Double vta = c.getVentas();
                Double prod = 0.00;

                if (vta > 150000) {
                    System.out.println("\nSÍ se tiene derecho a bono de productividad.");
                    System.out.println("El bono de productividad es de: "+c.getProductividad());
                    prod = vta * c.getporcentajeProd();
                }
                else {
                    System.out.println("\nNO se tiene derecho a bono de productividad.");
                    prod = 0.00;
                }

                System.out.println("Presione \"ENTER\" para continuar...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();


                System.out.print("\033\033\n\n");
                System.out.flush();

                System.out.println("RRESUMEN DEL EMPLEADO DE CATEGORÍA CAJERO. \n");
                System.out.println("Número de empleado: "+c.getnoEmpleado());
                System.out.println("Nombre de empleado: "+c.getnombreEmpleado());
                System.out.println("Puesto: "+c.getPuesto());
                System.out.println("Sueldo base: "+c.getsueldoBase());
                System.out.println("Comisiones a pagar: "+c.getComision());
                System.out.println("Bono de productividad: "+ prod);


                System.out.println("\n\n\nPresione \"ENTER\" para continuar...");
                Scanner at = new Scanner(System.in);
                at.nextLine();


                break;
            
            case 2:
                //Cálculo de nómina para Ejecutivos.

                ejecutivo h = new ejecutivo(15789, "Amanda Gómez","Ejecutiva C",
                0.00,400.00,0,0.04,0.00, 0.00,0.02,0.00);
                System.out.println("-".repeat(25)+"\nCálculo de nómina para ejecutivos.\nEl sueldo diario para este tipo de trabajadores es de "+h.sueldoDia+"\n\n");
                System.out.println("-".repeat(25)+"\nPara calcular el sueldo base, ingrese el número de días laborados: ");

                //Validación de datos para los días laborados
                int num3;
                Scanner v = new Scanner(System.in);
                while (true) {
                    try {
                        num3 = v.nextInt();
                        break;
                    }
                    catch (InputMismatchException ei) {
                        System.out.println("Dato inválido. Por favor ingrese un número entero.");
                        v.nextLine();
                    }
                }
                while (num3 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número entero positivo.");
                    num3 = v.nextInt();
                }

                //Asignamos el número ingresado a Días con SET.
                h.setDias(num3);
                System.out.println("Ingresó "+ h.getDias()+" días laborados.");


                //Cálculo del salario base multiplicando salario diario por días
                Double w = h.getsueldoBase();
                System.out.printf("El sueldo base es: " + w);



                System.out.println("\n".repeat(2)+"-".repeat(25)+"\nPara calcular la comisión por ventas se calcula el 4% del total de ventas.\nIngrese el monto total de ventas mensual: ");
                
                //Validación del monto de las ventas
                Double num4;
                Scanner x = new Scanner(System.in);
                while (true) {
                    try {
                        num4 = x.nextDouble();
                        break;
                    }
                    catch (InputMismatchException j) {
                        System.out.println("Dato inválido. Por favor ingrese un número con dos decimales.");
                        x.nextLine();
                    }
                }
                while (num4 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número con dos decimales positivo.");
                    num4 = x.nextDouble();
                }

                //Asignamos el número ingresado a Días con SET.
                h.setVentas(num4);
                System.out.println("Ingresó la cantidad de: "+ h.getVentas()+" como total de ventas mensual.\n");
                
                //Cálculo de la comisión de ejecutivo
                System.out.printf("La comisión que le corresponde por ventas es de "+ h.getComision()+" pesos.\n\n");


                //Cálculo del bono de productividad
                System.out.println("-".repeat(25)+"\nSe toma en consideración el bono de productividad en caso de superar los $150,000.00 en ventas.");
                System.out.println("De acuerdo a la información proporcionada, se tuvieron "+ h.getVentas()+" en ventas. Por lo tanto: ");

                Double vta1 = h.getVentas();
                Double prod1 = 0.00;

                if (vta1 > 150000) {
                    System.out.println("\nSÍ se tiene derecho a bono de productividad.");
                    System.out.println("El bono de productividad es de: "+h.getProductividad());
                    prod1 = vta1 * h.getporcentajeProd();
                }
                else {
                    System.out.println("\nNO se tiene derecho a bono de productividad.");
                    prod1 = 0.00;
                }

                System.out.println("Presione \"ENTER\" para continuar...");
                Scanner sca1 = new Scanner(System.in);
                sca1.nextLine();


                System.out.print("\033\033\n\n");
                System.out.flush();

                System.out.println("RRESUMEN DEL EMPLEADO DE CATEGORÍA EJECUTIVO. \n");
                System.out.println("Número de empleado: "+h.getnoEmpleado());
                System.out.println("Nombre de empleado: "+h.getnombreEmpleado());
                System.out.println("Puesto: "+h.getPuesto());
                System.out.println("Sueldo base: "+h.getsueldoBase());
                System.out.println("Comisiones a pagar: "+h.getComision());
                System.out.println("Bono de productividad: "+ prod1);


                System.out.println("\n\n\nPresione \"ENTER\" para continuar...");
                Scanner ab = new Scanner(System.in);
                ab.nextLine();
        
            case 3:

                gerente m = new gerente(8547,"Marcela Campos", "Gerente de compras",
                0.0, 600.00,0,0.0,0.04,0.0);
                System.out.println("-".repeat(25)+"\nCálculo de nómina para gerentes.\nEl sueldo diario para este tipo de trabajadores es de "+m.getsueldoDia()+"\n\n");
                System.out.println("-".repeat(25)+"\nPara calcular el sueldo base, ingrese el número de días laborados: ");

                //******Validación de datos para los días laborados
                int num5;
                Scanner n = new Scanner(System.in);
                while (true) {
                    try {
                        num5 = n.nextInt();
                        break;
                    }
                    catch (InputMismatchException es) {
                        System.out.println("Dato inválido. Por favor ingrese un número entero.");
                        n.nextLine();
                    }
                }
                while (num5 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número entero positivo.");
                    num5 = n.nextInt();
                }

                //Asignamos el número ingresado a Días con SET.
                m.setDias(num5);
                System.out.println("Ingresó "+ m.getDias()+" días laborados.");


                //Cálculo del salario base multiplicando salario diario por días
                //Double o = m.getsueldoBase();
                System.out.printf("El sueldo base es: " + m.calculaSueldoBase()+"\n");


                //Cálculo del bono de productividad
                System.out.println("-".repeat(25)+"\nSe toma en consideración el bono de productividad en caso de superar los $150,000.00 en ventas.");
                System.out.println("Ingrese la cantidad de ventas: ");

                //Validación del monto de las ventas
                Double num6;
                Scanner x1 = new Scanner(System.in);
                while (true) {
                    try {
                        num6 = x1.nextDouble();
                        break;
                    }
                    catch (InputMismatchException j1) {
                        System.out.println("Dato inválido. Por favor ingrese un número con dos decimales.");
                        x1.nextLine();
                    }
                }
                while (num6 < 1) {
                    System.out.println("Dato inválido. Por favor, ingrese un número con dos decimales positivo.");
                    num6 = x1.nextDouble();
                }

                //Asignamos el número ingresado a Días con SET.
                m.setVentas(num6);
                System.out.println("Ingresó la cantidad de: "+ m.getVentas()+" como total de ventas mensual.\n");

                Double vta2 = m.getVentas();
                Double prod2 = 0.00;

                if (vta2 > 150000) {
                    System.out.println("\nSÍ se tiene derecho a bono de productividad.");
                    System.out.println("El bono de productividad es de: "+m.calculaBono());
                    //prod2 = vta2 * m.getporcentajeProd();
                }
                else {
                    System.out.println("\nNO se tiene derecho a bono de productividad.");
                    prod2 = 0.00;
                    m.setProductividad(0.00);
                }

                System.out.println("Presione \"ENTER\" para continuar...");
                Scanner sca2 = new Scanner(System.in);
                sca2.nextLine();


                System.out.print("\033\033\n\n");
                System.out.flush();

                System.out.println("RRESUMEN DEL EMPLEADO DE CATEGORÍA GERENTE. \n");
                System.out.println("Número de empleado: "+m.getnoEmpleado());
                System.out.println("Nombre de empleado: "+m.getnombreEmpleado());
                System.out.println("Puesto: "+m.getPuesto());
                System.out.println("Sueldo base: "+m.calculaSueldoBase());
                System.out.println("Bono de productividad: "+ m.getproductividad());


                System.out.println("\n\n\nPresione \"ENTER\" para continuar...");
                Scanner sca3 = new Scanner(System.in);
                sca3.nextLine();

            
            case 9:
                break;
        }


        s.close();
    }
}