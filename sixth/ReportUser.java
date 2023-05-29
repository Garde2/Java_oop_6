public class ReportUser {

    private final IUser user;

    public ReportUser(IUser user){

        this.user = user;
    }

    public void report(){

        System.out.println("Жалоба на пользователя: " + user.getName());
    }
}