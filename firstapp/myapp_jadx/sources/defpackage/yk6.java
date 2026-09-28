package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.data.BOConfigSocket;
import com.sportybet.android.data.MarketStatusSocket;
import com.sportybet.android.data.OddsStatusSocket;
import com.sportybet.android.data.OutcomeSocket;
import com.sportybet.ntespm.socket.NonNullTopicInfo;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observeOpenBetData$2", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yk6 extends tje0 implements Function2<im6, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk6(b bVar, v1b<? super yk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yk6 yk6Var = new yk6(this.b, v1bVar);
        yk6Var.a = obj;
        return yk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(im6 im6Var, v1b<? super Unit> v1bVar) {
        return ((yk6) create(im6Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xh6 xh6Var;
        b bVar;
        Collection collectionT0;
        LinkedHashSet linkedHashSet;
        Iterator it;
        int i;
        NonNullTopicInfo nonNullTopicInfoFromString;
        Integer intOrNull;
        MarketStatusSocket marketStatusSocket;
        String str;
        int i2;
        LinkedHashSet linkedHashSet2;
        boolean z;
        String str2;
        int i3;
        LinkedHashSet linkedHashSet3;
        Bet bet;
        List<String> winningOutcomes;
        xh6 xh6Var2;
        NonNullTopicInfo nonNullTopicInfoFromString2;
        xh6 xh6Var3;
        String str3;
        boolean z2;
        im6 im6Var = (im6) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z3 = im6Var instanceof im6.d;
        b bVar2 = this.b;
        boolean z4 = false;
        if (z3) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
            aVar.a("OddsStatusSocket: " + im6Var, new Object[0]);
            OddsStatusSocket oddsStatusSocket = ((im6.d) im6Var).a;
            if (oddsStatusSocket == null) {
                oddsStatusSocket = null;
            }
            if (oddsStatusSocket != null) {
                xh6 xh6Var4 = bVar2.c0;
                if (xh6Var4 == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                hi6 hi6Var = (hi6) xh6Var4.P.getValue();
                hi6Var.getClass();
                try {
                    NonNullTopicInfo nonNullTopicInfo = new NonNullTopicInfo(null, null, null, null, null, null, null, null, 255, null);
                    String topic = oddsStatusSocket.getTopic();
                    if (topic == null || (nonNullTopicInfoFromString2 = nonNullTopicInfo.fromString(topic)) == null) {
                        xh6Var2 = xh6Var4;
                    } else {
                        String eventId = nonNullTopicInfoFromString2.getEventId();
                        String marketId = nonNullTopicInfoFromString2.getMarketId();
                        String marketSpecifiers = nonNullTopicInfoFromString2.getMarketSpecifiers();
                        String productId = nonNullTopicInfoFromString2.getProductId();
                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                        Iterator<T> it2 = hi6Var.c.iterator();
                        while (it2.hasNext()) {
                            Bet bet2 = ((pl6) it2.next()).a;
                            if (bet2 == null) {
                                xh6Var3 = xh6Var4;
                                str3 = eventId;
                            } else {
                                List<BetSelection> list = bet2.selections;
                                list.getClass();
                                Iterator it3 = list.iterator();
                                boolean z5 = z4;
                                while (it3.hasNext()) {
                                    BetSelection betSelection = (BetSelection) it3.next();
                                    betSelection.getClass();
                                    boolean zF = dz2.f(betSelection, marketId, marketSpecifiers, dz2.a(betSelection));
                                    xh6Var2 = xh6Var4;
                                    try {
                                        boolean z6 = hi6Var.a.d().k && betSelection.eventStatus == 0;
                                        boolean z7 = Intrinsics.g(betSelection.eventId, eventId) && betSelection.additionMarketIdList.contains(marketId);
                                        if (hi6.a(betSelection, eventId, marketId, marketSpecifiers)) {
                                            Integer status = oddsStatusSocket.getStatus();
                                            if (status != null) {
                                                z2 = z7;
                                                int iIntValue = status.intValue();
                                                if (zF || !z6) {
                                                    betSelection.marketStatus = iIntValue;
                                                } else {
                                                    dz2.j(betSelection, productId, iIntValue, oddsStatusSocket.getOutcomes());
                                                }
                                            } else {
                                                z2 = z7;
                                            }
                                            Long lastOddsChangeTime = oddsStatusSocket.getLastOddsChangeTime();
                                            if (lastOddsChangeTime != null) {
                                                betSelection.lastOddsChangeTime = lastOddsChangeTime.longValue();
                                            }
                                            List<OutcomeSocket> outcomes = oddsStatusSocket.getOutcomes();
                                            if (outcomes != null) {
                                                Iterator it4 = outcomes.iterator();
                                                while (it4.hasNext()) {
                                                    OutcomeSocket outcomeSocket = (OutcomeSocket) it4.next();
                                                    Iterator it5 = it4;
                                                    if (Intrinsics.g(betSelection.outcomeId, outcomeSocket.getOutcomeId()) && !z6) {
                                                        try {
                                                            String odds = outcomeSocket.getOdds();
                                                            if (odds != null) {
                                                                float f = Float.parseFloat(odds);
                                                                String str4 = betSelection.currentOdds;
                                                                str4.getClass();
                                                                float f2 = Float.parseFloat(str4);
                                                                betSelection.oddsFlag = f > f2 ? 1 : f < f2 ? 2 : betSelection.oddsFlag;
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        String odds2 = outcomeSocket.getOdds();
                                                        if (odds2 != null) {
                                                            betSelection.currentOdds = odds2;
                                                        }
                                                        Double probability = outcomeSocket.getProbability();
                                                        if (probability != null) {
                                                            betSelection.currentProbability = probability.doubleValue();
                                                        }
                                                        Double voidProbability = outcomeSocket.getVoidProbability();
                                                        if (voidProbability != null) {
                                                            betSelection.currentVoidProbability = voidProbability.doubleValue();
                                                        }
                                                        betSelection.isOutcomeActive = outcomeSocket.getIsOutcomeActive();
                                                    }
                                                    it4 = it5;
                                                }
                                            }
                                            z5 = true;
                                        } else {
                                            z2 = z7;
                                            it3 = it3;
                                            eventId = eventId;
                                            zF = zF;
                                        }
                                        if (z2) {
                                            dz2.g(betSelection, nonNullTopicInfoFromString2, oddsStatusSocket);
                                            if (zF) {
                                                z5 = true;
                                            }
                                        }
                                        eventId = eventId;
                                        xh6Var4 = xh6Var2;
                                        it3 = it3;
                                    } catch (Exception e) {
                                        e = e;
                                        itf0.a aVar2 = itf0.a;
                                        aVar2.q(MyLog.TAG_CASHOUT);
                                        aVar2.e(e);
                                        xh6Var2.p();
                                        bVar2.N0();
                                        return Unit.a;
                                    }
                                }
                                xh6Var3 = xh6Var4;
                                str3 = eventId;
                                if (z5) {
                                    linkedHashSet4.add(bet2);
                                }
                            }
                            eventId = str3;
                            xh6Var4 = xh6Var3;
                            z4 = false;
                        }
                        xh6Var2 = xh6Var4;
                        Iterator it6 = linkedHashSet4.iterator();
                        while (it6.hasNext()) {
                            hi6Var.b((Bet) it6.next());
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    xh6Var2 = xh6Var4;
                }
                xh6Var2.p();
                bVar2.N0();
            }
        } else if (im6Var instanceof im6.c) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CASHOUT_NEW_FEED);
            aVar3.a("MarketStatusSocket: " + im6Var, new Object[0]);
            MarketStatusSocket marketStatusSocket2 = ((im6.c) im6Var).a;
            if (marketStatusSocket2 == null) {
                marketStatusSocket2 = null;
            }
            if (marketStatusSocket2 != null) {
                xh6 xh6Var5 = bVar2.c0;
                if (xh6Var5 == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                hi6 hi6Var2 = (hi6) xh6Var5.P.getValue();
                yo6 yo6Var = hi6Var2.a;
                try {
                    NonNullTopicInfo nonNullTopicInfo2 = new NonNullTopicInfo(null, null, null, null, null, null, null, null, 255, null);
                    String topic2 = marketStatusSocket2.getTopic();
                    if (topic2 != null && (nonNullTopicInfoFromString = nonNullTopicInfo2.fromString(topic2)) != null) {
                        String eventId2 = nonNullTopicInfoFromString.getEventId();
                        String marketId2 = nonNullTopicInfoFromString.getMarketId();
                        String marketSpecifiers2 = nonNullTopicInfoFromString.getMarketSpecifiers();
                        String productId2 = nonNullTopicInfoFromString.getProductId();
                        String status2 = marketStatusSocket2.getStatus();
                        if (status2 != null && (intOrNull = StringsKt.toIntOrNull(status2)) != null) {
                            int iIntValue2 = intOrNull.intValue();
                            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                            Iterator<T> it7 = hi6Var2.c.iterator();
                            while (it7.hasNext()) {
                                Bet bet3 = ((pl6) it7.next()).a;
                                if (bet3 == null) {
                                    marketStatusSocket = marketStatusSocket2;
                                    str = productId2;
                                    i2 = iIntValue2;
                                    linkedHashSet2 = linkedHashSet5;
                                } else {
                                    List<BetSelection> list2 = bet3.selections;
                                    list2.getClass();
                                    boolean z8 = false;
                                    for (BetSelection betSelection2 : list2) {
                                        betSelection2.getClass();
                                        boolean zF2 = dz2.f(betSelection2, marketId2, marketSpecifiers2, dz2.a(betSelection2));
                                        boolean z9 = yo6Var.d().k && betSelection2.eventStatus == 0;
                                        boolean z10 = Intrinsics.g(betSelection2.eventId, eventId2) && betSelection2.additionMarketIdList.contains(marketId2);
                                        if (hi6.a(betSelection2, eventId2, marketId2, marketSpecifiers2)) {
                                            if (zF2 || !z9) {
                                                betSelection2.marketStatus = iIntValue2;
                                            } else {
                                                dz2.j(betSelection2, productId2, iIntValue2, null);
                                            }
                                            Long lastOddsChangeTime2 = marketStatusSocket2.getLastOddsChangeTime();
                                            if (lastOddsChangeTime2 != null) {
                                                betSelection2.lastOddsChangeTime = lastOddsChangeTime2.longValue();
                                            }
                                            if (betSelection2.marketStatus == 3 && (winningOutcomes = marketStatusSocket2.getWinningOutcomes()) != null && winningOutcomes.contains(betSelection2.outcomeId)) {
                                                betSelection2.settleStatus = 1;
                                            }
                                            betSelection2.suspendedReason = marketStatusSocket2.getSuspendedReason();
                                            xo6 xo6VarD = yo6Var.d();
                                            xo6VarD.getClass();
                                            if (xo6VarD.h >= 2) {
                                                betSelection2.cashOutStatus = marketStatusSocket2.getCashOutStatus();
                                            }
                                            z = true;
                                        } else {
                                            z10 = z10;
                                            marketStatusSocket2 = marketStatusSocket2;
                                            z = z8;
                                        }
                                        if (z10) {
                                            linkedHashSet3 = linkedHashSet5;
                                            str2 = productId2;
                                            i3 = iIntValue2;
                                            bet = bet3;
                                            dz2.h(betSelection2, nonNullTopicInfoFromString, marketStatusSocket2.getStatus(), marketStatusSocket2.getSuspendedReason(), marketStatusSocket2.getCashOutStatus(), marketStatusSocket2.getLastOddsChangeTime());
                                            if (zF2) {
                                                z8 = true;
                                            }
                                            linkedHashSet5 = linkedHashSet3;
                                            bet3 = bet;
                                            iIntValue2 = i3;
                                            marketStatusSocket2 = marketStatusSocket2;
                                            productId2 = str2;
                                        } else {
                                            str2 = productId2;
                                            i3 = iIntValue2;
                                            linkedHashSet3 = linkedHashSet5;
                                            bet = bet3;
                                        }
                                        z8 = z;
                                        linkedHashSet5 = linkedHashSet3;
                                        bet3 = bet;
                                        iIntValue2 = i3;
                                        marketStatusSocket2 = marketStatusSocket2;
                                        productId2 = str2;
                                    }
                                    marketStatusSocket = marketStatusSocket2;
                                    str = productId2;
                                    i2 = iIntValue2;
                                    linkedHashSet2 = linkedHashSet5;
                                    Bet bet4 = bet3;
                                    if (z8) {
                                        linkedHashSet2.add(bet4);
                                    }
                                }
                                linkedHashSet5 = linkedHashSet2;
                                iIntValue2 = i2;
                                marketStatusSocket2 = marketStatusSocket;
                                productId2 = str;
                            }
                            Iterator it8 = linkedHashSet5.iterator();
                            while (it8.hasNext()) {
                                hi6Var2.b((Bet) it8.next());
                            }
                        }
                    }
                } catch (Exception e3) {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_CASHOUT);
                    aVar4.e(e3);
                }
                xh6Var5.p();
            }
        } else if (im6Var instanceof im6.a) {
            itf0.a aVar5 = itf0.a;
            aVar5.q(MyLog.TAG_CASHOUT_NEW_FEED);
            aVar5.a("BOConfigSocket: " + im6Var, new Object[0]);
            BOConfigSocket bOConfigSocket = ((im6.a) im6Var).a;
            if (bOConfigSocket == null) {
                bOConfigSocket = null;
            }
            if (bOConfigSocket != null) {
                xh6 xh6Var6 = bVar2.c0;
                if (xh6Var6 == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                if (!Boolean.parseBoolean(bOConfigSocket.getConfigValue())) {
                    hi6 hi6Var3 = (hi6) xh6Var6.P.getValue();
                    Iterator<T> it9 = hi6Var3.c.iterator();
                    while (it9.hasNext()) {
                        Bet bet5 = ((pl6) it9.next()).a;
                        if (bet5 != null) {
                            List<BetSelection> list3 = bet5.selections;
                            list3.getClass();
                            boolean z11 = false;
                            for (BetSelection betSelection3 : list3) {
                                if (betSelection3.cashOutStatus != null) {
                                    betSelection3.cashOutStatus = null;
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                hi6Var3.b(bet5);
                            }
                        }
                    }
                    xh6Var6.p();
                }
            }
        } else {
            if (!(im6Var instanceof im6.b)) {
                uhc.a();
                return null;
            }
            String str5 = ((im6.b) im6Var).a;
            if (str5 == null) {
                str5 = null;
            }
            if (str5 != null) {
                xh6 xh6Var7 = bVar2.c0;
                if (xh6Var7 == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                hi6 hi6Var4 = (hi6) xh6Var7.P.getValue();
                hi6Var4.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    String strOptString = jSONObject.optString("topic");
                    if (TextUtils.isEmpty(strOptString)) {
                        xh6Var = xh6Var7;
                        bVar = bVar2;
                    } else {
                        strOptString.getClass();
                        List listH = new Regex("\\^").h(strOptString);
                        if (listH.isEmpty()) {
                            collectionT0 = m2g.a;
                            break;
                        }
                        ListIterator listIterator = listH.listIterator(listH.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                collectionT0 = m2g.a;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        String[] strArr = (String[]) collectionT0.toArray(new String[0]);
                        if (strArr.length != 5) {
                            xh6Var = xh6Var7;
                            bVar = bVar2;
                        } else {
                            String str6 = strArr[3];
                            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                            Iterator it10 = hi6Var4.c.iterator();
                            while (it10.hasNext()) {
                                Bet bet6 = ((pl6) it10.next()).a;
                                if (bet6 != null && !linkedHashSet6.contains(bet6)) {
                                    List<BetSelection> list4 = bet6.selections;
                                    list4.getClass();
                                    for (BetSelection betSelection4 : list4) {
                                        if (Intrinsics.g(str6, betSelection4.eventId)) {
                                            linkedHashSet6.add(bet6);
                                            int iOptInt = jSONObject.optInt("betStatus");
                                            if ((iOptInt == 1 || iOptInt == 2) && betSelection4.marketStatus < iOptInt) {
                                                betSelection4.marketStatus = iOptInt;
                                            }
                                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("eventGameScores");
                                            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                                                xh6Var = xh6Var7;
                                            } else {
                                                ArrayList arrayList = new ArrayList();
                                                xh6Var = xh6Var7;
                                                try {
                                                    int i4 = 0;
                                                    for (int length = jSONArrayOptJSONArray.length(); i4 < length; length = length) {
                                                        arrayList.add(jSONArrayOptJSONArray.optString(i4));
                                                        i4++;
                                                    }
                                                    betSelection4.gameScore = arrayList;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    bVar = bVar2;
                                                    itf0.a aVar6 = itf0.a;
                                                    aVar6.q(MyLog.TAG_CASHOUT);
                                                    aVar6.e(e);
                                                    xh6Var.p();
                                                    bVar.N0();
                                                    itf0.a aVar7 = itf0.a;
                                                    aVar7.q(MyLog.TAG_CASHOUT_NEW_FEED);
                                                    aVar7.a("EventString: " + im6Var, new Object[0]);
                                                    return Unit.a;
                                                }
                                            }
                                            String strOptString2 = jSONObject.optString("eventMatchPeriod");
                                            strOptString2.getClass();
                                            if (strOptString2.length() <= 0) {
                                                strOptString2 = null;
                                            }
                                            if (strOptString2 != null) {
                                                betSelection4.period = strOptString2;
                                            }
                                            String strOptString3 = jSONObject.optString("eventMatchStatus");
                                            strOptString3.getClass();
                                            if (strOptString3.length() <= 0) {
                                                strOptString3 = null;
                                            }
                                            if (strOptString3 != null) {
                                                betSelection4.matchStatus = strOptString3;
                                            }
                                            String strOptString4 = jSONObject.optString("eventPlayedTime");
                                            strOptString4.getClass();
                                            if (strOptString4.length() <= 0) {
                                                strOptString4 = null;
                                            }
                                            if (strOptString4 != null) {
                                                betSelection4.playedSeconds = strOptString4;
                                            }
                                            String strOptString5 = jSONObject.optString("eventPointScore");
                                            strOptString5.getClass();
                                            if (strOptString5.length() <= 0) {
                                                strOptString5 = null;
                                            }
                                            if (strOptString5 != null) {
                                                betSelection4.pointScore = strOptString5;
                                            }
                                            String strOptString6 = jSONObject.optString("eventRemainingTimeInPeriod");
                                            strOptString6.getClass();
                                            if (strOptString6.length() <= 0) {
                                                strOptString6 = null;
                                            }
                                            if (strOptString6 != null) {
                                                betSelection4.remainingTimeInPeriod = strOptString6;
                                            }
                                            String strOptString7 = jSONObject.optString("eventScore");
                                            strOptString7.getClass();
                                            if (strOptString7.length() <= 0) {
                                                strOptString7 = null;
                                            }
                                            if (strOptString7 != null) {
                                                betSelection4.setScore = strOptString7;
                                            }
                                            int iOptInt2 = jSONObject.optInt("eventStatus", -1);
                                            boolean z12 = hi6Var4.a.d().k;
                                            List<String> list5 = dz2.a;
                                            if (!z12) {
                                                bVar = bVar2;
                                                if ((iOptInt2 == 0 && (i = betSelection4.eventStatus) != 0) || (iOptInt2 != 0 && (i = betSelection4.eventStatus) == 0)) {
                                                    hi6Var4.b.a(i, strOptString);
                                                }
                                            } else if (iOptInt2 == 1) {
                                                bVar = bVar2;
                                                try {
                                                    if (((int) betSelection4.product) == 3 && (i = betSelection4.eventStatus) != 1) {
                                                        hi6Var4.b.a(i, strOptString);
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    itf0.a aVar8 = itf0.a;
                                                    aVar8.q(MyLog.TAG_CASHOUT);
                                                    aVar8.e(e);
                                                    xh6Var.p();
                                                    bVar.N0();
                                                    itf0.a aVar9 = itf0.a;
                                                    aVar9.q(MyLog.TAG_CASHOUT_NEW_FEED);
                                                    aVar9.a("EventString: " + im6Var, new Object[0]);
                                                    return Unit.a;
                                                }
                                            } else {
                                                bVar = bVar2;
                                            }
                                            if (iOptInt2 > -1 && betSelection4.eventStatus != iOptInt2) {
                                                betSelection4.eventStatus = iOptInt2;
                                            }
                                            String strOptString8 = jSONObject.optString("fixtureHomeTeamName");
                                            strOptString8.getClass();
                                            if (strOptString8.length() <= 0) {
                                                strOptString8 = null;
                                            }
                                            if (strOptString8 != null) {
                                                betSelection4.home = strOptString8;
                                            }
                                            String strOptString9 = jSONObject.optString("fixtureAwayTeamName");
                                            strOptString9.getClass();
                                            if (strOptString9.length() <= 0) {
                                                strOptString9 = null;
                                            }
                                            if (strOptString9 != null) {
                                                betSelection4.away = strOptString9;
                                            }
                                            linkedHashSet = linkedHashSet6;
                                            it = it10;
                                            long jOptLong = jSONObject.optLong("fixtureStartTime", -1L);
                                            if (jOptLong > -1) {
                                                betSelection4.startTime = jOptLong;
                                            }
                                        } else {
                                            xh6Var = xh6Var7;
                                            str6 = str6;
                                            bVar = bVar2;
                                            linkedHashSet = linkedHashSet6;
                                            it = it10;
                                        }
                                        bVar2 = bVar;
                                        xh6Var7 = xh6Var;
                                        str6 = str6;
                                        linkedHashSet6 = linkedHashSet;
                                        it10 = it;
                                    }
                                }
                                bVar2 = bVar2;
                                xh6Var7 = xh6Var7;
                                str6 = str6;
                                linkedHashSet6 = linkedHashSet6;
                                it10 = it10;
                            }
                            xh6Var = xh6Var7;
                            bVar = bVar2;
                            Iterator it11 = linkedHashSet6.iterator();
                            while (it11.hasNext()) {
                                hi6Var4.b((Bet) it11.next());
                            }
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    xh6Var = xh6Var7;
                }
                xh6Var.p();
                bVar.N0();
            }
            itf0.a aVar10 = itf0.a;
            aVar10.q(MyLog.TAG_CASHOUT_NEW_FEED);
            aVar10.a("EventString: " + im6Var, new Object[0]);
        }
        return Unit.a;
    }
}
