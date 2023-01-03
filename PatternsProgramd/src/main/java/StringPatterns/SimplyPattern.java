package StringPatterns;

public class SimplyPattern {
    public static void main(String[] args) {
        //string s = simply
        String s = "Simply";
        for (int i=0;i<=s.length()-1;i++){
            for (int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();

        }
    }

}
