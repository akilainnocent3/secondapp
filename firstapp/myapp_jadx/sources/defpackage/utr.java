package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class utr<T> implements n730<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile n730<T> b;

    public utr(n730<T> n730Var) {
        this.b = n730Var;
    }

    @Override // defpackage.n730
    public final T get() {
        T t;
        T t2 = (T) this.a;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
