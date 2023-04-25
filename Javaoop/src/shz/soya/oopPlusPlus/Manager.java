package shz.soya.oopPlusPlus;

public class Manager extends Employee{
    private int manageExperiences;
    public Manager(String name,int age){
        super(name,age);
    }

    public int getManageExperiences() {
        return manageExperiences;
    }

    public void setManageExperiences(int manageExperiences) {
        this.manageExperiences = manageExperiences;
    }

    @Override
    public void work() {
        System.out.println("项目管理");
    }

    @Override
    public double callMoney(int days) {
        if (days>60){
            return 700*days;
        }
        return 800*days;
    }
}
