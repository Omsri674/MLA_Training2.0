package com.omsri;

public class Hotstar extends Video {

	public Hotstar(QualityProcess quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("In Hotstar");
		quality.processingQuality();

	}

}
