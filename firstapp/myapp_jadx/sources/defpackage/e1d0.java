package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e1d0 {
    public final lwc0 a;
    public final owc0 b;
    public final hyc0 c;

    public e1d0(lwc0 lwc0Var, owc0 owc0Var, hyc0 hyc0Var) {
        owc0Var.getClass();
        hyc0Var.getClass();
        this.a = lwc0Var;
        this.b = owc0Var;
        this.c = hyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1d0)) {
            return false;
        }
        e1d0 e1d0Var = (e1d0) obj;
        return this.a.equals(e1d0Var.a) && Intrinsics.g(this.b, e1d0Var.b) && Intrinsics.g(this.c, e1d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyPenaltySelection(event=" + this.a + ", market=" + this.b + ", outcome=" + this.c + ")";
    }
}
