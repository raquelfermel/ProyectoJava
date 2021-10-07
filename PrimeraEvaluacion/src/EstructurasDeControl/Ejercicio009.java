package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "carlos";
        String contraseña = "12345";

        System.out.println("Escribe tu usuario y contraseña");
        String newUsuario = sc.nextLine();
        String newContrasena = sc.nextLine();

        if ( usuario.equals(newUsuario) && contraseña.equals(newContrasena)){
            System.out.println("has entrado");
        }else {
            System.out.println("has escrito mal el usuario o contraseña");
        }

    }
}
