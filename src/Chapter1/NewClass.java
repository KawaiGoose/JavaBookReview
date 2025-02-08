package Chapter1;

public class NewClass {
    //Data Type + 变量
    public int hour = 0;
    public String friend = "WeiWei";
    public String coffee = "卡布奇诺";

    //构造器
    public NewClass(int hour, String friend){
        //用于初始化变量，相当于传参，但是这里不需要
        this.hour = hour;
        this.friend = friend;
    }

    //方法
    public void wakeUP(int hour){
        System.out.println("我在" + hour + "起床了");
    }
    public void takeWalk(String friend){ //传入的参数也要声明Data Type很重要！
        System.out.println("我和" + friend + "一起上学");
    }

    public void drinkCoffee(){
        System.out.print("我喝咖啡并开始coding");
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass(10, "Jenny");

        newClass.drinkCoffee();
        newClass.wakeUP(8);
        newClass.takeWalk("拉维斯");
        String a = newClass.coffee;
        System.out.println(a);

    }
}
