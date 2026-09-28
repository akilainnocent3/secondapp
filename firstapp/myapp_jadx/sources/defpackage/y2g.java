package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ylb0.q;
import ylb0.r;
import ylb0.s;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y2g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b3g.b(str, str2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final ylb0 ylb0Var = (ylb0) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ul2 ul2VarR0 = ylb0Var.R0();
                    ytw<Integer> ytwVar = ylb0Var.T2;
                    BetContainerState betContainerState = (BetContainerState) wyh.c(ul2VarR0.a, aVar2, 0, 7).getValue();
                    final BetContainerState betContainerState2 = (BetContainerState) wyh.c(ylb0Var.S0().a, aVar2, 0, 7).getValue();
                    d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarB);
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
                    Boolean bool = (Boolean) ((HashMap) ((x5a0) ylb0Var.S0().d).getValue()).get(Long.valueOf(betContainerState2.getRoundId()));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) ylb0Var.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) ylb0Var.c1().e0).getValue(), (cj5) ((x5a0) ylb0Var.c1().f0).getValue());
                    ytw<Boolean> ytwVar2 = ylb0Var.f1().e;
                    ytw ytwVarC = wyh.c(ylb0Var.D3().f, aVar2, 0, 7);
                    y6s y6sVar = (y6s) wyh.c(ylb0Var.D3().d, aVar2, 0, 7).getValue();
                    List list = y6sVar instanceof y6s.d ? ((y6s.d) y6sVar).a : m2g.a;
                    ytw<MultiplierResponse> ytwVar3 = ylb0Var.R0().b;
                    ytw<HashMap<Long, Boolean>> ytwVar4 = ylb0Var.R0().d;
                    x5a0 x5a0Var = (x5a0) ytwVar3;
                    x5a0 x5a0Var2 = (x5a0) ylb0Var.S0().d;
                    x5a0 x5a0Var3 = (x5a0) ytwVar4;
                    vaw vawVarA = taw.a(2, betContainerState2, betContainerState, (jph0) ytwVarC.getValue(), list, ((MultiplierResponse) x5a0Var.getValue()).getMessageType(), ((MultiplierResponse) x5a0Var.getValue()).getRoundId(), (HashMap) x5a0Var2.getValue(), (HashMap) x5a0Var3.getValue(), ylb0Var.E3(), ylb0Var.E3(), ylb0Var.E3(), aVar2);
                    Configuration configuration = composeView.getResources().getConfiguration();
                    float f = composeView.getResources().getDisplayMetrics().density;
                    op5 op5Var = op5.a;
                    String string = ylb0Var.getString(R.string.autobet_stopped_min_bet_higher_cms);
                    string.getClass();
                    String string2 = ylb0Var.getString(R.string.autobet_stopped_min_bet_higher);
                    string2.getClass();
                    String strC = op5.c(op5Var, string, string2);
                    String strC2 = op5.c(op5Var, pwo.e(R.string.bonus_round_max_stake, aVar2), pwo.e(R.string.bonus_round_chip_click_warning, aVar2));
                    float f2 = configuration.screenWidthDp * f;
                    x5a0 x5a0Var4 = (x5a0) ytwVar;
                    Integer num = (Integer) x5a0Var4.getValue();
                    int iIntValue3 = num != null ? num.intValue() : 0;
                    boolean zD = aVar2.d(iIntValue3) | aVar2.c(f2);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zD || objY == c0042a) {
                        objY = vi8.a(iIntValue3, f2);
                        aVar2.r(objY);
                    }
                    fnb0 fnb0Var = (fnb0) objY;
                    Integer num2 = (Integer) x5a0Var4.getValue();
                    int iIntValue4 = num2 != null ? num2.intValue() : 0;
                    MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) ylb0Var.S0().b).getValue();
                    Double d = vawVarA.b;
                    boolean z = vawVarA.a;
                    int i2 = vawVarA.c;
                    boolean z2 = vawVarA.d;
                    t290 t290VarJ1 = ylb0Var.j1();
                    int i3 = iIntValue4;
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) ylb0Var.c1().q0).getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) ((x5a0) ylb0Var.N2).getValue()).booleanValue();
                    boolean resetChips = betContainerState2.getResetChips();
                    boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue();
                    String str3 = (String) ((x5a0) ylb0Var.c1().v).getValue();
                    boolean z3 = egb.a(betContainerState) > 0;
                    l1z l1zVarE1 = ylb0Var.e1();
                    float f3 = fnb0Var.f;
                    float f4 = fnb0Var.g;
                    boolean zA = aVar2.A(ylb0Var);
                    Object objY2 = aVar2.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: mlb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                ylb0 ylb0Var2 = ylb0Var;
                                if (ylb0Var2.j0) {
                                    ((BetContainerState) ylb0Var2.S0().a.getValue()).setBetData(betData);
                                    goj.A1(ylb0Var2.c1(), betData, ylb0Var2.z0, ylb0Var2.U0, ylb0Var2.h2, 1, "MANUAL", new ulb0(), new urk(ylb0Var2, 2), null, null, null, 1792);
                                } else {
                                    ylb0Var2.p0(ylb0Var2.S0(), betData, null);
                                }
                                ylb0Var2.R0().S1(true);
                                ((x5a0) ylb0Var2.j1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY2);
                    }
                    Function1 function1 = (Function1) objY2;
                    boolean zA2 = aVar2.A(ylb0Var);
                    Object objY3 = aVar2.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new r5z(ylb0Var, 1);
                        aVar2.r(objY3);
                    }
                    Function1 function2 = (Function1) objY3;
                    boolean zA3 = aVar2.A(ylb0Var);
                    Object objY4 = aVar2.y();
                    if (zA3 || objY4 == c0042a) {
                        objY4 = new leb(ylb0Var, 2);
                        aVar2.r(objY4);
                    }
                    Function0 function0 = (Function0) objY4;
                    boolean zA4 = aVar2.A(ylb0Var);
                    Object objY5 = aVar2.y();
                    if (zA4 || objY5 == c0042a) {
                        objY5 = new meb(ylb0Var, 1);
                        aVar2.r(objY5);
                    }
                    Function0 function3 = (Function0) objY5;
                    boolean zA5 = aVar2.A(ylb0Var);
                    Object objY6 = aVar2.y();
                    if (zA5 || objY6 == c0042a) {
                        objY6 = new neb(ylb0Var, 2);
                        aVar2.r(objY6);
                    }
                    Function0 function4 = (Function0) objY6;
                    boolean zA6 = aVar2.A(ylb0Var) | aVar2.A(betContainerState2);
                    Object objY7 = aVar2.y();
                    if (zA6 || objY7 == c0042a) {
                        objY7 = new Function1() { // from class: qlb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                boolean zBooleanValue5 = ((Boolean) obj5).booleanValue();
                                ylb0 ylb0Var2 = ylb0Var;
                                ylb0Var2.R0().S1(true);
                                ytw<Boolean> ytwVar5 = ylb0Var2.j1;
                                Boolean bool2 = Boolean.FALSE;
                                x5a0 x5a0Var5 = (x5a0) ytwVar5;
                                x5a0Var5.setValue(bool2);
                                if (zBooleanValue5) {
                                    ylb0Var2.p1 = 2;
                                    Boolean bool3 = Boolean.TRUE;
                                    x5a0Var5.setValue(bool3);
                                    ylb0Var2.S0().P1(1);
                                    ylb0Var2.S0().Q1(-1);
                                    ylb0Var2.S0().R1(true);
                                    ylb0Var2.S0().S1(false);
                                    ((x5a0) ylb0Var2.S0().c).setValue(bool3);
                                } else {
                                    ylb0Var2.S0().Q1(15);
                                    ylb0Var2.S0().M1(!betContainerState2.getExtraKey());
                                    ylb0Var2.S0().R1(false);
                                    ((x5a0) ylb0Var2.S0().c).setValue(bool2);
                                }
                                ylb0Var2.R0().P1(0);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY7);
                    }
                    Function1 function5 = (Function1) objY7;
                    boolean zA7 = aVar2.A(ylb0Var) | aVar2.A(betContainerState2);
                    Object objY8 = aVar2.y();
                    if (zA7 || objY8 == c0042a) {
                        objY8 = new Function2() { // from class: rlb0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                BetData betData = (BetData) obj5;
                                boolean zBooleanValue5 = ((Boolean) obj6).booleanValue();
                                betData.getClass();
                                ylb0 ylb0Var2 = ylb0Var;
                                ((x5a0) ylb0Var2.c1().J).setValue(betData);
                                if (zBooleanValue5) {
                                    ylb0Var2.S0().G1(true);
                                    if (!betContainerState2.getBetPlaced()) {
                                        if (ylb0Var2.j0) {
                                            ((BetContainerState) ylb0Var2.S0().a.getValue()).setBetData(betData);
                                            goj.A1(ylb0Var2.c1(), betData, ylb0Var2.z0, ylb0Var2.U0, ylb0Var2.h2, 1, "MANUAL", new wlb0(), new afb(ylb0Var2, 1), null, null, null, 1792);
                                        } else {
                                            ylb0Var2.p0(ylb0Var2.S0(), betData, null);
                                        }
                                    }
                                } else {
                                    ylb0Var2.S0().G1(false);
                                    Double betValue = betData.getBetValue();
                                    if (betValue != null) {
                                        ((s5a0) ylb0Var2.S0().O).t(betValue.doubleValue());
                                    }
                                }
                                ylb0Var2.R0().S1(true);
                                ylb0Var2.R0().P1(0);
                                ((x5a0) ylb0Var2.j1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY8);
                    }
                    Function2 function6 = (Function2) objY8;
                    boolean zA8 = aVar2.A(ylb0Var);
                    Object objY9 = aVar2.y();
                    if (zA8 || objY9 == c0042a) {
                        objY9 = new Function1() { // from class: slb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ((Boolean) obj5).getClass();
                                ylb0 ylb0Var2 = ylb0Var;
                                ylb0Var2.R0().S1(true);
                                x5a0 x5a0Var5 = (x5a0) ylb0Var2.j1;
                                x5a0Var5.setValue(Boolean.FALSE);
                                ylb0Var2.p1 = 2;
                                x5a0Var5.setValue(Boolean.TRUE);
                                ylb0Var2.S0().Q1(-1);
                                ylb0Var2.S0().R1(true);
                                ylb0Var2.S0().P1(2);
                                ylb0Var2.S0().S1(false);
                                ylb0Var2.R0().P1(0);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY9);
                    }
                    Function1 function7 = (Function1) objY9;
                    boolean zA9 = aVar2.A(ylb0Var);
                    Object objY10 = aVar2.y();
                    if (zA9 || objY10 == c0042a) {
                        objY10 = new m1q(ylb0Var, 1);
                        aVar2.r(objY10);
                    }
                    Function0 function8 = (Function0) objY10;
                    boolean zA10 = aVar2.A(ylb0Var) | aVar2.M(strC) | aVar2.M(strC2);
                    Object objY11 = aVar2.y();
                    if (zA10 || objY11 == c0042a) {
                        objY11 = ylb0Var.new q(strC, strC2);
                        aVar2.r(objY11);
                    }
                    Function2 function9 = (Function2) objY11;
                    boolean zA11 = aVar2.A(ylb0Var) | aVar2.A(composeView);
                    Object objY12 = aVar2.y();
                    if (zA11 || objY12 == c0042a) {
                        objY12 = new Function1() { // from class: tlb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                ylb0 ylb0Var2 = ylb0Var;
                                ytw<Boolean> ytwVar5 = ylb0Var2.c1().T;
                                Boolean bool2 = Boolean.TRUE;
                                ((x5a0) ytwVar5).setValue(bool2);
                                ((x5a0) ylb0Var2.c1().J).setValue(betData);
                                ((BetContainerState) ylb0Var2.S0().a.getValue()).setBetData(betData);
                                ytw<String> ytwVar6 = ylb0Var2.c1().I;
                                op5 op5Var2 = op5.a;
                                ComposeView composeView2 = composeView;
                                String strB = w68.b(composeView2, R.string.auto_bet_requirement_message_cms);
                                String string3 = composeView2.getContext().getString(R.string.auto_bet_one_tap);
                                string3.getClass();
                                ((x5a0) ytwVar6).setValue(op5.c(op5Var2, strB, string3));
                                ((x5a0) ylb0Var2.c1().R).setValue(f78.a(composeView2, R.string.yes_bet, w68.b(composeView2, R.string.yes_btn_cms), null));
                                ((x5a0) ylb0Var2.c1().S).setValue(f78.a(composeView2, R.string.cancel_bet, w68.b(composeView2, R.string.cancel_btn_cms), null));
                                ((x5a0) ylb0Var2.m1).setValue(bool2);
                                ylb0Var2.c1().E1(ylb0Var2.S0());
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY12);
                    }
                    Function1 function10 = (Function1) objY12;
                    boolean zA12 = aVar2.A(ylb0Var);
                    Object objY13 = aVar2.y();
                    if (zA12 || objY13 == c0042a) {
                        objY13 = new o0g(ylb0Var, 1);
                        aVar2.r(objY13);
                    }
                    Function1 function11 = (Function1) objY13;
                    boolean zA13 = aVar2.A(ylb0Var);
                    Object objY14 = aVar2.y();
                    if (zA13 || objY14 == c0042a) {
                        objY14 = new re2(ylb0Var, 2);
                        aVar2.r(objY14);
                    }
                    Function0 function12 = (Function0) objY14;
                    boolean zA14 = aVar2.A(ylb0Var);
                    Object objY15 = aVar2.y();
                    if (zA14 || objY15 == c0042a) {
                        objY15 = new q0g(ylb0Var, 2);
                        aVar2.r(objY15);
                    }
                    Function0 function13 = (Function0) objY15;
                    boolean zA15 = aVar2.A(ylb0Var);
                    Object objY16 = aVar2.y();
                    if (zA15 || objY16 == c0042a) {
                        objY16 = new Function1() { // from class: nlb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                ylb0 ylb0Var2 = ylb0Var;
                                ylb0Var2.e3(ylb0Var2.S0(), betData);
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY16);
                    }
                    Function1 function14 = (Function1) objY16;
                    boolean zA16 = aVar2.A(ylb0Var);
                    Object objY17 = aVar2.y();
                    if (zA16 || objY17 == c0042a) {
                        objY17 = new Function0() { // from class: olb0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ylb0Var.t3();
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY17);
                    }
                    x2a.a(i3, sl2Var, betContainerState2, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str3, function12, function13, function14, l1zVarE1, z3, null, d, z, i2, z2, f3, f4, (Function0) objY17, aVar2, 0, 1);
                    Object value = ((x5a0) ylb0Var.S0().T).getValue();
                    Boolean boolValueOf = Boolean.valueOf(vawVarA.a);
                    String messageType = ((MultiplierResponse) x5a0Var.getValue()).getMessageType();
                    boolean zA17 = aVar2.A(ylb0Var) | aVar2.M(vawVarA);
                    Object objY18 = aVar2.y();
                    if (zA17 || objY18 == c0042a) {
                        objY18 = ylb0Var.new r(vawVarA, null);
                        aVar2.r(objY18);
                    }
                    xvf.f(value, boolValueOf, messageType, (Function2) objY18, aVar2);
                    Object[] objArr = {((MultiplierResponse) x5a0Var.getValue()).getMessageType(), Long.valueOf(((MultiplierResponse) x5a0Var.getValue()).getRoundId()), (HashMap) x5a0Var3.getValue(), (HashMap) x5a0Var2.getValue()};
                    boolean zA18 = aVar2.A(ylb0Var);
                    Object objY19 = aVar2.y();
                    if (zA18 || objY19 == c0042a) {
                        objY19 = ylb0Var.new s(null);
                        aVar2.r(objY19);
                    }
                    xvf.h(objArr, (Function2) objY19, aVar2);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
