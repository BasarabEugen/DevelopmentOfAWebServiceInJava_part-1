package accounts;

/**
 * basar
 * 05.10.2018
 * DevelopmentOfAWebServiceInJava_part-1
 */
public class UserProfile {
  private final String login;
  private final String pass;

  public UserProfile(String login, String pass) {
    this.login = login;
    this.pass = pass;
  }

  public UserProfile(String login) {
    this.login = login;
    this.pass = login;
  }

  public String getLogin() {
    return login;
  }

  public String getPass() {
    return pass;
  }
}