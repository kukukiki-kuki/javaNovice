package shz.soya.oopPlus;

public class InterviewTest2 {
    //getXxx()和setXxx()声明在哪个类中，内部操作的属性就是哪个类里的。

    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//尚硅谷
        s.test();//尚硅谷  atguigu
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//大硅谷
        s.test();//大硅谷  atguigu
        }
    }

    class Father {
        private String info = "atguigu";

        public void setInfo(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }

    class Son extends Father {
        private String info = "尚硅谷";

        public void setInfo(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }

        public void test() {
            System.out.println(this.getInfo());
            System.out.println(super.getInfo());
        }
    }