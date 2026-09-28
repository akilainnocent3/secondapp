package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class whg {
    public final hng a;
    public final float b;

    public whg(float f, hng hngVar) {
        if (hngVar == null) {
            hb5.a("data cannot be null.");
            throw null;
        }
        this.b = f;
        this.a = hngVar;
    }

    public final String toString() {
        return this.a.a;
    }
}
