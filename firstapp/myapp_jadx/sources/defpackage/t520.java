package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.popupqueue.PopupQueueDebugViewModel$enqueueTestPopup$1", f = "PopupQueueDebugViewModel.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class t520 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h620 c;
    public final /* synthetic */ s520 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t520(int i, h620 h620Var, s520 s520Var, v1b<? super t520> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = h620Var;
        this.d = s520Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t520(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t520) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONObject jSONObjectA;
        JSONObject jSONObject;
        JSONObject jSONObjectA2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        h620 h620Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            int i2 = this.b;
            if (i2 > 0) {
                itf0.a aVar = itf0.a;
                aVar.q("PopupQueueDebug");
                aVar.a("Enqueuing %s after %ds delay", h620Var.name(), new Integer(i2));
                this.a = 1;
                if (hkd.b(((long) i2) * 1000, this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        String str = h620Var.name() + "_debug_" + System.currentTimeMillis();
        switch (h620Var.ordinal()) {
            case 0:
                jSONObjectA = y79.a();
                jSONObjectA.put("type", "recent_winning_order");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("totalWinnings", "1500.00");
                jSONObject2.put("shortId", "DBG-001");
                jSONObject2.put("bizType", 1);
                jSONObject2.put("orderId", "debug-order-" + System.currentTimeMillis());
                Unit unit = Unit.a;
                jSONObjectA.put("data", jSONObject2);
                jSONObject = jSONObjectA;
                m420 m420Var = new m420(h620Var, str, jSONObject);
                s520 s520Var = this.d;
                s520Var.a.i(m420Var);
                itf0.a aVar2 = itf0.a;
                aVar2.q("PopupQueueDebug");
                aVar2.a("Enqueued test popup: %s", h620Var.name());
                s520Var.x1();
                return Unit.a;
            case 1:
                jSONObject = new JSONObject("{\n  \"type\": \"recent_winning_order\",\n  \"data\": {\n    \"orderId\": \"260609031710lordrpl820306\",\n    \"shortId\": \"437858\",\n    \"bizType\": 162,\n    \"subBizType\": 0,\n    \"betType\": null,\n    \"periodNumber\": null,\n    \"correctEvents\": null,\n    \"status\": 25,\n    \"winningStatus\": 20,\n    \"currency\": \"NGN\",\n    \"totalStake\": \"100.00\",\n    \"paymentAmount\": \"100.00\",\n    \"paymentType\": null,\n    \"favorAmount\": null,\n    \"favorType\": null,\n    \"shareCode\": null,\n    \"favor\": null,\n    \"totalWinnings\": \"200.00\",\n    \"winningTime\": 1778748267240,\n    \"winningInfo\": \"{\\\"pushEnable\\\":true,\\\"showOffEnable\\\":true,\\\"tournamentInfos\\\":[{\\\"id\\\":\\\"sr:tournament:si:15\\\",\\\"name\\\":\\\"UK 15's\\\"}]}\",\n    \"longTotalWinnings\": 2000000,\n    \"longBonusPrize\": null,\n    \"totalBonus\": \"0.00\",\n    \"potentialWinnings\": null,\n    \"taxAmount\": null,\n    \"longPotWinning\": null,\n    \"bets\": null,\n    \"createTime\": 1778748158653,\n    \"refundAmount\": null,\n    \"percent\": 99,\n    \"isHistory\": null,\n    \"settleType\": 0,\n    \"cutbetWinningAmount\": null,\n    \"displayRatingForUser\": false,\n    \"verifyCode\": null,\n    \"deviceId\": null,\n    \"deviceIp\": null,\n    \"deviceCh\": null,\n    \"grossPotentialReturn\": null,\n    \"withholdingTaxAmount\": null,\n    \"netAmountPayable\": null\n  }\n}");
                jSONObject.put("debug", true);
                jSONObject.put("source", "PopupQueueDebugTool");
                m420 m420Var2 = new m420(h620Var, str, jSONObject);
                s520 s520Var2 = this.d;
                s520Var2.a.i(m420Var2);
                itf0.a aVar3 = itf0.a;
                aVar3.q("PopupQueueDebug");
                aVar3.a("Enqueued test popup: %s", h620Var.name());
                s520Var2.x1();
                return Unit.a;
            case 2:
                jSONObject = y79.b(2);
                m420 m420Var3 = new m420(h620Var, str, jSONObject);
                s520 s520Var3 = this.d;
                s520Var3.a.i(m420Var3);
                itf0.a aVar4 = itf0.a;
                aVar4.q("PopupQueueDebug");
                aVar4.a("Enqueued test popup: %s", h620Var.name());
                s520Var3.x1();
                return Unit.a;
            case 3:
                jSONObject = y79.b(1);
                m420 m420Var4 = new m420(h620Var, str, jSONObject);
                s520 s520Var4 = this.d;
                s520Var4.a.i(m420Var4);
                itf0.a aVar5 = itf0.a;
                aVar5.q("PopupQueueDebug");
                aVar5.a("Enqueued test popup: %s", h620Var.name());
                s520Var4.x1();
                return Unit.a;
            case 4:
                jSONObject = y79.b(0);
                m420 m420Var5 = new m420(h620Var, str, jSONObject);
                s520 s520Var5 = this.d;
                s520Var5.a.i(m420Var5);
                itf0.a aVar6 = itf0.a;
                aVar6.q("PopupQueueDebug");
                aVar6.a("Enqueued test popup: %s", h620Var.name());
                s520Var5.x1();
                return Unit.a;
            case 5:
                jSONObjectA = y79.a();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("typeId", 5);
                jSONObject3.put("ticketAmount", 1);
                Unit unit2 = Unit.a;
                jSONObjectA.put("data", jSONObject3);
                jSONObject = jSONObjectA;
                m420 m420Var6 = new m420(h620Var, str, jSONObject);
                s520 s520Var6 = this.d;
                s520Var6.a.i(m420Var6);
                itf0.a aVar7 = itf0.a;
                aVar7.q("PopupQueueDebug");
                aVar7.a("Enqueued test popup: %s", h620Var.name());
                s520Var6.x1();
                return Unit.a;
            case 6:
                jSONObjectA2 = y79.a();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("rewardAmount", 500000L);
                jSONObject4.put("currency", "NGN");
                jSONObject4.put("minDepositAmount", 1000000L);
                jSONObject4.put("endTime", System.currentTimeMillis() + 2000000);
                jSONObject4.put("variant", "VARIANT_A");
                Unit unit3 = Unit.a;
                jSONObjectA2.put("data", jSONObject4);
                jSONObject = jSONObjectA2;
                m420 m420Var7 = new m420(h620Var, str, jSONObject);
                s520 s520Var7 = this.d;
                s520Var7.a.i(m420Var7);
                itf0.a aVar8 = itf0.a;
                aVar8.q("PopupQueueDebug");
                aVar8.a("Enqueued test popup: %s", h620Var.name());
                s520Var7.x1();
                return Unit.a;
            case 7:
                jSONObjectA = y79.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("title", "Debug Boost Gift");
                jSONObject5.put("text", "50% boost on your next bet");
                jSONObject5.put("linkUrl", "sportybet://boost");
                jSONObject5.put("boostKind", 1);
                jSONObject5.put("usableTime", String.valueOf(jCurrentTimeMillis));
                jSONObject5.put("expireTime", String.valueOf(jCurrentTimeMillis + 86400000));
                jSONObject5.put("srcCtt", "Debug boost source");
                Unit unit4 = Unit.a;
                jSONObjectA.put("data", jSONObject5);
                jSONObject = jSONObjectA;
                m420 m420Var8 = new m420(h620Var, str, jSONObject);
                s520 s520Var8 = this.d;
                s520Var8.a.i(m420Var8);
                itf0.a aVar9 = itf0.a;
                aVar9.q("PopupQueueDebug");
                aVar9.a("Enqueued test popup: %s", h620Var.name());
                s520Var8.x1();
                return Unit.a;
            case 8:
                jSONObject = y79.a();
                jSONObject.put("type", h620Var.name());
                m420 m420Var9 = new m420(h620Var, str, jSONObject);
                s520 s520Var9 = this.d;
                s520Var9.a.i(m420Var9);
                itf0.a aVar10 = itf0.a;
                aVar10.q("PopupQueueDebug");
                aVar10.a("Enqueued test popup: %s", h620Var.name());
                s520Var9.x1();
                return Unit.a;
            case 9:
                jSONObject = y79.a();
                jSONObject.put("type", h620Var.name());
                m420 m420Var10 = new m420(h620Var, str, jSONObject);
                s520 s520Var10 = this.d;
                s520Var10.a.i(m420Var10);
                itf0.a aVar11 = itf0.a;
                aVar11.q("PopupQueueDebug");
                aVar11.a("Enqueued test popup: %s", h620Var.name());
                s520Var10.x1();
                return Unit.a;
            case 10:
                jSONObject = y79.a();
                jSONObject.put("type", h620Var.name());
                m420 m420Var11 = new m420(h620Var, str, jSONObject);
                s520 s520Var11 = this.d;
                s520Var11.a.i(m420Var11);
                itf0.a aVar12 = itf0.a;
                aVar12.q("PopupQueueDebug");
                aVar12.a("Enqueued test popup: %s", h620Var.name());
                s520Var11.x1();
                return Unit.a;
            case 11:
                jSONObject = y79.a();
                jSONObject.put("missionId", 999L);
                jSONObject.put("purchasePayTotal", 100000L);
                m420 m420Var12 = new m420(h620Var, str, jSONObject);
                s520 s520Var12 = this.d;
                s520Var12.a.i(m420Var12);
                itf0.a aVar13 = itf0.a;
                aVar13.q("PopupQueueDebug");
                aVar13.a("Enqueued test popup: %s", h620Var.name());
                s520Var12.x1();
                return Unit.a;
            case 12:
                jSONObject = y79.a();
                jSONObject.put("title", "Earn a Repair Tool!");
                jSONObject.put(EventKeys.ERROR_MESSAGE, "Place a bet of 5000 NGN to earn a free Streak Repair Tool.");
                jSONObject.put("action", "Start Mission");
                jSONObject.put("missionStatus", "ACCEPTABLE");
                m420 m420Var13 = new m420(h620Var, str, jSONObject);
                s520 s520Var13 = this.d;
                s520Var13.a.i(m420Var13);
                itf0.a aVar14 = itf0.a;
                aVar14.q("PopupQueueDebug");
                aVar14.a("Enqueued test popup: %s", h620Var.name());
                s520Var13.x1();
                return Unit.a;
            case 13:
                jSONObjectA2 = y79.a();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("challengeId", 123);
                jSONObject6.put("topRanking", 100);
                Unit unit5 = Unit.a;
                jSONObjectA2.put("data", jSONObject6);
                jSONObject = jSONObjectA2;
                m420 m420Var14 = new m420(h620Var, str, jSONObject);
                s520 s520Var14 = this.d;
                s520Var14.a.i(m420Var14);
                itf0.a aVar15 = itf0.a;
                aVar15.q("PopupQueueDebug");
                aVar15.a("Enqueued test popup: %s", h620Var.name());
                s520Var14.x1();
                return Unit.a;
            case 14:
                jSONObject = y79.a();
                jSONObject.put("type", h620Var.name());
                m420 m420Var15 = new m420(h620Var, str, jSONObject);
                s520 s520Var15 = this.d;
                s520Var15.a.i(m420Var15);
                itf0.a aVar16 = itf0.a;
                aVar16.q("PopupQueueDebug");
                aVar16.a("Enqueued test popup: %s", h620Var.name());
                s520Var15.x1();
                return Unit.a;
            case 15:
                jSONObjectA2 = y79.a();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("size", 3);
                Unit unit6 = Unit.a;
                jSONObjectA2.put("data", jSONObject7);
                jSONObject = jSONObjectA2;
                m420 m420Var16 = new m420(h620Var, str, jSONObject);
                s520 s520Var16 = this.d;
                s520Var16.a.i(m420Var16);
                itf0.a aVar17 = itf0.a;
                aVar17.q("PopupQueueDebug");
                aVar17.a("Enqueued test popup: %s", h620Var.name());
                s520Var16.x1();
                return Unit.a;
            case 16:
                jSONObjectA2 = y79.a();
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("tier", 3);
                Unit unit7 = Unit.a;
                jSONObjectA2.put("data", jSONObject8);
                jSONObject = jSONObjectA2;
                m420 m420Var17 = new m420(h620Var, str, jSONObject);
                s520 s520Var17 = this.d;
                s520Var17.a.i(m420Var17);
                itf0.a aVar18 = itf0.a;
                aVar18.q("PopupQueueDebug");
                aVar18.a("Enqueued test popup: %s", h620Var.name());
                s520Var17.x1();
                return Unit.a;
            case 17:
                jSONObjectA = y79.a();
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("tier", 1);
                jSONObject9.put("currency", "NGN");
                jSONObject9.put("minMonthWager", 5000000L);
                Unit unit8 = Unit.a;
                jSONObjectA.put("data", jSONObject9);
                jSONObject = jSONObjectA;
                m420 m420Var18 = new m420(h620Var, str, jSONObject);
                s520 s520Var18 = this.d;
                s520Var18.a.i(m420Var18);
                itf0.a aVar19 = itf0.a;
                aVar19.q("PopupQueueDebug");
                aVar19.a("Enqueued test popup: %s", h620Var.name());
                s520Var18.x1();
                return Unit.a;
            case 18:
                jSONObjectA2 = y79.a();
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(EventKeys.ERROR_MESSAGE, "Your name has been verified successfully");
                Unit unit9 = Unit.a;
                jSONObjectA2.put("data", jSONObject10);
                jSONObject = jSONObjectA2;
                m420 m420Var19 = new m420(h620Var, str, jSONObject);
                s520 s520Var19 = this.d;
                s520Var19.a.i(m420Var19);
                itf0.a aVar110 = itf0.a;
                aVar110.q("PopupQueueDebug");
                aVar110.a("Enqueued test popup: %s", h620Var.name());
                s520Var19.x1();
                return Unit.a;
            case 19:
                jSONObjectA = y79.a();
                jSONObjectA.put("type", "auto_bet_order_result");
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put("settingId", "ticket_123");
                jSONObject11.put("userId", "test123");
                jSONObject11.put(AnalyticsParam.EVENT_STATUS, 1);
                jSONObject11.put("orderId", "O123456789");
                jSONObject11.put("stake", "200");
                jSONObject11.put("triggerOdds", "2.08");
                Unit unit10 = Unit.a;
                jSONObjectA.put("data", jSONObject11);
                jSONObject = jSONObjectA;
                m420 m420Var110 = new m420(h620Var, str, jSONObject);
                s520 s520Var110 = this.d;
                s520Var110.a.i(m420Var110);
                itf0.a aVar111 = itf0.a;
                aVar111.q("PopupQueueDebug");
                aVar111.a("Enqueued test popup: %s", h620Var.name());
                s520Var110.x1();
                return Unit.a;
            case 20:
                jSONObject = y79.a();
                jSONObject.put("title", "Streak Upgraded!");
                jSONObject.put(EventKeys.ERROR_MESSAGE, "Your betting streak reached {Day 5}. Keep it going!");
                m420 m420Var111 = new m420(h620Var, str, jSONObject);
                s520 s520Var111 = this.d;
                s520Var111.a.i(m420Var111);
                itf0.a aVar112 = itf0.a;
                aVar112.q("PopupQueueDebug");
                aVar112.a("Enqueued test popup: %s", h620Var.name());
                s520Var111.x1();
                return Unit.a;
            default:
                uhc.a();
                return null;
        }
    }
}
