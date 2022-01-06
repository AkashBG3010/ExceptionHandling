package com.bridgeLabz;

import org.junit.Test;
import junit.framework.Assert;

class MoodAnalyserTest {
	
	@Test
	public void givenMood_IsHappy_ShouldReturnSad() {
		MoodAnalyser analyser = new MoodAnalyser("I'am Sad");
		Assert.assertEquals("SAD",analyser.analyseMood());
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() {
		MoodAnalyser analyser = new MoodAnalyser("I'am Happy");
		Assert.assertEquals("HAPPY",analyser.analyseMood());
	}
	@Test
	public void givenMood_IsHappy_ShouldReturnException() {
		MoodAnalyser analyser = new MoodAnalyser(null);
		Assert.assertEquals("HAPPY",analyser.analyseMood());
	}
}
