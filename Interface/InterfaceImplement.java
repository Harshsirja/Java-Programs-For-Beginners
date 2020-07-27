interface P{
	int pvar = 0;
	void methodP();
}

interface P1 extends P{
	int p1var = 1;
	public void methodP1();
}

interface P2 extends P{
	int p2var = 2;		
	public void methodP2();
}

interface P12 extends P1,P2
{
	int p12var = 12;
	public void methodP12();
}

class Q implements P12{
	int qvar=3;
	public void methodP(){ 
		System.out.println("This is P: " + pvar);
	}
	public void methodP1(){ 
		System.out.println("This is P1: " + p1var);
	}
	public void methodP2(){ 
		System.out.println("This is P2: " + p2var);
	}
	public void methodP12(){ 
		System.out.println("This is P12: " + p12var);
	}
	void methodQ(){
		System.out.println("This is Q: " + qvar);	
	}
}

class InterfaceImplementation{
	public static void main(String args[]){
		Q obj = new Q();
		obj.methodP();
		obj.methodP1();
		obj.methodP2();
		obj.methodP12();
		obj.methodQ();
	}
}