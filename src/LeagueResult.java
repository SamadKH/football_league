import java.util.Comparator;

public class LeagueResult implements Comparable {
    public int score;
    public int goal;

    public LeagueResult(int score, int goal) {
        this.score = score;
        this.goal = goal;
    }

    public LeagueResult() {

    }

    @Override
    public String toString() {
        return "LeagueResult{" +
                "score=" + score +
                ", goal=" + goal +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        LeagueResult first = this;
        LeagueResult second = (LeagueResult) o;
        if (first.score == second.score) {
            if (first.goal < second.goal) {
                return -1;
            }

            return 0;
        } else if (first.score > second.score) {
            return -1;
        } else
            return 1;    }
}
