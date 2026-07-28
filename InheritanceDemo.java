class A{
     int i,j;
	 void showij(){
	     
		  System.out.println("i= "+i);
		  System.out.println("j= "+j);
		  }
	 }
	 class B extends A{
	       int k;
		   void showk(){
		   System.out.println("k= "+k);
		   }
		   void sum(){
		        int res = i+j+k;
				System.out.println("sum= "+res);
			}
	}
	class InheritanceDemo{
	      public static void main(String args[]){
		        B obj=new B ();
				obj.i=10;
				obj.j=20;
				obj.k=30;
				obj.showij();
				obj.showk();
				obj.sum();
				A ob = new A();
				ob.i=20;
				ob.j=40;
				ob.showij();
				}
	}