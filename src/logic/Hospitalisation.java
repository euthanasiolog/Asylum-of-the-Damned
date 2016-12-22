package logic;

import java.time.LocalDate;

/**
 * Created by plizz on 22.12.2016.
 */
public class Hospitalisation {

    private LocalDate from;
    private LocalDate to;
    private String diagnosis;

    public Hospitalisation(LocalDate from, LocalDate to, String diagnosis) {
        this.from = from;
        this.to = to;
        this.diagnosis = diagnosis;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
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
