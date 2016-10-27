package client;

/**
 * Created by hoisi on 10/27/2016.
 */
public class Candidate {

    String name;
    String office;
    String bio;
    int votesReceived;

    public Candidate(){}

    public int getVotesReceived() {
        return votesReceived;
    }

    public void setVotesReceived(int votesReceived) {
        this.votesReceived = votesReceived;
    }
}
