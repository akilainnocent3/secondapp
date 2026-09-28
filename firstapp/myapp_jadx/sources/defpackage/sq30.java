package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sq30 {
    public final ap30 a;
    public final nl30 b;
    public final nn30 c;
    public final boolean d;

    public sq30(ap30 ap30Var, nl30 nl30Var, nn30 nn30Var, boolean z) {
        ap30Var.getClass();
        nl30Var.getClass();
        nn30Var.getClass();
        this.a = ap30Var;
        this.b = nl30Var;
        this.c = nn30Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq30)) {
            return false;
        }
        sq30 sq30Var = (sq30) obj;
        return Intrinsics.g(this.a, sq30Var.a) && Intrinsics.g(this.b, sq30Var.b) && Intrinsics.g(this.c, sq30Var.c) && this.d == sq30Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RCState(loadingState=");
        sb.append(this.a);
        sb.append(", animationState=");
        sb.append(this.b);
        sb.append(", dialogState=");
        sb.append(this.c);
        sb.append(", showWinningConfetti=");
        return ruw.a(sb, this.d, ')');
    }

    public sq30() {
        this(0);
    }

    public /* synthetic */ sq30(int i) {
        this(new ap30.b(0), nl30.b.a, nn30.d.a, false);
    }
}
