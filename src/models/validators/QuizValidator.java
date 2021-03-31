package models.validators;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import models.Quiz;
import utils.DBUtil;

public class QuizValidator {
    public static List<String> validate(Quiz q, Boolean codeDuplicateCheckFlag){
        List<String> errors =new ArrayList<String>();


        String code_error = validateCode(q.getCode(), codeDuplicateCheckFlag);
        if(!code_error.equals("")){
            errors.add(code_error);
        }


        String quiz_error = validateQuiz(q.getQuiz());
        if(!quiz_error.equals("")){
            errors.add(quiz_error);
        }

        String answer_error = validateAnswer(q.getAnswer());
        if(!answer_error.equals("")){
            errors.add(answer_error);
        }

        return errors;
    }


    //クイズ番号
    private static String validateCode(String code, Boolean codeDuplicateCheckFlag){
        if(code == null || code.equals("")){
            return "クイズ番号を入力してください。";
        }


        if(codeDuplicateCheckFlag){
            EntityManager em = DBUtil.createEntityManager();
            long quizes_count = (long)em.createNamedQuery("checkRegisteredCode",Long.class).setParameter("code", code).getSingleResult();
            em.close();
            if(quizes_count > 0){
                return"入力されたクイズ番号の情報は既に存在しています。";
            }
        }

        return "";
    }



    //クイズ
    private static String validateQuiz(String quiz){
        //クイズ内容必須入力チェック
        if(quiz == null || quiz.equals("")){
            return "クイズ内容を入力してください。";
        }

        return "";
    }

    private static String validateAnswer(String answer){
        if(answer == null || answer.equals("")){
            return "答えを設定してください。";
        }

        return "";
    }

}
