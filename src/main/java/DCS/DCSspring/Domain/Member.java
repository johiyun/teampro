package DCS.DCSspring.Domain;

public class Member {
    private Long id;
    private String email;
    private String name;
    private int major; //1 = 컴공, 2 = 기공, 3 = 화공 등등...
    private String password;
    private Rating rating;

    public String getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(String chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    private String chatRoomId = null;

    public Member(){
        rating = new Rating();
    }

    public Rating getRating() {
        return rating;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private int grade;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
