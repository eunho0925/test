package ch06_method;

import java.util.Scanner;

public class methodex2 {
    public static void main(String[] args) {
        coffe(5);  
    
    public static void coffe(int peo) {
        int totalCost = 0;  
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= peo; i++) {
            System.out.printf("%d 고객님, 어떤 음료를 드릴까요? ", i);
            String a = sc.nextLine().trim();  

            int cost = 0;  

          
            switch(a) {
                case "아아":
                case "아메리카노":
                    cost = 3000;
                    break;
                case "카푸치노":
                    cost = 4500;
                    break;
                case "밀크티":
                    cost = 5000;
                    break;
                default:
                    System.out.println("메뉴가 없습니다. 다시 주문해주세요.");
                    i--; 
                    continue;  
            }
            
            totalCost += cost; 
            System.out.printf("%d번 고객님의 주문 금액은 %d원입니다.\n", i, cost);
        }
        
        
        System.out.printf("\n총 주문 금액은 %d원입니다.\n", totalCost);
    }
}

	
	
	
	
	
	
	

