import java.util.ArrayList;
import java.util.List;


interface Tarea {
    String getDescripcion();
    void ejecutar();
}


class TareaSimple implements Tarea {
    private String descripcion;

    public TareaSimple(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando tarea simple: " + descripcion);
    }
}


class TareaCompuesta implements Tarea {
    private String descripcion;
    private List<Tarea> subtareas = new ArrayList<>();

    public TareaCompuesta(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarTarea(Tarea tarea) {
        subtareas.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        subtareas.remove(tarea);
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando tarea compuesta: " + descripcion);
        for (Tarea tarea : subtareas) {
            tarea.ejecutar();
        }
    }
}
