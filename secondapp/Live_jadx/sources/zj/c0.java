package zj;

import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class c0<T> implements dl.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f161917c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f161918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile dl.b<T> f161919b;

    public c0(T t10) {
        this.f161918a = f161917c;
        this.f161918a = t10;
    }

    @h1
    public boolean a() {
        return this.f161918a != f161917c;
    }

    @Override // dl.b
    public T get() {
        T t10;
        T t11 = (T) this.f161918a;
        Object obj = f161917c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f161918a;
                if (t10 == obj) {
                    t10 = this.f161919b.get();
                    this.f161918a = t10;
                    this.f161919b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public c0(dl.b<T> bVar) {
        this.f161918a = f161917c;
        this.f161919b = bVar;
    }
}
