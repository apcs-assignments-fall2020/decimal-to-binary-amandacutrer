import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        String bin = binary.replaceAll(" ", "");
       int binNum = Integer.parseInt(bin);
       int answer = 0;
       int place = 1;
        while (binNum > 0){
            answer = answer + ((binNum % 10)*place);
            binNum /= 10; 
            place = place * 2;
        }
        return answer;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        int num = scan.nextInt();
        String number = num + " ";
        System.out.println(number);
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(number));
           scan.close();
    }
}
