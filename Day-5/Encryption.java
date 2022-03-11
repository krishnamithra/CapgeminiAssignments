package day5;
import java.util.Scanner;

public class Encryption {
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String s1;
        char arr[],arr_2[];
        System.out.println("Enter the encrypted text:");
        s1=s.nextLine();
        int i,j=0,counter=0;
        arr=s1.toCharArray();
        arr_2=new char[arr.length];
        for(i=0;i<arr.length;i++)
        {
            int value=(int)arr[i];
            if(value<65 || (value>90 && value<97)){
              if(value==32)
                arr_2[j++]=' ';
              else
               continue;
            }
            else{
                value=value-7;
                if(value<97 && value>89)
                   value=value+26;
                if(value<65)
                   value=value+26;
                   
                arr_2[j++]=(char)value;
                counter=1;
            }
        }
        if(counter!=1){
            System.out.println("No hidden message");
            System.exit(0);
        }
        System.out.println("Decrypted text:");
        for(i=0;i<arr_2.length;i++){
            System.out.print(arr_2[i]);
        }
    }
}

