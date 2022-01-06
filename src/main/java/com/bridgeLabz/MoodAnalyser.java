package com.bridgeLabz;

import com.bridgeLabz.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	
	String message;
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(ExceptionType.WHEN_EMPTY, "Invalid Input. Empty input is Not Allowed");
			}
			if (this.message.contains("Sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException ex) {
			return "HAPPY";
		}
	}
}