package test;

public class Autobus {
	
	boolean[] sedista=new boolean[51];	
	
	
	public Autobus() {
		for (int i = 1; i < sedista.length; i++) {
			sedista[i]=true;
		}
	}
	
	public void uvestiPutnika(int brojSedista){
		
		
		try{
			
			if (sedista[brojSedista]==true) {
				sedista[brojSedista]=false;
			}
			else{
				System.out.println("Sediste broj "+brojSedista+" je vec zauzeto");
			}
		}catch(Exception e){
			System.out.println("Sediste broj "+brojSedista+" ne postoji");
		}
	}
	
	
	public boolean proveriImaLiSlobodnihMesta(){
		
		boolean slMesta=false;
		
		for (int i =1 ; i < sedista.length; i++) {
			
			if (sedista[i]==true) {
				slMesta=true;
			}
			
		}
		return slMesta;			
	}
	
	public int brSlobodnihMesta(){
		int slMesta=0;
		
		for (int i = 1; i < sedista.length; i++) {
			
			if (sedista[i]==true) {
				slMesta++;
			}
			
		}
		
	return slMesta;		
	}
	
	public int brZauzetihhMesta(){
		int zaMesta=0;
		
		for (int i = 1; i < sedista.length; i++) {
			
			if (sedista[i]==false) {
				zaMesta++;
			}
			
		}
		
	return zaMesta;		
	}
	
	public void statusSvihSedista(){
		
		for (int i = 1; i < sedista.length; i++) {
			
			if (sedista[i]==true) {
				System.out.println("Sediste broj "+i+ " je slobodno");
			}else if(sedista[i]==false){
				System.out.println("Sediste broj "+i+ " je zauzeto");
			}
			
		}
	}

}
