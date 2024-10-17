package gadv.AluraChallengeConversor.main;

import gadv.AluraChallengeConversor.modules.ConversorMenu;
import gadv.AluraChallengeConversor.modules.ConverterAPIConsult;
import gadv.AluraChallengeConversor.modules.CurrencyConversions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterAPIConsult converterAPIConsult = new ConverterAPIConsult();
        int menu;
        while (true) {
            menu = ConversorMenu.showMenu(scanner, "");
            if(menu == 7) break;
            String codeCurrencyToConvert = ConversorMenu.menuToCode(menu);
            menu = ConversorMenu.showMenu(scanner, codeCurrencyToConvert);
            if(menu == 7) break;
            String codeCurrencyToOutput = ConversorMenu.menuToCode(menu);
            System.out.println("********************************************");
            System.out.println("Ingrese la cantidad a convertir: ");
            double amountToConvert = Double.parseDouble(scanner.nextLine());
            CurrencyConversions currencyConversions = converterAPIConsult.consultConversions(codeCurrencyToConvert);
            double amountConverted = (amountToConvert * currencyConversions.convertToCode(codeCurrencyToOutput));
            System.out.println("Convirtiendo " + amountToConvert + " " + codeCurrencyToConvert +
                    " a " + codeCurrencyToOutput + " resulta en: " + amountConverted);
            System.out.println("********************************************");
            System.out.println("Presione enter para continuar...");
            scanner.nextLine();
        }
        scanner.close();
    }
}
