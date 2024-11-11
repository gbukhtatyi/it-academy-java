package homework8;

public class Student extends Man {
    int studyingYear;

    public Student(
            String name,
            int age,
            String gender,
            float weight,
            int year
    ) {
        super(name, age, gender, weight);

        studyingYear = year;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Studying year: " + studyingYear);
    }

    public int getStudyingYear() {
        return studyingYear;
    }

    public void setStudyingYear(int year) {
        studyingYear = year;
    }

    public void increaseStudyingYear() {
        studyingYear++;
    }
}
