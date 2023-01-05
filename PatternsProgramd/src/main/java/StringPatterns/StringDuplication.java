package StringPatterns;

public class StringDuplication {
    public static void main(String[] args) {

        String a = "klunal";
        for (int i = 0; i <= a.length()-1; i++) {
            int count = 1;
            for (int j = i + 1; j  <= a.length() - 1; j++) {
                if (a.charAt(i)==a.charAt(j)){
                    count++;
                }

            }
            if (count>1){
                System.out.println("occuring letter is "+a.charAt(i)+count);
            }
        }
    }
}
