package fun.mike.map.alpha;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class MutableFactory {
    /**
     * Returns an empty mutable map.
     * @param <K> The type of key
     * @param <V> The type of value
     * @return An empty mutable map
     */
    public static <K, V> Map<K, V> mutableMapOf() {
        return new HashMap<>();
    }

    /**
     * Returns a mutable map containing the given keys and values. Takes an
     * alternating sequence of keys and values.
     * @param k1 A key
     * @param v1 A value for the previous key
     * @param <K> The type of key
     * @param <V> The type of value
     * @return A mutable map
     */
    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23, K k24, V v24) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        map.put(k24, v24);
        return map;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23, K k24, V v24,
            K k25, V v25) {
        Map<K, V> map = new HashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        map.put(k24, v24);
        map.put(k25, v25);
        return map;
    }

    /**
     * Returns an empty ordered mutable map.
     * @param <K> The type of key
     * @param <V> The type of value
     * @return An empty ordered mutable map
     */
    public static <K, V> Map<K, V> mutableOrderedMapOf() {
        return new LinkedHashMap<>();
    }

    /**
     * Returns an ordered mutable map containing the given keys and values.
     * Takes an alternating sequence of keys and values. Maintains the order
     * in which the key-value pairs are passed.
     * @param k1 A key
     * @param v1 A value for the previous key
     * @param <K> The type of key
     * @param <V> The type of value
     * @return An ordered mutable map
     */
    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23, K k24, V v24) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        map.put(k24, v24);
        return map;
    }

    public static <K, V> Map<K, V> mutableOrderedMapOf(K k1, V v1, K k2, V v2,
            K k3, V v3, K k4, V v4,
            K k5, V v5, K k6, V v6,
            K k7, V v7, K k8, V v8,
            K k9, V v9, K k10, V v10,
            K k11, V v11, K k12, V v12,
            K k13, V v13, K k14, V v14,
            K k15, V v15, K k16, V v16,
            K k17, V v17, K k18, V v18,
            K k19, V v19, K k20, V v20,
            K k21, V v21, K k22, V v22,
            K k23, V v23, K k24, V v24,
            K k25, V v25) {
        Map<K, V> map = new LinkedHashMap<>();
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        map.put(k6, v6);
        map.put(k7, v7);
        map.put(k8, v8);
        map.put(k9, v9);
        map.put(k10, v10);
        map.put(k11, v11);
        map.put(k12, v12);
        map.put(k13, v13);
        map.put(k14, v14);
        map.put(k15, v15);
        map.put(k16, v16);
        map.put(k17, v17);
        map.put(k18, v18);
        map.put(k19, v19);
        map.put(k20, v20);
        map.put(k21, v21);
        map.put(k22, v22);
        map.put(k23, v23);
        map.put(k24, v24);
        map.put(k25, v25);
        return map;
    }
}
