package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tt90<T> implements l730<T> {
    public static final Object c = new Object();
    public volatile l730<T> a;
    public volatile Object b;

    public static <T> l730<T> a(l730<T> l730Var) {
        if ((l730Var instanceof tt90) || (l730Var instanceof hze)) {
            return l730Var;
        }
        tt90 tt90Var = new tt90();
        tt90Var.b = c;
        tt90Var.a = l730Var;
        return tt90Var;
    }

    @Override // defpackage.m730
    public final T get() {
        T t = (T) this.b;
        if (t != c) {
            return t;
        }
        l730<T> l730Var = this.a;
        if (l730Var == null) {
            return (T) this.b;
        }
        T t2 = l730Var.get();
        this.b = t2;
        this.a = null;
        return t2;
    }
}
