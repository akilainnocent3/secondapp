package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import fgb.n;
import fgb.p;
import fgb.r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e9b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e9b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x02cf  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ytw<Double> ytwVar;
        Object mVar;
        ytw<Boolean> ytwVar2;
        ytw<Boolean> ytwVar3;
        ytw<Double> ytwVar4;
        ytw<Double> ytwVar5;
        ytw<Double> ytwVar6;
        ytw<Double> ytwVar7;
        ytw<Double> ytwVar8;
        ytw<Double> ytwVar9;
        ytw<Double> ytwVar10;
        int i;
        a aVar;
        a aVar2;
        String str;
        int i2;
        int i3;
        String currentMultiplier;
        String currentMultiplier2;
        Object obj3;
        String strA;
        j5c0 j5c0Var;
        j5c0 j5c0Var2;
        int i4 = this.a;
        d.a aVar3 = d.a.b;
        Object obj4 = a.C0041a.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i4) {
            case 0:
                ytw ytwVar11 = (ytw) obj6;
                final fgb fgbVar = (fgb) obj5;
                a aVar4 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Integer num = (Integer) ((x5a0) ytwVar11).getValue();
                    mz1 mz1VarB1 = fgbVar.b1();
                    ytw<Double> ytwVar12 = fgbVar.f0;
                    ytw<Boolean> ytwVar13 = fgbVar.e0;
                    ytw<Boolean> ytwVar14 = fgbVar.d0;
                    ytw<Double> ytwVar15 = fgbVar.c0;
                    ytw<Double> ytwVar16 = fgbVar.b0;
                    ytw<Double> ytwVar17 = fgbVar.Z;
                    ytw<Double> ytwVar18 = fgbVar.Y;
                    cj5 cj5VarU0 = fgbVar.U0();
                    String str2 = (String) ((x5a0) fgbVar.c1().v).getValue();
                    String str3 = (String) ((x5a0) fgbVar.c1().y).getValue();
                    ip8 ip8VarY0 = fgbVar.Y0();
                    boolean zA = aVar4.A(fgbVar);
                    Object objY = aVar4.y();
                    if (zA || objY == obj4) {
                        ytwVar = ytwVar12;
                        ytwVar2 = ytwVar13;
                        ytwVar3 = ytwVar14;
                        ytwVar4 = ytwVar16;
                        ytwVar5 = ytwVar15;
                        mVar = new fgb.m(0, fgbVar, fgb.class, "onMenuClicked", "onMenuClicked()V", 0);
                        aVar4.r(mVar);
                    } else {
                        mVar = objY;
                        ytwVar = ytwVar12;
                        ytwVar2 = ytwVar13;
                        ytwVar3 = ytwVar14;
                        ytwVar5 = ytwVar15;
                        ytwVar4 = ytwVar16;
                    }
                    chp chpVar = (chp) mVar;
                    boolean zA2 = aVar4.A(fgbVar);
                    Object objY2 = aVar4.y();
                    if (zA2 || objY2 == obj4) {
                        Object oVar = new fgb.o(0, fgbVar, fgb.class, "showExitRecommendation", "showExitRecommendation()V", 0);
                        aVar4.r(oVar);
                        objY2 = oVar;
                    }
                    chp chpVar2 = (chp) objY2;
                    boolean zA3 = aVar4.A(fgbVar);
                    Object objY3 = aVar4.y();
                    if (zA3 || objY3 == obj4) {
                        Object qVar = new fgb.q(0, fgbVar, fgb.class, "openComposeChat", "openComposeChat()V", 0);
                        aVar4.r(qVar);
                        objY3 = qVar;
                    }
                    chp chpVar3 = (chp) objY3;
                    boolean zA4 = aVar4.A(fgbVar);
                    Object objY4 = aVar4.y();
                    if (zA4 || objY4 == obj4) {
                        Object sVar = new fgb.s(0, fgbVar, fgb.class, "onAddMoneyClicked", "onAddMoneyClicked()V", 0);
                        aVar4.r(sVar);
                        objY4 = sVar;
                    }
                    chp chpVar4 = (chp) objY4;
                    long j = ((j58) ((x5a0) fgbVar.c1().N).getValue()).a;
                    boolean zBooleanValue = ((Boolean) ((x5a0) fgbVar.c1().r0).getValue()).booleanValue();
                    float f = StringsKt.M(((String) ((x5a0) fgbVar.c1().v).getValue()).toString(), "hero", false) ? 0.8f : 1.0f;
                    Function0 function0 = (Function0) chpVar;
                    Function0 function1 = (Function0) chpVar2;
                    Function0 function2 = (Function0) chpVar3;
                    Function0 function3 = (Function0) chpVar4;
                    boolean zA5 = aVar4.A(fgbVar);
                    Object objY5 = aVar4.y();
                    if (zA5 || objY5 == obj4) {
                        objY5 = new tdb(fgbVar, 0);
                        aVar4.r(objY5);
                    }
                    Function0 function4 = (Function0) objY5;
                    boolean zA6 = aVar4.A(fgbVar);
                    Object objY6 = aVar4.y();
                    if (zA6 || objY6 == obj4) {
                        objY6 = new deb(fgbVar, 0);
                        aVar4.r(objY6);
                    }
                    x2i0.a(str2, str3, mz1VarB1, cj5VarU0, ip8VarY0, f, function0, function1, function2, function3, function4, (Function0) objY6, j, zBooleanValue, aVar4, 0, 0);
                    if (((Boolean) ((x5a0) fgbVar.Z0).getValue()).booleanValue()) {
                        aVar4.N(1961824216);
                        GameDetails gameDetails = fgbVar.i;
                        wz.a("GameLimitClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                        List list = fgbVar.W;
                        if (list == null) {
                            list = m2g.a;
                        }
                        String str4 = "CLASSIC";
                        if (list.isEmpty()) {
                            strA = "";
                        } else {
                            String currency = ((DetailResponse) CollectionsKt.T(list)).getCurrency();
                            if (fgbVar.B1()) {
                                Object value = ((x5a0) gci0.r).getValue();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.h).getValue(), bool) && fgbVar.y1()) {
                                    obj3 = "CLASSIC_VIP";
                                } else {
                                    obj3 = "CLASSIC";
                                }
                            } else {
                                obj3 = "CLASSIC";
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : list) {
                                if (Intrinsics.g(((DetailResponse) obj7).getBetCategoryEnum(), obj3)) {
                                    arrayList.add(obj7);
                                }
                            }
                            DetailResponse detailResponse = (DetailResponse) CollectionsKt.firstOrNull(arrayList);
                            double maxPayoutAmount = detailResponse != null ? detailResponse.getMaxPayoutAmount() : ((DetailResponse) CollectionsKt.T(list)).getMaxPayoutAmount();
                            op5.a.getClass();
                            strA = tug.a(op5.i(currency), " ", pw.n(maxPayoutAmount));
                        }
                        String str5 = strA;
                        if (fgbVar.X) {
                            List list2 = fgbVar.W;
                            if (list2 == null) {
                                list2 = m2g.a;
                            }
                            if (list2.isEmpty()) {
                                j5c0Var2 = null;
                            } else {
                                String currency2 = ((DetailResponse) CollectionsKt.T(list2)).getCurrency();
                                op5.a.getClass();
                                String strI = op5.i(currency2);
                                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
                                numberInstance.setMaximumFractionDigits(0);
                                numberInstance.setGroupingUsed(true);
                                if (fgbVar.B1()) {
                                    Object value2 = ((x5a0) gci0.r).getValue();
                                    Boolean bool2 = Boolean.TRUE;
                                    if (Intrinsics.g(value2, bool2) && Intrinsics.g(((x5a0) gci0.h).getValue(), bool2) && fgbVar.y1()) {
                                        str4 = "CLASSIC_VIP";
                                    }
                                }
                                j5c0Var2 = new j5c0(fgb.r0(list2, strI, numberInstance, str4), fgb.r0(list2, strI, numberInstance, "OVER_UNDER"), fgb.r0(list2, strI, numberInstance, "RANGE"));
                            }
                            j5c0Var = j5c0Var2;
                        } else {
                            j5c0Var = null;
                        }
                        mz1 mz1VarB2 = fgbVar.b1();
                        boolean zA7 = aVar4.A(fgbVar);
                        Object objY7 = aVar4.y();
                        if (zA7 || objY7 == obj4) {
                            objY7 = new heb(fgbVar, 0);
                            aVar4.r(objY7);
                        }
                        lea.c(0, mz1VarB2, j5c0Var, aVar4, str5, (Function0) objY7);
                    } else {
                        aVar4.N(1910490417);
                    }
                    aVar4.H();
                    if (((Boolean) ((x5a0) fgbVar.E1).getValue()).booleanValue()) {
                        aVar4.N(1962648723);
                        HashMap map = new HashMap();
                        op5 op5Var = op5.a;
                        String str6 = fgbVar.y0;
                        op5Var.getClass();
                        map.put("{currency}", op5.i(str6));
                        TreeMap treeMap = pw.a;
                        Double betValue = ((BetContainerState) fgbVar.R0().a.getValue()).getBetData().getBetValue();
                        map.put("{amount}", pw.p(betValue != null ? betValue.doubleValue() : 0.0d));
                        String string = fgbVar.getString(R.string.bet_cancel_cms);
                        string.getClass();
                        String string2 = fgbVar.getString(R.string.cancel);
                        string2.getClass();
                        String strC = op5.c(op5Var, string, string2);
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        String upperCase = strC.toUpperCase(locale);
                        upperCase.getClass();
                        String string3 = fgbVar.getString(R.string.waiting_next_round_cms);
                        string3.getClass();
                        String string4 = fgbVar.getString(R.string.waiting_for_next_round);
                        string4.getClass();
                        String strC2 = op5.c(op5Var, string3, string4);
                        String strB = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map);
                        ArrayList<Double> autoBetChips = ((BetContainerState) fgbVar.R0().a.getValue()).getDetailResponse().getAutoBetChips();
                        String strI2 = op5.i(fgbVar.y0);
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue();
                        boolean zA8 = aVar4.A(fgbVar);
                        Object objY8 = aVar4.y();
                        if (zA8 || objY8 == obj4) {
                            objY8 = new re2(fgbVar, 1);
                            aVar4.r(objY8);
                        }
                        Function0 function5 = (Function0) objY8;
                        boolean zA9 = aVar4.A(fgbVar);
                        Object objY9 = aVar4.y();
                        if (zA9 || objY9 == obj4) {
                            objY9 = new se2(fgbVar, 1);
                            aVar4.r(objY9);
                        }
                        Function1 function6 = (Function1) objY9;
                        boolean zA10 = aVar4.A(fgbVar);
                        Object objY10 = aVar4.y();
                        if (zA10 || objY10 == obj4) {
                            objY10 = new ieb(fgbVar, 0);
                            aVar4.r(objY10);
                        }
                        Function0 function7 = (Function0) objY10;
                        boolean zA11 = aVar4.A(fgbVar);
                        Object objY11 = aVar4.y();
                        if (zA11 || objY11 == obj4) {
                            objY11 = new Function0() { // from class: keb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    fgb fgbVar2 = fgbVar;
                                    fgbVar2.v0(fgbVar2.S0(), null);
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY11);
                        }
                        Function0 function8 = (Function0) objY11;
                        boolean zA12 = aVar4.A(fgbVar);
                        Object objY12 = aVar4.y();
                        if (zA12 || objY12 == obj4) {
                            objY12 = new leb(fgbVar, 0);
                            aVar4.r(objY12);
                        }
                        Function0 function9 = (Function0) objY12;
                        boolean zA13 = aVar4.A(fgbVar);
                        Object objY13 = aVar4.y();
                        if (zA13 || objY13 == obj4) {
                            objY13 = new meb(fgbVar, 0);
                            aVar4.r(objY13);
                        }
                        ytwVar6 = ytwVar18;
                        ytwVar9 = ytwVar5;
                        ytwVar10 = ytwVar4;
                        i = R.string.bet_cancel_cms;
                        ytwVar7 = ytwVar17;
                        ytwVar8 = ytwVar;
                        f81.a(strB, autoBetChips, function5, function6, ytwVar8, strI2, ytwVar6, ytwVar7, null, ytwVar10, ytwVar9, function7, function8, null, function9, (Function0) objY13, upperCase, strC2, zBooleanValue2, zBooleanValue3, aVar4, 0, 0, 8448);
                        aVar = aVar4;
                    } else {
                        ytwVar6 = ytwVar18;
                        ytwVar7 = ytwVar17;
                        ytwVar8 = ytwVar;
                        ytwVar9 = ytwVar5;
                        ytwVar10 = ytwVar4;
                        a aVar5 = aVar4;
                        i = R.string.bet_cancel_cms;
                        aVar5.N(1910490417);
                        aVar = aVar5;
                    }
                    aVar.H();
                    boolean zBooleanValue4 = ((Boolean) ((x5a0) fgbVar.Y0().a).getValue()).booleanValue();
                    n54 n54Var = ht.a.e;
                    if (!zBooleanValue4 || ((Boolean) ((x5a0) fgbVar.c1().z0).getValue()).booleanValue()) {
                        aVar.N(1910490417);
                    } else {
                        aVar.N(1965988446);
                        Unit unit = Unit.a;
                        boolean zA14 = aVar.A(fgbVar);
                        Object objY14 = aVar.y();
                        if (zA14 || objY14 == obj4) {
                            objY14 = fgbVar.new n(null);
                            aVar.r(objY14);
                        }
                        xvf.e(aVar, unit, (Function2) objY14);
                        d dVarE = j.e(aVar3, 1.0f);
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarE);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar6);
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
                        pda.a(Math.abs(fgbVar.z1), 0, aVar, fgbVar.A1);
                        aVar.s();
                    }
                    aVar.H();
                    if (((Boolean) ((x5a0) fgbVar.F1).getValue()).booleanValue()) {
                        aVar.N(1966663006);
                        MultiplierResponse multiplierResponse = fgbVar.x0;
                        BigDecimal bigDecimalW0 = (multiplierResponse == null || (currentMultiplier2 = multiplierResponse.getCurrentMultiplier()) == null) ? null : fgb.w0(Double.parseDouble(currentMultiplier2), fgbVar.R0().O.getValue().doubleValue());
                        MultiplierResponse multiplierResponse2 = fgbVar.x0;
                        BigDecimal bigDecimalW1 = (multiplierResponse2 == null || (currentMultiplier = multiplierResponse2.getCurrentMultiplier()) == null) ? null : fgb.w0(Double.parseDouble(currentMultiplier), fgbVar.S0().O.getValue().doubleValue());
                        BigDecimal bigDecimal = new BigDecimal(String.valueOf(((BetContainerState) fgbVar.R0().a.getValue()).getDetailResponse().getMaxPayoutAmount()));
                        BigDecimal bigDecimalMin = bigDecimalW0 != null ? bigDecimalW0.min(bigDecimal) : null;
                        if (bigDecimalMin != null) {
                            i3 = 2;
                            bigDecimalMin.setScale(2, RoundingMode.HALF_UP);
                        } else {
                            i3 = 2;
                        }
                        BigDecimal bigDecimalMin2 = bigDecimalW1 != null ? bigDecimalW1.min(bigDecimal) : null;
                        if (bigDecimalMin2 != null) {
                            bigDecimalMin2.setScale(i3, RoundingMode.HALF_UP);
                        }
                        HashMap map2 = new HashMap();
                        op5 op5Var2 = op5.a;
                        String str7 = fgbVar.y0;
                        op5Var2.getClass();
                        map2.put("{currency}", op5.i(str7));
                        TreeMap treeMap2 = pw.a;
                        Double betValue2 = ((BetContainerState) fgbVar.S0().a.getValue()).getBetData().getBetValue();
                        map2.put("{amount}", pw.p(betValue2 != null ? betValue2.doubleValue() : 0.0d));
                        String string5 = fgbVar.getString(i);
                        string5.getClass();
                        String string6 = fgbVar.getString(R.string.cancel);
                        string6.getClass();
                        String strC3 = op5.c(op5Var2, string5, string6);
                        Locale locale2 = Locale.getDefault();
                        locale2.getClass();
                        String upperCase2 = strC3.toUpperCase(locale2);
                        upperCase2.getClass();
                        String string7 = fgbVar.getString(R.string.waiting_next_round_cms);
                        string7.getClass();
                        String string8 = fgbVar.getString(R.string.waiting_for_next_round);
                        string8.getClass();
                        String strC4 = op5.c(op5Var2, string7, string8);
                        String strB2 = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map2);
                        ArrayList<Double> autoBetChips2 = ((BetContainerState) fgbVar.S0().a.getValue()).getDetailResponse().getAutoBetChips();
                        String strI3 = op5.i(fgbVar.y0);
                        boolean zBooleanValue5 = ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue();
                        boolean zBooleanValue6 = ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue();
                        boolean zA15 = aVar.A(fgbVar);
                        Object objY15 = aVar.y();
                        if (zA15 || objY15 == obj4) {
                            objY15 = new neb(fgbVar, 0);
                            aVar.r(objY15);
                        }
                        Function0 function10 = (Function0) objY15;
                        boolean zA16 = aVar.A(fgbVar);
                        Object objY16 = aVar.y();
                        if (zA16 || objY16 == obj4) {
                            objY16 = new udb(fgbVar, 0);
                            aVar.r(objY16);
                        }
                        Function1 function11 = (Function1) objY16;
                        boolean zA17 = aVar.A(fgbVar);
                        Object objY17 = aVar.y();
                        if (zA17 || objY17 == obj4) {
                            objY17 = new vdb(fgbVar, 0);
                            aVar.r(objY17);
                        }
                        Function0 function12 = (Function0) objY17;
                        boolean zA18 = aVar.A(fgbVar);
                        Object objY18 = aVar.y();
                        if (zA18 || objY18 == obj4) {
                            objY18 = new wdb(fgbVar, 0);
                            aVar.r(objY18);
                        }
                        Function0 function13 = (Function0) objY18;
                        boolean zA19 = aVar.A(fgbVar);
                        Object objY19 = aVar.y();
                        if (zA19 || objY19 == obj4) {
                            objY19 = new xdb(fgbVar, 0);
                            aVar.r(objY19);
                        }
                        Function0 function14 = (Function0) objY19;
                        boolean zA20 = aVar.A(fgbVar);
                        Object objY20 = aVar.y();
                        if (zA20 || objY20 == obj4) {
                            objY20 = new ydb(fgbVar, 0);
                            aVar.r(objY20);
                        }
                        a aVar7 = aVar;
                        f81.a(strB2, autoBetChips2, function10, function11, ytwVar8, strI3, ytwVar6, ytwVar7, null, ytwVar10, ytwVar9, function12, function13, null, function14, (Function0) objY20, upperCase2, strC4, zBooleanValue5, zBooleanValue6, aVar7, 0, 0, 8448);
                        aVar2 = aVar7;
                    } else {
                        a aVar8 = aVar;
                        aVar8.N(1910490417);
                        aVar2 = aVar8;
                    }
                    aVar2.H();
                    if (!((Boolean) ((x5a0) fgbVar.a1).getValue()).booleanValue() || num == null) {
                        aVar2.N(1910490417);
                    } else {
                        aVar2.N(1971212132);
                        GameDetails gameDetails2 = fgbVar.i;
                        wz.a("ProvablyFairSettingsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                        m28 m28VarX0 = fgbVar.X0();
                        int iIntValue2 = num.intValue();
                        mz1 mz1VarB3 = fgbVar.b1();
                        String str8 = (String) ((x5a0) fgbVar.c1().v).getValue();
                        boolean zA21 = aVar2.A(fgbVar);
                        Object objY21 = aVar2.y();
                        if (zA21 || objY21 == obj4) {
                            objY21 = new zdb(fgbVar, 0);
                            aVar2.r(objY21);
                        }
                        Function0 function15 = (Function0) objY21;
                        boolean zA22 = aVar2.A(fgbVar);
                        Object objY22 = aVar2.y();
                        if (zA22 || objY22 == obj4) {
                            objY22 = new aeb(fgbVar, 0);
                            aVar2.r(objY22);
                        }
                        Function0 function16 = (Function0) objY22;
                        boolean zA23 = aVar2.A(fgbVar);
                        Object objY23 = aVar2.y();
                        if (zA23 || objY23 == obj4) {
                            objY23 = new me7(fgbVar, 1);
                            aVar2.r(objY23);
                        }
                        aia.d(m28VarX0, iIntValue2, mz1VarB3, function15, function16, (Function0) objY23, str8, aVar2, 0);
                    }
                    aVar2.H();
                    if (!((Boolean) ((x5a0) fgbVar.Y0().a).getValue()).booleanValue() || ((Boolean) ((x5a0) fgbVar.c1().z0).getValue()).booleanValue()) {
                        aVar2.N(1910490417);
                    } else {
                        aVar2.N(1972169598);
                        Unit unit2 = Unit.a;
                        boolean zA24 = aVar2.A(fgbVar);
                        Object objY24 = aVar2.y();
                        if (zA24 || objY24 == obj4) {
                            objY24 = fgbVar.new p(null);
                            aVar2.r(objY24);
                        }
                        xvf.e(aVar2, unit2, (Function2) objY24);
                        d dVarE2 = j.e(aVar3, 1.0f);
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarE2);
                        yka.k.getClass();
                        tsr.a aVar9 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar9);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, yka.a.f);
                        hlh0.a(aVar2, ne00VarO2, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar2, dVarC2, yka.a.d);
                        pda.a(Math.abs(fgbVar.z1), 0, aVar2, fgbVar.A1);
                        aVar2.s();
                    }
                    aVar2.H();
                    if (((Boolean) ((x5a0) fgbVar.c1().z0).getValue()).booleanValue()) {
                        aVar2.N(1972762535);
                        Object objY25 = aVar2.y();
                        if (objY25 == obj4) {
                            objY25 = new beb();
                            aVar2.r(objY25);
                        }
                        g9a.e((Function0) objY25, pp8.b(388920806, new Function2() { // from class: ceb
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj8, Object obj9) {
                                String strValueOf;
                                String strValueOf2;
                                a aVar10 = (a) obj8;
                                int iIntValue3 = ((Integer) obj9).intValue();
                                if (aVar10.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    fgb fgbVar2 = fgbVar;
                                    String str9 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).b;
                                    String str10 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).a;
                                    String str11 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).c;
                                    String str12 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).h;
                                    String str13 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).e;
                                    String str14 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).k ? ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).g : ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).f;
                                    boolean z = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).i;
                                    boolean z2 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).j;
                                    boolean z3 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).k;
                                    mz1 mz1Var = (mz1) ((x5a0) fgbVar2.c1().e0).getValue();
                                    cj5 cj5Var = (cj5) ((x5a0) fgbVar2.c1().f0).getValue();
                                    goj.b bVar = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).l;
                                    TreeMap treeMap3 = pw.a;
                                    Double d = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).m;
                                    String str15 = "";
                                    if (d == null || (strValueOf = String.valueOf(d.doubleValue())) == null) {
                                        strValueOf = "";
                                    }
                                    String strC5 = pw.c(strValueOf);
                                    Double d2 = ((goj.a) ((x5a0) fgbVar2.c1().w0).getValue()).n;
                                    if (d2 != null && (strValueOf2 = String.valueOf(d2.doubleValue())) != null) {
                                        str15 = strValueOf2;
                                    }
                                    g9a.c(str9, str10, str11, str12, str13, str14, z, z2, z3, mz1Var, cj5Var, false, bVar, strC5, pw.c(str15), aVar10, 0, 0);
                                } else {
                                    aVar10.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 438);
                    } else {
                        aVar2.N(1910490417);
                    }
                    aVar2.H();
                    ob30 ob30Var = (ob30) ((x5a0) fgbVar.c1).getValue();
                    if (ob30Var == null) {
                        aVar2.N(1974490846);
                    } else {
                        aVar2.N(1974490847);
                        Object objY26 = aVar2.y();
                        if (objY26 == obj4) {
                            objY26 = new qe7(1);
                            aVar2.r(objY26);
                        }
                        g9a.f((Function0) objY26, pp8.b(-1380143005, new le2(ob30Var, fgbVar), aVar2), aVar2, 438);
                        Unit unit3 = Unit.a;
                    }
                    aVar2.H();
                    if (((Boolean) ((x5a0) fgbVar.m1).getValue()).booleanValue() && ((Boolean) ((x5a0) fgbVar.i0).getValue()).booleanValue() && !fgbVar.K2()) {
                        aVar2.N(1975086016);
                        if (fgbVar.B1()) {
                            aVar2.N(1975108987);
                            Unit unit4 = Unit.a;
                            boolean zA25 = aVar2.A(fgbVar);
                            Object objY27 = aVar2.y();
                            if (zA25 || objY27 == obj4) {
                                str = null;
                                objY27 = fgbVar.new r(null);
                                aVar2.r(objY27);
                            } else {
                                str = null;
                            }
                            xvf.e(aVar2, unit4, (Function2) objY27);
                            aVar2.H();
                        } else {
                            str = null;
                            aVar2.N(1975279580);
                            String str9 = (String) ((x5a0) fgbVar.c1().I).getValue();
                            String str10 = (String) ((x5a0) fgbVar.c1().R).getValue();
                            String str11 = (String) ((x5a0) fgbVar.c1().S).getValue();
                            boolean zA26 = aVar2.A(fgbVar);
                            Object objY28 = aVar2.y();
                            if (zA26 || objY28 == obj4) {
                                objY28 = new eeb(fgbVar, 0);
                                aVar2.r(objY28);
                            }
                            Function0 function17 = (Function0) objY28;
                            boolean zA27 = aVar2.A(fgbVar);
                            Object objY29 = aVar2.y();
                            if (zA27 || objY29 == obj4) {
                                objY29 = new ne2(fgbVar, 1);
                                aVar2.r(objY29);
                            }
                            x9a.a(str9, str10, str11, function17, (Function0) objY29, fgbVar.U0(), aVar2, 0);
                            aVar2.H();
                        }
                    } else {
                        str = null;
                        aVar2.N(1910490417);
                    }
                    aVar2.H();
                    if (!((Boolean) ((x5a0) fgbVar.e1).getValue()).booleanValue() || num == null) {
                        aVar2.N(1910490417);
                    } else {
                        aVar2.N(1976035980);
                        int iIntValue3 = num.intValue();
                        boolean zA28 = aVar2.A(fgbVar);
                        Object objY30 = aVar2.y();
                        if (zA28 || objY30 == obj4) {
                            i2 = 0;
                            objY30 = new feb(fgbVar, 0);
                            aVar2.r(objY30);
                        } else {
                            i2 = 0;
                        }
                        fgbVar.j0(iIntValue3, i2, aVar2, (Function0) objY30);
                        boolean zBooleanValue7 = ((Boolean) ((x5a0) fgbVar.f1).getValue()).booleanValue();
                        GameDetails gameDetails3 = fgbVar.i;
                        if (zBooleanValue7) {
                            wz.a("PaytableCheck", gameDetails3 != null ? gameDetails3.getName() : str, new String[0]);
                        } else {
                            wz.a("HTPClicked", gameDetails3 != null ? gameDetails3.getName() : str, new String[0]);
                        }
                    }
                    aVar2.H();
                    if (((Boolean) ((x5a0) fgbVar.k1).getValue()).booleanValue()) {
                        aVar2.N(1977140696);
                        m28 m28VarX1 = fgbVar.X0();
                        String str12 = fgbVar.o1;
                        mz1 mz1Var = (mz1) ((x5a0) fgbVar.c1().e0).getValue();
                        String str13 = (String) ((x5a0) fgbVar.c1().v).getValue();
                        boolean zA29 = aVar2.A(fgbVar);
                        Object objY31 = aVar2.y();
                        if (zA29 || objY31 == obj4) {
                            objY31 = new geb(fgbVar, 0);
                            aVar2.r(objY31);
                        }
                        ida.c(m28VarX1, str12, mz1Var, str13, (Function0) objY31, aVar2, 0, 0);
                    } else {
                        aVar2.N(1910490417);
                    }
                    aVar2.H();
                } else {
                    aVar4.G();
                }
                return Unit.a;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((isw) obj6).A(fFloatValue);
                ((isw) obj5).A(fFloatValue);
                return Unit.a;
            default:
                final ijj0 ijj0Var = (ijj0) obj6;
                final phx phxVar = (phx) obj5;
                a aVar10 = (a) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (aVar10.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Unit unit5 = Unit.a;
                    boolean zA30 = aVar10.A(ijj0Var) | aVar10.A(phxVar);
                    Object objY32 = aVar10.y();
                    if (zA30 || objY32 == obj4) {
                        objY32 = new bjj0(ijj0Var, phxVar, null);
                        aVar10.r(objY32);
                    }
                    xvf.e(aVar10, unit5, (Function2) objY32);
                    d dVarE3 = j.e(aVar3, 1.0f);
                    WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                    d dVarA = c.a(dVarE3, gnn.a, new s8j0(q8j0.a.a(aVar10).g));
                    boolean zA31 = aVar10.A(ijj0Var) | aVar10.A(phxVar);
                    Object objY33 = aVar10.y();
                    if (zA31 || objY33 == obj4) {
                        objY33 = new Function1() { // from class: uij0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                ghx ghxVar = (ghx) obj8;
                                ghxVar.getClass();
                                final ijj0 ijj0Var2 = ijj0Var;
                                final phx phxVar2 = phxVar;
                                hhx.b(ghxVar, "Main", null, new op8(-1327601935, new iaj() { // from class: vij0
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj9, Object obj10, Object obj11, Object obj12) {
                                        a aVar11 = (a) obj11;
                                        ((Integer) obj12).getClass();
                                        ((pf0) obj9).getClass();
                                        ((ifx) obj10).getClass();
                                        ijj0 ijj0Var3 = ijj0Var2;
                                        mjj0 mjj0VarP0 = ijj0Var3.P0();
                                        qpg0 qpg0VarI0 = ijj0Var3.I0();
                                        boolean zA32 = aVar11.A(ijj0Var3);
                                        Object objY34 = aVar11.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zA32 || objY34 == c0042a) {
                                            cjj0 cjj0Var = new cjj0(1, ijj0Var3, ijj0.class, "showWithdrawableBalanceHelp", "showWithdrawableBalanceHelp(Lcom/sporty/android/core/model/pocket/withdraw/WithDrawInfo;)V", 0);
                                            aVar11.r(cjj0Var);
                                            objY34 = cjj0Var;
                                        }
                                        Function1 function18 = (Function1) ((chp) objY34);
                                        boolean zA33 = aVar11.A(ijj0Var3);
                                        Object objY35 = aVar11.y();
                                        if (zA33 || objY35 == c0042a) {
                                            objY35 = new djj0(4, ijj0Var3, ijj0.class, "showEasyAccountInfoPopup", "showEasyAccountInfoPopup(IIII)V", 0);
                                            aVar11.r(objY35);
                                        }
                                        iaj iajVar = (iaj) ((chp) objY35);
                                        boolean zA34 = aVar11.A(ijj0Var3);
                                        Object objY36 = aVar11.y();
                                        if (zA34 || objY36 == c0042a) {
                                            ejj0 ejj0Var = new ejj0(0, ijj0Var3, ijj0.class, "onRefresh", "onRefresh()V", 0);
                                            aVar11.r(ejj0Var);
                                            objY36 = ejj0Var;
                                        }
                                        lij0.a(null, mjj0VarP0, qpg0VarI0, phxVar2, function18, iajVar, (Function0) ((chp) objY36), aVar11, 576);
                                        return Unit.a;
                                    }
                                }, true), 254);
                                hhx.d(ghxVar, "ManageAccount", new op8(-1498018988, new gaj() { // from class: wij0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                        ((Integer) obj11).getClass();
                                        ((ifx) obj9).getClass();
                                        smu.a(null, ijj0Var2.P0(), phxVar2, (a) obj10, 64);
                                        return Unit.a;
                                    }
                                }, true));
                                hhx.b(ghxVar, "AddNewAccountDialog", null, new op8(-1201563544, new iaj() { // from class: xij0
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj9, Object obj10, Object obj11, Object obj12) {
                                        a aVar11 = (a) obj11;
                                        ((Integer) obj12).getClass();
                                        ((pf0) obj9).getClass();
                                        ((ifx) obj10).getClass();
                                        ijj0 ijj0Var3 = ijj0Var2;
                                        mjj0 mjj0VarP0 = ijj0Var3.P0();
                                        qpg0 qpg0VarI0 = ijj0Var3.I0();
                                        boolean zA32 = aVar11.A(ijj0Var3);
                                        Object objY34 = aVar11.y();
                                        if (zA32 || objY34 == a.C0041a.a) {
                                            fjj0 fjj0Var = new fjj0(1, ijj0Var3, ijj0.class, "showWithdrawableBalanceHelp", "showWithdrawableBalanceHelp(Lcom/sporty/android/core/model/pocket/withdraw/WithDrawInfo;)V", 0);
                                            aVar11.r(fjj0Var);
                                            objY34 = fjj0Var;
                                        }
                                        bi.b(mjj0VarP0, qpg0VarI0, (Function1) ((chp) objY34), phxVar2, aVar11, 72);
                                        return Unit.a;
                                    }
                                }, true), 254);
                                hhx.d(ghxVar, "BankSelect", new op8(-1763594229, new gaj() { // from class: yij0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                        a aVar11 = (a) obj10;
                                        ((Integer) obj11).getClass();
                                        ((ifx) obj9).getClass();
                                        final ijj0 ijj0Var3 = ijj0Var2;
                                        ytw ytwVarC = wyh.c(ijj0Var3.P0().z0, aVar11, 0, 7);
                                        List list3 = (List) ytwVarC.getValue();
                                        boolean zA32 = aVar11.A(ijj0Var3) | aVar11.M(ytwVarC);
                                        Object objY34 = aVar11.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zA32 || objY34 == c0042a) {
                                            objY34 = new gjj0(ijj0Var3, ytwVarC, null);
                                            aVar11.r(objY34);
                                        }
                                        xvf.e(aVar11, list3, (Function2) objY34);
                                        boolean zA33 = aVar11.A(ijj0Var3);
                                        final phx phxVar3 = phxVar2;
                                        boolean zA34 = zA33 | aVar11.A(phxVar3);
                                        Object objY35 = aVar11.y();
                                        if (zA34 || objY35 == c0042a) {
                                            objY35 = new Function0() { // from class: ajj0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Object value3;
                                                    wwd0 wwd0Var = ((gme0) ijj0Var3.d0.getValue()).b;
                                                    do {
                                                        value3 = wwd0Var.getValue();
                                                    } while (!wwd0Var.g(value3, fme0.f));
                                                    phxVar3.k();
                                                    return Unit.a;
                                                }
                                            };
                                            aVar11.r(objY35);
                                        }
                                        final Function0 function18 = (Function0) objY35;
                                        gme0 gme0Var = (gme0) ijj0Var3.d0.getValue();
                                        boolean zM = aVar11.M(function18) | aVar11.A(ijj0Var3);
                                        Object objY36 = aVar11.y();
                                        if (zM || objY36 == c0042a) {
                                            objY36 = new Function1() { // from class: tij0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj12) {
                                                    aoe0.a aVar12 = (aoe0.a) obj12;
                                                    aVar12.getClass();
                                                    function18.invoke();
                                                    mjj0 mjj0VarP0 = ijj0Var3.P0();
                                                    mjj0VarP0.A0.a(new yi.b(aVar12.a));
                                                    return Unit.a;
                                                }
                                            };
                                            aVar11.r(objY36);
                                        }
                                        zme0.e(gme0Var, function18, (Function1) objY36, aVar11, 8);
                                        return Unit.a;
                                    }
                                }, true));
                                hhx.d(ghxVar, "Confirm", new op8(-1524727796, new gaj() { // from class: zij0
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                        a aVar11 = (a) obj10;
                                        ((Integer) obj11).getClass();
                                        ((ifx) obj9).getClass();
                                        ijj0 ijj0Var3 = ijj0Var2;
                                        mjj0 mjj0VarP0 = ijj0Var3.P0();
                                        b900 b900VarZ0 = ijj0Var3.z0();
                                        boolean zA32 = aVar11.A(b900VarZ0);
                                        Object objY34 = aVar11.y();
                                        if (zA32 || objY34 == a.C0041a.a) {
                                            objY34 = new hjj0(0, b900VarZ0, b900.class, "goHowToPlayWithholdingTax", "goHowToPlayWithholdingTax()V", 0);
                                            aVar11.r(objY34);
                                        }
                                        wlj0.f(mjj0VarP0, phxVar2, (Function0) ((chp) objY34), aVar11, 8);
                                        return Unit.a;
                                    }
                                }, true));
                                return Unit.a;
                            }
                        };
                        aVar10.r(objY33);
                    }
                    uix.c(phxVar, "Main", dVarA, null, null, null, null, null, (Function1) objY33, aVar10, 0, 1016);
                } else {
                    aVar10.G();
                }
                return Unit.a;
        }
    }
}
