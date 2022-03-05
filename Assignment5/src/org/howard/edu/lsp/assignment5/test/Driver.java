package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import java.util.Scanner; 

public class Driver {

	public static void main(String[] args) {
		Scanner lotto_guess = new Scanner(System.in);  
		IntegerSet lottery_win = new IntegerSet(null); 
		IntegerSet my_lotto = new IntegerSet(null);  
		lottery_win.add(4);
		lottery_win.add(19); 
		lottery_win.add(8);
		lottery_win.add(24);
		lottery_win.add(17);
		
		IntegerSet lotto_copy1 = lottery_win;
		IntegerSet lotto_copy2 = lottery_win;
		IntegerSet lotto_copy3 = lottery_win;
		
		for(int i=0; i<=4; i++) {
			System.out.println("Please input your lottery number(only one): "); 
			my_lotto.add(lotto_guess.nextInt());
		}
		
		if(lottery_win.equals(my_lotto)==false) {
			int input_len = my_lotto.length(); 
			System.out.println("Hey! Your numbers don't match the length of the lottery! Yours is " + input_len + "sizes long!"); 
		}
		else {
			continue; 
	}
		lotto_copy1.union(my_lotto);
		lotto_copy2.intersect(my_lotto);
		lotto_copy3.diff(my_lotto);
		System.out.println("Your smallest guess was: " + my_lotto.smallest());
		System.out.println("Your largest guess was: " + my_lotto.largest()); 
		System.out.println("Today's lottery is: " + lottery_win); 
		
		System.out.println("All lotto values: " + lotto_copy1); 
		System.out.println("Similar values: " + lotto_copy2); 
		System.out.println("Unique values: " + lotto_copy3); 
		
		lottery_win.clear(); 
		my_lotto.clear(); 
		
		if lottery_win.

}; 
