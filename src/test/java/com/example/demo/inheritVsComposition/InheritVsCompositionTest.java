package com.example.demo.inheritVsComposition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class InheritVsCompositionTest {

	@DisplayName("add All method를 통해 count를 4증가 시켰으니 4가 나오기를 기대한다...")
	@Test
	public void inheritSetTest() {
		InheritSet<String> stringInheritSet = new InheritSet<>();
		stringInheritSet.addAll(Arrays.asList("한방", "두방", "세방", "네방"));

		assertEquals(8, stringInheritSet.getAddCount());
		
		// but actual 8....
	}

	@Test
	public void compositionSetTest() {
		CompositionSet<String> compositionSet = new CompositionSet<>(new HashSet<>());
		compositionSet.addAll(Arrays.asList("한방", "두방", "세방", "네방"));
		
		assertEquals(4, compositionSet.getAddCount());
	}
}