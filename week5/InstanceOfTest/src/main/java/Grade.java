enum Grade {FRESH(1),SOPHOMORE(2),JUNIOR(3),SENIOR(4);
    private int grade;
    Grade(int grade){
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void upGrade() {
        if (grade != SENIOR.getGrade()) grade++;
    }

    @Override
    public String toString() {
        return this.name();
    }
// override hashCode() and equals()
}
