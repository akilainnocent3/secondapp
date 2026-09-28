package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class emd implements mof {
    public final int a;
    public final int b;

    public emd(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        xkn.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = rvfVar.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(rvfVar.b((i4 - i3) + (-1))) && Character.isLowSurrogate(rvfVar.b(rvfVar.b - i3))) ? i + 2 : i3;
        }
        int iA = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iA + 1;
            int i7 = rvfVar.c;
            xsz xszVar = rvfVar.a;
            if (i7 + i6 >= xszVar.a()) {
                iA = xszVar.a() - rvfVar.c;
                break;
            }
            iA = (Character.isHighSurrogate(rvfVar.b((rvfVar.c + i6) + (-1))) && Character.isLowSurrogate(rvfVar.b(rvfVar.c + i6))) ? iA + 2 : i6;
        }
        int i8 = rvfVar.c;
        rvfVar.a(i8, iA + i8);
        int i9 = rvfVar.b;
        rvfVar.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emd)) {
            return false;
        }
        emd emdVar = (emd) obj;
        return this.a == emdVar.a && this.b == emdVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return rr1.b(sb, this.b, ')');
    }
}
