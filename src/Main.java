import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter  three or four parameters team1 team2 result <result2>");
        Map<String, LeagueResult> hashLeagues = new TreeMap<>();

        while (true) {
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();


            if (line.equalsIgnoreCase("quit"))
                break;
            ;


            String[] values = line.split(" ");

            String team1 = values[0];
            String team2 = values[1];

            int result1 = Integer.parseInt(values[2]);
            int result2 = result1;

            if (values.length == 4)
                result2 = Integer.parseInt(values[3]);


            LeagueResult res1 = hashLeagues.get(team1);
            if (res1 == null)
                res1 = new LeagueResult();

            if (result1 > result2) {
                res1.goal += result1 - result2;
                res1.score += 3;
            } else if (result1 == result2) {
                res1.score++;
            } else {
                    res1.goal += result1 - result2;
                }
            hashLeagues.put(team1, res1);


            LeagueResult res2 = hashLeagues.get(team2);
            if (res2 == null)
                res2 = new LeagueResult();

            if (result2 > result1) {
                res2.goal += result2 - result1;
                res2.score += 3;
            } else if (result1 == result2) {
                res2.score++;
            } else {
                    res2.goal += result2 - result1;
                }
            hashLeagues.put(team2, res2);
        }// end of while
//       List<String> ListofValues = null;
//        List<String> listOfKey = new ArrayList<String>(hashLeagues.keySet());
//        List<LeagueResult> listOfValues = new ArrayList<LeagueResult>(hashLeagues.values());
//listOfValues.sort();


        for (
                Map.Entry<String, LeagueResult> entry : hashLeagues.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", goal = " + entry.getValue().goal + ", score = " + entry.getValue().score);
        }



    }

}

