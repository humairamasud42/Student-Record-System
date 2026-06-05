class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", CGPA: " + cgpa;
    }
}

