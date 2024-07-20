public class Elfo extends Personaje implements Heroe {
    private String type;

    public Elfo(String nombre, String descripcion, long tamaño, int poder, int vida, String type) {
        super(nombre, descripcion, tamaño, poder, vida);
        this.type = type;
    }

    @Override
    public void desplazarse() {
        System.out.println("El elfo se mueve con agilidad por el bosque.");
    }

    @Override
    public void mostrarPoder() {
        System.out.println("El poder del elfo es: " + poder);
    }

    @Override
    public void atacar() {
        System.out.println("El elfo dispara flechas con precisión.");
    }

    @Override
    public void defender() {
        System.out.println("El elfo esquiva los ataques con destreza.");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("El elfo recibe un golpe y pierde vida.");
        vida -= 10;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}