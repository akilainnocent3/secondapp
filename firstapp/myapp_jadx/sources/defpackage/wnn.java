package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wnn<T> implements k730 {
    public final T a;

    public wnn(T t) {
        this.a = t;
    }

    public static wnn a(Object obj) {
        if (obj != null) {
            return new wnn(obj);
        }
        bmy.a("instance cannot be null");
        return null;
    }

    @Override // defpackage.m730
    public final T get() {
        return this.a;
    }
}
