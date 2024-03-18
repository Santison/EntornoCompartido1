package Semaforo;

public class Semaforo1 {
    private String estado;

    public Semaforo1() {
        this.estado = "rojo"; // El semáforo comienza en estado rojo por defecto
    }

    public void cambiarEstado() {
        switch (this.estado) {
            case "rojo":
                this.estado = "verde";
                break;
            case "verde":
                this.estado = "amarillo";
                break;
            case "amarillo":
                this.estado = "rojo";
                break;
            default:
                System.out.println("Estado inválido.");
                break;
        }
    }

    public void mostrarEstado() {
        System.out.println("El semáforo está en estado " + this.estado);
    }

    public static void main(String[] args) {
        Semaforo1 semaforo = new Semaforo1();

        // Mostrar el estado inicial del semáforo
        semaforo.mostrarEstado();

        // Cambiar el estado del semáforo y mostrarlo
        semaforo.cambiarEstado();
        semaforo.mostrarEstado();

        // Cambiar el estado del semáforo y mostrarlo
        semaforo.cambiarEstado();
        semaforo.mostrarEstado();

        // Cambiar el estado del semáforo y mostrarlo
        semaforo.cambiarEstado();
        semaforo.mostrarEstado();
    }
}
