package programmers;

public class Crain {
	
	public int solution(int[][] board, int[] moves) {
//		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//		int [] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		int c=0;
		int [] out = new int[moves.length];
		for (int i = 0; i < moves.length;i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1]==0) {
					System.out.println("j,(moves[i]-1) : "+j+" "+(moves[i]-1)+"값 : "+board[j][moves[i]-1]+": 0임!!");
					continue;
				}else {
					System.out.println("j,(moves[i]-1) : "+j+" "+(moves[i]-1)+"값 : "+board[j][moves[i]-1]+": 0아님!!");
					out[c] = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					System.out.println("j,(moves[i]-1) : "+j+" "+(moves[i]-1)+"값 : "+out[c]+"가/이 out "+c+" index 에 들어갔다");
					if(c>0) {
						if(out[c]==out[c-1]) {
							System.out.println(out[c]+" 랑 "+out[c-1]+"같으니까 지움!!");
							c--;
							answer+=2;
							break;
						}else {
							System.out.println("다르니까 넘어가자");
							c++;
							break;
						}
					}else {
						c++;
						break;
					}
				}
			}
			System.out.println("===============");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
//		int [] moves = {1,2,3,4,5};
		Crain c = new Crain();
		int anwser = c.solution(board, moves);
		System.out.println("answer : "+anwser);
	}
}
