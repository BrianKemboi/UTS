package timetable.generator;

public class Unit {
    String unitTitle;
    String unitCode;
    double cf;
    String lecturer;
    public Unit(String title, String unitCode, double cf, String lecturer){
        this.unitTitle = title;
        this.unitCode = unitCode;
        this.cf = cf;
        this.lecturer = lecturer;

    }

    public String getUnitTitle() {
        return unitTitle;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public double getCf() {
        return cf;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setCf(double cf) {
        this.cf = cf;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}
