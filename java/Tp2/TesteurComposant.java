
public class TesteurComposant {
	private Circuit c;
	
	public TesteurComposant(Circuit aTester) {
		c = aTester;
	}
	
	public void tester(){
		int valMax = (int) java.lang.Math.pow(2,c.getNbEntree());
		for(int in = 0; in < valMax; in++){
			String by = Integer.toBinaryString(in);
			//System.out.println(by);
			for(int e = 0; e < c.getNbEntree(); e++){
				if(e >= by.length()){
					c.getFilEntree(e).setValeur(Fil.ZERO);
				}else{
					if(by.charAt(by.length()-1-e) == '0'){
						c.getFilEntree(e).setValeur(Fil.ZERO);
					}else{
						c.getFilEntree(e).setValeur(Fil.UN);
					}
				}
				System.out.print(c.getFilEntree(e));
			}
			c.simuler();
			System.out.println(c);
		}
	
	}
	
	public static void main(String args []){
		TesteurComposant test = new TesteurComposant(new PorteET(new Fil("a"), new Fil(), new Fil()));
		test.tester();
		test = new TesteurComposant(new PorteNON(new Fil(), new Fil()));
		test.tester();
		test = new TesteurComposant(new PorteXOR(new Fil(), new Fil(), new Fil()));
		test.tester();
		test = new TesteurComposant(new PorteOU(new Fil(), new Fil(), new Fil()));
		test.tester();
		test = new TesteurComposant(new PorteET(new Fil(), new Fil(), new Fil()));
		test.tester();
		/*test = new TesteurComposant(new AddComp2bits(new Fil(), new Fil(), new Fil(), new Fil(), new Fil()));
		test.tester(); */
	}
}
