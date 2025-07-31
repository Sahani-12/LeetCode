class Solution {
    public int minAddToMakeValid(String s) {
        // if (s.length()==0){
        // return;
        // }

        int x = 0;
        int y = 0;
        // int z = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                x++;
            } else {
                if (x > 0) {
                    x--;
                } else {
                    y++;

                }

            }
        }

        return x+y ;

    }
}