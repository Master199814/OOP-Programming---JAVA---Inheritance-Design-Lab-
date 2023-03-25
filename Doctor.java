
public class Doctor extends HospitalEmployee{
    public String speciality;

    public Doctor(String name,int number,String speciality)
    {
        super(name,number);
        this.speciality=speciality;

    }
    public void work()
    {
        System.out.println(name + " works for the Hospital."+name+" is an "+this.speciality+" doctor.");
    }

    @Override
    public String toString() {
        return super.toString()+" "+this.speciality;
    }
}
