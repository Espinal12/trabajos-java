public class SoccerPlayers {
    static class SoccerPlayer {
        private String name;
            private int age;
         private String position;
         private String team;
                private int goalsScored;

        public SoccerPlayer(String name, int age, String position, String team, int goalsScored) {
                this.name = name;
             this.age = age;
            this.position = position;

            this.team = team;
            this.goalsScored = goalsScored;
        }

        public void scoreGoal() {
            this.goalsScored++;
            System.out.println(this.name + " has scored! Total goals: " + this.goalsScored);
        }



        public void transfer(String newTeam) {
            System.out.println(this.name + " is transferring from " + this.team + " to " + newTeam);
            this.team = newTeam;
        }



        public void setName(String name) {
            this.name = name;
        }



        public void setGoalsScored(int goalsScored) {
            this.goalsScored = goalsScored;
        }



        public void displayInfo() {
            System.out.println("Name: " + this.name + ", Age: " + this.age + ", Position: " + this.position + ", Team: " + this.team + ", Goals Scored: " + this.goalsScored);
        }


    }

    public static void main(String[] args) {

        SoccerPlayer messi = new SoccerPlayer("Messi", 34, "Forward", "Barcelona", 650);

        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo", 36, "Forward", "Juventus", 700);


        messi.scoreGoal();

        ronaldo.scoreGoal();

        messi.transfer("PSG");

        ronaldo.transfer("Manchester United");

        messi.displayInfo();

        ronaldo.displayInfo();
    }
}
