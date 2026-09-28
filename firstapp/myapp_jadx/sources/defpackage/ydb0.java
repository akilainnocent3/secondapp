package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ydb0 implements wwh {
    public final vvh a;

    public ydb0(mmd mmdVar) {
        this.a = new vvh(zdb0.a, mmdVar);
    }

    @Override // defpackage.wwh
    public final float a(float f, long j) {
        long j2 = j / 1000000;
        vvh.a aVarA = this.a.a(f);
        long j3 = aVarA.c;
        return (((Math.signum(aVarA.a) * i70.a(j3 > 0 ? j2 / j3 : 1.0f).b) * aVarA.b) / j3) * 1000.0f;
    }

    @Override // defpackage.wwh
    public final float b(float f, float f2, long j) {
        long j2 = j / 1000000;
        vvh.a aVarA = this.a.a(f2);
        long j3 = aVarA.c;
        return (Math.signum(aVarA.a) * aVarA.b * i70.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.wwh
    public final float c() {
        return 0.0f;
    }

    @Override // defpackage.wwh
    public final long d(float f) {
        return ((long) (Math.exp(this.a.b(f) / (((double) wvh.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.wwh
    public final float e(float f, float f2) {
        vvh vvhVar = this.a;
        double dB = vvhVar.b(f2);
        double d = wvh.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (vvhVar.a * vvhVar.c))))) + f;
    }
}
