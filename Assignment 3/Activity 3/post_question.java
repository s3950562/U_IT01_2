public class User {
    private String title;
    private String content;
    private String[] tags;

    // Navigates to Post Question tab
    public void navigateToPostQuestion() {
        System.out.println("Navigating to Post Question tab...");
        System system = new System();
        system.generateQuestionForm(this);
    }

    // Presses "Create New Question"
    public void createNewQuestion() {
        System.out.println("Creating new question...");
        // Logic for creating new question
    }

    // Decides title, writes content, and assigns tags
    public void decideTitleAndContent(String title, String content, String[] tags) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        System.out.println("Decided title, wrote content, and assigned tags.");
    }

    // Presses "Post Question" button
    public void postQuestion() {
        System system = new System();
        system.validateContent(this);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String[] getTags() {
        return tags;
    }
}

// System.java
public class System {

    // Generates a question form
    public void generateQuestionForm(User user) {
        System.out.println("Generating question form...");
        displayQuestionForm(user);
    }

    // Displays the question form
    public void displayQuestionForm(User user) {
        System.out.println("Displaying question form...");
        user.createNewQuestion();
    }

    // Validates user content
    public void validateContent(User user) {
        System.out.println("Validating user content...");
        // Validation logic
        boolean isValid = true; // Assume validation logic sets this

        if (isValid) {
            writePostToDatabase(user);
        } else {
            sendErrorMessage(user);
        }
    }

    // Writes post to the database
    public void writePostToDatabase(User user) {
        System.out.println("Writing post to database...");
        setPostVisible(user);
    }

    // Sets the post to visible
    public void setPostVisible(User user) {
        System.out.println("Setting post to visible on the site...");
        notifyUserPostSuccessful(user);
    }

    // Sends error message
    public void sendErrorMessage(User user) {
        System.out.println("Sending error message to user...");
        // Error message logic
    }

    // Notifies user about post status
    public void notifyUserPostSuccessful(User user) {
        System.out.println("Notifying user their post was successful...");
        // Notification logic
    }
}
