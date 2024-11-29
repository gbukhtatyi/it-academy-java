package homework8;

public class Man {
    public static final String GENDER_MAN = "man";
    public static final String GENDER_WOMAN = "woman";

    protected String name;
    protected int age;
    protected String gender;
    protected float weight;

    public Man(
            String inputName,
            int inputAge,
            String inputGender,
            float inputWeight
    ) {
        name = inputName;
        age = inputAge;
        gender = inputGender;
        weight = inputWeight;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Weight: " + weight);
    }

    public void setName(String value) {
        name = value;
    }

    public void setAge(int value) {
        age = value;
    }

    public void setWeight(float value) {
        weight = value;
    }
}
