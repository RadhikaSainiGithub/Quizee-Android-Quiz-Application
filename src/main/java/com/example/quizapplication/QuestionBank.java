package com.example.quizapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionsList> javaQuestions()
    {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of int variable","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?","6","7","8","9","8","");
        final QuestionsList question3 = new QuestionsList("What is the size of float and double in java?","32 and 64","32 and 32","64 and 64","64 and 32","32 and 64","");
        final QuestionsList question4 = new QuestionsList("Arrays in java are- ","Object references","Objects","Primitive data type","None","Objects","");
        final QuestionsList question5 = new QuestionsList("When is the object created with new keyword?","At run time","At compile time","Depends on the code","None","At run time","");
        final QuestionsList question6 = new QuestionsList("compareTo() returns","True","False","An int value","None","An int value","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    private static List<QuestionsList> phpQuestions()
    {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of int variable","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?","6","7","8","9","8","");
        final QuestionsList question3 = new QuestionsList("What is the size of float and double in java?","32 and 64","32 and 32","64 and 64","64 and 32","32 and 64","");
        final QuestionsList question4 = new QuestionsList("Arrays in java are- ","Object references","Objects","Primitive data type","None","Objects","");
        final QuestionsList question5 = new QuestionsList("When is the object created with new keyword?","At run time","At compile time","Depends on the code","None","At run time","");
        final QuestionsList question6 = new QuestionsList("compareTo() returns","True","False","An int value","None","An int value","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions()
    {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of int variable","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?","6","7","8","9","8","");
        final QuestionsList question3 = new QuestionsList("What is the size of float and double in java?","32 and 64","32 and 32","64 and 64","64 and 32","32 and 64","");
        final QuestionsList question4 = new QuestionsList("Arrays in java are- ","Object references","Objects","Primitive data type","None","Objects","");
        final QuestionsList question5 = new QuestionsList("When is the object created with new keyword?","At run time","At compile time","Depends on the code","None","At run time","");
        final QuestionsList question6 = new QuestionsList("compareTo() returns","True","False","An int value","None","An int value","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions()
    {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of int variable","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionsList question2 = new QuestionsList("Number of primitive data types in Java are?","6","7","8","9","8","");
        final QuestionsList question3 = new QuestionsList("What is the size of float and double in java?","32 and 64","32 and 32","64 and 64","64 and 32","32 and 64","");
        final QuestionsList question4 = new QuestionsList("Arrays in java are- ","Object references","Objects","Primitive data type","None","Objects","");
        final QuestionsList question5 = new QuestionsList("When is the object created with new keyword?","At run time","At compile time","Depends on the code","None","At run time","");
        final QuestionsList question6 = new QuestionsList("compareTo() returns","True","False","An int value","None","An int value","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName)
    {
        switch(selectedTopicName)
        {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
