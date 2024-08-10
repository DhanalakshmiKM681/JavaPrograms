class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        user2 u=new user2();//object creation
        System.out.println(u.name + ":" +u.age + ":" +u.gender);//null:0:null
        u.age=20;//assign age to user
        u.name="nikhil";//assign name to user
        u.gender="male";//assign gender
        System.out.println(u.name + ":" +u.age + ":" +u.gender);//nikhil:20:male
    }
}
