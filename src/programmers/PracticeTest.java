package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest {

public int[] solution(int[] answers) {
        
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Integer> ansc = new ArrayList<Integer>();
        
        for(int i = 0; i < 3; i++) {
        	count.add(0);
        }
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i]==st1[i%5]) {
        		count.set(0, count.get(0)+1);
        	}
        	if(answers[i]==st2[i%8]) {
        		count.set(1, count.get(1)+1);
        	}
        	if(answers[i]==st3[i%10]) {
        		count.set(2, count.get(2)+1);
        	}
        }
        
        int max = Collections.max(count);
        
        for(int i = 0; i < 3 ; i++) {
        	if(count.get(i)==max) ansc.add(i+1);
        }
        
        int[] answer = new int[ansc.size()];
        
        for(int i = 0; i <ansc.size(); i++) {
        	answer[i] = ansc.get(i);
        }
        return answer;
    }

	public static void main(String[] args) {
//		int[] answers = { 1, 2, 3, 4, 5 };
		int[] answers = { 1, 3, 2, 4, 2 };
		PracticeTest p = new PracticeTest();
		for (int i : p.solution(answers)) {
			System.out.print(i);
		}
	}
}
