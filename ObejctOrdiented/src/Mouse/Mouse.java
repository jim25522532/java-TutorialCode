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
		//開始找迷宮
        visit(maze, start, end);
        //當訪問完所有迷宮後把迷宮輸出
        return maze;
    }
	
	public static boolean visit(int[][] maze, Point pt, Point end) {
		//判斷是否有拜訪過位於Point pt x,y座標值
		//如果true 就是沒拜訪過會進來判斷裡面
        if(isVisitable(maze, pt)) {
        	
        	//那將此點設為1
            maze[pt.x][pt.y] = 1;
            printMaze(maze);
            //判斷是否已經到了終點 如果回傳true代表已經找到終點
            
            
           
            
            // isEnd 是true代表已找到終點 如果是false則是還沒找到終點
            
            // 沒有找到終點且沒路走時將 x,y設為0 
            if(!isEnd(maze, end) && !findWay(maze, pt, end)) {
            	System.out.println("沒路走倒退走");
            	System.out.println("pt.x:"+pt.x);
            	System.out.println("pt.y:"+pt.y);
                maze[pt.x][pt.y] = 0;
            }
        }
        //回傳是否找到終點 
        return isEnd(maze, end);
    }
	
	//如果拜訪過此點的話則回傳 false
	//如果還沒拜訪過此點的話則回傳 true
	 public static boolean isVisitable(int[][] maze, Point pt) {
		 	System.out.println("是否拜訪過"+pt.x);
		 	System.out.println("是否拜訪過"+pt.y);
		 	
		 	System.out.println(maze[pt.x][pt.y] == 0);
	        return maze[pt.x][pt.y] == 0;
	 }
	 

	 //當迷宮的結束的點數值為1的時候代表有找到終點
	 //否則則沒有找到終點
	 public static boolean isEnd(int[][] maze, Point end) {
//		 System.out.println(maze[end.x][end.y]== 1);
	        return maze[end.x][end.y] == 1;
	 }
	 //開始進行遞迴找路
	 public static boolean findWay(int[][] maze, Point pt, Point end) {
		 //visit(maze, new Point(pt.x, pt.y + 1), end) 往上走
		 //visit(maze, new Point(pt.x+1, pt.y), end) 往右邊
		 //visit(maze, new Point(pt.x, pt.y - 1), end) 往下走
		 //visit(maze, new Point(pt.x-1, pt.y), end) 往左走
		 
		 /**
		  * 先往上走進行遞迴
		  * 第一次上面無法走結束
		  */
		 
		 /**
		  * 上面無法走會回到
		  */
	        return visit(maze, new Point(pt.x, pt.y + 1), end) ||
	               visit(maze, new Point(pt.x + 1, pt.y), end) ||
	               visit(maze, new Point(pt.x, pt.y - 1), end) ||
	               visit(maze, new Point(pt.x - 1, pt.y), end);
	    }
	 
	public static void main(String[] args) {
		
		
		//自訂一個迷宮 7*7
		int[][] maze = new int[][]{
			{2, 2, 2, 2, 2, 2, 2}, 
            {2, 0, 0, 0, 0, 0, 2}, 
            {2, 0, 2, 0, 2, 0, 2}, 
            {2, 0, 0, 2, 0, 2, 2}, 
            {2, 2, 0, 2, 0, 2, 2}, 
            {2, 0, 0, 0, 0, 0, 2}, 
            {2, 2, 2, 2, 2, 2, 2}};
        //傳入maze迷宮給go 函式
        //傳入起始點
        //傳入結束的點
        maze =  Mouse.go(maze, new Point(1, 1), new Point(5, 5));
        printMaze(maze);
//		for(int[] row : Mouse.go(maze, new Point(1, 1), new Point(5, 5))) {
//			//當返回後把二維陣列迷宮回傳依照陣列ROW輸出
//			//在將每列的索引值輸出,把道路與結束點輸出
//			for(int block : row) switch(block) {
//				case 0: System.out.print("0"); break;
//				case 1: System.out.print("1"); break;
//				case 2: System.out.print("2");
//			}
//			System.out.println("");
//		}
//		System.out.println(Mouse.isEnd(maze, new Point(5, 5)) 
//				? "找到出口" : "沒有找到出口！");
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
