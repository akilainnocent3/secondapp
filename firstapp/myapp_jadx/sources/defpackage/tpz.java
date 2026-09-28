package defpackage;

import java.util.List;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class tpz implements y4a0 {
    public final /* synthetic */ zpz a;
    public final /* synthetic */ ooz b;

    public tpz(zpz zpzVar, ooz oozVar, spz spzVar) {
        this.a = zpzVar;
        this.b = oozVar;
    }

    @Override // defpackage.y4a0
    public final float a(float f) {
        zpz zpzVar = this.a;
        z4a0 z4a0VarP = zpzVar.m().p();
        List<rnz> listK = zpzVar.m().k();
        int size = listK.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            rnz rnzVar = listK.get(i);
            epz epzVarM = zpzVar.m();
            int iD = (int) (epzVarM.a() == i3z.a ? epzVarM.d() & 4294967295L : epzVarM.d() >> 32);
            int iG = zpzVar.m().g();
            int iE = zpzVar.m().e();
            int iJ = zpzVar.m().j();
            int offset = rnzVar.getOffset();
            zpzVar.n();
            float fD = offset - z4a0VarP.d(iD, iJ, iG, iE);
            if (fD <= 0.0f && fD > f3) {
                f3 = fD;
            }
            if (fD >= 0.0f && fD < f2) {
                f2 = fD;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!zpzVar.e()) {
            if (upz.b(zpzVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!zpzVar.d()) {
            f3 = 0.0f;
            if (!upz.b(zpzVar, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            zkn.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    @Override // defpackage.y4a0
    public final float b(float f, float f2) {
        zpz zpzVar = this.a;
        int iO = zpzVar.o();
        ytw<npz> ytwVar = zpzVar.p;
        int i = ((npz) ((x5a0) ytwVar).getValue()).c + iO;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = zpzVar.e;
        if (f < 0.0f) {
            i2++;
        }
        int iE = f.e(((int) (f2 / i)) + i2, 0, zpzVar.n());
        zpzVar.o();
        int i3 = ((npz) ((x5a0) ytwVar).getValue()).c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((f.e(f.e(iE, i4, (int) j3), 0, zpzVar.n()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }
}
