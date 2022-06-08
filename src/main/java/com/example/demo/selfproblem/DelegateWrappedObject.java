package com.example.demo.selfproblem;

public class DelegateWrappedObject implements SomethingWithCallback {

	private final SomethingWithCallback somethingWithCallback;

	public DelegateWrappedObject(SomethingWithCallback somethingWithCallback) {
		this.somethingWithCallback = somethingWithCallback;
	}

	@Override
	public void doSomething() {
		somethingWithCallback.doSomething();
	}

	@Override
	public void call() {
		somethingWithCallback.call();
	}
}
