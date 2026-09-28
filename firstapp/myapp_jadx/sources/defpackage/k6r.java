package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class k6r {
    public static final f4c a = new f4c(0.3f, 0.0f, 0.8f, 0.15f);
    public static final hpp<Float> b = yi0.b(new khc(1));
    public static final hpp<Float> c = yi0.b(new lhc(1));

    public static final void a(final int i, long j, a aVar, d dVar, final boolean z) {
        final long j2;
        final d dVar2;
        int i2;
        final long j3;
        d dVar3;
        Object j6rVar;
        wd0 wd0Var;
        b bVarI = aVar.i(1990840075);
        int i3 = i | (bVarI.b(z) ? 4 : 2) | 176;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i2 = i3 & (-897);
                j3 = ((lib0) bVarI.O(oib0.a)).k1;
                dVar3 = d.a.b;
            } else {
                bVarI.G();
                i2 = i3 & (-897);
                j3 = j;
                dVar3 = dVar;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            final wd0 wd0Var2 = (wd0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            final wd0 wd0Var3 = (wd0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var4 = (wd0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar = (ytw) objY4;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = bVarI.A(wd0Var4) | ((i2 & 14) == 4) | bVarI.A(wd0Var2) | bVarI.A(wd0Var3);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                wd0Var = wd0Var4;
                j6rVar = new j6r(z, wd0Var, wd0Var2, wd0Var3, ytwVar, null);
                bVarI.r(j6rVar);
            } else {
                j6rVar = objY5;
                wd0Var = wd0Var4;
            }
            xvf.e(bVarI, boolValueOf, (Function2) j6rVar);
            d dVarI = j.i(j.g(dVar3, 1.0f), 4.0f);
            boolean zA2 = bVarI.A(wd0Var) | bVarI.A(wd0Var3) | bVarI.A(wd0Var2) | bVarI.e(j3);
            Object objY6 = bVarI.y();
            if (zA2 || objY6 == c0042a) {
                final wd0 wd0Var5 = wd0Var;
                Function1 function1 = new Function1() { // from class: h6r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        wd0 wd0Var6 = wd0Var5;
                        if (((Number) wd0Var6.d()).floatValue() <= 0.0f) {
                            return Unit.a;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        float f = fIntBitsToFloat / 2.0f;
                        float fD = f.d(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) * ((Number) wd0Var3.d()).floatValue(), f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f);
                        float fD2 = f.d(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) * ((Number) wd0Var2.d()).floatValue(), f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f);
                        if (fD2 > fD) {
                            long j4 = j3;
                            tcf.Z1(tcfVar, j58.c(((Number) wd0Var6.d()).floatValue() * j58.d(j4), j4), (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), fIntBitsToFloat, 1, null, 480);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY6 = function1;
            }
            rxo.b(dVarI, (Function1) objY6, bVarI, 0);
            j2 = j3;
            dVar2 = dVar3;
        } else {
            bVarI.G();
            j2 = j;
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, j2, dVar2, z) { // from class: i6r
                public final /* synthetic */ boolean a;
                public final /* synthetic */ d b;
                public final /* synthetic */ long c;

                {
                    this.a = z;
                    this.b = dVar2;
                    this.c = j2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k6r.a(qj40.a(1), this.c, (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
