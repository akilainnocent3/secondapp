package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.live.data.FilterOrigin;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Luqs;", "Lu22;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uqs extends u22 {
    public final h940 G;
    public final ui30 H;
    public final uqm I;
    public final lq1 J;
    public final f1p K;
    public final hkf L;
    public final FilterOrigin M;
    public final mpe0 N;
    public final wwd0 O;
    public final v340 P;
    public final wwd0 Q;
    public final v340 R;
    public final sqs S;
    public final tqs T;
    public final b390 U;
    public final b390 V;
    public final ssw<lk50<Unit>> W;
    public final ssw X;
    public final ssw<lk50<List<ing>>> Y;
    public final ssw Z;
    public final ssw a0;
    public final LinkedHashMap b0;
    public final LinkedHashMap c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public RegularMarketRule f0;
    public jvd0 g0;
    public jvd0 h0;
    public RegularMarketRule i0;
    public final LinkedHashMap j0;
    public Long k0;
    public final long l0;

    public static final class a implements lyh<lk50<? extends Unit>> {
        public final /* synthetic */ s78 a;

        /* JADX INFO: renamed from: uqs$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$$inlined$map$1", f = "LivePageViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1177a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1177a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: uqs$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$$inlined$map$1$2", f = "LivePageViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1178a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1178a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1178a c1178a;
                if (v1bVar instanceof C1178a) {
                    c1178a = (C1178a) v1bVar;
                    int i = c1178a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1178a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1178a = new C1178a(v1bVar);
                    }
                } else {
                    c1178a = new C1178a(v1bVar);
                }
                Object obj2 = c1178a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1178a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50.c cVar = new lk50.c((Unit) obj);
                    c1178a.b = 1;
                    if (this.a.emit(cVar, c1178a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(s78 s78Var) {
            this.a = s78Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends Unit>> myhVar, v1b v1bVar) {
            C1177a c1177a;
            if (v1bVar instanceof C1177a) {
                c1177a = (C1177a) v1bVar;
                int i = c1177a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1177a.b = i - Integer.MIN_VALUE;
                } else {
                    c1177a = new C1177a(v1bVar);
                }
            } else {
                c1177a = new C1177a(v1bVar);
            }
            Object obj = c1177a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1177a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1177a.b = 1;
                if (this.a.collect(bVar, c1177a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$1", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<BaseResponse<List<? extends Sport>>, BaseResponse<List<? extends Sport>>, v1b<? super Unit>, Object> {
        public /* synthetic */ BaseResponse a;
        public /* synthetic */ BaseResponse b;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(BaseResponse<List<? extends Sport>> baseResponse, BaseResponse<List<? extends Sport>> baseResponse2, v1b<? super Unit> v1bVar) {
            b bVar = uqs.this.new b(v1bVar);
            bVar.a = baseResponse;
            bVar.b = baseResponse2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uqs uqsVar;
            BaseResponse baseResponse = this.a;
            BaseResponse baseResponse2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayListF = lfb0.d().f((List) baseResponse.data);
            int size = arrayListF.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                uqsVar = uqs.this;
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayListF.get(i2);
                i2++;
                Sport sport = (Sport) obj2;
                uqsVar.b0.put(sport.id, new Integer(sport.eventSize));
            }
            ArrayList arrayListF2 = lfb0.d().f((List) baseResponse2.data);
            int size2 = arrayListF2.size();
            while (i < size2) {
                Object obj3 = arrayListF2.get(i);
                i++;
                Sport sport2 = (Sport) obj3;
                uqsVar.c0.put(sport2.id, new Integer(sport2.eventSize));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$3", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super lk50<? extends Unit>>, v1b<? super Unit>, Object> {
        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uqs.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uqs.this.W.m(lk50.b.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$4", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = uqs.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
            return ((d) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<Unit> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uqs.this.W.m(lk50Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getSports$5", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public e(v1b<? super e> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            e eVar = uqs.this.new e(v1bVar);
            eVar.a = th;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uqs.this.W.m(new lk50.a(th));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v8, types: [sqs] */
    /* JADX WARN: Type inference failed for: r1v9, types: [tqs] */
    public uqs(vu60 vu60Var, m2l m2lVar, h940 h940Var, ui30 ui30Var, uqm uqmVar, lq1 lq1Var, f1p f1pVar, hkf hkfVar, v5k v5kVar) {
        super(m2lVar, v5kVar, f1pVar);
        vu60Var.getClass();
        m2lVar.getClass();
        h940Var.getClass();
        uqmVar.getClass();
        lq1Var.getClass();
        this.G = h940Var;
        this.H = ui30Var;
        this.I = uqmVar;
        this.J = lq1Var;
        this.K = f1pVar;
        this.L = hkfVar;
        this.M = (FilterOrigin) vu60Var.b("key_live_tab_filter_origin");
        this.N = hwr.b(new rqs());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        wwd0 wwd0VarA = xwd0.a(bigDecimal);
        this.O = wwd0VarA;
        this.P = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(bigDecimal);
        this.Q = wwd0VarA2;
        this.R = e1i.b(wwd0VarA2);
        this.S = new Subscriber() { // from class: sqs
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SPORT_LIST, "on receive live sport list message: ", str), new Object[0]);
                str.getClass();
                uqs uqsVar = this.a;
                LinkedHashMap linkedHashMapI1 = uqsVar.I1(str);
                LinkedHashMap linkedHashMap = uqsVar.b0;
                for (String str2 : linkedHashMap.keySet()) {
                    mfb0 mfb0Var = uqsVar.B;
                    if (!Intrinsics.g(str2, mfb0Var != null ? mfb0Var.getId() : null)) {
                        Sport sport = (Sport) linkedHashMapI1.get(str2);
                        linkedHashMap.put(str2, Integer.valueOf(sport != null ? sport.eventSize : 0));
                    }
                }
                uqsVar.D1();
            }
        };
        this.T = new Subscriber() { // from class: tqs
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SPORT_LIST, "on receive upcoming sport list message: ", str), new Object[0]);
                str.getClass();
                uqs uqsVar = this.a;
                LinkedHashMap linkedHashMapI1 = uqsVar.I1(str);
                LinkedHashMap linkedHashMap = uqsVar.c0;
                for (String str2 : linkedHashMap.keySet()) {
                    mfb0 mfb0Var = uqsVar.B;
                    if (!Intrinsics.g(str2, mfb0Var != null ? mfb0Var.getId() : null)) {
                        Sport sport = (Sport) linkedHashMapI1.get(str2);
                        linkedHashMap.put(str2, Integer.valueOf(sport != null ? sport.eventSize : 0));
                    }
                }
                uqsVar.D1();
            }
        };
        b390 b390VarA = d390.a(Reader.READ_DONE, Reader.READ_DONE, pb5.b);
        this.U = b390VarA;
        this.V = b390VarA;
        ssw<lk50<Unit>> sswVar = new ssw<>();
        this.W = sswVar;
        this.X = sswVar;
        ssw<lk50<List<ing>>> sswVar2 = new ssw<>();
        this.Y = sswVar2;
        this.Z = sswVar2;
        this.a0 = new ssw();
        this.b0 = new LinkedHashMap();
        this.c0 = new LinkedHashMap();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.j0 = new LinkedHashMap();
        this.l0 = 30000L;
    }

    @Override // defpackage.u22
    public final lyh A1(String str) {
        str.getClass();
        return this.G.m(str);
    }

    public final void D1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            OrderedSportItem orderedSportItemF1 = F1((mfb0) obj);
            if (orderedSportItemF1 != null) {
                arrayList.add(orderedSportItemF1);
            }
        }
        this.U.a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ing> E1() {
        String str;
        ssw sswVar = this.Z;
        if (!(sswVar.d() instanceof lk50.c)) {
            return m2g.a;
        }
        T tD = sswVar.d();
        tD.getClass();
        Iterable iterable = (Iterable) ((lk50.c) tD).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            ing ingVar = (ing) obj;
            if (H1()) {
                RegularMarketRule regularMarketRule = this.i0;
                if (regularMarketRule != null && (str = regularMarketRule.a) != null) {
                    BigDecimal bigDecimal = (BigDecimal) this.P.a.getValue();
                    BigDecimal bigDecimal2 = (BigDecimal) this.R.a.getValue();
                    for (Market market : !ingVar.w.isEmpty() ? ingVar.w : ingVar.a.markets) {
                        if (Objects.equals(market.id, str) && market.status == 0 && market.hasAnyOutcomeInOddsRange(bigDecimal, bigDecimal2)) {
                            Event event = ingVar.a;
                            List<Market> list = ingVar.w;
                            ArrayList arrayListA = kw5.a(list);
                            for (Object obj2 : list) {
                                Market market2 = (Market) obj2;
                                if (Intrinsics.g(market2.id, str) && market2.status == 0) {
                                    arrayListA.add(obj2);
                                }
                            }
                            event.markets = arrayListA;
                        }
                    }
                }
            } else {
                ingVar.a.markets = ingVar.w;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final OrderedSportItem F1(mfb0 mfb0Var) {
        FilterOrigin filterOrigin;
        boolean zContains;
        List<String> sportIdWhitelist;
        String id = mfb0Var.getId();
        id.getClass();
        Integer num = (Integer) this.b0.get(id);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) this.c0.get(id);
        if ((num2 != null ? num2.intValue() : 0) + iIntValue > 0) {
            filterOrigin = this.M;
            if (filterOrigin != null || (sportIdWhitelist = filterOrigin.getSportIdWhitelist()) == null) {
                zContains = true;
            } else {
                zContains = sportIdWhitelist.contains(id);
            }
            if (zContains) {
                return new OrderedSportItem(id, mfb0Var.c(), iIntValue);
            }
        } else {
            mfb0 mfb0Var2 = this.B;
            if (id.equals(mfb0Var2 != null ? mfb0Var2.getId() : null)) {
                filterOrigin = this.M;
                if (filterOrigin != null) {
                    zContains = true;
                } else {
                    zContains = true;
                }
                if (zContains) {
                    return new OrderedSportItem(id, mfb0Var.c(), iIntValue);
                }
            }
        }
        return null;
    }

    public final void G1() {
        jvd0 jvd0Var = this.g0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h940 h940Var = this.G;
        this.g0 = kzh.d(new yzh(new g1i(new xzh(new a(new s78(h940Var.j(), h940Var.z("1"), new b(null))), new c(null)), new d(null)), new e(null)), o8i0.d(this));
    }

    public final boolean H1() {
        Object value = this.O.getValue();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return (Intrinsics.g(value, bigDecimal) || Intrinsics.g(this.Q.getValue(), bigDecimal)) ? false : true;
    }

    public final LinkedHashMap I1(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Sport sport = (Sport) ((JsonSerializeService) this.N.getValue()).fromJson(jSONArray.getString(i), Sport.class);
            String str2 = sport.id;
            str2.getClass();
            linkedHashMap.put(str2, sport);
        }
        return linkedHashMap;
    }

    public final void J1() {
        SocketPushManager.getInstance().subscribeTopic(new GroupTopic("live^sports"), this.S);
        SocketPushManager.getInstance().subscribeTopic(new GroupTopic("prematch^sports"), this.T);
    }

    public final void K1() {
        SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic("live^sports"), this.S);
        SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic("prematch^sports"), this.T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ing> L1() {
        ssw sswVar = this.Z;
        if (!(sswVar.d() instanceof lk50.c)) {
            return m2g.a;
        }
        T tD = sswVar.d();
        tD.getClass();
        return (List) ((lk50.c) tD).a;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        QuickMarketHelper.disposeAll();
    }

    @Override // defpackage.u22
    public final void x1() throws Throwable {
        super.x1();
        this.U.h();
    }

    @Override // defpackage.u22
    public final lyh<BaseResponse<BoostInfo>> y1() {
        return this.G.b();
    }
}
