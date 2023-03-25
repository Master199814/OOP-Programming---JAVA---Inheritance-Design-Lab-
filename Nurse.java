public class Nurse extends  HospitalEmployee{
    public int numOfPatients;
    public Nurse(String name,int number,int numOfPatients){
        super(name,number);
        this.numOfPatients=numOfPatients;


    }
    public void work() {
        System.out.println(name + " works for the Hospital."+name +" is a nurse with "+numOfPatients+" patients.");
    }

    @Override
    public String toString() {
        return super.toString()+" has "+this.numOfPatients+" Patients";
    }
}