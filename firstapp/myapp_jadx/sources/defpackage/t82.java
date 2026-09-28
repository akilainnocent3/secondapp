package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t82 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof t82) {
            return Float.compare(this.a, ((t82) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
