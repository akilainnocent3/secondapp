package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventListPageDefaultSpecifier;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketAttribute;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventAdapter;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventSpinnerAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly4v;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y4v extends swl {
    public b5v B;
    public boolean C;
    public List<? extends Event> F;
    public List<? extends BaseNode> G;
    public List<? extends BaseNode> H;
    public n4p I;
    public i5s J;
    public uqm K;
    public jlo L;
    public rdd0 M;
    public wsm N;
    public JsonSerializeService O;
    public xvi f;
    public MatchEventAdapter v;
    public MatchEventSpinnerAdapter w;
    public final mpe0 i = hwr.b(new fsg(this, 1));
    public final mpe0 y = hwr.b(new Function0() { // from class: q4v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new v4v(this.a);
        }
    });
    public final mpe0 z = hwr.b(new Function0() { // from class: r4v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new t4v(this.a);
        }
    });
    public final mpe0 A = hwr.b(new s4v(this, 0));
    public final q8i0 D = new q8i0(jq40.a(z5v.class), new b(), new d(), new c());
    public final q8i0 E = new q8i0(jq40.a(vjo.class), new e(), new g(), new f());

    @c0d(c = "com.sportybet.android.instantwin.presentation.event.MatchEventOutcomeFragment$populateMatchEventOutcome$$inlined$collectWithLifecycle$default$1", f = "MatchEventOutcomeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ y4v b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ y4v d;

        /* JADX INFO: renamed from: y4v$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.event.MatchEventOutcomeFragment$populateMatchEventOutcome$$inlined$collectWithLifecycle$default$1$1", f = "MatchEventOutcomeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C1327a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ y4v d;

            /* JADX INFO: renamed from: y4v$a$a$a, reason: collision with other inner class name */
            public static final class C1328a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ y4v b;

                public C1328a(v5b v5bVar, y4v y4vVar) {
                    this.b = y4vVar;
                    this.a = v5bVar;
                }

                /* JADX WARN: Code duplicated, block: B:9:0x001b  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    Integer num;
                    ogo ogoVar = (ogo) t;
                    if (ogoVar != null) {
                        y4v y4vVar = this.b;
                        if (y4vVar.m0()) {
                            MatchEventSpinnerAdapter matchEventSpinnerAdapter = y4vVar.w;
                            if (matchEventSpinnerAdapter != null) {
                                num = new Integer(matchEventSpinnerAdapter.applyOddsFilter(ogoVar));
                            } else {
                                num = null;
                            }
                        } else {
                            MatchEventAdapter matchEventAdapter = y4vVar.v;
                            if (matchEventAdapter != null) {
                                num = new Integer(matchEventAdapter.applyOddsFilter(ogoVar));
                            } else {
                                num = null;
                            }
                        }
                        if (num != null) {
                            Integer num2 = num.intValue() >= 0 ? num : null;
                            if (num2 != null) {
                                int iIntValue = num2.intValue();
                                xvi xviVar = y4vVar.f;
                                if (xviVar != null) {
                                    xviVar.b.s0(iIntValue);
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1327a(lyh lyhVar, v1b v1bVar, y4v y4vVar) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = y4vVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1327a c1327a = new C1327a(this.c, v1bVar, this.d);
                c1327a.b = obj;
                return c1327a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1327a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1328a c1328a = new C1328a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c1328a, this) == y5bVar) {
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
        public a(y4v y4vVar, lyh lyhVar, v1b v1bVar, y4v y4vVar2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = y4vVar;
            this.c = lyhVar;
            this.d = y4vVar2;
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
                C1327a c1327a = new C1327a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c1327a, this) == y5bVar) {
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

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return y4v.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return y4v.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return y4v.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return y4v.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return y4v.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return y4v.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public y4v() {
        m2g m2gVar = m2g.a;
        this.F = m2gVar;
        this.G = m2gVar;
        this.H = m2gVar;
    }

    public final boolean m0() {
        MarketAttribute marketAttribute = n0().attributes;
        return marketAttribute != null && marketAttribute.hasSpanner;
    }

    public final MarketType n0() {
        Bundle arguments = getArguments();
        MarketType marketType = arguments != null ? (MarketType) ((Parcelable) rj5.a(arguments, "ARG_MARKET_TYPE", MarketType.class)) : null;
        marketType.getClass();
        return marketType;
    }

    public final z5v o0() {
        return (z5v) this.D.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.swl, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.B = context instanceof b5v ? (b5v) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_instant_win_match_event_outcome, viewGroup, false);
        if (viewInflate == null) {
            bmy.a("rootView");
            return null;
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        this.f = new xvi(recyclerView, recyclerView);
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.B = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        xvi xviVar = this.f;
        if (xviVar != null) {
            xviVar.b.k0((v4v) this.y.getValue());
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xvi xviVar = this.f;
        if (xviVar != null) {
            xviVar.b.k((v4v) this.y.getValue());
        }
        b5v b5vVar = this.B;
        if (b5vVar != null) {
            b5vVar.c1(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        view.getClass();
        super.onViewCreated(view, bundle);
        xvi xviVar = this.f;
        if (xviVar != null) {
            RecyclerView recyclerView = xviVar.b;
            recyclerView.setLayoutManager((LinearLayoutManager) this.i.getValue());
            if (m0()) {
                MatchEventSpinnerAdapter matchEventSpinnerAdapter = new MatchEventSpinnerAdapter(p0());
                recyclerView.setAdapter(matchEventSpinnerAdapter);
                this.w = matchEventSpinnerAdapter;
            } else {
                MatchEventAdapter matchEventAdapter = new MatchEventAdapter();
                recyclerView.setAdapter(matchEventAdapter);
                this.v = matchEventAdapter;
            }
        }
        r0();
    }

    public final tlo p0() {
        n4p n4pVar = this.I;
        if (n4pVar != null) {
            return n4pVar;
        }
        Intrinsics.n("sharedData");
        throw null;
    }

    public final void q0(bs3 bs3Var) {
        rdd0 rdd0Var = this.M;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        rdd0Var.a(new a5o.j(((n4p) p0()).c()), k00.d);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        if (this.J == null) {
            Intrinsics.n("legacyInstantWinUtil");
            throw null;
        }
        uqm uqmVar = this.K;
        if (uqmVar != null) {
            i5s.c(uqmVar, activity, new x4v(this, activity, bs3Var), false);
        } else {
            Intrinsics.n("accountHelper");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Type inference failed for: r4v5, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
    public final void r0() throws Throwable {
        Throwable th;
        Market marketE;
        int iZ1;
        int iZ2;
        Float fB;
        Float fB2;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        String ou_incl_ot;
        z5v z5vVarO0 = o0();
        String str5 = n0().type;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        this.F = z5vVarO0.y1(str5);
        z5v z5vVarO1 = o0();
        List<? extends Event> list = this.F;
        boolean zIsVisible = isVisible();
        wwd0 wwd0Var = z5vVarO1.e0;
        int i5 = 0;
        if (zIsVisible) {
            if (list == null || list.isEmpty()) {
                wwd0Var.setValue(n1a0.c);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Iterable iterable = ((Event) it.next()).markets;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    p48.w(iterable, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    Iterable iterable2 = ((Market) obj).outcomes;
                    if (iterable2 == null) {
                        iterable2 = m2g.a;
                    }
                    p48.w(iterable2, arrayList2);
                }
                wwd0Var.setValue(a4h.b(arrayList2));
            }
        }
        Throwable th2 = null;
        if (m0()) {
            ArrayList arrayList3 = new ArrayList();
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            q8i0 q8i0Var = this.E;
            vjo vjoVar = (vjo) q8i0Var.getValue();
            MarketType marketTypeN0 = n0();
            eo20[] eo20VarArr = eo20.a;
            String strA = inm.a("universal_specifiers_", marketTypeN0.type);
            try {
                str = (String) dj5.a(kotlin.coroutines.e.a, new sjo(vjoVar, strA, null));
            } catch (Exception e2) {
                itf0.a aVar = itf0.a;
                aVar.q(strA);
                aVar.a(inm.a("Error fetching local data: ", e2.getLocalizedMessage()), new Object[0]);
                str = "";
            }
            int length = str.length();
            String str7 = str;
            if (length == 0) {
                MarketType marketTypeN1 = n0();
                tlo tloVarP0 = p0();
                BigDecimal bigDecimal = sqo.a;
                EventListPageDefaultSpecifier eventListPageDefaultSpecifier = ((n4p) tloVarP0).F;
                String str8 = marketTypeN1.type;
                if (str8 != null && eventListPageDefaultSpecifier != null) {
                    switch (str8) {
                        case "ou_incl_ot":
                            ou_incl_ot = eventListPageDefaultSpecifier.getOu_incl_ot();
                            break;
                        case "hd":
                            ou_incl_ot = eventListPageDefaultSpecifier.getHd();
                            break;
                        case "ou":
                            ou_incl_ot = eventListPageDefaultSpecifier.getOu();
                            break;
                        case "aou_incl_ot":
                            ou_incl_ot = eventListPageDefaultSpecifier.getAou_incl_ot();
                            break;
                        case "hd_incl_ot":
                            ou_incl_ot = eventListPageDefaultSpecifier.getHd_incl_ot();
                            break;
                        case "hou_incl_ot":
                            ou_incl_ot = eventListPageDefaultSpecifier.getHou_incl_ot();
                            break;
                        case "wnou_incl_ot":
                            ou_incl_ot = eventListPageDefaultSpecifier.getWnou_incl_ot();
                            break;
                        default:
                            ou_incl_ot = "";
                            break;
                    }
                } else {
                    ou_incl_ot = "";
                }
                ou_incl_ot.getClass();
                str7 = ou_incl_ot;
            }
            Iterator it2 = o0().V.iterator();
            Object obj2 = str7;
            while (it2.hasNext()) {
                League league = (League) it2.next();
                String str9 = league.leagueId;
                if (str9 == null) {
                    str9 = str6;
                }
                List listF = sqo.f(n0().bannerTitles);
                String str10 = league.iconUrl;
                if (str10 == null) {
                    str10 = str6;
                }
                String str11 = league.name;
                if (str11 == null) {
                    str11 = str6;
                }
                if (listF == null) {
                    listF = m2g.a;
                }
                p2s p2sVar = new p2s(str10, str11, str9, listF);
                Object obj3 = obj2;
                for (Event event : this.F) {
                    ArrayList arrayList4 = new ArrayList();
                    Throwable th3 = th2;
                    ArrayList arrayList5 = new ArrayList();
                    List<Market> list2 = event.markets;
                    if (list2 != null) {
                        int i7 = i5;
                        float f2 = Float.MIN_VALUE;
                        int i8 = -1;
                        int i9 = -1;
                        i3 = -1;
                        float f3 = Float.MAX_VALUE;
                        for (Object obj4 : list2) {
                            int i10 = i7 + 1;
                            if (i7 < 0) {
                                kotlin.collections.b.q();
                                throw th3;
                            }
                            Market market = (Market) obj4;
                            int i11 = i5;
                            arrayList4.add(sqo.c(event.eventId, market, p0()));
                            String str12 = market.subTitle;
                            try {
                                String[] strArrSplit = str12.split(";");
                                str3 = str6;
                                try {
                                    str4 = strArrSplit.length > 0 ? strArrSplit[i11] : str3;
                                } catch (Exception e3) {
                                    e = e3;
                                    itf0.a aVar2 = itf0.a;
                                    aVar2.q(str12);
                                    aVar2.b(e);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str3 = str6;
                            }
                            str4.getClass();
                            arrayList5.add(str4);
                            float maxOddsDiff = market.getMaxOddsDiff();
                            if (maxOddsDiff < f3) {
                                f3 = maxOddsDiff;
                                i8 = i7;
                            }
                            if (maxOddsDiff > f2) {
                                f2 = maxOddsDiff;
                                i9 = i7;
                            }
                            if (((CharSequence) obj3).length() != 0 && Intrinsics.g(obj3, str4)) {
                                i3 = i7;
                            }
                            i7 = i10;
                            i5 = i11;
                            str6 = str3;
                        }
                        str2 = str6;
                        i = i8;
                        i2 = i9;
                    } else {
                        str2 = str6;
                        i = -1;
                        i2 = -1;
                        i3 = -1;
                    }
                    int i12 = i5;
                    if (str9.equalsIgnoreCase(event.leagueId) && !arrayList4.isEmpty()) {
                        linkedHashSet.addAll(arrayList5);
                        if (((CharSequence) obj3).length() == 0) {
                            MarketAttribute marketAttribute = n0().attributes;
                            int i13 = marketAttribute != null ? marketAttribute.spannerIndex : i12;
                            i4 = i12;
                            while (true) {
                                if (i4 < arrayList4.size()) {
                                    Iterator it3 = ((spu) arrayList4.get(i4)).f.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            int i14 = i13;
                                            if (!((h8z) it3.next()).f) {
                                                i13 = i14;
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                } else {
                                    i4 = i13;
                                }
                            }
                            obj3 = (i4 < 0 || i4 >= arrayList5.size()) ? arrayList5.isEmpty() ? str2 : (String) arrayList5.get(i12) : arrayList5.get(i4);
                        } else if (Intrinsics.g(obj3, "near")) {
                            i4 = i;
                            obj3 = obj3;
                        } else if (Intrinsics.g(obj3, "far")) {
                            i4 = i2;
                            obj3 = obj3;
                        } else {
                            i4 = i3;
                            obj3 = obj3;
                        }
                        String str13 = event.eventId;
                        float[] fArr = event.teamStrengthPercentage;
                        if (fArr != null && ay0.B(fArr, 0) != null) {
                            o0();
                        }
                        float[] fArr2 = event.teamStrengthPercentage;
                        if (fArr2 != null && ay0.B(fArr2, 1) != null) {
                            o0();
                        }
                        u4v u4vVar = (u4v) this.A.getValue();
                        crg crgVar = new crg();
                        crgVar.a = str13;
                        crgVar.b = arrayList4;
                        crgVar.c = arrayList5;
                        crgVar.d = i4;
                        crgVar.e = i;
                        crgVar.f = i2;
                        crgVar.g = u4vVar;
                        p2sVar.e.add(crgVar);
                    }
                    th2 = th3;
                    q8i0Var = q8i0Var;
                    it2 = it2;
                    str6 = str2;
                    i5 = 0;
                    obj3 = obj3;
                }
                arrayList3.add(p2sVar);
                obj2 = obj3;
                i5 = 0;
            }
            th = th2;
            q8i0 q8i0Var2 = q8i0Var;
            String str14 = (String) obj2;
            this.H = arrayList3;
            MatchEventSpinnerAdapter matchEventSpinnerAdapter = this.w;
            if (matchEventSpinnerAdapter != null) {
                matchEventSpinnerAdapter.setMarketSpecifierData(n0(), str14, linkedHashSet, arrayList3, o0().F.Z0().getValue(), (vjo) q8i0Var2.getValue());
            }
        } else {
            th = null;
            ArrayList arrayList6 = new ArrayList();
            for (League league2 : o0().V) {
                String str15 = league2.leagueId;
                if (str15 == null) {
                    str15 = "";
                }
                String str16 = n0().bannerTitles;
                String str17 = league2.iconUrl;
                if (str17 == null) {
                    str17 = "";
                }
                String str18 = league2.name;
                if (str18 == null) {
                    str18 = "";
                }
                List listF2 = sqo.f(str16);
                if (listF2 == null) {
                    listF2 = m2g.a;
                }
                p2s p2sVar2 = new p2s(str17, str18, str15, listF2);
                for (Event event2 : this.F) {
                    if (kotlin.text.c.l(event2.leagueId, str15, true) && (marketE = sqo.e(event2, n0())) != null) {
                        String strC = ((n4p) p0()).c();
                        String str19 = event2.leagueId;
                        String str20 = event2.eventId;
                        String str21 = event2.homeTeamName;
                        String str22 = event2.homeTeamLogo;
                        float[] fArr3 = event2.teamStrengthPercentage;
                        if (fArr3 == null || (fB2 = ay0.B(fArr3, 0)) == null) {
                            iZ1 = 0;
                        } else {
                            float fFloatValue = fB2.floatValue();
                            o0();
                            iZ1 = z5v.z1(fFloatValue);
                        }
                        String str23 = event2.awayTeamName;
                        String str24 = event2.awayTeamLogo;
                        float[] fArr4 = event2.teamStrengthPercentage;
                        if (fArr4 == null || (fB = ay0.B(fArr4, 1)) == null) {
                            iZ2 = 0;
                        } else {
                            float fFloatValue2 = fB.floatValue();
                            o0();
                            iZ2 = z5v.z1(fFloatValue2);
                        }
                        p2sVar2.e.add(new mpg(strC, str19, str20, str21, str22, iZ1, str23, str24, iZ2, event2.marketCount, sqo.c(event2.eventId, marketE, p0()), false, (t4v) this.z.getValue()));
                    }
                }
                arrayList6.add(p2sVar2);
            }
            this.G = arrayList6;
            MatchEventAdapter matchEventAdapter = this.v;
            if (matchEventAdapter != null) {
                matchEventAdapter.setNewData(arrayList6, o0().F.Z0().getValue());
            }
        }
        uwd0<ogo> uwd0VarZ0 = o0().F.Z0();
        s9s.b bVar = s9s.b.a;
        ?? r4 = th;
        ej5.c(ebs.a(getLifecycle()), r4, r4, new a(this, uwd0VarZ0, r4, this), 3);
    }

    public final LinearLayoutManager.SavedState s0() {
        return (LinearLayoutManager.SavedState) ((LinearLayoutManager) this.i.getValue()).w0();
    }

    public final void t0(bs3 bs3Var, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        BigDecimal bigDecimal = sqo.a;
        String strB = sqo.b(bs3Var.a, bs3Var.b, bs3Var.c);
        String str = bs3Var.a;
        int i = bs3Var.d;
        mpg mpgVar = null;
        crgVar = null;
        crg crgVar = null;
        mpgVar = null;
        int i2 = 0;
        if (!m0()) {
            List<? extends BaseNode> list = this.G;
            if (list != null) {
                loop3: for (BaseNode baseNode : list) {
                    if ((baseNode instanceof p2s) && (arrayList = ((p2s) baseNode).e) != null) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            BaseNode baseNode2 = (BaseNode) obj;
                            if (baseNode2 instanceof mpg) {
                                mpg mpgVar2 = (mpg) baseNode2;
                                if (TextUtils.equals(mpgVar2.c, str)) {
                                    mpgVar = mpgVar2;
                                    break loop3;
                                }
                            }
                        }
                    }
                }
            }
            if (mpgVar != null) {
                h8z h8zVar = (h8z) mpgVar.k.f.get(strB);
                if (h8zVar != null) {
                    h8zVar.f = z;
                }
                MatchEventAdapter matchEventAdapter = this.v;
                if (matchEventAdapter != null) {
                    matchEventAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            return;
        }
        List<? extends BaseNode> list2 = this.H;
        if (list2 != null) {
            loop0: for (BaseNode baseNode3 : list2) {
                if ((baseNode3 instanceof p2s) && (arrayList2 = ((p2s) baseNode3).e) != null) {
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        BaseNode baseNode4 = (BaseNode) obj2;
                        if (baseNode4 instanceof crg) {
                            crg crgVar2 = (crg) baseNode4;
                            if (TextUtils.equals(crgVar2.a, str)) {
                                crgVar = crgVar2;
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (crgVar != null) {
            crgVar.d = i;
            ArrayList arrayList3 = crgVar.b;
            arrayList3.getClass();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                h8z h8zVar2 = (h8z) ((spu) obj3).f.get(strB);
                if (h8zVar2 != null) {
                    h8zVar2.f = z;
                }
            }
            MatchEventSpinnerAdapter matchEventSpinnerAdapter = this.w;
            if (matchEventSpinnerAdapter != null) {
                matchEventSpinnerAdapter.notifyDataSetChanged();
            }
        }
    }
}
