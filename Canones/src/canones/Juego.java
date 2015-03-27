/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canones;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author TOSHIBA
 */
public class Juego {

    private int distancia;
    private double gravity;
    private int rango;
    private int jugadores;
    private int largo;
    private int calibre;
    private int seleccion;
    private Jugador player1;
    private Jugador player2;

    public void iniciarJuego() throws IOException {
        setJugadores(playerMode());
        elegirJugador();
        asignarTurnos();

    }

    public int playerMode() {

        return (JOptionPane.showOptionDialog(null, "Elija a su jugador", "Elija a su jugador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Un sólo jugador", "Dos jugadores", "Salir"}, "opcion 1") + 1);

    }

    public void elegirJugador() throws IOException {
        setSeleccion(seleccion());

        if (getSeleccion() == 1) {
            player1 = leerJugador();
            if (getJugadores() == 2) {
                setSeleccion(seleccion());
                if (getSeleccion() == 0) {
                    player2 = crearJugador();
                }
                if (getSeleccion() == 1) {
                    player2 = leerJugador();
                }
            }
        } else {
            if (getSeleccion() == 0) {
                player1 = crearJugador();
                if (getJugadores() == 2) {
                    setSeleccion(seleccion());
                    if (getSeleccion() == 0) {
                        player2 = crearJugador();
                    }
                    if (getSeleccion() == 1) {
                        player2 = leerJugador();
                    }
                }
            }
        }
    }

    public Jugador crearJugador() {
        String nombrejugador = "";
        String apodojugador = "";
        String canonjugador = "";

        while (nombrejugador.length() == 0) {
            nombrejugador = JOptionPane.showInputDialog("Introduce el nombre del jugador ");
        }
        while (apodojugador.length() == 0) {
            apodojugador = JOptionPane.showInputDialog("Introduce el apodo del jugador ");
        }
        while (canonjugador.length() == 0) {
            canonjugador = JOptionPane.showInputDialog("Introduce el nombre del cañón ");
        }
        System.out.println("Se creó al jugador " + nombrejugador + " (" + apodojugador + ") y su cañón " + canonjugador);
        return new Jugador(nombrejugador, apodojugador, new Canon(getLargo(), getCalibre(), canonjugador));
    }

    public Jugador leerJugador() throws IOException {
        String nombrejugador = "";
        String apodojugador = "";
        String canonjugador = "";

        String nombrearchivo = JOptionPane.showInputDialog("Introduce el apodo del jugador");
        File file = new File("C:/Users/TOSHIBA/Documents/Proyectos Java/Jugadores/" + nombrearchivo + ".txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        LineNumberReader lnr = new LineNumberReader(buffer);
        int linenumber = 0;
        int i;
        String line;
        while ((line = buffer.readLine()) != null) {

            lnr.setLineNumber(linenumber);

            if (lnr.getLineNumber() == 0) {
                nombrejugador = line;
            }
            if (lnr.getLineNumber() == 1) {
                apodojugador = line;
            }
            if (lnr.getLineNumber() == 2) {
                canonjugador = line;
            }

            // Process line of input Here
            linenumber++;

        }
        System.out.println("Se creó al jugador " + nombrejugador + " (" + apodojugador + ") y su cañón " + canonjugador);
        return new Jugador(nombrejugador, apodojugador, new Canon(getLargo(), getCalibre(), canonjugador));

    }

    public int seleccion() {
        return JOptionPane.showOptionDialog(null, "Elija a su jugador", "Elija a su jugador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Crear Jugador", "Utilizar jugador creado", "Salir"}, "opcion 1");
    }

    public void asignarTurnos() {

        player1.setTurno(Math.random() > .5 ? 1 : 2);

        if (getJugadores() == 2) {
            if (player1.getTurno() == 1) {
                player2.setTurno(2);
                System.out.println(player1.getNickname() + " va primero.");
                System.out.println(player2.getNickname() + " va segundo.");
            } else {
                if (player1.getTurno() == 2) {
                    player2.setTurno(1);
                    System.out.println(player2.getNickname() + " va primero");
                    System.out.println(player1.getNickname() + " va segundo.");
                }
            }
        }

    }

    public Juego(int distancia, double gravity, int rango, int jugadores) {
        this.distancia = distancia;
        this.gravity = gravity;
        this.rango = rango;
        this.jugadores = jugadores;
        this.largo = (int) (Math.random() * 100) + 30;
        this.calibre = (int) (Math.random() * 100) + 30;

    }

    public Jugador getPlayer1() {
        return player1;
    }

    public void setPlayer1(Jugador player1) {
        this.player1 = player1;
    }

    public Jugador getPlayer2() {
        return player2;
    }

    public void setPlayer2(Jugador player2) {
        this.player2 = player2;
    }

    public int getLargo() {
        return largo;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getDistancia() {
        return distancia;
    }

    public double getGravity() {
        return gravity;
    }

    public int getRango() {
        return rango;
    }

    public int getJugadores() {
        return jugadores;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

}
