package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.CashoutRequest;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d210 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ d210(m410 m410Var) {
        this.b = m410Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e5  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar;
        String str;
        Object obj3;
        Object obj4;
        a.C0041a.C0042a c0042a;
        int i;
        ArrayList<Double> arrayList;
        a.C0041a.C0042a c0042a2;
        boolean zA;
        Object objY;
        boolean zA2;
        Object objY2;
        boolean zA3;
        Object objY3;
        Object objY4;
        Object objY5;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        v720 binding;
        ArrayList<Double> arrayList2;
        DetailResponse detailResponse2;
        v720 binding2;
        int i2 = this.a;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                final m410 m410Var = (m410) obj5;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Double dValueOf = Double.valueOf(0.0d);
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<Boolean> ytwVar = m410Var.l1;
                    ytw<Double> ytwVar2 = m410Var.p1;
                    ytw<Double> ytwVar3 = m410Var.o1;
                    ytw<Double> ytwVar4 = m410Var.n1;
                    boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                    a.C0041a.C0042a c0042a3 = a.C0041a.a;
                    CharSequence text = null;
                    if (zBooleanValue) {
                        aVar2.N(94958326);
                        HashMap map = new HashMap();
                        op5 op5Var = op5.a;
                        String str2 = m410Var.v0;
                        op5Var.getClass();
                        map.put("{currency}", op5.i(str2));
                        ixi ixiVar = (ixi) m410Var.b;
                        map.put("{amount}", String.valueOf((ixiVar == null || (binding2 = ixiVar.b.getBinding()) == null) ? null : binding2.b.getText()));
                        String strB = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map);
                        DetailResponseData detailResponseData = m410Var.w;
                        if (detailResponseData == null || (detailResponse2 = detailResponseData.getGameDetailsResponseList().get(0)) == null || (arrayList2 = detailResponse2.getAutoBetChips()) == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        String strI = op5.i(m410Var.v0);
                        ytw ytwVarB = m.b(dValueOf);
                        ytw ytwVarB2 = m.b(dValueOf);
                        boolean zA4 = aVar2.A(m410Var);
                        Object objY6 = aVar2.y();
                        if (zA4 || objY6 == c0042a3) {
                            objY6 = new ydi(m410Var, 1);
                            aVar2.r(objY6);
                        }
                        Function0 function0 = (Function0) objY6;
                        boolean zA5 = aVar2.A(m410Var);
                        Object objY7 = aVar2.y();
                        if (zA5 || objY7 == c0042a3) {
                            objY7 = new ii(m410Var, 1);
                            aVar2.r(objY7);
                        }
                        Function1 function1 = (Function1) objY7;
                        boolean zA6 = aVar2.A(m410Var);
                        Object objY8 = aVar2.y();
                        if (zA6 || objY8 == c0042a3) {
                            objY8 = new Function0() { // from class: f310
                                /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    final m410 m410Var2 = m410Var;
                                    ixi ixiVar2 = (ixi) m410Var2.b;
                                    if (ixiVar2 != null) {
                                        long betId = ixiVar2.b.getBetId();
                                        ixi ixiVar3 = (ixi) m410Var2.b;
                                        if (ixiVar3 != null) {
                                            long roundId = ixiVar3.b.getRoundId();
                                            MultiplierResponse multiplierResponse = m410Var2.U;
                                            if (multiplierResponse == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var2.d1);
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        final String strJ = new eal().j(cashoutRequest);
                                        goa0 goa0Var = (goa0) m410Var2.a;
                                        if (goa0Var != null) {
                                            ixi ixiVar4 = (ixi) m410Var2.b;
                                            Long lValueOf = ixiVar4 != null ? Long.valueOf(ixiVar4.b.getRoundId()) : null;
                                            ixi ixiVar5 = (ixi) m410Var2.b;
                                            goa0.H1(goa0Var, strJ, lValueOf, ixiVar5 != null ? Long.valueOf(ixiVar5.b.getBetId()) : null, new Function0() { // from class: o110
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    m410 m410Var3 = m410Var2;
                                                    cgb.a(m410Var3.P0(), m410Var3.F0, "cashout", strJ);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                        GameDetails gameDetails = m410Var2.r1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                                        m410Var2.b1("1", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY8);
                        }
                        Function0 function2 = (Function0) objY8;
                        boolean zA7 = aVar2.A(m410Var);
                        Object objY9 = aVar2.y();
                        if (zA7 || objY9 == c0042a3) {
                            objY9 = new Function0() { // from class: g310
                                /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    m410 m410Var2 = m410Var;
                                    ixi ixiVar2 = (ixi) m410Var2.b;
                                    if (ixiVar2 != null) {
                                        long betId = ixiVar2.c.getBetId();
                                        ixi ixiVar3 = (ixi) m410Var2.b;
                                        if (ixiVar3 != null) {
                                            long roundId = ixiVar3.c.getRoundId();
                                            MultiplierResponse multiplierResponse = m410Var2.U;
                                            if (multiplierResponse == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var2.d1);
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        String strJ = new eal().j(cashoutRequest);
                                        goa0 goa0Var = (goa0) m410Var2.a;
                                        int i3 = 1;
                                        if (goa0Var != null) {
                                            ixi ixiVar4 = (ixi) m410Var2.b;
                                            Long lValueOf = ixiVar4 != null ? Long.valueOf(ixiVar4.c.getRoundId()) : null;
                                            ixi ixiVar5 = (ixi) m410Var2.b;
                                            goa0.H1(goa0Var, strJ, lValueOf, ixiVar5 != null ? Long.valueOf(ixiVar5.c.getBetId()) : null, new tk4(i3, m410Var2, strJ));
                                        }
                                        GameDetails gameDetails = m410Var2.r1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                        m410Var2.b1("2", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY9);
                        }
                        Function0 function3 = (Function0) objY9;
                        Object objY10 = aVar2.y();
                        if (objY10 == c0042a3) {
                            objY10 = new h310();
                            aVar2.r(objY10);
                        }
                        Function0 function4 = (Function0) objY10;
                        Object objY11 = aVar2.y();
                        if (objY11 == c0042a3) {
                            objY11 = new mi(1);
                            aVar2.r(objY11);
                        }
                        obj3 = "{amount}";
                        obj4 = "{currency}";
                        str = "bet_per_round:sg_common";
                        c0042a = c0042a3;
                        i = 71016065;
                        f81.a(strB, arrayList2, function0, function1, ytwVar2, strI, ytwVar4, ytwVar3, null, ytwVarB, ytwVarB2, function2, function3, null, function4, (Function0) objY11, "", "", false, false, aVar2, 0, 920346624, 8448);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        str = "bet_per_round:sg_common";
                        obj3 = "{amount}";
                        obj4 = "{currency}";
                        c0042a = c0042a3;
                        i = 71016065;
                        aVar.N(71016065);
                    }
                    aVar.H();
                    if (((Boolean) ((x5a0) m410Var.m1).getValue()).booleanValue()) {
                        aVar.N(102497123);
                        MultiplierResponse multiplierResponse = m410Var.U;
                        if (multiplierResponse == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String multiplier = multiplierResponse.getMultiplier();
                        if (multiplier != null) {
                            double d = Double.parseDouble(multiplier);
                            ixi ixiVar2 = (ixi) m410Var.b;
                            m410.w0(d, ixiVar2 != null ? ixiVar2.b.getBetAmount() : 0.0d);
                        }
                        MultiplierResponse multiplierResponse2 = m410Var.U;
                        if (multiplierResponse2 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String multiplier2 = multiplierResponse2.getMultiplier();
                        if (multiplier2 != null) {
                            double d2 = Double.parseDouble(multiplier2);
                            ixi ixiVar3 = (ixi) m410Var.b;
                            m410.w0(d2, ixiVar3 != null ? ixiVar3.c.getBetAmount() : 0.0d);
                        }
                        HashMap map2 = new HashMap();
                        op5 op5Var2 = op5.a;
                        String str3 = m410Var.v0;
                        op5Var2.getClass();
                        map2.put(obj4, op5.i(str3));
                        ixi ixiVar4 = (ixi) m410Var.b;
                        if (ixiVar4 != null && (binding = ixiVar4.c.getBinding()) != null) {
                            text = binding.b.getText();
                        }
                        map2.put(obj3, String.valueOf(text));
                        String strB2 = op5.b(str, "Bet Per Round : ", map2);
                        DetailResponseData detailResponseData2 = m410Var.w;
                        if (detailResponseData2 == null || (gameDetailsResponseList = detailResponseData2.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList.get(1)) == null || (arrayList = detailResponse.getAutoBetChips()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList<Double> arrayList3 = arrayList;
                        String strI2 = op5.i(m410Var.v0);
                        ytw ytwVarB3 = m.b(dValueOf);
                        ytw ytwVarB4 = m.b(dValueOf);
                        boolean zA8 = aVar.A(m410Var);
                        Object objY12 = aVar.y();
                        if (zA8) {
                            c0042a2 = c0042a;
                        } else {
                            c0042a2 = c0042a;
                            if (objY12 == c0042a2) {
                            }
                            Function0 function5 = (Function0) objY12;
                            zA = aVar.A(m410Var);
                            objY = aVar.y();
                            if (zA || objY == c0042a2) {
                                objY = new Function1() { // from class: j310
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        v720 binding3;
                                        v720 binding4;
                                        v720 binding5;
                                        v720 binding6;
                                        v720 binding7;
                                        v720 binding8;
                                        int iDoubleValue = (int) ((Double) obj6).doubleValue();
                                        m410 m410Var2 = m410Var;
                                        m410Var2.H0 = iDoubleValue;
                                        ixi ixiVar5 = (ixi) m410Var2.b;
                                        if (ixiVar5 != null && (binding8 = ixiVar5.c.getBinding()) != null) {
                                            binding8.d.setStatus(true);
                                        }
                                        ixi ixiVar6 = (ixi) m410Var2.b;
                                        if (ixiVar6 != null) {
                                            ixiVar6.c.setAutoBetPlace(true);
                                        }
                                        ixi ixiVar7 = (ixi) m410Var2.b;
                                        if (ixiVar7 != null) {
                                            ixiVar7.c.setDisableContainer();
                                        }
                                        m410Var2.H = true;
                                        m410Var2.G = 0;
                                        m410Var2.U0();
                                        wz.a("AutoBet", "Sporty Hero", "2", m410Var2.H ? "On" : "Off");
                                        ((x5a0) m410Var2.m1).setValue(Boolean.FALSE);
                                        ixi ixiVar8 = (ixi) m410Var2.b;
                                        if (ixiVar8 != null && (binding3 = ixiVar8.c.getBinding()) != null && binding3.Y.getVisibility() == 0) {
                                            ixi ixiVar9 = (ixi) m410Var2.b;
                                            if (ixiVar9 != null && (binding7 = ixiVar9.c.getBinding()) != null) {
                                                binding7.Y.setVisibility(8);
                                            }
                                            ixi ixiVar10 = (ixi) m410Var2.b;
                                            if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                                                binding6.D.setVisibility(8);
                                            }
                                            ixi ixiVar11 = (ixi) m410Var2.b;
                                            if (ixiVar11 != null && (binding5 = ixiVar11.c.getBinding()) != null) {
                                                binding5.a0.setVisibility(8);
                                            }
                                            ixi ixiVar12 = (ixi) m410Var2.b;
                                            if (ixiVar12 != null && (binding4 = ixiVar12.c.getBinding()) != null) {
                                                binding4.q0.setVisibility(0);
                                            }
                                            m410Var2.O = false;
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            Function1 function6 = (Function1) objY;
                            zA2 = aVar.A(m410Var);
                            objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a2) {
                                objY2 = new a3s(m410Var, 1);
                                aVar.r(objY2);
                            }
                            Function0 function7 = (Function0) objY2;
                            zA3 = aVar.A(m410Var);
                            objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a2) {
                                objY3 = new Function0() { // from class: k310
                                    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        CashoutRequest cashoutRequest;
                                        final m410 m410Var2 = m410Var;
                                        ixi ixiVar5 = (ixi) m410Var2.b;
                                        if (ixiVar5 != null) {
                                            long betId = ixiVar5.c.getBetId();
                                            ixi ixiVar6 = (ixi) m410Var2.b;
                                            if (ixiVar6 != null) {
                                                long roundId = ixiVar6.c.getRoundId();
                                                MultiplierResponse multiplierResponse3 = m410Var2.U;
                                                if (multiplierResponse3 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse3.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var2.d1);
                                            } else {
                                                cashoutRequest = null;
                                            }
                                        } else {
                                            cashoutRequest = null;
                                        }
                                        if (cashoutRequest != null) {
                                            final String strJ = new eal().j(cashoutRequest);
                                            goa0 goa0Var = (goa0) m410Var2.a;
                                            if (goa0Var != null) {
                                                ixi ixiVar7 = (ixi) m410Var2.b;
                                                Long lValueOf = ixiVar7 != null ? Long.valueOf(ixiVar7.c.getRoundId()) : null;
                                                ixi ixiVar8 = (ixi) m410Var2.b;
                                                goa0.H1(goa0Var, strJ, lValueOf, ixiVar8 != null ? Long.valueOf(ixiVar8.c.getBetId()) : null, new Function0() { // from class: q110
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        m410 m410Var3 = m410Var2;
                                                        cgb.a(m410Var3.P0(), m410Var3.F0, "cashout", strJ);
                                                        return Unit.a;
                                                    }
                                                });
                                            }
                                            GameDetails gameDetails = m410Var2.r1;
                                            wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                            m410Var2.b1("2", true);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY3);
                            }
                            Function0 function8 = (Function0) objY3;
                            objY4 = aVar.y();
                            if (objY4 == c0042a2) {
                                objY4 = new d310();
                                aVar.r(objY4);
                            }
                            Function0 function9 = (Function0) objY4;
                            objY5 = aVar.y();
                            if (objY5 == c0042a2) {
                                objY5 = new e310();
                                aVar.r(objY5);
                            }
                            a aVar3 = aVar;
                            f81.a(strB2, arrayList3, function5, function6, ytwVar2, strI2, ytwVar4, ytwVar3, null, ytwVarB3, ytwVarB4, function7, function8, null, function9, (Function0) objY5, "", "", false, false, aVar3, 0, 920346624, 8448);
                            aVar = aVar3;
                        }
                        objY12 = new Function0() { // from class: i310
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ((x5a0) m410Var.m1).setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY12);
                        Function0 function10 = (Function0) objY12;
                        zA = aVar.A(m410Var);
                        objY = aVar.y();
                        if (zA) {
                            objY = new Function1() { // from class: j310
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    v720 binding3;
                                    v720 binding4;
                                    v720 binding5;
                                    v720 binding6;
                                    v720 binding7;
                                    v720 binding8;
                                    int iDoubleValue = (int) ((Double) obj6).doubleValue();
                                    m410 m410Var2 = m410Var;
                                    m410Var2.H0 = iDoubleValue;
                                    ixi ixiVar5 = (ixi) m410Var2.b;
                                    if (ixiVar5 != null && (binding8 = ixiVar5.c.getBinding()) != null) {
                                        binding8.d.setStatus(true);
                                    }
                                    ixi ixiVar6 = (ixi) m410Var2.b;
                                    if (ixiVar6 != null) {
                                        ixiVar6.c.setAutoBetPlace(true);
                                    }
                                    ixi ixiVar7 = (ixi) m410Var2.b;
                                    if (ixiVar7 != null) {
                                        ixiVar7.c.setDisableContainer();
                                    }
                                    m410Var2.H = true;
                                    m410Var2.G = 0;
                                    m410Var2.U0();
                                    wz.a("AutoBet", "Sporty Hero", "2", m410Var2.H ? "On" : "Off");
                                    ((x5a0) m410Var2.m1).setValue(Boolean.FALSE);
                                    ixi ixiVar8 = (ixi) m410Var2.b;
                                    if (ixiVar8 != null && (binding3 = ixiVar8.c.getBinding()) != null && binding3.Y.getVisibility() == 0) {
                                        ixi ixiVar9 = (ixi) m410Var2.b;
                                        if (ixiVar9 != null && (binding7 = ixiVar9.c.getBinding()) != null) {
                                            binding7.Y.setVisibility(8);
                                        }
                                        ixi ixiVar10 = (ixi) m410Var2.b;
                                        if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                                            binding6.D.setVisibility(8);
                                        }
                                        ixi ixiVar11 = (ixi) m410Var2.b;
                                        if (ixiVar11 != null && (binding5 = ixiVar11.c.getBinding()) != null) {
                                            binding5.a0.setVisibility(8);
                                        }
                                        ixi ixiVar12 = (ixi) m410Var2.b;
                                        if (ixiVar12 != null && (binding4 = ixiVar12.c.getBinding()) != null) {
                                            binding4.q0.setVisibility(0);
                                        }
                                        m410Var2.O = false;
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        } else {
                            objY = new Function1() { // from class: j310
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    v720 binding3;
                                    v720 binding4;
                                    v720 binding5;
                                    v720 binding6;
                                    v720 binding7;
                                    v720 binding8;
                                    int iDoubleValue = (int) ((Double) obj6).doubleValue();
                                    m410 m410Var2 = m410Var;
                                    m410Var2.H0 = iDoubleValue;
                                    ixi ixiVar5 = (ixi) m410Var2.b;
                                    if (ixiVar5 != null && (binding8 = ixiVar5.c.getBinding()) != null) {
                                        binding8.d.setStatus(true);
                                    }
                                    ixi ixiVar6 = (ixi) m410Var2.b;
                                    if (ixiVar6 != null) {
                                        ixiVar6.c.setAutoBetPlace(true);
                                    }
                                    ixi ixiVar7 = (ixi) m410Var2.b;
                                    if (ixiVar7 != null) {
                                        ixiVar7.c.setDisableContainer();
                                    }
                                    m410Var2.H = true;
                                    m410Var2.G = 0;
                                    m410Var2.U0();
                                    wz.a("AutoBet", "Sporty Hero", "2", m410Var2.H ? "On" : "Off");
                                    ((x5a0) m410Var2.m1).setValue(Boolean.FALSE);
                                    ixi ixiVar8 = (ixi) m410Var2.b;
                                    if (ixiVar8 != null && (binding3 = ixiVar8.c.getBinding()) != null && binding3.Y.getVisibility() == 0) {
                                        ixi ixiVar9 = (ixi) m410Var2.b;
                                        if (ixiVar9 != null && (binding7 = ixiVar9.c.getBinding()) != null) {
                                            binding7.Y.setVisibility(8);
                                        }
                                        ixi ixiVar10 = (ixi) m410Var2.b;
                                        if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                                            binding6.D.setVisibility(8);
                                        }
                                        ixi ixiVar11 = (ixi) m410Var2.b;
                                        if (ixiVar11 != null && (binding5 = ixiVar11.c.getBinding()) != null) {
                                            binding5.a0.setVisibility(8);
                                        }
                                        ixi ixiVar12 = (ixi) m410Var2.b;
                                        if (ixiVar12 != null && (binding4 = ixiVar12.c.getBinding()) != null) {
                                            binding4.q0.setVisibility(0);
                                        }
                                        m410Var2.O = false;
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function1 function11 = (Function1) objY;
                        zA2 = aVar.A(m410Var);
                        objY2 = aVar.y();
                        if (zA2) {
                            objY2 = new a3s(m410Var, 1);
                            aVar.r(objY2);
                        } else {
                            objY2 = new a3s(m410Var, 1);
                            aVar.r(objY2);
                        }
                        Function0 function12 = (Function0) objY2;
                        zA3 = aVar.A(m410Var);
                        objY3 = aVar.y();
                        if (zA3) {
                            objY3 = new Function0() { // from class: k310
                                /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    final m410 m410Var2 = m410Var;
                                    ixi ixiVar5 = (ixi) m410Var2.b;
                                    if (ixiVar5 != null) {
                                        long betId = ixiVar5.c.getBetId();
                                        ixi ixiVar6 = (ixi) m410Var2.b;
                                        if (ixiVar6 != null) {
                                            long roundId = ixiVar6.c.getRoundId();
                                            MultiplierResponse multiplierResponse3 = m410Var2.U;
                                            if (multiplierResponse3 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse3.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var2.d1);
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        final String strJ = new eal().j(cashoutRequest);
                                        goa0 goa0Var = (goa0) m410Var2.a;
                                        if (goa0Var != null) {
                                            ixi ixiVar7 = (ixi) m410Var2.b;
                                            Long lValueOf = ixiVar7 != null ? Long.valueOf(ixiVar7.c.getRoundId()) : null;
                                            ixi ixiVar8 = (ixi) m410Var2.b;
                                            goa0.H1(goa0Var, strJ, lValueOf, ixiVar8 != null ? Long.valueOf(ixiVar8.c.getBetId()) : null, new Function0() { // from class: q110
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    m410 m410Var3 = m410Var2;
                                                    cgb.a(m410Var3.P0(), m410Var3.F0, "cashout", strJ);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                        GameDetails gameDetails = m410Var2.r1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                        m410Var2.b1("2", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        } else {
                            objY3 = new Function0() { // from class: k310
                                /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    final m410 m410Var2 = m410Var;
                                    ixi ixiVar5 = (ixi) m410Var2.b;
                                    if (ixiVar5 != null) {
                                        long betId = ixiVar5.c.getBetId();
                                        ixi ixiVar6 = (ixi) m410Var2.b;
                                        if (ixiVar6 != null) {
                                            long roundId = ixiVar6.c.getRoundId();
                                            MultiplierResponse multiplierResponse3 = m410Var2.U;
                                            if (multiplierResponse3 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse3.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var2.d1);
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        final String strJ = new eal().j(cashoutRequest);
                                        goa0 goa0Var = (goa0) m410Var2.a;
                                        if (goa0Var != null) {
                                            ixi ixiVar7 = (ixi) m410Var2.b;
                                            Long lValueOf = ixiVar7 != null ? Long.valueOf(ixiVar7.c.getRoundId()) : null;
                                            ixi ixiVar8 = (ixi) m410Var2.b;
                                            goa0.H1(goa0Var, strJ, lValueOf, ixiVar8 != null ? Long.valueOf(ixiVar8.c.getBetId()) : null, new Function0() { // from class: q110
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    m410 m410Var3 = m410Var2;
                                                    cgb.a(m410Var3.P0(), m410Var3.F0, "cashout", strJ);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                        GameDetails gameDetails = m410Var2.r1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                        m410Var2.b1("2", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        Function0 function13 = (Function0) objY3;
                        objY4 = aVar.y();
                        if (objY4 == c0042a2) {
                            objY4 = new d310();
                            aVar.r(objY4);
                        }
                        Function0 function14 = (Function0) objY4;
                        objY5 = aVar.y();
                        if (objY5 == c0042a2) {
                            objY5 = new e310();
                            aVar.r(objY5);
                        }
                        a aVar4 = aVar;
                        f81.a(strB2, arrayList3, function10, function11, ytwVar2, strI2, ytwVar4, ytwVar3, null, ytwVarB3, ytwVarB4, function12, function13, null, function14, (Function0) objY5, "", "", false, false, aVar4, 0, 920346624, 8448);
                        aVar = aVar4;
                    } else {
                        aVar.N(i);
                    }
                    aVar.H();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                teh0.a((String) obj5, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }
}
