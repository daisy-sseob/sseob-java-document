package com.example.demo.selfproblem;

public class Wrapper implements SomethingWithCallback {

	private final WrappedObject wrappedObject;

	public Wrapper(WrappedObject wrappedObject) {
		this.wrappedObject = wrappedObject;
	}

	@Override
	public void doSomething() {
		wrappedObject.doSomething();
	}

	@Override
	public void call() {
		System.out.println("Wrapper callback ! ");
	}
}
