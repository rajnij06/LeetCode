public class AssignmentQ4 {

    public static void main (String[] args) {

        // Test cases
        String ransomNote = "fihjjjjei";    String magazine  = "hjibagacbhadfaefdjaeaebgi";
        //String ransomNote = "aa";   String magazine  = "ab";
        //String ransomNote = "aa";   String magazine  = "aab";
        //String ransomNote = "aa";   String magazine  = "aba";
        //String ransomNote = "abcv";    String magazine  = "vcba";

        if ( ransomNote.length() > magazine.length() ) {
            System.out.println("4. Can ransomNotecan be constructed from magazine? \nFalse");
            return;
        }
        int flag = 0;
        int[] newarr = new int[magazine.length()] ;
        int s = 0;
        while ( s < newarr.length ) {
            newarr[s] = -1;
            s++;
        }
        for (int i=0; i<ransomNote.length(); i++) {
            for ( int j=0; j<magazine.length(); j++) {
                if ( newarr[j] == j) {
                }
                else if ( ransomNote.charAt(i) == magazine.charAt(j)) {
                    newarr[j] = j;
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
        }
        System.out.println("4. Can ransomNotecan be constructed from magazine?");
        if( flag == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
