import java.util.List;
import java.util.Map;
import java.util.Set;

public class Survey {

    Map<Question,Set<Option>> survey;


    public Survey(Map<Question, Set<Option>> survey) {
        this.survey = survey;
    }

    public Map<Question,Set<Option>> getSurvey() {
        return survey;
    }

    public void printSurvey()
    {
        this.survey.forEach((q,o) -> {
            System.out.print(q.toString());
            o.forEach(System.out::print);
        });
    }
}

