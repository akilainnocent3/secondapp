package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchFragment$collectLiveMessage$1$1", f = "SearchFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kv70 extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SearchLivePanel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv70(SearchLivePanel searchLivePanel, v1b<? super kv70> v1bVar) {
        super(2, v1bVar);
        this.b = searchLivePanel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kv70 kv70Var = new kv70(this.b, v1bVar);
        kv70Var.a = obj;
        return kv70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
        return ((kv70) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00df A[EDGE_INSN: B:48:0x00df->B:64:0x0112 BREAK  A[LOOP:1: B:44:0x00cc->B:102:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RecyclerView.f adapter;
        RegularMarketRule marketRule;
        Object next;
        Market market;
        Object next2;
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Pair pair = (Pair) (!(obj2 instanceof Pair) ? null : obj2);
        int i = 0;
        SearchLivePanel searchLivePanel = this.b;
        if (pair != null) {
            SocketMarketMessage socketMarketMessage = (SocketMarketMessage) pair.a;
            int iIntValue = ((Number) pair.b).intValue();
            RecyclerView.f adapter2 = searchLivePanel.getRecycler().getAdapter();
            if (adapter2 != null) {
                if (!(adapter2 instanceof cw70)) {
                    adapter2 = null;
                }
                cw70 cw70Var = (cw70) adapter2;
                if (cw70Var != null) {
                    socketMarketMessage.getClass();
                    mfb0 sportRule = cw70Var.k().getSportRule();
                    if (sportRule != null && (marketRule = cw70Var.k().getMarketRule()) != null && socketMarketMessage.isSameSport(sportRule.getId()) && Intrinsics.g(marketRule.a, socketMarketMessage.marketId)) {
                        Collection collection = cw70Var.a.f;
                        collection.getClass();
                        Iterator it = collection.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((Event) next).eventId, socketMarketMessage.eventId));
                        Event event = (Event) next;
                        if (event != null) {
                            LinkedHashMap linkedHashMap = cw70.f;
                            itf0.a aVar = itf0.a;
                            aVar.q(MyLog.TAG_SEARCH_RESULT);
                            aVar.a("handleMarketMsg, eventId: %s, marketMsg: %s", socketMarketMessage.eventId, socketMarketMessage.jsonArray.toString());
                            RegularMarketRule marketRule2 = cw70Var.k().getMarketRule();
                            if (marketRule2 != null) {
                                String str = marketRule2.a;
                                if (event.markets == null) {
                                    event.markets = m2g.a;
                                }
                                if (marketRule2.c) {
                                    ArrayList arrayListD = gjs.d(event, str);
                                    int size = arrayListD.size();
                                    int i2 = 0;
                                    do {
                                        if (i2 >= size) {
                                            market = null;
                                            break;
                                        }
                                        Object obj3 = arrayListD.get(i2);
                                        i2++;
                                        market = (Market) obj3;
                                    } while (!market.match(str, socketMarketMessage.marketSpecifier));
                                } else {
                                    Market market2 = (Market) linkedHashMap.get(event);
                                    if (market2 == null) {
                                        List<Market> list = event.markets;
                                        if (list == null) {
                                            market = null;
                                            break;
                                        }
                                        Iterator<T> it2 = list.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it2.next();
                                        } while (!Intrinsics.g(str, ((Market) next2).id));
                                        Market market3 = (Market) next2;
                                        if (market3 == null) {
                                            market = null;
                                            break;
                                        }
                                        linkedHashMap.put(event, market3);
                                        market = market3;
                                    } else {
                                        market = market2;
                                    }
                                }
                                if (market == null) {
                                    market = new Market();
                                    market.id = str;
                                    market.product = 1;
                                    if (!"~".equals(socketMarketMessage.marketSpecifier)) {
                                        market.specifier = socketMarketMessage.marketSpecifier;
                                    }
                                    event.markets.add(market);
                                    if (!marketRule2.c) {
                                        linkedHashMap.put(event, market);
                                    }
                                }
                                market.update(socketMarketMessage.jsonArray);
                                cw70Var.notifyItemChanged(iIntValue);
                            }
                        }
                    }
                }
            }
        }
        if (!(obj2 instanceof Event)) {
            obj2 = null;
        }
        Event event2 = (Event) obj2;
        if (event2 != null && (adapter = searchLivePanel.getRecycler().getAdapter()) != null) {
            cw70 cw70Var2 = (cw70) (!(adapter instanceof cw70) ? null : adapter);
            if (cw70Var2 != null) {
                List<T> list2 = cw70Var2.a.f;
                list2.getClass();
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.g(((Event) it3.next()).eventId, event2.eventId)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_SEARCH_RESULT);
                    aVar2.a("handleEventMsg, eventId: %s, event: %s", event2.eventId, event2.toString());
                    cw70Var2.notifyItemChanged(i);
                }
            }
        }
        return Unit.a;
    }
}
