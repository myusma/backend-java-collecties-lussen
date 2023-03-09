import java.util.HashMap;

public class Translator {

    //Maak in de Translator class een HashMap<Integer,String> variabele met de naam numericAlpha
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    //Maak in de Translator class een constructor die de volgende parameters krijgt: (String[] alphabetic, Integer[] numeric)
    public Translator(Integer[] numeric, String[] alphabetic) {
        //Schrijf in de constructor een for-loop die begint bij 0 en doorgaat tot de lengte van de numeric/alphabetic array (maakt niet uit welke, ze zijn even lang).
        for (int i = 0; i < numeric.length; i++) {
            //Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit numeric en alphabetic. Gebruik de i variabele uit je for-loop om de correcte waardes uit de arrays te halen.
            numericAlpha.put(numeric[i], alphabetic[i]);

        }
    }

    //Maak in de Translator class een nieuwe methode genaamd translate(Integer number) die een String returnt.

    //Lange versie//
//    public String Translate(Integer number){
//        String result = numericAlpha.get(number);
//        return result;
//
//    }

    //Kortere versie//
    public String translate(Integer number) {
        //In de body van de translate methode return je de waarde (value) uit de numericAlpha HashMap die hoort bij de sleutel (key) van number
        return numericAlpha.get(number);

    }

}


