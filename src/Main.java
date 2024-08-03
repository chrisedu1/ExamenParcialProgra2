import gt.edu.miumg.pasteleria.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Mario Garza", "Gerente", 2500);
        System.out.println("empleado = " + empleado);
        Empleado empleado2 = new Empleado("Juan Perez", "Cajero", 1500);
        System.out.println("empleado2 = " + empleado2);

        Equipo equipo = new Equipo("Cocina","Apagado");
        System.out.println("equipo = " + equipo);

        Ingredientes masa = new Masa("Esponjosa", 5 );
        System.out.println("ingrediente1 = " + masa);
        Ingredientes relleno = new Relleno("Chocolate",8);
        System.out.println("ingrediente2 = " + relleno);
        Ingredientes cobertura = new Cobertura("Ganage de Chocolate", 5);
        System.out.println("ingrediente3 = " + relleno);

        Postre crepa = new Postre("CrepaMixta",10,5.00);
        System.out.println("colombiano = " + crepa);
        Postre pastel = new Postre("Torta",10, 5.00 );
        System.out.println("espresso = " + pastel);
        Postre cheesecake = new Postre("Cheesecake de fresa", 10, 5.00);
        System.out.println("espresso = " + cheesecake);
        Postre  brownie= new Brownie("Brownie Chocolate",10, 5.00 );
        System.out.println("espresso = " + brownie);

        Sucursal sucursalColombia = new Sucursal("Sucursal Bogota","Zona 10");
        System.out.println("sucursalColombia = " + sucursalColombia);
        sucursalColombia.agregarEmpleado(empleado);
        sucursalColombia.agregarEquipo(equipo);
        sucursalColombia.agregarEspecialidad(colombiano);
        System.out.println("sucursalColombia = " + sucursalColombia);

        Sucursal sucursalItalia = new Sucursal("Sucursal Italia","Zona 15");
        System.out.println("sucursalItalia = " + sucursalItalia);
        sucursalItalia.agregarEmpleado(empleado);
        sucursalItalia.agregarEmpleado(empleado2);
        sucursalItalia.agregarEquipo(equipo);
        sucursalItalia.agregarEspecialidad(espresso);
        System.out.println("sucursalItalia = " + sucursalItalia);

    }
}