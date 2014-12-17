package trees;

import java.util.ArrayList;
import java.util.List;

public class MaxPathSum {
	
	private static Node root;

	public static void main(String[] args) {
		
		int result;
		Build123 build = new Build123();
        root = Build123.getRoot();
        
       /* MaxPathSum obj = new MaxPathSum();
        
        result = obj.maxPath(root,new int[10],0 );
        
        System.out.println("result   "+result);*/
        printPath(root,3,new int[100],0);
	}
	
	public static void printPath(Node root , int val,int[] array,int pathIndex)
	{
		if(root == null)
			return;
		array[pathIndex++] = root.getData();
		
		if(root.getData() == val)
		{
			for(int i =0;i< pathIndex;i++)
				System.out.println(array[i]);
		}
		
		printPath(root.getLeft(),val,array,pathIndex);
		printPath(root.getRight(),val,array,pathIndex);
	}
	
	public int maxPath(Node node, int[] pathList, int pathIndex )
	{
		int sum = 0, lsum=0,rsum=0;
		
		if(node == null)
			return -1;
			
		pathList[pathIndex] = node.data;
		pathIndex++;
		
		
		if(node.left == null && node.right == null)
		{
			for(int data : pathList)
			{
				sum = sum+data;
				
			}
			return sum;
		}else{
			
			lsum = maxPath(node.left, pathList,pathIndex);
			rsum = maxPath(node.right,pathList,pathIndex);
		}
		
		if(lsum > rsum)
		{
			sum = lsum;
		}else{
			sum = rsum;
		}
		
		return sum;
		
	}

}
