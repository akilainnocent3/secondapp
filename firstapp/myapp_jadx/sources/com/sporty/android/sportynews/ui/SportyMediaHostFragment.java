package com.sporty.android.sportynews.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportytv.ui.SportyTvFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1d;
import defpackage.alv;
import defpackage.b1d;
import defpackage.b4m;
import defpackage.bmy;
import defpackage.cfx;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.erc0;
import defpackage.frc0;
import defpackage.g1i;
import defpackage.gaj;
import defpackage.grc0;
import defpackage.h5e;
import defpackage.hrc0;
import defpackage.hwr;
import defpackage.ij90;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.lx5;
import defpackage.mpe0;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn5;
import defpackage.ss40;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.wae;
import defpackage.xxi;
import defpackage.y0d;
import defpackage.yxi;
import defpackage.z0d;
import defpackage.zyh;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/sportynews/ui/SportyMediaHostFragment;", "Lwfd0;", "Lxxi;", "<init>", "()V", "b", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyMediaHostFragment extends b4m<xxi> {
    public final mpe0 A;
    public final mpe0 B;
    public final mpe0 C;
    public b D;
    public int E;
    public String F;
    public final q8i0 G;
    public boolean H;
    public psm I;
    public final cfx y;
    public final mpe0 z;

    public static final /* synthetic */ class a extends saj implements gaj<LayoutInflater, ViewGroup, Boolean, xxi> {
        public static final a a = new a(3, xxi.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sporty/android/sportyfm/databinding/FragmentSportyMediaHostBinding;", 0);

        @Override // defpackage.gaj
        public final xxi invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            layoutInflater2.getClass();
            View viewInflate = layoutInflater2.inflate(R.layout.fragment_sporty_media_host, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.action_bar_container;
            View viewA = h5e.a(R.id.action_bar_container, viewInflate);
            if (viewA != null) {
                ij90 ij90VarA = ij90.a(viewA);
                int i2 = R.id.media_tab_layout;
                TabLayout tabLayout = (TabLayout) h5e.a(R.id.media_tab_layout, viewInflate);
                if (tabLayout != null) {
                    i2 = R.id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewPager, viewInflate);
                    if (viewPager2 != null) {
                        return new xxi((ConstraintLayout) viewInflate, ij90VarA, tabLayout, viewPager2);
                    }
                }
                i = i2;
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b extends yxi {
        public final ArrayList y;
        public final ArrayList z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SportyMediaHostFragment sportyMediaHostFragment, String str, String str2, psm psmVar) {
            super(sportyMediaHostFragment);
            str.getClass();
            str2.getClass();
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.z = arrayList2;
            arrayList.add(new SportyTvFragment());
            arrayList2.add(Integer.valueOf(R.string.sporty_tv__sporty_tv));
            SportyNewsListFragment sportyNewsListFragment = new SportyNewsListFragment();
            if (str.length() > 0 && str2.length() > 0) {
                sportyNewsListFragment.setArguments(vj5.a(new Pair("articleId", str), new Pair("type", str2)));
            }
            arrayList.add(sportyNewsListFragment);
            arrayList2.add(Integer.valueOf(psmVar.O() ? R.string.sporty_news__sporty_blog : R.string.sporty_news__tab_title));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.y.size();
        }

        @Override // defpackage.yxi
        public final Fragment k(int i) {
            return (Fragment) this.y.get(i);
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyMediaHostFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyMediaHostFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyMediaHostFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class f implements Function0<Bundle> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            SportyMediaHostFragment sportyMediaHostFragment = SportyMediaHostFragment.this;
            Bundle arguments = sportyMediaHostFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(sportyMediaHostFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public SportyMediaHostFragment() {
        super(a.a);
        this.y = new cfx(jq40.a(hrc0.class), new f());
        int i = 1;
        this.z = hwr.b(new y0d(this, i));
        this.A = hwr.b(new z0d(this, i));
        int i2 = 2;
        this.B = hwr.b(new a1d(this, i2));
        this.C = hwr.b(new b1d(this, i2));
        this.F = "";
        this.G = new q8i0(jq40.a(alv.class), new c(), new e(), new d());
    }

    @Override // defpackage.wfd0
    public final void j0() {
    }

    @Override // defpackage.wfd0
    public final void m0() {
    }

    @Override // defpackage.wfd0, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.H = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab_position", this.E);
        bundle.putString("tab_title", this.F);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        q8i0 q8i0Var = this.G;
        ((alv) q8i0Var.getValue()).v = q0();
        String str = (String) this.z.getValue();
        VB vb = this.b;
        vb.getClass();
        xxi xxiVar = (xxi) vb;
        TabLayout tabLayout = xxiVar.c;
        ij90 ij90Var = xxiVar.b;
        ImageButton imageButton = ij90Var.e;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: crc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.requireActivity().finish();
            }
        });
        imageButton.setVisibility(0);
        ImageButton imageButton2 = ij90Var.c;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: drc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.requireActivity().finish();
            }
        });
        imageButton2.setVisibility(0);
        TextView textView = ij90Var.f;
        textView.setText(p0());
        textView.setVisibility(0);
        ij90Var.b.setVisibility(0);
        ij90Var.d.setVisibility(8);
        ViewPager2 viewPager2 = xxiVar.d;
        viewPager2.setUserInputEnabled(false);
        String str2 = (String) this.A.getValue();
        String str3 = (String) this.B.getValue();
        psm psmVar = this.I;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        b bVar = new b(this, str2, str3, psmVar);
        viewPager2.setAdapter(bVar);
        this.D = bVar;
        viewPager2.c(new erc0(this, xxiVar));
        if (!this.H) {
            wae.a aVar = wae.b;
            this.E = !"tv-streams".equals(str) ? 1 : 0;
        }
        new com.google.android.material.tabs.c(tabLayout, viewPager2, false, false, new ss40(this)).a();
        TabLayout.g gVarK = tabLayout.k(this.E);
        if (gVarK != null) {
            gVarK.b();
        }
        if (!q0()) {
            tabLayout.setVisibility(8);
        }
        VB vb2 = this.b;
        vb2.getClass();
        xxi xxiVar2 = (xxi) vb2;
        v340 v340Var = ((alv) q8i0Var.getValue()).e;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar2 = s9s.b.d;
        kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar2), new frc0(null, xxiVar2, this)), ebs.a(getLifecycle()));
        ku90 ku90Var = ((alv) q8i0Var.getValue()).i;
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        kzh.d(new g1i(zyh.a(ku90Var, lifecycle2, bVar2), new grc0(null, xxiVar2, this)), ebs.a(getLifecycle()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.E = bundle.getInt("tab_position", 0);
            String string = bundle.getString("tab_title", "");
            string.getClass();
            this.F = string;
        }
    }

    public final String p0() {
        if (q0()) {
            return sn5.d(this, R.string.sporty_news__media_header_title, new Object[0]);
        }
        wae.a aVar = wae.b;
        if (!"news".equals((String) this.z.getValue())) {
            return sn5.d(this, R.string.sporty_tv__sporty_tv, new Object[0]);
        }
        psm psmVar = this.I;
        if (psmVar != null) {
            return sn5.d(this, psmVar.O() ? R.string.sporty_news__sporty_blog : R.string.sporty_news__tab_title, new Object[0]);
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final boolean q0() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }
}
