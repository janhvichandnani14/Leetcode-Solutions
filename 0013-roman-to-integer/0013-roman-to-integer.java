class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = 0;
        int i = s.length() - 1;

        while (i >= 0) {
            char ch = s.charAt(i);

            // Check subtractive pairs safely
            if (i > 0) {
                char prev = s.charAt(i - 1);

                if ((ch == 'V' || ch == 'X') && prev == 'I') {
                    ans += map.get(ch) - map.get(prev);
                    i -= 2; // skip previous character
                    continue;
                } else if ((ch == 'L' || ch == 'C') && prev == 'X') {
                    ans += map.get(ch) - map.get(prev);
                    i -= 2;
                    continue;
                } else if ((ch == 'D' || ch == 'M') && prev == 'C') {
                    ans += map.get(ch) - map.get(prev);
                    i -= 2;
                    continue;
                }
            }

            // Normal addition if no subtractive pair
            ans += map.get(ch);
            i--;
        }

        return ans;
    }
}
