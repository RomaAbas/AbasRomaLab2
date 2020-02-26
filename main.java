package com.lab2;

public class main {
	
	public static void main(String[] args) {
		
		bulletCCTV bc = new bulletCCTV(true, "AHD", 16, "Wall Mount", 12);
		cctv c1 = new cctv();
		
		System.out.println("Regular CCTV: \n");
		c1.setLens(2.8);
		c1.setInstallation("Ceiling Mount");
		c1.setPower(12);
		
		System.out.println("Lens: " + c1.getLens() + " mm");
		System.out.println("Installation: " + c1.getInstallation());
		System.out.println("Power: " + c1.getPower() + "V DC");
		
		System.out.println("\n \nBullet CCTV: \n");
		System.out.println("Waterproof: " + bc.getWaterproof());		
		System.out.println("Video Format: " + bc.getVidFormat());
		System.out.println("Lens: " + bc.getLens() + " mm");
		System.out.println("Installation: " + bc.getInstallation());
		System.out.println("Power: " + bc.getPower() + "V DC");
		
	}
}
