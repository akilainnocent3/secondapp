package com.bytedance.sdk.component.hww;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class bs<K, V> {
    private final Map<K, V> hww = new HashMap();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Map<V, Set<K>> f34867tq = new HashMap();

    public void hww(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.hww.containsKey(k10)) {
                tq(k10);
            }
        }
        Set<K> hashSet = this.f34867tq.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f34867tq.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.hww.put(it.next(), v10);
        }
    }

    public void tq(K k10) {
        Set<K> set;
        V vRemove = this.hww.remove(k10);
        if (vRemove == null || (set = this.f34867tq.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.f34867tq.remove(vRemove);
        }
    }

    public V hww(K k10) {
        return this.hww.get(k10);
    }

    public void hww() {
        this.hww.clear();
        this.f34867tq.clear();
    }
}
