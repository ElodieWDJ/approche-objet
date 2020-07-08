package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016,  4, 19, 23, 59, 30);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMMM/yyyy");
		System.out.println(formateur.format(date));
		
		Calendar calJour = Calendar.getInstance();
		Date dateJour = calJour.getTime();
		
		SimpleDateFormat formateurComplet = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		System.out.println(formateurComplet.format(dateJour));
		
		SimpleDateFormat formateurToutesLettresFR = new SimpleDateFormat ("EEEEE dd MMMMM yyyy à HH:mm:ss");

	}

}
