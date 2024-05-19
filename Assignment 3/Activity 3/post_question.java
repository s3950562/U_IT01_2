// User.java
public class User {
    private String title;
    private String content;
    private String[] tags;

    /**
     * User navigates to the Post Question tab.
     * This method initiates the process by calling the system to generate the question form.
     */
    public void navigateToPostQuestion() {
        System.out.println("Navigating to Post Question tab...");
        System system = new System();
        system.generateQuestionForm(this);
    }

    /**
     * User presses the "Create New Question" button.
     * This is a placeholder method representing user interaction.
     */
    public void createNewQuestion() {
        System.out.println("Creating new question...");
        // Logic for creating a new question can be added here.
    }

    /**
     * User decides the title, writes the content, and assigns tags.
     * This method captures the user's input for the new question.
     *
     * @param title   The title of the question.
     * @param content The content of the question.
     * @param tags    The tags assigned to the question.
     */
    public void decideTitleAndContent(String title, String content, String[] tags) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        System.out.println("Decided title, wrote content, and assigned tags.");
    }

    /**
     * User presses the "Post Question" button.
     * This method calls the system to validate the content.
     */
    public void postQuestion() {
        System system = new System();
        system.validateContent(this);
    }

    // Getters and Setters for accessing private fields.
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

    /**
     * Generates a question form for the user.
     * This method is part of the process to display the form to the user.
     *
     * @param user The user who will fill out the question form.
     */
    public void generateQuestionForm(User user) {
        System.out.println("Generating question form...");
        displayQuestionForm(user);
    }

    /**
     * Displays the generated question form to the user.
     * This method simulates the user interface display.
     *
     * @param user The user who will see the question form.
     */
    public void displayQuestionForm(User user) {
        System.out.println("Displaying question form...");
        user.createNewQuestion();
    }

    /**
     * Validates the user's content.
     * This method checks if the user's input is valid and decides the next steps.
     *
     * @param user The user who submitted the question.
     */
    public void validateContent(User user) {
        System.out.println("Validating user content...");
        // Validation logic here. Assuming it is valid for this example.
        boolean isValid = true;

        if (isValid) {
            writePostToDatabase(user);
        } else {
            sendErrorMessage(user);
        }
    }

    /**
     * Writes the validated post to the database.
     * This method simulates the storage of the user's question.
     *
     * @param user The user who submitted the question.
     */
    public void writePostToDatabase(User user) {
        System.out.println("Writing post to database...");
        setPostVisible(user);
    }

    /**
     * Sets the post to visible on the website.
     * This method updates the visibility status of the user's question.
     *
     * @param user The user who submitted the question.
     */
    public void setPostVisible(User user) {
        System.out.println("Setting post to visible on the site...");
        notifyUserPostSuccessful(user);
    }

    /**
     * Sends an error message to the user.
     * This method handles the case where the user's content validation fails.
     *
     * @param user The user who submitted the question.
     */
    public void sendErrorMessage(User user) {
        System.out.println("Sending error message to user...");
        // Logic to send an error message can be added here.
    }

    /**
     * Notifies the user that their post was successful.
     * This method provides feedback to the user.
     *
     * @param user The user who submitted the question.
     */
    public void notifyUserPostSuccessful(User user) {
        System.out.println("Notifying user their post was successful...");
        // Logic to notify the user can be added here.
    }
}
