package com.example.kom.kickermanager3000;


import java.util.Date;

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

        Challenge(String state, String mode, RealAppearance realAppearance, Manager challenger, Manager participant, String scores){

            this.state = state;
            this.mode = mode;
            this.realAppearance = realAppearance;
            this.challenger = challenger;
            this.participant = participant;
            this.score = scores;

    }

        String state;
        String mode;
        RealAppearance realAppearance;
        Manager challenger;
        Manager participant;
        String score;

    }

    static class RealAppearance{

        RealAppearance(Team homeTeam,Team awayTeamm, Date date, String evaluation){

            this.homeTeam = homeTeam;
            this.awayTeam = awayTeamm;
            this.date = date;
            this.evaluation = evaluation;
        }

        Team homeTeam;
        Team awayTeam;
        Date date;
        String evaluation;


    }

    static class Team{

        Team(String teamName,String realPlayer){

            this.teamName = teamName;
            this.realPlayer = realPlayer;

        }

        String teamName;
        String realPlayer;

    }


    public static Challenge[] getChallenges(){

        Date currentDate = new Date();
        Team currentTeam = new Team("Hansa Rostock", "Olaf Holetschek");
        Team anotherTeam = new Team("Real Madrid", "Swen Buettner");
        RealAppearance currentAppearance = new RealAppearance(currentTeam,anotherTeam, currentDate, "3:4");
        RealAppearance anotherAppearance = new RealAppearance(anotherTeam,currentTeam, currentDate, "39:9");


        Manager currentChallenger = new Manager("Swenno", "individual stats A");
        Manager currentParticipant = new Manager("Benno", "individual stats B");
        Manager anotherParticipant = new Manager("Rrrrruuudiii", "individual stats c");
        Challenge[] challenges = new Challenge[3];
        challenges[0] = new Challenge("ready","simple duell mode", currentAppearance, currentChallenger, currentParticipant, "3-4-2-1-3");
        challenges[1] = new Challenge("on_hold","simple duell mode", anotherAppearance, currentParticipant, currentChallenger, "2-1-1-0-3");
        challenges[2] = new Challenge("waiting","simple duell mode", currentAppearance, currentChallenger, anotherParticipant, "0-0-0-0-0");

        return challenges;
    }

}

