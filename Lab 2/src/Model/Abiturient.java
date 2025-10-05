package Model;

/**
 Клас для представлення абітурієнта.
 Містить інформацію: id, прізвище, ім'я, по батькові, адреса, телефон та середній бал.
 */
public class Abiturient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private double averageScore;

    /**
     Конструктор для створення абітурієнта.

     @param id          ідентифікатор абітурієнта
     @param lastName    прізвище
     @param firstName   ім'я
     @param middleName  по батькові
     @param address     адреса
     @param phone       телефон
     @param averageScore середній бал
     */
    public Abiturient(int id, String lastName, String firstName, String middleName,
                      String address, String phone, double averageScore) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.averageScore = averageScore;
    }

    // Методи доступу (get/set)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public double getAverageScore() { return averageScore; }
    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }

    /**
     Перетворює дані абітурієнта у рядок.

     @return рядок з даними абітурієнта
     */
    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", Прізвище='" + lastName + '\'' +
                ", Ім'я='" + firstName + '\'' +
                ", По батькові='" + middleName + '\'' +
                ", Адреса='" + address + '\'' +
                ", Телефон='" + phone + '\'' +
                ", Середній бал=" + averageScore +
                '}';
    }
}
