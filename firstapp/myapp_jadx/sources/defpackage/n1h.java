package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import com.sportygames.vip.data.TurboUsageCountResponse;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n1h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1h(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0514  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        wd0 wd0Var;
        wd0 wd0Var2;
        x5a0 x5a0Var;
        boolean z2;
        boolean z3;
        float f;
        d dVarB;
        final ytw ytwVar;
        final boolean z4;
        Double turboValue;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q1h.a((Function0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            case 1:
                v3a0 v3a0Var = (v3a0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s3a0.b(v3a0Var, null, ci9.a, aVar, 384, 2);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 2:
                final a6c0 a6c0Var = (a6c0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final ytw<b6c0> ytwVar2 = a6c0Var.h;
                    ytw<Boolean> ytwVar3 = a6c0Var.i;
                    d.a aVar3 = d.a.b;
                    d dVarB2 = ls7.b(j.e(aVar3, 1.0f));
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarB2);
                    yka.k.getClass();
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar2, d160VarA, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar2, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC, cVar);
                    d dVarB3 = ls7.b(j.e(aVar3, 1.0f));
                    n54 n54Var = ht.a.a;
                    aiv aivVarC = g75.c(n54Var, false);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarB3);
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
                    hlh0.a(aVar2, aivVarC, bVar);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    Object value = ((x5a0) gci0.h).getValue();
                    Boolean bool = Boolean.TRUE;
                    boolean zG = Intrinsics.g(value, bool);
                    twd0<Boolean> twd0Var = gci0.F;
                    twd0<Boolean> twd0Var2 = gci0.D;
                    Context context = (Context) aVar2.O(AndroidCompositionLocals_androidKt.b);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = context.getSharedPreferences("vip_elite_data", 0);
                        aVar2.r(objY);
                    }
                    SharedPreferences sharedPreferences = (SharedPreferences) objY;
                    Object objY2 = aVar2.y();
                    if (objY2 == c0042a) {
                        objY2 = ee0.a(0.0f);
                        aVar2.r(objY2);
                    }
                    wd0 wd0Var3 = (wd0) objY2;
                    Object objY3 = aVar2.y();
                    if (objY3 == c0042a) {
                        objY3 = m.b(Boolean.FALSE);
                        aVar2.r(objY3);
                    }
                    ytw ytwVar4 = (ytw) objY3;
                    Object objY4 = aVar2.y();
                    if (objY4 == c0042a) {
                        objY4 = ee0.a(0.0f);
                        aVar2.r(objY4);
                    }
                    wd0 wd0Var4 = (wd0) objY4;
                    Object objY5 = aVar2.y();
                    if (objY5 == c0042a) {
                        objY5 = m.b(Boolean.FALSE);
                        aVar2.r(objY5);
                    }
                    ytw ytwVar5 = (ytw) objY5;
                    mmd mmdVar = (mmd) aVar2.O(kna.h);
                    Boolean boolValueOf = Boolean.valueOf(zG);
                    x5a0 x5a0Var2 = (x5a0) twd0Var2;
                    Boolean bool2 = (Boolean) x5a0Var2.getValue();
                    bool2.getClass();
                    boolean zA = aVar2.A(wd0Var3) | aVar2.b(zG) | aVar2.A(sharedPreferences) | aVar2.M(x5a0Var2);
                    Object objY6 = aVar2.y();
                    if (zA || objY6 == c0042a) {
                        objY6 = new y5c0(zG, wd0Var3, sharedPreferences, ytwVar4, x5a0Var2, null);
                        z = zG;
                        wd0Var = wd0Var3;
                        aVar2.r(objY6);
                    } else {
                        wd0Var = wd0Var3;
                        z = zG;
                    }
                    xvf.g(boolValueOf, bool2, (Function2) objY6, aVar2);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    x5a0 x5a0Var3 = (x5a0) twd0Var;
                    Boolean bool3 = (Boolean) x5a0Var3.getValue();
                    bool3.getClass();
                    wd0 wd0Var5 = wd0Var;
                    Boolean bool4 = (Boolean) x5a0Var2.getValue();
                    bool4.getClass();
                    boolean zB = aVar2.b(z) | aVar2.A(wd0Var4) | aVar2.M(x5a0Var3) | aVar2.M(x5a0Var2) | aVar2.A(sharedPreferences);
                    Object objY7 = aVar2.y();
                    if (zB || objY7 == c0042a) {
                        wd0Var2 = wd0Var4;
                        x5a0Var = x5a0Var3;
                        z2 = z;
                        objY7 = new z5c0(z2, wd0Var2, sharedPreferences, ytwVar5, x5a0Var, x5a0Var2, null);
                        aVar2.r(objY7);
                    } else {
                        wd0Var2 = wd0Var4;
                        x5a0Var = x5a0Var3;
                        z2 = z;
                    }
                    xvf.f(boolValueOf2, bool3, bool4, (Function2) objY7, aVar2);
                    i060 i060VarC = j060.c(8.0f);
                    hfs hfsVar = new hfs(b.k(new j58(abi0.a), new j58(abi0.b)), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2);
                    boolean z5 = z2 && ((Boolean) ytwVar4.getValue()).booleanValue();
                    final float fFloatValue = ((Number) wd0Var2.d()).floatValue();
                    float f2 = 1.0f - (fFloatValue * 0.2f);
                    final float fC1 = mmdVar.C1(5.0f);
                    boolean z6 = z2 && ((Boolean) x5a0Var.getValue()).booleanValue();
                    x5a0 x5a0Var4 = (x5a0) ytwVar3;
                    if (!((Boolean) x5a0Var4.getValue()).booleanValue()) {
                        f2 = 0.0f;
                    }
                    d dVarC3 = j.c(j.g(aVar3, f2), 1.0f);
                    n54 n54Var2 = ht.a.d;
                    androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                    d dVarA = ls7.a(dw.a(dVar2.b(dVarC3, n54Var2), ((Boolean) x5a0Var4.getValue()).booleanValue() ? 1.0f : 0.0f), i060VarC);
                    if (z5 && ((Boolean) x5a0Var4.getValue()).booleanValue()) {
                        z3 = z5;
                        f = 0.0f;
                        dVarB = d35.b(androidx.compose.foundation.a.a(androidx.compose.foundation.a.b(aVar3, abi0.g, i060VarC), ya5.a.a(0.0f, 0.0f, 14, b.k(new j58(j58.c(((Number) wd0Var5.d()).floatValue(), abi0.e)), new j58(abi0.f))), i060VarC, 0.0f, 4), 0.5f, hfsVar, i060VarC);
                    } else {
                        z3 = z5;
                        f = 0.0f;
                        dVarB = aVar3;
                    }
                    d dVarN = dVarA.n(dVarB);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    int iHashCode3 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO3 = aVar2.o();
                    d dVarC4 = c.c(aVar2, dVarN);
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
                    hlh0.a(aVar2, aivVarC2, bVar);
                    hlh0.a(aVar2, ne00VarO3, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                        j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                    }
                    hlh0.a(aVar2, dVarC4, cVar);
                    boolean zA2 = aVar2.A(a6c0Var);
                    Object objY8 = aVar2.y();
                    if (zA2 || objY8 == c0042a) {
                        ytwVar = ytwVar4;
                        objY8 = new o1h(1, a6c0Var, ytwVar);
                        aVar2.r(objY8);
                    } else {
                        ytwVar = ytwVar4;
                    }
                    Function1 function1 = (Function1) objY8;
                    d dVarE = j.e(aVar3, 1.0f);
                    if (z3 && ((Boolean) x5a0Var4.getValue()).booleanValue()) {
                        f = 1.0f;
                    }
                    d dVarF = h.f(dVarE, f);
                    boolean zA3 = aVar2.A(a6c0Var) | aVar2.M(ytwVar2);
                    Object objY9 = aVar2.y();
                    if (zA3 || objY9 == c0042a) {
                        objY9 = new Function1(a6c0Var, ytwVar2, ytwVar) { // from class: u5c0
                            public final /* synthetic */ ytw a;
                            public final /* synthetic */ ytw b;

                            {
                                this.a = ytwVar2;
                                this.b = ytwVar;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                SideBetTabContainer sideBetTabContainer = (SideBetTabContainer) obj4;
                                sideBetTabContainer.getClass();
                                a6c0.a(sideBetTabContainer);
                                a6c0.b(sideBetTabContainer, (b6c0) ((x5a0) this.a).getValue(), ((Boolean) this.b.getValue()).booleanValue());
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY9);
                    }
                    androidx.compose.ui.viewinterop.b.a(function1, dVarF, (Function1) objY9, aVar2, 0, 0);
                    aVar2.s();
                    if (z6) {
                        aVar2.N(1992396894);
                        twd0<StakeSafeUsageCountResponse> twd0Var3 = gci0.b;
                        twd0<TurboUsageCountResponse> twd0Var4 = gci0.d;
                        ytw ytwVarB = n95.b(a6c0Var.f, aVar2);
                        ytw ytwVarB2 = n95.b(a6c0Var.g, aVar2);
                        boolean z7 = ((BetContainerState) ytwVarB.getValue()).getBetPlaced() || ((BetContainerState) ytwVarB2.getValue()).getBetPlaced();
                        boolean z8 = ((BetContainerState) ytwVarB.getValue()).getBetInProgress() || ((BetContainerState) ytwVarB2.getValue()).getBetInProgress();
                        boolean z9 = egb.a((BetContainerState) ytwVarB.getValue()) > 0 || egb.a((BetContainerState) ytwVarB2.getValue()) > 0;
                        if (!Intrinsics.g(((x5a0) gci0.z).getValue(), bool) || !((Boolean) ((x5a0) gci0.j).getValue()).booleanValue() || ((Boolean) ((x5a0) gci0.I).getValue()).booleanValue() || ((Boolean) ((x5a0) gci0.n).getValue()).booleanValue() || z7 || z8) {
                            z4 = false;
                        } else {
                            TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) twd0Var4).getValue();
                            if (((turboUsageCountResponse == null || (turboValue = turboUsageCountResponse.getTurboValue()) == null) ? 0.0d : turboValue.doubleValue()) < 100.0d) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        x5a0 x5a0Var5 = (x5a0) twd0Var3;
                        StakeSafeUsageCountResponse stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) x5a0Var5.getValue();
                        int maxAllowed = stakeSafeUsageCountResponse != null ? stakeSafeUsageCountResponse.getMaxAllowed() : 0;
                        StakeSafeUsageCountResponse stakeSafeUsageCountResponse2 = (StakeSafeUsageCountResponse) x5a0Var5.getValue();
                        int used = stakeSafeUsageCountResponse2 != null ? stakeSafeUsageCountResponse2.getUsed() : 0;
                        boolean zG2 = Intrinsics.g(((x5a0) gci0.B).getValue(), bool);
                        d dVarJ = h.j(dVar2.b(j.c(j.g(aVar3, 0.2f), 1.0f), ht.a.f), 5.0f, 0.0f, 0.0f, 0.0f, 14);
                        boolean zC = aVar2.c(fFloatValue) | aVar2.c(fC1);
                        Object objY10 = aVar2.y();
                        if (zC || objY10 == c0042a) {
                            objY10 = new Function1() { // from class: v5c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    a7l a7lVar = (a7l) obj4;
                                    a7lVar.getClass();
                                    a7lVar.B((Float.intBitsToFloat((int) (a7lVar.d() >> 32)) + fC1) * (1.0f - fFloatValue));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY10);
                        }
                        d dVarA2 = dw.a(androidx.compose.ui.graphics.a.a(dVarJ, (Function1) objY10), z4 ? 1.0f : 0.6f);
                        boolean zB2 = aVar2.b(z4) | aVar2.A(a6c0Var);
                        Object objY11 = aVar2.y();
                        if (zB2 || objY11 == c0042a) {
                            objY11 = new Function0() { // from class: w5c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z4) {
                                        a6c0Var.e.invoke();
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY11);
                        }
                        jtd0.a(maxAllowed, used, zG2, z4, z9, dVarA2, (Function0) objY11, aVar2, 0);
                        aVar2 = aVar2;
                    } else {
                        aVar2.N(1976213375);
                    }
                    aVar2.H();
                    aVar2.s();
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                qcg0.a((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ n1h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
