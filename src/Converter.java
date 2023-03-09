import java.util.Objects;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        //Maak in je main methode een Integer array genaamd numeric die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //Maak in je main methode een String array genaamd alphabetic die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        //De constructor is klaar. Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, oftewel: maak in main een nieuw object aan van het type Translator.
        Translator translator = new Translator(numeric, alphabetic);

        //In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van number
        boolean play = true;
        String ongeldig = "ongeldig invoer";
        Scanner scanner = new Scanner(System.in);


        //Vervolgens maak je een while-loop die doorgaat zolang play true is.
        while(play){
            //Print in de while-loop "Type 'x' om te stoppen \nType 'v' om te vertalen" en maak een String variabele genaamd input waarin je de waarde van scanner.nextLine() opslaat
            System.out.println("type x om te stoppen");
            System.out.println("type v om te vertalen");
            String input = scanner.nextLine();

            //Maak in de body van de while-loop een if/else if/else statement.
            //if: Als de input "x" is, dan zet je play naar false.
            //else if: Als de input "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9", vervolgens sla je het resultaat van scanner.nextInt() op in een variabele int number, voeg nog een scanner.nextLine(); toe op de volgende regel (scanner.nextInt doet dit namelijk niet van zichzelf)

            //syntax voor Strings
            if(Objects.equals(input, "x")){
                play  = false;
            }else if(Objects.equals(input, "v")){
                System.out.println("Voer een cijver van 0 tot en met 9");
                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                //en als laatste check je met een if-statement of
                //if: number kleiner is dan 10, dan sla je de waarde van translator.translate(number) op in String result en print je "De vertaling van " + number + " is " + result.
                //else: anders dan print je ongeldig
                //else: Als de input dus iets anders dan "x" of "v" is, dan print je ongeldig

                //geneste if statement
                if(inputGrade < 10){
                    //methode Translate ophalen
                    String result = translator.translate(inputGrade);
                    System.out.println(result);
                }else{
                    System.out.println("Ongeldig invoer. Voer een cijver tussen 0 en 9 in");
                }
            }else{
                System.out.println("ongeldig invoer. Voer een x of een v in");

            }

        }

    }
}
