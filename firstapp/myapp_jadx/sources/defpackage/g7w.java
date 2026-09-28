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
public final class g7w {
    public static final void a(d dVar, final float f, final float f2, float f3, int i, final long j, int i2, a aVar, final int i3) {
        final d dVar2;
        final float f4;
        final int i4;
        final int i5;
        b bVarI = aVar.i(18627012);
        int i6 = i3 | 14183424;
        if (bVarI.q(i6 & 1, (4793491 & i6) != 4793490)) {
            final egn.a aVarA = kgn.a(kgn.b("meteor_transition", bVarI, 0), 0.0f, 1.0f, yi0.a(yi0.e(1000, 0, xkf.d, 2), l850.a, 0L, 4), "meteor_progress", bVarI, 29112, 0);
            boolean zM = bVarI.M(aVarA);
            Object objY = bVarI.y();
            final float f5 = 0.3f;
            if (zM || objY == a.C0041a.a) {
                Function1 function1 = new Function1() { // from class: d7w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mr5 mr5Var = (mr5) obj;
                        mr5Var.getClass();
                        j90 j90VarA = m90.a();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (mr5Var.a.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L));
                        float density = mr5Var.getDensity() * f;
                        bxz.s(j90VarA, bys.d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L)));
                        PathMeasure pathMeasure = new PathMeasure();
                        final l90 l90Var = new l90(pathMeasure);
                        l90Var.a(j90VarA);
                        final float length = pathMeasure.getLength();
                        final float f6 = (f5 * length) / 300.0f;
                        final yae0 yae0Var = new yae0(mr5Var.getDensity() * f2, 0.0f, 1, 0, null, 26);
                        final j90 j90VarA2 = m90.a();
                        final long j2 = j;
                        final twd0 twd0Var = aVarA;
                        return mr5Var.e(new Function1() { // from class: f7w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                tcf tcfVar = (tcf) obj2;
                                tcfVar.getClass();
                                float fFloatValue = 1.0f - ((Number) twd0Var.getValue()).floatValue();
                                float f7 = length;
                                float f8 = fFloatValue * f7;
                                for (int i7 = 299; -1 < i7; i7--) {
                                    float f9 = i7;
                                    float f10 = f6;
                                    float f11 = (f9 * f10) + f8;
                                    float f12 = (f11 - f10) % f7;
                                    if (f12 < 0.0f) {
                                        f12 += f7;
                                    }
                                    float f13 = f11 % f7;
                                    if (f13 < 0.0f) {
                                        f13 += f7;
                                    }
                                    j90 j90Var = j90VarA2;
                                    j90Var.reset();
                                    l90 l90Var2 = l90Var;
                                    if (f12 < f13) {
                                        l90Var2.b(f12, f13, j90Var);
                                    } else {
                                        l90Var2.b(f12, f7, j90Var);
                                        l90Var2.b(0.0f, f13, j90Var);
                                    }
                                    float f14 = 1.0f - (f9 / 300.0f);
                                    tcf.Q1(tcfVar, j90Var, j58.c(f14 * f14, j2), 0.0f, yae0Var, 52);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(function1);
                objY = function1;
            }
            dVar2 = dVar;
            ty0.a(bVarI, androidx.compose.ui.draw.a.b(dVar2, (Function1) objY));
            i4 = 300;
            i5 = 1000;
            f4 = 0.3f;
        } else {
            dVar2 = dVar;
            bVarI.G();
            f4 = f3;
            i4 = i;
            i5 = i2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, f4, i4, j, i5, i3) { // from class: e7w
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ int e;
                public final /* synthetic */ long f;
                public final /* synthetic */ int i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(197047);
                    g7w.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
