package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lx920;", "Lm12;", "Lca20$a;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x920 extends e0m implements ca20.a {
    public mxi B;
    public ca20 C;
    public final q8i0 D;
    public final q8i0 E;
    public final q8i0 F;
    public y8j G;
    public t090 H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("QUICK_PICKS", 0);
            a = aVar;
            a aVar2 = new a("MEGA", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreCannedBetBuilderFragment$doShare$1", f = "PreCannedBetBuilderFragment.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public List a;
        public int b;
        public final /* synthetic */ zha0 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zha0 zha0Var, String str, String str2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = zha0Var;
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x920.this.new b(this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<? extends Selection> list;
            ca20.b bVar;
            boolean z;
            y5b y5bVar = y5b.a;
            int i = this.b;
            String str = this.e;
            Boolean boolValueOf = null;
            zha0 zha0Var = this.d;
            x920 x920Var = x920.this;
            if (i == 0) {
                uj50.b(obj);
                List<? extends Selection> list2 = ((ei20) x920Var.F.getValue()).i;
                String str2 = zha0Var.d;
                t090 t090Var = x920Var.H;
                if (t090Var == null) {
                    Intrinsics.n("shareImageProvider");
                    throw null;
                }
                b190 b190Var = new b190(list2 == null ? m2g.a : list2, str, str2, str);
                this.a = list2;
                this.b = 1;
                Object objA = t090Var.a(b190Var, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                list = list2;
                obj = objA;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = this.a;
                uj50.b(obj);
            }
            c190 c190Var = (c190) obj;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        if (((Selection) it.next()).a.hasLiveOrSettledMarket()) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            zha0Var.c = boolValueOf;
            String strA = o7d.a(wae.SHARE);
            String str3 = c190Var.a;
            String str4 = c190Var.b;
            String strA2 = zha0Var.a();
            boolean zX = g880.x(list);
            StringBuilder sbA = crh0.a(strA, "?imageUri=", str3, "&imageWithUserUri=", str4);
            hxa.c(sbA, "&linkUrl=", this.f, "&shareCode=", str);
            sh8.c().e(x9d.a(strA2, "&isSingleBetBuilder=", "&source=betslip", sbA, zX));
            ca20 ca20Var = x920Var.C;
            if (ca20Var != null && (bVar = ca20Var.e) != null) {
                g2p g2pVar = bVar.a;
                g2pVar.f.setVisibility(8);
                ImageView imageView = g2pVar.c;
                imageView.setVisibility(0);
                imageView.setClickable(true);
            }
            return Unit.a;
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return x920.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return x920.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return x920.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? x920.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class h extends qlr implements Function0<Fragment> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return x920.this;
        }
    }

    public static final class i extends qlr implements Function0<w8i0> {
        public final /* synthetic */ h a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.a = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
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

    public static final class l extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? x920.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class m extends qlr implements Function0<Fragment> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return x920.this;
        }
    }

    public static final class n extends qlr implements Function0<w8i0> {
        public final /* synthetic */ m a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.a = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class o extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class p extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
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

    public x920() {
        this.z = false;
        this.A = false;
        this.D = new q8i0(jq40.a(com.sportybet.plugin.event.e.class), new d(), new f(), new e());
        h hVar = new h();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new i(hVar));
        this.E = new q8i0(jq40.a(eja0.class), new j(ttrVarA), new l(ttrVarA), new k(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new n(new m()));
        this.F = new q8i0(jq40.a(ei20.class), new o(ttrVarA2), new g(ttrVarA2), new p(ttrVarA2));
    }

    @Override // ca20.a
    public final void K(Event event, Market market, Outcome outcome) {
        event.getClass();
        outcome.getClass();
        com.sportybet.plugin.event.e eVar = (com.sportybet.plugin.event.e) this.D.getValue();
        Event eventF = apg.f(event);
        gqa gqaVar = new gqa(this, 1);
        int i2 = eVar.G0.d() != a.b ? 0 : 1;
        String strD = apg.d(eventF);
        String strC = apg.c(eventF);
        eVar.L1(eventF, market, outcome, true, false, i2 != 0 ? new sg2.m(strD, strC) : new sg2.f(strD, strC), i2 != 0 ? new sg2.p(strD, strC) : new sg2.t(strD, strC), i2 != 0 ? new sg2.o(strD, strC) : new sg2.s(strD, strC), gqaVar);
    }

    @Override // ca20.a
    public final boolean e(Selection selection) {
        return ((com.sportybet.plugin.event.e) this.D.getValue()).M1(selection);
    }

    public final void n0(zha0 zha0Var, String str, String str2) {
        com.sportybet.plugin.event.e eVar = (com.sportybet.plugin.event.e) this.D.getValue();
        eVar.O1(eVar.G0.d() == a.b ? new sg2.r(eVar.E1(), eVar.D1()) : new sg2.g(eVar.E1(), eVar.D1()));
        ej5.c(ebs.a(getLifecycle()), null, null, new b(zha0Var, str2, str, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pre_match_bet_builder_pre_canned, viewGroup, false);
        int i2 = R.id.empty_tv;
        TextView textView = (TextView) h5e.a(R.id.empty_tv, viewInflate);
        if (textView != null) {
            i2 = R.id.pre_canned_recycler;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.pre_canned_recycler, viewInflate);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.B = new mxi(constraintLayout, textView, recyclerView);
                constraintLayout.getClass();
                return constraintLayout;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        y8j y8jVar = this.G;
        if (y8jVar == null) {
            Intrinsics.n("fullStoryCommonManager");
            throw null;
        }
        ca20 ca20Var = new ca20(this, y8jVar);
        this.C = ca20Var;
        mxi mxiVar = this.B;
        if (mxiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mxiVar.c.setAdapter(ca20Var);
        mxi mxiVar2 = this.B;
        if (mxiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int i2 = 0;
        mxiVar2.c.k(new aq70(new Function0() { // from class: u920
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                mxi mxiVar3 = this.a.B;
                if (mxiVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                RecyclerView.o layoutManager = mxiVar3.c.getLayoutManager();
                layoutManager.getClass();
                return (LinearLayoutManager) layoutManager;
            }
        }, new v920(this, i2)));
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new y920(this, null, this), 3);
        ((eja0) this.E.getValue()).i.f(getViewLifecycleOwner(), new c(new w920(this, i2)));
        ((com.sportybet.plugin.event.e) this.D.getValue()).H0.f(getViewLifecycleOwner(), new c(new Function1() { // from class: t920
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ba20 ba20Var = (ba20) obj;
                ba20Var.getClass();
                boolean z = ba20Var instanceof ba20.a;
                x920 x920Var = this.a;
                if (z) {
                    ca20 ca20Var2 = x920Var.C;
                    if (ca20Var2 != null) {
                        ba20.a aVar = (ba20.a) ba20Var;
                        List<Market> list = aVar.a;
                        Event event = aVar.b;
                        list.getClass();
                        event.getClass();
                        ArrayList<Market> arrayList = ca20Var2.c;
                        if (!Intrinsics.g(arrayList, list)) {
                            arrayList.clear();
                            arrayList.addAll(list);
                            ca20Var2.d = event;
                            ca20Var2.notifyDataSetChanged();
                        }
                    }
                    mxi mxiVar3 = x920Var.B;
                    if (mxiVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    mxiVar3.c.setVisibility(0);
                    mxi mxiVar4 = x920Var.B;
                    if (mxiVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    mxiVar4.b.setVisibility(8);
                } else {
                    if (!(ba20Var instanceof ba20.b)) {
                        uhc.a();
                        return null;
                    }
                    mxi mxiVar5 = x920Var.B;
                    if (mxiVar5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    mxiVar5.c.setVisibility(8);
                    mxi mxiVar6 = x920Var.B;
                    if (mxiVar6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    sn5.f(mxiVar6.b, ((ba20.b) ba20Var).a, new Object[0]);
                    mxi mxiVar7 = x920Var.B;
                    if (mxiVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    mxiVar7.b.setVisibility(0);
                }
                return Unit.a;
            }
        }));
    }

    @Override // ca20.a
    public final void x(Event event, Market market, Outcome outcome) {
        event.getClass();
        outcome.getClass();
        ei20 ei20Var = (ei20) this.F.getValue();
        List<? extends Selection> listC = kotlin.collections.a.c(new Selection(apg.f(event), market, outcome));
        listC.getClass();
        ei20Var.i = listC;
        oia0 oia0Var = ei20Var.d;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        String strO = g880.o(listC, null, o2gVar, null);
        oia0Var.getClass();
        strO.getClass();
        kzh.d(new yzh(new g1i(new xzh(new ai20(oia0Var.c.a(strO, true)), new bi20(ei20Var, null)), new ci20(ei20Var, null)), new di20(ei20Var, null)), o8i0.d(ei20Var));
    }
}
