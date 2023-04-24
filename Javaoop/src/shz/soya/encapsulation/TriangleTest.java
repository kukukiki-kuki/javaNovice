package shz.soya.encapsulation;

public class TriangleTest{
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.showNum();

    }
}

    //smartphone：智能手机
    class SmartPhone extends Phone{
        public SmartPhone(String s){
            super(s);
            System.out.println(s);
        }
        public SmartPhone(){
           this("李守俨");
        }

        //重写父类的来电显示功能的方法
        public void showNum(){
            //来电显示姓名和图片功能
            System.out.println("显示来电姓名");
            System.out.println("显示头像");

            //保留父类来电显示号码的功能
            super.showNum();//此处必须加super.，否则就是无限递归，那么就会栈内存溢出
        }
    }


