public class Website extends Scoresheet{

    public Website(String teamThuis, String teamUit, Integer scoreThuis, Integer scoreUit, String datum, String scheidsrechter1, String scheidsrechter2){
        super(teamThuis, teamUit, scoreThuis, scoreUit, datum, scheidsrechter1, scheidsrechter2);
    }

    public void printUitslag(){
        System.out.printf("Datum: %s%n Uitslag: %3s %d %s %d %2s",getDatum(), getTeamThuis(), getScoreThuis(), "-", getScoreUit(), getTeamUit());
    }
}
