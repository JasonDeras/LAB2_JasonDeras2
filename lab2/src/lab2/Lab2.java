package lab2;

import java.util.*;

public class Lab2 {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario = "";
        String contra = "";
        System.out.println("Menu\n");
        System.out.println("1. Registro de Empleados");
        System.out.println("2. Despedir Empleados");
        System.out.println("3. Log In");
        System.out.println("4. Ascender Cajero");
        System.out.println("5. Listar Empleados");
        System.out.println("6. Modificar Empleado");
        System.out.println("7. Random\n");
        System.out.print("Ingrese una opcion: ");
        int op = l.nextInt();
        System.out.println("");
        while (op != 3) {
            System.out.println("No puede ingresar sin antes login\n");
            System.out.print("Ingrese su usuario: ");
            usuario = l.next();
            System.out.print("Ingrese su contraseña: ");
            contra = l.next();
            System.out.println("");
            if (usuario.equals("leobanegas") && contra.equals("99")) {
                System.out.println("1. Registro de Empleados");
                System.out.println("2. Despedir Empleados");
                System.out.println("3. Ascender Cajero");
                System.out.println("4. Listar Empleados");
                System.out.println("5. Modificar Empleado");
                System.out.println("6. Random");
                System.out.println("7. Salir del sistema\n");
                System.out.print("Ingrese una opcion: ");
                int op2 = l.nextInt();
                System.out.println("");
                switch (op2) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Opcion no valida\n");
                }//Fin del case de antes de hacer login
            } else {
                System.out.println("Contraseña o usuario incorrecto\n");
            }
        }//Fin del while que valida la opcion
        while (op == 3) {
            System.out.print("Ingrese su usuario: ");
            usuario = l.next();
            System.out.print("Ingrese su contraseña: ");
            contra = l.next();
            if (usuario.equals("leobanegas") && contra.equals("99")) {
                System.out.println("1. Registro de Empleados");
                System.out.println("2. Despedir Empleados");
                System.out.println("3. Ascender Cajero");
                System.out.println("4. Listar Empleados");
                System.out.println("5. Modificar Empleado");
                System.out.println("6. Random");
                System.out.println("7. Salir del sistema\n");
                System.out.print("Ingrese una opcion: ");
                int op2 = l.nextInt();
                System.out.println("");
                switch (op2) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Opcion no valida\n");
                }//Fin del case de si escoge el login como primera opcion
            } else {
                System.out.println("Usuario o contraseña incorrecta");
            }
        }//While si la opcion es 3
    }//Fin del main
}
