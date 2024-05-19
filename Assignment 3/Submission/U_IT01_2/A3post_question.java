// Class that shows the process for a user to post a question on CodeQA

public class UserPostQuestion {

    public static void main(String[] args) {
        UserPostQuestion postProcess = new UserPostQuestion();
        postProcess.start();
    }

    // Starts by creating a question object.
    // initiating the flow of creating and posting a question.
    public void start() {
        User user = new User("exampleUsername");
        Question question = new Question();

        // [1] user creates a question
        // the user sets the title and content for their question.
        question.setTitle(getTitle());
        question.setContent(getContent());

        // [2] system checks if the question is valid
        // to ensure it has a title and content.
        if (checkValidQuestion(question)) {
            // [3] user submits the question
            // If valid, the user submits the question.
            submitQuestion(user, question);

            // [4] system saves the question to the database.
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

    // user creates a question title.
    // returns a title for the question.
    private String getTitle() {
        System.out.println("What is the question title?");
        return "";
    }

    // user writing question content.
    // returns content for the question.
    private String getContent() {
        System.out.println("Write your question...");
        return "";
    }

    // checks if the question is valid.
    // is valid if it is not empty with title and content.
    private boolean checkValidQuestion(Question question) {
        System.out.println("Checking if the question is valid...");
        return question.getTitle() != null && !question.getTitle().isEmpty() &&
               question.getContent() != null && !question.getContent().isEmpty();
    }

    // user submitting the question.
    // prints the username and the question title being submitted.
    private void submitQuestion(User user, Question question) {
        System.out.println(user.getUsername() + " posting your question to the community - " + question.getTitle());
    }

    // saving the question in the database.
    // prints the title of the question being saved.
    private void saveQuestion(Question question) {
        System.out.println("Saving " + question.getTitle());
    }

    // confirms the question has been posted.
    // prints a confirmation message with the question title.
    private void confirmPosted(Question question) {
        System.out.println("Your question '" + question.getTitle() + "' has been posted!");
    }

    // prompts the user to edit their question if it is invalid.
    // prints a message prompting the user to edit their question.
    private void promptEditQuestion() {
        System.out.println("The question is not able to be posted. Please edit your question and try again.");
    }

    // class of the user's information.
    // holds the username of the user.
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

    // class of the question information.
    // holds the title and content of the question.
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