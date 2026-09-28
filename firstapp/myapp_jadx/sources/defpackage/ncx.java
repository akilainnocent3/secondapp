package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ncx {
    public final lcx a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ncx(lcx lcxVar, boolean z, boolean z2, boolean z3) {
        this.a = lcxVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        return !ay0.V(new lcx[]{lcx.c.a, lcx.d.a}).contains(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncx)) {
            return false;
        }
        ncx ncxVar = (ncx) obj;
        return Intrinsics.g(this.a, ncxVar.a) && this.b == ncxVar.b && this.c == ncxVar.c && this.d == ncxVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameConfirmStatus(methodShouldProceed=");
        sb.append(this.a);
        sb.append(", hasPendingFtd=");
        sb.append(this.b);
        sb.append(", isWaitingForBank=");
        return lng.a(", isVerified=", ")", sb, this.c, this.d);
    }

    public ncx() {
        this(0);
    }

    public /* synthetic */ ncx(int i) {
        this(lcx.c.a, false, false, false);
    }
}
