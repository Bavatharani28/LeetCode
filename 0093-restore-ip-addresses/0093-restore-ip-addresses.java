class Solution {

    List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, new ArrayList<>());
        return ans;
    }
    void backtrack(String s, int index, List<String> path) {
        if (path.size() == 4) {
            if (index == s.length()) {
                ans.add(String.join(".", path));
            }
            return;
        }
        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length())
                break;
            String part = s.substring(index, index + len);
            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }
            int num = Integer.parseInt(part);
            if (num > 255) {
                continue;
            }
            path.add(part);
            backtrack(s, index + len, path);
            path.remove(path.size() - 1);
        }
    }
}