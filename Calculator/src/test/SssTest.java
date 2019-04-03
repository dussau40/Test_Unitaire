package test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.MyList;
import main.MyListImpl;

public class SssTest {

	private static MyList<Integer> sut;  //la classe � tester
	private static int expectedSize;  // la taille � l'origine
	private static Properties prop;  // les propri�t�s
	private static List<Integer> testSet;  //les nombres que nous mettrons dans notre class
	private static FileInputStream propFile;  //le fichier de propri�t�s
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		prop = new Properties();
		testSet = new LinkedList<Integer>();
		propFile = new FileInputStream("src/config.properties"); //charge le fichier de propri�t�s
		prop.load(propFile);
		expectedSize = Integer.parseInt(prop.getProperty("taille")); //parse la taille
		String numbers = prop.getProperty("nombre"); //r�cup�re les nombre � mettre dans la liste
		for(String i : numbers.split(" ")) { //pour chaque nombre 
			testSet.add(Integer.parseInt(i.trim()));  // l'enregistrer en tant que int
	        }
	        sut = new MyListImpl<Integer>();  // instancier la classe � tester
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		propFile.close();   // on ferme le fichier � la fin du test
	}

	@Before
	public void setUp() throws Exception {
		for (int i : testSet) {
			sut.add(new Integer(i));   //on ajoute les nombres au d�but de chaque test
	        }
	}

	@After
	public void tearDown() throws Exception {
		sut.reset();  // � la fin de chaque test, on reset notre liste
	}



	@Test
	public void testMyListImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		assertEquals(expectedSize, sut.getSize());
		sut.add(new Integer(8));
		assertEquals(expectedSize+1, sut.getSize());
		for(int i = 0; i < testSet.size(); i++) {
			assertEquals(testSet.get(i), sut.getAt(i));
	        }
	}



	@Test
	public void testRemoveAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAt() {
		fail("Not yet implemented");
	}

}
