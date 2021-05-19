public class Basketbalbond extends Scoresheet{

    public Basketbalbond(String teamThuis, String teamUit, Integer scoreThuis, Integer scoreUit, String datum, String scheidsrechter1, String scheidsrechter2){
        super(teamThuis, teamUit, scoreThuis, scoreUit, datum, scheidsrechter1, scheidsrechter2);
    }

    public void checkSheet(){
        System.out.println("Datum van de wedstrijd: " + getDatum());
        System.out.printf("Team: %20s %20s%n %25s %21s%nScore: %17d %21d%nUitgespeeld: %10s%n", "Thuis", "Uit", getTeamThuis(), getTeamUit(), getScoreThuis(), getScoreUit(), "(Hier wordt Ja of Nee ingevuld)");
        System.out.println("Scheidsrechters: " + getScheidsrechter1() + " & " + getScheidsrechter2());
        System.out.println("Overlast van toeschouwers? : (Hier wordt Ja of Nee ingevuld door de scheidsrechter");
    }
}
