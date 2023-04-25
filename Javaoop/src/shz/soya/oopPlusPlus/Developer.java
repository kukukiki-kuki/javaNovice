package shz.soya.oopPlusPlus;

public class Developer extends Employee{
    private int workExperiences;
    public Developer(String name,int age){
        super(name,age);

    }

    public int getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(int workExperiences) {
        this.workExperiences = workExperiences;
    }

    @Override
    public void work() {
        System.out.println("开发项目");
    }

    @Override
    public double callMoney(int days) {
        if (days>60){
            return 400*days;
        }
        return 500*days;
    }


}
