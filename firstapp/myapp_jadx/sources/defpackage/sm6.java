package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.cashoutphase3.model.CCFMessage;
import com.sportybet.android.cashoutphase3.model.CashStatusData;
import com.sportybet.android.data.BOConfigSocket;
import com.sportybet.android.data.BannedItemSocket;
import com.sportybet.android.data.MarketStatusSocket;
import com.sportybet.android.data.OddsStatusSocket;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.TopicType;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class sm6 {
    public final pm6 A;
    public final qm6 B;
    public final yo6 a;
    public final JsonSerializeService b;
    public final ISocketPushManager c;
    public final ConcurrentHashMap.KeySetView d;
    public final ConcurrentHashMap.KeySetView e;
    public final b390 f;
    public final t340 g;
    public final b390 h;
    public final t340 i;
    public final b390 j;
    public final t340 k;
    public final b390 l;
    public final t340 m;
    public final b390 n;
    public final t340 o;
    public final v340 p;
    public final wwd0 q;
    public final v340 r;
    public final jm6 s;
    public final km6 t;
    public final lm6 u;
    public final mm6 v;
    public final nm6 w;
    public final om6 x;
    public MultiTopic y;
    public GroupTopic z;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"sm6$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/data/BannedItemSocket;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends BannedItemSocket>> {
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [jm6] */
    /* JADX WARN: Type inference failed for: r3v13, types: [km6] */
    /* JADX WARN: Type inference failed for: r3v14, types: [lm6] */
    /* JADX WARN: Type inference failed for: r3v15, types: [mm6] */
    /* JADX WARN: Type inference failed for: r3v16, types: [nm6] */
    /* JADX WARN: Type inference failed for: r3v17, types: [om6] */
    /* JADX WARN: Type inference failed for: r3v18, types: [pm6] */
    /* JADX WARN: Type inference failed for: r3v19, types: [qm6] */
    public sm6(yo6 yo6Var, JsonSerializeService jsonSerializeService, ISocketPushManager iSocketPushManager) {
        yo6Var.getClass();
        jsonSerializeService.getClass();
        iSocketPushManager.getClass();
        this.a = yo6Var;
        this.b = jsonSerializeService;
        this.c = iSocketPushManager;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.d = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet2.getClass();
        this.e = keySetViewNewKeySet2;
        pb5 pb5Var = pb5.b;
        b390 b390VarB = d390.b(0, 100, pb5Var, 1);
        this.f = b390VarB;
        this.g = e1i.a(b390VarB);
        b390 b390VarB2 = d390.b(0, 100, pb5Var, 1);
        this.h = b390VarB2;
        this.i = e1i.a(b390VarB2);
        b390 b390VarB3 = d390.b(0, 100, pb5Var, 1);
        this.j = b390VarB3;
        this.k = e1i.a(b390VarB3);
        b390 b390VarB4 = d390.b(0, 100, pb5Var, 1);
        this.l = b390VarB4;
        this.m = e1i.a(b390VarB4);
        b390 b390VarB5 = d390.b(0, 100, pb5Var, 1);
        this.n = b390VarB5;
        this.o = e1i.a(b390VarB5);
        this.p = e1i.b(xwd0.a(null));
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.q = wwd0VarA;
        this.r = e1i.b(wwd0VarA);
        this.s = new Subscriber() { // from class: jm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a("[marketStatus] message %s", str);
                if (str == null || str.length() == 0) {
                    return;
                }
                sm6 sm6Var = this.a;
                MarketStatusSocket marketStatusSocket = (MarketStatusSocket) sm6Var.b.fromJson(str, MarketStatusSocket.class);
                b390 b390Var = sm6Var.f;
                marketStatusSocket.getClass();
                b390Var.a(new im6.c(marketStatusSocket));
            }
        };
        this.t = new Subscriber() { // from class: km6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a("[EventStatus] message %s", str);
                if (str == null || str.length() == 0 || !c.u(str, "{", false)) {
                    return;
                }
                this.a.h.a(new im6.b(str));
            }
        };
        this.u = new Subscriber() { // from class: lm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a("[boConfig] message %s", str);
                if (str == null || str.length() == 0) {
                    return;
                }
                try {
                    BOConfigSocket bOConfigSocket = (BOConfigSocket) sm6Var.b.fromJson(str, BOConfigSocket.class);
                    kq1[] kq1VarArr = kq1.a;
                    if ("handle_market_cash_out_status_enabled".equals(bOConfigSocket.getConfigKey())) {
                        sm6Var.j.a(new im6.a(bOConfigSocket));
                    }
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT);
                    aVar2.e(e);
                }
            }
        };
        this.v = new Subscriber() { // from class: mm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a("[oddsStatus] message %s", str);
                if (str == null || str.length() == 0) {
                    return;
                }
                try {
                    OddsStatusSocket oddsStatusSocket = (OddsStatusSocket) sm6Var.b.fromJson(str, OddsStatusSocket.class);
                    b390 b390Var = sm6Var.l;
                    oddsStatusSocket.getClass();
                    b390Var.a(new im6.d(oddsStatusSocket));
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT_CALC_SOCKET);
                    aVar2.e(e);
                }
            }
        };
        this.w = new Subscriber() { // from class: nm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a("[odds] message %s", str);
                if (str == null || str.length() == 0) {
                    return;
                }
                try {
                    OddsStatusSocket oddsStatusSocketCreateFromOddsSocket = OddsStatusSocket.INSTANCE.createFromOddsSocket(str);
                    if (oddsStatusSocketCreateFromOddsSocket != null) {
                        sm6Var.n.a(new im6.d(oddsStatusSocketCreateFromOddsSocket));
                    }
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT_NEW_FEED);
                    aVar2.e(e);
                }
            }
        };
        this.x = new Subscriber() { // from class: om6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar.a(" [cashOutStatus] message %s", str);
                if (str == null || str.length() == 0) {
                    return;
                }
                try {
                    CashStatusData cashStatusData = (CashStatusData) sm6Var.b.fromJson(str, CashStatusData.class);
                    sm6Var.f.a(new im6.c(new MarketStatusSocket(null, null, null, null, cashStatusData.getProduct(), cashStatusData.getPushTime(), String.valueOf(cashStatusData.getStatus()), cashStatusData.getSuspendedReason(), cashStatusData.getTopic(), cashStatusData.getCashOutStatus(), cashStatusData.getWinningOutcomes(), cashStatusData.getLastOddsChangeTime())));
                    sm6Var.l.a(new im6.d(new OddsStatusSocket(null, cashStatusData.getProduct(), null, cashStatusData.getOutcomes(), cashStatusData.getTopic(), cashStatusData.getPushTime(), null, null, cashStatusData.getStatus(), cashStatusData.getLastOddsChangeTime(), 197, null)));
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_CASHOUT_NEW_FEED);
                    aVar2.e(e);
                }
            }
        };
        this.A = new Subscriber() { // from class: pm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                try {
                    zi50.a aVar = zi50.b;
                    ((CCFMessage) sm6Var.b.fromJson(str, CCFMessage.class)).getData();
                    throw null;
                } catch (Throwable unused) {
                    zi50.a aVar2 = zi50.b;
                }
            }
        };
        this.B = new Subscriber() { // from class: qm6
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                sm6 sm6Var = this.a;
                try {
                    zi50.a aVar = zi50.b;
                    Object objFromJson = sm6Var.b.fromJson(str, new sm6.a().getType());
                    objFromJson.getClass();
                    sm6Var.q.k(null, (List) objFromJson);
                    Unit unit = Unit.a;
                } catch (Throwable unused) {
                    zi50.a aVar2 = zi50.b;
                }
            }
        };
    }

    public static boolean b(String str, String str2) {
        Collection collectionT0;
        if (str != null && str.length() != 0) {
            List listH = new Regex("\\^").h(str);
            if (!listH.isEmpty()) {
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
            } else {
                collectionT0 = m2g.a;
                break;
            }
            String[] strArr = (String[]) collectionT0.toArray(new String[0]);
            if (strArr.length != 0 && Intrinsics.g(str2, ay0.H(strArr))) {
                return true;
            }
        }
        return false;
    }

    public final void a() throws Throwable {
        this.f.h();
        this.h.h();
        this.j.h();
        this.l.h();
        this.n.h();
    }

    public final Subscriber c(String str) {
        if (b(str, TopicType.MARKET_STATUS_V2.getPostfix())) {
            return this.s;
        }
        if (Intrinsics.g(str, TopicType.BO_CONFIG_UPDATE.getPostfix())) {
            return this.u;
        }
        if (b(str, TopicType.ODDS_STATUS.getPostfix())) {
            return this.v;
        }
        if (b(str, TopicType.MARKET_ODDS.getPostfix())) {
            return this.w;
        }
        return b(str, TopicType.CASH_OUT_STATUS.getPostfix()) ? this.x : this.t;
    }

    public final void d(boolean z) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
        ConcurrentHashMap.KeySetView<String> keySetView = this.e;
        aVar.a("topicSet %s", keySetView);
        for (String str : keySetView) {
            Subscriber subscriberC = c(str);
            GroupTopic groupTopic = new GroupTopic(str);
            ISocketPushManager iSocketPushManager = this.c;
            if (z) {
                iSocketPushManager.subscribeTopic(groupTopic, subscriberC);
            } else {
                iSocketPushManager.unsubscribeTopic(groupTopic, subscriberC);
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_CASHOUT_NEW_FEED);
                aVar2.a("GroupTopic(topic) = %s  it = %s", groupTopic, subscriberC);
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        GroupTopic groupTopic = this.z;
        if (groupTopic == null) {
            groupTopic = new GroupTopic("banned^events");
            this.z = groupTopic;
        }
        qm6 qm6Var = this.B;
        ISocketPushManager iSocketPushManager = this.c;
        if (z) {
            iSocketPushManager.subscribeTopic(groupTopic, qm6Var);
            return;
        }
        iSocketPushManager.unsubscribeTopic(groupTopic, qm6Var);
        if (z2) {
            this.z = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(List list, x1b x1bVar) throws Throwable {
        tm6 tm6Var;
        if (x1bVar instanceof tm6) {
            tm6Var = (tm6) x1bVar;
            int i = tm6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm6Var.c = i - Integer.MIN_VALUE;
            } else {
                tm6Var = new tm6(this, x1bVar);
            }
        } else {
            tm6Var = new tm6(this, x1bVar);
        }
        Object obj = tm6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tm6Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            a();
            boolean z = this.a.d().l;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_NEW_FEED);
            aVar.a("isNewFeedEnable %s", Boolean.valueOf(z));
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            wm6 wm6Var = new wm6(list, this, z, null);
            tm6Var.c = 1;
            if (ej5.d(oddVar, wm6Var, tm6Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        d(true);
        return Unit.a;
    }
}
