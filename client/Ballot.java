package client;

import java.util.ArrayList;

/**
 * Created by hoisi on 10/27/2016.
 */
public class Ballot {
    ArrayList candidates = new ArrayList();

    boolean ballotComplete;
    int voterID;

    public Ballot(ArrayList x){
        this.candidates = x;
    }

    public void print(){}

    public void submitBallot(){}

    public boolean isBallotComplete() {
        return ballotComplete;
    }

    public void setBallotComplete(boolean ballotComplete) {
        this.ballotComplete = ballotComplete;
    }

    public int getVoterID() {
        return voterID;
    }

    public void setVoterID(int voterID) {
        this.voterID = voterID;
    }

}
