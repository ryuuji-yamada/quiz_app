package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name = "quizes")
@NamedNativeQuery(
            name ="getQuizesRandom",
            query ="select*from quizes order by rand() limit 5 ",
            resultClass=Quiz.class
)
@NamedQueries({
    @NamedQuery(
            name = "getAllQuizes",
            query = "SELECT q FROM Quiz AS q ORDER BY q.id DESC"
    ),
    @NamedQuery(
            name = "getQuizesCount",
            query = "SELECT COUNT(q) FROM Quiz AS q"
    ),
    @NamedQuery(
            name = "checkRegisteredCode",
            query = "SELECT COUNT (q) FROM Quiz AS q WHERE q.code = :code"
            )
})
@Entity
public class Quiz {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "code", nullable = false, unique = true)
    private String code;


    @Column(name = "quiz", length = 255, nullable = false )
    private String quiz;


    @Column(name = "answer", nullable = false)
    private String answer;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getQuiz() {
        return quiz;
    }


    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }


    public String getAnswer() {
        return answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
