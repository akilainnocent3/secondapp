package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class abr {
    public final ijf0 a;
    public final sx70 b;
    public final ux70 c;

    public abr(ijf0 ijf0Var, sx70 sx70Var, ux70 ux70Var) {
        ijf0Var.getClass();
        sx70Var.getClass();
        ux70Var.getClass();
        this.a = ijf0Var;
        this.b = sx70Var;
        this.c = ux70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abr)) {
            return false;
        }
        abr abrVar = (abr) obj;
        return Intrinsics.g(this.a, abrVar.a) && Intrinsics.g(this.b, abrVar.b) && Intrinsics.g(this.c, abrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LNSearchState(searchQuery=" + this.a + ", searchResult=" + this.b + ", tag=" + this.c + ")";
    }

    public abr() {
        this(0);
    }

    public /* synthetic */ abr(int i) {
        this(new ijf0((String) null, 0L, 7), sx70.b.a, ux70.a.a);
    }
}
