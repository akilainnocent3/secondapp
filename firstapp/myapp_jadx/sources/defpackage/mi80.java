package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class mi80 implements mof {
    public final int a;
    public final int b;

    public mi80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        int iE = f.e(this.a, 0, rvfVar.a.a());
        int iE2 = f.e(this.b, 0, rvfVar.a.a());
        if (iE < iE2) {
            rvfVar.h(iE, iE2);
        } else {
            rvfVar.h(iE2, iE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi80)) {
            return false;
        }
        mi80 mi80Var = (mi80) obj;
        return this.a == mi80Var.a && this.b == mi80Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return rr1.b(sb, this.b, ')');
    }
}
