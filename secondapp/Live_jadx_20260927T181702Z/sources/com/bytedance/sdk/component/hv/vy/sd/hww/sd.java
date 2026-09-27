package com.bytedance.sdk.component.hv.vy.sd.hww;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> hww = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34789tq;

    public sd(int i10) {
        this.f34789tq = i10;
    }

    public synchronized V hww(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.f34789tq <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.hww.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.hww.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f34789tq), Integer.valueOf(this.hww.size()));
    }

    public synchronized void hww(K k10, V v10) {
        if (this.f34789tq <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.hww.put(k10, new SoftReference<>(v10));
        int size = this.hww.size();
        int i10 = this.f34789tq;
        if (size > i10) {
            hww((int) (((double) i10) * 0.7d));
        }
    }

    public synchronized void hww(int i10) {
        int size = this.hww.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.hww.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.hww.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}
