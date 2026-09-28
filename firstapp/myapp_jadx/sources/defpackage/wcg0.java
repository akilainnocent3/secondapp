package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportygames.commons.models.ComposeCashOutModel;
import com.sportygames.commons.models.ComposeCoeffModel;
import com.sportygames.commons.models.PrizeInfo;
import com.sportygames.commons.models.UserPlayInfo;
import com.sportygames.commons.tournament.model.TournamentRankListResponse;
import com.sportygames.commons.tournament.model.TournamentStatsData;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwcg0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wcg0 extends Fragment {
    public UserPlayInfo A;
    public vcg0 B;
    public final ytw<ComposeCoeffModel> C;
    public final ytw<ComposeCashOutModel> D;
    public final q8i0 a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String i;
    public String v;
    public String w;
    public String y;
    public List<PrizeInfo> z;

    public static final class a implements lfy, paj {
        public final /* synthetic */ ebc a;

        public a(ebc ebcVar) {
            this.a = ebcVar;
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

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return wcg0.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? wcg0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public wcg0() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.a = new q8i0(jq40.a(zhg0.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.i = "";
        this.v = "";
        this.w = "";
        this.y = "";
        this.z = m2g.a;
        this.C = m.b(new ComposeCoeffModel("0.00x", new j58(a6g0.g), null));
        this.D = m.b(new ComposeCashOutModel(null, null, false, false, 15, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new op8(-1999636516, new Function2() { // from class: ucg0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<HashMap<Long, TournamentRankListResponse>> ytwVar = xag0.g;
                    ytw<HashMap<Long, String>> ytwVar2 = xag0.f;
                    isw iswVar = xag0.j;
                    ytw<Boolean> ytwVar3 = xag0.h;
                    ytw<Integer> ytwVar4 = xag0.k;
                    ytw<Boolean> ytwVar5 = xag0.l;
                    wcg0 wcg0Var = this.a;
                    TournamentStatsData tournamentStatsData = new TournamentStatsData(wcg0Var.c, wcg0Var.b, wcg0Var.d, wcg0Var.e, wcg0Var.f, (PrizeInfo) CollectionsKt.firstOrNull(wcg0Var.z), wcg0Var.A, wcg0Var.i, wcg0Var.v, wcg0Var.w, wcg0Var.y, ohg0.a(wcg0Var.z));
                    zhg0 zhg0Var = (zhg0) wcg0Var.a.getValue();
                    ytw<ComposeCoeffModel> ytwVar6 = wcg0Var.C;
                    ytw<ComposeCashOutModel> ytwVar7 = wcg0Var.D;
                    HashMap map = (HashMap) ((x5a0) ytwVar).getValue();
                    HashMap map2 = (HashMap) ((x5a0) ytwVar2).getValue();
                    boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue();
                    float fFloatValue = iswVar.getValue().floatValue();
                    int iIntValue2 = ((Number) ((x5a0) ytwVar4).getValue()).intValue();
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) ytwVar5).getValue()).booleanValue();
                    boolean zA = aVar.A(wcg0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new wi3(wcg0Var, 2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    ComposeView composeView2 = composeView;
                    boolean zA2 = aVar.A(composeView2);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new k900(composeView2, 1);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(composeView2);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new yi3(composeView2, 3);
                        aVar.r(objY3);
                    }
                    hfg0.g(tournamentStatsData, function0, zhg0Var, ytwVar6, ytwVar7, function1, (Function0) objY3, map, map2, zBooleanValue, fFloatValue, iIntValue2, zBooleanValue2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        vcg0 vcg0Var;
        super.onPause();
        Context context = getContext();
        if (context == null || (vcg0Var = this.B) == null) {
            return;
        }
        fdt.a(context).d(vcg0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        vcg0 vcg0Var;
        super.onResume();
        Context context = getContext();
        if (context == null || (vcg0Var = this.B) == null) {
            return;
        }
        fdt.a(context).b(vcg0Var, new IntentFilter("custom-event-name"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tcg0
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager;
                wcg0 wcg0Var = this.a;
                try {
                    e activity = wcg0Var.getActivity();
                    if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                        return;
                    }
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.p(wcg0Var);
                    aVar.k(true, true);
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.B = new vcg0(this);
        mqw.a.f(getViewLifecycleOwner(), new a(new ebc(this, 2)));
    }
}
