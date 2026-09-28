package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a160 {
    public float a = 0.0f;
    public boolean b = true;
    public c3c c = null;

    public a160(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a160)) {
            return false;
        }
        a160 a160Var = (a160) obj;
        return Float.compare(this.a, a160Var.a) == 0 && this.b == a160Var.b && Intrinsics.g(this.c, a160Var.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(Float.hashCode(this.a) * 31, 31, this.b);
        c3c c3cVar = this.c;
        return (iA + (c3cVar == null ? 0 : c3cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
