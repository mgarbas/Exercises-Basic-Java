package Basic;

public class Flaga {

    public static void main(String[] args) {

        // The program outputs an American flag

        String s1 = "* * * * * * ==================================";
        String s2 = " * * * * *  ==================================";
        String s3 = "==============================================";

        for(int i = 1; i <= 15; i++){
            while (i <= 9){
                if(i % 2 == 0){
                    System.out.println(s2);
                }else{
                    System.out.println(s1);
                }
                i++;
            }
            System.out.println(s3);
        }
    }
}
