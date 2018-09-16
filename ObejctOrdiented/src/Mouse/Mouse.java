package Mouse;

import Mouse.Point;

public class Mouse {
	
	/**
	 * 
	 * 
	 * @param maze
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[][] go(int[][] maze, Point start, Point end) {
		//�}�l��g�c
        visit(maze, start, end);
        //��X�ݧ��Ҧ��g�c���g�c��X
        return maze;
    }
	
	public static boolean visit(int[][] maze, Point pt, Point end) {
		//�P�_�O�_�����X�L���Point pt x,y�y�Э�
		//�p�Gtrue �N�O�S���X�L�|�i�ӧP�_�̭�
        if(isVisitable(maze, pt)) {
        	
        	//���N���I�]��1
            maze[pt.x][pt.y] = 1;
            printMaze(maze);
            //�P�_�O�_�w�g��F���I �p�G�^��true�N��w�g�����I
            
            
           
            
            // isEnd �Otrue�N��w�����I �p�G�Ofalse�h�O�٨S�����I
            
            // �S�������I�B�S�����ɱN x,y�]��0 
            if(!isEnd(maze, end) && !findWay(maze, pt, end)) {
            	System.out.println("�S�����˰h��");
            	System.out.println("pt.x:"+pt.x);
            	System.out.println("pt.y:"+pt.y);
                maze[pt.x][pt.y] = 0;
            }
        }
        //�^�ǬO�_�����I 
        return isEnd(maze, end);
    }
	
	//�p�G���X�L���I���ܫh�^�� false
	//�p�G�٨S���X�L���I���ܫh�^�� true
	 public static boolean isVisitable(int[][] maze, Point pt) {
		 	System.out.println("�O�_���X�L"+pt.x);
		 	System.out.println("�O�_���X�L"+pt.y);
		 	
		 	System.out.println(maze[pt.x][pt.y] == 0);
	        return maze[pt.x][pt.y] == 0;
	 }
	 

	 //��g�c���������I�ƭȬ�1���ɭԥN�������I
	 //�_�h�h�S�������I
	 public static boolean isEnd(int[][] maze, Point end) {
//		 System.out.println(maze[end.x][end.y]== 1);
	        return maze[end.x][end.y] == 1;
	 }
	 //�}�l�i�滼�j���
	 public static boolean findWay(int[][] maze, Point pt, Point end) {
		 //visit(maze, new Point(pt.x, pt.y + 1), end) ���W��
		 //visit(maze, new Point(pt.x+1, pt.y), end) ���k��
		 //visit(maze, new Point(pt.x, pt.y - 1), end) ���U��
		 //visit(maze, new Point(pt.x-1, pt.y), end) ������
		 
		 /**
		  * �����W���i�滼�j
		  * �Ĥ@���W���L�k������
		  */
		 
		 /**
		  * �W���L�k���|�^��
		  */
	        return visit(maze, new Point(pt.x, pt.y + 1), end) ||
	               visit(maze, new Point(pt.x + 1, pt.y), end) ||
	               visit(maze, new Point(pt.x, pt.y - 1), end) ||
	               visit(maze, new Point(pt.x - 1, pt.y), end);
	    }
	 
	public static void main(String[] args) {
		
		
		//�ۭq�@�Ӱg�c 7*7
		int[][] maze = new int[][]{
			{2, 2, 2, 2, 2, 2, 2}, 
            {2, 0, 0, 0, 0, 0, 2}, 
            {2, 0, 2, 0, 2, 0, 2}, 
            {2, 0, 0, 2, 0, 2, 2}, 
            {2, 2, 0, 2, 0, 2, 2}, 
            {2, 0, 0, 0, 0, 0, 2}, 
            {2, 2, 2, 2, 2, 2, 2}};
        //�ǤJmaze�g�c��go �禡
        //�ǤJ�_�l�I
        //�ǤJ�������I
        maze =  Mouse.go(maze, new Point(1, 1), new Point(5, 5));
        printMaze(maze);
//		for(int[] row : Mouse.go(maze, new Point(1, 1), new Point(5, 5))) {
//			//���^���G���}�C�g�c�^�Ǩ̷Ӱ}�CROW��X
//			//�b�N�C�C�����ޭȿ�X,��D���P�����I��X
//			for(int block : row) switch(block) {
//				case 0: System.out.print("0"); break;
//				case 1: System.out.print("1"); break;
//				case 2: System.out.print("2");
//			}
//			System.out.println("");
//		}
//		System.out.println(Mouse.isEnd(maze, new Point(5, 5)) 
//				? "���X�f" : "�S�����X�f�I");
	}
	
	public static void printMaze(int[][] maze) {

		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
}
