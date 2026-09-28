package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cwf {
    public static final long[] e = new long[0];
    public final pd80 a;
    public final vcp.a b;
    public long c;
    public final long[] d;

    public cwf(pd80 pd80Var, vcp.a aVar) {
        pd80Var.getClass();
        this.a = pd80Var;
        this.b = aVar;
        int iD = pd80Var.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}
