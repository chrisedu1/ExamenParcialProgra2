package gt.edu.miumg.pasteleria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private Postre postre;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    public Sucursal(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado empleado)
    {
        System.out.println("Agreagando empleado");
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingredientes ingrediente)
    {
        System.out.println("Agregando ingredientes");
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo)
    {
        System.out.println("Agregando equipo");
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Postre postre)
    {
        System.out.println("Agregando postre");
        this.postre = postre;
    }

}
