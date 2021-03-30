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


    @Column(name = "answer_s", nullable = true)
    private String answer_s;


    @Column(name = "answer_i", nullable = true)
    private Integer answer_i;


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


    public String getAnswer_s() {
        return answer_s;
    }


    public void setAnswer_s(String answer_s) {
        this.answer_s = answer_s;
    }


    public Integer getAnswer_i() {
        return answer_i;
    }


    public void setAnswer_i(Integer answer_i) {
        this.answer_i = answer_i;
    }


}
