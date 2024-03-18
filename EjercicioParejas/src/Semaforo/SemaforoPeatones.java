package Semaforo;

public class SemaforoPeatones {
    private String estadoPeatones;

    public SemaforoPeatones() {
        this.estadoPeatones = "verde"; // El semáforo de peatones comienza en estado verde por defecto
    }


    public void cambiarEstadoPeatones() {
        switch (this.estadoPeatones) {
            case "rojo":
                this.estadoPeatones = "verde";
                break;
            case "verde":
                this.estadoPeatones = "rojo";
                break;
            default:
                System.out.println("Estado inválido.");
                break;
        }
    }

    public void mostrarEstado() {
        System.out.println("Semaforo peatones: " + this.estadoPeatones);
    }

    public static void main(String[] args) {
        SemaforoPeatones semaforo = new SemaforoPeatones();

        // Mostrar el estado inicial del semáforo
        semaforo.mostrarEstado();


        // Cambiar el estado del semáforo de peatones y mostrarlo
        semaforo.cambiarEstadoPeatones();
        semaforo.mostrarEstado();


        // Cambiar el estado del semáforo de peatones y mostrarlo
        semaforo.cambiarEstadoPeatones();
        semaforo.mostrarEstado();
    }
}
