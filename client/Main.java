package client;

/**
 * Created by hoisi on 11/5/2016.
 */
public class Main {

    public static void main(String args[]){
        //Official has to create tally first
        Tally tally = new Tally();
        tally.read();
        System.out.println("done");
        Ballot ballot = new Ballot(tally.getCandidates());
    }
}
