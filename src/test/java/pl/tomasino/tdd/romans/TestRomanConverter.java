package pl.tomasino.tdd.romans;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class TestRomanConverter {

	RomansConverter converter;

	@Before
	public void setUp() {
		converter = new RomansConverter();
	}

	
	@Test
	public void shoudReturnIWhen1() {

		Assertions.assertThat(converter.convert(1)).isEqualTo("I");
	}

	@Test
	public void shouldReturnIIWhen2() {

		Assertions.assertThat(converter.convert(2)).isEqualTo("II");
	}

	@Test
	public void shouldReturnIIIWhen3() {

		Assertions.assertThat(converter.convert(3)).isEqualTo("III");
	}

	@Test
	public void shouldReturnIVWhen4() {

		Assertions.assertThat(converter.convert(4)).isEqualTo("IV");
	}

	@Test
	public void shouldReturnVWhen5() {

		Assertions.assertThat(converter.convert(5)).isEqualTo("V");
	}

	@Test
	public void shouldReturnVIWhen6() {

		Assertions.assertThat(converter.convert(6)).isEqualTo("VI");
	}

	@Test
	public void shouldReturnVIIWhen7() {

		Assertions.assertThat(converter.convert(7)).isEqualTo("VII");
	}

	@Test
	public void shouldReturnVIIIWhen8() {

		Assertions.assertThat(converter.convert(8)).isEqualTo("VIII");
	}
	
	@Test
	public void shouldReturnIXWhen9() {

		Assertions.assertThat(converter.convert(9)).isEqualTo("IX");
	}
	
	@Test
	public void shouldReturnXWhen10() {

		Assertions.assertThat(converter.convert(10)).isEqualTo("X");
	}
	
	@Test
	public void shouldReturnXIWhen11() {

		Assertions.assertThat(converter.convert(11)).isEqualTo("XI");
	}
	
	@Test
	public void shouldReturnXIIWhen12() {

		Assertions.assertThat(converter.convert(12)).isEqualTo("XII");
	}
	
	@Test
	public void shouldReturnXIIIWhen13() {

		Assertions.assertThat(converter.convert(13)).isEqualTo("XIII");
	}
	
	@Test
	public void shouldReturnXIVWhetn14() {

		Assertions.assertThat(converter.convert(14)).isEqualTo("XIV");
	}
	
	
	@Test
	public void shouldReturnXVWhen15() {

		Assertions.assertThat(converter.convert(15)).isEqualTo("XV");
	}
	
	
	
	@Test
	public void shouldReturnXVIWhen16() {

		Assertions.assertThat(converter.convert(16)).isEqualTo("XVI");
	}
	
	@Test
	public void shouldReturnXVIIWhen17() {

		Assertions.assertThat(converter.convert(17)).isEqualTo("XVII");
	}
	
	
	@Test
	public void shouldReturnXVIIIWhen18() {

		Assertions.assertThat(converter.convert(18)).isEqualTo("XVIII");
	}
	
	
	@Test
	public void shouldReturnXIXWhen19() {

		Assertions.assertThat(converter.convert(19)).isEqualTo("XIX");
	}
	
	
	@Test
	public void shouldReturnXXIWhen21() {

		Assertions.assertThat(converter.convert(21)).isEqualTo("XXI");
	}

	
	@Test
	public void shouldReturnXXIIIWhen23() {

		Assertions.assertThat(converter.convert(23)).isEqualTo("XXIII");
	}

	@Test
	public void shouldReturnXXXVWhen35() {

		Assertions.assertThat(converter.convert(35)).isEqualTo("XXXV");
	}

	@Test
	public void shouldReturnXLWhen40() {

		Assertions.assertThat(converter.convert(40)).isEqualTo("XL");
	}

	@Test
	public void shouldReturnLXIWhen61() {

		Assertions.assertThat(converter.convert(61)).isEqualTo("LXI");
	}
	
//	@Test
//	public void shouldReturnlagestDivider10When10() {
//		Assertions.assertThat(converter.getLargestDivider(10)).isEqualTo(10);
//	}
//	
//	
//	@Test
//	public void shouldReturnlagestDivider1When1() {
//		Assertions.assertThat(converter.getLargestDivider(1)).isEqualTo(1);
//	}
//	
//	
//	@Test
//	public void shouldReturnlagestDivider10When9() {
//		Assertions.assertThat(converter.getLargestDivider(9)).isEqualTo(10);
//	}
//	
//	@Test
//	public void shouldReturnlagestDivider5When4() {
//		Assertions.assertThat(converter.getLargestDivider(4)).isEqualTo(5);
//	}
//	
//	
//	@Test
//	public void shouldReturnlagestDivider50When61() {
//		Assertions.assertThat(converter.getLargestDivider(61)).isEqualTo(50);
//	}
//	
//	@Test
//	public void shouldReturnLowerTens() {
//
//		Assertions.assertThat(converter.getLowerTens(10)).isEqualTo(1);		
//	}
//	
	
}
