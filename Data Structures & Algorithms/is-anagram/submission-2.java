class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        String[] first = s.split("");
        String[] sec = t.split("");
        Integer value;
        for (String f_cur: first) {
            value = m1.get(f_cur);
            m1.put(f_cur, value != null ? ++value : 1);
        }
        for (String s_cur: sec) {
            value = m2.get(s_cur);
            m2.put(s_cur, value != null ? ++value : 1);
        }
        for (var entry: m1.entrySet()) {
            try {
                if (!m2.get(entry.getKey()).equals(entry.getValue()))
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
