package com.bridgeLabz;

public class MoodAnalysisException extends Exception {
	enum ExceptionType {
		ENTERED_NULL,WHEN_EMPTY;
	}
	ExceptionType type;
	public MoodAnalysisException(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}
}