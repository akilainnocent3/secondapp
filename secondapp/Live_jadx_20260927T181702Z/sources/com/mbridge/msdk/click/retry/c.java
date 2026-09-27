package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f65050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65052c;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f65051b = i10;
        this.f65050a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f65050a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f65051b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f65050a.remove(str);
                if (bVarRemove != null) {
                    this.f65052c -= b(str, bVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f65052c += b(str, bVar);
                    b bVarPut = this.f65050a.put(str, bVar);
                    if (bVarPut != null) {
                        this.f65052c -= b(str, bVarPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f65051b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f65052c < 0 || (this.f65050a.isEmpty() && this.f65052c != 0)) {
                        break;
                    }
                    if (this.f65052c > i10 && !this.f65050a.isEmpty()) {
                        Map.Entry<String, b> next = this.f65050a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f65050a.remove(key);
                            this.f65052c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f65050a.keySet());
        }
        return hashSet;
    }
}
