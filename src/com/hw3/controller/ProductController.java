package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pro = new Product[10];
	
	public static int count = 0;
	Scanner sc = new Scanner(System.in);

	
	public void mainMenu() {
		int input = 1;
		
		do {
			System.out.println("\n===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("번호 입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("번호를 잘못 입력하셨습니다.");
			}
		} while(input != 0);
	}
	
	public void productInput() {
		
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		
		System.out.print("제품명 : ");
		String pName = sc.next();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
				
		
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				pro[count] = new Product(pId, pName, price, tax);
				System.out.println("제품 정보가 저장되었습니다.");
				break;
			}
		}
		if(count < 10) {
			count += 1;
			System.out.println("카운트 " + count + "증가");
		} else {
			System.out.println("저장공간이 가득 찼습니다.");
		}
	}
	
	public void productPrint() {
		System.out.println(" - 제품 전체 조회 - ");
		for(int x = 0; x < count; x++) {
			System.out.println(pro[x].information());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
