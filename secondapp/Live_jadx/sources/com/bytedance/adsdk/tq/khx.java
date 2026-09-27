package com.bytedance.adsdk.tq;

import com.ironsource.C4235d4;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class khx<K, V> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f32100hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f32101hv;
    private final LinkedHashMap<K, V> hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f32102ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f32103sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f32104tq;
    private int vgm;
    private int vy;

    public khx(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f32103sd = i10;
        this.hww = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int sd(K k10, V v10) {
        int iTq = tq(k10, v10);
        if (iTq >= 0) {
            return iTq;
        }
        throw new IllegalStateException("Negative size: " + k10 + C4235d4.j.f61456b + v10);
    }

    public final V hww(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.hww.get(k10);
                if (v10 != null) {
                    this.vgm++;
                    return v10;
                }
                this.f32102ok++;
                V vTq = tq(k10);
                if (vTq == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f32101hv++;
                        vPut = this.hww.put(k10, vTq);
                        if (vPut != null) {
                            this.hww.put(k10, vPut);
                        } else {
                            this.f32104tq += sd(k10, vTq);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                hww(this.f32103sd);
                return vTq;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.vgm;
            i11 = this.f32102ok + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f32103sd), Integer.valueOf(this.vgm), Integer.valueOf(this.f32102ok), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int tq(K k10, V v10) {
        return 1;
    }

    public V tq(K k10) {
        return null;
    }

    public final V hww(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.vy++;
                    this.f32104tq += sd(k10, v10);
                    vPut = this.hww.put(k10, v10);
                    if (vPut != null) {
                        this.f32104tq -= sd(k10, vPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hww(this.f32103sd);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void hww(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f32104tq < 0 || (this.hww.isEmpty() && this.f32104tq != 0)) {
                        break;
                    }
                    if (this.f32104tq > i10 && !this.hww.isEmpty()) {
                        Map.Entry<K, V> next = this.hww.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.hww.remove(key);
                        this.f32104tq -= sd(key, value);
                        this.f32100hu++;
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
