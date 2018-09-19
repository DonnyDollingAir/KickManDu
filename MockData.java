package com.example.kom.kickermanager3000;


public class MockData {

    static class Manager{

        Manager(String name,String stats){

            managerName = name;
            statistics = stats;

        }

        String managerName;
        String statistics;

    }


    public static class Challenge{

        Challenge(String state, String mode, Manager challenger, Manager participant, String scores){

            this.state = state;
            this.mode = mode;
            this.challenger = challenger;
            this.participant = participant;
            this.score = scores;

    }

        String state;
        String mode;
        Manager challenger;
        Manager participant;
        String score;

    }


    public static Challenge[] getChallenges(){


        Manager currentChallenger = new Manager("Swenno", "individual stats A");
        Manager currentParticipant = new Manager("Benno", "individual stats B");
        Manager anotherParticipant = new Manager("Rrrrruuudiii", "individual stats c");
        Challenge[] challenges = new Challenge[3];
        challenges[0] = new Challenge("ready","simple duell mode", currentChallenger, currentParticipant, "3-4-2-1-3");
        challenges[1] = new Challenge("on_hold","simple duell mode", currentParticipant, currentChallenger, "2-1-1-0-3");
        challenges[2] = new Challenge("waiting","simple duell mode", currentChallenger, anotherParticipant, "0-0-0-0-0");

        return challenges;
    }

}

