//Actividades para los estudiantes
//Modificar el juego agregando:
//1. Un nuevo personaje Arquero.
//2. Un método curarse() que recupere vida.
//3. Un ataque especial que cause más daño.
//4. Que el daño sea aleatorio en cada ataque.
//5. Mostrar estadísticas finales de la batalla (vida restante de cada personaje).
//6. Agregar un tercer personaje y permitir elegir quién pelea.

package Encapsulamiento;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06_MiniVideojuego {
}
 
// --- CLASE PERSONAJE ---
class Personaje {
    private String nombre;
    private int vida;
    private int vidaMaxima; 
    private int ataque;
    private Random random;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida; 
        this.ataque = ataque;
        this.random = new Random();
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
    }

    // El daño es aleatorio entre el 50% y el 100% del ataque base
    public int atacar() {
        return random.nextInt(ataque / 2 + 1) + (ataque / 2);
    }

    public int ataqueEspecial() {
        return ataque * 2; // El ataque especial hace el doble de daño
    }

    public void curarse() {
        int curacion = 15 + random.nextInt(10); // Curación aleatoria entre 15 y 25
        vida += curacion;
        if (vida > vidaMaxima) vida = vidaMaxima;
        System.out.println(nombre + " uso curacion y recupero " + curacion + " de vida.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

// --- CLASE JUEGO ---
class Juego {
    public void iniciarBatalla(Personaje p1, Personaje p2) {
        System.out.println("--- INICIO DE LA BATALLA  ---");
        System.out.println(p1.getNombre() + " vs " + p2.getNombre());
        
        Random rand = new Random();

        while (p1.estaVivo() && p2.estaVivo()) {
            // Turno Personaje 1
            ejecutarAccion(p1, p2, rand);
            if (!p2.estaVivo()) break;

            // Turno Personaje 2
            ejecutarAccion(p2, p1, rand);

            // Mostrar estado
            System.out.println("> Estado: " + p1.getNombre() + " [" + p1.getVida() + "] | " 
                               + p2.getNombre() + " [" + p2.getVida() + "]");
            System.out.println("----------------------------------");
        }

        System.out.println("--- ESTADISTICAS FINALES ---");
        System.out.println(p1.getNombre() + ": " + p1.getVida() + " HP");
        System.out.println(p2.getNombre() + ": " + p2.getVida() + " HP");
        
        String ganador = p1.estaVivo() ? p1.getNombre() : p2.getNombre();
        System.out.println("EL GANADOR ES: " + ganador);
    }

    private void ejecutarAccion(Personaje atacante, Personaje defensor, Random rand) {
        int suerte = rand.nextInt(10); // 0 a 9

        if (suerte < 6) { // 60% Ataque normal
            int danio = atacante.atacar();
            defensor.recibirDanio(danio);
            System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " por " + danio);
        } else if (suerte < 8) { // 20% Ataque especial
            int danioEsp = atacante.ataqueEspecial();
            defensor.recibirDanio(danioEsp);
            System.out.println("¡CRITICO! " + atacante.getNombre() + " usa ataque especial: " + danioEsp + " de daño");
        } else { // 20% Curación
            atacante.curarse();
        }
    }

// --- CLASE MAIN (Debe llamarse Main.java) ---

    public  void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("=== SELECCION DE PERSONAJES ===");
        System.out.println("1. Guerrero Petrosky (HP:100, ATK:20)");
        System.out.println("2. Mago Electrico    (HP:70,  ATK:30)");
        System.out.println("3. Arquero Magico (HP:85,  ATK:25)");

        Personaje p1 = elegirPersonaje(sn, "primer");
        Personaje p2 = elegirPersonaje(sn, "segundo");

        Juego partida = new Juego();
        partida.iniciarBatalla(p1, p2);
        
    }

    private static Personaje elegirPersonaje(Scanner sn, String turno) {
        System.out.print("Selecciona el " + turno + " luchador (1-3): ");
        int opcion = sn.nextInt();
        switch(opcion) {
            case 1: return new Personaje("Guerrero Petrosky", 100, 20);
            case 2: return new Personaje("Mago Electrico", 70, 30);
            case 3: return new Personaje("Arquero Magico", 85, 25);
            default: 
                System.out.println("Opcion invalida, invocando a un Aldeano generico.");
                return new Personaje("Aldeano", 50, 10);
        }
    
}
}



