class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(!stk.isEmpty() && stk.peek()==ch){
                stk.pop();
            }else{
                stk.push(ch);
            }
            i++;
        }
        StringBuilder ans=new StringBuilder();
        for(int j=0;j<stk.size();j++){
            ans.append(stk.get(j));
        }
        return ans.toString();

    }
}