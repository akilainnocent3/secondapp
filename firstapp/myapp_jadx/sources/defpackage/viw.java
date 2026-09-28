package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.android.multimaker.domain.model.MultiMakerOutcome;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketEventMessageParse;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.SocketOutcomeMessage;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$collectSocketMsg$1$1", f = "MultiMakerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class viw extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tjw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.b = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        viw viwVar = new viw(v1bVar, this.b);
        viwVar.a = obj;
        return viwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
        return ((viw) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0181  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONArray jSONArray;
        boolean z;
        Object obj2;
        wwd0 wwd0Var = this.b.M;
        Object obj3 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        if (obj3 instanceof SocketMarketMessage) {
            SocketMarketMessage socketMarketMessage = (SocketMarketMessage) obj3;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_MULTI_MAKER);
            aVar.g("handleLiveMarketMessage(msg=" + socketMarketMessage + ")", new Object[0]);
            if (socketMarketMessage.jsonArray.length() > 8) {
                Object obj4 = socketMarketMessage.jsonArray.get(8);
                if (!(obj4 instanceof JSONArray)) {
                    obj4 = null;
                }
                jSONArray = (JSONArray) obj4;
            } else {
                jSONArray = null;
            }
            if (jSONArray == null || jSONArray.length() <= 0) {
                JSONArray jSONArray2 = socketMarketMessage.jsonArray;
                Iterable<MultiMakerItem> iterable = (Iterable) wwd0Var.getValue();
                ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
                for (MultiMakerItem multiMakerItemA : iterable) {
                    String str = socketMarketMessage.eventId;
                    MultiMakerEvent multiMakerEvent = multiMakerItemA.a;
                    MultiMakerMarket multiMakerMarket = multiMakerItemA.b;
                    if (Intrinsics.g(str, multiMakerEvent.a)) {
                        int i4 = multiMakerMarket.c;
                        int i5 = multiMakerMarket.e;
                        if (i4 == 1 && jSONArray2.getInt(1) == 3) {
                            multiMakerItemA = multiMakerItemA;
                        } else {
                            boolean z2 = i5 != jSONArray2.getInt(2) || (jSONArray2.getInt(2) == 3 && i5 != 3);
                            if (multiMakerMarket.c == 3 && jSONArray2.getInt(1) == 1) {
                                z2 = true;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2) {
                                multiMakerItemA = MultiMakerItem.a(multiMakerItemA, null, MultiMakerMarket.a(multiMakerMarket, z ? 1 : 3, jSONArray2.getInt(2), 11), null, false, false, 29);
                            }
                        }
                    } else {
                        multiMakerItemA = multiMakerItemA;
                    }
                    arrayList.add(multiMakerItemA);
                }
                wwd0Var.k(null, arrayList);
            } else {
                ArrayList arrayListC0 = CollectionsKt.C0((Collection) wwd0Var.getValue());
                int length = jSONArray.length();
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        SocketOutcomeMessage socketOutcomeMessageCreate = new SocketOutcomeMessage(null, null, 0.0d, 0, null, 0, 0, 0, 255, null).create(jSONArray.optString(i6));
                        int size = arrayListC0.size();
                        int i7 = i2;
                        int i8 = i7;
                        while (i8 < size) {
                            Object obj5 = arrayListC0.get(i8);
                            i8++;
                            int i9 = i7 + 1;
                            if (i7 < 0) {
                                b.q();
                                throw null;
                            }
                            MultiMakerItem multiMakerItem = (MultiMakerItem) obj5;
                            String str2 = socketMarketMessage.eventId;
                            MultiMakerEvent multiMakerEvent2 = multiMakerItem.a;
                            MultiMakerOutcome multiMakerOutcome = multiMakerItem.c;
                            if (Intrinsics.g(str2, multiMakerEvent2.a) && Intrinsics.g(socketOutcomeMessageCreate.getId(), multiMakerOutcome.a)) {
                                int iCompareTo = new BigDecimal(socketOutcomeMessageCreate.getOdds()).compareTo(new BigDecimal(multiMakerOutcome.b));
                                Integer numValueOf = Integer.valueOf(iCompareTo);
                                if (iCompareTo == 0) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    String odds = socketOutcomeMessageCreate.getOdds();
                                    int iIsActive = socketOutcomeMessageCreate.isActive();
                                    String str3 = multiMakerOutcome.a;
                                    String str4 = multiMakerOutcome.c;
                                    String str5 = multiMakerOutcome.e;
                                    str3.getClass();
                                    odds.getClass();
                                    str4.getClass();
                                    str5.getClass();
                                    arrayListC0.set(i7, MultiMakerItem.a((MultiMakerItem) arrayListC0.get(i7), null, MultiMakerMarket.a(multiMakerItem.b, 0, socketMarketMessage.jsonArray.getInt(2), 15), new MultiMakerOutcome(iIsActive, iIntValue, str3, odds, str4, str5), false, false, 25));
                                }
                            }
                            i7 = i9;
                        }
                        if (i6 == length) {
                            obj2 = null;
                            break;
                        }
                        i6++;
                        i2 = 0;
                    }
                } else {
                    obj2 = null;
                }
                wwd0Var.k(obj2, arrayListC0);
            }
        } else if (obj3 instanceof SocketEventMessage) {
            SocketEventMessage socketEventMessage = (SocketEventMessage) obj3;
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_MULTI_MAKER);
            aVar2.g("handleLiveEventsMessage(msg=" + socketEventMessage + ")", new Object[0]);
            SocketEventMessageParse socketEventMessageParseCreate = new SocketEventMessageParse(null, null, 0L, 0, null, null, null, 0, null, 511, null).create(socketEventMessage);
            Iterable<MultiMakerItem> iterable2 = (Iterable) wwd0Var.getValue();
            ArrayList arrayList2 = new ArrayList(l48.r(iterable2, 10));
            for (MultiMakerItem multiMakerItemA2 : iterable2) {
                if (Intrinsics.g(socketEventMessage.eventId, multiMakerItemA2.a.a)) {
                    int betStatus = socketEventMessageParseCreate.getBetStatus();
                    int i10 = (betStatus == i3 || betStatus == 2 || betStatus == i) ? i3 : 0;
                    MultiMakerMarket multiMakerMarket2 = multiMakerItemA2.b;
                    if (i10 == 0) {
                        betStatus = multiMakerMarket2.e;
                    }
                    MultiMakerMarket multiMakerMarketA = MultiMakerMarket.a(multiMakerMarket2, 0, betStatus, 15);
                    MultiMakerEvent multiMakerEvent3 = multiMakerItemA2.a;
                    int status = socketEventMessageParseCreate.getStatus();
                    String productStatus = socketEventMessageParseCreate.getProductStatus();
                    long estimateStartTime = socketEventMessageParseCreate.getEstimateStartTime();
                    String matchStatus = socketEventMessageParseCreate.getMatchStatus();
                    String homeTeamName = socketEventMessageParseCreate.getHomeTeamName();
                    String awayTeamName = socketEventMessageParseCreate.getAwayTeamName();
                    String str6 = socketEventMessage.tournamentId;
                    str6.getClass();
                    String str7 = multiMakerEvent3.a;
                    String str8 = multiMakerEvent3.v;
                    String str9 = multiMakerEvent3.w;
                    qn4.b(str7, productStatus, matchStatus, homeTeamName, awayTeamName);
                    str8.getClass();
                    str9.getClass();
                    multiMakerItemA2 = MultiMakerItem.a(multiMakerItemA2, new MultiMakerEvent(str7, productStatus, matchStatus, homeTeamName, awayTeamName, str8, str9, str6, estimateStartTime, status), multiMakerMarketA, null, false, false, 28);
                }
                arrayList2.add(multiMakerItemA2);
                i = 3;
                i3 = 1;
            }
            wwd0Var.k(null, arrayList2);
        }
        return Unit.a;
    }
}
