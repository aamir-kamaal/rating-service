import java.util.Objects;
import java.util.Set;

public class Question {

    int quesId;
    String question;
    //Set<Option> opSet;

    public Question(int quesId, String question) {
        this.quesId = quesId;
        this.question = question;
    }

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return '\n' + quesId +
                ". " + question + " ?" + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return quesId == question.quesId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quesId);
    }
}
