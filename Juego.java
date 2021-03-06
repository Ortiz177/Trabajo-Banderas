import java.util.*;

public class Juego {
	public static void main(String[] args) {
		int score = 0;
		menu(score);
	}

	public static int menu(int score) {
		int centinela = 0;

		do {
			System.out.println();
			System.out.println(ConsoleColors.CYAN + " _______  _        _______  _______  _______        _______  _______  _______  _______ ");
			System.out.println(ConsoleColors.CYAN + "(  ____ \\( \\      (  ___  )(  ____ \\(  ____ \\      (  ____ \\(  ___  )(       )(  ____ \\");
			System.out.println(ConsoleColors.CYAN + "| (    \\/| (      | (   ) || (    \\/| (    \\/      | (    \\/| (   ) || () () || (    \\/");
			System.out.println(ConsoleColors.CYAN + "| (__    | |      | (___) || |      | (_____       | |      | (___) || || || || (__    ");
			System.out.println(ConsoleColors.CYAN + "|  __)   | |      |  ___  || | ____ (_____  )      | | ____ |  ___  || |(_)| ||  __)   ");
			System.out.println(ConsoleColors.CYAN + "| (      | |      | (   ) || | \\_  )      ) |      | | \\_  )| (   ) || |   | || (      ");
			System.out.println(ConsoleColors.CYAN + "| )      | (____/\\| )   ( || (___) |/\\____) |      | (___) || )   ( || )   ( || (____/\\");
			System.out.println(ConsoleColors.CYAN + "|/       (_______/|/     \\|(_______)\\_______)      (_______)|/     \\||/     \\|(_______/");
			System.out.println("Elige una opcion");
			System.out.println("1.Jugar");
			System.out.println("2.Como Jugar");
			System.out.println("3.Creditos");
			System.out.println("4.Salir");
			centinela= ConsoleInput.getInt();

			switch (centinela) {
				case 1: score += jugar();
				        break;
				case 2: comojugar();
				        break;
				case 3: creditos();
								break;
				case 4: System.out.println("Gracias por jugar! tu puntaje fue: " + score);
				        break;
				default: System.out.println("No se encuentra esta opcion");
								break;
			}
		} while (centinela != 4);

		return score;
  }

	public static int jugar() {
		String banderas[] = ConsoleFile.read("recursos/info_banderas.csv");
		int indices[] = crearIndices(banderas.length / 20);
		indices = RandomizeArray(indices);
		// System.out.println("hola soy el #: "+ indices[9]);

		imprimirBandera(banderas, indices[20]);
		System.out.println();
		System.out.println("¿A que pais pertenece esta bandera?");
		System.out.println("Por favor ingresar el pais con la primera letra en mayuscula");
		String answer = ConsoleInput.getString();

		return pointsCount(validateAnswer(answer, banderas, indices[20]));
	}

	public static int[] crearIndices(int total) {
		int indices[] = new int[total];
		int contador = 0;

		for (int i = 0; i < indices.length; i++) {
			indices[i] = contador;
			contador += 20;
		}

		return indices;
	}

	public static int[] RandomizeArray(int[] array) {
		Random rgen = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}
		return array;
	}

	public static void imprimirBandera(String[] banderas, int indice) {
		for (int i = indice; i < indice + 20; i++) {
			colores(banderas[i].split(";"));
		}
	}

	public static void colores(String fila[]) {
		for (int i = 0; i < fila.length; i++) {
			if (fila[i].equals("1")) {
				System.out.print(ConsoleColors.RED_BACKGROUND + "  ");
			}
			if (fila[i].equals("2")) {
				System.out.print(ConsoleColors.BLUE_BACKGROUND + "  ");
			}
			if (fila[i].equals("3")) {
				System.out.print(ConsoleColors.WHITE_BACKGROUND + "  ");
			}
			if (fila[i].equals("4")) {
				System.out.print(ConsoleColors.YELLOW_BACKGROUND + "  ");
			}
			if (fila[i].equals("5")) {
				System.out.print(ConsoleColors.GREEN_BACKGROUND + "  ");
			}
			if (fila[i].equals("6")) {
				System.out.print(ConsoleColors.PURPLE_BACKGROUND + "  ");
			}
			if (fila[i].equals("7")) {
				System.out.print(ConsoleColors.CYAN_BACKGROUND + "  ");
			}
			if (fila[i].equals("8")) {
				System.out.print(ConsoleColors.BLACK_BACKGROUND + "  ");
			}
		}

		System.out.println(ConsoleColors.RESET);
	}

	public static boolean validateAnswer(String answer, String banderas[], int indice) {
		boolean isMatch = false;
		String fila[];
		String country;

		fila = banderas[indice].split(";");
		country = fila[0];
		System.out.println("Nombre pais: " +country);

		if (country.equals(answer)) {
			isMatch = true;
		}
		return isMatch;
	}


	public static int pointsCount(boolean validation) {
		int points = 0;

		if (validation == true) {
			points = 1;
		}
		return points;
	}

	public static void comojugar() {
		System.out.println(ConsoleColors.YELLOW + "   ____                                      _                                ");
    System.out.println(ConsoleColors.YELLOW + "  / ___|    ___    _ __ ___     ___         | |  _   _    __ _    __ _   _ __ ");
    System.out.println(ConsoleColors.GREEN +  "  | |      / _ \\  | '_ ` _ \\   / _ \\     _  | | | | | |  / _` |  / _` | | '__|");
    System.out.println(ConsoleColors.GREEN +  "  | |___  | (_) | | | | | | | | (_) |   | |_| | | |_| | | (_| | | (_| | | |   ");
    System.out.println(ConsoleColors.PURPLE + "   \\____|  \\___/  |_| |_| |_|  \\___/     \\___/   \\__,_|  \\__, |  \\__,_| |_|   ");
    System.out.println(ConsoleColors.PURPLE + "                                                        |___/                ");
    System.out.println("1. Elige la opcion jugar");
    System.out.println("2. Leer las preguntas y contestarlas");
    System.out.println("3. Acomula puntos");
	}

		public static void creditos(){
    System.out.println();
    System.out.println(ConsoleColors.YELLOW + "..######..########..########.########..####.########..#######...######........###.....##.");
    System.out.println(ConsoleColors.YELLOW + ".##....##.##.....##.##.......##.....##..##.....##....##.....##.##....##......##.##...####");
    System.out.println(ConsoleColors.YELLOW + ".##.......##.....##.##.......##.....##..##.....##....##.....##.##...........##...##...##.");
    System.out.println(ConsoleColors.YELLOW + ".##.......########..######...##.....##..##.....##....##.....##..######.....##.....##.....");
    System.out.println(ConsoleColors.YELLOW + ".##.......##...##...##.......##.....##..##.....##....##.....##.......##....#########..##.");
    System.out.println(ConsoleColors.YELLOW + ".##....##.##....##..##.......##.....##..##.....##....##.....##.##....##....##.....##.####");
    System.out.println(ConsoleColors.YELLOW + "..######..##.....##.########.########..####....##.....#######...######.....##.....##..##.");
    System.out.println();
    System.out.println();
		System.out.println(ConsoleColors.PURPLE + ".......##.##.....##....###....##....##..........##..#######...######..########");
		System.out.println(ConsoleColors.PURPLE + ".......##.##.....##...##.##...###...##..........##.##.....##.##....##.##......");
		System.out.println(ConsoleColors.PURPLE + ".......##.##.....##..##...##..####..##..........##.##.....##.##.......##......");
		System.out.println(ConsoleColors.PURPLE + ".......##.##.....##.##.....##.##.##.##..........##.##.....##..######..######..");
		System.out.println(ConsoleColors.PURPLE + ".##....##.##.....##.#########.##..####....##....##.##.....##.......##.##......");
		System.out.println(ConsoleColors.PURPLE + ".##....##.##.....##.##.....##.##...###....##....##.##.....##.##....##.##......");
		System.out.println(ConsoleColors.PURPLE + "..######...#######..##.....##.##....##.....######...#######...######..########");
		System.out.println();
		System.out.println();
		System.out.println(ConsoleColors.BLUE + "....###....##.......########.......##....###....##....##.########..########...#######.");
		System.out.println(ConsoleColors.BLUE + "...##.##...##.......##.............##...##.##...###...##.##.....##.##.....##.##.....##");
		System.out.println(ConsoleColors.BLUE + "..##...##..##.......##.............##..##...##..####..##.##.....##.##.....##.##.....##");
		System.out.println(ConsoleColors.BLUE + ".##.....##.##.......######.........##.##.....##.##.##.##.##.....##.########..##.....##");
    System.out.println(ConsoleColors.BLUE + ".#########.##.......##.......##....##.#########.##..####.##.....##.##...##...##.....##");
    System.out.println(ConsoleColors.BLUE + ".##.....##.##.......##.......##....##.##.....##.##...###.##.....##.##....##..##.....##");
    System.out.println(ConsoleColors.BLUE + ".##.....##.########.########..######..##.....##.##....##.########..##.....##..#######.");
    System.out.println();
    System.out.println();
		System.out.println(ConsoleColors.YELLOW + "Somos unos programadores principiantes, ojala disfruten del juego ;)");
	}
}
