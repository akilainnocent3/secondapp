package defpackage;

import android.graphics.PathMeasure;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ff0 {
    public static final void a(final d dVar, final boolean z, final long j, float f, int i, a aVar, final int i2) {
        int i3;
        final float f2;
        final int i4;
        b bVarI = aVar.i(1241570813);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.e(j) ? 256 : 128;
        }
        int i5 = i3 | 27648;
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            final wd0 wd0Var = (wd0) objY;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = ((i5 & 112) == 32) | bVarI.A(wd0Var) | ((57344 & i5) == 16384);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new ef0(wd0Var, null, z);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY2);
            boolean zA2 = bVarI.A(wd0Var) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
            Object objY3 = bVarI.y();
            final float f3 = 1.72f;
            if (zA2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: cf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 20.0f;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 20.0f;
                        j90 j90VarA = m90.a();
                        j90VarA.a(4.9f * fIntBitsToFloat, 9.4f * fIntBitsToFloat2);
                        j90VarA.c(8.5f * fIntBitsToFloat, 13.6f * fIntBitsToFloat2);
                        j90VarA.c(14.6f * fIntBitsToFloat, 7.0f * fIntBitsToFloat2);
                        PathMeasure pathMeasure = new PathMeasure();
                        pathMeasure.setPath(j90VarA.a, false);
                        float length = pathMeasure.getLength();
                        j90 j90VarA2 = m90.a();
                        pathMeasure.getSegment(0.0f, ((Number) wd0Var.d()).floatValue() * length, j90VarA2.a, true);
                        tcf.Q1(tcfVar, j90VarA2, j, 0.0f, new yae0(((fIntBitsToFloat + fIntBitsToFloat2) / 2.0f) * f3, 0.0f, 1, 1, null, 18), 52);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            rxo.b(dVar, (Function1) objY3, bVarI, i5 & 14);
            i4 = 600;
            f2 = 1.72f;
        } else {
            bVarI.G();
            f2 = f;
            i4 = i;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: df0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ff0.a(dVar, z, j, f2, i4, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
