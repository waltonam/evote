package client;

import java.util.ArrayList;

/**
 * Created by hoisi on 10/27/2016.
 */
public class Ballot {
    private ArrayList candidates = new ArrayList();

    boolean ballotComplete;
    int voterID;

    public Ballot(ArrayList x){
        //used to be this, but I think this was just a reference. Need a new object
//        this.candidates = x;
        for(int j = 0; j < x.size(); j++) {
            Candidate y = (Candidate) x.get(j);
            this.candidates.add(y);
        }
    }

    public void print(){}

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

    public ArrayList getCandidates() {
        return candidates;
    }

}