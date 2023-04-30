import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RatingService {

    public static void main(String[] args) {
        // code to run the application

        SurveyImplementation surveyImplementation = new SurveyImplementation();

        //Admin can create questions
        surveyImplementation.addQuestion(1,"How well your Interview went");
        surveyImplementation.addQuestion(2, "How would you like to rate yourself");

        //Admin can create options
        surveyImplementation.addOption(1,"VeryPoor",1,false);
        surveyImplementation.addOption(2,"Poor",2,false);
        surveyImplementation.addOption(3,"Average",3,false);
        surveyImplementation.addOption(4,"Good",4,false);
        surveyImplementation.addOption(5,"VeryGood",5,false);


        surveyImplementation.generateSurvey(surveyImplementation.getQuestionSet(),surveyImplementation.getOptionSet());


        //usert to call these functions







    }
}
