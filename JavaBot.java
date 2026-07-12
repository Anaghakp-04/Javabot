import java.util.Scanner;

public class JavaBot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name=scan.nextLine();
        System.out.println("Hi, "+name+". I am Javabot.Where are you from?");
        String place=scan.nextLine();
        System.out.println("I hear it's beautiful at "+place+". I am from a place called Oracle.");
        System.out.println("How old are you?");
        int age=scan.nextInt();
        System.out.println("So you are "+age+ " cool!. I am 400 years old");
        System.out.println("This means I am  "+(400/age)+" times older than you.");
        System.out.println("Enough about me.What is your favourite language?");
        scan.nextLine();
        String language=scan.nextLine();
        System.out.println(language+".That's great! Nice chatting with you "+name+". Its time for me to logout.See ya! Bye");

    }
}
