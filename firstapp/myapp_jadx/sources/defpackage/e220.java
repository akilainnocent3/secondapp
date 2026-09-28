package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e220<T> extends c220<T> {
    public final Object c;

    public e220(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.c220, defpackage.b220
    public final boolean a(T t) {
        boolean zA;
        t.getClass();
        synchronized (this.c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // defpackage.c220, defpackage.b220
    public final T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
