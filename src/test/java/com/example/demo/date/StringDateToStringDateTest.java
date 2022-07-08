package com.example.demo.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

import static org.junit.jupiter.api.Assertions.*;

class StringDateToStringDateTest {

	@Test
	public void dateTest() {

		assertEquals("2022-07-08", LocalDate.now().toString());
		assertEquals("2021-07-08", LocalDate.now().minusYears(1).toString());


		final DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.YEAR, 4)
				.appendValue(ChronoField.MONTH_OF_YEAR, 2)
				.appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
		
		final String format = LocalDate.now().format(dateTimeFormatter);
		
		assertEquals("20220708", format);
	}
}