import java.util.Scanner;

public class BotStudy{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;

        do{
            showMenu();
            option = scanner.nextLine();

            switch (option){
                case "1":
                    giveTip();
                    break;
                case "2":
                    takeQuiz(scanner);
                    break;
                case "3":
                    showSummary();
                    break;
                case "4":
                    motivate();
                    break;
                case "0":
                    System.out.println("See you later! Happy studying!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }while (!option.equals("0"));

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== BotStudy ===");
        System.out.println("1 - Study tip");
        System.out.println("2 - Programming Quiz");
        System.out.println("3 - Logic summary");
        System.out.println("4 - Motivation of the day");
        System.out.println("0 - To go out");
        System.out.println("Choose an option");
    }

    private static void giveTip(){
        System.out.println("Tip: Use the Pomodoro technique — 25 minutes focused, 5 minutes off!\"");
    }

    private static void takeQuiz(Scanner scanner) {
        System.out.println("Question: Which keyword do we use to create a class in Java?");
        System.out.println("a) function\nb) def\nc) class\nd) public");
        System.out.print("Answer: ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("c")){
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The correct answer is 'c'.");
        }
    }

    private static void showSummary() {
        System.out.println("Summary: Programming logic involves sequences, decisions (if/else) and repetitions (loops).");
    }

    private static void motivate() {
        System.out.println("Motivation: Learning programming is one step at a time. Keep going and never stop!");
    }
}