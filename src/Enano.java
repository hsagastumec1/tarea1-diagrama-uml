public class Enano extends Personaje implements Heroe {
    private String type;

    public Enano(String nombre, String descripcion, long tamaño, int poder, int vida, String type) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.type = type;
    }

    @Override
    public void desplazarse() {
        System.out.println("El enano avanza con determinación por las montañas.");
    }

    @Override
    public void mostrarPoder() {
        System.out.println("El poder del enano es: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El enano embiste con su hacha.");
    }

    @Override
    public void defender() {
        System.out.println("El enano bloquea el ataque con su escudo.");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("El enano recibe un golpe y se tambalea.");
        vida -= 15;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
