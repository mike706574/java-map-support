package fun.mike.map.alpha;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import fun.mike.validation.UrlValidator;

public class Get {
    /**
     * Validates that the value from {@code map} for the given {@code key} is a
     * string and is present in {@code options}. Returns the value when valid;
     * otherwise, throws an {@code IllegalArgumentException}.
     * @param map a map
     * @param key a key
     * @param options acceptable values
     * @param <T> the type of value
     * @return The string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String requiredStringEnum(Map<String, T> map, String key, List<String> options) {
        String value = requiredString(map, key);
        List<String> uppercaseOptions = options.stream().map(String::toUpperCase).collect(Collectors.toList());
        if (!uppercaseOptions.contains(value.toUpperCase())) {
            String optionsStr = options.stream()
                    .map(option -> String.format("\"%s\"", option))
                    .collect(Collectors.joining(", "));
            String message = String.format("Unsupported value \"%s\" for enumerated string property \"%s\". Valid options: %s",
                                           value,
                                           key,
                                           optionsStr);
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is a
     * valid, populated string URL. Returns the value when valid; otherwise,
     * throws an {@code IllegalArgumentException}.
     * @param map a map
     * @param key a key
     * @param <T> the type of value
     * @return the string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String populatedUrl(Map<String, T> map, String key) {
        String url = populatedStringOfType(map, key, "URL");
        UrlValidator.http(url)
                .orThrow(String.format("Invalid URL value \"%s\" for key \"%s\"", url, key));
        return url;
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is a
     * populated string. Returns the value when valid; otherwise, throws an
     * {@code IllegalArgumentException}.
     * @param map A map
     * @param key A key
     * @param <T> The type of value
     * @return The string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String populatedString(Map<String, T> map, String key) {
        return populatedStringOfType(map, key, "string");
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is
     * present and a string. Returns the value when valid; otherwise, throws an
     * {@code IllegalArgumentException}.
     * @param map a map
     * @param key a key
     * @param <T> the type of value
     * @return the string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String requiredString(Map<String, T> map, String key) {
        return requiredStringOfType(map, key, "string");
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is
     * a populated string. Returns the value when valid; otherwise, throws an
     * {@code IllegalArgumentException}, referring to the value as being of
     * type{@code} type in the error message.
     * @param map a map
     * @param key a key
     * @param type a type label
     * @param <T> the type of value
     * @return the string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String populatedStringOfType(Map<String, T> map, String key, String type) {
        String value = requiredStringOfType(map, key, type);

        if (value.trim().equals("")) {
            String message = String.format("Value \"%s\" for key \"%s\" must be populated.",
                                           value,
                                           key);
            throw new IllegalArgumentException(message);
        }

        return value;
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is
     * a present and a string. Returns the value when valid; otherwise, throws
     * an {@code IllegalArgumentException}, referring to the value as being of
     * type{@code} type in the error message.
     * @param map a map
     * @param key a key
     * @param type a type label
     * @param <T> the type of value
     * @return the string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     * @throws java.lang.IllegalArgumentException if the value is in valid
     */
    public static <T> String requiredStringOfType(Map<String, T> map, String key, String type) {
        if (!map.containsKey(key)) {
            String message = String.format("Missing required %s value for key \"%s\".",
                                           type,
                                           key);
            throw new NoSuchElementException(message);
        }

        Object value = map.get(key);

        if (value == null) {
            return null;
        }

        if (value instanceof String) {
            return (String) value;
        }

        String message = String.format("Value \"%s\" of class \"%s\" for key \"%s\" must be a string.",
                                       value,
                                       value.getClass().getName(),
                                       key);
        throw new IllegalArgumentException(message);
    }

    /**
     * Validates that the value from {@code map} for the given {@code key} is
     * a present. Returns the value when present; otherwise, throws a
     * {@code NoSuchElementException}.
     * @param map a map
     * @param key a key
     * @param <T> the type of value
     * @return the string value
     * @throws java.util.NoSuchElementException if the required value is not
     * present
     */
    public static <T> T required(Map<String, T> map, String key) {
        if (!map.containsKey(key)) {
            String message = String.format("Missing required value for key \"%s\".",
                                           key);
            throw new NoSuchElementException(message);
        }

        return map.get(key);
    }
}
