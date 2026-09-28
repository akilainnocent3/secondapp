package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class bac0 implements w420 {
    public final /* synthetic */ mmd a;
    public final /* synthetic */ lk40 b;
    public final /* synthetic */ fpc0 c;
    public final /* synthetic */ float d;

    public bac0(mmd mmdVar, lk40 lk40Var, fpc0 fpc0Var, float f) {
        this.a = mmdVar;
        this.b = lk40Var;
        this.c = fpc0Var;
        this.d = f;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        float f;
        owoVar.getClass();
        asrVar.getClass();
        int iY0 = this.a.y0(this.d);
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        lk40 lk40Var = this.b;
        float f2 = lk40Var.a;
        float f3 = lk40Var.b;
        float f4 = lk40Var.d;
        float f5 = lk40Var.c - f2;
        fpc0 fpc0Var = this.c;
        int iOrdinal = fpc0Var.ordinal();
        if (iOrdinal == 0) {
            f = (f3 - i2) - iY0;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return 0L;
            }
            f = iY0 + f4;
        }
        int i3 = (int) f;
        if (fpc0Var == fpc0.a && i3 < 0) {
            i3 = (int) (f4 + iY0);
        } else if (fpc0Var == fpc0.b && i3 + i2 > ((int) (j & 4294967295L))) {
            i3 = (int) ((f3 - i2) - iY0);
        }
        return (((long) f.e((int) g70.a(f5, i, 2.0f, f2), 0, ((int) (j >> 32)) - i)) << 32) | (((long) f.e(i3, 0, ((int) (j & 4294967295L)) - i2)) & 4294967295L);
    }
}
