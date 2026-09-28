package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class bfc {
    public static final void a(final float f, final int i, long j, long j2, a aVar, d dVar) {
        d dVar2;
        final long j3;
        final long j4;
        long jA;
        long jA2;
        int i2;
        Object obj;
        final long j5;
        final long j6;
        b bVarI = aVar.i(-461690541);
        int i3 = i | (bVarI.c(f) ? 4 : 2) | 1152;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                jA = c68.a(R.color.bg_brand_sub_quaternary, bVarI);
                jA2 = c68.a(R.color.bg_surface_secondary, bVarI);
                i2 = i3 & (-8065);
            } else {
                bVarI.G();
                i2 = i3 & (-8065);
                jA = j;
                jA2 = j2;
            }
            bVarI.Y();
            dVar2 = dVar;
            d dVarI = j.i(j.g(dVar2, 1.0f), 4.0f);
            boolean zE = bVarI.e(jA2) | ((i2 & 14) == 4) | bVarI.e(jA);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                j5 = jA;
                j6 = jA2;
                obj = new Function1() { // from class: zec
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        float fC1 = tcfVar.C1(4.0f);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC1)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        tcf.d1(tcfVar, j6, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), jFloatToRawIntBits, null, 0.0f, 240);
                        float f2 = f;
                        if (f2 > 0.0f) {
                            float fD = f.d(f2, 0.0f, 1.0f) * Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                            tcf.d1(tcfVar, j5, 0L, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), jFloatToRawIntBits, null, 0.0f, 240);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(obj);
            } else {
                obj = objY;
                j5 = jA;
                j6 = jA2;
            }
            rxo.b(dVarI, (Function1) obj, bVarI, 0);
            j4 = j6;
            j3 = j5;
        } else {
            dVar2 = dVar;
            bVarI.G();
            j3 = j;
            j4 = j2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(f, i, j3, j4, dVar3) { // from class: afc
                public final /* synthetic */ float a;
                public final /* synthetic */ d b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                {
                    this.b = dVar3;
                    this.c = j3;
                    this.d = j4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(49);
                    bfc.a(this.a, iA, this.c, this.d, (a) obj2, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
