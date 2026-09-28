package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class qh80 implements mof {
    public final int a;
    public final int b;

    public qh80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        boolean zE = rvfVar.e();
        xsz xszVar = rvfVar.a;
        if (zE) {
            rvfVar.d = -1;
            rvfVar.e = -1;
        }
        int iE = f.e(this.a, 0, xszVar.a());
        int iE2 = f.e(this.b, 0, xszVar.a());
        if (iE != iE2) {
            if (iE < iE2) {
                rvfVar.g(iE, iE2);
            } else {
                rvfVar.g(iE2, iE);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh80)) {
            return false;
        }
        qh80 qh80Var = (qh80) obj;
        return this.a == qh80Var.a && this.b == qh80Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return rr1.b(sb, this.b, ')');
    }
}
