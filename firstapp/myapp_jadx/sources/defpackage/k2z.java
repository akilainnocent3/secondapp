package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class k2z<T> {
    public final T a;

    public k2z(T t) {
        if (t != null) {
            this.a = t;
        } else {
            bmy.a("value for optional is empty.");
            throw null;
        }
    }

    public final T a() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        ibh0.a("No value present");
        return null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public k2z() {
        this.a = null;
    }
}
