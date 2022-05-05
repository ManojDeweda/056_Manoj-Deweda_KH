class Q2{

      Node head;
      int count=0;
     static class Node{
  
      int data ;
      Node next;
	  
   
      Node(int data){
		
		  this.data=data;
		  next=null;
		
	    }
  
     }
	
	void append(int newdata ){
		
		Node newNode= new Node(newdata);
		if(head==null){
			
			head=newNode;
			return;
		}
		newNode.next=null;
		Node n=head;
		while(n.next != null){
			n=n.next;
		}
		n.next=newNode;
		return;
	}
	
	void display(Node n ){
		
		
		if(n==null){
			return;
		}
		System.out.println(count);
		while(n.next != null){
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	Node getHead(){
		return head;
	}
	
	public Node reverse(Node head ){
		Node n = head;
		
		Node temp =head;
		if(n==null){
			System.out.println("List is Empty");
		    return n ;
		}
			  while(n.next != null){
				  head=n.next;
				  head.next=temp;
				  temp=head;
				  n=n.next;
				  count++;
			    }
	
             return head;		
			
	     
	}
	
	public static void main(String []args){
		
		Q2 list= new Q2();
		
		
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		Node head1=list.getHead();
		Node reveresedhead1 =list.reverse(head1);
		list.display(reveresedhead1); 
		
		list.append(3);
		list.append(4);
		list.append(2);
		list.append(5);
		Node head2=list.getHead();
		Node revesedhead =list.reverse(head1);
		list.display(revesedhead); 
		
	}

}