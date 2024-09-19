public class RectangleMain {
    public static void main(String[]args)//main method
    {
        Rectangle R=new Rectangle(2,3);//object creation and pass the parameters
        System.out.println("Area is:"+R.getArea());//after execution print the getArea method result
        System.out.println("Perimeter is:"+R.getPerimeter());//after execution print the getperimeter method result
        System.out.println("Rectangle length is:"+R.getDisplay());//after execution print the getDisplay method result
        System.out.println("Rectangle width is:"+R.getDisplay1());//after execution print the getDisplay1 method result

        R.setSquare(1,1);//modify the length and width values
        System.out.println("square of length and width is:"+R.getSquare());//print the setvalue

        Rectangle R1=new Rectangle(5,2);
        System.out.println("Area is:"+R1.getArea());
        System.out.println("Perimeter is:"+R1.getPerimeter());
        System.out.println("Rectangle length is:"+R1.getDisplay());
        System.out.println("Rectangle width is:"+R1.getDisplay1());
    }
}
