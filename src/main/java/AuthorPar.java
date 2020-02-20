public class AuthorPar {

    //gson imports will be added later

    private String authName;
    private String authEmail;
    private String authLink;

    protected String getAuthName() {
        return authName;
    }

    protected void setAuthName(String name) {
        this.authName = name;
    }

    protected String getAuthEmail() {
        return authEmail;
    }

    protected void setAuthEmail(String authEmail) {
        this.authEmail = authEmail;
    }

    protected String getAuthLink() {
        return authLink;
    }

    protected void setAuthLink(String authLink) {
        this.authLink = authLink;
    }
}
