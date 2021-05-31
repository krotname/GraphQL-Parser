package name.krot;

public class TestEntity {

    // {data={product=[{name=Василиск, color=Белый, created_at=2020-02-02T00:00:00+00:00, secret=false}, {name=Falcon Heavy, color=Белый, created_at=2021-02-02T00:00:00+00:00, secret=false}]}}
    private  String color;
    private  String name;
    private  String created_at;
    private  String secret;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public TestEntity(String color, String name, String created_at, String secret) {
        this.color = color;
        this.name = name;
        this.created_at = created_at;
        this.secret = secret;
    }
}
