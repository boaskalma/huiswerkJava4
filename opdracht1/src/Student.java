public class Student {
    private int studentnummer;

    private String naam;

    private int leeftijd;

    private String geslacht; //toegestane waarden M m V v

    private boolean NextPop = false;

    public Student(String naam, int nummer, int leeftijd, String geslacht) {
        this.leeftijd = leeftijd;
        this.naam = naam;
        this.geslacht = geslacht;
        this.studentnummer = nummer;

    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setGeslacht(String geslacht) {
        if (geslacht == "V" || geslacht == "v" || geslacht == "m" || geslacht == "M") {
            this.geslacht = geslacht;
        }
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void printStudent() {
        System.out.println("");
        System.out.println("naam: " + naam);
        System.out.println("nummer: " + studentnummer);
        System.out.println("leeftijd: " + leeftijd);
        System.out.println("geslacht: " + geslacht);

    }

    public String toString() {
        String output = "naam: " + naam + ", nummer" + studentnummer + ", leeftijd: " + leeftijd + ", geslacht: " + geslacht;
        return output;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public String getNaam() {
        return naam;
    }

    public void setNextPop(boolean nextPop) {
        NextPop = nextPop;
    }

    public boolean isNextPop() {
        return NextPop;
    }
}
