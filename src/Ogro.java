public class Ogro extends Personaje implements Villano {
    private String type;

    public Ogro(String nombre, String descripcion, long tamaño, int poder, int vida, String type) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.type = type;
    }

    @Override
    public void desplazarse() {
        System.out.println("El ogro avanza lentamente con su gran tamaño.");
    }

    @Override
    public void mostrarPoder() {
        System.out.println("El poder del ogro es: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El ogro golpea con su maza con fuerza brutal.");
    }

    @Override
    public void destruir() {
        System.out.println("El ogro arrasa todo a su paso con furia descontrolada.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
