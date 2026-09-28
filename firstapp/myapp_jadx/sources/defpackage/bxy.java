package defpackage;

import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class bxy {
    public static final /* synthetic */ int a = 0;

    static {
        m90.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List list, final List list2, final List list3, final boolean z, final long j, long j2, long j3, long j4, final boolean z2, final long j5, String str, final float f, a aVar, final int i, final int i2) {
        String str2;
        final long j6;
        final long j7;
        final long j8;
        String str3;
        boolean z3;
        boolean z4;
        boolean z5;
        list.getClass();
        list2.getClass();
        list3.getClass();
        str.getClass();
        b bVarI = aVar.i(-802025751);
        int i3 = (bVarI.A(list) ? 4 : 2) | i | (bVarI.A(list2) ? 32 : 16) | (bVarI.A(list3) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        int i4 = (bVarI.e(j5) ? 536870912 : 268435456) | i3 | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 14352384;
        int i5 = i2 | (bVarI.M(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= bVarI.c(f) ? 32 : 16;
        }
        if (bVarI.q(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            final float f2 = ((g7f) f.i(new g7f(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.09f), new g7f(40.0f), new g7f(120.0f))).a * f;
            final float f3 = 2.3f * f2;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(m2g.a);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i5 & 14;
            int i7 = i4 & 7168;
            boolean zA = (i6 == 4) | (i7 == 2048) | bVarI.A(list2);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new mwy(str, z, list2, ytwVar, null);
                str3 = str;
                bVarI.r(objY2);
            } else {
                str3 = str;
            }
            xvf.f(str3, boolValueOf, list2, (Function2) objY2, bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(m2g.a);
                bVarI.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zA2 = (i6 == 4) | (i7 == 2048) | bVarI.A(list3);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                String str4 = str3;
                objY4 = new nwy(str4, z, list3, ytwVar2, null);
                str2 = str4;
                z3 = z;
                bVarI.r(objY4);
            } else {
                str2 = str3;
                z3 = z;
            }
            xvf.f(str2, boolValueOf2, list3, (Function2) objY4, bVarI);
            boolean z6 = i7 == 2048;
            Object objY5 = bVarI.y();
            if (z6 || objY5 == c0042a) {
                objY5 = ee0.a(z3 ? 1.0f : 0.0f);
                bVarI.r(objY5);
            }
            wd0 wd0Var = (wd0) objY5;
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            boolean zA3 = bVarI.A(wd0Var) | (i7 == 2048);
            Object objY6 = bVarI.y();
            if (zA3 || objY6 == c0042a) {
                objY6 = new owy(wd0Var, null, z3);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, boolValueOf3, (Function2) objY6);
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(Boolean.FALSE);
                bVarI.r(objY7);
            }
            ytw ytwVar3 = (ytw) objY7;
            boolean z7 = i6 == 4;
            Object objY8 = bVarI.y();
            if (z7 || objY8 == c0042a) {
                objY8 = new pwy(null, ytwVar3, str2);
                bVarI.r(objY8);
            }
            xvf.e(bVarI, str2, (Function2) objY8);
            Object objY9 = bVarI.y();
            if (objY9 == c0042a) {
                objY9 = ee0.a(1.0f);
                bVarI.r(objY9);
            }
            final wd0 wd0Var2 = (wd0) objY9;
            boolean zA4 = (i6 == 4) | bVarI.A(wd0Var2);
            Object objY10 = bVarI.y();
            if (zA4 || objY10 == c0042a) {
                objY10 = new qwy(wd0Var2, null, str2);
                bVarI.r(objY10);
            }
            xvf.e(bVarI, str2, (Function2) objY10);
            final long j9 = ((Boolean) ytwVar3.getValue()).booleanValue() ? j5 : j;
            boolean zE = bVarI.e(j9) | bVarI.c(f3);
            Object objY11 = bVarI.y();
            if (zE || objY11 == c0042a) {
                objY11 = new Function1() { // from class: iwy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mmd mmdVar = (mmd) obj;
                        mmdVar.getClass();
                        long j10 = j9;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                        float f4 = f3;
                        int iB = ycv.b(fIntBitsToFloat - (mmdVar.C1(f4) / 2.0f));
                        return new iwo((((long) ycv.b(Float.intBitsToFloat((int) (j10 & 4294967295L)) - (mmdVar.C1(f4) / 2.0f))) & 4294967295L) | (((long) iB) << 32));
                    }
                };
                bVarI.r(objY11);
            }
            d.a aVar2 = d.a.b;
            d dVarR = j.r(g.b(aVar2, (Function1) objY11), f3);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
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
            if (((Number) wd0Var2.d()).floatValue() > 0.0f) {
                bVarI.N(-1636906257);
                d dVarJ = h.j(androidx.compose.foundation.layout.d.a.f(aVar2), 0.0f, f2 / 1.3f, 0.0f, 0.0f, 13);
                Object objY12 = bVarI.y();
                if (objY12 == c0042a) {
                    z4 = true;
                    objY12 = new hbb(1);
                    bVarI.r(objY12);
                } else {
                    z4 = true;
                }
                d dVarA = androidx.compose.ui.graphics.a.a(dVarJ, (Function1) objY12);
                boolean zC = bVarI.c(f2) | bVarI.A(wd0Var2);
                Object objY13 = bVarI.y();
                if (zC || objY13 == c0042a) {
                    objY13 = new Function1() { // from class: jwy
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 2.0f;
                            float f4 = f2;
                            float fC1 = (tcfVar.C1(f4) / 9.0f) + fIntBitsToFloat2;
                            float fC2 = tcfVar.C1(f4) * 1.0f;
                            float fC3 = tcfVar.C1(f4) * 0.25f;
                            lc6 lc6VarA = tcfVar.F1().a();
                            b90 b90VarA = c90.a();
                            Paint paint = b90VarA.a;
                            paint.setAntiAlias(true);
                            paint.setColor(-16777216);
                            paint.setAlpha((int) (((Number) wd0Var2.d()).floatValue() * 0.6f * 255.0f));
                            paint.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL));
                            float f5 = fC2 / 2.0f;
                            float f6 = fC3 / 2.0f;
                            lc6VarA.g(new lk40(fIntBitsToFloat - f5, fC1 - f6, fIntBitsToFloat + f5, fC1 + f6), b90VarA);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY13);
                }
                z5 = false;
                rxo.b(dVarA, (Function1) objY13, bVarI, 0);
            } else {
                z4 = true;
                z5 = false;
                bVarI.N(-1667294689);
            }
            bVarI.X(z5);
            List list4 = (List) ytwVar.getValue();
            float f4 = 2.2f * f2;
            d dVarC2 = g.c(j.r(aVar2, f4), -(0.5f * f2), 0.33f * f2);
            float fFloatValue = ((Number) wd0Var.d()).floatValue();
            d(list4, s3w.a(bz60.a(dVarC2, fFloatValue, fFloatValue), "sk_ball_flames"), 50L, "sk_ball_flames", z2, bVarI, 28032);
            d(list, s3w.a(j.r(aVar2, f2), "sk_ball"), 50L, "sk_ball", z2, bVarI, (i4 & 14) | 28032);
            List list5 = (List) ytwVar2.getValue();
            d dVarC3 = g.c(j.r(aVar2, f4), -(f2 * 0.45f), f2 * 0.35f);
            float fFloatValue2 = ((Number) wd0Var.d()).floatValue();
            d(list5, s3w.a(bz60.a(dVarC3, fFloatValue2, fFloatValue2), "sk_ball_circle_ring"), 70L, "sk_ball_circle_ring", z2, bVarI, 28032);
            bVarI.X(z4);
            j8 = 70;
            j6 = 50;
            j7 = 50;
        } else {
            str2 = str;
            bVarI.G();
            j6 = j2;
            j7 = j3;
            j8 = j4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str5 = str2;
            eVarZ.d = new Function2() { // from class: kwy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    bxy.a(list, list2, list3, z, j, j6, j7, j8, z2, j5, str5, f, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ytw ytwVar, final goj gojVar, final float f, final float f2, final boolean z, a aVar, final int i) {
        int i2;
        boolean z2;
        ytwVar.getClass();
        gojVar.getClass();
        b bVarI = aVar.i(-1610917925);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(ytwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(gojVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(1.127f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            if (!((Boolean) ((x5a0) gojVar.a0).getValue()).booleanValue() || z) {
                z2 = false;
                bVarI.N(1104802951);
            } else {
                bVarI.N(1109044092);
                float f3 = (f - (f / 9.0f)) * 1.127f;
                float f4 = f2 / 1.5f;
                egn egnVarB = kgn.b("PathTransition", bVarI, 0);
                wkf wkfVar = xkf.d;
                gzg0 gzg0VarE = yi0.e(1500, 0, wkfVar, 2);
                l850 l850Var = l850.b;
                int i3 = i2;
                egn.a aVarA = kgn.a(egnVarB, 0.398958f * f3, 0.5212375f * f3, yi0.a(gzg0VarE, l850Var, 0L, 4), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, bVarI, 28680, 0);
                egn.a aVarA2 = kgn.a(egnVarB, 0.35f * f4, 0.4f * f4, yi0.a(yi0.e(1500, 0, wkfVar, 2), l850Var, 0L, 4), "Y", bVarI, 28680, 0);
                egn.a aVarA3 = kgn.a(egnVarB, 0.375291f * f3, 0.49757048f * f3, yi0.a(yi0.e(1500, 0, wkfVar, 2), l850Var, 0L, 4), "ControlX", bVarI, 28680, 0);
                egn.a aVarA4 = kgn.a(egnVarB, 0.65f * f4, 0.7f * f4, yi0.a(yi0.e(1000, 0, wkfVar, 2), l850Var, 0L, 4), "ControlY", bVarI, 28680, 0);
                float fFloatValue = f3 - ((Number) aVarA.getValue()).floatValue();
                float fFloatValue2 = f3 - ((Number) aVarA3.getValue()).floatValue();
                final j90 j90VarA = m90.a();
                j90VarA.a(0.0f, f4);
                j90VarA.f(Math.abs(fFloatValue2) * 1.127f, ((Number) aVarA4.getValue()).floatValue(), Math.abs(fFloatValue) * 1.127f, ((Number) aVarA2.getValue()).floatValue());
                final j90 j90VarA2 = m90.a();
                j90VarA2.a(0.0f, f4);
                j90VarA2.f(Math.abs(fFloatValue2) * 1.127f, ((Number) aVarA4.getValue()).floatValue(), Math.abs(fFloatValue) * 1.127f, ((Number) aVarA2.getValue()).floatValue());
                j90VarA2.c(Math.abs(fFloatValue) * 1.127f, f4);
                d dVarE = j.e(d.a.b, 1.0f);
                boolean zA = ((i3 & 14) == 4) | bVarI.A(gojVar) | bVarI.A(j90VarA) | bVarI.A(j90VarA2);
                Object objY = bVarI.y();
                if (zA || objY == a.C0041a.a) {
                    objY = new Function1() { // from class: awy
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            ytw ytwVar2 = ytwVar;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar2.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, j90VarA, aqw.k(ytwVar2), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                tcf.Q1(tcfVar, j90VarA2, aqw.k(ytwVar2), 0.2f, rlh.a, 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                rxo.b(dVarE, (Function1) objY, bVarI, 6);
                z2 = false;
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bwy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxy.b(ytwVar, gojVar, f, f2, z, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:263:0x0b11 A[PHI: r7 r15
      0x0b11: PHI (r7v18 boolean) = (r7v11 boolean), (r7v12 boolean), (r7v13 boolean), (r7v19 boolean) binds: [B:262:0x0b0f, B:258:0x0ab5, B:250:0x09fb, B:239:0x0914] A[DONT_GENERATE, DONT_INLINE]
      0x0b11: PHI (r15v24 androidx.compose.runtime.b) = 
      (r15v10 androidx.compose.runtime.b)
      (r15v12 androidx.compose.runtime.b)
      (r15v14 androidx.compose.runtime.b)
      (r15v25 androidx.compose.runtime.b)
     binds: [B:262:0x0b0f, B:258:0x0ab5, B:250:0x09fb, B:239:0x0914] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final goj gojVar, final q9c0 q9c0Var, final ytw ytwVar, final boolean z, final Function0 function0, final Function1 function1, final boolean z2, final int i, final boolean z3, a aVar, final int i2) {
        a.C0041a.C0042a c0042a;
        String str;
        int i3;
        ytw<Boolean> ytwVar2;
        b bVar;
        boolean z4;
        float f;
        Object obj;
        ytw ytwVar3;
        String str2;
        Object uwyVar;
        ytw ytwVar4;
        wd0 wd0Var;
        ytw ytwVar5;
        long j;
        final goj gojVar2;
        Object obj2;
        a.C0041a.C0042a c0042a2;
        char c;
        int i4;
        boolean z5;
        long j2;
        int i5;
        gojVar.getClass();
        q9c0Var.getClass();
        ytwVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1089313412);
        int i6 = i2 | (bVarI.A(gojVar) ? 4 : 2) | (bVarI.A(q9c0Var) ? 32 : 16) | (bVarI.M(ytwVar) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.b(z2) ? 1048576 : 524288) | (bVarI.d(i) ? 8388608 : 4194304) | (bVarI.b(z3) ? 67108864 : 33554432);
        if (bVarI.q(i6 & 1, (i6 & 38347923) != 38347922)) {
            yp40 yp40Var = new yp40();
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a3 = a.C0041a.a;
            if (objY == c0042a3) {
                objY = m.b(new gly(0L));
                bVarI.r(objY);
            }
            ytw ytwVar6 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a3) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar7 = (ytw) objY2;
            String messageType = ((MultiplierResponse) ytwVar.getValue()).getMessageType();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a3) {
                objY3 = m.b(((MultiplierResponse) ytwVar.getValue()).getMessageType());
                bVarI.r(objY3);
            }
            ytw ytwVar8 = (ytw) objY3;
            Unit unit = Unit.a;
            int i9 = i6 & 896;
            boolean z6 = ((i6 & 57344) == 16384) | (i9 == 256);
            Object objY4 = bVarI.y();
            if (z6 || objY4 == c0042a3) {
                objY4 = new rwy(null, ytwVar, function0);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, unit, (Function2) objY4);
            boolean zG = Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_WAITING");
            d.a aVar2 = d.a.b;
            if (zG) {
                bVarI.N(1038610206);
                Object objY5 = bVarI.y();
                if (objY5 == c0042a3) {
                    objY5 = androidx.compose.runtime.j.a(((MultiplierResponse) ytwVar.getValue()).getMillisLeft());
                    bVarI.r(objY5);
                }
                isw iswVar = (isw) objY5;
                float fJ = iswVar.j();
                xvf.e(bVarI, unit, new swy(yp40Var, iswVar, null));
                d dVarA = abk0.a(h.j(j.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, i8 / 2.0f, 7), 2.0f);
                aiv aivVarC = g75.c(ht.a.h, false);
                int iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar2);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarG = j.g(aVar2, 1.0f);
                i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
                int iHashCode2 = Long.hashCode(bVarI.m());
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                float totalMillis = fJ / ((MultiplierResponse) ytwVar.getValue()).getTotalMillis();
                Float fValueOf = Float.valueOf(totalMillis);
                if (Float.isNaN(totalMillis)) {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                c0042a = c0042a3;
                i3 = 2;
                str = messageType;
                lkf0.b(op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVarI), pwo.e(R.string.powering_up_for_next_round, bVarI)), s3w.a(dw.a(h.i(aVar2, 3.0f, 0.0f, 0.0f, 9.0f), z3 ? 0.0f : 1.0f), "sk_powering_up"), j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._12ssp, bVarI), bVarI, 384, 0, 65528);
                boolean zC = bVarI.c(fFloatValue);
                Object objY6 = bVarI.y();
                if (zC || objY6 == c0042a) {
                    objY6 = new mhc0(fFloatValue);
                    bVarI.r(objY6);
                }
                Function0 function2 = (Function0) objY6;
                d dVarA2 = s3w.a(dw.a(j.i(j.w(aVar2, i7 * 0.55f), 6.0f), z3 ? 0.0f : 1.0f), "sk_powering_progress_bar");
                long jQ = ((cj5) ((x5a0) gojVar.f0).getValue()).q();
                long j3 = j58.l;
                Object objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = new zvy();
                    bVarI.r(objY7);
                }
                q330.c(function2, dVarA2, jQ, j3, 0, 0.0f, (Function1) objY7, bVarI, 1575936, 48);
                bVarI = bVarI;
                f30.a(bVarI, true, true, false);
            } else {
                c0042a = c0042a3;
                str = messageType;
                i3 = 2;
                bVarI.N(1030072806);
                bVarI.X(false);
            }
            final float density = i7 * ((mmd) bVarI.O(kna.h)).getDensity();
            String str3 = str;
            final float f2 = i;
            float f3 = (density - (density / 9.0f)) * 1.127f;
            float f4 = f2 / 1.5f;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = new ewy();
                bVarI.r(objY8);
            }
            tkf tkfVar = (tkf) objY8;
            ytw<Boolean> ytwVar9 = gojVar.a0;
            if (((Boolean) ((x5a0) ytwVar9).getValue()).booleanValue()) {
                bVarI.N(1041461865);
                egn egnVarB = kgn.b("PathTransition", bVarI, 0);
                wkf wkfVar = xkf.d;
                gzg0 gzg0VarE = yi0.e(1500, 0, wkfVar, i3);
                l850 l850Var = l850.b;
                ytwVar2 = ytwVar9;
                egn.a aVarA = kgn.a(egnVarB, 0.398958f * f3, 0.5212375f * f3, yi0.a(gzg0VarE, l850Var, 0L, 4), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, bVarI, 28680, 0);
                egn.a aVarA2 = kgn.a(egnVarB, f4 * 0.35f, 0.4f * f4, yi0.a(yi0.e(1500, 0, wkfVar, 2), l850Var, 0L, 4), "Y", bVarI, 28680, 0);
                bVar = bVarI;
                f = 0.0f;
                jFloatToRawIntBits = aqw.l((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(f3 - ((Number) kgn.a(egnVarB, 0.375291f * f3, 0.49757048f * f3, yi0.a(yi0.e(1500, 0, wkfVar, 2), l850Var, 0L, 4), "ControlX", bVarI, 28680, 0).getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(((Number) kgn.a(egnVarB, 0.65f * f4, 0.75f * f4, yi0.a(yi0.e(1500, 0, wkfVar, 2), l850Var, 0L, 4), "ControlY", bVarI, 28680, 0).getValue()).floatValue())) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(f3 - ((Number) aVarA.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(((Number) aVarA2.getValue()).floatValue())) & 4294967295L));
                z4 = false;
            } else {
                ytwVar2 = ytwVar9;
                bVar = bVarI;
                z4 = false;
                f = 0.0f;
                bVar.N(1030072806);
            }
            bVar.X(z4);
            long j4 = jFloatToRawIntBits;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.55f * density)) << 32) | (((long) Float.floatToRawIntBits(0.92f * f4)) & 4294967295L);
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((f3 - (0.38318f * f3)) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(f4 * 0.35f)) & 4294967295L);
            Object objY9 = bVar.y();
            if (objY9 == c0042a) {
                obj = null;
                objY9 = new wd0(new gly(jFloatToRawIntBits2), gjs.g, obj, 12);
                bVar.r(objY9);
            } else {
                obj = null;
            }
            wd0 wd0Var2 = (wd0) objY9;
            Object objY10 = bVar.y();
            if (objY10 == c0042a) {
                objY10 = ee0.a(0.6f);
                bVar.r(objY10);
            }
            wd0 wd0Var3 = (wd0) objY10;
            boolean zM = bVar.M(str3) | bVar.e(jFloatToRawIntBits3) | ((i6 & 458752) == 131072 ? true : z4);
            Object objY11 = bVar.y();
            if (zM || objY11 == c0042a) {
                ytwVar3 = ytwVar6;
                objY11 = new twy(str3, jFloatToRawIntBits3, function1, ytwVar3, null);
                str2 = str3;
                bVar.r(objY11);
            } else {
                str2 = str3;
                ytwVar3 = ytwVar6;
            }
            xvf.e(bVar, str2, (Function2) objY11);
            String messageType2 = ((MultiplierResponse) ytwVar.getValue()).getMessageType();
            boolean zA = (i9 == 256 ? true : z4) | bVar.A(wd0Var2) | bVar.e(jFloatToRawIntBits2) | bVar.A(wd0Var3) | bVar.e(jFloatToRawIntBits3);
            Object objY12 = bVar.y();
            if (zA || objY12 == c0042a) {
                ytwVar4 = ytwVar8;
                uwyVar = new uwy(ytwVar, wd0Var2, jFloatToRawIntBits2, wd0Var3, jFloatToRawIntBits3, ytwVar4, ytwVar7, tkfVar, null);
                wd0Var = wd0Var3;
                ytwVar5 = ytwVar7;
                j = jFloatToRawIntBits2;
                bVar.r(uwyVar);
            } else {
                wd0Var = wd0Var3;
                j = jFloatToRawIntBits2;
                ytwVar5 = ytwVar7;
                ytwVar4 = ytwVar8;
                uwyVar = objY12;
            }
            xvf.e(bVar, messageType2, (Function2) uwyVar);
            d dVarE = j.e(aVar2, 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC2 = g75.c(n54Var, z4);
            int iHashCode3 = Long.hashCode(bVar.m());
            ne00 ne00VarS3 = bVar.S();
            d dVarC3 = c.c(bVar, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar4);
            } else {
                bVar.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVar, aivVarC2, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVar, ne00VarS3, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVar, dVarC3, cVar2);
            final String str4 = str2;
            ytw ytwVar10 = ytwVar5;
            boolean z7 = false;
            a.C0041a.C0042a c0042a4 = c0042a;
            b(ytwVar, gojVar, density, f2, z, bVar, ((i6 >> 6) & 14) | 24576 | ((i6 << 3) & 112) | ((i6 << 6) & 458752));
            b bVar4 = bVar;
            ytw ytwVarC = wyh.c(q9c0Var.c, bVar4, 0, 7);
            ytw ytwVarC2 = wyh.c(q9c0Var.e, bVar4, 0, 7);
            ytw ytwVarC3 = wyh.c(q9c0Var.z, bVar4, 0, 7);
            ytw ytwVarC4 = wyh.c(q9c0Var.w, bVar4, 0, 7);
            ytw ytwVarC5 = wyh.c(q9c0Var.B, bVar4, 0, 7);
            ytw ytwVarC6 = wyh.c(q9c0Var.i, bVar4, 0, 7);
            List list = z2 ? (List) ytwVarC4.getValue() : (List) ytwVarC2.getValue();
            List list2 = z2 ? (List) ytwVarC5.getValue() : (List) ytwVarC3.getValue();
            if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || z) {
                gojVar2 = gojVar;
                obj2 = "ROUND_ONGOING";
                c0042a2 = c0042a4;
                c = 2048;
                i4 = -950425888;
                bVar4.N(-950425888);
                bVar4.X(false);
            } else {
                bVar4.N(-933563190);
                Object objY13 = bVar4.y();
                if (objY13 == c0042a4) {
                    objY13 = ee0.a(f);
                    bVar4.r(objY13);
                }
                final wd0 wd0Var4 = (wd0) objY13;
                obj2 = "ROUND_ONGOING";
                c0042a2 = c0042a4;
                xe0.b(0.5f, yi0.e(300, 0, null, 6), null, null, bVar4, 54, 28);
                String messageType3 = ((MultiplierResponse) ytwVar.getValue()).getMessageType();
                Boolean boolValueOf = Boolean.valueOf(z);
                int i10 = i6 & 7168;
                boolean zA2 = (i9 == 256) | (i10 == 2048) | bVar4.A(wd0Var4);
                Object objY14 = bVar4.y();
                if (zA2 || objY14 == c0042a2) {
                    objY14 = new vwy(wd0Var4, null, ytwVar, z);
                    bVar4.r(objY14);
                }
                xvf.g(messageType3, boolValueOf, (Function2) objY14, bVar4);
                Object objY15 = bVar4.y();
                if (objY15 == c0042a2) {
                    objY15 = ee0.a(f);
                    bVar4.r(objY15);
                }
                wd0 wd0Var5 = (wd0) objY15;
                i6 = i6;
                xe0.b(1.0f, yi0.e(1000, 0, null, 6), null, null, bVar4, 54, 28);
                String messageType4 = ((MultiplierResponse) ytwVar.getValue()).getMessageType();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                c = 2048;
                boolean zA3 = (i10 == 2048) | (i9 == 256) | bVar4.A(wd0Var5);
                Object objY16 = bVar4.y();
                if (zA3 || objY16 == c0042a2) {
                    objY16 = new wwy(wd0Var5, null, ytwVar, z);
                    bVar4.r(objY16);
                }
                xvf.g(messageType4, boolValueOf2, (Function2) objY16, bVar4);
                Object objY17 = bVar4.y();
                if (objY17 == c0042a2) {
                    objY17 = ee0.a(f);
                    bVar4.r(objY17);
                }
                wd0 wd0Var6 = (wd0) objY17;
                Boolean boolValueOf3 = Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), obj2) && !((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue());
                boolean zA4 = bVar4.A(wd0Var6);
                Object objY18 = bVar4.y();
                if (zA4 || objY18 == c0042a2) {
                    objY18 = new xwy(wd0Var6, null);
                    bVar4.r(objY18);
                }
                xvf.e(bVar4, boolValueOf3, (Function2) objY18);
                d dVarA3 = dw.a(j.e(aVar2, 1.0f), ((Number) wd0Var6.d()).floatValue());
                aiv aivVarC3 = g75.c(n54Var, false);
                int iHashCode4 = Long.hashCode(bVar4.m());
                ne00 ne00VarS4 = bVar4.S();
                d dVarC4 = c.c(bVar4, dVarA3);
                bVar4.D();
                if (bVar4.S) {
                    bVar4.F(aVar4);
                } else {
                    bVar4.p();
                }
                hlh0.a(bVar4, aivVarC3, bVar3);
                hlh0.a(bVar4, ne00VarS4, dVar2);
                if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                }
                hlh0.a(bVar4, dVarC4, cVar2);
                d dVarG2 = j.g(aVar2, 1.0f);
                boolean zC2 = bVar4.c(density) | bVar4.c(f2) | bVar4.A(wd0Var4) | (i9 == 256) | bVar4.A(gojVar);
                Object objY19 = bVar4.y();
                if (zC2 || objY19 == c0042a2) {
                    gojVar2 = gojVar;
                    z7 = false;
                    i5 = 6;
                    Function1 function3 = new Function1() { // from class: fwy
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            tcf tcfVar = (tcf) obj3;
                            tcfVar.getClass();
                            float f5 = density;
                            float f6 = (f5 - (f5 / 9.0f)) * 1.29f;
                            float f7 = f2 / 1.5f;
                            j90 j90VarA = m90.a();
                            j90VarA.a(0.0f, f7);
                            j90VarA.f(0.56759995f * f6, 0.69f * f7, 0.596625f * f6, 0.4f * f7);
                            PathMeasure pathMeasure = new PathMeasure(j90VarA.a, false);
                            j90 j90VarA2 = m90.a();
                            wd0 wd0Var7 = wd0Var4;
                            pathMeasure.getSegment(0.0f, pathMeasure.getLength() * ((Number) wd0Var7.d()).floatValue(), j90VarA2.a, true);
                            float[] fArr = new float[2];
                            pathMeasure.getPosTan(pathMeasure.getLength() * ((Number) wd0Var7.d()).floatValue(), fArr, null);
                            float f8 = fArr[0];
                            j90 j90VarA3 = m90.a();
                            bxz.r(j90VarA3, j90VarA2);
                            j90VarA3.c(f8, f7);
                            j90VarA3.c(0.0f, f7);
                            j90VarA3.close();
                            ytw ytwVar11 = ytwVar;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar11.getValue()).getMessageType(), "ROUND_ONGOING") && !((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, j90VarA3, aqw.k(ytwVar11), 0.2f, rlh.a, 48);
                                tcf.Q1(tcfVar, j90VarA2, aqw.k(ytwVar11), 1.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVar4.r(function3);
                    objY19 = function3;
                } else {
                    gojVar2 = gojVar;
                    z7 = false;
                    i5 = 6;
                }
                rxo.b(dVarG2, (Function1) objY19, bVar4, i5);
                bVar4.X(true);
                bVar4.X(z7);
                i4 = -950425888;
            }
            if (!z) {
                bVar4.N(-929075940);
                String str5 = (String) ytwVar4.getValue();
                switch (str5.hashCode()) {
                    case -1111393803:
                        z5 = z7;
                        bVarI = bVar4;
                        long j5 = j;
                        List list3 = list;
                        if (!str5.equals("ROUND_PRE_START")) {
                            bVarI.N(i4);
                            bVarI.X(z5);
                        } else {
                            bVarI.N(-928538493);
                            List list4 = (List) ytwVarC.getValue();
                            if (((Boolean) ytwVar10.getValue()).booleanValue()) {
                                list3 = (List) ytwVarC6.getValue();
                            }
                            a(list4, list3, list2, ((Boolean) ytwVar10.getValue()).booleanValue(), j5, 0L, 0L, 0L, false, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), ((Boolean) ytwVar10.getValue()).booleanValue() ? ((Number) wd0Var.d()).floatValue() : 0.6f, bVarI, 100663296, 0);
                            bVarI = bVarI;
                            bVarI.X(z5);
                        }
                        break;
                    case 2896988:
                        z5 = z7;
                        bVarI = bVar4;
                        if (!str5.equals("ROUND_WAITING")) {
                            bVarI.N(i4);
                            bVarI.X(z5);
                        } else {
                            bVarI.N(-929105483);
                            ytwVar10.setValue(Boolean.FALSE);
                            a((List) ytwVarC.getValue(), list, list2, false, j, 0L, 0L, 0L, false, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), 0.6f, bVarI, 100666368, 48);
                            bVarI = bVarI;
                            bVarI.X(z5);
                        }
                        break;
                    case 368523044:
                        z5 = z7;
                        bVarI = bVar4;
                        if (!str5.equals("ROUND_NEXT")) {
                            bVarI.N(i4);
                            bVarI.X(z5);
                        } else {
                            bVarI.N(-927910216);
                            if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                                bVarI.N(1771185001);
                                a((List) ytwVarC.getValue(), list, list2, true, j4, 0L, 0L, 0L, true, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), ((Number) wd0Var.d()).floatValue(), bVarI, 100666368, 0);
                                bVarI = bVarI;
                                bVarI.X(z5);
                            } else {
                                bVarI.N(-927329369);
                                a((List) ytwVarC.getValue(), list, list2, true, ((gly) wd0Var2.d()).a, 0L, 0L, 0L, true, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), ((Number) wd0Var.d()).floatValue(), bVarI, 100666368, 0);
                                bVarI = bVarI;
                                bVarI.X(z5);
                            }
                            bVarI.X(z5);
                        }
                        break;
                    case 1862985098:
                        if (str5.equals(obj2)) {
                            bVar4.N(-926713275);
                            if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                                bVar4.N(1771223561);
                                z5 = z7;
                                a((List) ytwVarC.getValue(), list, list2, true, j4, 0L, 0L, 0L, true, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), ((Number) wd0Var.d()).floatValue(), bVar4, 100666368, 0);
                                j2 = j4;
                                bVarI = bVar4;
                                bVarI.X(z5);
                            } else {
                                z5 = z7;
                                j2 = j4;
                                bVar4.N(-926134009);
                                a((List) ytwVarC.getValue(), list, list2, true, ((gly) wd0Var2.d()).a, 0L, 0L, 0L, true, ((gly) wd0Var2.d()).a, ((MultiplierResponse) ytwVar.getValue()).getMessageType(), ((Number) wd0Var.d()).floatValue(), bVar4, 100666368, 0);
                                bVarI = bVar4;
                                bVarI.X(z5);
                            }
                            ytwVar3.setValue(new gly(j2));
                        }
                        bVarI.X(z5);
                    default:
                        z5 = z7;
                        bVarI = bVar4;
                        bVarI.N(i4);
                        bVarI.X(z5);
                        break;
                }
            } else {
                z5 = z7;
                bVarI = bVar4;
                bVarI.N(i4);
            }
            bVarI.X(z5);
            bVarI.X(true);
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY20 = bVarI.y();
            a.C0041a.C0042a c0042a5 = c0042a2;
            if (objY20 == c0042a5) {
                objY20 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY20);
            }
            final v5b v5bVar = (v5b) objY20;
            Boolean boolValueOf4 = Boolean.valueOf(z);
            boolean zM2 = bVarI.M(str4) | ((i6 & 7168) == 2048 ? true : z5) | bVarI.A(v5bVar) | bVarI.A(gojVar2) | bVarI.A(ibsVar);
            Object objY21 = bVarI.y();
            if (zM2 || objY21 == c0042a5) {
                Function1 function4 = new Function1() { // from class: gwy
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v2, types: [hbs, lwy] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ((use) obj3).getClass();
                        final boolean z8 = z;
                        final String str6 = str4;
                        final v5b v5bVar2 = v5bVar;
                        final goj gojVar3 = gojVar2;
                        ?? r5 = new cbs() { // from class: lwy
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar5) {
                                if (aVar5 != s9s.a.ON_START || z8) {
                                    return;
                                }
                                String str7 = str6;
                                boolean zG2 = Intrinsics.g(str7, "ROUND_ONGOING");
                                goj gojVar4 = gojVar3;
                                if (zG2) {
                                    ej5.c(v5bVar2, null, null, new ywy(gojVar4, null), 3);
                                } else if (Intrinsics.g(str7, "ROUND_WAITING")) {
                                    ((x5a0) gojVar4.a0).setValue(Boolean.FALSE);
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r5);
                        return new zwy(ibsVar2, r5);
                    }
                };
                bVarI.r(function4);
                objY21 = function4;
            }
            xvf.b(ibsVar, str4, boolValueOf4, (Function1) objY21, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(q9c0Var, ytwVar, z, function0, function1, z2, i, z3, i2) { // from class: hwy
                public final /* synthetic */ q9c0 b;
                public final /* synthetic */ ytw c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int v;
                public final /* synthetic */ boolean w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(1);
                    bxy.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final List list, final d dVar, final long j, final String str, final boolean z, a aVar, final int i) {
        int i2;
        final d dVar2;
        String str2;
        boolean z2;
        List list2;
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        list.getClass();
        b bVarI = aVar.i(-986149541);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dVar2 = dVar;
            i2 |= bVarI.M(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= bVarI.M(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= bVarI.b(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            if (list.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                }
                final String str3 = str2;
                final boolean z3 = z2;
                function2 = new Function2() { // from class: cwy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bxy.d(list, dVar2, j, str3, z3, (a) obj, qj40.a(i | 1));
                        return Unit.a;
                    }
                };
            } else {
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = k.a(0);
                    bVarI.r(objY);
                }
                osw oswVar = (osw) objY;
                boolean zA = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | bVarI.A(list);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    axy axyVar = new axy(j, z, list, oswVar, null);
                    list2 = list;
                    bVarI.r(axyVar);
                    objY2 = axyVar;
                } else {
                    list2 = list;
                }
                xvf.e(bVarI, list2, (Function2) objY2);
                bVar = bVarI;
                h9n.b((c8n) list2.get(f.e(oswVar.D(), 0, list2.size() - 1)), str, dVar, bVar, ((i3 >> 6) & 112) | ((i3 << 3) & 896), 248);
            }
            eVarZ.d = function2;
        }
        list2 = list;
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final List list3 = list2;
            function2 = new Function2() { // from class: dwy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bxy.d(list3, dVar, j, str, z, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
