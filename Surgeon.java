
public class Surgeon extends Doctor{
    public boolean isOperating=false;
    public Surgeon(String name,int number,String speciality,boolean isOperating)
    {
        super(name, number,speciality);
        this.isOperating=isOperating;
    }
    public void work()
    {
        String str=name + " works for the Hospital."+name;
        if(this.isOperating)
        {
            str+=" is operating now";
        }
        else{
            str+="is not operating now";

        }
        System.out.println(str);
    }

    @Override
    public String toString() {
        return super.toString()+" Operating:"+this.isOperating;
    }
}