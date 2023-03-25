public class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee(String name, int number) {
        this.name = name;
        this.number = number;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " works for the Hospital.");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.name+"  "+this.number;
    }
}




