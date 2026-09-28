package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lnod;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/material/tabs/TabLayout$d;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nod extends Fragment implements TabLayout.d {
    public static final /* synthetic */ ohp<Object>[] d = {new d630(0, nod.class, "binding", "getBinding()Lcom/sportybet/feature/payment/impl/databinding/FragmentTradingSubTabBinding;")};
    public final i6i0 a;
    public final q8i0 b;
    public final q8i0 c;

    public static final class a extends yxi {
        public final List<y200> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Fragment fragment, List<? extends y200> list) {
            super(fragment);
            list.getClass();
            this.y = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.y.size();
        }

        @Override // defpackage.yxi
        public final Fragment k(int i) {
            y200 y200Var = this.y.get(i);
            if (y200Var instanceof a300.a.C0004a) {
                return new jpd();
            }
            return y200Var instanceof a300.a.b ? new rxd() : new jpd();
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, myi> {
        public static final b a = new b(1, myi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/feature/payment/impl/databinding/FragmentTradingSubTabBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final myi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.divider;
            View viewA = h5e.a(R.id.divider, view2);
            if (viewA != null) {
                i = R.id.sub_tab_container;
                TabLayout tabLayout = (TabLayout) h5e.a(R.id.sub_tab_container, view2);
                if (tabLayout != null) {
                    i = R.id.sub_view_pager;
                    ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.sub_view_pager, view2);
                    if (viewPager2 != null) {
                        return new myi((ConstraintLayout) view2, viewA, tabLayout, viewPager2);
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return nod.this.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return nod.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return nod.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return nod.this.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return nod.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return nod.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public nod() {
        super(R.layout.fragment_trading_sub_tab);
        this.a = g5e.a(b.a);
        this.b = new q8i0(jq40.a(jqd.class), new c(), new e(), new d());
        this.c = new q8i0(jq40.a(qdd0.class), new f(), new h(), new g());
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        List<y200> list;
        y200 y200Var;
        if (gVar != null) {
            int i = gVar.e;
            z200 z200Var = (z200) m0().e.getValue();
            if (z200Var == null || (list = z200Var.a) == null || (y200Var = list.get(i)) == null) {
                return;
            }
            wwd0 wwd0Var = m0().f;
            wwd0Var.getClass();
            wwd0Var.k(null, y200Var);
        }
    }

    public final myi j0() {
        return (myi) this.a.a(this, d[0]);
    }

    public final jqd m0() {
        return (jqd) this.b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        myi myiVarJ0 = j0();
        myiVarJ0.c.a(this);
        myiVarJ0.d.c(new ood(this));
        dq40 dq40Var = new dq40();
        g1i g1iVar = new g1i(new pod(new f1i(m0().e), dq40Var), new qod(this, dq40Var, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(m0().i, new rod(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
