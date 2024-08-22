import java.util.Scanner;

class Voting {

    public static boolean isEligible(int age, boolean isCitizen) {
        return age >= 18 && isCitizen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        if (isEligible(age, isCitizen)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
