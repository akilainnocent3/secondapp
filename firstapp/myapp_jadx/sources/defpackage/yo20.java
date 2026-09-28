package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yo20<T> extends l2z<T> {
    public final T a;

    public yo20(T t) {
        this.a = t;
    }

    @Override // defpackage.l2z
    public final T a() {
        return this.a;
    }

    @Override // defpackage.l2z
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yo20) {
            return this.a.equals(((yo20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
