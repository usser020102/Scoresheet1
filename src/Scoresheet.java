import java.util.Scanner;

public class Scoresheet {
    private String teamThuis;
    private String teamUit;
    private Integer scoreThuis;
    private Integer scoreUit;
    private String datum;
    private String scheidsrechter1;
    private String scheidsrechter2;
    Scanner scanner = new Scanner(System.in);

    public Scoresheet(String teamThuis, String teamUit, Integer scoreThuis, Integer scoreUit, String datum, String scheidsrechter1, String scheidsrechter2){
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
        this.scoreThuis = scoreThuis;
        this.scoreUit = scoreUit;
        this.datum = datum;
        this.scheidsrechter1 = scheidsrechter1;
        this.scheidsrechter2 = scheidsrechter2;
    }

    public void verstuurScore() {
        String keuze = scanner.nextLine();
        System.out.println("Wil je op het website plaatsen of naar de basketbalbond versturen (Kies 'W' voor website en 'B' voor basketbalbond?");
        if(keuze.equals("W")) {
            System.out.print("Voer hier de datum van de wedstrijd in: ");
            datum = scanner.nextLine();
            System.out.print("Voer hier het thuis team in: ");
            teamThuis = scanner.nextLine();
            System.out.print("Voer hier het uit team in: ");
            teamUit = scanner.nextLine();
            System.out.print("Voer hier de uitslag van het thuis team: ");
            scoreThuis = scanner.nextInt();
            System.out.print("Voer hier de uitslag van het uit team: ");
            scoreUit = scanner.nextInt();
            System.out.println("Succesvol geplaatst!");
        }
        if(keuze.equals("B")){
            System.out.print("Voer hier de datum van de wedstrijd in: ");
            datum = scanner.nextLine();
            System.out.print("Voer hier het thuis team in: ");
            teamThuis = scanner.nextLine();
            System.out.print("Voer hier het uit team in: ");
            teamUit = scanner.nextLine();
            System.out.print("Voer hier de uitslag van het thuis team: ");
            scoreThuis = scanner.nextInt();
            System.out.print("Voer hier de uitslag van het uit team: ");
            scoreUit = scanner.nextInt();
            System.out.print("Voer hier de 1e scheidsrechter in: ");
            scheidsrechter1 = scanner.nextLine();
            System.out.print("Voer hier de 2e scheidsrechter in: ");
            scheidsrechter2 = scanner.nextLine();
            System.out.print("Was er overlast van de toeschouwers?: ");
            String antw =  scanner.nextLine();
        }
    }

    public String getTeamThuis() {
        return teamThuis;
    }

    public String getTeamUit() {
        return teamUit;
    }

    public Integer getScoreThuis() {
        return scoreThuis;
    }

    public Integer getScoreUit() {
        return scoreUit;
    }

    public String getDatum() {
        return datum;
    }

    public String getScheidsrechter1() {
        return scheidsrechter1;
    }

    public String getScheidsrechter2() {
        return scheidsrechter2;
    }
}

