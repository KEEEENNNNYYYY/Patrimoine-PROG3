package HEI.entity;

import HEI.model.Possession;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String name;
    private LocalDate birthDate;
    private Possession assets;

    public Student(Possession assets, LocalDate birthDate, String name) {
        this.assets = assets;
        this.birthDate = birthDate;
        this.name = name;
    }

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Possession getAssets() {
        return assets;
    }

    public void setAssets(Possession assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "" +
                "assets=" + assets +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;y
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthDate, student.birthDate) && Objects.equals(assets, student.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, assets);
    }
}
