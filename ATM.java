import java.io.IOException;


public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction(2);
		optionMenu.mainMenu();
	}

	public static void introduction(int x) {
                int y=x;
		System.out.println("Welcome");
                if (y!=0) {
                    introduction(y-1);
                } else{
                    System.out.println("Welcome to the ATM Project!");
                }
	}
}
