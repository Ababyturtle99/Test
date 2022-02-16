/**
 * TODO: Complete the solution for Student
 */
import java.util.Objects;

import org.omg.CORBA.Object;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final String PID;

    public Student(String firstName, String lastName, String PID) {
        if(firstName == null || lastName == null || PID == null) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.PID = PID;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPID() {
        return this.PID;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student && o != null) {
            if(this.PID.equals(((Student)o).PID)) {
                if(this.firstName.equals(((Student)o).firstName)) {
                    if(this.lastName.equals(((Student)o).lastName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.PID);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
