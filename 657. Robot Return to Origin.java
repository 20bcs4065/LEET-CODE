class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                u++;
            }else if(moves.charAt(i)=='D'){
                d++;
            }else if(moves.charAt(i)=='L'){
                l++;
            }else if(moves.charAt(i)=='R'){
                r++;
            }
        }
        if(u==d && l==r)
            return true;
        else
            return false;
    }
}
