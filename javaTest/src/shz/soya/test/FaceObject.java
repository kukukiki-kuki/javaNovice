package shz.soya.test;

public class FaceObject {
    private Integer age;
    private String name;
    public FaceObject() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FaceObject{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
