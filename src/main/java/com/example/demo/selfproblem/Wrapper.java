package com.example.demo.selfproblem;

public class Wrapper extends DelegateWrappedObject {

	private int callCount = 0;

	public Wrapper(SomethingWithCallback somethingWithCallback) {
		super(somethingWithCallback);
	}

	@Override
	public void doSomething() {
		super.doSomething();
	}

	@Override
	public void call() {
		callCount++;
		super.call();
	}
	
	public int getCallCount() {
		return callCount;
	}
}
