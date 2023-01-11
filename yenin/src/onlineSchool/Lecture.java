package onlineSchool;

public class Lecture {
    private int id;
    private int personId;
    private String name;
    private String description;
    private Homework homework;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Lecture() {
    }
    public  static Homework[] homeworkArray;

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(int id, int personId) {
        this.id = id;
        this.personId = personId;
    }

    public Lecture(int id, String name, Homework homework) {
        this.id = id;
        this.name = name;
        int h = 0;
        for (int i =0;i< homeworkArray.length; i++){
            if (homeworkArray[i] != null){
                h++;
            }
        }
        this.homeworkArray[h] = homework;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
