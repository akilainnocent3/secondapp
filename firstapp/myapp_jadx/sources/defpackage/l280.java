package defpackage;

import android.content.Context;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll280;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l280 extends j8i0 {
    public final ISocketPushManager A;
    public final eu70 B;
    public final String C;
    public SearchFeatureConfig D;
    public jvd0 E;
    public jvd0 F;
    public jvd0 G;
    public List<String> H;
    public long I;
    public String J;
    public final HashMap K;
    public final l180 L;
    public final n180 M;
    public final wwd0 N;
    public final v340 O;
    public final b390 P;
    public final t340 Q;
    public final o180 R;
    public final Context a;
    public final odk b;
    public final idk c;
    public final xfk d;
    public final dfk e;
    public final nk f;
    public final h750 i;
    public final azm v;
    public final jrm w;
    public final a8z y;
    public final b6d z;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = this.a;
            return Boolean.valueOf(!c.u((String) t, str, true)).compareTo(Boolean.valueOf(!c.u((String) t2, str, true)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [iu2$a, o180] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l180] */
    /* JADX WARN: Type inference failed for: r2v5, types: [n180] */
    public l280(vu60 vu60Var, Context context, odk odkVar, idk idkVar, xfk xfkVar, dfk dfkVar, sck sckVar, nk nkVar, h750 h750Var, azm azmVar, jrm jrmVar, a8z a8zVar, b6d b6dVar, ISocketPushManager iSocketPushManager, eu70 eu70Var) {
        vu60Var.getClass();
        azmVar.getClass();
        jrmVar.getClass();
        iSocketPushManager.getClass();
        this.a = context;
        this.b = odkVar;
        this.c = idkVar;
        this.d = xfkVar;
        this.e = dfkVar;
        this.f = nkVar;
        this.i = h750Var;
        this.v = azmVar;
        this.w = jrmVar;
        this.y = a8zVar;
        this.z = b6dVar;
        this.A = iSocketPushManager;
        this.B = eu70Var;
        String str = (String) vu60Var.b("key");
        str = str == null ? "" : str;
        this.C = str;
        this.D = new SearchFeatureConfig(0, 0, 0, false, false, false, false, false, false, 511, null);
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.J = string;
        this.K = new HashMap();
        this.L = new Subscriber() { // from class: l180
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str2) {
                str2.getClass();
                SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str2);
                if (socketEventMessageCreate == null) {
                    return;
                }
                String str3 = socketEventMessageCreate.eventId;
                str3.getClass();
                this.a.B1(str3, new r180(socketEventMessageCreate, 0));
            }
        };
        this.M = new Subscriber() { // from class: n180
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str2) {
                str2.getClass();
                final SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str2);
                if (socketMarketMessageCreate == null) {
                    return;
                }
                String str3 = socketMarketMessageCreate.eventId;
                str3.getClass();
                this.a.B1(str3, new Function1() { // from class: q180
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SocketMarketMessage socketMarketMessage;
                        Object next;
                        Event event = (Event) obj;
                        event.getClass();
                        Event event2 = new Event(event);
                        List<Market> list = event2.markets;
                        list.getClass();
                        Iterator<T> it = list.iterator();
                        do {
                            boolean zHasNext = it.hasNext();
                            socketMarketMessage = socketMarketMessageCreate;
                            if (!zHasNext) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((Market) next).id, socketMarketMessage.marketId));
                        Market market = (Market) next;
                        if (market == null) {
                            return event2;
                        }
                        List<Outcome> list2 = market.outcomes;
                        list2.getClass();
                        HashSet hashSet = new HashSet();
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((Outcome) it2.next()).id);
                        }
                        market.update(socketMarketMessage.jsonArray);
                        List<Outcome> list3 = market.outcomes;
                        ArrayList arrayListA = kw5.a(list3);
                        for (Object obj2 : list3) {
                            if (hashSet.contains(((Outcome) obj2).id)) {
                                arrayListA.add(obj2);
                            }
                        }
                        market.outcomes = arrayListA;
                        market.product = socketMarketMessage.isLive ? 1 : 3;
                        return event2;
                    }
                });
            }
        };
        wwd0 wwd0VarA = xwd0.a(new q080(str, 30));
        this.N = wwd0VarA;
        this.O = e1i.e(new xzh(wwd0VarA, new m280(this, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new q080(str, 30));
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.P = b390VarB;
        this.Q = e1i.a(b390VarB);
        ?? r1 = new iu2.b() { // from class: o180
            @Override // iu2.a
            public final void C() {
                Object value;
                q080 q080VarA;
                wwd0 wwd0Var = this.a.N;
                do {
                    value = wwd0Var.getValue();
                    q080VarA = (q080) value;
                    wt70 bVar = q080VarA.e;
                    boolean z = bVar instanceof wt70.d;
                    mx70 mx70Var = z ? ((wt70.d) bVar).a : bVar instanceof wt70.b ? ((wt70.b) bVar).a : null;
                    if (mx70Var != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        List<vt70> list = mx70Var.a;
                        int i = 10;
                        ArrayList arrayList = new ArrayList(l48.r(list, 10));
                        for (vt70 vt70Var : list) {
                            List<fu70> list2 = vt70Var.h;
                            vw70 vw70Var = vt70Var.e;
                            ArrayList arrayList2 = new ArrayList(l48.r(list2, i));
                            for (fu70 fu70Var : list2) {
                                arrayList2.add(fu70.a(fu70Var, new Event(fu70Var.a), jCurrentTimeMillis));
                                q080VarA = q080VarA;
                            }
                            q080 q080Var = q080VarA;
                            ArrayList arrayList3 = new ArrayList(l48.r(vw70Var.a, 10));
                            for (Iterator it = r2.iterator(); it.hasNext(); it = it) {
                                fu70 fu70Var2 = (fu70) it.next();
                                arrayList3.add(fu70.a(fu70Var2, new Event(fu70Var2.a), jCurrentTimeMillis));
                            }
                            ArrayList arrayList4 = new ArrayList(l48.r(vw70Var.b, 10));
                            for (Iterator it2 = r2.iterator(); it2.hasNext(); it2 = it2) {
                                fu70 fu70Var3 = (fu70) it2.next();
                                arrayList4.add(fu70.a(fu70Var3, new Event(fu70Var3.a), jCurrentTimeMillis));
                            }
                            arrayList.add(vt70.a(vt70Var, new vw70(arrayList3, arrayList4), arrayList2, 367));
                            q080VarA = q080Var;
                            i = 10;
                        }
                        q080 q080Var2 = q080VarA;
                        mx70 mx70VarA = mx70.a(mx70Var, arrayList);
                        if (z) {
                            bVar = new wt70.d(mx70VarA);
                        } else if (bVar instanceof wt70.b) {
                            bVar = new wt70.b(mx70VarA);
                        }
                        q080VarA = q080.a(q080Var2, null, null, null, null, bVar, 15);
                    }
                } while (!wwd0Var.g(value, q080VarA));
            }
        };
        this.R = r1;
        jrmVar.m1(r1);
        ci40 ci40Var = sckVar.a.d;
        kzh.d(new g1i(new fi40(ii40.b.a(ci40Var.a, ii40.a[0]).k(), ci40Var), new s180(this, null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new t180(this, null), 3);
    }

    public static ArrayList A1(List list, String str, Function1 function1) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.g(((fu70) it.next()).a.eventId, str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        fu70 fu70Var = (fu70) list.get(i);
        fu70 fu70VarA = fu70.a(fu70Var, (Event) function1.invoke(fu70Var.a), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i, fu70VarA);
        return arrayList;
    }

    public final void B1(String str, Function1<? super Event, ? extends Event> function1) {
        wwd0 wwd0Var;
        Object value;
        q080 q080VarA;
        mx70 mx70VarA;
        do {
            wwd0Var = this.N;
            value = wwd0Var.getValue();
            q080VarA = (q080) value;
            wt70 wt70Var = q080VarA.e;
            wt70.d dVar = wt70Var instanceof wt70.d ? (wt70.d) wt70Var : null;
            if (dVar != null) {
                mx70 mx70Var = dVar.a;
                List<vt70> list = mx70Var.a;
                Iterator<T> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        mx70VarA = null;
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    vt70 vt70Var = (vt70) next;
                    vw70 vw70Var = vt70Var.e;
                    List<fu70> list2 = vw70Var.a;
                    ArrayList arrayListA1 = A1(list2, str, function1);
                    List<fu70> list3 = vw70Var.b;
                    if (arrayListA1 != null) {
                        list3.getClass();
                        vt70 vt70VarA = vt70.a(vt70Var, new vw70(arrayListA1, list3), null, 495);
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.set(i, vt70VarA);
                        mx70VarA = mx70.a(mx70Var, arrayList);
                        break;
                    }
                    ArrayList arrayListA2 = A1(list3, str, function1);
                    if (arrayListA2 != null) {
                        list2.getClass();
                        vt70 vt70VarA2 = vt70.a(vt70Var, new vw70(list2, arrayListA2), null, 495);
                        ArrayList arrayList2 = new ArrayList(list);
                        arrayList2.set(i, vt70VarA2);
                        mx70VarA = mx70.a(mx70Var, arrayList2);
                        break;
                    }
                    ArrayList arrayListA3 = A1(vt70Var.h, str, function1);
                    if (arrayListA3 != null) {
                        vt70 vt70VarA3 = vt70.a(vt70Var, null, arrayListA3, 383);
                        ArrayList arrayList3 = new ArrayList(list);
                        arrayList3.set(i, vt70VarA3);
                        mx70VarA = mx70.a(mx70Var, arrayList3);
                        break;
                    }
                    i = i2;
                }
                if (mx70VarA != null) {
                    q080VarA = q080.a(q080VarA, null, null, null, null, new wt70.d(mx70VarA), 15);
                }
            }
        } while (!wwd0Var.g(value, q080VarA));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.w.j1(this.R);
        x1();
    }

    public final void x1() {
        HashMap map = this.K;
        for (Map.Entry entry : map.entrySet()) {
            this.A.unsubscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
        map.clear();
    }

    public final void y1() {
        Object value;
        jvd0 jvd0Var;
        jvd0 jvd0Var2 = this.E;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        wwd0 wwd0Var = this.N;
        if (((q080) wwd0Var.getValue()).a.length() >= this.D.getMinQueryLength()) {
            this.E = ej5.c(o8i0.d(this), null, null, new e280(this, ((q080) wwd0Var.getValue()).a, null), 3);
            return;
        }
        x1();
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, q080.a((q080) value, null, null, null, null, wt70.e.a, 15)));
        if (this.H == null && ((jvd0Var = this.F) == null || !jvd0Var.isActive())) {
            this.F = ej5.c(o8i0.d(this), null, null, new f280(this, null), 3);
        }
        if (((q080) wwd0Var.getValue()).d == null) {
            jvd0 jvd0Var3 = this.G;
            if (jvd0Var3 == null || !jvd0Var3.isActive()) {
                this.G = ej5.c(o8i0.d(this), null, null, new g280(this, null), 3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public final List<String> z1(String str) {
        ?? arrayList;
        String string = StringsKt.t0(str).toString();
        if (string.length() == 0 || string.length() >= this.D.getMinQueryLength()) {
            return m2g.a;
        }
        List<String> list = this.H;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.M((String) obj, string, true)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = m2g.a;
        }
        return CollectionsKt.t0(CollectionsKt.r0(arrayList, new a(string)), 5);
    }
}
