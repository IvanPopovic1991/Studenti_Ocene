public class Student {
    private String ime,prezime;
    private int ocena;

    public Student(String ime, String prezime, int ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocena = ocena;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getOcena() {
        return ocena;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocena='" + ocena + '\'' +
                '}';
    }
}
