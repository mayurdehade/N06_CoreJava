//Program to demonstrate on Autoboxing
//Autoboxing: conversion of primitive to object type
package wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int num = 97;
		//converting a primitive type to object 
		Integer value = num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
