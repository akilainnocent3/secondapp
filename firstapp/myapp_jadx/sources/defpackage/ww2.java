package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ww2 {
    public final jrm a;
    public final e8h b;
    public final ISocketPushManager c;
    public final odd d;

    public ww2(jrm jrmVar, e8h e8hVar, ISocketPushManager iSocketPushManager, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        jrmVar.getClass();
        e8hVar.getClass();
        iSocketPushManager.getClass();
        this.a = jrmVar;
        this.b = e8hVar;
        this.c = iSocketPushManager;
        this.d = oddVar;
    }

    public static boolean a(Market market, Market market2, long j) {
        market.getClass();
        long j2 = market.lastOddsChangeTime;
        if (j2 < 0) {
            return false;
        }
        long j3 = market2.lastOddsChangeTime;
        return j3 >= 0 && j2 > j3 && j < j2;
    }

    public static boolean b(Market market, long j) {
        market.getClass();
        long j2 = market.lastOddsChangeTime;
        return j2 >= 0 && j >= 0 && j2 > j;
    }

    public static x8z c(List list, List list2, long j, long j2) {
        Object next;
        LinkedHashMap linkedHashMapA = apg.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            if (event.markets != null && !event.isBetBuilderChild()) {
                List<Market> list3 = event.markets;
                list3.getClass();
                ArrayList arrayListR = CollectionsKt.R(list3);
                ArrayList arrayList = new ArrayList();
                int size = arrayListR.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListR.get(i);
                    i++;
                    Market market = (Market) obj;
                    if (Collections.frequency(event.markets, market) == 1 || market.product == 1) {
                        arrayList.add(obj);
                    }
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    Market market2 = (Market) obj2;
                    List<Outcome> list4 = market2.outcomes;
                    if (list4 != null) {
                        ArrayList arrayListR2 = CollectionsKt.R(list4);
                        int size3 = arrayListR2.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Object obj3 = arrayListR2.get(i3);
                            i3++;
                            Outcome outcome = (Outcome) obj3;
                            Selection selection = new Selection(event, market2, outcome, (List) linkedHashMapA.get(market2.id));
                            Iterator it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!Intrinsics.g((Selection) next, selection));
                            Selection selection2 = (Selection) next;
                            if (selection2 != null) {
                                Outcome outcome2 = selection2.c;
                                boolean zEquals = new BigDecimal(outcome.odds).equals(new BigDecimal(outcome2.odds));
                                int i4 = selection2.b.status;
                                int i5 = market2.status;
                                if (i4 == 0) {
                                    if (i4 != i5 || outcome2.isActive != outcome.isActive || !zEquals) {
                                        return new x8z.b(list, list2, j, j2);
                                    }
                                } else if (i5 == 0 || (i5 == 3 && i4 != 3)) {
                                    return new x8z.b(list, list2, j, j2);
                                }
                            }
                        }
                    }
                }
            }
        }
        return x8z.c.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x1b x1bVar) {
        uw2 uw2Var;
        Object bVar;
        List list;
        long j;
        if (x1bVar instanceof uw2) {
            uw2Var = (uw2) x1bVar;
            int i = uw2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uw2Var.f = i - Integer.MIN_VALUE;
            } else {
                uw2Var = new uw2(this, x1bVar);
            }
        } else {
            uw2Var = new uw2(this, x1bVar);
        }
        Object obj = uw2Var.d;
        y5b y5bVar = y5b.a;
        int i2 = uw2Var.f;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                ArrayList arrayListU = this.a.U();
                String requestBody = g880.k(arrayListU, false).getRequestBody();
                long jCurrentTimeMillis = System.currentTimeMillis();
                odd oddVar = this.d;
                vw2 vw2Var = new vw2(this, requestBody, null);
                uw2Var.a = this;
                uw2Var.b = arrayListU;
                uw2Var.c = jCurrentTimeMillis;
                uw2Var.f = 1;
                Object objD = ej5.d(oddVar, vw2Var, uw2Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                list = arrayListU;
                obj = objD;
                j = jCurrentTimeMillis;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = uw2Var.c;
                List list2 = uw2Var.b;
                ww2 ww2Var = uw2Var.a;
                uj50.b(obj);
                j = j2;
                list = list2;
                this = ww2Var;
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.isSuccessful()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                T t = baseResponse.data;
                t.getClass();
                this.getClass();
                bVar = c((List) t, list, j, jCurrentTimeMillis2);
            } else {
                bVar = x8z.a.a;
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        return bVar instanceof zi50.b ? x8z.a.a : bVar;
    }
}
