package fun.mike.map.alpha;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import fun.mike.validation.UrlValidator;

public class Get {
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

    public static <T> String populatedUrl(Map<String, T> map, String key) {
        String url = populatedStringOfType(map, key, "URL");
        UrlValidator.http(url)
                .orThrow(String.format("Invalid value \"%s\" for URL property \"%s\"", url, key));
        return url;
    }

    public static <T> String populatedString(Map<String, T> map, String key) {
        return populatedStringOfType(map, key, "string");
    }

    public static <T> String requiredString(Map<String, T> map, String key) {
        return requiredStringOfType(map, key, "string");
    }

    public static <T> String populatedStringOfType(Map<String, T> map, String key, String type) {
        String value = requiredStringOfType(map, key, type);

        if (value.trim().equals("")) {
            String message = String.format("Value for \"%s\" property %s was blank.",
                                           type,
                                           key);
            throw new IllegalArgumentException(message);
        }

        return value;
    }

    public static <T> String requiredStringOfType(Map<String, T> map, String key, String type) {
        if (!map.containsKey(key)) {
            String message = String.format("Missing required %s property \"%s\".",
                                           type,
                                           key);
            throw new NoSuchElementException(message);
        }

        return (String) map.get(key);
    }

    public static <T> T required(Map<String, T> map, String key) {
        if (!map.containsKey(key)) {
            String message = String.format("Missing required property \"%s\".",
                                           key);
            throw new NoSuchElementException(message);
        }

        return map.get(key);
    }
}
