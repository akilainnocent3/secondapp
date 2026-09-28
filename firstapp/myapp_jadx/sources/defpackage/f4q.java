package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class f4q implements flx {
    public final /* synthetic */ ohb a;
    public final /* synthetic */ i20<m4q> b;
    public final /* synthetic */ s3q c;

    public f4q(ohb ohbVar, i20 i20Var, s3q s3qVar) {
        this.a = ohbVar;
        this.b = i20Var;
        this.c = s3qVar;
    }

    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        if (!((Boolean) this.a.invoke()).booleanValue()) {
            return new exh0(0L);
        }
        if (exh0.c(j2) == 0.0f) {
            return new exh0(0L);
        }
        this.c.invoke(new Float(exh0.c(j2)));
        return new exh0(j2);
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (!((Boolean) this.a.invoke()).booleanValue() || fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        i20<m4q> i20Var = this.b;
        float fD = i20Var.d(fIntBitsToFloat);
        float fE = fD - i20Var.e();
        i20Var.n.a(fD, 0.0f);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
    }

    @Override // defpackage.flx
    public final Object k1(long j, v1b<? super exh0> v1bVar) {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            i20<m4q> i20Var = this.b;
            if (!Float.isNaN(((t5a0) i20Var.j).j())) {
                if (exh0.c(j) >= 0.0f || ((t5a0) i20Var.j).j() <= i20Var.b().e()) {
                    return new exh0(0L);
                }
                this.c.invoke(new Float(exh0.c(j)));
                return new exh0(j);
            }
        }
        return new exh0(0L);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (!((Boolean) this.a.invoke()).booleanValue() || i != 1) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        i20<m4q> i20Var = this.b;
        float fD = i20Var.d(fIntBitsToFloat);
        float fE = fD - i20Var.e();
        i20Var.n.a(fD, 0.0f);
        return (((long) Float.floatToRawIntBits(fE)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
