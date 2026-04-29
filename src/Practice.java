import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Practice {
  public static void main(String[] args) {

    
    Map<String, String> schools = new HashMap<>();
    schools.put("Auberon", "GRC");
    schools.put("Damien", "OSU");
    schools.put("Xinting", "UW");
    schools.put("Tina", "GRC");

    //schools.put("Damien", "CPH");

    // System.out.println(schools.get("Damien"));

    Map<String, Integer> scores = new HashMap<>();
    scores.put("Nupur", 345);
    scores.put("Alex", 120);
    scores.put("Stace", 67);


    // System.out.println(scores.get("Stace"));

    int oldScore = scores.get("Stace");

    int newScore = oldScore + 10;

    scores.put("Stace", newScore);

    // System.out.println(scores.get("Stace"));


    //System.out.println(schools);
    

    String[] words = {"yes", "i" , "will", "yes", "i", "said", "yes"};



    Map<String, Integer> joyceCount = countMap(words);
    System.out.println(joyceCount);

    for(String word : joyceCount.keySet()) {
      System.out.println(word);

    }

  }


  //return a map that counts how many times each words shows up in the array.

  //example: ["yes", "i" , "will", "yes", "I", "said", "Yes"]
  public static Map<String, Integer> countMap(String[] words) {
    /*
    counts = {}
    
    for word in words:
      if word in map:
        oldCount = count.get(word)
        newCount = oldCount + 1;
        counts.put(word, )
      else:
        counts.put(word, 1)

      return counts;
    */


      Map<String, Integer> counts = new HashMap<>();

    for(String word : words) {
      if(counts.containsKey(word)) {
      int oldCount = counts.get(word);
      int newCount = oldCount + 1;
      counts.put(word, newCount);
      }

      else { //if word not yet in counts
        counts.put(word, 1);
      }
    }

    return counts;
  } 
}