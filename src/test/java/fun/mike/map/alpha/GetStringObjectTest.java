package fun.mike.map.alpha;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class GetStringObjectTest {
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void requiredFound() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");
        assertEquals("bar", Get.required(map, "foo"));
    }

    @Test
    public void requiredMissing() {
        thrown.expect(NoSuchElementException.class);
        thrown.expectMessage("Missing required property \"foo\".");
        Map<String, Object> map = new HashMap<>();
        Get.required(map, "foo");
    }

    @Test
    public void requiredStringFound() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");
        assertEquals("bar", Get.requiredString(map, "foo"));
    }

    @Test
    public void requiredStringsCanBeEmpty() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "");
        assertEquals("", Get.requiredString(map, "foo"));
    }

    @Test
    public void requiredStringMissing() {
        thrown.expect(NoSuchElementException.class);
        thrown.expectMessage("Missing required string property \"foo\".");
        Map<String, Object> map = new HashMap<>();
        Get.requiredString(map, "foo");
    }

    @Test
    public void populatedStringFound() {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");
        assertEquals("bar", Get.populatedString(map, "foo"));
    }

    @Test
    public void populatedStringBlank() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Value for \"string\" property foo was blank.");
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "");
        assertEquals("", Get.populatedString(map, "foo"));
    }

    @Test
    public void populatedStringMissing() {
        thrown.expect(NoSuchElementException.class);
        thrown.expectMessage("Missing required string property \"foo\".");
        Map<String, Object> map = new HashMap<>();
        Get.populatedString(map, "foo");
    }
}
