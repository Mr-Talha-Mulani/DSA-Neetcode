class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract length
            int len = Integer.parseInt(str.substring(i, j));

            // Extract actual string
            String s = str.substring(j + 1, j + 1 + len);
            ans.add(s);

            // Move to next encoded string
            i = j + 1 + len;
        }

        return ans;
    }
}