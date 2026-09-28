package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetCashOutVO;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$getCashOutInfoAndPlaceEditBet$3", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f73 extends tje0 implements Function2<Bet, v1b<? super lyh<? extends BaseResponse<OrderWithFailUpdate>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f73(q73 q73Var, String str, int i, String str2, v1b<? super f73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f73 f73Var = new f73(this.b, this.c, this.d, this.e, v1bVar);
        f73Var.a = obj;
        return f73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Bet bet, v1b<? super lyh<? extends BaseResponse<OrderWithFailUpdate>>> v1bVar) {
        return ((f73) create(bet, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        q73 q73Var;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject;
        String str7;
        String str8;
        Bet bet = (Bet) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BetCashOutVO betCashOutVO = bet.toBetCashOutVO();
        betCashOutVO.getClass();
        q73 q73Var2 = this.b;
        jrm jrmVar = q73Var2.N;
        ArrayList arrayListU = jrmVar.U();
        String strD1 = q73Var2.D1();
        String str9 = this.c;
        boolean zI = q73Var2.X.I();
        boolean zA = q73Var2.A.a();
        BigDecimal bigDecimalZ = q73Var2.O.z();
        LinkedHashMap linkedHashMapA0 = jrmVar.A0();
        String str10 = MyLog.TAG_EDIT_BET;
        String str11 = "odds";
        String str12 = AnalyticsParam.EVENT_PARAM_ID;
        arrayListU.getClass();
        linkedHashMapA0.getClass();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bizType", 1);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            int size = arrayListU.size();
            q73Var = q73Var2;
            int i = 0;
            int i2 = 0;
            while (i < size) {
                try {
                    i++;
                    Selection selection = (Selection) arrayListU.get(i);
                    arrayListU = arrayListU;
                    boolean z = selection.i;
                    Outcome outcome = selection.c;
                    if (z || !qz3.b(selection)) {
                        str3 = strD1;
                        str4 = str10;
                        str5 = str11;
                        str6 = str12;
                        jSONObject = jSONObject2;
                        size = size;
                    } else {
                        int i3 = size;
                        JSONObject jSONObject4 = new JSONObject();
                        int i4 = i2 + 1;
                        jSONObject4.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                        jSONObject4.put(str12, selection.j());
                        jSONObject4.put(str11, outcome.odds);
                        jSONObject4.put("probability", String.valueOf(outcome.probability));
                        jSONObject4.put("banker", false);
                        if (selection.p()) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator<Selection> it = selection.d.iterator();
                            while (it.hasNext()) {
                                Iterator<Selection> it2 = it;
                                Selection next = it.next();
                                str2 = str10;
                                try {
                                    JSONObject jSONObject5 = new JSONObject();
                                    String str13 = strD1;
                                    Event event = next.a;
                                    JSONObject jSONObject6 = jSONObject2;
                                    Outcome outcome2 = next.c;
                                    jSONObject5.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event.eventId);
                                    jSONObject5.put(str12, next.j());
                                    jSONObject5.put(str11, outcome2.odds);
                                    jSONObject5.put("probability", String.valueOf(outcome2.probability));
                                    jSONArray2.put(jSONObject5);
                                    str11 = str11;
                                    str12 = str12;
                                    str10 = str2;
                                    it = it2;
                                    strD1 = str13;
                                    jSONObject2 = jSONObject6;
                                } catch (Exception e) {
                                    e = e;
                                    str = str2;
                                    itf0.a aVar = itf0.a;
                                    aVar.q(str);
                                    aVar.f(e, "Error generating place edit bet body", new Object[0]);
                                    s9e0 s9e0Var = s9e0.a;
                                    k9e0 k9e0Var = k9e0.a;
                                    s9e0Var.getClass();
                                    k9e0Var.getClass();
                                    string = "";
                                    return q73Var.D.I(string);
                                }
                            }
                            str3 = strD1;
                            str4 = str10;
                            str7 = str11;
                            str8 = str12;
                            jSONObject = jSONObject2;
                            jSONObject4.put("betBuilderSelections", jSONArray2);
                            jSONObject4.put("betBuilder", true);
                        } else {
                            str3 = strD1;
                            str4 = str10;
                            str7 = str11;
                            str8 = str12;
                            jSONObject = jSONObject2;
                        }
                        List<PreCannedBBOutcome> list = outcome.childOutcomes;
                        if (list == null || list.isEmpty()) {
                            str5 = str7;
                            str6 = str8;
                        } else {
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<PreCannedBBOutcome> it3 = outcome.childOutcomes.iterator();
                            while (it3.hasNext()) {
                                PreCannedBBOutcome next2 = it3.next();
                                int marketId = next2.getMarketId();
                                String marketName = next2.getMarketName();
                                String outcomeId = next2.getOutcomeId();
                                Iterator<PreCannedBBOutcome> it4 = it3;
                                String outcomeDesc = next2.getOutcomeDesc();
                                String specifier = next2.getSpecifier();
                                String str14 = str7;
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("marketId", marketId);
                                jSONObject7.put("marketName", marketName);
                                jSONObject7.put("outcomeId", outcomeId);
                                jSONObject7.put("outcomeDesc", outcomeDesc);
                                jSONObject7.put("specifiers", specifier);
                                jSONArray3.put(jSONObject7);
                                it3 = it4;
                                str7 = str14;
                                str8 = str8;
                            }
                            str5 = str7;
                            str6 = str8;
                            jSONObject4.put("childOutcomes", jSONArray3);
                        }
                        if (Intrinsics.g(linkedHashMapA0.get(selection), Boolean.TRUE)) {
                            jSONObject4.put("lfbBoost", true);
                        }
                        jSONArray.put(jSONObject4);
                        size = i3;
                        i2 = i4;
                    }
                    bigDecimalZ = bigDecimalZ;
                    str10 = str4;
                    strD1 = str3;
                    jSONObject2 = jSONObject;
                    str11 = str5;
                    str12 = str6;
                } catch (Exception e2) {
                    e = e2;
                    str2 = str10;
                    str = str2;
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(str);
                    aVar2.f(e, "Error generating place edit bet body", new Object[0]);
                    s9e0 s9e0Var2 = s9e0.a;
                    k9e0 k9e0Var2 = k9e0.a;
                    s9e0Var2.getClass();
                    k9e0Var2.getClass();
                    string = "";
                    return q73Var.D.I(string);
                }
            }
            String str15 = strD1;
            BigDecimal bigDecimal = bigDecimalZ;
            str2 = str10;
            JSONObject jSONObject8 = jSONObject2;
            jSONObject3.put("selections", jSONArray);
            int i5 = this.d;
            jSONObject8.put("isBonusFactor", i5 != 1 && nh4.c().k);
            JSONArray jSONArray4 = new JSONArray();
            JSONObject jSONObject9 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(i2);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("value", mj9.f(str9));
            if (zI && zA) {
                BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
                if (scale.compareTo(BigDecimal.ZERO) > 0) {
                    BigDecimal bigDecimalMultiply = scale.multiply(BigDecimal.valueOf(10000L));
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put("bonusPlanId", nh4.c().b);
                    jSONObject11.put("bonusAmount", bigDecimalMultiply);
                    jSONObject11.put("version", 1);
                    jSONObject8.put("bonus", jSONObject11);
                }
            }
            jSONObject9.put("selectedSystems", jSONArray5);
            jSONObject9.put("stake", jSONObject10);
            jSONArray4.put(jSONObject9);
            jSONObject3.put("bets", jSONArray4);
            jSONObject8.put("ticket", jSONObject3);
            Object obj2 = this.e;
            if (obj2 != null) {
                jSONObject8.put("currency", obj2);
            }
            jSONObject8.put("orderType", i5);
            jSONObject8.put("subBizType", 1);
            jSONObject8.put("actualPayAmount", mj9.f(str9));
            jSONObject8.put("paymentType", 0);
            JSONObject jSONObject12 = new JSONObject();
            jSONObject12.put("betId", betCashOutVO.getBetId());
            jSONObject12.put("orderId", betCashOutVO.getOrderId());
            jSONObject12.put("userId", betCashOutVO.getUserId());
            jSONObject12.put("currency", betCashOutVO.getCurrency());
            jSONObject12.put("usedStake", betCashOutVO.getUsedStake());
            jSONObject12.put("amount", str15);
            jSONObject12.put("isPartial", false);
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("orderVO", jSONObject8);
            jSONObject13.put("betCashoutVO", jSONObject12);
            itf0.a aVar3 = itf0.a;
            str = str2;
            try {
                aVar3.q(str);
                aVar3.g("editbet order " + jSONObject13, new Object[0]);
                string = jSONObject13.toString();
                string.getClass();
            } catch (Exception e3) {
                e = e3;
                itf0.a aVar4 = itf0.a;
                aVar4.q(str);
                aVar4.f(e, "Error generating place edit bet body", new Object[0]);
                s9e0 s9e0Var3 = s9e0.a;
                k9e0 k9e0Var3 = k9e0.a;
                s9e0Var3.getClass();
                k9e0Var3.getClass();
                string = "";
            }
        } catch (Exception e4) {
            e = e4;
            q73Var = q73Var2;
            str = MyLog.TAG_EDIT_BET;
        }
        return q73Var.D.I(string);
    }
}
