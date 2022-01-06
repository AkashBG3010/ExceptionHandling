package com.bridgeLabz;

public class MoodAnalyserMain {
	public static void main(String[] args) {
		
		MoodAnalyser moodNull = new MoodAnalyser(null);
		System.out.println(moodNull.analyseMood());
		
		MoodAnalyser moodHappy = new MoodAnalyser("I'am Happy");
		System.out.println(moodHappy.analyseMood());
		
		MoodAnalyser moodSad = new MoodAnalyser("I'am Sad");
		System.out.println(moodSad.analyseMood());
	}
}