package uni.fmi.models;

public class User {

    public User() {
    }

    protected int userId;
    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String telephoneNumber;
    protected String address;
    protected String email;

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
               return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int userId) {
     this.userId = userId;
    }

    public void setUsername(String username) {
     this.username = username;
    }

    public void setPassword(String password) {
    this.password = password;
    }

    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
       this.telephoneNumber = telephoneNumber;
       }

    public void setAddress(String address) {
     this.address = address;
    }

    public void setEmail(String email) {
       this.email = email;
    }


    public boolean login(String username, String password) {
        // TODO implement here
        return false;
    }

}