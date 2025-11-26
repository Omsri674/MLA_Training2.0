package com.omsri;

public class YouTube extends Video {

	public YouTube(QualityProcess quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("In YouTube");
		quality.processingQuality();

	}

}
