package defpackage;

import android.content.res.Resources;
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
import x7c0.d;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cfc implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cfc(x7c0 x7c0Var, ComposeView composeView) {
        this.b = x7c0Var;
        this.c = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dfc.a((String) obj4, (String) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                final x7c0 x7c0Var = (x7c0) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    BetContainerState betContainerState = (BetContainerState) wyh.c(x7c0Var.S0().a, aVar, 0, 7).getValue();
                    BetContainerState betContainerState2 = (BetContainerState) wyh.c(x7c0Var.R0().a, aVar, 0, 7).getValue();
                    ytw<Boolean> ytwVar = x7c0Var.f1().e;
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        Resources resources = x7c0Var.getResources();
                        resources.getClass();
                        objY = o6a.b(resources, resources.getDisplayMetrics().heightPixels, resources.getDisplayMetrics().widthPixels);
                        aVar.r(objY);
                    }
                    n6a n6aVar = (n6a) objY;
                    boolean zBooleanValue = ((Boolean) ((x5a0) x7c0Var.c1().g0).getValue()).booleanValue();
                    d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarB);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    HashMap map = (HashMap) ((x5a0) x7c0Var.S0().d).getValue();
                    Boolean bool = map != null ? (Boolean) map.get(Long.valueOf(betContainerState.getRoundId())) : null;
                    boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                    String str = (String) ((x5a0) x7c0Var.c1().v).getValue();
                    MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) x7c0Var.S0().b).getValue();
                    l1z l1zVarE1 = x7c0Var.e1();
                    boolean zBooleanValue3 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                    boolean z = egb.a(betContainerState2) > 0;
                    t290 t290VarJ1 = x7c0Var.j1();
                    boolean zBooleanValue4 = ((Boolean) ((x5a0) x7c0Var.c1().q0).getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) ((x5a0) x7c0Var.y2).getValue()).booleanValue();
                    boolean zBooleanValue6 = ((Boolean) ((x5a0) x7c0Var.c1().b0).getValue()).booleanValue();
                    osw oswVar = x7c0Var.S0().M;
                    boolean zBooleanValue7 = ((Boolean) ((x5a0) x7c0Var.c1().m0).getValue()).booleanValue();
                    boolean zA = aVar.A(x7c0Var);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: v6c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                final x7c0 x7c0Var2 = x7c0Var;
                                Long lQ0 = x7c0Var2.q0();
                                int i2 = 1;
                                if (x7c0Var2.j0) {
                                    ((BetContainerState) x7c0Var2.S0().a.getValue()).setBetData(betData);
                                    goj.A1(x7c0Var2.c1(), betData, x7c0Var2.z0, x7c0Var2.U0, x7c0Var2.h2, 1, "MANUAL", new Function0() { // from class: m7c0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            x7c0Var2.e2();
                                            return Unit.a;
                                        }
                                    }, new bl80(x7c0Var2, i2), lQ0, null, null, 1536);
                                } else {
                                    x7c0Var2.p0(x7c0Var2.S0(), betData, lQ0);
                                }
                                x7c0Var2.R0().S1(true);
                                ((x5a0) x7c0Var2.j1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function1 function1 = (Function1) objY2;
                    boolean zA2 = aVar.A(x7c0Var);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: x6c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                z83 z83Var = (z83) obj5;
                                z83Var.getClass();
                                x7c0 x7c0Var2 = x7c0Var;
                                x7c0Var2.r2(z83Var, x7c0Var2.S0());
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    Function1 function2 = (Function1) objY3;
                    boolean zA3 = aVar.A(x7c0Var);
                    Object objY4 = aVar.y();
                    if (zA3 || objY4 == c0042a) {
                        objY4 = new qdc(x7c0Var, 1);
                        aVar.r(objY4);
                    }
                    Function0 function0 = (Function0) objY4;
                    boolean zA4 = aVar.A(x7c0Var);
                    Object objY5 = aVar.y();
                    if (zA4 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: z6c0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                x7c0 x7c0Var2 = x7c0Var;
                                x7c0Var2.R0().T1(true);
                                x7c0Var2.S0().T1(false);
                                ((x5a0) x7c0Var2.j1).setValue(Boolean.FALSE);
                                x7c0Var2.R0().R1(false);
                                x7c0Var2.S0().R1(false);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY5);
                    }
                    Function0 function3 = (Function0) objY5;
                    boolean zA5 = aVar.A(x7c0Var);
                    Object objY6 = aVar.y();
                    if (zA5 || objY6 == c0042a) {
                        objY6 = new sdc(x7c0Var, 1);
                        aVar.r(objY6);
                    }
                    Function0 function4 = (Function0) objY6;
                    boolean zA6 = aVar.A(x7c0Var);
                    Object objY7 = aVar.y();
                    if (zA6 || objY7 == c0042a) {
                        objY7 = new al3(x7c0Var, 1);
                        aVar.r(objY7);
                    }
                    Function1 function5 = (Function1) objY7;
                    boolean zA7 = aVar.A(x7c0Var);
                    Object objY8 = aVar.y();
                    if (zA7 || objY8 == c0042a) {
                        objY8 = new lk80(x7c0Var, 1);
                        aVar.r(objY8);
                    }
                    Function2 function6 = (Function2) objY8;
                    boolean zA8 = aVar.A(x7c0Var);
                    Object objY9 = aVar.y();
                    if (zA8 || objY9 == c0042a) {
                        objY9 = new Function1() { // from class: a7c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ((Boolean) obj5).getClass();
                                x7c0 x7c0Var2 = x7c0Var;
                                x7c0Var2.R0().S1(true);
                                x5a0 x5a0Var = (x5a0) x7c0Var2.j1;
                                x5a0Var.setValue(Boolean.FALSE);
                                x7c0Var2.p1 = 2;
                                x5a0Var.setValue(Boolean.TRUE);
                                x7c0Var2.S0().Q1(-1);
                                x7c0Var2.S0().R1(true);
                                x7c0Var2.S0().P1(2);
                                x7c0Var2.S0().S1(false);
                                x7c0Var2.R0().P1(0);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY9);
                    }
                    Function1 function7 = (Function1) objY9;
                    boolean zA9 = aVar.A(x7c0Var);
                    Object objY10 = aVar.y();
                    if (zA9 || objY10 == c0042a) {
                        objY10 = new Function0() { // from class: b7c0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                x7c0 x7c0Var2 = x7c0Var;
                                x7c0Var2.S0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                                ((x5a0) x7c0Var2.y2).setValue(Boolean.FALSE);
                                ((x5a0) x7c0Var2.S0().R).setValue(Boolean.TRUE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY10);
                    }
                    Function0 function8 = (Function0) objY10;
                    boolean zA10 = aVar.A(x7c0Var);
                    Object objY11 = aVar.y();
                    if (zA10 || objY11 == c0042a) {
                        objY11 = x7c0Var.new d();
                        aVar.r(objY11);
                    }
                    Function2 function9 = (Function2) objY11;
                    boolean zA11 = aVar.A(x7c0Var) | aVar.A(composeView);
                    Object objY12 = aVar.y();
                    if (zA11 || objY12 == c0042a) {
                        objY12 = new Function1() { // from class: c7c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                x7c0 x7c0Var2 = x7c0Var;
                                ytw<Boolean> ytwVar2 = x7c0Var2.c1().T;
                                Boolean bool2 = Boolean.TRUE;
                                ((x5a0) ytwVar2).setValue(bool2);
                                ((x5a0) x7c0Var2.c1().J).setValue(betData);
                                ((BetContainerState) x7c0Var2.S0().a.getValue()).setBetData(betData);
                                ytw<String> ytwVar3 = x7c0Var2.c1().I;
                                op5 op5Var = op5.a;
                                ComposeView composeView2 = composeView;
                                String strB = w68.b(composeView2, R.string.auto_bet_requirement_message_cms);
                                String string = composeView2.getContext().getString(R.string.auto_bet_one_tap);
                                string.getClass();
                                ((x5a0) ytwVar3).setValue(op5.c(op5Var, strB, string));
                                ((x5a0) x7c0Var2.c1().R).setValue(f78.a(composeView2, R.string.yes_bet, w68.b(composeView2, R.string.yes_btn_cms), null));
                                ((x5a0) x7c0Var2.c1().S).setValue(f78.a(composeView2, R.string.cancel_bet, w68.b(composeView2, R.string.cancel_btn_cms), null));
                                ((x5a0) x7c0Var2.m1).setValue(bool2);
                                x7c0Var2.c1().E1(x7c0Var2.S0());
                                return Unit.a;
                            }
                        };
                        aVar.r(objY12);
                    }
                    Function1 function10 = (Function1) objY12;
                    boolean zA12 = aVar.A(x7c0Var);
                    Object objY13 = aVar.y();
                    if (zA12 || objY13 == c0042a) {
                        objY13 = new Function1() { // from class: w6c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                BetData betData = (BetData) obj5;
                                betData.getClass();
                                x7c0 x7c0Var2 = x7c0Var;
                                ((BetContainerState) x7c0Var2.S0().a.getValue()).setBetData(betData);
                                ((x5a0) x7c0Var2.F1).setValue(Boolean.TRUE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY13);
                    }
                    Function1 function11 = (Function1) objY13;
                    boolean zA13 = aVar.A(x7c0Var);
                    Object objY14 = aVar.y();
                    if (zA13 || objY14 == c0042a) {
                        objY14 = new wo8(x7c0Var, 2);
                        aVar.r(objY14);
                    }
                    Function0 function12 = (Function0) objY14;
                    boolean zA14 = aVar.A(x7c0Var);
                    Object objY15 = aVar.y();
                    if (zA14 || objY15 == c0042a) {
                        objY15 = new xo8(x7c0Var, 3);
                        aVar.r(objY15);
                    }
                    m6a.a(multiplierResponse, betContainerState, l1zVarE1, zBooleanValue3, z, zBooleanValue6, t290VarJ1, function1, function2, function0, function3, function4, function5, function6, function7, function8, null, null, zBooleanValue4, zBooleanValue2, zBooleanValue5, function9, function10, function11, function12, (Function0) objY15, oswVar, zBooleanValue7, false, str, n6aVar, zBooleanValue, false, false, false, false, aVar, 0, 100663296, 384, 1074462720, 120);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ cfc(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
    }
}
