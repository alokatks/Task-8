public class Question {
    String question;
    String[] options;
    int correctOption; // index: 0, 1, 2, 3

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
//method to display question
    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctOption + 1;
    }
}
