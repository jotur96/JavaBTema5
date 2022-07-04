import interfaces.CocheCRUD;
import interfaces.CocheCRUDImpl;

public class App {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) throws Exception {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
        
    }
}
