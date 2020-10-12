package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AgeCalculator2 {
	public int calculateAge(String date) throws ParseException, InvalidDOBException {
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		LocalDate bDay = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate today = LocalDate.now();
		Period p = Period.between(bDay, today);
		Date todayDate = new Date();
		if (d.after(todayDate))
			throw new InvalidDOBException();

		return p.getYears();

	}
}