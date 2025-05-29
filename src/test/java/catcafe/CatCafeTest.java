package catcafe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class CatCafeTest {
    private CatCafe cc;

    @BeforeEach
    public void setUp() {
        cc = new CatCafe();
    }

    @Test
    public void testAddCat() {
        FelineOverLord c = new FelineOverLord("Cat", 10);

        cc.addCat(c);
        assertEquals(cc.getCatCount(), 1);
    }

    @Test
    public void testGetCatByName() {
        FelineOverLord c1 = new FelineOverLord("cat1", 10);
        FelineOverLord c2 = new FelineOverLord("cat2", 20);

        cc.addCat(c1);
        cc.addCat(c2);

        assertEquals(cc.getCatByName("cat1"), c1);
    }

    @Test
    public void testGetCatByNameNegative() {
        FelineOverLord c = new FelineOverLord("cat", 10);

        cc.addCat(c);

        assertNull(cc.getCatByName("NONE"));
    }

    @Test
    public void testGetCatByNameNull() {
        FelineOverLord c = new FelineOverLord("cat", 10);

        cc.addCat(c);

        assertNull(cc.getCatByName(null));
    }

    @Test
    public void testGetCatByWeight() {
        FelineOverLord c1 = new FelineOverLord("cat1", 10);
        FelineOverLord c2 = new FelineOverLord("cat2", 20);

        cc.addCat(c1);
        cc.addCat(c2);

        assertEquals(cc.getCatByWeight(9, 11), c1);
    }

    @Test
    public void testGetCatByWeightNoResult() {
        FelineOverLord c1 = new FelineOverLord("cat1", 10);
        FelineOverLord c2 = new FelineOverLord("cat2", 20);

        cc.addCat(c1);
        cc.addCat(c2);

        assertNull(cc.getCatByWeight(30, 40));
    }

    @Test
    public void testGetCatByWeightNegative() {
        FelineOverLord c = new FelineOverLord("cat", 10);

        cc.addCat(c);

        assertNull(cc.getCatByWeight(-10, 100));
    }

    @Test
    public void testGetCatByWeightInverted() {
        FelineOverLord c = new FelineOverLord("cat", 10);

        cc.addCat(c);

        assertNull(cc.getCatByWeight(100, 10));
    }
}
