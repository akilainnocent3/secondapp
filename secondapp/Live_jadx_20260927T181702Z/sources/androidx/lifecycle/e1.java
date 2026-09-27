package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Map<String, Object> f13340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Set<Closeable> f13341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f13342c;

    public e1() {
        this.f13340a = new HashMap();
        this.f13341b = new LinkedHashSet();
        this.f13342c = false;
    }

    public static void d(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b(@NonNull Closeable closeable) {
        Set<Closeable> set = this.f13341b;
        if (set != null) {
            synchronized (set) {
                this.f13341b.add(closeable);
            }
        }
    }

    @k.j0
    public final void c() {
        this.f13342c = true;
        Map<String, Object> map = this.f13340a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.f13340a.values().iterator();
                    while (it.hasNext()) {
                        d(it.next());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Set<Closeable> set = this.f13341b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.f13341b.iterator();
                    while (it2.hasNext()) {
                        d(it2.next());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        f();
    }

    public <T> T e(String str) {
        T t10;
        Map<String, Object> map = this.f13340a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f13340a.get(str);
        }
        return t10;
    }

    public <T> T g(String str, T t10) {
        Object obj;
        synchronized (this.f13340a) {
            try {
                obj = this.f13340a.get(str);
                if (obj == null) {
                    this.f13340a.put(str, t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            t10 = (T) obj;
        }
        if (this.f13342c) {
            d(t10);
        }
        return t10;
    }

    public e1(@NonNull Closeable... closeableArr) {
        this.f13340a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f13341b = linkedHashSet;
        this.f13342c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }

    public void f() {
    }
}
