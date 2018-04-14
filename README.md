# map-support

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fun.mike/map-support-alpha)

Map utilities for Java.

## Usage

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



## Copyright and License

This project is licensed under the terms of the Apache 2.0 license.
