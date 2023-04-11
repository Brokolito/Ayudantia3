package data;
import model.Enemigo;
import model.Jugador;

import java.io.*;
import java.util.Scanner;

public class GestorDatos {
    public static boolean jugadorMataEnemigo(Jugador jugador, Enemigo enemigo, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(jugador.getNombre().toString() + "mato a " + enemigo.getNombre() + " el " + enemigo.getType());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }

    }

    public static boolean enemigoMataJugador(Jugador jugador, Enemigo enemigo, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(jugador.getNombre().toString() + "fue asesinado por " + enemigo.getNombre() + " el " + enemigo.getType());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }

    }

    public static boolean jugadorMataJugador(Jugador jugador, Jugador jugadorAsesino, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(jugador.getNombre().toString() + "fue asesinado por " + jugadorAsesino.getNombre());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }

    }

    public static boolean ataqueJugadorEnemigo(Jugador jugador, Enemigo enemigo, int damage, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(jugador.getNombre().toString() + "ataca a " + enemigo.getNombre() + " el " + enemigo.getType() + "con "
                    + damage + " daño");
            bw.write(enemigo.getVida() > 0 ? "Resistio el ataque, su nueva vida es " + enemigo.getVida() : "No resistio el ataque");
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }
    }
    public static boolean ataqueEnemigoJugador(Jugador jugador, Enemigo enemigo, int damage, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(jugador.getNombre().toString() + "ha recibido un golpe de" + enemigo.getNombre() + " el " + enemigo.getType() + "con "
                    + damage + " daño");
            bw.write(jugador.getVida() > 0 ? "Resistio el ataque, su nueva vida es " + enemigo.getVida() : "No resistio el ataque");
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }
    }
        public static boolean ataqueJugadorJugador(Jugador jugador, Jugador jugadorAtacante,int damage, String direccionArchivo){
            boolean lineaVacia = false;
            try {
                File file = new File(direccionArchivo);
                if (!file.exists()) {
                    file.createNewFile();
                    lineaVacia = true;
                }
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                if (lineaVacia == false) {
                    bw.newLine();
                }
                bw.write(jugador.getNombre().toString() + "ha recibido un golpe de" + jugadorAtacante.getNombre() + "con "
                        + damage + " daño");
                bw.write(jugador.getVida() > 0 ? "Resistio el ataque, su nueva vida es " + jugador.getVida() : "No resistio el ataque");
                bw.close();
                fw.close();
                return true;
            } catch (Exception e) {
                System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
                return false;
            }
        }
    }
