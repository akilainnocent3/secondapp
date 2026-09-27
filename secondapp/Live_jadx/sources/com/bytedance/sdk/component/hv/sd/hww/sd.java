package com.bytedance.sdk.component.hv.sd.hww;

import android.util.Log;
import com.ironsource.C4235d4;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd<K, V> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34709hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34710hv;
    private final LinkedHashMap<K, SoftReference<V>> hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f34711ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34712sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34713tq;
    private int vgm;
    private int vy;

    public sd(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f34712sd = i10;
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
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.hww.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.vgm++;
                        return v10;
                    }
                    this.hww.remove(k10);
                } else {
                    v10 = null;
                }
                this.f34711ok++;
                V vTq = tq(k10);
                if (vTq == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f34710hv++;
                        SoftReference<V> softReferencePut = this.hww.put(k10, new SoftReference<>(vTq));
                        if (softReferencePut != null) {
                            v10 = softReferencePut.get();
                        }
                        if (v10 != null) {
                            this.hww.put(k10, softReferencePut);
                        } else {
                            this.f34713tq += sd(k10, vTq);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (v10 != null) {
                    return v10;
                }
                hww(this.f34712sd);
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
            i11 = this.f34711ok + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f34712sd), Integer.valueOf(this.vgm), Integer.valueOf(this.f34711ok), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public int tq(K k10, V v10) {
        return 1;
    }

    public V tq(K k10) {
        return null;
    }

    public final V hww(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.vy++;
                    this.f34713tq += sd(k10, v10);
                    SoftReference<V> softReferencePut = this.hww.put(k10, new SoftReference<>(v10));
                    if (softReferencePut != null) {
                        v11 = softReferencePut.get();
                        if (v11 != null) {
                            this.f34713tq -= sd(k10, v11);
                        }
                    } else {
                        v11 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hww(this.f34712sd);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public void hww(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f34713tq < 0 || (this.hww.isEmpty() && this.f34713tq != 0)) {
                        break;
                        break;
                    }
                    if (this.f34713tq <= i10) {
                        return;
                    }
                    Map.Entry<K, SoftReference<V>> next = this.hww.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    K key = next.getKey();
                    SoftReference<V> value = next.getValue();
                    this.hww.remove(key);
                    if (value != null) {
                        this.f34713tq -= sd(key, value.get());
                    }
                    this.f34709hu++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.f34713tq + ", maxSize: " + i10);
        this.f34713tq = 0;
        this.hww.clear();
    }
}
