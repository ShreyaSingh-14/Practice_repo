import java.util.*; 
class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}
}
public class linkedList
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of node in first linked list");
	int l1=sc.nextInt();
	Node head=null;
	while(l1!=0)
	{
		System.out.println("enter the node value");
		int val=sc.nextInt();
		Node node=new Node(val);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node p=head;
			while(p.next!=null)
			{
			p=p.next;
			}
			p.next=node;
		}
		l1--;
	}
	/*Node p=head;
	while(p!=null)
	{
		System.out.println(p.data+"\n");
		p=p.next;
	}*/
	System.out.println("enter the number of node in second linked list");
	int l2=sc.nextInt();
	Node head2=null;
	while(l2!=0)
	{
		System.out.println("enter the node value");
		int val=sc.nextInt();
		Node node=new Node(val);
		if(head2==null)
		{
			head2=node;
		}
		else
		{
			Node r=head2;
			while(r.next!=null)
			{
			r=r.next;
			}
			r.next=node;
		}
		l2--;
	}
	/*Node q=head2;
	while(q!=null)
	{
		System.out.println(q.data+"\n");
		q=q.next;
	}*/
	Node ptr1=head;
	Node ptr2=head2;
	int query;
	int count=0;
	int countloop=0;
	while(ptr1.next!=null)
	{
		query=ptr1.next.data;
		if(find(query,head2)==1)
		{
		ptr1.next=ptr1.next.next;
		}
		else
		{
		ptr1=ptr1.next;
		count++;
		}
	countloop++;
		
	}
	System.out.println("count="+count);
	Node p=head;
	while(p!=null)
	{
		System.out.println(p.data+"\n");
		p=p.next;
	}

}
static int find(int query,Node list)
{
	while(list!=null)
	{
		if(list.data==query)return 1;
		list=list.next;
	}
	return 0;
}
}
	