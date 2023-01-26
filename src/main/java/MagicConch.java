import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MagicConch { public static void main(String[] args) {


    String[] answers = {"Maybe someday.", "Nothing", "Neither", "I don't think so","No","Yes",
            "Try asking again","The outlook... Ima be honest its not so good",
            "Ask again, I don't really feel like it right now....","You dont wanna know the answer to that question",
            "Look, I checked with my sources... They said no...", "Concentrate, hold me in the air and ask again!"};

    System.out.println("Hello! This is the magic conch shell." +
            " Ask a yes or no question and I will answer your fortune!");
    do {
        System.out.println("What question do you wish to ask the magic conch?");
        //create a scanner to get the users question to ask the magic 8 ball
        Scanner scan = new Scanner(System.in);
        String userQuestion = scan.nextLine();
        int arrayIndex = new Random().nextInt(answers.length);
        String randomConchAnswer = (answers[arrayIndex]);

        System.out.println(randomConchAnswer);
        System.out.println("THE MAGIC CONCH HAS SPOKEN!!!!!!!!!!!!!!");
        System.out.println("Ask the conch another question? Type 'yes' to continue or 'no' to leave.");
        String userAnswer = scan.nextLine().toLowerCase();
        if(!userAnswer.equals("yes") && !userAnswer.equals("no")){
            System.out.println("its a yes or no question dude...");
            userAnswer=scan.nextLine();
        }

        if (userAnswer.contains("no")) {
            System.out.println("It's been real");
            break;
        }

    }
    while(true);
}

}