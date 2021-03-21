import java.util.*;

/***
 *Problem is to find the candidate with max attempted question in an exam.
 * The number of questions attempted by each candidate is given in a array.
 *
 * In case of Tie Breaker, the candidate who attempts max question first will be the Output.
 *
 * Example if there are 6 Candidate and such that
 * Candidate A attempts 4 questions in a exam
 * Candidate B attempts 5 questions in a exam
 * Candidate C attempts 5 questions in a exam
 * Candidate D attempts 1 questions in a exam
 * Candidate E attempts 5 questions in a exam
 * Candidate F attempts 2 questions in a exam
 *
 *  Input: [A,A,B,B,A,D,C,E,C,C,A,B,B,C,C,E,E,E,F,F,E,E]
 *  Output: B
 *  Explanation: Since B,C & E all candidate attempts max question in exam.
 *               However, B is the output because the 5th question attempted by B candidate comes first in array.
 *
 *
 * Input: [A,A,B,B,C,A,A,A,C]
 * Output: A
 * Explanation: A attempts max question (5) in the exam.
 */


public class Find_Max_Attempt_Questions {


    /**
     * find_max_attempt_candidate This function creates Hash Map of candidate_score
     * where key is Candidate & Value is no. of questions attempted by candidate in a exam.
     * Further it calls find_max_score method for further calculations
     *
     * @param candidate Array which contains information of Candidate attempting questions in exam
     * @return Candidate with Max Attempt in a Exam
     * @author Chirag Gupta
     */
    protected static String find_max_attempt_candidate(String[] candidate) {
        HashMap<String, Integer> candidate_score = new HashMap<>();

        for (String temp_candidate : candidate) {
            if (!candidate_score.containsKey(temp_candidate)) {
                candidate_score.put(temp_candidate, 1);
            } else {
                int candidate_value = candidate_score.get(temp_candidate);
                candidate_score.put(temp_candidate, candidate_value + 1);
            }
        }
//        candidate_score.entrySet().forEach(entry -> {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });

        String candidate_max_attempt = find_max_score(candidate_score, candidate);
        return candidate_max_attempt;
    }

    /**
     * find_max_score This function finds the candidate with max score and calls
     * tie_breaker_result in case of Tie.
     *
     * @param candidate_score HashMap which contains information of Unique Candidate Score
     * @param candidate       Array which contains information of Candidate attempting questions in exam
     * @return
     * @author Chirag Gupta
     */
    protected static String find_max_score(HashMap<String, Integer> candidate_score, String[] candidate) {
        int highest_score = 0;
        boolean tie_breaker_flag = false;
        String result = null;
        for (Map.Entry<String, Integer> entry : candidate_score.entrySet()) {
            if (highest_score < entry.getValue()) {
                highest_score = entry.getValue();
            }
            if (highest_score == entry.getValue()) {
                tie_breaker_flag = true;
            }
        }
//        System.out.println("Highest Score: " + highest_score);
//        System.out.println("Tie Breaker: " + tie_breaker_flag);
        if (tie_breaker_flag == true) {
            result = tie_breaker_result(candidate_score, candidate, highest_score);
        } else {
            for (Map.Entry<String, Integer> entry : candidate_score.entrySet()) {
                if (entry.getValue().equals(highest_score)) {
                    result = entry.getKey();
                    break;
                }
            }
        }
        return result;
    }


    /**
     * tie_breaker_result This function finds the candidate with quickest last question attempted
     * in case of tie. It calls find_tie_candidates to get List of Tie Breakers Candidates
     *
     * @param candidate_score HashMap which contains information of Unique Candidate Score
     * @param candidate       Array which contains information of Candidate attempting questions in exam
     * @param heighest_score  Contains the value of heighest number of questions attempted by any candidate
     * @return Tie Breaker Winner
     * @author Chirag Gupta
     */
    protected static String tie_breaker_result(HashMap<String, Integer> candidate_score, String[] candidate, int heighest_score) {
        List<String> tie_candidates = find_tie_candidates(candidate_score, heighest_score);
        // System.out.println(Arrays.toString(tie_candidates.toArray()));
        for (int i = candidate.length - 1; i >= 0; i--) {
            if (tie_candidates.contains(candidate[i])) {
                tie_candidates.remove(candidate[i]);
            }
            if (tie_candidates.size() <= 1) {
                break;
            }
        }
        String tie_winner = tie_candidates.get(0);
        //System.out.println("Tie Breaker Result: " +tie_winner);
        return tie_winner;
    }

    /**
     * find_tie_candidates This function finds the list of Tie Breakers Candidate
     *
     * @param candidate_score HashMap which contains information of Unique Candidate Score
     * @param heighest_score  Contains the value of heighest number of questions attempted by any candidate
     * @return The List of Tie Breakers Candidates
     * @author Chirag Gupta
     */
    protected static List<String> find_tie_candidates(HashMap<String, Integer> candidate_score, int heighest_score) {
        List<String> tie_candidate = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry : candidate_score.entrySet()) {
            if (entry.getValue().equals(heighest_score)) {
                System.out.println(entry.getKey());
                tie_candidate.add(entry.getKey());
            }
        }
        System.out.println("Tie List: " + Arrays.toString(tie_candidate.toArray()));
        return tie_candidate;
    }

    /**
     * main Start Function
     *
     * @author Chirag Gupta
     */
    public static void main(String... args) {
        String[] candidate = {"A", "A", "B", "B", "A", "D", "C", "E",
                "C", "C", "A", "B", "B", "C", "C", "E", "E", "E", "F", "F", "B", "E"};
        System.out.println("Candidate with Max Attempts: " + find_max_attempt_candidate(candidate));
    }
}
