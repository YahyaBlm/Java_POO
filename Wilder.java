public class Wilder {
    private String firstname;
    private Boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Boolean getAware() {
        return aware;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.firstname + " et je " + (this.aware ? "suis ..." : "ne suis pas ...");
    }
}