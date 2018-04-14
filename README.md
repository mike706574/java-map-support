# map-support

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha)
[![Javadocs](https://www.javadoc.io/badge/fun.mike/map-support-alpha.svg)](https://www.javadoc.io/doc/fun.mike/map-support-alpha)

Map utilities for Java.

## Examples

### Factory methods

#### Unmodifiable maps

Use `fun.mike.map.alpha.Factory/mapOf` to make unordered unmodifiable maps.

```java
import static fun.mike.map.alpha.Factory.mapOf;

Map<String, Integer> map = mapOf("foo", 1,
                                 "bar", 2);

// => {bar=2, foo=1} (java.util.Collections$UnmodifiableMap from java.util.HashMap)
```

#### Ordered unmodifiable maps

Use `fun.mike.map.alpha.Factory/orderedMapOf` to make ordered unmodifiable maps.

```java
import static fun.mike.map.alpha.Factory.orderedMapOf;

Map<String, Integer> map = orderedMapOf("foo", 1,
                                        "bar", 2);

// => {foo=1, bar=2} (java.util.Collections$UnmodifiableMap from java.util.LinkedHashMap)
```

#### Mutable maps

Use `fun.mike.map.alpha.MutableFactory/mutableMapOf` to make unordered mutable maps.

```java
import static fun.mike.map.alpha.Factory.mutableMapOf;

Map<String, Integer> map = mutableMapOf("foo", 1,
                                        "bar", 2);

// => {bar=2, foo=1} (java.util.HashMap)
```

#### Ordered mutable maps

Use `fun.mike.map.alpha.MutableFactory/mutableMapOf` to make ordered mutable maps.

```java
import static fun.mike.map.alpha.MutableFactory.mutableOrderedMapOf;

Map<String, Integer> map = mutableOrderedMapOf("foo", 1,
                                               "bar", 2);

// => {foo=1, bar=2} (java.util.LinkedHashMap)
```

### Access

Use `fun.mike.map.alpha.Get` to get validated values from maps.

#### Anything

```java
import static fun.mike.map.alpha.Get.required;

Map<String, Object> map = mapOf("foo", "bar");

required(map, "foo");
// => "bar"

required(map, "baz");
// => java.util.NoSuchElementException: Missing required property "baz".
```

#### Strings

Required strings:

```java
import static fun.mike.map.alpha.Get.requiredString;

Map<String, Object> map = mapOf("ok", "foo",
                                "text", 1);

requiredString(map, "ok");
// => "foo"

requiredString(map, "missing");
// => java.util.NoSuchElementException: Missing required string value for key "missing".

requiredString(map, "text");
// => java.lang.IllegalArgumentException: Value "1" of class "java.lang.Integer" for key "text" must be a string.
```

Populated strings:

```java
import static fun.mike.map.alpha.Get.populatedString;

Map<String, Object> map = mapOf("ok", "foo",
                                "empty", " ",
                                "text", 1);

populatedString(map, "ok");
// => "foo"

populated(map, "missing");
    // => java.util.NoSuchElementException: Missing required string value for key "missing".

populated(map, "empty");
// => java.util.NoSuchElementException: Value " " for key "empty" must be populated.

populatedString(map, "text");
// => java.lang.IllegalArgumentException: Value "1" of class "java.lang.Integer" for key "text" must be a string.
```

String URLs:

```java
import static fun.mike.map.alpha.Get.populatedString;

Map<String, Object> map = mapOf("valid", "http://foo.com",
                                "invalid", "hewa:/ea90mS-fwa");

populatedString(map, "valid");
// => "http://foo.com",

populatedString(map, "invalid");
// => java.lang.IllegalArgumentException: Invalid URL value "hewa:/ea90mS-fwa" for key "foo": Scheme "hewa" not allowed. Allowed schemes: http, https
```

## Build

[![CircleCI](https://circleci.com/gh/mike706574/java-map-support.svg?style=svg)](https://circleci.com/gh/mike706574/java-map-support)

## Copyright and License

This project is licensed under the terms of the Apache 2.0 license.
