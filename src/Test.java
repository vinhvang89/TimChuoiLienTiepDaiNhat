import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scan.nextLine();
        LinkedList<Character> max = new LinkedList<Character>();
        LinkedList<Character> list = new LinkedList<Character>();
        for (int i = 0; i < inputString.length() ; i++) {
            if( list.size() > 1 && inputString.charAt(i) <= list.getLast() && list.contains(inputString.charAt(i)))
                    list.clear();
            list.add(inputString.charAt(i));
            if(list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max){
            System.out.print(ch);
        }
        System.out.println();

    }
}
