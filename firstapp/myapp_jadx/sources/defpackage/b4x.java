package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class b4x {
    public final f4x a;
    public final boolean b;

    public b4x(f4x f4xVar, boolean z) {
        f4xVar.getClass();
        this.a = f4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4x)) {
            return false;
        }
        b4x b4xVar = (b4x) obj;
        return this.a == b4xVar.a && this.b == b4xVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NCTabState(tab=" + this.a + ", isNewMessage=" + this.b + ")";
    }
}
