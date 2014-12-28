import java.util.*;
import java.sql.*;
public class login {

	private String username;
	private String password;
	public login() throws ClassNotFoundException, SQLException{
		// Setup scanner
		Scanner input = new Scanner(System.in);
		String fillers = "================================";
		
		promptUsernamePassword(input);
		//Check if username and password exists in db
		while(!userExists()){
			System.out.println("Incorrect username or password, try again.");
			promptUsernamePassword(input);
		}
		// User exists
		System.out.println(fillers);
		String sql = "select Active from customers where username = '"+this.username+"';";
		commandLine.startSession();
		String Active = commandLine.executeSession(sql, 1).get(0);
		if (Active.equals(0)){
			System.out.println("User is deactivated, please contact admin");
			return;
		}
		new customer(this.username, this.password);
	}
	
	/* Prompts user for username, password and sets the
	 * inputed Strings to this.username and this.password
	 */
	public void promptUsernamePassword(Scanner input){
		System.out.println("Input your username: ");
		this.username = input.nextLine(); 
		this.username = isEmpty(this.username, input);
		System.out.println("Input your password: ");
		this.password = input.nextLine();
		this.password = isEmpty(this.password, input);
	}
	
	/* Checks if input fields are empty, and requests
	 * re-input if they are. Returns input when given.  
	 */ 
	public String isEmpty(String userInput, Scanner input){
		while(userInput.isEmpty()){
			System.out.println("Try again.");
			userInput = input.nextLine();
		}
		return userInput;
	}
	
	/*
	 * Returns true if the user with the inputed username 
	 * and password matches any tuple in the customers table.
	 */
	public Boolean userExists() throws ClassNotFoundException{
		/* * GOTTA DO THIS * */
		// query database to see if username = this.username and password = this.password 
		commandLine.startSession();
			String sql = "SELECT EXISTS(SELECT * FROM customers WHERE Username = '"+this.username+"' and Password = '"+this.password+"' ) ";
		ArrayList<String> rs = commandLine.executeSession(sql, 1);
			if (! rs.get(0).equals("1")){
				return false;
			}
		commandLine.endSession();
			//STEP 5: Extract data from result set

		return true;
	}

}
