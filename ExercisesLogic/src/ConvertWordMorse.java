public class ConvertWordMorse {

    public static void main(String [] args){

        String word = Reuse.enterText("Please, enter word to convert to Morse code");

        String wordConvert = convertWordMorse(word);

        System.out.println("Your  converted text is : ");
    }

    public static String convertWordMorse(String word){
        String wordMorse = "";

        for(int i = 0; i<word.length();i++){
            wordMorse += word.charAt(i) + "  ";
        }
        return  wordMorse;
    }

    public static String convertLetterMorse(char letter){

        String letterConveted ="";

        switch (letter){

            case ' ' : letterConveted = "/";
                break;
            case 'a' : letterConveted = ".-";
                break;
            case 'b' : letterConveted = "-...";
                break;
            case 'c' : letterConveted = "-.-.";
                break;
            case 'd' : letterConveted = "-..";
                break;
            case 'e' : letterConveted = ".";
                break;
            case 'f' : letterConveted = "..-.";
                break;
            case 'g' : letterConveted = "--.";
                break;
            case 'h' : letterConveted = "....";
                break;
            case 'i' : letterConveted = "..";
                break;
            case 'j' : letterConveted = ".--";
                break;
            case 'k' : letterConveted = "-.-";
                break;
            case 'l' : letterConveted = ".-..";
                break;
            case 'm' : letterConveted = "--";
                break;
            case 'n' : letterConveted = "-.";
                break;
            case 'o' : letterConveted = "---";
                break;
            case 'p' : letterConveted = ".--.";
                break;
            case 'q' : letterConveted = "--.-";
                break;
            case 'r' : letterConveted = ".-.";
                break;
            case 's' : letterConveted = "...";
                break;
            case 't' : letterConveted = "-";
                break;
            case 'u' : letterConveted = "..-";
                break;
            case 'v' : letterConveted = "..-";
                break;
            case 'w' : letterConveted = "...-";
                break;
            case 'x' : letterConveted = ".--";
                break;
            case 'y' : letterConveted = "-.--";
                break;
            case 'z' : letterConveted = "--..";
                break;
            default: letterConveted = "letter no defined in Morse code";
        }

        return letterConveted;
    }
}
