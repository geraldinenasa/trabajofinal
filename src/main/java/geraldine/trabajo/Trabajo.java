package geraldine.trabajo;
import java.util.Scanner;
import java.util.Random;

public class Trabajo
{  
    //Modulo de color aleatorio
    public static char colorAleatorio ()
    {         
        // R=rojo A=azul
        //Iteracion sobre la cadena de caracteres RA
        String alphabet = "RA";
        //ESTE RANDOM SE UTILIZA TANTO PARA LOS COLORES COMO PARA LOS NUMEROS
        Random r = new Random();
        char color = alphabet.charAt(r.nextInt(alphabet.length()));
        return color;
    }
    
    //Modulo de numero aleatorio
    public static int numeroAleatorio()
    {
        Random r = new Random();
        int numero = r.nextInt(100);
        return numero;            
    }

    //Programa principal
    public static void main(String[] args) 
    {
        //DEFINO VARIABLES
        int puntosJugador1, puntosJugador2;
        char primerTirada;
        String nombreJugador1, nombreJugador2;
        Scanner sc = new Scanner(System.in);
        
        //INGRESO NOMBRE DE LOS JUGADORES
        System.out.println("Por favor ingrese el nombre del Primer jugador");
        nombreJugador1 = sc.nextLine();
        System.out.println("Por favor ingrese el nombre del Segundo jugador");
        nombreJugador2 = sc.nextLine();
        
        
        //CADA JUGADOR TENDRA 2 TIRADAS POSIBLES
        System.out.println("El jugador "+nombreJugador1+" sera el primero en tirar");
        System.out.println("El color y valor de la burbujas de "+nombreJugador1+" son");
        primerTirada = colorAleatorio();
        System.out.println(primerTirada);
        
        
        /*
        System.out.println("El jugador "+nombreJugador2+" sera el primero en tirar");
        System.out.println("El color y valor de la burbujas de "+nombreJugador2+" son");
        colorNumero2();
        */
        /*
        if (colorB1 == colorB2)
        {
            puntosJugador1= puntoB1+puntoB2;
            System.out.println("Jugador "+nombreJugador1+" tus puntos totales son "+puntosJugador1);
        }
        else
        {
            System.out.println("Jugador "+nombreJugador1+" has perdido la jugada");
        }
        if (colorB3==colorB4)
        {
            puntosJugador2=puntoB3+puntoB4;
            System.out.println("Jugador "+nombreJugador2+" tus puntos totales son "+puntosJugador2);
        }
        else
        {
            System.out.println("Jugador "+nombreJugador1+" has perdido la jugada");
        }
        
        //comparar los puntos
        
        if (puntosJugador1==puntosJugador2)
        {
            System.out.println(nombreJugador1+" ha empatado con "+nombreJugador2);
        }
        else
        {
            if (puntosJugador1>puntosJugador2)
            {
                System.out.println(nombreJugador1+" ha ganado la partida");
            }
            else
            {
                if (puntosJugador1<puntosJugador2)
                {
                    System.out.println(nombreJugador2+" ha ganado la partida");
                }
                        
            }  
        }
        */
    }  
}