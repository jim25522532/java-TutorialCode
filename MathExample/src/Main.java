import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 1000;
		
		int itemPrice =2000;
		int angle = -34;
		int circle = 9;
		System.out.println(Math.max(money, itemPrice)); // ��X��ӰѼƤ��̤j���ƭ�
		System.out.println(Math.min(money, itemPrice)); // ��X��ӰѼƤ��̤j���ƭ�
		System.out.println(Math.abs(angle)); //34
		System.out.println(Math.pow(10,2)); //100.0
		System.out.println(Math.random());
		
		double height = 181.4;
		System.out.println(Math.floor(height));
		System.out.println(Math.round(height));
		System.out.println(Math.ceil(height));
		
		Random random = new Random();
		System.out.println(random.nextInt(42));
		System.out.println(random.nextDouble());

		
		Date date = new Date(); //new �@��date����
		System.out.println(date.toString()); // ���o��e��ڼзǮɶ��w�]���@�~�t�ήɶ�
		System.out.println("date date:"+date.getDate()); //���
		System.out.println("date from 1900 to :"+date.getYear()); //�q1900~�{�b�L�F�X�~
		System.out.println("date month:"+date.getMonth()); //���o���
		System.out.println("date day:"+date.getDay()); //�P���X
		
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd"); //new �@�Ӥ���ഫ�榡����
		System.out.println(ft.format(date)); //�Q��SimpleDateFormat�ۭq�榡�N�����X
			
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = Calendar.getInstance();

		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); // �@�� = 0, �Q�G�� = 11 (�}�C) base:0����
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);        // 12�p��
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24�p�ɨ�
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);


			
		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);
			
		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
	
		
		
	}

}
