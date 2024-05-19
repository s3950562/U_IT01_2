public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // navigates to Sign-Up page
    public void navigateToSignUp() {
        System.out.println("Navigating to Sign-Up page...");
    }

    // enters User details and submits form
    public void enterDetailsAndSubmit() {
        System system = new System();
        system.validateDetails(this);
    }

    // Agrees to terms and services
    public void agreeToTerms() {
        System.out.println("User agrees to terms and services.");
        System system = new System();
        system.createUser(this);
    }

    // Verifies email
    public void verifyEmail() {
        System.out.println("User verifies their email.");
        System system = new System();
        system.initializeAccount(this);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

// System.java
public class System {

    // Validates user details
    public void validateDetails(User user) {
        System.out.println("Validating details for: " + user.getUsername());
        // Validate details logic
        presentTermsOfService(user);
    }

    // Presents terms of service
    public void presentTermsOfService(User user) {
        System.out.println("Presenting terms of service to: " + user.getUsername());
        // Show terms of service logic
        user.agreeToTerms();
    }

    // Creates a new user
    public void createUser(User user) {
        System.out.println("Creating new user: " + user.getUsername());
        // Create user logic
        sendVerificationEmail(user);
    }

    // Sends verification email
    public void sendVerificationEmail(User user) {
        System.out.println("Sending verification email to: " + user.getEmail());
        // Send email logic
    }

    // Initializes user account
    public void initializeAccount(User user) {
        System.out.println("Initializing account for: " + user.getUsername());
        // Initialize account logic
    }
}
