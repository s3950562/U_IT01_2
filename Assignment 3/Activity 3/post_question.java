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

        // [1] user creates a question
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
    private String getTitle() {
        System.out.println("What is the question title?");
        // Returning a placeholder for user input
        return "";
    }

    // Simulates the user creating question content.
    private String getContent() {
        System.out.println("Write your question...");
        // Returning a placeholder for user input
        return "";
    }

    // Checks if the question is valid.
    private boolean checkValidQuestion(Question question) {
        System.out.println("Checking if the question is valid...");
        // Validation logic = is valid if it has a non-empty title and content
        return question.getTitle() != null && !question.getTitle().isEmpty() &&
               question.getContent() != null && !question.getContent().isEmpty();
    }

    // Simulates the user submitting the question.
    private void submitQuestion(User user, Question question) {
        System.out.println(user.getUsername() + " submits the question: " + question.getTitle());
    }

    // Simulates saving the question in the database.
    private void saveQuestion(Question question) {
        System.out.println("Saving the question: " + question.getTitle());
        // Placeholder for actual save logic
    }

    // Confirms that the question has been posted.
    private void confirmPosted(Question question) {
        System.out.println("Your question '" + question.getTitle() + "' has been posted!");
    }

    // Prompts the user to edit their question if it is invalid.
    private void promptEditQuestion() {
        System.out.println("The question is invalid. Please edit your question and try again.");
    }

    // Class of the user's information.
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

    // Class of the question information.
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
