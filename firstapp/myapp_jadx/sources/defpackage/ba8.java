package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class ba8 implements mof {
    public final nk0 a;
    public final int b;

    public ba8(String str, int i) {
        this(new nk0(str), i);
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        boolean zE = rvfVar.e();
        nk0 nk0Var = this.a;
        if (zE) {
            rvfVar.f(rvfVar.d, rvfVar.e, nk0Var.b);
        } else {
            rvfVar.f(rvfVar.b, rvfVar.c, nk0Var.b);
        }
        int iD = rvfVar.d();
        int i = this.b;
        int iE = f.e(i > 0 ? (iD + i) - 1 : (iD + i) - nk0Var.b.length(), 0, rvfVar.a.a());
        rvfVar.h(iE, iE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba8)) {
            return false;
        }
        ba8 ba8Var = (ba8) obj;
        return Intrinsics.g(this.a.b, ba8Var.a.b) && this.b == ba8Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return rr1.b(sb, this.b, ')');
    }

    public ba8(nk0 nk0Var, int i) {
        this.a = nk0Var;
        this.b = i;
    }
}
