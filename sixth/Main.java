public class Main{
    
	public static void main(String[] args){

		IUser user = new User("Sacha");

		new ReportUser(user).report();
		new SaveUser(user).save();
	}
}