package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes8.dex */
public final class ckd {
    public static final void a(final String str, final long j, int i, int i2, int i3, float f, a aVar, final int i4) {
        int i5;
        final int i6;
        final int i7;
        final int i8;
        final float f2;
        ytw ytwVar;
        a.C0041a.C0042a c0042a;
        String str2;
        str.getClass();
        b bVarI = aVar.i(1796604581);
        if ((i4 & 6) == 0) {
            i5 = i4 | (bVarI.M(str) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= bVarI.e(j) ? 32 : 16;
        }
        int i9 = i5 | 224640;
        if (bVarI.q(i9 & 1, (74899 & i9) != 74898)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            float f3 = ((g7f) f.i(new g7f(configuration.screenHeightDp * 0.09f), new g7f(40.0f), new g7f(120.0f))).a;
            float fC1 = mmdVar.C1(f3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY == c0042a2) {
                objY = in80.a.a(context);
                bVarI.r(objY);
            }
            m9n m9nVar = (m9n) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            float f4 = fC1 / 2.0f;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - f4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - f4)) & 4294967295L);
            boolean zA = bVarI.A(context) | ((i9 & 14) == 4) | bVarI.A(m9nVar);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a2) {
                ytwVar = ytwVar2;
                c0042a = c0042a2;
                zjd zjdVar = new zjd(context, str, m9nVar, ytwVar, null);
                str2 = str;
                bVarI.r(zjdVar);
                objY3 = zjdVar;
            } else {
                str2 = str;
                ytwVar = ytwVar2;
                c0042a = c0042a2;
            }
            xvf.e(bVarI, str2, (Function2) objY3);
            float fC2 = mmdVar.C1(configuration.screenHeightDp);
            float fC3 = fC2 - mmdVar.C1(f3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(0.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var = (wd0) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = ee0.a(0.0f);
                bVarI.r(objY5);
            }
            wd0 wd0Var2 = (wd0) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = ee0.a(0.0f);
                bVarI.r(objY6);
            }
            wd0 wd0Var3 = (wd0) objY6;
            Unit unit = Unit.a;
            boolean zA2 = ((i9 & 896) == 256) | bVarI.A(wd0Var) | bVarI.A(wd0Var3) | ((57344 & i9) == 16384);
            Object objY7 = bVarI.y();
            if (zA2 || objY7 == c0042a) {
                objY7 = new akd(wd0Var, wd0Var3, null);
                bVarI.r(objY7);
            }
            xvf.e(bVarI, unit, (Function2) objY7);
            boolean zA3 = ((i9 & 7168) == 2048) | bVarI.A(wd0Var2);
            Object objY8 = bVarI.y();
            if (zA3 || objY8 == c0042a) {
                objY8 = new bkd(wd0Var2, null);
                bVarI.r(objY8);
            }
            xvf.e(bVarI, unit, (Function2) objY8);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            c8n c8nVar = (c8n) ytwVar.getValue();
            if (c8nVar == null) {
                bVarI.N(10101642);
            } else {
                bVarI.N(10101643);
                float fFloatValue = ((Number) wd0Var.d()).floatValue();
                final float fIntBitsToFloat = (200.0f * fFloatValue) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                final aq40 aq40Var = new aq40();
                int i10 = (int) (jFloatToRawIntBits & 4294967295L);
                aq40Var.a = ((((fFloatValue * fFloatValue) * fFloatValue) * (fC3 - Float.intBitsToFloat(i10))) + Float.intBitsToFloat(i10)) - (((1.0f - fFloatValue) * 250.0f) * fFloatValue);
                if (((Number) wd0Var.d()).floatValue() >= 1.0f) {
                    aq40Var.a = (0.5f * fC2 * ((Number) wd0Var3.d()).floatValue()) + aq40Var.a;
                }
                h9n.b(c8nVar, "sk_deflated_ball", s3w.a(androidx.compose.ui.graphics.a.c(g.b(j.r(aVar2, f3), new Function1() { // from class: xjd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        int iB = ycv.b(fIntBitsToFloat);
                        return new iwo((((long) ycv.b(aq40Var.a)) & 4294967295L) | (((long) iB) << 32));
                    }
                }), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) wd0Var2.d()).floatValue(), 0L, null, 524031), "sk_deflated_ball"), bVarI, 48, 248);
            }
            bVarI.X(false);
            bVarI.X(true);
            i6 = 1500;
            f2 = 250.0f;
            i7 = 200;
            i8 = 1000;
        } else {
            bVarI.G();
            i6 = i;
            i7 = i2;
            i8 = i3;
            f2 = f;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yjd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ckd.a(str, j, i6, i7, i8, f2, (a) obj, qj40.a(i4 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
