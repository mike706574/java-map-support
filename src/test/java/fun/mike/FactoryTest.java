package fun.mike.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void zero() {
        Map<Object, Object> map = Factory.mapOf();
        assertTrue(map.isEmpty());
    }

    @Test
    public void one() {
        Map<String, Integer> map = Factory.mapOf("foo", 1);
        assertEquals(1, map.size());
        assertEquals(new Integer(1), (Integer) map.get("foo"));
    }

    @Test
    public void two() {
        Map<String, Object> map = Factory.mapOf("foo", 1, "bar", "five");
        assertEquals(2, map.size());
        assertEquals(1, map.get("foo"));
        assertEquals("five", map.get("bar"));
    }
}
