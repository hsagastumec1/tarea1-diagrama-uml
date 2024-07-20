public class Duende extends Personaje implements Villano {
    private String type;

    public Duende(String nombre, String descripcion, long tamaño, int poder, int vida, String type) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.type = type;
    }

    @Override
    public void desplazarse() {
        System.out.println("El duende se mueve ágilmente entre la maleza.");
    }

    @Override
    public void mostrarPoder() {
        System.out.println("El poder del duende es: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El duende lanza una ráfaga de magia oscura.");
    }

    @Override
    public void destruir() {
        System.out.println("El duende convoca una tormenta de caos y destrucción.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
