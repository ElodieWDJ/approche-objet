package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		Date d1 = new Date();
		@SuppressWarnings("deprecation")
		Date d2 = new Date (120, 6, 8);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMMM/yyyy HH:mm:ss",  Locale.CHINESE);

		Date date = new Date();
		
		String dateString = formateur.format(date);
		
		System.out.println(dateString);
		
		Date date19Mai= new Date (116, 4, 19, 23, 59, 30);
		
		SimpleDateFormat formateurComplet = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(date19Mai));
		
		
		
		
	}

}
