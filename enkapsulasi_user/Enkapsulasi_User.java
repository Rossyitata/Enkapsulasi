package enkapsulasi_user;

public class Enkapsulasi_User {

    
    public static void main(String[] args) {
       User Tata = new User("Tata","jenonojen", 0 , false);

Tata.setUsername("Titi");
Tata.setPassword("jaemin");
Tata.setID(0);
Tata.setStatus(false);


System.out.println("Username: " + Tata.getUsername());
System.out.println("Password: " + Tata.getPassword());  
        System.out.println("ID: " + Tata.getID());
        System.out.println("Status: " + Tata.getStatus());
    }
    
}
