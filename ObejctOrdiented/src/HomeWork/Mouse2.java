package HomeWork;

import java.util.Scanner;

public class Mouse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		/**
		 * ���ͤ@��m * n ���x�}
		 */
		int [][] maze = new int[m][n];
		maze =generateWall(maze);
		printMaze(maze);
		
		m = input.nextInt();
		n = input.nextInt();
		
		setEndPoint(maze,m,n);
		
		
		m = input.nextInt();
		n = input.nextInt();
		
		
		setInitPoint(maze,m,n);
		

		
		//�}�l���
		
		while(maze[m][n]!=2) {
//			System.out.println(m);
//			System.out.println(n);
			if(maze[m+1][n]!=4 && maze[m+1][n]!=1) {
				//�p�G�OTrue�N��U�@�ӬO���I
				if(checkEndPoint(maze[m+1][n])) {
					break;
				}
				m++;
				maze[m][n] = 1;
			}
			
			else if(maze[m][n+1]!=4 && maze[m][n+1]!=1) {
				if(checkEndPoint(maze[m][n+1])) {
					break;
				}
				n++;
				maze[m][n] = 1;
			}
			
			else if(maze[m-1][n]!=4 && maze[m-1][n]!=1) {
				if(checkEndPoint(maze[m-1][n])) {
					break;
				}
				m--;
				maze[m][n] = 1;
			}
			
			else if(maze[m][n-1]!=4 && maze[m][n-1]!=1) {
				if(checkEndPoint(maze[m][n-1])) {
					break;
				}
				n--;
				maze[m][n--] = 1;
			}
			printMaze(maze);
			
			System.out.println();
		}
		System.out.println("���X�f");
	}
	
	
	public static int[][] generateWall(int[][] maze) {
		
		/**
		 * ��ɭn�]��� (��� �Ĥ@�C)
		 * �� 0 , �P������-1
		 * 
		 */
	
		for(int i=0;i<maze.length;i++) {
			maze[i][0] = 4;
			maze[i][maze[0].length-1] = 4;
		}
		
		for(int i=1;i<maze[0].length-1;i++) {
			maze[0][i] = 4;
			maze[maze.length-1][i]  = 4;
		}
		return maze;
	}
	
	public static void printMaze(int[][] maze) {
		
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println("");
		}
	}
	

	
	public static int[][] goDown(int[][] maze,int x,int y) {
	
		maze[x][y] = 1 ;
		
		return maze;
	}

	public static int[][] goRight(int[][] maze,int x,int y) {
		maze[x][y] = 1 ;
		return maze;
	}
	
	public static int[][] goOn(int[][] maze,int x,int y) {
		maze[x][y] = 1 ;
		return maze;
	}

	public static int[][] goLeft(int[][] maze,int x,int y) {
		maze[x][y] = 1 ;
		return maze;
	}
	
	public static int[][] setInitPoint(int[][] maze , int x, int y){
		maze[x][y] = 1;
		return maze;
	}
	
	public static int[][] setEndPoint(int[][] maze , int x , int y){
		maze[x][y] = 2; //2�N����I
		return maze;
	}
	
	public static boolean checkEndPoint(int point){
//		System.out.println(point);
		if(point==2) {
			return true;
		}
		return false;
	}
	
}
