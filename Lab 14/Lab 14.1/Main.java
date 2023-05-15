public class Main {
    public static void main (String[] args){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer nam = new SoccerPlayer("Nam");
//        Team <FootballPlayer>sgFC = new Team<>("SG FC");
//        sgFC.addPlayer(pat);
//        sgFC.addPlayer(nam);
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(nam);
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer bank = new FootballPlayer("Gordon");
//        Team<FootballPlayer> hawhorn = new Team<>("Hawhorn");
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//        hawhorn.matchResult(fremantle, 1, 0);
//        hawhorn.matchResult(sgFC, 3 ,8);
//        sgFC.matchResult(fremantle, 2, 1);
//        sgFC.matchResult(hawhorn, 1, 4);
        System.out.println("Ranking");
//        System.out.println(sgFC.getName() + ": " + sgFC.ranking());
//        System.out.println(melbourne.getName() + ": " +melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(sgFC.compareTo(melbourne));
//        System.out.println(sgFC.compareTo(fremantle));
//        System.out.println(melbourne.compareTo(fremantle));
        League<Team<FootballPlayer>>footballLeague = new League<>("AFC");
        Team<FootballPlayer> hawhorn = new Team<>("Hawhorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team <FootballPlayer>sgFC = new Team<>("SG FC");
        hawhorn.matchResult(fremantle, 1, 0);
        hawhorn.matchResult(sgFC, 3 ,8);
        sgFC.matchResult(fremantle, 2, 1);
        sgFC.matchResult(hawhorn, 1, 4);
        footballLeague.add(hawhorn);
        footballLeague.add(fremantle);
        footballLeague.add(melbourne);
        footballLeague.add(sgFC);
        footballLeague.showLeagueTable();

    }
}
