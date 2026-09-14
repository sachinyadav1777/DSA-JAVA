package Binary_Conversion;

import java.util.Scanner;

public class Count_1s {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        String binary = sc.nextLine();
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                count+=1;
            }
        }
        System.out.println("The Number of One's is "+count);
        sc.close();
    }
}
