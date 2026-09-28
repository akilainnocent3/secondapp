package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kuh0 implements mly {
    public final mly a;
    public final int b;
    public final int c;

    public kuh0(mly mlyVar, int i, int i2) {
        this.a = mlyVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.mly
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.c) {
            luh0.c(iA, this.b, i);
        }
        return iA;
    }

    @Override // defpackage.mly
    public final int b(int i) {
        int iB = this.a.b(i);
        if (i >= 0 && i <= this.b) {
            luh0.b(iB, this.c, i);
        }
        return iB;
    }
}
