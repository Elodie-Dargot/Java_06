public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = false;
    };
    public String getFirstName() {
        return this.firstname = firstname;
    };
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    };

    public Boolean isAware() {
        return this.aware;
    };
    public void setAware(boolean aware) {
        this.aware = aware;
    };
    public String whoAmI() {
        if (isAware()){
            return "Je m'appelle " + this.getFirstName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
        }

    };

}