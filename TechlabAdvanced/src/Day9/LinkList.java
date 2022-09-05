package Day9;

public class LinkList { 
	
	Node head = null;
	int length=0;
	
	public static void main(String[] args) {
		
		 
		LinkList l=new LinkList();
		System.out.println(l.insert(0, 10));
		l.printlist();
		System.out.println(l.insert(1, 20));
		l.printlist();
		System.out.println(l.insert(2, 30));
		l.printlist();
		System.out.println(l.insert(1, 40));
		l.printlist();
	}
	
	public void printlist(){
		Node temp=head;
	while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
	
	}
	}
	public boolean insert(int index, int val){
		boolean success=false;
	if(index>=0 || index<=length)
	{
		Node n=new Node(val);
		if(index==0){
			
			if(head!=null){
				n.next=head;
				head=n;
				length++;
				success=true;
			}
			else{
				head=n;
				length++;
				success=true;
			}
		}else{
			Node temp=head;
			int count=0;
		while(temp!=null){
			if(count==index-1){
				n.next=temp.next;
				temp.next=n;
				length++;
				success=true;
				break;
			}
			temp=temp.next;
			count++;
			
		}
		}
	}
	return success;
		

	}
	

}
