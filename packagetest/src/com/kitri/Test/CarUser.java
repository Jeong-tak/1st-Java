package com.kitri.Test;

import com.kitri.car.Car;

public class CarUser {
	
 public static void main(String[] args) {
	 Car car = new Car("�Ÿ", "������", "����");
	 
	 
	 System.out.println("�̸� :"+ car.getName());
	 car.setColor("���");
	 System.out.println("���� :"+ car.getColor());
	 System.out.println("������ :"+ car.getMaker());
	 System.out.println(car);
	 
 }
}