public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name,String gender,int age)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getName() {
        return this.name;
    }
        public int getAge()
    {
        return age;
    }
        public String getGender()
        {
            return gender;
        }
}
