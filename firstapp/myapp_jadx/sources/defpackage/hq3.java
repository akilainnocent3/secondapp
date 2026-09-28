package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m9c0.d;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hq3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hq3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                op8 op8Var = (op8) obj3;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarF = g3w.f(j.e(aVar, 1.0f), true, function0);
                    aiv aivVarC = g75.c(ht.a.h, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarF);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar3);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, aivVarC, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    op8Var.invoke(androidx.compose.foundation.layout.d.a, aVar2, 6);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                final m9c0 m9c0Var = (m9c0) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                a aVar4 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    BetContainerState betContainerState = (BetContainerState) wyh.c(m9c0Var.R0().a, aVar4, 0, 7).getValue();
                    final BetContainerState betContainerState2 = (BetContainerState) wyh.c(m9c0Var.S0().a, aVar4, 0, 7).getValue();
                    d dVarB = androidx.compose.foundation.a.b(j.e(aVar, 1.0f), j58.l, zk40.a);
                    aiv aivVarC2 = g75.c(ht.a.e, false);
                    int iHashCode2 = Long.hashCode(aVar4.m());
                    ne00 ne00VarO2 = aVar4.o();
                    d dVarC2 = c.c(aVar4, dVarB);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar4.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar4.D();
                    if (aVar4.g()) {
                        aVar4.F(aVar5);
                    } else {
                        aVar4.p();
                    }
                    hlh0.a(aVar4, aivVarC2, yka.a.f);
                    hlh0.a(aVar4, ne00VarO2, yka.a.e);
                    yka.a.C1350a c1350a2 = yka.a.g;
                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                    }
                    hlh0.a(aVar4, dVarC2, yka.a.d);
                    Boolean bool = (Boolean) ((HashMap) ((x5a0) m9c0Var.S0().d).getValue()).get(Long.valueOf(betContainerState2.getRoundId()));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) m9c0Var.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) m9c0Var.c1().e0).getValue(), (cj5) ((x5a0) m9c0Var.c1().f0).getValue());
                    ytw<Boolean> ytwVar = m9c0Var.f1().e;
                    Integer num = (Integer) ((x5a0) m9c0Var.A2).getValue();
                    int iIntValue3 = num != null ? num.intValue() : 0;
                    MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) m9c0Var.S0().b).getValue();
                    t290 t290VarJ1 = m9c0Var.j1();
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) m9c0Var.c1().q0).getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) ((x5a0) m9c0Var.y2).getValue()).booleanValue();
                    boolean resetChips = betContainerState2.getResetChips();
                    boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                    String str = (String) ((x5a0) m9c0Var.c1().v).getValue();
                    boolean z = egb.a(betContainerState) > 0;
                    l1z l1zVarE1 = m9c0Var.e1();
                    osw oswVar = m9c0Var.S0().M;
                    boolean zA = aVar4.A(m9c0Var);
                    Object objY = aVar4.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function1() { // from class: l8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                Long lQ0 = m9c0Var2.q0();
                                if (m9c0Var2.j0) {
                                    ((BetContainerState) m9c0Var2.S0().a.getValue()).setBetData(betData);
                                    goj.A1(m9c0Var2.c1(), betData, m9c0Var2.z0, m9c0Var2.U0, m9c0Var2.h2, 1, "MANUAL", new b9c0(), new c9c0(m9c0Var2, 0), lQ0, null, null, 1536);
                                } else {
                                    m9c0Var2.p0(m9c0Var2.S0(), betData, lQ0);
                                }
                                m9c0Var2.R0().S1(true);
                                ((x5a0) m9c0Var2.j1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA2 = aVar4.A(m9c0Var);
                    Object objY2 = aVar4.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: p8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                z83 z83Var = (z83) obj5;
                                z83Var.getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                m9c0Var2.r2(z83Var, m9c0Var2.S0());
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY2);
                    }
                    Function1 function2 = (Function1) objY2;
                    boolean zA3 = aVar4.A(m9c0Var);
                    Object objY3 = aVar4.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new w4r(m9c0Var, i3);
                        aVar4.r(objY3);
                    }
                    Function0 function3 = (Function0) objY3;
                    boolean zA4 = aVar4.A(m9c0Var);
                    Object objY4 = aVar4.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new w440(m9c0Var, i3);
                        aVar4.r(objY4);
                    }
                    Function0 function4 = (Function0) objY4;
                    boolean zA5 = aVar4.A(m9c0Var);
                    Object objY5 = aVar4.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new x440(m9c0Var, i3);
                        aVar4.r(objY5);
                    }
                    Function0 function5 = (Function0) objY5;
                    boolean zA6 = aVar4.A(m9c0Var) | aVar4.A(betContainerState2);
                    Object objY6 = aVar4.y();
                    if (zA6 || objY6 == c0042a) {
                        objY6 = new q8c0(i2, m9c0Var, betContainerState2);
                        aVar4.r(objY6);
                    }
                    Function1 function6 = (Function1) objY6;
                    boolean zA7 = aVar4.A(m9c0Var) | aVar4.A(betContainerState2);
                    Object objY7 = aVar4.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new Function2() { // from class: r8c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                BetData betData = (BetData) obj5;
                                boolean zBooleanValue5 = ((Boolean) obj6).booleanValue();
                                betData.getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                ((x5a0) m9c0Var2.c1().J).setValue(betData);
                                if (zBooleanValue5) {
                                    m9c0Var2.S0().G1(true);
                                    if (!betContainerState2.getBetPlaced()) {
                                        if (m9c0Var2.j0) {
                                            ((BetContainerState) m9c0Var2.S0().a.getValue()).setBetData(betData);
                                            goj.A1(m9c0Var2.c1(), betData, m9c0Var2.z0, m9c0Var2.U0, m9c0Var2.h2, 1, "MANUAL", new x8c0(), new sah(m9c0Var2, 2), null, null, null, 1792);
                                        } else {
                                            m9c0Var2.p0(m9c0Var2.S0(), betData, null);
                                        }
                                    }
                                } else {
                                    m9c0Var2.S0().G1(false);
                                }
                                m9c0Var2.R0().S1(true);
                                m9c0Var2.R0().P1(0);
                                ((x5a0) m9c0Var2.j1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY7);
                    }
                    Function2 function7 = (Function2) objY7;
                    boolean zA8 = aVar4.A(m9c0Var);
                    Object objY8 = aVar4.y();
                    if (zA8 || objY8 == c0042a) {
                        objY8 = new Function1() { // from class: s8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ((Boolean) obj5).getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                m9c0Var2.R0().S1(true);
                                x5a0 x5a0Var = (x5a0) m9c0Var2.j1;
                                x5a0Var.setValue(Boolean.FALSE);
                                m9c0Var2.p1 = 2;
                                x5a0Var.setValue(Boolean.TRUE);
                                m9c0Var2.S0().Q1(-1);
                                m9c0Var2.S0().R1(true);
                                m9c0Var2.S0().P1(2);
                                m9c0Var2.S0().S1(false);
                                m9c0Var2.R0().P1(0);
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY8);
                    }
                    Function1 function8 = (Function1) objY8;
                    boolean zA9 = aVar4.A(m9c0Var);
                    Object objY9 = aVar4.y();
                    if (zA9 || objY9 == c0042a) {
                        objY9 = new Function0() { // from class: t8c0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                m9c0 m9c0Var2 = m9c0Var;
                                m9c0Var2.S0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                                ((x5a0) m9c0Var2.y2).setValue(Boolean.FALSE);
                                ((x5a0) m9c0Var2.S0().R).setValue(Boolean.TRUE);
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY9);
                    }
                    Function0 function9 = (Function0) objY9;
                    boolean zA10 = aVar4.A(m9c0Var);
                    Object objY10 = aVar4.y();
                    if (zA10 || objY10 == c0042a) {
                        objY10 = m9c0Var.new d();
                        aVar4.r(objY10);
                    }
                    Function2 function10 = (Function2) objY10;
                    boolean zA11 = aVar4.A(m9c0Var) | aVar4.A(composeView);
                    Object objY11 = aVar4.y();
                    if (zA11 || objY11 == c0042a) {
                        objY11 = new Function1() { // from class: u8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                ((x5a0) m9c0Var2.c1().T).setValue(Boolean.TRUE);
                                ((x5a0) m9c0Var2.c1().J).setValue(betData);
                                ((BetContainerState) m9c0Var2.S0().a.getValue()).setBetData(betData);
                                ytw<String> ytwVar2 = m9c0Var2.c1().I;
                                op5 op5Var = op5.a;
                                ComposeView composeView2 = composeView;
                                String strB = w68.b(composeView2, R.string.auto_bet_requirement_message_cms);
                                String string = composeView2.getContext().getString(R.string.auto_bet_one_tap);
                                string.getClass();
                                ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                ((x5a0) m9c0Var2.c1().R).setValue(f78.a(composeView2, R.string.yes_bet, w68.b(composeView2, R.string.yes_btn_cms), null));
                                ((x5a0) m9c0Var2.c1().S).setValue(f78.a(composeView2, R.string.cancel_bet, w68.b(composeView2, R.string.cancel_btn_cms), null));
                                m9c0Var2.H1();
                                m9c0Var2.c1().E1(m9c0Var2.S0());
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY11);
                    }
                    Function1 function11 = (Function1) objY11;
                    boolean zA12 = aVar4.A(m9c0Var);
                    Object objY12 = aVar4.y();
                    int i4 = 3;
                    if (zA12 || objY12 == c0042a) {
                        objY12 = new qn3(m9c0Var, i4);
                        aVar4.r(objY12);
                    }
                    Function1 function12 = (Function1) objY12;
                    boolean zA13 = aVar4.A(m9c0Var);
                    Object objY13 = aVar4.y();
                    if (zA13 || objY13 == c0042a) {
                        objY13 = new rn3(m9c0Var, i4);
                        aVar4.r(objY13);
                    }
                    Function0 function13 = (Function0) objY13;
                    boolean zA14 = aVar4.A(m9c0Var);
                    Object objY14 = aVar4.y();
                    if (zA14 || objY14 == c0042a) {
                        objY14 = new Function0() { // from class: m8c0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                m9c0Var.V1();
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY14);
                    }
                    Function0 function14 = (Function0) objY14;
                    boolean zA15 = aVar4.A(m9c0Var);
                    Object objY15 = aVar4.y();
                    if (zA15 || objY15 == c0042a) {
                        objY15 = new Function1() { // from class: n8c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                m9c0 m9c0Var2 = m9c0Var;
                                m9c0Var2.e3(m9c0Var2.S0(), betData);
                                return Unit.a;
                            }
                        };
                        aVar4.r(objY15);
                    }
                    x2a.a(iIntValue3, sl2Var, betContainerState2, t290VarJ1, multiplierResponse, function1, function2, function3, function4, resetChips, function5, function6, function7, function8, function9, zBooleanValue2, zBooleanValue, zBooleanValue3, function10, function11, function12, zBooleanValue4, str, function13, function14, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar4, 0, 254);
                    aVar4.s();
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
