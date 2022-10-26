public class Adult {
    int age;
    int height;
    String name;

    public Adult(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String theChildBecameAnAdult = "The child became an adult";
        return "Adult{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' + theChildBecameAnAdult+
                '}';
    }
}
