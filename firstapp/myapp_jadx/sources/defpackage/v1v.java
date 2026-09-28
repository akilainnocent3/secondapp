package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.Layout;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketAttribute;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.presentation.eventdetails.adapter.MatchEventDetailAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv1v;", "Lk12;", "Ldqu$b;", "Lj9j;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v1v extends rwl implements dqu.b, j9j {
    public String E;
    public String F;
    public Event G;
    public boolean I;
    public RecyclerView K;
    public n4p M;
    public u0v N;
    public final String B = xOgHBQVl.JzImPWnCyfc;
    public final HashMap<String, Boolean> C = new HashMap<>();
    public final MatchEventDetailAdapter D = new MatchEventDetailAdapter();
    public boolean H = true;
    public final ArrayList J = new ArrayList();
    public final q8i0 L = new q8i0(jq40.a(m3v.class), new d(), new f(), new e());

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailFragment$getData$$inlined$collectWithLifecycle$default$1", f = "MatchEventDetailFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v1v b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ v1v d;

        /* JADX INFO: renamed from: v1v$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailFragment$getData$$inlined$collectWithLifecycle$default$1$1", f = "MatchEventDetailFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C1197a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ v1v d;

            /* JADX INFO: renamed from: v1v$a$a$a, reason: collision with other inner class name */
            public static final class C1198a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ v1v b;

                public C1198a(v5b v5bVar, v1v v1vVar) {
                    this.b = v1vVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    ogo ogoVar = (ogo) t;
                    v1v v1vVar = this.b;
                    if (!v1vVar.I && ogoVar != null) {
                        Integer num = new Integer(v1vVar.D.applyOddsFilter(ogoVar));
                        if (num.intValue() < 0) {
                            num = null;
                        }
                        if (num != null) {
                            int iIntValue = num.intValue();
                            RecyclerView recyclerView = v1vVar.K;
                            if (recyclerView != null) {
                                recyclerView.s0(iIntValue);
                            }
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1197a(lyh lyhVar, v1b v1bVar, v1v v1vVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = v1vVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1197a c1197a = new C1197a(this.c, v1bVar, this.d);
                c1197a.b = obj;
                return c1197a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1197a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1198a c1198a = new C1198a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1198a, this) == y5bVar) {
                        return y5bVar;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1v v1vVar, lyh lyhVar, v1b v1bVar, v1v v1vVar2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = v1vVar;
            this.c = lyhVar;
            this.d = v1vVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C1197a c1197a = new C1197a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c1197a, this) == y5bVar) {
                    return y5bVar;
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b implements o0v {
        public final /* synthetic */ MatchEventDetailAdapter a;
        public final /* synthetic */ v1v b;

        public b(MatchEventDetailAdapter matchEventDetailAdapter, v1v v1vVar) {
            this.a = matchEventDetailAdapter;
            this.b = v1vVar;
        }

        @Override // defpackage.o0v
        public final void a(String str, boolean z) {
            str.getClass();
            this.a.setCollapsed(Boolean.valueOf(z), str);
            this.b.C.put(str, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c implements y1v {
        public c() {
        }

        @Override // defpackage.y1v
        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            ((m3v) v1v.this.L.getValue()).a.a.k(null, new ufo(str, str2));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return v1v.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return v1v.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return v1v.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // dqu.b
    public final void f(bs3 bs3Var) {
        bs3Var.getClass();
        LayoutInflater.Factory activity = getActivity();
        dqu.a aVar = activity instanceof dqu.a ? (dqu.a) activity : null;
        if (aVar != null) {
            Event event = this.G;
            if (event == null) {
                Intrinsics.n(AnalyticsEvent.BI_TRACKING_KIND_EVENT);
                throw null;
            }
            aVar.F0(bs3Var, event, this.J);
        }
        this.D.notifyDataSetChanged();
    }

    @Override // dqu.b
    public final void g(bs3 bs3Var) {
        bs3Var.getClass();
        LayoutInflater.Factory activity = getActivity();
        dqu.a aVar = activity instanceof dqu.a ? (dqu.a) activity : null;
        if (aVar != null) {
            if (this.G == null) {
                Intrinsics.n(AnalyticsEvent.BI_TRACKING_KIND_EVENT);
                throw null;
            }
            aVar.z0(bs3Var, this.J);
        }
        this.D.notifyDataSetChanged();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.B;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("extra_event_id");
            string.getClass();
            this.E = string;
            String string2 = arguments.getString("extra_category_id");
            string2.getClass();
            this.F = string2;
            this.I = arguments.getBoolean("extra_from_bet_builder");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.iwqk_layout_event_details, viewGroup, false);
        this.K = (RecyclerView) viewInflate.findViewById(R.id.iv_match_event_list);
        o oVar = new o(requireContext());
        oVar.a = new ColorDrawable(requireContext().getColor(R.color.line_type1_primary));
        RecyclerView recyclerView = this.K;
        if (recyclerView != null) {
            recyclerView.i(oVar);
        }
        MatchEventDetailAdapter matchEventDetailAdapter = this.D;
        matchEventDetailAdapter.setMatchEventDetailCollapseListener(new b(matchEventDetailAdapter, this));
        matchEventDetailAdapter.setMatchEventDetailMarketInfoClickListener(new c());
        RecyclerView recyclerView2 = this.K;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(matchEventDetailAdapter);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.H) {
            p0();
        }
        this.H = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        p0();
    }

    public final void p0() {
        String str = this.F;
        if (str == null || str.length() == 0) {
            return;
        }
        u0v u0vVar = this.N;
        if (u0vVar == null) {
            Intrinsics.n("matchEventDetailDataSource");
            throw null;
        }
        String str2 = this.F;
        if (str2 == null) {
            Intrinsics.n("categoryId");
            throw null;
        }
        EventData eventDataF = u0vVar.f(str2);
        if (eventDataF != null) {
            Event event = eventDataF.events.get(0);
            event.getClass();
            Event event2 = event;
            this.G = event2;
            q0(event2.markets);
        }
        uwd0<ogo> uwd0VarZ0 = ((m3v) this.L.getValue()).w.Z0();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, uwd0VarZ0, null, this), 3);
    }

    public final void q0(List<? extends Market> list) throws Throwable {
        String str;
        Iterator it;
        Throwable th;
        spu spuVarC;
        Layout layout;
        i5s i5sVar;
        String str2;
        BetBuilderOutcome betBuilderOutcome;
        String str3;
        String str4;
        boolean z;
        BetBuilderConfig betBuilderConfig;
        String str5 = this.E;
        String str6 = AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID;
        if (str5 == null) {
            Intrinsics.n(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID);
            throw null;
        }
        if (TextUtils.isEmpty(str5) || list == null || list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = this.J;
        arrayList.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Market market = (Market) it2.next();
            if (this.I) {
                i5s i5sVar2 = this.i;
                if (i5sVar2 == null) {
                    Intrinsics.n("legacyInstantWinUtil");
                    throw null;
                }
                u0v u0vVar = this.N;
                if (u0vVar == null) {
                    Intrinsics.n("matchEventDetailDataSource");
                    throw null;
                }
                BetBuilderOutcome betBuilderOutcome2 = u0vVar.h;
                String str7 = this.E;
                if (str7 == null) {
                    Intrinsics.n(str6);
                    throw null;
                }
                betBuilderOutcome2.getClass();
                market.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Outcome outcome : market.outcomes) {
                    String strB = sqo.b(str7, market.marketId, outcome.outcomeId);
                    String str8 = str6;
                    Iterator it3 = it2;
                    BetBuilderRequest betBuilderRequest = new BetBuilderRequest(market.marketId, outcome.outcomeId, outcome.mutexLookupKey);
                    boolean zContains = betBuilderOutcome2.originalData.contains(betBuilderRequest);
                    String str9 = outcome.outcomeId;
                    String str10 = outcome.odds;
                    String str11 = outcome.desc;
                    if (zContains) {
                        i5sVar = i5sVar2;
                        str2 = str9;
                    } else {
                        str2 = str9;
                        x4s x4sVar = i5sVar2.d;
                        x4sVar.getClass();
                        i5sVar = i5sVar2;
                        List<BetBuilderRequest> list2 = betBuilderOutcome2.originalData;
                        if (list2 != null && !list2.isEmpty() && (betBuilderConfig = x4sVar.b.i) != null) {
                            HashMap<String, List<Integer>> mutexMapping = betBuilderConfig.getMutexMapping();
                            List<Integer> list3 = mutexMapping.get(betBuilderRequest.lookupKey);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<BetBuilderRequest> it4 = list2.iterator();
                            ArrayList arrayListC0 = arrayList2;
                            while (true) {
                                if (it4.hasNext()) {
                                    betBuilderOutcome = betBuilderOutcome2;
                                    BetBuilderRequest next = it4.next();
                                    str3 = str10;
                                    str4 = str11;
                                    if (!TextUtils.equals(next.marketId, betBuilderRequest.marketId)) {
                                        List<Integer> list4 = mutexMapping.get(next.lookupKey);
                                        List listA = x4s.a(list3, list4);
                                        if (!listA.isEmpty() && !x4s.b(list4, listA) && !x4s.b(list3, listA)) {
                                            if (arrayListC0.isEmpty()) {
                                                ArrayList arrayList3 = arrayListC0;
                                                if (list4 != null) {
                                                    arrayList3.addAll(list4);
                                                }
                                                arrayListC0 = arrayList3;
                                            } else {
                                                arrayListC0 = CollectionsKt.C0(x4s.a(arrayListC0, list4));
                                            }
                                            betBuilderOutcome2 = betBuilderOutcome;
                                            str10 = str3;
                                            str11 = str4;
                                        }
                                    }
                                } else {
                                    betBuilderOutcome = betBuilderOutcome2;
                                    str3 = str10;
                                    str4 = str11;
                                    ArrayList arrayList4 = arrayListC0;
                                    List listA2 = x4s.a(arrayList4, list3);
                                    if (listA2.isEmpty() || x4s.b(arrayList4, listA2) || x4s.b(list3, listA2)) {
                                    }
                                    linkedHashMap3.put(strB, new h8z(str2, str3, str4, z, outcome.enable, zContains, outcome.probability));
                                    i5sVar2 = i5sVar;
                                    betBuilderOutcome2 = betBuilderOutcome;
                                    str6 = str8;
                                    it2 = it3;
                                }
                                z = true;
                                linkedHashMap3.put(strB, new h8z(str2, str3, str4, z, outcome.enable, zContains, outcome.probability));
                                i5sVar2 = i5sVar;
                                betBuilderOutcome2 = betBuilderOutcome;
                                str6 = str8;
                                it2 = it3;
                            }
                        }
                        z = false;
                        linkedHashMap3.put(strB, new h8z(str2, str3, str4, z, outcome.enable, zContains, outcome.probability));
                        i5sVar2 = i5sVar;
                        betBuilderOutcome2 = betBuilderOutcome;
                        str6 = str8;
                        it2 = it3;
                    }
                    betBuilderOutcome = betBuilderOutcome2;
                    str3 = str10;
                    str4 = str11;
                    z = false;
                    linkedHashMap3.put(strB, new h8z(str2, str3, str4, z, outcome.enable, zContains, outcome.probability));
                    i5sVar2 = i5sVar;
                    betBuilderOutcome2 = betBuilderOutcome;
                    str6 = str8;
                    it2 = it3;
                }
                str = str6;
                it = it2;
                th = null;
                spuVarC = new spu(market.marketId, market.type, market.attributes, market.title, market.subTitle, linkedHashMap3, market.guide);
            } else {
                str = str6;
                it = it2;
                th = null;
                String str12 = this.E;
                if (str12 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                n4p n4pVar = this.M;
                if (n4pVar == null) {
                    Intrinsics.n("sharedData");
                    throw null;
                }
                spuVarC = sqo.c(str12, market, n4pVar);
            }
            MarketAttribute marketAttribute = market.attributes;
            HashMap<String, Boolean> map = this.C;
            if (marketAttribute != null && marketAttribute.combo) {
                String str13 = market.type;
                Object objA = linkedHashMap.get(str13);
                if (objA == null) {
                    objA = r9i.a(str13, linkedHashMap);
                }
                List<spu> list5 = (List) objA;
                String str14 = market.type;
                Object obj = linkedHashMap2.get(str14);
                if (obj == null) {
                    String str15 = this.E;
                    if (str15 == null) {
                        Intrinsics.n(str);
                        throw th;
                    }
                    String str16 = market.type;
                    dqu dquVar = new dqu(str15, 1, str16, spuVarC, this);
                    if (map.containsKey(str16)) {
                        Boolean bool = map.get(str16);
                        bool.getClass();
                        dquVar.i = bool;
                    }
                    arrayList.add(dquVar);
                    linkedHashMap2.put(str14, dquVar);
                    obj = dquVar;
                }
                list5.add(spuVarC);
                ((dqu) obj).e = list5;
            } else if (Intrinsics.g((marketAttribute == null || (layout = marketAttribute.layout) == null) ? th : layout.mode, "ib_hd_ot")) {
                String str17 = market.type;
                Object objA2 = linkedHashMap.get(str17);
                if (objA2 == null) {
                    objA2 = r9i.a(str17, linkedHashMap);
                }
                List<spu> list6 = (List) objA2;
                String str18 = market.type;
                Object obj2 = linkedHashMap2.get(str18);
                if (obj2 == null) {
                    String str19 = this.E;
                    if (str19 == null) {
                        Intrinsics.n(str);
                        throw th;
                    }
                    String str20 = market.type;
                    dqu dquVar2 = new dqu(str19, 4, str20, spuVarC, this);
                    if (map.containsKey(str20)) {
                        Boolean bool2 = map.get(str20);
                        bool2.getClass();
                        dquVar2.i = bool2;
                    }
                    arrayList.add(dquVar2);
                    linkedHashMap2.put(str18, dquVar2);
                    obj2 = dquVar2;
                }
                list6.add(spuVarC);
                ((dqu) obj2).e = list6;
            } else {
                int i = TextUtils.equals("slider", spuVarC.c.layout.mode) ? 3 : spuVarC.f.values().size() > 3 ? 2 : 0;
                String str21 = this.E;
                if (str21 == null) {
                    Intrinsics.n(str);
                    throw th;
                }
                String str22 = market.type;
                dqu dquVar3 = new dqu(str21, i, str22, spuVarC, this);
                if (map.containsKey(str22)) {
                    Boolean bool3 = map.get(str22);
                    bool3.getClass();
                    dquVar3.i = bool3;
                }
                arrayList.add(dquVar3);
            }
            str6 = str;
            it2 = it;
        }
        this.D.setNewData(arrayList, !this.I ? ((m3v) this.L.getValue()).w.Z0().getValue() : null);
    }
}
