package data_structures.data01_string;

import java.util.ArrayList;
import java.util.List;

// 查找匹配
public class KMP {
	
	static int[] computePrefix(String P)  
    {  
        int[] next=new int[P.length()];  
        int k=0;  
        next[0]=0;  
        for(int q=1;q<P.length();q++)  
        {  
            while (k>0&&P.charAt(k)!=P.charAt(q))  
                k=next[k];  
            if(P.charAt(k)==P.charAt(q))  
                k=k+1;  
            next[q]=k;  
        }  
        return next;  
    }  
      
    static List<Integer> KMPmatcher(String T,String P)  
    {  
        List<Integer> res=new ArrayList<Integer>();  
        int[] next=new int[P.length()];  
        next=computePrefix(P);  
        int q=0;  
        for(int i=0;i<T.length();i++)  
        {  
            while(q>0&&P.charAt(q)!=T.charAt(i))  
                q=next[q-1];  
            if(P.charAt(q)==T.charAt(i))  
                q=q+1;  
            if(q==P.length())  
            {  
                res.add(i-q+1);  
                q=next[q-1];  
            }  
        }  
        return res;  
    }  
      
    public static void main(String[] args)  
    {  
        String T="aabababcacbaab";  
        String P="ab";  
          
        List<Integer> pos=new ArrayList<Integer>();  
        pos=KMPmatcher(T,P);  
        System.out.println(pos);  
        System.out.println(pos.size());
    } 

}
