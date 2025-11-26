package com.omsri;

public class Prime extends Video {

	public Prime(QualityProcess quality) {
		super(quality);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("In Prime");
		 quality.processingQuality();
	}

}
