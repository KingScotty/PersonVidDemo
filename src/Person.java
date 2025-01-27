public class Person {
    private String ID;
    private String firstname;
    private String lastname;
    private int YOB;

    public Person(String ID, String firstname, String lastname, int YOB) {
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.YOB = YOB;

    }
//getter and setter methods
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //tostring method

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", YOB=" + YOB +
                '}';
    }
}