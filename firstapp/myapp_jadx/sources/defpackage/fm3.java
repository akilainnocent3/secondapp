package defpackage;

import android.os.SystemClock;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class fm3 {
    public static final void a(final gm3 gm3Var, float f, float f2, a aVar, final int i) {
        b bVar;
        final float f3;
        final float f4;
        b bVarI = aVar.i(-1323506332);
        int i2 = (bVarI.M(gm3Var) ? 4 : 2) | i | 432;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            final zdl zdlVar = (zdl) bVarI.O(kna.l);
            final boolean zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            final float fJ = ((t5a0) gm3Var.m).j();
            final float fJ2 = ((t5a0) gm3Var.l).j();
            d dVarE = j.e(d.a.b, 1.0f);
            f3 = 72.0f;
            f4 = 72.0f;
            op8 op8VarB = pp8.b(1625328078, new gaj() { // from class: gl3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Pair pair;
                    Object sl3Var;
                    float f5;
                    float f6;
                    float f7;
                    wd0 wd0Var;
                    ytw ytwVar;
                    isw iswVar;
                    final gm3 gm3Var2;
                    int i3;
                    xi0 xi0VarC;
                    float f8;
                    float f9;
                    float fFloatValue;
                    Object em3Var;
                    gm3 gm3Var3;
                    final wd0 wd0Var2;
                    final wd0 wd0Var3;
                    float f10;
                    boolean z;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fE = r75Var.e();
                        mmd mmdVar2 = mmdVar;
                        float fC1 = mmdVar2.C1(fE);
                        float fC2 = mmdVar2.C1(r75Var.d());
                        final float f11 = fJ;
                        float fC3 = mmdVar2.C1(f11);
                        float fC4 = mmdVar2.C1(fJ2);
                        float fC5 = mmdVar2.C1(f3);
                        float fC6 = mmdVar2.C1(f4);
                        float f12 = fC1 - fC3;
                        float fD = f.d(fC5, 0.0f, f12 < 0.0f ? 0.0f : f12);
                        float fD2 = f.d(f12 - fC6, 0.0f, f12 < 0.0f ? 0.0f : f12);
                        if (fD <= fD2) {
                            pair = new Pair(Float.valueOf(fD), Float.valueOf(fD2));
                        } else {
                            float f13 = f12 / 2.0f;
                            pair = new Pair(Float.valueOf(f13), Float.valueOf(f13));
                        }
                        float fFloatValue2 = ((Number) pair.a).floatValue();
                        float fFloatValue3 = ((Number) pair.b).floatValue();
                        float f14 = fFloatValue3 - fFloatValue2;
                        gm3 gm3Var4 = gm3Var;
                        ykf ykfVarB = gm3Var4.b();
                        isw iswVar2 = gm3Var4.k;
                        float f15 = ykfVarB == ykf.a ? fC4 : (fC2 - fC3) - fC4;
                        t5a0 t5a0Var = (t5a0) iswVar2;
                        float fD3 = f.d((t5a0Var.j() * f14) + fFloatValue2, fFloatValue2, fFloatValue3);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = ee0.a(f15);
                            aVar2.r(objY2);
                        }
                        wd0 wd0Var4 = (wd0) objY2;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = ee0.a(fD3);
                            aVar2.r(objY3);
                        }
                        wd0 wd0Var5 = (wd0) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = m.b(Boolean.FALSE);
                            aVar2.r(objY4);
                        }
                        ytw ytwVar2 = (ytw) objY4;
                        Unit unit = Unit.a;
                        final boolean z2 = zBooleanValue;
                        boolean zB = aVar2.b(z2);
                        Object objY5 = aVar2.y();
                        if (zB || objY5 == c0042a) {
                            objY5 = new rl3(z2, ytwVar2, null);
                            aVar2.r(objY5);
                        }
                        xvf.e(aVar2, unit, (Function2) objY5);
                        Object objY6 = aVar2.y();
                        if (objY6 == c0042a) {
                            objY6 = l.a(SystemClock.uptimeMillis());
                            aVar2.r(objY6);
                        }
                        xsw xswVar = (xsw) objY6;
                        Object objY7 = aVar2.y();
                        if (objY7 == c0042a) {
                            objY7 = androidx.compose.runtime.j.a(0.0f);
                            aVar2.r(objY7);
                        }
                        isw iswVar3 = (isw) objY7;
                        Object objY8 = aVar2.y();
                        if (objY8 == c0042a) {
                            objY8 = m.b(new g7f(0.0f));
                            aVar2.r(objY8);
                        }
                        ytw ytwVar3 = (ytw) objY8;
                        final twd0 twd0VarA = xe0.a(((g7f) ytwVar3.getValue()).a, yi0.e(70, 0, null, 6), "blur", aVar2, 432, 8);
                        Float fValueOf = Float.valueOf(fC2);
                        Float fValueOf2 = Float.valueOf(fC3);
                        ykf ykfVarB2 = gm3Var4.b();
                        boolean zM = aVar2.M(gm3Var4) | aVar2.c(fC4) | aVar2.c(fC2) | aVar2.c(fC3) | aVar2.A(wd0Var4);
                        Object objY9 = aVar2.y();
                        if (zM || objY9 == c0042a) {
                            f5 = fC5;
                            sl3Var = new sl3(gm3Var4, fC4, fC2, fC3, wd0Var4, ytwVar2, ytwVar3, iswVar3, xswVar, null);
                            f6 = fC2;
                            f7 = fC3;
                            wd0Var = wd0Var4;
                            ytwVar = ytwVar3;
                            iswVar = iswVar3;
                            aVar2.r(sl3Var);
                        } else {
                            sl3Var = objY9;
                            f7 = fC3;
                            wd0Var = wd0Var4;
                            ytwVar = ytwVar3;
                            f6 = fC2;
                            f5 = fC5;
                            iswVar = iswVar3;
                        }
                        xvf.f(fValueOf, fValueOf2, ykfVarB2, (Function2) sl3Var, aVar2);
                        Object[] objArr = {Float.valueOf(t5a0Var.j()), Float.valueOf(fC1), Float.valueOf(f7), Float.valueOf(f5), Float.valueOf(fC6)};
                        boolean zC = aVar2.c(fFloatValue2) | aVar2.M(gm3Var4) | aVar2.c(f14) | aVar2.c(fFloatValue3) | aVar2.A(wd0Var5);
                        Object objY10 = aVar2.y();
                        if (zC || objY10 == c0042a) {
                            objY10 = new tl3(fFloatValue2, gm3Var4, f14, fFloatValue3, wd0Var5, null);
                            gm3Var2 = gm3Var4;
                            aVar2.r(objY10);
                        } else {
                            gm3Var2 = gm3Var4;
                        }
                        xvf.h(objArr, (Function2) objY10, aVar2);
                        Object objY11 = aVar2.y();
                        if (objY11 == c0042a) {
                            objY11 = pr7.a(aVar2);
                        }
                        final psw pswVar = (psw) objY11;
                        ytw ytwVarA = n52.a(pswVar, aVar2, 6);
                        Object objY12 = aVar2.y();
                        if (objY12 == c0042a) {
                            objY12 = m.b(Boolean.FALSE);
                            aVar2.r(objY12);
                        }
                        ytw ytwVar4 = (ytw) objY12;
                        Object objY13 = aVar2.y();
                        if (objY13 == c0042a) {
                            objY13 = m.b(Boolean.FALSE);
                            aVar2.r(objY13);
                        }
                        ytw ytwVar5 = (ytw) objY13;
                        String str = (String) ((x5a0) gm3Var2.e).getValue();
                        Object objY14 = aVar2.y();
                        if (objY14 == c0042a) {
                            objY14 = new ul3(ytwVar5, null);
                            aVar2.r(objY14);
                        }
                        xvf.e(aVar2, str, (Function2) objY14);
                        Integer num = (Integer) ((x5a0) gm3Var2.f).getValue();
                        boolean zM2 = aVar2.M(gm3Var2);
                        Object objY15 = aVar2.y();
                        if (zM2 || objY15 == c0042a) {
                            objY15 = new vl3(gm3Var2, ytwVar5, null);
                            aVar2.r(objY15);
                        }
                        xvf.e(aVar2, num, (Function2) objY15);
                        Object objY16 = aVar2.y();
                        if (objY16 == c0042a) {
                            objY16 = m.b(Boolean.FALSE);
                            aVar2.r(objY16);
                        }
                        final ytw ytwVar6 = (ytw) objY16;
                        Boolean boolValueOf = Boolean.valueOf(gm3Var2.a());
                        wd0 wd0Var6 = wd0Var;
                        boolean zM3 = aVar2.M(gm3Var2) | aVar2.b(z2);
                        Object objY17 = aVar2.y();
                        if (zM3 || objY17 == c0042a) {
                            objY17 = new wl3(gm3Var2, z2, ytwVar6, null);
                            aVar2.r(objY17);
                        }
                        xvf.e(aVar2, boolValueOf, (Function2) objY17);
                        float fFloatValue4 = 1.0f;
                        twd0 twd0VarB = xe0.b((((Boolean) ytwVarA.getValue()).booleanValue() || ((Boolean) ytwVar4.getValue()).booleanValue() || (((Boolean) ytwVar2.getValue()).booleanValue() && ((Boolean) ytwVar5.getValue()).booleanValue())) ? 0.85f : 1.0f, yi0.e(120, 0, null, 6), "pressScale", null, aVar2, 3120, 20);
                        Object objY18 = aVar2.y();
                        if (objY18 == c0042a) {
                            objY18 = m.b(Boolean.valueOf(z2));
                            aVar2.r(objY18);
                        }
                        ytw ytwVar7 = (ytw) objY18;
                        float f16 = (!((Boolean) r19.getValue()).booleanValue() || z2) ? 0.0f : 1.0f;
                        if (!((Boolean) r19.getValue()).booleanValue() || z2) {
                            i3 = 0;
                            xi0VarC = yi0.c();
                        } else {
                            i3 = 0;
                            xi0VarC = yi0.e(400, 0, null, 6);
                        }
                        Object objY19 = aVar2.y();
                        if (objY19 == c0042a) {
                            objY19 = new il3(ytwVar7, i3);
                            aVar2.r(objY19);
                        }
                        twd0 twd0VarB2 = xe0.b(f16, xi0VarC, "introScale", (Function1) objY19, aVar2, 27648, 4);
                        twd0 twd0VarB3 = xe0.b((!((Boolean) r19.getValue()).booleanValue() || z2) ? 0.0f : 1.0f, (!((Boolean) r19.getValue()).booleanValue() || z2) ? yi0.c() : yi0.e(400, 0, null, 6), "introAlpha", null, aVar2, 3072, 20);
                        if (z2) {
                            f8 = 1.0f;
                        } else if (gm3Var2.a()) {
                            f8 = 0.0f;
                        } else {
                            ((Boolean) ytwVar6.getValue()).getClass();
                            f8 = 1.0f;
                        }
                        xi0 xi0VarC2 = z2 ? yi0.c() : yi0.e(400, 0, null, 6);
                        boolean zM4 = aVar2.M(gm3Var2) | aVar2.b(z2);
                        Object objY20 = aVar2.y();
                        if (zM4 || objY20 == c0042a) {
                            objY20 = new Function1() { // from class: jl3
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    rq3 rq3Var;
                                    ((Float) obj4).getClass();
                                    gm3 gm3Var5 = gm3Var2;
                                    if (gm3Var5.a() && !z2 && (rq3Var = gm3Var5.b) != null) {
                                        rq3Var.invoke();
                                    }
                                    ytw ytwVar8 = ytwVar6;
                                    if (((Boolean) ytwVar8.getValue()).booleanValue()) {
                                        ytwVar8.setValue(Boolean.FALSE);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY20);
                        }
                        twd0 twd0VarB4 = xe0.b(f8, xi0VarC2, "exitScale", (Function1) objY20, aVar2, 3072, 4);
                        if (z2) {
                            f9 = 1.0f;
                        } else if (gm3Var2.a()) {
                            f9 = 0.0f;
                        } else {
                            ((Boolean) ytwVar6.getValue()).getClass();
                            f9 = 1.0f;
                        }
                        twd0 twd0VarB5 = xe0.b(f9, z2 ? yi0.c() : yi0.e(400, 0, null, 6), "exitAlpha", null, aVar2, 3072, 20);
                        boolean z3 = !z2 && (gm3Var2.a() || ((Boolean) ytwVar6.getValue()).booleanValue());
                        if (z3) {
                            fFloatValue = ((Number) twd0VarB4.getValue()).floatValue();
                        } else {
                            fFloatValue = !((Boolean) ytwVar7.getValue()).booleanValue() ? ((Number) twd0VarB2.getValue()).floatValue() : ((Number) twd0VarB.getValue()).floatValue();
                        }
                        if (z3) {
                            fFloatValue4 = ((Number) twd0VarB5.getValue()).floatValue();
                        } else if (!((Boolean) ytwVar7.getValue()).booleanValue()) {
                            fFloatValue4 = ((Number) twd0VarB3.getValue()).floatValue();
                        }
                        final float f17 = fFloatValue4;
                        Object[] objArr2 = {Float.valueOf(f6), Float.valueOf(fC1), Float.valueOf(f7), Float.valueOf(fC4), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3)};
                        boolean zA = aVar2.A(wd0Var6) | aVar2.c(f7) | aVar2.c(f6) | aVar2.M(gm3Var2);
                        zdl zdlVar2 = zdlVar;
                        boolean zA2 = zA | aVar2.A(zdlVar2);
                        v5b v5bVar2 = v5bVar;
                        boolean zA3 = zA2 | aVar2.A(v5bVar2) | aVar2.A(wd0Var5) | aVar2.c(fFloatValue2) | aVar2.c(fFloatValue3) | aVar2.c(fC4) | aVar2.c(fC1);
                        Object objY21 = aVar2.y();
                        if (zA3 || objY21 == c0042a) {
                            float f18 = f7;
                            gm3 gm3Var5 = gm3Var2;
                            em3Var = new em3(xswVar, ytwVar4, gm3Var5, wd0Var6, f18, f6, zdlVar2, v5bVar2, fC4, wd0Var5, fFloatValue2, fFloatValue3, fC1, iswVar, ytwVar);
                            gm3Var3 = gm3Var5;
                            wd0Var2 = wd0Var6;
                            f7 = f18;
                            wd0Var3 = wd0Var5;
                            f10 = fC1;
                            aVar2.r(em3Var);
                        } else {
                            em3Var = objY21;
                            wd0Var2 = wd0Var6;
                            gm3Var3 = gm3Var2;
                            wd0Var3 = wd0Var5;
                            f10 = fC1;
                        }
                        d.a aVar3 = d.a.b;
                        final d dVarB = wje0.b(aVar3, objArr2, (PointerInputEventHandler) em3Var);
                        final float f19 = ((g7f) wl8.d(new g7f(((g7f) twd0VarA.getValue()).a + 21.599998f + 2.0f), new g7f(6.0f))).a;
                        final int iC1 = (int) mmdVar2.C1(f19);
                        final boolean z4 = !z3;
                        boolean zA4 = aVar2.A(wd0Var2) | aVar2.d(iC1) | aVar2.A(wd0Var3);
                        Object objY22 = aVar2.y();
                        if (zA4 || objY22 == c0042a) {
                            objY22 = new Function1() { // from class: kl3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ((mmd) obj4).getClass();
                                    int iFloatValue = (int) ((Number) wd0Var2.d()).floatValue();
                                    int i4 = iC1;
                                    return new iwo((((long) (((int) ((Number) wd0Var3.d()).floatValue()) - i4)) & 4294967295L) | (((long) (iFloatValue - i4)) << 32));
                                }
                            };
                            aVar2.r(objY22);
                        }
                        d dVarC = j.C(g.b(aVar3, (Function1) objY22), null, 3);
                        Object objY23 = aVar2.y();
                        if (objY23 == r15) {
                            z = false;
                            objY23 = new ll3(0);
                            aVar2.r(objY23);
                        } else {
                            z = false;
                        }
                        d dVarB2 = xa80.b(dVarC, z, (Function1) objY23);
                        aiv aivVarC = g75.c(ht.a.a, z);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarB2);
                        yka.k.getClass();
                        final float f20 = fFloatValue;
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, yka.a.d);
                        Object objY24 = aVar2.y();
                        if (objY24 == r15) {
                            objY24 = m.b(b120.c);
                            aVar2.r(objY24);
                        }
                        ytw ytwVar8 = (ytw) objY24;
                        Float fValueOf3 = Float.valueOf(f6);
                        Float fValueOf4 = Float.valueOf(f10);
                        Float fValueOf5 = Float.valueOf(f7);
                        boolean zM5 = aVar2.M(mmdVar2) | aVar2.A(wd0Var2) | aVar2.A(wd0Var3) | aVar2.c(f7) | aVar2.c(f6) | aVar2.c(f10);
                        float f21 = f10;
                        Object objY25 = aVar2.y();
                        if (zM5 || objY25 == r15) {
                            yl3 yl3Var = new yl3(mmdVar2, ytwVar8, wd0Var2, wd0Var3, f7, f6, f21, null);
                            aVar2.r(yl3Var);
                            objY25 = yl3Var;
                        }
                        xvf.f(fValueOf3, fValueOf4, fValueOf5, (Function2) objY25, aVar2);
                        String strA = cb40.a(R.string.component_betslip__new_betslip_button_hint, new Object[0], aVar2);
                        b120 b120Var = (b120) ytwVar8.getValue();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) gm3Var3.i).getValue()).booleanValue();
                        float f22 = (ytwVar8.getValue() == b120.d || ytwVar8.getValue() == b120.b) ? 40.0f : 26.0f;
                        long jA = c68.a(R.color.hint, aVar2);
                        boolean zM6 = aVar2.M(gm3Var3);
                        Object objY26 = aVar2.y();
                        if (zM6 || objY26 == r15) {
                            objY26 = new ml3(gm3Var3, 0);
                            aVar2.r(objY26);
                        }
                        final gm3 gm3Var6 = gm3Var3;
                        o9m.c("betslip_hint", strA, b120Var, zBooleanValue2, false, 12.0f, -8.0f, f22, true, jA, 240.0f, 4.0f, 4.0f, (Function0) objY26, pp8.b(-1659533166, new gaj() { // from class: nl3
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar5 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((Function0) obj4).getClass();
                                int i4 = 0;
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    gm3 gm3Var7 = gm3Var6;
                                    Integer num2 = (Integer) ((x5a0) gm3Var7.f).getValue();
                                    String str2 = (String) ((x5a0) gm3Var7.e).getValue();
                                    im3 im3Var = (im3) ((x5a0) gm3Var7.g).getValue();
                                    String str3 = (String) ((x5a0) gm3Var7.h).getValue();
                                    float f23 = ((g7f) twd0VarA.getValue()).a;
                                    boolean zM7 = aVar5.M(gm3Var7);
                                    Object objY27 = aVar5.y();
                                    if (zM7 || objY27 == a.C0041a.a) {
                                        objY27 = new pl3(gm3Var7, i4);
                                        aVar5.r(objY27);
                                    }
                                    fl3.a(num2, str2, im3Var, str3, z4, dVarB, pswVar, f20, f17, f23, f11, f19, null, (Function0) objY27, aVar5, 1572864);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 102457350, 25014, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            bVar = bVarI;
            q75.a(dVarE, ht.a.a, false, op8VarB, bVar, 3126, 4);
        } else {
            bVar = bVarI;
            bVar.G();
            f3 = f;
            f4 = f2;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f3, f4, i) { // from class: hl3
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fm3.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(wd0 wd0Var, final xsw xswVar, final isw iswVar, final ytw ytwVar, float f, int i, x1b x1bVar) {
        zl3 zl3Var;
        if (x1bVar instanceof zl3) {
            zl3Var = (zl3) x1bVar;
            int i2 = zl3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zl3Var.d = i2 - Integer.MIN_VALUE;
            } else {
                zl3Var = new zl3(x1bVar);
            }
        } else {
            zl3Var = new zl3(x1bVar);
        }
        zl3 zl3Var2 = zl3Var;
        Object objA = zl3Var2.c;
        y5b y5bVar = y5b.a;
        int i3 = zl3Var2.d;
        try {
            if (i3 == 0) {
                uj50.b(objA);
                final aq40 aq40Var = new aq40();
                aq40Var.a = ((Number) wd0Var.d()).floatValue();
                xswVar.K(SystemClock.uptimeMillis());
                Float f2 = new Float(f);
                gzg0 gzg0VarE = yi0.e(i, 0, null, 6);
                Function1 function1 = new Function1() { // from class: ol3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wd0 wd0Var2 = (wd0) obj;
                        wd0Var2.getClass();
                        float fFloatValue = ((Number) wd0Var2.d()).floatValue();
                        aq40 aq40Var2 = aq40Var;
                        fm3.c(xswVar, iswVar, ytwVar, fFloatValue - aq40Var2.a, 0.0f);
                        aq40Var2.a = fFloatValue;
                        return Unit.a;
                    }
                };
                zl3Var2.a = iswVar;
                zl3Var2.b = ytwVar;
                zl3Var2.d = 1;
                objA = wd0.a(wd0Var, f2, gzg0VarE, null, function1, zl3Var2, 4);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ytwVar = zl3Var2.b;
                iswVar = zl3Var2.a;
                uj50.b(objA);
            }
            ytwVar.setValue(new g7f(0.0f));
            iswVar.A(0.0f);
            return Unit.a;
        } catch (Throwable th) {
            ytwVar.setValue(new g7f(0.0f));
            iswVar.A(0.0f);
            throw th;
        }
    }

    public static final void c(xsw xswVar, isw iswVar, ytw<g7f> ytwVar, float f, float f2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jU = jUptimeMillis - xswVar.u();
        if (jU < 1) {
            jU = 1;
        }
        iswVar.A((((((float) Math.hypot(f, f2)) * 1000.0f) / jU) * 0.25f) + (iswVar.j() * 0.75f));
        xswVar.K(jUptimeMillis);
        float fD = f.d((iswVar.j() - 300.0f) / 3700.0f, 0.0f, 1.0f);
        ytwVar.setValue(new g7f(fD * fD * 1.8f));
    }
}
