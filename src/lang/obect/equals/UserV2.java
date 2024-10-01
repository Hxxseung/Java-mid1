package lang.obect.equals;

public class UserV2 {
    private String id;

    public UserV2(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //다운캐스팅을 통해 obj아래의 id값을 꺼내올 수 있음.
        return id.equals(user.id);
    }
}
