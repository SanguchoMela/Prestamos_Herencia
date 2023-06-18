import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner st = new Scanner(System.in);
    static Scanner sd = new Scanner(System.in);
    static Scanner si = new Scanner(System.in);
    static PrestamoMejoraCasa departamento = new PrestamoMejoraCasa();
    static PrestamoMejoraCasa casa_grande = new PrestamoMejoraCasa();
    static ArrayList<PrestamoMejoraCasa> array_mejoras = new ArrayList<>();

    //variables staticas
    static int fi,ff,tz,phi,opcion=0;
    static double m;
    static String tpi;
    static PrestamoHipotecario[] ph; //array de tipo PrestamoHipotecario

    public static void main(String[] args) {
        while (opcion != 5) {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    ArrayList <PrestamoAutomovil> autos = new ArrayList<PrestamoAutomovil>();

                    System.out.println("\n------ Prestamo Automovil ------");

                    System.out.println("-> Registro de datos para 5 prestamos para automovil");
                    for (int i = 0; i <= 1; i++){
                        System.out.println("\tPrestamo para automovil N°"+(i+1));
                        System.out.print("Anio inicial: ");
                        int anioI = entrada.nextInt();
                        System.out.print("Anio final: ");
                        int anioF = entrada.nextInt();
                        System.out.print("Monto: ");
                        double monto = entrada.nextDouble();
                        System.out.print("Tasa de interes: ");
                        int tasaInt = entrada.nextInt();
                        System.out.print("Plazo: ");
                        int plazo = entrada.nextInt();
                        entrada.nextLine(); //limpiar el buffer de la entrada
                        System.out.print("Marca: ");
                        String marca = entrada.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = entrada.nextLine();
                        System.out.println();

                        PrestamoAutomovil auto = new PrestamoAutomovil(anioI,anioF,monto,tasaInt,plazo,marca,modelo);
                        autos.add(auto);
                    }

                    System.out.print("-> Muestra la informacion registrada de 5 prestamos para automovil");
                    for(PrestamoAutomovil auto:autos){
                            System.out.println("\n\tResumen del Prestamo para Automovil N°" + (autos.indexOf(auto)+1));
                            auto.mostraInfo();
                            System.out.println();
                    }
                    break;
                case 2:
                    String nombre_mejora;
                    int anio_ini = 0,anio_fin,tasa_intr,monto;
                    array_mejoras.add(casa_grande);
                    array_mejoras.add(departamento);
                    System.out.println("Ingrese la fecha:");
                    anio_ini = scanner.nextInt();
                    for (PrestamoMejoraCasa array_mejora : array_mejoras){
                        departamento.setFecha_inicio(anio_ini);
                        System.out.println("año de incio:" + departamento.getFecha_inicio());
                        System.out.println(casa_grande.getTipo_mejora());
                        System.out.println(casa_grande.getFecha_inicio());
                    }
                    break;
                case 3:
                    System.out.print("Prestamo Hipotecario");
                    ph = new PrestamoHipotecario[5]; //Array definido en en un indice de 5 variable sde tipo PrestamoHipotecario
                    for (int i = 0; i < ph.length; i++) {
                        System.out.print("\nIngrese la fecha de inicio: ");
                        fi = si.nextInt(); //Ingreso de dato por teclado de tipo entero
                        System.out.print("Ïngresa la fecha de fin: ");
                        ff = si.nextInt();//Ingreso de dato por teclado de tipo entero
                        System.out.print("Ingrese el monto: ");
                        m = sd.nextDouble();//Ingreso de dato por teclado de tipo double
                        System.out.print("Ingrese la tasa de interes: ");
                        tz = si.nextInt();//Ingreso de dato por teclado de tipo entero
                        System.out.print("Ingrese el plazo: ");
                        phi = si.nextInt();//Ingreso de dato por teclado de tipo entero
                        System.out.print("Ingrese la tipo de propiedad: ");
                        tpi = st.nextLine();//Ingreso de dato por teclado de tipo string
                        ph[i]= new PrestamoHipotecario(fi,ff,m,tz,phi,tpi);//ingreso de dato en el array ph que es de tipo instancia de PrestamoHipotecario
                    }
                    for (int i = 0; i < ph.length; i++) {//impresion de array ph
                        System.out.println(ph[i]);}
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
            }
        }
    }

    public static int mostrarMenuPrincipal() {
        System.out.println("\n\tP R E S T A M O S");
        System.out.println("1. Prestamos automovil");
        System.out.println("2. Prestamos vivienda");
        System.out.println("3.-Prestamos Hipotecarios");
        System.out.println("4. Salir");
        System.out.print("\n~ Ingrese una opción: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 4) {
            System.out.println("=================================================================================");
            System.out.println("\n[~ Ingrese una opción válida ~]");
            System.out.println("\n=================================================================================");
            System.out.print("\nDígite la opción: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }
}