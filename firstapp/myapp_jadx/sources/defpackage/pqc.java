package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public final class pqc extends q12<oqc> {
    public final rqc b;
    public final rqc c;
    public final RectF d;
    public long e;
    public long f;
    public oqc g;

    public pqc(rqc rqcVar, rqc rqcVar2, RectF rectF) {
        this.b = rqcVar;
        rqcVar2 = rqcVar2 == null ? new rqc(0.0f, 0L, 0, 0.0f, new rqc.a()) : rqcVar2;
        this.c = rqcVar2;
        this.d = rectF;
        float f = rqcVar.a;
        float fWidth = rectF.width() * 0.25f;
        float f2 = rqcVar2.a;
        float fHeight = rectF.height() * 0.25f;
        this.g = new oqc(System.currentTimeMillis(), rqcVar.a, rqcVar2.a, rqcVar.e.a(0, f + fWidth > rectF.right, f - fWidth < rectF.left), rqcVar2.e.a(0, f2 + fHeight > rectF.bottom, f2 - fHeight < rectF.top));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[PHI: r20
      0x0054: PHI (r20v5 long) = (r20v3 long), (r20v3 long), (r20v6 long) binds: [B:18:0x0050, B:19:0x0052, B:15:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.q12
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final oqc b(long j, long j2) {
        long j3;
        long j4;
        oqc oqcVar = this.g;
        float fMax = oqcVar.b;
        float fMax2 = oqcVar.c;
        int iA = oqcVar.d;
        int iA2 = oqcVar.e;
        float f = j2;
        rqc rqcVar = this.b;
        float f2 = rqcVar.d;
        long j5 = rqcVar.b;
        float f3 = f2 * f;
        RectF rectF = this.d;
        if (f3 > 0.0f) {
            j4 = 1000;
            boolean z = fMax + f3 > rectF.right;
            boolean z2 = fMax - f3 < rectF.left;
            if (j5 > 0) {
                j3 = 0;
                if (j > this.e) {
                    iA = rqcVar.e.a(iA, z, z2);
                    this.e = (((long) rqcVar.f.nextInt(rqcVar.c + 1)) * 1000) + j + j5;
                }
                fMax = Math.max(Math.min((iA * f3) + fMax, rectF.right), rectF.left);
            } else {
                j3 = 0;
            }
            if (z || z2) {
                iA = rqcVar.e.a(iA, z, z2);
                this.e = (((long) rqcVar.f.nextInt(rqcVar.c + 1)) * 1000) + j + j5;
            }
            fMax = Math.max(Math.min((iA * f3) + fMax, rectF.right), rectF.left);
        } else {
            j3 = 0;
            j4 = 1000;
        }
        float f4 = fMax;
        int i = iA;
        rqc rqcVar2 = this.c;
        float f5 = rqcVar2.d;
        long j6 = rqcVar2.b;
        float f6 = f * f5;
        if (f6 > 0.0f) {
            boolean z3 = fMax2 + f6 > rectF.bottom;
            boolean z4 = fMax2 - f6 < rectF.top;
            if ((j6 > j3 && j > this.f) || z3 || z4) {
                iA2 = rqcVar2.e.a(iA2, z3, z4);
                this.f = (((long) rqcVar2.f.nextInt(rqcVar2.c + 1)) * j4) + j + j6;
            }
            fMax2 = Math.max(Math.min((iA2 * f6) + fMax2, rectF.bottom), rectF.top);
        }
        oqc oqcVar2 = new oqc(j, f4, fMax2, i, iA2);
        this.g = oqcVar2;
        return oqcVar2;
    }
}
