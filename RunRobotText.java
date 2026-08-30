import java.util.Scanner;

public class RunRobotText
{
    public static void main(String[] args)
    {
        RobotMonitor robot = new RobotMonitor();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6)
        {
            System.out.println("\nCURRENT ROBOT POSITION: " + robot.toString());
            System.out.println("[1]: Move RIGHT");
            System.out.println("[2]: Move LEFT");
            System.out.println("[3]: Move UP");
            System.out.println("[4]: Move DOWN");
            System.out.println("[5]: Robot EXIT");
            System.out.println("[6]: END");
            System.out.print("ENTER CHOICE: ");

            choice = scanner.nextInt();

            try
            {
                switch (choice)
                {
                    case 1:
                        robot.MoveRight();
                        System.out.println("Moved RIGHT successfully.");
                        break;
                    case 2:
                        robot.MoveLeft();
                        System.out.println("Moved LEFT successfully.");
                        break;
                    case 3:
                        robot.MoveUp();
                        System.out.println("Moved UP successfully.");
                        break;
                    case 4:
                        robot.MoveDown();
                        System.out.println("Moved DOWN successfully.");
                        break;
                    case 5:
                        robot.Exit();
                        System.out.println("Robot exited! New robot entered at (1,1).");
                        break;
                    case 6:
                        System.out.println("Ending...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1-6.");
                }
            }
            catch (VDMException e)
            {
                System.out.println("VDM ERROR: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
