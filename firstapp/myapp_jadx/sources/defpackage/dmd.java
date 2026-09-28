package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dmd implements mof {
    public final int a;
    public final int b;

    public dmd(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        xkn.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        int i = rvfVar.c;
        xsz xszVar = rvfVar.a;
        int i2 = this.b;
        int iA = i + i2;
        if (((i ^ iA) & (i2 ^ iA)) < 0) {
            iA = xszVar.a();
        }
        rvfVar.a(rvfVar.c, Math.min(iA, xszVar.a()));
        int i3 = rvfVar.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        rvfVar.a(Math.max(0, i5), rvfVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmd)) {
            return false;
        }
        dmd dmdVar = (dmd) obj;
        return this.a == dmdVar.a && this.b == dmdVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return rr1.b(sb, this.b, ')');
    }
}
