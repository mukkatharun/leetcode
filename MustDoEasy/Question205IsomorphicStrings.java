class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> iso = new HashMap<Character, Character>();
        
        for(int i=0; i<s.length(); i++) {
            Character s1 = s.charAt(i);
            Character t1 = t.charAt(i);
            if(iso.containsKey(s1)){
               if(!iso.get(s1).equals(t1)) return false;
            }
            else {
                if(iso.containsValue(t1)) return false;
                else iso.put(s1, t1);
            }
        }
        return true;
    }
}
