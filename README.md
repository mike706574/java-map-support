# map-support

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha)

Map utilities for Java.

## Usage

Here are a few examples. Look at the tests if you want more.

### Making an unmodifiable map

Use `fun.mike.map.alpha.Factory/mapOf` to make unmodifiable maps.

```java
import static fun.mike.map.alpha.Factory.mapOf;

Map<String, Integer> map = mapOf("foo", 1,
                                 "bar", 2);

// => {bar=2, foo=1}
```

You'll get an instance of `java.util.Collections$UnmodifiableMap`, made from a `java.util.LinkedHashMap`.

## Copyright and License

This project is licensed under the terms of the Apache 2.0 license.
