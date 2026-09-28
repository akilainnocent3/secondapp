package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.remote.models.CashoutRequest;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class izb0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ izb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x037e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0396  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03d2  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar;
        String str;
        Object obj3;
        a.C0041a.C0042a c0042a;
        int i;
        BigDecimal bigDecimalV0;
        BigDecimal bigDecimalV1;
        int i2;
        a.C0041a.C0042a c0042a2;
        boolean zA;
        Object objY;
        boolean zA2;
        Object objY2;
        boolean zA3;
        Object objY3;
        Object objY4;
        Object objY5;
        qq80 binding;
        BigDecimal bigDecimalV2;
        BigDecimal bigDecimalV3;
        int i3;
        qq80 binding2;
        int i4 = this.a;
        Object obj4 = this.b;
        switch (i4) {
            case 0:
                final q1c0 q1c0Var = (q1c0) obj4;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Double dValueOf = Double.valueOf(0.0d);
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<Boolean> ytwVar = q1c0Var.Q1;
                    ytw<Double> ytwVar2 = q1c0Var.O1;
                    ytw<Double> ytwVar3 = q1c0Var.N1;
                    ytw<Double> ytwVar4 = q1c0Var.P1;
                    boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                    String str2 = "Bet Per Round : ";
                    a.C0041a.C0042a c0042a3 = a.C0041a.a;
                    if (zBooleanValue) {
                        aVar2.N(1025580145);
                        MultiplierResponse multiplierResponse = q1c0Var.h0;
                        if (multiplierResponse == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                        if (currentMultiplier != null) {
                            double d = Double.parseDouble(currentMultiplier);
                            w3c0 w3c0Var = (w3c0) q1c0Var.b;
                            bigDecimalV2 = q1c0.v0(d, w3c0Var != null ? w3c0Var.d.getBetAmount() : 0.0d);
                        } else {
                            str2 = "Bet Per Round : ";
                            bigDecimalV2 = null;
                        }
                        MultiplierResponse multiplierResponse2 = q1c0Var.h0;
                        if (multiplierResponse2 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String currentMultiplier2 = multiplierResponse2.getCurrentMultiplier();
                        if (currentMultiplier2 != null) {
                            double d2 = Double.parseDouble(currentMultiplier2);
                            w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                            bigDecimalV3 = q1c0.v0(d2, w3c0Var2 != null ? w3c0Var2.e.getBetAmount() : 0.0d);
                        } else {
                            bigDecimalV2 = bigDecimalV2;
                            bigDecimalV3 = null;
                        }
                        List<DetailResponse> list = q1c0Var.E;
                        if (list == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        BigDecimal bigDecimal = new BigDecimal(String.valueOf(list.get(0).getMaxPayoutAmount()));
                        BigDecimal bigDecimalMin = bigDecimalV2 != null ? bigDecimalV2.min(bigDecimal) : null;
                        if (bigDecimalMin != null) {
                            i3 = 2;
                            bigDecimalMin.setScale(2, RoundingMode.HALF_UP);
                        } else {
                            i3 = 2;
                        }
                        BigDecimal bigDecimalMin2 = bigDecimalV3 != null ? bigDecimalV3.min(bigDecimal) : null;
                        if (bigDecimalMin2 != null) {
                            bigDecimalMin2.setScale(i3, RoundingMode.HALF_UP);
                        }
                        HashMap map = new HashMap();
                        op5 op5Var = op5.a;
                        String str3 = q1c0Var.M0;
                        op5Var.getClass();
                        map.put("{currency}", op5.i(str3));
                        w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                        map.put("{amount}", String.valueOf((w3c0Var3 == null || (binding2 = w3c0Var3.d.getBinding()) == null) ? null : binding2.b.getText()));
                        str = str2;
                        String strB = op5.b("bet_per_round:sg_common", str, map);
                        List<DetailResponse> list2 = q1c0Var.E;
                        if (list2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        ArrayList<Double> autoBetChips = list2.get(0).getAutoBetChips();
                        String strI = op5.i(q1c0Var.M0);
                        ytw ytwVarB = m.b(dValueOf);
                        ytw ytwVarB2 = m.b(dValueOf);
                        boolean zA4 = aVar2.A(q1c0Var);
                        Object objY6 = aVar2.y();
                        if (zA4 || objY6 == c0042a3) {
                            objY6 = new jkq(q1c0Var, 1);
                            aVar2.r(objY6);
                        }
                        Function0 function0 = (Function0) objY6;
                        boolean zA5 = aVar2.A(q1c0Var);
                        Object objY7 = aVar2.y();
                        if (zA5 || objY7 == c0042a3) {
                            objY7 = new Function1() { // from class: swb0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    qq80 binding3;
                                    qq80 binding4;
                                    qq80 binding5;
                                    qq80 binding6;
                                    qq80 binding7;
                                    qq80 binding8;
                                    int iDoubleValue = (int) ((Double) obj5).doubleValue();
                                    q1c0 q1c0Var2 = q1c0Var;
                                    q1c0Var2.S = iDoubleValue;
                                    w3c0 w3c0Var4 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var4 != null && (binding8 = w3c0Var4.d.getBinding()) != null) {
                                        binding8.d.setStatus(true);
                                    }
                                    w3c0 w3c0Var5 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var5 != null) {
                                        w3c0Var5.d.setAutoBetPlace(true);
                                    }
                                    w3c0 w3c0Var6 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var6 != null) {
                                        w3c0Var6.d.setDisableContainer();
                                    }
                                    w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var7 != null) {
                                        w3c0Var7.e.E();
                                    }
                                    w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var8 != null) {
                                        w3c0Var8.d.E();
                                    }
                                    q1c0Var2.O = true;
                                    q1c0Var2.Q = 0;
                                    q1c0Var2.C1();
                                    wz.a("AutoBet", "Sporty Hero", "2", q1c0Var2.O ? "On" : "Off");
                                    q1c0Var2.n3();
                                    ((x5a0) q1c0Var2.Q1).setValue(Boolean.FALSE);
                                    w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var9 != null && (binding3 = w3c0Var9.d.getBinding()) != null && binding3.h0.getVisibility() == 0) {
                                        w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var10 != null && (binding7 = w3c0Var10.d.getBinding()) != null) {
                                            binding7.h0.setVisibility(8);
                                        }
                                        w3c0 w3c0Var11 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var11 != null && (binding6 = w3c0Var11.d.getBinding()) != null) {
                                            binding6.L.setVisibility(8);
                                        }
                                        w3c0 w3c0Var12 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var12 != null && (binding5 = w3c0Var12.d.getBinding()) != null) {
                                            binding5.j0.setVisibility(8);
                                        }
                                        w3c0 w3c0Var13 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var13 != null && (binding4 = w3c0Var13.d.getBinding()) != null) {
                                            binding4.t0.setVisibility(0);
                                        }
                                        q1c0Var2.b0 = false;
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY7);
                        }
                        Function1 function1 = (Function1) objY7;
                        boolean zA6 = aVar2.A(q1c0Var);
                        Object objY8 = aVar2.y();
                        if (zA6 || objY8 == c0042a3) {
                            objY8 = new ywb(q1c0Var, 1);
                            aVar2.r(objY8);
                        }
                        Function0 function2 = (Function0) objY8;
                        boolean zA7 = aVar2.A(q1c0Var);
                        Object objY9 = aVar2.y();
                        if (zA7 || objY9 == c0042a3) {
                            objY9 = new zwb(q1c0Var, 2);
                            aVar2.r(objY9);
                        }
                        Function0 function3 = (Function0) objY9;
                        Object objY10 = aVar2.y();
                        if (objY10 == c0042a3) {
                            objY10 = new twb0();
                            aVar2.r(objY10);
                        }
                        Function0 function4 = (Function0) objY10;
                        Object objY11 = aVar2.y();
                        if (objY11 == c0042a3) {
                            objY11 = new uwb0();
                            aVar2.r(objY11);
                        }
                        obj3 = "{currency}";
                        c0042a = c0042a3;
                        i = 991212274;
                        f81.a(strB, autoBetChips, function0, function1, ytwVar4, strI, ytwVar3, ytwVar2, null, ytwVarB, ytwVarB2, function2, function3, null, function4, (Function0) objY11, "", "", false, false, aVar2, 0, 920346624, 8448);
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        str = "Bet Per Round : ";
                        obj3 = "{currency}";
                        c0042a = c0042a3;
                        i = 991212274;
                        aVar.N(991212274);
                    }
                    aVar.H();
                    if (((Boolean) ((x5a0) q1c0Var.R1).getValue()).booleanValue()) {
                        aVar.N(1035053962);
                        MultiplierResponse multiplierResponse3 = q1c0Var.h0;
                        if (multiplierResponse3 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String currentMultiplier3 = multiplierResponse3.getCurrentMultiplier();
                        if (currentMultiplier3 != null) {
                            double d3 = Double.parseDouble(currentMultiplier3);
                            w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                            bigDecimalV0 = q1c0.v0(d3, w3c0Var4 != null ? w3c0Var4.d.getBetAmount() : 0.0d);
                        } else {
                            bigDecimalV0 = null;
                        }
                        MultiplierResponse multiplierResponse4 = q1c0Var.h0;
                        if (multiplierResponse4 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String currentMultiplier4 = multiplierResponse4.getCurrentMultiplier();
                        if (currentMultiplier4 != null) {
                            double d4 = Double.parseDouble(currentMultiplier4);
                            w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                            bigDecimalV1 = q1c0.v0(d4, w3c0Var5 != null ? w3c0Var5.e.getBetAmount() : 0.0d);
                        } else {
                            bigDecimalV1 = null;
                        }
                        List<DetailResponse> list3 = q1c0Var.E;
                        if (list3 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(list3.get(1).getMaxPayoutAmount()));
                        BigDecimal bigDecimalMin3 = bigDecimalV0 != null ? bigDecimalV0.min(bigDecimal2) : null;
                        if (bigDecimalMin3 != null) {
                            i2 = 2;
                            bigDecimalMin3.setScale(2, RoundingMode.HALF_UP);
                        } else {
                            i2 = 2;
                        }
                        BigDecimal bigDecimalMin4 = bigDecimalV1 != null ? bigDecimalV1.min(bigDecimal2) : null;
                        if (bigDecimalMin4 != null) {
                            bigDecimalMin4.setScale(i2, RoundingMode.HALF_UP);
                        }
                        HashMap map2 = new HashMap();
                        op5 op5Var2 = op5.a;
                        String str4 = q1c0Var.M0;
                        op5Var2.getClass();
                        map2.put(obj3, op5.i(str4));
                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                        map2.put("{amount}", String.valueOf((w3c0Var6 == null || (binding = w3c0Var6.e.getBinding()) == null) ? null : binding.b.getText()));
                        String strB2 = op5.b("bet_per_round:sg_common", str, map2);
                        List<DetailResponse> list4 = q1c0Var.E;
                        if (list4 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        ArrayList<Double> autoBetChips2 = list4.get(1).getAutoBetChips();
                        String strI2 = op5.i(q1c0Var.M0);
                        ytw ytwVarB3 = m.b(dValueOf);
                        ytw ytwVarB4 = m.b(dValueOf);
                        boolean zA8 = aVar.A(q1c0Var);
                        Object objY12 = aVar.y();
                        if (zA8) {
                            c0042a2 = c0042a;
                        } else {
                            c0042a2 = c0042a;
                            if (objY12 == c0042a2) {
                            }
                            Function0 function5 = (Function0) objY12;
                            zA = aVar.A(q1c0Var);
                            objY = aVar.y();
                            if (zA || objY == c0042a2) {
                                objY = new dxb(q1c0Var, 1);
                                aVar.r(objY);
                            }
                            Function1 function6 = (Function1) objY;
                            zA2 = aVar.A(q1c0Var);
                            objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a2) {
                                objY2 = new Function0() { // from class: vwb0
                                    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        CashoutRequest cashoutRequest;
                                        q1c0 q1c0Var2 = q1c0Var;
                                        w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                        int i5 = 1;
                                        if (w3c0Var7 != null) {
                                            long betId = w3c0Var7.d.getBetId();
                                            w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                            if (w3c0Var8 != null) {
                                                long roundId = w3c0Var8.d.getRoundId();
                                                MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                                if (multiplierResponse5 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                                Boolean bool = Boolean.FALSE;
                                                String strValueOf = String.valueOf(System.currentTimeMillis());
                                                boolean z = q1c0Var2.T1;
                                                MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                                if (multiplierResponse6 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                                cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                            } else {
                                                cashoutRequest = null;
                                            }
                                        } else {
                                            cashoutRequest = null;
                                        }
                                        if (cashoutRequest != null) {
                                            String strJ = new eal().j(cashoutRequest);
                                            foa0 foa0Var = (foa0) q1c0Var2.a;
                                            if (foa0Var != null) {
                                                w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                                Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.d.getRoundId()) : null;
                                                w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                                foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.d.getBetId()) : null, new pzb(i5, q1c0Var2, strJ));
                                            }
                                            GameDetails gameDetails = q1c0Var2.W1;
                                            wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                                            q1c0Var2.L1("1", null, "CLASSIC", true);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY2);
                            }
                            Function0 function7 = (Function0) objY2;
                            zA3 = aVar.A(q1c0Var);
                            objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a2) {
                                objY3 = new Function0() { // from class: wwb0
                                    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        CashoutRequest cashoutRequest;
                                        final q1c0 q1c0Var2 = q1c0Var;
                                        w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var7 != null) {
                                            long betId = w3c0Var7.e.getBetId();
                                            w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                            if (w3c0Var8 != null) {
                                                long roundId = w3c0Var8.e.getRoundId();
                                                MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                                if (multiplierResponse5 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                                Boolean bool = Boolean.FALSE;
                                                String strValueOf = String.valueOf(System.currentTimeMillis());
                                                boolean z = q1c0Var2.T1;
                                                MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                                if (multiplierResponse6 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                                cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                            } else {
                                                cashoutRequest = null;
                                            }
                                        } else {
                                            cashoutRequest = null;
                                        }
                                        if (cashoutRequest != null) {
                                            final String strJ = new eal().j(cashoutRequest);
                                            foa0 foa0Var = (foa0) q1c0Var2.a;
                                            if (foa0Var != null) {
                                                w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                                Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.e.getRoundId()) : null;
                                                w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                                foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.e.getBetId()) : null, new Function0() { // from class: eyb0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        q1c0 q1c0Var3 = q1c0Var2;
                                                        cgb.a(q1c0Var3.m1(), q1c0Var3.c1, "cashout", strJ);
                                                        return Unit.a;
                                                    }
                                                });
                                            }
                                            GameDetails gameDetails = q1c0Var2.W1;
                                            wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                            q1c0Var2.L1("2", null, "CLASSIC", true);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY3);
                            }
                            Function0 function8 = (Function0) objY3;
                            objY4 = aVar.y();
                            if (objY4 == c0042a2) {
                                objY4 = new qwb0();
                                aVar.r(objY4);
                            }
                            Function0 function9 = (Function0) objY4;
                            objY5 = aVar.y();
                            if (objY5 == c0042a2) {
                                objY5 = new rwb0();
                                aVar.r(objY5);
                            }
                            a aVar3 = aVar;
                            f81.a(strB2, autoBetChips2, function5, function6, ytwVar4, strI2, ytwVar3, ytwVar2, null, ytwVarB3, ytwVarB4, function7, function8, null, function9, (Function0) objY5, "", "", false, false, aVar3, 0, 920346624, 8448);
                            aVar = aVar3;
                        }
                        objY12 = new oo30(q1c0Var, 1);
                        aVar.r(objY12);
                        Function0 function10 = (Function0) objY12;
                        zA = aVar.A(q1c0Var);
                        objY = aVar.y();
                        if (zA) {
                            objY = new dxb(q1c0Var, 1);
                            aVar.r(objY);
                        } else {
                            objY = new dxb(q1c0Var, 1);
                            aVar.r(objY);
                        }
                        Function1 function11 = (Function1) objY;
                        zA2 = aVar.A(q1c0Var);
                        objY2 = aVar.y();
                        if (zA2) {
                            objY2 = new Function0() { // from class: vwb0
                                /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    q1c0 q1c0Var2 = q1c0Var;
                                    w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                    int i5 = 1;
                                    if (w3c0Var7 != null) {
                                        long betId = w3c0Var7.d.getBetId();
                                        w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var8 != null) {
                                            long roundId = w3c0Var8.d.getRoundId();
                                            MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                            if (multiplierResponse5 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                            Boolean bool = Boolean.FALSE;
                                            String strValueOf = String.valueOf(System.currentTimeMillis());
                                            boolean z = q1c0Var2.T1;
                                            MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                            if (multiplierResponse6 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                            cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        String strJ = new eal().j(cashoutRequest);
                                        foa0 foa0Var = (foa0) q1c0Var2.a;
                                        if (foa0Var != null) {
                                            w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                            Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.d.getRoundId()) : null;
                                            w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                            foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.d.getBetId()) : null, new pzb(i5, q1c0Var2, strJ));
                                        }
                                        GameDetails gameDetails = q1c0Var2.W1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                                        q1c0Var2.L1("1", null, "CLASSIC", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        } else {
                            objY2 = new Function0() { // from class: vwb0
                                /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    q1c0 q1c0Var2 = q1c0Var;
                                    w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                    int i5 = 1;
                                    if (w3c0Var7 != null) {
                                        long betId = w3c0Var7.d.getBetId();
                                        w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var8 != null) {
                                            long roundId = w3c0Var8.d.getRoundId();
                                            MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                            if (multiplierResponse5 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                            Boolean bool = Boolean.FALSE;
                                            String strValueOf = String.valueOf(System.currentTimeMillis());
                                            boolean z = q1c0Var2.T1;
                                            MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                            if (multiplierResponse6 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                            cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        String strJ = new eal().j(cashoutRequest);
                                        foa0 foa0Var = (foa0) q1c0Var2.a;
                                        if (foa0Var != null) {
                                            w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                            Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.d.getRoundId()) : null;
                                            w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                            foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.d.getBetId()) : null, new pzb(i5, q1c0Var2, strJ));
                                        }
                                        GameDetails gameDetails = q1c0Var2.W1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                                        q1c0Var2.L1("1", null, "CLASSIC", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        Function0 function12 = (Function0) objY2;
                        zA3 = aVar.A(q1c0Var);
                        objY3 = aVar.y();
                        if (zA3) {
                            objY3 = new Function0() { // from class: wwb0
                                /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    final q1c0 q1c0Var2 = q1c0Var;
                                    w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var7 != null) {
                                        long betId = w3c0Var7.e.getBetId();
                                        w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var8 != null) {
                                            long roundId = w3c0Var8.e.getRoundId();
                                            MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                            if (multiplierResponse5 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                            Boolean bool = Boolean.FALSE;
                                            String strValueOf = String.valueOf(System.currentTimeMillis());
                                            boolean z = q1c0Var2.T1;
                                            MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                            if (multiplierResponse6 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                            cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        final String strJ = new eal().j(cashoutRequest);
                                        foa0 foa0Var = (foa0) q1c0Var2.a;
                                        if (foa0Var != null) {
                                            w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                            Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.e.getRoundId()) : null;
                                            w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                            foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.e.getBetId()) : null, new Function0() { // from class: eyb0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    q1c0 q1c0Var3 = q1c0Var2;
                                                    cgb.a(q1c0Var3.m1(), q1c0Var3.c1, "cashout", strJ);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                        GameDetails gameDetails = q1c0Var2.W1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                        q1c0Var2.L1("2", null, "CLASSIC", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        } else {
                            objY3 = new Function0() { // from class: wwb0
                                /* JADX WARN: Code duplicated, block: B:19:0x005a  */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    CashoutRequest cashoutRequest;
                                    final q1c0 q1c0Var2 = q1c0Var;
                                    w3c0 w3c0Var7 = (w3c0) q1c0Var2.b;
                                    if (w3c0Var7 != null) {
                                        long betId = w3c0Var7.e.getBetId();
                                        w3c0 w3c0Var8 = (w3c0) q1c0Var2.b;
                                        if (w3c0Var8 != null) {
                                            long roundId = w3c0Var8.e.getRoundId();
                                            MultiplierResponse multiplierResponse5 = q1c0Var2.h0;
                                            if (multiplierResponse5 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            String currentMultiplier5 = multiplierResponse5.getCurrentMultiplier();
                                            Boolean bool = Boolean.FALSE;
                                            String strValueOf = String.valueOf(System.currentTimeMillis());
                                            boolean z = q1c0Var2.T1;
                                            MultiplierResponse multiplierResponse6 = q1c0Var2.h0;
                                            if (multiplierResponse6 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            Double dH = b.h(multiplierResponse6.getCurrentMultiplier());
                                            cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier5, bool, strValueOf, z, q1c0Var2.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                                        } else {
                                            cashoutRequest = null;
                                        }
                                    } else {
                                        cashoutRequest = null;
                                    }
                                    if (cashoutRequest != null) {
                                        final String strJ = new eal().j(cashoutRequest);
                                        foa0 foa0Var = (foa0) q1c0Var2.a;
                                        if (foa0Var != null) {
                                            w3c0 w3c0Var9 = (w3c0) q1c0Var2.b;
                                            Long lValueOf = w3c0Var9 != null ? Long.valueOf(w3c0Var9.e.getRoundId()) : null;
                                            w3c0 w3c0Var10 = (w3c0) q1c0Var2.b;
                                            foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var10 != null ? Long.valueOf(w3c0Var10.e.getBetId()) : null, new Function0() { // from class: eyb0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    q1c0 q1c0Var3 = q1c0Var2;
                                                    cgb.a(q1c0Var3.m1(), q1c0Var3.c1, "cashout", strJ);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                        GameDetails gameDetails = q1c0Var2.W1;
                                        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "No");
                                        q1c0Var2.L1("2", null, "CLASSIC", true);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        Function0 function13 = (Function0) objY3;
                        objY4 = aVar.y();
                        if (objY4 == c0042a2) {
                            objY4 = new qwb0();
                            aVar.r(objY4);
                        }
                        Function0 function14 = (Function0) objY4;
                        objY5 = aVar.y();
                        if (objY5 == c0042a2) {
                            objY5 = new rwb0();
                            aVar.r(objY5);
                        }
                        a aVar4 = aVar;
                        f81.a(strB2, autoBetChips2, function10, function11, ytwVar4, strI2, ytwVar3, ytwVar2, null, ytwVarB3, ytwVarB4, function12, function13, null, function14, (Function0) objY5, "", "", false, false, aVar4, 0, 920346624, 8448);
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
                Boolean bool = (Boolean) obj4;
                a aVar5 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h6n.b(erz.a(bool.booleanValue() ? R.drawable.ic_star_on : R.drawable.ic_star_empty, 0, aVar5), null, j.r(d.a.b, 16.0f), j58.m, aVar5, 3504, 0);
                } else {
                    aVar5.G();
                }
                return Unit.a;
        }
    }
}
