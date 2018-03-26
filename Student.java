public class Student {

    private  String name, sex , system;
    private float english, chinese, math;

    public Student(String name1,String sex1,String system1,float chinese1,float math1,float english1){
        name=name1;
        sex=sex1;
        system=system1;
        chinese=chinese1;
        math=math1;
        english=english1;
    }
    public String getName(){return name;}
    public String getSex(){return sex;}
    public String getSystem(){return system;}
    public float getChinese(){return chinese;}
    public float getMath(){return math;}
    public float getEnglish(){return english;}
    public void showAll(){
        System.out.println("姓名:"+this.getName());
        System.out.println("性別:"+this.getSex());
        System.out.println("系級:"+this.getSystem());
        System.out.println("國文:"+this.getChinese());
        System.out.println("數學:"+this.getMath());
        System.out.println("英文:"+this.getEnglish());
        }
}