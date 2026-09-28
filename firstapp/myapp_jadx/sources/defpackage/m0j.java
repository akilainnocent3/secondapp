package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m0j {
    public static final void a(final boolean z, final d dVar, float f, float f2, a aVar, final int i) {
        final float f3;
        final float f4;
        b bVarI = aVar.i(1776489179);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | 3456;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final float fB = vcv.b(45.0f, -45.0f, ((Number) xe0.b(z ? 1.0f : 0.0f, yi0.d(1.0f, 1500.0f, null, 4), "arrowProgress", null, bVarI, 3120, 20).getValue()).floatValue());
            final float fC1 = ((mmd) bVarI.O(kna.h)).C1(2.0f);
            d dVarN = dVar.n(j.r(d.a.b, 12.0f));
            boolean zC = bVarI.c(fB) | bVarI.c(fC1);
            Object objY = bVarI.y();
            final float f5 = 0.36f;
            if (zC || objY == a.C0041a.a) {
                objY = new Function1() { // from class: k0j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat / 2.0f) << 32);
                        float fMin = Math.min(fIntBitsToFloat, fIntBitsToFloat2) * f5;
                        float f6 = fB;
                        long jF = gly.f(jFloatToRawIntBits, m0j.b(fMin, 180.0f - f6));
                        long jF2 = gly.f(jFloatToRawIntBits, m0j.b(fMin, f6 + 0.0f));
                        long j = j58.f;
                        float f7 = fC1;
                        tcf.Z1(tcfVar, j, jFloatToRawIntBits, jF, f7, 1, null, 480);
                        tcf.Z1(tcfVar, j, jFloatToRawIntBits, jF2, f7, 1, null, 480);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarN, (Function1) objY, bVarI, 0);
            f3 = 2.0f;
            f4 = 0.36f;
        } else {
            bVarI.G();
            f3 = f;
            f4 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, dVar, f3, f4, i) { // from class: l0j
                public final /* synthetic */ boolean a;
                public final /* synthetic */ d b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    m0j.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final long b(float f, float f2) {
        double radians = Math.toRadians(f2);
        double d = f;
        float fCos = (float) (Math.cos(radians) * d);
        return (((long) Float.floatToRawIntBits((float) (Math.sin(radians) * d))) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32);
    }
}
