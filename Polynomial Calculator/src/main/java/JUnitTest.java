import java.time.LocalDate;
import java.util.ArrayList;

import jdk.nashorn.internal.ir.SplitReturn;
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {
    private static int nrTesteExecutate = 0;
    private static int nrTesteCuSucces = 0;
    private static Polinom polinom1;
    private static Polinom polinom2;
    Model model = new Model();

    public JUnitTest() {
        System.out.println("Constructor inaintea fiecarui test!");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Molinom m1 = new Molinom(2, 1);
        Molinom m2 = new Molinom(1, 0);
        ArrayList<Molinom> m = new ArrayList<>();
        m.add(m1);
        m.add(m2);
        polinom1 = new Polinom(m);  //2x+1
        Molinom mm1 = new Molinom(3, 1);
        Molinom mm2 = new Molinom(4, 0);
        ArrayList<Molinom> mm = new ArrayList<>();
        mm.add(mm1);
        mm.add(mm2);
        polinom2 = new Polinom(mm); //3x+4
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("O singura data dupa terminarea executiei setului de teste din clasa!");
        System.out.println("S-au executat " + nrTesteExecutate + " teste din care " + nrTesteCuSucces + " au avut succes!");

    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Incepe un nou test!");

        nrTesteExecutate++;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("S-a terminat testul curent!");
        System.out.println("NR TESTE SUCCES: " + nrTesteCuSucces);
    }

    @Test
    public void test1() {
        assertEquals(model.sum(polinom1, polinom2), "5x^1 + 5");
        nrTesteCuSucces++;
    }

    @Test
    public void test2() {
        assertEquals(model.min(polinom2, polinom1), "1x^1 + 3");
        nrTesteCuSucces++;
    }

    @Test
    public void test3() {
        assertEquals(model.mul(polinom2, polinom1), "6x^2 + 3x^1 + 8x^1 + 4");
        nrTesteCuSucces++;
    }

    @Test
    public void test4() {
        assertEquals(model.derivate(polinom1), "2");
        nrTesteCuSucces++;
    }

    @Test
    public void test5() {
        assertEquals(model.integer(polinom1), "1.0x^2.0 + 1.0x^1.0");
        nrTesteCuSucces++;
    }

}
