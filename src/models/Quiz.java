package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name = "quizes")
@NamedQueries({
    @NamedQuery(
            name = "getAllQuizes",
            query = "SELECT q FROM Quiz AS q ORDER BY q.id DESC"
    ),
    @NamedQuery(
            name = "getQuizesCount",
            query = "SELECT COUNT(q) FROM Quiz AS q"
    )
})
@Entity
public class Quiz {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


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


    public String getQuiz() {
        return quiz;
    }


    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }


    public String getAnswer() {
        return answer;
    }


    public void setAnswer_s(String answer) {
        this.answer = answer;
    }


}
