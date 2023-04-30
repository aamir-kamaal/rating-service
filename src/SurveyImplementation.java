import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SurveyImplementation {

    Set<Option> opSet = new HashSet<>();

    Set<Question> questionSet = new HashSet<>();

    public void addQuestion(int id,String question){

        Question q1 = new Question(id,question);
        questionSet.add(q1);

    }

    public void removeAllQuestion()
    {
        if(questionSet.isEmpty())
            System.out.println("All questions cleared from survey");
    }

    public void removeQuestion(int id)
    {
        Iterator i = questionSet.iterator();
        while (i.hasNext())
        {
            Question q = (Question) i.next();
            if(q.getQuesId() == id)
                i.remove();
        }
    }

    public Set<Question> getQuestionSet()
    {
        return questionSet;
    }

    public Set<Option> addOption(int id,String option, int optionWeightage,boolean isCorrect){
        Option op1 = new Option(id,option,optionWeightage,isCorrect);
        opSet.add(op1);
       /* Collections.sort(opSet, new Comparator<Option>()
        {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.getOptId() < o2.getOptId() ? 1 : -1;
            }

        });*/

        return opSet;
    }

    public Set<Option> getOptionSet()
    {
        return opSet;
    }

    public void generateSurvey(Set<Question> questionSet,Set<Option> optionSet)
    {
        Map<Question,Set<Option>> surveyMap = new HashMap<>();
        questionSet.forEach(q -> surveyMap.put(q,optionSet));
        Survey s = new Survey(surveyMap);
        s.printSurvey();
    }
}
