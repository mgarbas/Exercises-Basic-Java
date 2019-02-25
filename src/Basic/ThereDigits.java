package Basic;

public class ThereDigits {

    public static void main(String[] args) {

        // The program show any combination of three numbers
        
        int[] tab = new int[6];
        
        int amount = 0;
        
        for (int i = 1;i <=tab.length;i++) {
            for (int j = 1; j <=tab.length;j++) {
                for (int k =1; k<=tab.length;k++) {
                    if (i != j && j != k && i != k) {
                        amount++;
                        System.out.println(i+ "" +j+ "" +k);
                    }
                }
            }
        }
        System.out.println("There are "+amount+" unique combinations");
    }
}
