package Chapter1;

//测试是否能完整写一个Class。
//成员变量，可赋值可不赋值；———>不赋值就等着构造器用户给我值。
//构造器，将用户输入的值（局部变量）传入上述成员变量；
//方法，可返回值可不返回值，可吸收成员变量可不吸收成员变量；———>不吸收参数就拿着构造器的this.成员变量给我呗。
public class B_NewClass {
    //Data Type + 变量
    public int hour = 0; // 不赋值也可以，反正早晚也会被构造器给覆盖
    public String friend = "WeiWei"; // 赋值了也打印不出来
    public String coffee = "卡布奇诺"; //没被构造器覆盖的，最原始的变量赋值的使用

    //构造器
    public B_NewClass(int hour, String friend){
        //用于初始化变量，相当于传参，但是这里不需要
        this.hour = hour;
        this.friend = friend;
    }

    //方法
    public void wakeUP(){
        System.out.println("我在" + this.hour + "点起床了");
    } // 方法不吸收成员变量，直接用this
    public void takeWalk(String friend){ //传入的参数也要声明Data Type很重要！
        System.out.println("我和" + friend + "一起上学");
    } // 方法吸收成员变量

    public void drinkCoffee(){
        System.out.println("我喝" + coffee + "并开始coding");
    }

    public static void main(String[] args) {
        B_NewClass newClass = new B_NewClass(10, "Jenny");

        newClass.drinkCoffee();
        newClass.wakeUP();
        newClass.takeWalk("拉维斯");
        String a = newClass.coffee;
        System.out.println(a);

    }
}
