import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class java_project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\nTo-Do List Manager");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. View Tasks");
                System.out.println("4. Quit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter the task: ");
                        String task = scanner.nextLine();
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                        break;
                    case 2:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks to remove.");
                        } else {
                            System.out.println("Enter the task number to remove:");
                            int taskNumber = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                                tasks.remove(taskNumber - 1);
                                System.out.println("Task removed successfully!");
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        }
                        break;
                    case 3:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks to display.");
                        } else {
                            System.out.println("Your tasks:");
                            for (int i = 0; i < tasks.size(); i++) {
                                System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Exiting To-Do List Manager.");
                        scanner.close(); // Close scanner before exiting
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
