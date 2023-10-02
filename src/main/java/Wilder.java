public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstName = firstname;
        this.aware = false;
    }
    public String getFirstName() {
        return this.firstName = firstName;
    }
    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public Boolean isAware() {
        return this.aware;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (isAware()){
            return "Je m'appelle " + this.firstName + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
        }

    }

}