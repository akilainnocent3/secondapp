package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ize<T> implements m730<T> {
    public static final Object c = new Object();
    public volatile m730<T> a;
    public volatile Object b;

    public static <P extends m730<T>, T> m730<T> a(P p) {
        if (p instanceof ize) {
            return p;
        }
        ize izeVar = new ize();
        izeVar.b = c;
        izeVar.a = p;
        return izeVar;
    }

    @Override // defpackage.m730
    public final T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
