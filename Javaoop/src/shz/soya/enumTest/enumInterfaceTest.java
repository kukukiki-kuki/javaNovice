package shz.soya.enumTest;

public enum enumInterfaceTest implements enumInterface{
    MONDAY("星期一","忙碌的一天"){
       public void show(){
            System.out.println(MONDAY.dayDes);
        }
    },
    TUESDAY("星期二","忙碌的第二天"){
        public void show(){
            System.out.println(TUESDAY.dayDes);
        }
    },
    WEDNESDAY("星期三","忙碌的第三天"){
        public void show(){
            System.out.println(WEDNESDAY.dayDes);
        }
    },
    THURSDAY("星期四","忙碌的第四天"){
        public void show(){
            System.out.println(THURSDAY.dayDes);
        }
    },
    FRIDAY("星期五","忙碌的第五天"){
        public void show(){
            System.out.println(FRIDAY.dayDes);
        }
    },
    SATURDAY("星期六","快活的第二天"){
        public void show(){
            System.out.println(SATURDAY.dayDes);
        }
    },
    SUNDAY("星期日","快活的第二天"){
        public void show(){
            System.out.println(SUNDAY.dayDes);
        }
    };

    private final String dayName;
    private final String dayDes;
    enumInterfaceTest(String dayName,String dayDes){
        this.dayName = dayName;
        this.dayDes = dayDes;
    }

}
