public class Wilder{
    
    // attributs
    private String firstName;
    private boolean aware;

    // constructeur
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    // getters
    public String getFirstName () {
        return this.firstName;
    }

    public boolean  isAware () {
        return this.aware;
    }

    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAware(boolean aware){
        this.aware = aware;
    }
    // méthode 
    public String whoAmI(){
        if (this.aware == true){
            return "Je m'appele " + firstName + " je suis aware ";
        }else{
            return"Je m'appelle " + firstName + " et je ne suis pas aware "; 
        }

    }












}