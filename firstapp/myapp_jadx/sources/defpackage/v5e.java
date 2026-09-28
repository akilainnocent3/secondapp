package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.paybill.PaybillListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5e;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v5e extends upl {
    public lyi f0;
    public final q8i0 g0;
    public final PaybillListAdapter h0;
    public final u5e i0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositPaybillFragment$initTradingViewModel$1$1", f = "DepositPaybillFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<List<? extends p400>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = v5e.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends p400> list, v1b<? super Unit> v1bVar) {
            return ((a) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5e v5eVar;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                v5eVar = v5e.this;
                if (!zHasNext) {
                    break;
                }
                p400 p400Var = (p400) it.next();
                String str = p400Var.a;
                if (str == null) {
                    str = "";
                }
                q400 q400Var = new q400(str, p400Var.c, p400Var.d);
                UiText uiText = p400Var.b;
                Context contextRequireContext = v5eVar.requireContext();
                contextRequireContext.getClass();
                q400Var.d.add(new com.sportybet.feature.payment.impl.paybill.b(uiText.e(contextRequireContext), v5eVar.i0));
                arrayList.add(q400Var);
            }
            v5eVar.h0.setList(new ArrayList(arrayList));
            if (list.size() == 1) {
                BaseNodeAdapter.expand$default(v5eVar.h0, 0, false, false, null, 14, null);
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
            return v5e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return v5e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return v5e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u5e] */
    public v5e() {
        super(1);
        this.g0 = new q8i0(jq40.a(x5e.class), new b(), new d(), new c());
        this.h0 = new PaybillListAdapter();
        this.i0 = new Function1() { // from class: u5e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                v5e v5eVar = this.a;
                String str = (String) obj;
                str.getClass();
                try {
                    zi50.a aVar = zi50.b;
                    e eVarRequireActivity = v5eVar.requireActivity();
                    eVarRequireActivity.getClass();
                    vxo.b(eVarRequireActivity, str);
                    Unit unit = Unit.a;
                } catch (Throwable unused) {
                    zi50.a aVar2 = zi50.b;
                }
                return Unit.a;
            }
        };
    }

    @Override // defpackage.s62
    public final HintView D0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.d;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        lyi lyiVar = this.f0;
        if (lyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = lyiVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        return null;
    }

    @Override // defpackage.s62
    public final k72 J0() {
        return (x5e) this.g0.getValue();
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        g1i g1iVar = new g1i(((x5e) this.g0.getValue()).r0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        lyi lyiVar = this.f0;
        if (lyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        lyiVar.f.setContent(new op8(162721706, new rx90(), true));
        lyi lyiVar2 = this.f0;
        if (lyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = lyiVar2.v;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.h0);
    }

    @Override // defpackage.g02
    public final m02 P0() {
        return (x5e) this.g0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.b;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        lyi lyiVarA = lyi.a(layoutInflater, viewGroup);
        this.f0 = lyiVarA;
        FrameLayout frameLayout = lyiVarA.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.c;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.f;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.i;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
