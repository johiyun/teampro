package DCS.DCSspring.Domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Article {
    private Long articleid;
    private String title;
    private String content;

    private LocalDate deadline_date;
    private LocalTime deadline_time;

    public Long getarticleId() {
        return articleid;
    }

    public void setarticleId(Long articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDate date){
        deadline_date = date;
    }

    public void setTime(LocalTime time){
        deadline_time = time;
    }
    public LocalDate getDate(){
        return deadline_date;
    }

    public LocalTime getTime(){
        return deadline_time;
    }
}
