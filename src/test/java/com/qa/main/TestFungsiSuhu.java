package com.qa.main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.qa.main.function.FunctionSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiSuhu {

	FunctionSuhu function;
	
	@Before
	public void setUp() throws Exception {
		function = new FunctionSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_suhu.csv")
	public void testKonversi(double fahrenheit, double celcius) {
		assertEquals(celcius, function.Konversi(fahrenheit), 0.01);
	}

}
