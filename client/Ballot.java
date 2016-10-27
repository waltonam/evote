package client;

/**
 * Created by hoisi on 10/27/2016.
 */
public class Ballot {
    //candidate list

    boolean ballotComplete;
    int voterID;

    public Ballot(){}

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
