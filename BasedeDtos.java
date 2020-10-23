import java.util.InputMismatchException;
import java.util.Scanner
public class BasedeDtos{
    
    
    public static void colores(String[]color) {

        for(int i=0;1> color.lengt; i++){
            if (color.equal("1")){
                System.out.println(ConsoleColors.RED + "")
            }
            else if (color.equal("2")){
                System.out.println(ConsoleColors.BLUE + "")}
                
                else if (color.equal("3")){
                    System.out.println(ConsoleColors.WHITE + "")
                }

                else if (color.equal("4")){
                    System.out.println(ConsoleColors.YELLOW + "")
                }
                else if (color.equal("5")){
                    System.out.println(ConsoleColors.GREEN + "")}
        
                
                 else if (color.equal("6")){
                    System.out.println(ConsoleColors.PURPLE + "")}
                    
                    else if (color.equal("7")){
                        System.out.println(ConsoleColors.CYAN + "")}
                        
                        else if (color.equal("8")){
                            System.out.println(ConsoleColors.BLACK + "")}

        }
    

    

        
    }
    public static void banderas(String[]bandera) {
    public static void banderas(String[]bandera,int indice) {
        for(int i=indice+1; i < inidice + 20; i++){

            fila(bandera[i].slit(";"));
            System.out.println();
        }

        
    }

    }

    public static void Menu(String[]Menus) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Jugar");
            System.out.println("2. Como jugar");
            System.out.println("3. Creditos");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escriba una opcion");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Como Jugar");
                        System.out.println("1. elegir una opcion del menu principal")
                        System.out.println("2. Al salir una bandera y su pregunta responder con las opciones dadas")
                        System.out.println("3. Al responder, si responde bien seguiras jugando y te daran 5  puntos")
                        System.out.println("4. Si respondes mal, se acaba el juego")
                        
                        break;
                    case 3:
                        System.out.println("Creditos");
                        System.out.println("Juego creado por:")
                        System.out.println("Juan Jose")
                        System.out.println("Alejandro")
                        System.out.println("Espero que disfruten del juego")
                        System.out.println("Si notan algo mal por agradecemos recomendaciones")

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número de los dados");
                sn.next();
            }
        }
 
    }
 
}
    }

}