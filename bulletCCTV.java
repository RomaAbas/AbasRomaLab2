package com.lab2;

public class bulletCCTV extends cctv{
	
	private boolean waterproof;	
	private String vidFormat;
	
		public bulletCCTV() {
			
		}
		
		public bulletCCTV (boolean wp, String vidF, double lens, String inst, int pwr ) {
			super (lens, inst, pwr);
			this.waterproof = wp;
			this.vidFormat = vidF;
		}
		
		public void setWaterproof (boolean waterproof) {
			this.waterproof = waterproof;
		}
		
		public void setVidFormat (String vidFormat) {
			this.vidFormat = vidFormat;
		}
		
		public boolean getWaterproof () {
			return this.waterproof;
		}

		public String getVidFormat () {
			return this.vidFormat;
		}
}
