package shz.soya.oop;

public class Student {
    private Integer age;
    private String name;
    private String address;
    private Integer id;
    private String phone;
    private MyData myData;

    public Student(Integer age, String name, String address, Integer id, String phone) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.id = id;
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void  Study(){
        System.out.println("学习中.....");
    }
}
