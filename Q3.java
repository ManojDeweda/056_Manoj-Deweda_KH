/*Q3:Java program to implement two stacks in a single array.
11 5 10 15 7 40
Note: Please check is required to be update in list and then define test case.
Input values :
push1(5); 
push2(10); 
push2(15); 
push1(11); 
push2(7); 
push2(40);
Output: (Required to be printed like this only)
Popped element from stack1 is 11
Popped element from stack2 is 40
[10 marks]
*/


class Q3{
	
	 private  int st[];
	
     private  int top2;
	 private  int top1;
	 private int max;
	Q3(int max){
		
		top1 = -1;
		top2 = max;
		this.max=max;
		st=new int[max];
	}
  class Stack1{
        
       Stack1(){
         top1=-1;
        
         //st=new int[max];
         
		}
    }	
	 public boolean isEmpty(){
		  if(top1==-1)
			return true;
		  else
			return false;
		
	    }
    
      public boolean isFull(){
		 if(top1>=(max-1))
			return true;
		 else
			return false;
	    }	
	 public void push1(int data){
	 	 if(isFull())
			System.out.println("Stack is Full...Overflow");
         else
            st[++top1]=data;
		
		
	    }	
	 public int pop1(){
	 	 if(isEmpty()){
			System.out.println("Stack is Empty....Underflow");
		   return -1;
		 }
         else
            return st[top1--];
		
	   }
		
	    
		
        
	 
   class Stack2{
        
       Stack2(int data){
         top2=max-1;
        
         //st=new int[max];
         
		}
    }	
	 public boolean isEmpty2(){
		  if(top2>=(max-1))
			return true;
		  else
			return false;
		
	    }
    
      public boolean isFull2(){
		 if(top2<=-1)
			return true;
		 else
			return false;
	    }	
	 public void push2(int data){
	 	 if(isFull2())
			System.out.println("Stack1 is Full...Overflow");
         else
            st[--top2]=data;
		
		
	    }	
	 public int pop2(){
	 	 if(isEmpty2()){
			System.out.println("Stack2 is Empty....Underflow");
		   return -1;
		 }
         else
            return st[top2++];
		
	   }
		


   public static void main(String []args){
	   
	  Q3 s = new Q3(10);
 	  
	  s.push1(5); 
      s.push2(10); 
      s.push2(15); 
      s.push1(11); 
      s.push2(7); 
      s.push2(40);
	  
	  int x= s.pop1();
	  if(x == -1)
		  System.out.println("Stack is Empty");
		else  
		  System.out.println("Popped element from stack1 is "+s.pop1());
	   int y= s.pop2();
	  if(y == -1)
		  System.out.println("Stack is Empty");
		else  
		  System.out.println("Popped element from stack2 is "+s.pop2());
	   
	   
   }
}//end of Q3 class 