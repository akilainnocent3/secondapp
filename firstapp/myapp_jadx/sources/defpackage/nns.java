package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnns;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nns extends j8i0 {
    public RegularMarketRule A;
    public final HashMap B;
    public final wwd0 C;
    public final v340 D;
    public final wwd0 E;
    public final v340 F;
    public srs G;
    public final b390 H;
    public final t340 I;
    public final b390 J;
    public final t340 K;
    public final ku90<Pair<Sport, RegularMarketRule>> L;
    public final t340 M;
    public final ConcurrentHashMap N;
    public final wwd0 O;
    public final v340 P;
    public final kns Q;
    public final lns R;
    public final e8h a;
    public final n25 b;
    public final lck c;
    public final v5k d;
    public final ISocketPushManager e;
    public final iuy f;
    public final hkf i;
    public final xhh0 v;
    public final JsonSerializeService w;
    public final lfb0 y;
    public Sport z;

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$loadMarketsAndEvents$1", f = "LiveEventsPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<List<? extends RegularMarketRule>, List<? extends Event>, BaseResponse<BoostInfo>, v1b<? super srs>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ List b;
        public /* synthetic */ BaseResponse c;
        public final /* synthetic */ String d;
        public final /* synthetic */ nns e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, nns nnsVar, String str) {
            super(4, v1bVar);
            this.d = str;
            this.e = nnsVar;
        }

        @Override // defpackage.iaj
        public final Object d(List<? extends RegularMarketRule> list, List<? extends Event> list2, BaseResponse<BoostInfo> baseResponse, v1b<? super srs> v1bVar) {
            a aVar = new a(v1bVar, this.e, this.d);
            aVar.a = list;
            aVar.b = list2;
            aVar.c = baseResponse;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            List list2 = this.b;
            BaseResponse baseResponse = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BoostInfo boostInfo = (BoostInfo) baseResponse.data;
            ?? arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            if (boostInfo != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = boostInfo.usableTime;
                if (jCurrentTimeMillis >= boostInfo.expireTime || j > jCurrentTimeMillis) {
                    boostInfo = null;
                }
                if (boostInfo != null) {
                    bcp bcpVar = boostInfo.details;
                    if (bcpVar != null) {
                        arrayList = new ArrayList(l48.r(bcpVar, 10));
                        ArrayList<tcp> arrayList2 = bcpVar.a;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            tcp tcpVar = arrayList2.get(i);
                            i++;
                            xdp xdpVarD = tcpVar.d();
                            xnu xnuVar = new xnu();
                            String strF = xdpVarD.j("tournamentId").f();
                            strF.getClass();
                            xnuVar.put("tournamentId", strF);
                            String strF2 = xdpVarD.j(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID).f();
                            strF2.getClass();
                            xnuVar.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, strF2);
                            String strF3 = xdpVarD.j("marketId").f();
                            strF3.getClass();
                            xnuVar.put("marketId", strF3);
                            int iB = xdpVarD.j("productId").b();
                            xnuVar.put("productId", iB == 0 ? "" : String.valueOf(iB));
                            arrayList.add(xnuVar.c());
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = m2g.a;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                nns nnsVar = this.e;
                String str = this.d;
                if (!zHasNext) {
                    srs srsVar = new srs(str, arrayList3, new rrs(list2, arrayList));
                    nnsVar.G = srsVar;
                    return srsVar;
                }
                arrayList3.add(nnsVar.y1(str, (RegularMarketRule) it.next()));
            }
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$loadMarketsAndEvents$2", f = "LiveEventsPanelViewModel.kt", l = {332}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<srs, v1b<? super Unit>, Object> {
        public Sport a;
        public RegularMarketRule b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ nns e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, nns nnsVar, String str) {
            super(2, v1bVar);
            this.e = nnsVar;
            this.f = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.e, this.f);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(srs srsVar, v1b<? super Unit> v1bVar) {
            return ((b) create(srsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws qrs {
            String str;
            Object next;
            RegularMarketRule regularMarketRule;
            Sport sport;
            RegularMarketRule regularMarketRule2;
            nns nnsVar = this.e;
            hkf hkfVar = nnsVar.i;
            srs srsVar = (srs) this.d;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                Sport sport2 = nnsVar.z;
                if (sport2 != null) {
                    if (!Intrinsics.g(sport2.id, this.f)) {
                        sport2 = null;
                    }
                    if (sport2 != null) {
                        RegularMarketRule regularMarketRule3 = nnsVar.A;
                        if (regularMarketRule3 != null) {
                            hkfVar.getClass();
                            str = hkf.d(regularMarketRule3).a;
                        } else {
                            str = null;
                        }
                        Iterator<T> it = srsVar.b.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            hkfVar.getClass();
                        } while (!Intrinsics.g(hkf.d((RegularMarketRule) next).a, str));
                        RegularMarketRule regularMarketRule4 = (RegularMarketRule) next;
                        if (regularMarketRule4 == null) {
                            regularMarketRule = (RegularMarketRule) CollectionsKt.firstOrNull(srsVar.b);
                            if (regularMarketRule == null) {
                                throw new qrs();
                            }
                        } else {
                            regularMarketRule = regularMarketRule4;
                        }
                        nnsVar.A = regularMarketRule;
                        ku90<Pair<Sport, RegularMarketRule>> ku90Var = nnsVar.L;
                        Pair pair = new Pair(sport2, regularMarketRule);
                        this.d = srsVar;
                        this.a = sport2;
                        this.b = regularMarketRule;
                        this.c = 1;
                        if (ku90Var.a.emit(pair, this) == y5bVar) {
                            return y5bVar;
                        }
                        sport = sport2;
                        regularMarketRule2 = regularMarketRule;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            RegularMarketRule regularMarketRule5 = this.b;
            Sport sport3 = this.a;
            uj50.b(obj);
            sport = sport3;
            regularMarketRule2 = regularMarketRule5;
            List list = srsVar.c.a;
            Sport sport4 = nnsVar.z;
            List listC = hkfVar.c(sport4 != null ? sport4.id : null, regularMarketRule2.a, list, true);
            List list2 = srsVar.c.b;
            if (list2 == null) {
                list2 = m2g.a;
            }
            List list3 = list2;
            wwd0 wwd0Var = nnsVar.O;
            Object data = ((UIState) wwd0Var.getValue()).getData();
            wwd0Var.setValue(data != null ? new UIState.Success(ins.a((ins) data, sport, srsVar.b, regularMarketRule2, listC, list3, 1)) : UIState.Idle.INSTANCE);
            nnsVar.F1(listC);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$loadMarketsAndEvents$3", f = "LiveEventsPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super srs>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super srs> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = nns.this.new c(v1bVar);
            cVar.a = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = nns.this.O;
            UIState.Error error = new UIState.Error(th, ((UIState) wwd0Var.getValue()).getData());
            wwd0Var.getClass();
            wwd0Var.k(null, error);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$marketSubscriber$1$1", f = "LiveEventsPanelViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ nns c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, nns nnsVar, String str) {
            super(2, v1bVar);
            this.b = str;
            this.c = nnsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SocketMarketMessage socketMarketMessageCreate;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                String str = this.b;
                if (str != null && (socketMarketMessageCreate = SocketMarketMessage.create(str)) != null) {
                    nns nnsVar = this.c;
                    b390 b390Var = nnsVar.H;
                    iqu iquVar = new iqu(socketMarketMessageCreate, (RegularMarketRule) nnsVar.N.get(socketMarketMessageCreate.eventId));
                    this.a = 1;
                    if (b390Var.emit(iquVar, this) == y5bVar) {
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
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$onLoadLivePanel$1", f = "LiveEventsPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super List<? extends Sport>>, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nns.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Sport>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = nns.this.O;
            if (wwd0Var.getValue() instanceof UIState.Idle) {
                UIState.Loading loading = new UIState.Loading(null, 1, null);
                wwd0Var.getClass();
                wwd0Var.k(null, loading);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$onLoadLivePanel$2", f = "LiveEventsPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<List<? extends Sport>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = nns.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Sport> list, v1b<? super Unit> v1bVar) {
            return ((f) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x005b  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws qrs {
            Object obj2;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nns nnsVar = nns.this;
            wwd0 wwd0Var = nnsVar.O;
            ins insVar = (ins) ((UIState) wwd0Var.getValue()).getData();
            List<Sport> list2 = insVar != null ? insVar.a : null;
            ArrayList arrayListC1 = nns.C1(nnsVar.x1(list));
            if (arrayListC1.isEmpty()) {
                arrayListC1 = null;
            }
            if (arrayListC1 == null) {
                throw new qrs();
            }
            Sport sport = nnsVar.z;
            if (sport == null) {
                sport = (Sport) CollectionsKt.T(arrayListC1);
            } else {
                if (!arrayListC1.isEmpty()) {
                    int size = arrayListC1.size();
                    int i = 0;
                    do {
                        if (i >= size) {
                            sport = null;
                            break;
                        }
                        obj2 = arrayListC1.get(i);
                        i++;
                    } while (!Intrinsics.g(((Sport) obj2).id, sport.id));
                } else {
                    sport = null;
                    break;
                }
                if (sport == null) {
                    sport = (Sport) CollectionsKt.T(arrayListC1);
                }
            }
            nnsVar.z = sport;
            if (!Intrinsics.g(list2, arrayListC1)) {
                UIState.Loading loading = new UIState.Loading(new ins(arrayListC1, sport));
                wwd0Var.getClass();
                wwd0Var.k(null, loading);
            }
            nnsVar.z1();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$onLoadLivePanel$3", f = "LiveEventsPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements gaj<myh<? super List<? extends Sport>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public g(v1b<? super g> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super List<? extends Sport>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            g gVar = nns.this.new g(v1bVar);
            gVar.a = th;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = nns.this.O;
            UIState.Error error = new UIState.Error(th, ((UIState) wwd0Var.getValue()).getData());
            wwd0Var.getClass();
            wwd0Var.k(null, error);
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [kns] */
    /* JADX WARN: Type inference failed for: r1v18, types: [lns] */
    public nns(e8h e8hVar, n25 n25Var, lck lckVar, v5k v5kVar, ISocketPushManager iSocketPushManager, iuy iuyVar, hkf hkfVar, xhh0 xhh0Var, JsonSerializeService jsonSerializeService, lfb0 lfb0Var) {
        e8hVar.getClass();
        n25Var.getClass();
        iSocketPushManager.getClass();
        iuyVar.getClass();
        jsonSerializeService.getClass();
        lfb0Var.getClass();
        this.a = e8hVar;
        this.b = n25Var;
        this.c = lckVar;
        this.d = v5kVar;
        this.e = iSocketPushManager;
        this.f = iuyVar;
        this.i = hkfVar;
        this.v = xhh0Var;
        this.w = jsonSerializeService;
        this.y = lfb0Var;
        this.B = new HashMap();
        wwd0 wwd0VarA = xwd0.a(avy.c);
        this.C = wwd0VarA;
        this.D = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.E = wwd0VarA2;
        this.F = e1i.b(wwd0VarA2);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.H = b390VarB;
        this.I = e1i.a(b390VarB);
        b390 b390VarB2 = d390.b(0, 0, null, 7);
        this.J = b390VarB2;
        this.K = e1i.a(b390VarB2);
        ku90<Pair<Sport, RegularMarketRule>> ku90Var = new ku90<>();
        this.L = ku90Var;
        this.M = e1i.a(ku90Var);
        this.N = new ConcurrentHashMap();
        wwd0 wwd0VarA3 = xwd0.a(UIState.Idle.INSTANCE);
        this.O = wwd0VarA3;
        this.P = e1i.b(wwd0VarA3);
        this.Q = new Subscriber() { // from class: kns
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                nns nnsVar = this.a;
                ej5.c(o8i0.d(nnsVar), null, null, new nns.d(null, nnsVar, str), 3);
            }
        };
        this.R = new Subscriber() { // from class: lns
            /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
            /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: JSONException -> 0x00bf, TryCatch #0 {JSONException -> 0x00bf, blocks: (B:5:0x0011, B:6:0x002e, B:8:0x0035, B:9:0x004e, B:15:0x0062, B:17:0x0070, B:19:0x0074, B:22:0x007b, B:24:0x007f, B:36:0x00a9, B:27:0x0086, B:29:0x008c, B:35:0x00a3), top: B:41:0x0011 }] */
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                Object obj;
                nns nnsVar = this.a;
                wwd0 wwd0Var = nnsVar.O;
                if (((UIState) wwd0Var.getValue()).getData() == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int i = 0;
                    IntRange intRangeN = f.n(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(l48.r(intRangeN, 10));
                    Iterator<Integer> it = intRangeN.iterator();
                    while (((mwo) it).c) {
                        arrayList.add((Sport) nnsVar.w.fromJson(jSONArray.getString(((zvo) it).nextInt()), Sport.class));
                    }
                    ArrayList arrayListC1 = nns.C1(nnsVar.x1(arrayList));
                    if (arrayListC1.isEmpty()) {
                        arrayListC1 = null;
                    }
                    if (arrayListC1 == null) {
                        return;
                    }
                    ins insVar = (ins) ((UIState) wwd0Var.getValue()).getData();
                    if (arrayListC1.equals(insVar != null ? insVar.a : null)) {
                        return;
                    }
                    Sport sport = nnsVar.z;
                    if (sport == null) {
                        sport = (Sport) CollectionsKt.T(arrayListC1);
                    } else {
                        if (!arrayListC1.isEmpty()) {
                            int size = arrayListC1.size();
                            do {
                                if (i < size) {
                                    obj = arrayListC1.get(i);
                                    i++;
                                }
                            } while (!Intrinsics.g(((Sport) obj).id, sport.id));
                            if (sport != null) {
                                sport = (Sport) CollectionsKt.T(arrayListC1);
                            }
                        }
                        sport = null;
                        if (sport != null) {
                            sport = (Sport) CollectionsKt.T(arrayListC1);
                        }
                    }
                    nnsVar.z = sport;
                    UIState.Loading loading = new UIState.Loading(new ins(arrayListC1, sport));
                    wwd0Var.getClass();
                    wwd0Var.k(null, loading);
                    nnsVar.z1();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        };
    }

    public static ArrayList C1(ArrayList arrayList) {
        int iA = jpu.a(l48.r(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            linkedHashMap.put(((Sport) obj).id, obj);
        }
        List<OrderedSportItem> fromStorage = OrderedSportItemHelper.getFromStorage(1);
        ArrayList arrayListA = kw5.a(fromStorage);
        Iterator<T> it = fromStorage.iterator();
        while (it.hasNext()) {
            Sport sport = (Sport) linkedHashMap.get(((OrderedSportItem) it.next()).id);
            if (sport != null) {
                arrayListA.add(sport);
            }
        }
        return arrayListA;
    }

    public final void A1() {
        if (this.O.getValue() instanceof UIState.Loading) {
            return;
        }
        kzh.d(new yzh(new g1i(new xzh(this.a.n(), new e(null)), new f(null)), new g(null)), o8i0.d(this));
    }

    public final void B1(RegularMarketRule regularMarketRule, boolean z) {
        String str;
        srs srsVar;
        regularMarketRule.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIVE_PANEL);
        String str2 = regularMarketRule.a;
        aVar.a(inm.a("onMarketChanged market: ", str2), new Object[0]);
        RegularMarketRule regularMarketRule2 = this.A;
        if (Intrinsics.g(str2, regularMarketRule2 != null ? regularMarketRule2.a : null)) {
            return;
        }
        this.A = regularMarketRule;
        if (z) {
            z1();
            return;
        }
        Sport sport = this.z;
        if (sport == null || (str = sport.id) == null || (srsVar = this.G) == null || !Intrinsics.g(srsVar.a, str)) {
            return;
        }
        this.L.a(new Pair<>(sport, regularMarketRule));
        List list = srsVar.c.a;
        Sport sport2 = this.z;
        List listC = this.i.c(sport2 != null ? sport2.id : null, str2, list, true);
        wwd0 wwd0Var = this.O;
        Object data = ((UIState) wwd0Var.getValue()).getData();
        wwd0Var.setValue(data != null ? new UIState.Success(ins.a((ins) data, null, srsVar.b, regularMarketRule, listC, null, 35)) : UIState.Idle.INSTANCE);
        F1(listC);
    }

    public final void D1(String str, String str2) {
        List<Event> list;
        Object next;
        RegularMarketRule regularMarketRuleA;
        ins insVar = (ins) ((UIState) this.O.getValue()).getData();
        if (insVar == null || (list = insVar.e) == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.N;
        RegularMarketRule regularMarketRule = (RegularMarketRule) concurrentHashMap.get(str);
        if (Intrinsics.g(regularMarketRule != null ? regularMarketRule.a : null, str2)) {
            itf0.a aVar = itf0.a;
            aVar.a(uf80.a(ce7.a(aVar, MyLog.TAG_LIVE_PANEL, "Dynamic market ", str2, " for event "), str, " is already subscribed"), new Object[0]);
            return;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((Event) next).eventId, str));
        Event event = (Event) next;
        if (event == null || (regularMarketRuleA = RegularMarketRule.a(str2, null)) == null) {
            return;
        }
        concurrentHashMap.put(str, regularMarketRuleA);
        String str3 = tva.a;
        GroupTopic groupTopic = new GroupTopic(event.getMarketStatusTopic(str3, str2));
        GroupTopic groupTopic2 = new GroupTopic(event.getMarketOddsTopic(str3, str2));
        HashMap map = this.B;
        kns knsVar = this.Q;
        map.put(groupTopic, knsVar);
        map.put(groupTopic2, knsVar);
        ISocketPushManager iSocketPushManager = this.e;
        iSocketPushManager.subscribeTopic(groupTopic, knsVar);
        iSocketPushManager.subscribeTopic(groupTopic2, knsVar);
        itf0.a aVar2 = itf0.a;
        StringBuilder sbA = ce7.a(aVar2, MyLog.TAG_LIVE_PANEL, "[eventId=", str, "] Subscribed to dynamic market: ");
        sbA.append(str2);
        aVar2.g(sbA.toString(), new Object[0]);
    }

    public final void E1() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIVE_PANEL);
        HashMap map = this.B;
        aVar.a("unsubscribe All Topics [" + map.size() + "]: " + map.keySet(), new Object[0]);
        for (Map.Entry entry : map.entrySet()) {
            this.e.unsubscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }

    public final void F1(List<? extends Event> list) {
        List<Outcome> list2;
        String str;
        E1();
        this.N.clear();
        HashMap map = this.B;
        map.clear();
        for (final Event event : list) {
            GroupTopic groupTopic = new GroupTopic(event.getTopic());
            String str2 = tva.a;
            RegularMarketRule regularMarketRule = this.A;
            Object obj = null;
            GroupTopic groupTopic2 = new GroupTopic(event.getMarketStatusTopic(str2, regularMarketRule != null ? regularMarketRule.a : null));
            RegularMarketRule regularMarketRule2 = this.A;
            GroupTopic groupTopic3 = new GroupTopic(event.getMarketOddsTopic(str2, regularMarketRule2 != null ? regularMarketRule2.a : null));
            Subscriber subscriber = new Subscriber() { // from class: jns
                @Override // com.sportybet.ntespm.socket.Subscriber
                public final void onReceive(String str3) {
                    ins insVar;
                    List<Event> list3;
                    Object obj2;
                    String str4 = event.eventId;
                    str4.getClass();
                    str3.getClass();
                    nns nnsVar = this.a;
                    wwd0 wwd0Var = nnsVar.O;
                    if (!(wwd0Var.getValue() instanceof UIState.Success) || (insVar = (ins) ((UIState) wwd0Var.getValue()).getData()) == null || (list3 = insVar.e) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(list3);
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    do {
                        if (i2 >= size) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = arrayList.get(i2);
                            i2++;
                        }
                    } while (!Intrinsics.g(((Event) obj2).eventId, str4));
                    Event event2 = (Event) obj2;
                    if (event2 != null) {
                        event2.update(str3);
                        if (b3.I(event2.status, event2.estimateStartTime)) {
                            ej5.c(o8i0.d(nnsVar), null, null, new mns(nnsVar, arrayList, event2, null), 3);
                            return;
                        }
                        arrayList.remove(event2);
                        RegularMarketRule regularMarketRule3 = (RegularMarketRule) nnsVar.N.get(event2.eventId);
                        String str5 = regularMarketRule3 != null ? regularMarketRule3.a : null;
                        GroupTopic groupTopic4 = new GroupTopic(event2.getTopic());
                        String str6 = tva.a;
                        RegularMarketRule regularMarketRule4 = nnsVar.A;
                        GroupTopic groupTopic5 = new GroupTopic(event2.getMarketStatusTopic(str6, regularMarketRule4 != null ? regularMarketRule4.a : null));
                        RegularMarketRule regularMarketRule5 = nnsVar.A;
                        ArrayList arrayListV = ay0.v(new GroupTopic[]{groupTopic4, groupTopic5, new GroupTopic(event2.getMarketOddsTopic(str6, regularMarketRule5 != null ? regularMarketRule5.a : null)), str5 != null ? new GroupTopic(event2.getMarketStatusTopic(str6, str5)) : null, str5 != null ? new GroupTopic(event2.getMarketOddsTopic(str6, str5)) : null});
                        int size2 = arrayListV.size();
                        while (i < size2) {
                            Object obj3 = arrayListV.get(i);
                            i++;
                            GroupTopic groupTopic6 = (GroupTopic) obj3;
                            Subscriber subscriber2 = (Subscriber) nnsVar.B.remove(groupTopic6);
                            if (subscriber2 != null) {
                                nnsVar.e.unsubscribeTopic(groupTopic6, subscriber2);
                            }
                        }
                        Object data = ((UIState) wwd0Var.getValue()).getData();
                        wwd0Var.setValue(data != null ? new UIState.Success(ins.a((ins) data, null, null, null, arrayList, null, 47)) : UIState.Idle.INSTANCE);
                    }
                }
            };
            kns knsVar = this.Q;
            map.put(groupTopic2, knsVar);
            map.put(groupTopic3, knsVar);
            map.put(groupTopic, subscriber);
            ISocketPushManager iSocketPushManager = this.e;
            iSocketPushManager.subscribeTopic(groupTopic, subscriber);
            iSocketPushManager.subscribeTopic(groupTopic2, knsVar);
            iSocketPushManager.subscribeTopic(groupTopic3, knsVar);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_PANEL);
            String str3 = event.eventId;
            RegularMarketRule regularMarketRule3 = this.A;
            aVar.g(lx5.a("[eventId=", str3, "] Subscribed to market: ", regularMarketRule3 != null ? regularMarketRule3.a : null), new Object[0]);
            for (Object obj2 : this.d.b(event)) {
                Market market = (Market) obj2;
                if (market != null && market.status == 0 && (list2 = market.outcomes) != null) {
                    if (!list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Outcome outcome = (Outcome) it.next();
                                if (outcome.isActive != 1 || (str = outcome.odds) == null || str.length() == 0) {
                                }
                            }
                        }
                    }
                    obj = obj2;
                    break;
                }
            }
            Market market2 = (Market) obj;
            if (market2 != null) {
                String str4 = event.eventId;
                str4.getClass();
                String str5 = market2.id;
                str5.getClass();
                D1(str4, str5);
            }
        }
    }

    public final void G1(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        srs srsVar = this.G;
        srs srsVar2 = null;
        List<RegularMarketRule> list = srsVar != null ? srsVar.b : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (RegularMarketRule regularMarketRule3 : list) {
                if (Intrinsics.g(regularMarketRule3.a, regularMarketRule.a)) {
                    regularMarketRule3 = regularMarketRule2;
                }
                arrayList.add(regularMarketRule3);
            }
            srs srsVar3 = this.G;
            if (srsVar3 != null) {
                String str = srsVar3.a;
                rrs rrsVar = srsVar3.c;
                str.getClass();
                srsVar2 = new srs(str, arrayList, rrsVar);
            }
            this.G = srsVar2;
        }
    }

    public final ArrayList x1(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Sport sport = (Sport) obj;
            if (sport.isValid()) {
                if (this.y.d.containsKey(sport.id)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final RegularMarketRule y1(String str, RegularMarketRule regularMarketRule) {
        RegularMarketRule regularMarketRuleA;
        xhh0 xhh0Var = this.v;
        if (!xhh0Var.e(regularMarketRule, str, true)) {
            ckf ckfVar = ckf.c;
            String str2 = regularMarketRule.a;
            hkf hkfVar = this.i;
            hkfVar.getClass();
            return (!hkfVar.a.b(ckfVar, str, str2, true) || (regularMarketRuleA = hkfVar.a(str, regularMarketRule, ((Boolean) this.E.getValue()).booleanValue(), true)) == null || Intrinsics.g(regularMarketRuleA.a, regularMarketRule.a)) ? regularMarketRule : regularMarketRuleA;
        }
        RegularMarketRule regularMarketRuleB = xhh0Var.b((avy) this.C.getValue(), regularMarketRule, str, true);
        if (regularMarketRuleB != null) {
            return regularMarketRuleB;
        }
        return regularMarketRule;
    }

    public final void z1() {
        String str;
        List<String> listC;
        Sport sport = this.z;
        if (sport == null || (str = sport.id) == null) {
            return;
        }
        iuy iuyVar = this.f;
        uvy uvyVarE = iuyVar.e();
        boolean z = uvyVarE.a && uvyVarE.b;
        uvy uvyVarE2 = iuyVar.e();
        boolean z2 = uvyVarE2.c && uvyVarE2.d;
        int iOrdinal = ((avy) this.C.getValue()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
            } else if (z2) {
                listC = kotlin.collections.a.c("60100");
            }
        } else {
            listC = z ? kotlin.collections.a.c("60200") : null;
        }
        lck lckVar = this.c;
        lckVar.getClass();
        kzh.d(new yzh(new g1i(r1i.a(ozh.c(hzh.a(new kck(str, null)), lckVar.a), this.a.e(str, z, z2, listC), this.b.a(false), new a(null, this, str)), new b(null, this, str)), new c(null)), o8i0.d(this));
    }
}
