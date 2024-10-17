package gadv.AluraChallengeConversor.modules;

import java.util.Scanner;

public class ConversorMenu {
    public static int showMenu(Scanner scanner, String code){
        String menu = """
            Escoja el Codigo (1-6) de la Moneda que desea convertir:
                1. ARS - Peso argentino
                2. BOB - Boliviano boliviano
                3. BRL - Real brasileño
                4. CLP - Peso chileno
                5. COP - Peso colombiano
                6. USD - Dólar estadounidense
                7. SALIR""";
        int inputInt = 0, invalidInput = 0;
        while (inputInt < 1 || inputInt > 7 || inputInt == invalidInput) {
            if (code.isEmpty()) {
                System.out.println(menu);
                inputInt = getValidIntInput(scanner);
            } else {
                String updatedMenu = menu;
                switch (code) {
                    case "ARS":
                        updatedMenu = updatedMenu.replace("    1. ARS - Peso argentino\n", "");
                        invalidInput = 1;
                        break;
                    case "BOB":
                        updatedMenu = updatedMenu.replace("    2. BOB - Boliviano boliviano\n", "");
                        invalidInput = 2;
                        break;
                    case "BRL":
                        updatedMenu = updatedMenu.replace("    3. BRL - Real brasileño\n", "");
                        invalidInput = 3;
                        break;
                    case "CLP":
                        updatedMenu = updatedMenu.replace("    4. CLP - Peso chileno\n", "");
                        invalidInput = 4;
                        break;
                    case "COP":
                        updatedMenu = updatedMenu.replace("    5. COP - Peso colombiano\n", "");
                        invalidInput = 5;
                        break;
                    case "USD":
                        updatedMenu = updatedMenu.replace("    6. USD - Dólar estadounidense\n", "");
                        invalidInput = 6;
                        break;
                    default:
                        System.out.println("Código no válido.");
                        return 7;
                }
                System.out.println(updatedMenu);
                inputInt = getValidIntInput(scanner);
                if(inputInt == invalidInput) System.out.println("No es necesario convertir la moneda");
            }
        }
        return inputInt;
    }

    private static int getValidIntInput(Scanner scanner) {
        int inputInt = -1;
        while (inputInt == -1) {
            try {
                inputInt = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }
        return inputInt;
    }

    public static String menuToCode(int menu){
        return switch (menu) {
            default -> "";
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
        };
    }
}
