package jun.junspring.domain;

public class Member {

    private Long id;    // pk로 저장할 id값
    private String name;   // 회원의 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
