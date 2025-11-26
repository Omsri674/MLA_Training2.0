package com.omsri;

public abstract class Video {

	protected static QualityProcess quality;
	
	public Video(QualityProcess quality) {
		this.quality = quality;
	}
	public abstract void playVideo();
}
