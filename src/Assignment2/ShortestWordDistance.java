import java.lang.reflect.Array;

public class ShortestWordDistance {

    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
//        String[] wordsDict = {"practice", "makes","makes", "perfect", "coding", "makes","coding"};
        String word1 = "coding"; String word2 = "practice";
//        String word1 = "makes"; String word2 = "coding";

//        String[] wordsDict = {"a","b","c","a","b","c","b","c","b","a"};
//        String word1 = "a"; String word2 = "c";

        System.out.println("2. Shortest distance between these two words in the list is : "+(shortest(wordsDict,word1,word2)));
    }
    public static int shortest (String[] wordsDict, String word1, String word2) {
        int shortestd= wordsDict.length;
        for(int i=0; i< wordsDict.length;) {
            if (wordsDict[i]==word1) {
                for (int j=0; j<wordsDict.length;) {
                    if (wordsDict[j]==word2) {
                        int dis=i-j;
                        if (dis<0) {
                            dis=-dis;
                        }
                        if (dis<shortestd) {
                            shortestd=dis;
                        }
                    }
                    j++;
                }
            }
            i++;
        }
        return shortestd;
    }
}
