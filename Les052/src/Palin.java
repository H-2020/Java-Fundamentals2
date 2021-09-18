import java.util.Scanner;

public class Palin {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String reverse="";
        String name=scanner.nextLine();
        for(int index=0;index<name.length();index++){
            System.out.println(name.charAt(index));
        }
        for(int indexReverse=name.length()-1; indexReverse >=0;indexReverse--){
            reverse=reverse+name.charAt(indexReverse);
        }
        System.out.println(reverse);
        if(name.equals(reverse)){
            System.out.println("polindrom");
        }
        else
        {
            System.out.println("not polindrom");
        }

    }
}
