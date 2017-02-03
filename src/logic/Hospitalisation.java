package logic;

import java.time.LocalDate;

/**
 * Created by plizz on 22.12.2016.
 */
public class Hospitalisation {

    private LocalDate from;
    private LocalDate to;
    private String diagnosis;
    private Department department;
    public Hospitalisation() {
        this.from = LocalDate.now();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
