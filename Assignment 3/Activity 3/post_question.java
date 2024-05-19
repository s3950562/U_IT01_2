// Class that shows the process for a user to post a question on CodeQA

public class UserPostQuestion {

    public static void main(String[] args) {
        UserPostQuestion postProcess = new UserPostQuestion();
        postProcess.start();
    }

    // Starts the post question process by creating a question object.
    // This method initiates the flow of creating and posting a question.
    public void start() {
        User user = new User("exampleUsername");
        Question question = new Question();

        // [1] User creates a question
        // Here, the user sets the title and content for their question.
        question.setTitle(getTitle());
        question.setContent(getContent());

        // [2] System checks if the question is valid
        // The system validates the question to ensure it has a title and content.
        if (checkValidQuestion(question)) {
            // [3] User submits the question
            // If valid, the user submits the question.
            submitQuestion(user, question);

            // [4] System saves the question
            // The system saves the question to the database.
            saveQuestion(question);

            // [5] System confirms the question is posted
            // The system confirms that the question has been posted successfully.
            confirmPosted(question);
        } else {
            // If the question is invalid, prompt the user to edit it
            // If the question is invalid, the user is prompted to make corrections.
            promptEditQuestion();
        }
    }

    // Simulates the user creating a question title.
    // This method returns a placeholder title for the question.
    private String getTitle() {
        System.out.println("What is the question title?");
        return "Example Question Title";
    }

    // Simulates the user creating question content.
    // This method returns a placeholder content for the question.
    private String getContent() {
        System.out.println("Write your question...");
        return "This is an example question content.";
    }

    // Checks if the question is valid.
    // A question is valid if it has a non-empty title and content.
    private boolean checkValidQuestion(Question question) {
        System.out.println("Checking if the question is valid...");
        return question.getTitle() != null && !question.getTitle().isEmpty() &&
               question.getContent() != null && !question.getContent().isEmpty();
    }

    // Simulates the user submitting the question.
    // This method prints the username and the question title being submitted.
    private void submitQuestion(User user, Question question) {
        System.out.println(user.getUsername() + " submits the question: " + question.getTitle());
    }

    // Simulates saving the question in the database.
    // This method prints the title of the question being saved.
    private void saveQuestion(Question question) {
        System.out.println("Saving the question: " + question.getTitle());
    }

    // Confirms that the question has been posted.
    // This method prints a confirmation message with the question title.
    private void confirmPosted(Question question) {
        System.out.println("Your question '" + question.getTitle() + "' has been posted!");
    }

    // Prompts the user to edit their question if it is invalid.
    // This method prints a message prompting the user to edit their question.
    private void promptEditQuestion() {
        System.out.println("The question is invalid. Please edit your question and try again.");
    }

    // Class representing the user's information.
    // This class holds the username of the user.
    class User {
        private String username;

        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    // Class representing the question information.
    // This class holds the title and content of the question.
    class Question {
        private String title;
        private String content;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}