import java.util.*;
class Hash
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,2,3,2,3,1,1,1,5,4,3,1,2,3,2};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		//since we can only sort list useing comparator in collection 
		//we will make a list of this map and then do it.
		//the goal is to sort by value
		System.out.println(map);
		List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
		Collections.sort(l,(a,b)->a.getValue()-b.getValue());
		System.out.println(map);
	}
}
class practice
{
	public static void main(String args[])
	{
		int arr[]={2,4,3,5,6,7,8,0};
		for(int val:arr)
		{
		System.out.print(val+" ");
		}
	}
}
class PracticeHash
{
	public static void main(String args[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1,2);
		map.put(4,5);
		map.put(0,6);
		map.put(-3,7);
		List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
		Collections.sort(l,Map.Entry.comparingByKey());
		System.out.println(l);
		Collections.sort(l,(a,b)->a.getValue()-b.getValue());
		System.out.println(l);
	}	
}	






























		 