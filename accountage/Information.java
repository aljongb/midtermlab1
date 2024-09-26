package accountage;
public class Information {
    private String username, password;
    private int age;
    
    void setUsername(String username){
        this.username = username;
    }
    String getUsername(){
        return username;
    }
    void setPassword(String password){
        this.password = password;
    }
    String getPassword(){
        return password;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    boolean isAccountCorrect(String username, String password){
        if (username.equals(this.getUsername()) && password.equals(this.getPassword())){
            return true;
        } else {
            return false;
        }
    }
    static void ageChecker(int age) throws AgeException{
        if (age < 18){
            throw new AgeException("Access denied! Under 18");
        } else {
            System.out.println("Access Granted!");
        }
    }
    static void passwordChecker(String password) throws PasswordException{
        if ((password.length()) < 8){
            throw new PasswordException("Weak Password. Password must be 8 characters above");
        } else {
            System.out.println("Strong Password!");
        }
    }
}
