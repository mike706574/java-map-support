package fun.mike.map.alpha;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import fun.mike.validation.UrlValidator;

public class Get {
    public static String requiredStringEnum(Map<String, Object> config, String key, List<String> options) {
        String value = requiredString(config, key);
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

    public static String populatedUrl(Map<String, Object> config, String key) {
        String url = populatedStringOfType(config, key, "URL");
        UrlValidator.http(url)
                .orThrow(String.format("Invalid value \"%s\" for URL property \"%s\"", url, key));
        return url;
    }

    public static String populatedString(Map<String, Object> config, String key) {
        return populatedStringOfType(config, key, "string");
    }

    public static String requiredString(Map<String, Object> config, String key) {
        return requiredStringOfType(config, key, "string");
    }

    public static String populatedStringOfType(Map<String, Object> config, String key, String type) {
        String value = requiredStringOfType(config, key, type);

        if (value.trim().equals("")) {
            String message = String.format("Value for \"%s\" property %s was blank.",
                    type,
                    key);
            throw new IllegalArgumentException(message);
        }

        return value;
    }

    public static String requiredStringOfType(Map<String, Object> config, String key, String type) {
        if (!config.containsKey(key)) {
            String message = String.format("Missing required %s property \"%s\".",
                    type,
                    key);
            throw new NoSuchElementException(message);
        }

        return (String) config.get(key);
    }
}
