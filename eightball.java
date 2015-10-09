
import skilstak.c;
import java.util.Scanner;
import java.util.List;


public class eightball {
    private static String[] list = {"Yes.","No.","Maybe.","MY NAME JEFF"};    
    
     
    
    private static final String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    
    
    
    
    }
    private static final String choice(String[] list) {
        int index = (int) (Math.random()*list.length);
        return list[index];
    }

    public static final void main (String[] args) {
        System.out.println(c.r + "Welcome " + c.o + "to " + c.y + "the " + c.g + "magic " + c.b + "eightball" + c.v + c.x); 
        System.out.println(c.y + "Enter yur question below");
        while (true) {
            String question = input(c.r + "> " + c.b3);        
            System.out.println(choice(list));





        }
    }
}
