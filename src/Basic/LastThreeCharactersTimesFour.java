package Basic;

public class LastThreeCharactersTimesFour {

    public static void main(String[] args) {

        // The program will output three last letters of a sentence four times

        String sentence = "Any given sentence will suffice";
        String lastThree = sentence.substring(sentence.length()-3);
        System.out.print(lastThree+" "+lastThree+" "+lastThree+lastThree);
    }
}
