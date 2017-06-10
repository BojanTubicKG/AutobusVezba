package test;

import test.Autobus;

public class TestAutobus {

	public static void main(String[] args) {
		
        Autobus autobus=new Autobus();
		
		autobus.uvestiPutnika(1);
		autobus.uvestiPutnika(20);
		autobus.uvestiPutnika(50);
		
		autobus.statusSvihSedista();
		
		System.out.println("\n");
		System.out.println("Broj slobodnih mesta je : "+autobus.brSlobodnihMesta());
		System.out.println("Broj zauzetih mesta je : "+autobus.brZauzetihhMesta());
		System.out.println("Ima li slobodnih mesta : "+autobus.proveriImaLiSlobodnihMesta());

	}

}
