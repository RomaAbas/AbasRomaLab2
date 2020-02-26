package com.lab2;

public class cctv {

	private double lens;
	private String installation;
	private int power;
		
		public cctv () {
			
		}
		
		public cctv (double lens, String inst, int pwr) {
			this.lens = lens;
			this.installation = inst;
			this.power = pwr;
		}
		
		public void setLens (double lens) {
			this.lens = lens;
		}
		
		public void setInstallation (String installation) {
			this.installation = installation;
		}
		
		public void setPower (int power) {
			this.power = power;
		}
		
		public double getLens () {
			return this.lens;
		}
		
		public String getInstallation () {
			return this.installation;
		}
		
		public int getPower () {
			return this.power;
		}

}
