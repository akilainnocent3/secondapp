package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class hze<T> implements l730<T>, str<T> {
    public static final Object c = new Object();
    public volatile l730<T> a;
    public volatile Object b = c;

    public hze(l730<T> l730Var) {
        this.a = l730Var;
    }

    public static <T> str<T> a(l730<T> l730Var) {
        if (l730Var instanceof str) {
            return (str) l730Var;
        }
        l730Var.getClass();
        return new hze(l730Var);
    }

    public static <T> l730<T> b(l730<T> l730Var) {
        l730Var.getClass();
        return l730Var instanceof hze ? l730Var : new hze(l730Var);
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
        }
        return t;
    }
}
