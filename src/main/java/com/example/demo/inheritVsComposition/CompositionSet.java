package com.example.demo.inheritVsComposition;

import java.util.Collection;
import java.util.Set;

public class CompositionSet<E> extends ForwardingSet<E> {
	
	private int addCount = 0;

	public CompositionSet(Set<E> set) {
		super(set);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
