class Solution {
    public boolean isAnagram(String s, String t) {
        int result[]=new int[128];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'a']++;
            result[t.charAt(i)-'a']--;
        }
        for(int count:result){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
