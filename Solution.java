//Breadth first traversal of grah

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q =new LinkedList<>();//queue to add graoh nodes
        ArrayList <Integer> ans=new ArrayList<>();//
        int n=adj.size();
        boolean [] visited=new boolean[n];//boolean array
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty())
        {int pop=q.poll();//gets front element of queue
          //  q.add(i);
            ans.add(pop);
            for(int i=0;i<adj.get(pop).size();i++)
            {
                int curr=adj.get(pop).get(i);
                if(!ans.contains(curr)&&visited[curr]==false)
                {
                    q.add(curr);
                    visited[curr]=true;
                }
                
            }
            
        }
        
    return ans;}
}