https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1 
question

//User function Template for Java



//User function Template for Java

class Solution{
    
    String rem(String s)
    {
        int n = s.length();
            int i = 0;
            
            StringBuilder temp= new StringBuilder();
            
         while(i<n)
            {
    
            if(i<n-1 && s.charAt(i)==s.charAt(i+1) ) while(i<n-1 && s.charAt(i) == s.charAt(i+1) ) i++;
            else    temp.append(s.charAt(i)); 
            i++;
            
            }
            
            
        
    return temp.toString();
            
        }




    String rremove(String s) {
        
        
        String s1=s;
        String s2="";
        
        while(s1.length() != s2.length())
        {
            s2=s1;
            s1=rem(s1);
        }
            
       
        

return s1;

}
}
