package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface nwh extends xi0<Float> {
    @Override // defpackage.xi0
    default pwh0 a(f0h0 f0h0Var) {
        return new vwh0(this);
    }

    default float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    float c(long j, float f, float f2, float f3);

    float d(long j, float f, float f2, float f3);

    long e(float f, float f2, float f3);
}
