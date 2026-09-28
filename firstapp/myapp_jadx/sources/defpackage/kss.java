package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfo;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkss;", "Lk12;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kss extends yul {
    public long B;
    public awi C;
    public final rss D;
    public Map<Integer, ? extends List<? extends ess>> E;
    public lss F;
    public boolean G;
    public final zrs H;
    public final mdc0 I;
    public final q8i0 J;
    public jlo K;
    public n4p L;
    public w9c0 M;
    public rdd0 N;
    public cmo O;
    public n0f P;

    public static final class a extends qlr implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return kss.this;
        }
    }

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? kss.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public kss() {
        rss rssVar = new rss();
        this.D = rssVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.E = o2gVar;
        this.H = new zrs(rssVar);
        this.I = new mdc0();
        ttr ttrVarA = hwr.a(a1s.c, new b(new a()));
        this.J = new q8i0(jq40.a(odc0.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = bundle != null ? bundle.getLong("ARG_START_TIME") : System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        awi awiVarA = awi.a(layoutInflater);
        this.C = awiVarA;
        ConstraintLayout constraintLayout = awiVarA.a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        q0();
        n0f n0fVar = this.P;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.d();
        this.C = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putLong("ARG_START_TIME", this.B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        n0f n0fVar = this.P;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.e();
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [iss] */
    /* JADX WARN: Type inference failed for: r7v1, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Object obj;
        String strI0;
        String str;
        int i;
        int i2;
        view.getClass();
        super.onViewCreated(view, bundle);
        n0f n0fVar = this.P;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.c();
        final awi awiVar = this.C;
        q8i0 q8i0Var = this.J;
        zrs zrsVar = this.H;
        if (awiVar != null) {
            final ImageView imageView = awiVar.w.w;
            final ImageView imageView2 = awiVar.i;
            ActionBar actionBar = awiVar.b;
            cmo cmoVar = this.O;
            if (cmoVar == null) {
                Intrinsics.n("instantWinSportRepo");
                throw null;
            }
            n4p n4pVar = this.L;
            if (n4pVar == null) {
                Intrinsics.n("sharedData");
                throw null;
            }
            Integer numB = cmoVar.b(n4pVar.c());
            LayoutInflater.Factory factoryRequireActivity = requireActivity();
            xzf0 xzf0Var = factoryRequireActivity instanceof xzf0 ? (xzf0) factoryRequireActivity : null;
            if (xzf0Var == null || (strI0 = xzf0Var.i0()) == null) {
                strI0 = "";
            }
            boolean z = numB != null;
            LayoutInflater.Factory factoryRequireActivity2 = requireActivity();
            xzf0 xzf0Var2 = factoryRequireActivity2 instanceof xzf0 ? (xzf0) factoryRequireActivity2 : null;
            if (xzf0Var2 != null) {
                str = "";
                obj = null;
                xzf0Var2.E0(actionBar, strI0, false, z, false, null);
            } else {
                str = "";
                obj = null;
            }
            if (numB != null) {
                actionBar.setSportsIcon(numB.intValue());
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            int iA = fug0.a(hug0.a, contextRequireContext);
            if (iA == 3 || iA == 4) {
                i = R.drawable.iwqk_live_score_view_pt_br;
            } else {
                i = iA != 5 ? R.drawable.iwqk_live_score_view : R.drawable.iwqk_live_score_view_fr_fr;
            }
            imageView2.setImageDrawable(gr0.a(contextRequireContext, i));
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: fss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    awi awiVar2 = awiVar;
                    awiVar2.w.d.setVisibility(0);
                    awiVar2.w.w.setVisibility(0);
                    imageView2.setVisibility(8);
                }
            });
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            int iOrdinal = hug0.a.a(contextRequireContext2).ordinal();
            if (iOrdinal == 3 || iOrdinal == 4) {
                i2 = R.drawable.iwqk_live_score_hide_pt_br;
            } else {
                i2 = iOrdinal != 5 ? R.drawable.iwqk_live_score_hide : R.drawable.iwqk_live_score_hide_fr_fr;
            }
            imageView.setImageDrawable(gr0.a(contextRequireContext2, i2));
            imageView.setOnClickListener(new View.OnClickListener() { // from class: gss
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    awi awiVar2 = awiVar;
                    awiVar2.w.d.setVisibility(8);
                    awiVar2.i.setVisibility(0);
                    imageView.setVisibility(8);
                    this.H.k(true);
                }
            });
            RecyclerView recyclerView = awiVar.f;
            recyclerView.setBackgroundColor(requireContext().getColor(R.color.bg_primary_d_base));
            recyclerView.setAdapter(zrsVar);
            awiVar.c.setData(sn5.d(this, R.string.page_instant_virtual__skip_to_result, new Object[0]), str, new NextButtonLayout.a() { // from class: hss
                @Override // com.sportybet.android.instantwin.presentation.widget.NextButtonLayout.a
                public final void a() {
                    kss kssVar = this.a;
                    kssVar.p0();
                    rdd0 rdd0Var = kssVar.N;
                    if (rdd0Var == null) {
                        Intrinsics.n("sportyTrackingUseCase");
                        throw null;
                    }
                    rdd0Var.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, "skip_to_result"), 0), k00.b, k00.a, k00.c);
                    w9c0 w9c0Var = kssVar.M;
                    if (w9c0Var != null) {
                        w9c0Var.c(v9c0.q.a);
                    } else {
                        Intrinsics.n("sportyLegendsAnalyticsTracker");
                        throw null;
                    }
                }
            });
            awiVar.z.setVisibility(8);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
            ComposeView composeView = awiVar.d;
            final uwd0<y5f> uwd0Var = ((odc0) q8i0Var.getValue()).e;
            final ?? r6 = new Function1() { // from class: iss
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    w5f w5fVar = (w5f) obj2;
                    w5fVar.getClass();
                    ((odc0) this.a.J.getValue()).a.e(w5fVar);
                    return Unit.a;
                }
            };
            uwd0Var.getClass();
            composeView.setContent(new op8(-1981314632, new Function2() { // from class: l3f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    a aVar = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ytw ytwVarC = wyh.c(uwd0Var, aVar, 0, 7);
                        final iss issVar = r6;
                        o0z.a(null, null, null, null, null, pp8.b(-2061035481, new Function2() { // from class: v3f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    i4f.b(null, (y5f) ytwVarC.getValue(), issVar, aVar2, y5f.f << 3, 1);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 196608);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        } else {
            obj = null;
        }
        ku90<ndc0> ku90Var = ((odc0) q8i0Var.getValue()).d;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ?? r7 = obj;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), r7, r7, new jss(viewLifecycleOwner, ku90Var, r7, this), 3);
        Bundle arguments = getArguments();
        SportyLegendsSettlementInput sportyLegendsSettlementInput = arguments != null ? (SportyLegendsSettlementInput) ((Parcelable) rj5.a(arguments, "ARG_INPUT", SportyLegendsSettlementInput.class)) : null;
        if (sportyLegendsSettlementInput == null) {
            p0();
            return;
        }
        m0();
        try {
            mdc0 mdc0Var = this.I;
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo = sportyLegendsSettlementInput.a;
            mdc0Var.getClass();
            ngs ngsVarA = mdc0.a(contextRequireContext3, sportyLegendsSettlementRoundInfo);
            zrsVar.j(ngsVarA);
            r0(ngsVarA);
        } catch (Exception unused) {
            p0();
        }
    }

    public final void p0() {
        if (this.G) {
            return;
        }
        this.G = true;
        lss lssVar = this.F;
        rss rssVar = this.D;
        if (lssVar != null) {
            rssVar.getClass();
            rssVar.b.remove(lssVar);
        }
        this.F = null;
        jvd0 jvd0Var = rssVar.a;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        rssVar.a = null;
        int i = rssVar.c + 1;
        int i2 = rssVar.d;
        if (i <= i2) {
            while (true) {
                rssVar.c = i;
                Iterator<rss.a> it = rssVar.b.iterator();
                while (it.hasNext()) {
                    it.next().a(i);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        q0();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.B;
        w9c0 w9c0Var = this.M;
        if (w9c0Var == null) {
            Intrinsics.n("sportyLegendsAnalyticsTracker");
            throw null;
        }
        w9c0Var.c(new v9c0.c(jCurrentTimeMillis, "LITE"));
        awi awiVar = this.C;
        if (awiVar != null) {
            msr msrVar = awiVar.w;
            ImageView imageView = msrVar.i;
            xa50 xa50VarE = com.bumptech.glide.a.e(imageView);
            xa50VarE.getClass();
            xa50VarE.n(new xa50.b(imageView));
            imageView.setImageResource(R.drawable.img__football_field);
            msrVar.f.setVisibility(8);
        }
        odc0 odc0Var = (odc0) this.J.getValue();
        SportyLegendsSettlementInput sportyLegendsSettlementInput = odc0Var.c;
        if (sportyLegendsSettlementInput != null) {
            odc0Var.a.d(blc0.a(sportyLegendsSettlementInput));
        }
    }

    public final void q0() {
        rss rssVar = this.D;
        jvd0 jvd0Var = rssVar.a;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        rssVar.a = null;
        rssVar.b.clear();
        rssVar.c = 0;
        rssVar.d = 0;
        this.F = null;
        Iterator<Map.Entry<Integer, ? extends List<? extends ess>>> it = this.E.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((ess) it2.next()).release();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(ngs ngsVar) throws Throwable {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        ListIterator listIterator = ngsVar.listIterator(0);
        while (true) {
            ngs.c cVar = (ngs.c) listIterator;
            if (!cVar.hasNext()) {
                break;
            }
            Object next = cVar.next();
            if (next instanceof nss.d) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((nss.d) obj).j);
        nss.d dVar = (nss.d) obj;
        if (dVar == null) {
            p0();
            return;
        }
        String str = dVar.b;
        String str2 = dVar.c;
        String str3 = dVar.d;
        String str4 = dVar.e;
        String str5 = dVar.f;
        awi awiVar = this.C;
        if (awiVar != null) {
            msr msrVar = awiVar.w;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            Drawable drawableC = s0b.c(contextRequireContext, R.drawable.ic_default_team_logo_home, null, null, 6);
            u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            Drawable drawableC2 = s0b.c(contextRequireContext2, R.drawable.ic_default_team_logo_away, null, null, 6);
            u7n u7nVarB2 = drawableC2 != null ? zbn.b(drawableC2) : null;
            msrVar.H.setText(str);
            ImageView imageView = msrVar.z;
            m9n m9nVarA = qw90.a(imageView.getContext());
            nan.a aVar = new nan.a(imageView.getContext());
            aVar.c = str2;
            abn.f(aVar, imageView);
            aVar.d(u7nVarB);
            aVar.b(u7nVarB);
            m9nVarA.a(aVar.a());
            msrVar.G.setText(str3);
            ImageView imageView2 = msrVar.y;
            m9n m9nVarA2 = qw90.a(imageView2.getContext());
            nan.a aVar2 = new nan.a(imageView2.getContext());
            aVar2.c = str4;
            abn.f(aVar2, imageView2);
            aVar2.d(u7nVarB2);
            aVar2.b(u7nVarB2);
            m9nVarA2.a(aVar2.a());
            msrVar.L.setText(str);
            ImageView imageView3 = msrVar.B;
            m9n m9nVarA3 = qw90.a(imageView3.getContext());
            nan.a aVar3 = new nan.a(imageView3.getContext());
            aVar3.c = str2;
            abn.f(aVar3, imageView3);
            aVar3.d(u7nVarB);
            aVar3.b(u7nVarB);
            m9nVarA3.a(aVar3.a());
            msrVar.J.setText(str3);
            ImageView imageView4 = msrVar.A;
            m9n m9nVarA4 = qw90.a(imageView4.getContext());
            nan.a aVar4 = new nan.a(imageView4.getContext());
            aVar4.c = str4;
            abn.f(aVar4, imageView4);
            aVar4.d(u7nVarB2);
            aVar4.b(u7nVarB2);
            m9nVarA4.a(aVar4.a());
            uqm uqmVar = this.f;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            n4p n4pVar = this.L;
            if (n4pVar == null) {
                Intrinsics.n("sharedData");
                throw null;
            }
            Pair pairA = o8i0.a(msrVar, str, str2, str3, str4, str5, uqmVar, n4pVar.c().equals("sr:sport:3") ? tss.b : tss.c);
            int iIntValue = ((Number) pairA.a).intValue();
            Map<Integer, ? extends List<? extends ess>> map = (Map) pairA.b;
            q0();
            this.E = map;
            lss lssVar = new lss(map, iIntValue, this);
            this.F = lssVar;
            rss rssVar = this.D;
            rssVar.getClass();
            rssVar.b.add(lssVar);
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            rssVar.a(iIntValue, ebs.a(viewLifecycleOwner.getLifecycle()));
        }
    }
}
