package com.qa.main;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.qa.main.function.FunctionAirKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestFungsiAirKolam {

	FunctionAirKolam function;
	
	@Before
	public void setUp() throws Exception {
		function = new FunctionAirKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_keliling.csv")
	public void testKeliling(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.Keliling(panjang, lebar, tinggi), 0.0);
		
	}

	@Test
	@FileParameters("src/test/resources/skenario_volume.csv")
	public void testVolume(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.Volume(panjang, lebar, tinggi), 0.0);
	}


}
