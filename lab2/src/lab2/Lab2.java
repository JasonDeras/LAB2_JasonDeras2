package lab2;

import java.util.*;

public class Lab2 {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario;
        String genero = "";
        String contra;
        ArrayList gerentes = new ArrayList();
        ArrayList aseadores = new ArrayList();
        ArrayList cajeros = new ArrayList();
        ArrayList seguridad = new ArrayList();
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
                        System.out.print("Ingrese nombre: ");
                        String nombre = l.next();
                        System.out.print("Ingrese apellido: ");
                        String apellido = l.next();
                        System.out.print("Ingrese color favorito: ");
                        String color = l.next();
                        System.out.print("Ingrese edad: ");
                        int edad = l.nextInt();
                        System.out.println("");
                        System.out.println("Menu de generos\n");
                        System.out.println("1. Masculino");
                        System.out.println("2. Femenino\n");
                        System.out.print("Ingrese una opcion de genero: ");
                        int op3 = l.nextInt();
                        while (op3 != 1 && op3 != 2) {
                            System.out.println("Genero no valido");
                            System.out.print("Ingrese una opcion de genero: ");
                            op3 = l.nextInt();
                            if (op3 == 1) {
                                genero = "Masculino";
                            } else if (op == 2) {
                                genero = "Femenino";
                            }//If auxiliar de los generos
                        }//Fin del while de los generos
                        System.out.print("Ingrese Altura: ");
                        double altura = l.nextDouble();
                        System.out.print("Ingrese peso: ");
                        double peso = l.nextDouble();
                        System.out.print("Ingrese titulo: ");
                        String titulo = l.next();
                        System.out.println("");
                        System.out.println("Menu de cargos\n");
                        System.out.println("1. Gerente");
                        System.out.println("2. Aseadores");
                        System.out.println("3. Cajeros");
                        System.out.println("4. Seguridad\n");
                        System.out.print("Ingrese una opcion de cargo: ");
                        int op4 = l.nextInt();
                        switch (op4) {
                            case 1:
                                if (gerentes.size() == 3) {
                                    System.out.println("Ya hay tres Gerentes");
                                } else {
                                    gerentes.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, "Gerente", 50000));
                                }//If auxiliar para los gerentes 
                                break;
                            case 2:
                                aseadores.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, "Aseador", 30000));
                                break;
                            case 3:
                                cajeros.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, "Cajero", 40000));
                                break;
                            case 4:
                                seguridad.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, "Seguridad", 38000));
                                break;
                            default:
                                System.out.println("Opcion de cargo no valida\n");
                        }//Fin del case de los cargos
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
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
