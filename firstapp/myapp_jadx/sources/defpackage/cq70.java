package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cq70 implements gaj {
    public final /* synthetic */ float a;
    public final /* synthetic */ xi0 b;
    public final /* synthetic */ zp70 c;
    public final /* synthetic */ tmz d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;

    public /* synthetic */ cq70(float f, xi0 xi0Var, zp70 zp70Var, tmz tmzVar, float f2, long j) {
        i3z i3zVar = i3z.a;
        this.a = f;
        this.b = xi0Var;
        this.c = zp70Var;
        this.d = tmzVar;
        this.e = f2;
        this.f = j;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i3z i3zVar = i3z.a;
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, 380845950);
        final twd0 twd0VarB = xe0.b(this.a, this.b, "", null, aVar, 3072, 20);
        final zp70 zp70Var = this.c;
        boolean zM = aVar.M(zp70Var) | aVar.M(twd0VarB);
        final tmz tmzVar = this.d;
        boolean zM2 = zM | aVar.M(tmzVar) | aVar.d(0);
        final float f = this.e;
        boolean zC = zM2 | aVar.c(f);
        final long j = this.f;
        boolean zE = aVar.e(j) | zC;
        Object objY = aVar.y();
        if (zE || objY == a.C0041a.a) {
            Function1 function1 = new Function1() { // from class: dq70
                {
                    i3z i3zVar2 = i3z.a;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    i3z i3zVar2 = i3z.a;
                    lza lzaVar = (lza) obj4;
                    lzaVar.getClass();
                    lzaVar.b2();
                    zp70 zp70Var2 = zp70Var;
                    boolean zC2 = zp70Var2.f.c();
                    twd0 twd0Var = twd0VarB;
                    if (zC2 || ((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                        tmz tmzVar2 = tmzVar;
                        List listK = b.k(Float.valueOf(lzaVar.C1(tmzVar2.d())), Float.valueOf(lzaVar.C1(tmzVar2.a())), Float.valueOf(lzaVar.C1(h.d(tmzVar2, lzaVar.getLayoutDirection()))), Float.valueOf(lzaVar.C1(h.c(tmzVar2, lzaVar.getLayoutDirection()))));
                        float fFloatValue = ((Number) listK.get(0)).floatValue();
                        float fFloatValue2 = ((Number) listK.get(1)).floatValue();
                        float fFloatValue3 = ((Number) listK.get(2)).floatValue();
                        float fFloatValue4 = ((Number) listK.get(3)).floatValue();
                        int iD = ((u5a0) zp70Var2.a).D();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fMax = Math.max(zp70Var2.h() + fIntBitsToFloat, 0.001f);
                        float f2 = ((fIntBitsToFloat / fMax) * fIntBitsToFloat) - (fFloatValue2 + fFloatValue);
                        float fC1 = lzaVar.C1(f);
                        float f3 = (fIntBitsToFloat * iD) / fMax;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(fC1) << 32);
                        if (lzaVar.getLayoutDirection() == asr.a) {
                            fFloatValue3 = (fIntBitsToFloat2 - fC1) - fFloatValue4;
                        }
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloatValue3)) << 32) | (((long) Float.floatToRawIntBits(f3 + fFloatValue)) & 4294967295L);
                        float f4 = fC1 / 2.0f;
                        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                        long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f4)) & 4294967295L;
                        tcf.d1(lzaVar, j, jFloatToRawIntBits2, jFloatToRawIntBits, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32), null, ((Number) twd0Var.getValue()).floatValue(), 208);
                    }
                    return Unit.a;
                }
            };
            aVar.r(function1);
            objY = function1;
        }
        d dVarC = androidx.compose.ui.draw.a.c(dVar, (Function1) objY);
        aVar.H();
        return dVarC;
    }
}
