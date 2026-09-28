package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class f9e0 extends rtu {
    public final byte[] b;

    /* JADX WARN: Illegal instructions before constructor call */
    public f9e0(byte[] bArr) {
        int iA;
        if (bArr.length == 0) {
            iA = 0;
        } else {
            int i = cl0.a.c;
            int length = bArr.length;
            iA = i + s08.a(length) + length;
        }
        super(iA);
        this.b = bArr;
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) {
        byte[] bArr = this.b;
        if (bArr.length == 0) {
            return;
        }
        me80Var.G0(cl0.a, bArr);
    }
}
