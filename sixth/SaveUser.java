public class SaveUser {

    private final IUser user;

    public SaveUser(IUser user){

        this.user = user;
    }

    public void save(){
        
        Persister persister = new Persister(user);
        persister.save();
    }
}