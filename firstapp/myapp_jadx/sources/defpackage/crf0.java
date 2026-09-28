package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class crf0 implements wvt {
    public final boolean a;
    public final erf0 b;
    public final drf0 c;
    public final ix30 d;

    public crf0(erf0 erf0Var, drf0 drf0Var, ix30 ix30Var, int i) {
        boolean z = (i & 1) == 0;
        erf0Var = (i & 2) != 0 ? null : erf0Var;
        drf0Var = (i & 4) != 0 ? null : drf0Var;
        ix30Var = (i & 8) != 0 ? null : ix30Var;
        this.a = z;
        this.b = erf0Var;
        this.c = drf0Var;
        this.d = ix30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crf0)) {
            return false;
        }
        crf0 crf0Var = (crf0) obj;
        return this.a == crf0Var.a && Intrinsics.g(this.b, crf0Var.b) && Intrinsics.g(this.c, crf0Var.c) && Intrinsics.g(this.d, crf0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        erf0 erf0Var = this.b;
        int iHashCode2 = (iHashCode + (erf0Var == null ? 0 : erf0Var.hashCode())) * 31;
        drf0 drf0Var = this.c;
        int iHashCode3 = (iHashCode2 + (drf0Var == null ? 0 : drf0Var.a.hashCode())) * 31;
        ix30 ix30Var = this.d;
        return iHashCode3 + (ix30Var != null ? ix30Var.hashCode() : 0);
    }

    public final String toString() {
        return "Content(inviteOnly=" + this.a + ", wagerProgress=" + this.b + ", tierStatusHint=" + this.c + ", rakebackInfo=" + this.d + ")";
    }

    public crf0() {
        this(null, null, null, 15);
    }
}
