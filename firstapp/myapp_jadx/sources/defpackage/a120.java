package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a120 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof a120) {
            return this.a == ((a120) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
