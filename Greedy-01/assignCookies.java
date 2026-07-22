class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(s);
        Arrays.sort(g);

        int count=0;

        int i=0; // maintain 2 pointers
        int j=0;

        while(i<s.length && j<g.length){ //jabtak dono khali nahi ho jate
            if(s[i]>= g[j]){ //agar size bada hai greed se to feed karo
                i++; // size pointer aage badaya
                j++; // greed pointer aage badaya
                count++;  //feed krne ke bad counter badaya
            }
            else{ // greed badi hai size se

                i++;  //doosre size ki cookie try kro,  pointer aage badaya
            }
        }
        return count;
        
    }
}