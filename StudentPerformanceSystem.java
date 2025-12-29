	public class StudentPerformanceAnalytics  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	for (int i = 1; i <= 5; i++) {
  System.out.println("Module " + i);
	}
	System.out.println("Enter average mark of the module:");
	int choice = input.nextInt();
	if (choice == 1) {
	System.out.println("Weak Module");
	}
	else if (choice == 2) {
	System.out.println("Average Module");
	}
	else if (choice == 3) {
	System.out.println("Strong Module");
	}
	else {
	System.out.println("Invalid mark entered");
	}
	}
	}
