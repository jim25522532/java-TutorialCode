import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 輸入兩個日期做相減與相加運算
 * @author chengHai
 *
 */
public class DateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/**
		 * 輸入格式為:
		 * yyyy-MM-dd HH:mm:ss
		 *
		 * yyyy:西元 ex:1996
		 * MM:月份 ex: 01  or 11
		 * dd:日期 ex: 01 or 30
		 * HH: 小時 ex: 23
		 * mm: 分鐘 ex: 59
		 * ss: 秒數 ex: 59
		 * 
		 * 
		 */
		String date1 = input.nextLine();
		String date2 = input.nextLine();
		
		
		/**
		 * 測資:
		 * 2018-09-15 10:00:00
		 * 2018-09-16 10:00:00
		 */
		
		/**
		 * 將日期轉換為format所制定的格式
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = null;
        Date d2 = null;
        
        try {
	        d1 = format.parse(date1);
	        d2 = format.parse(date2);
	
	        //毫秒 10^-3    ms單位
	        long diff = d2.getTime() - d1.getTime();
	
	        long diffSeconds = diff / 1000 % 60; 
	        long diffMinutes = diff / (60 * 1000) % 60;
	        long diffHours = diff / (60 * 60 * 1000) % 24;
	        long diffDays = diff / (24 * 60 * 60 * 1000);
	
	        System.out.println("兩個時間差：");
	        System.out.println(diffDays + " 天 ");
	        System.out.println(diffHours + " 小時");
	        System.out.println(diffMinutes + " 分鐘 ");
	        System.out.println(diffSeconds + " 秒數");
        }
        catch(Exception ex) {
        	ex.printStackTrace();
        }
	}

}
