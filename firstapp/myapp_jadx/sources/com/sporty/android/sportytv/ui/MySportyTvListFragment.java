package com.sporty.android.sportytv.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportytv.data.MyProgram;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.ui.MySportyTvListFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a0x;
import defpackage.a1s;
import defpackage.a380;
import defpackage.a9l;
import defpackage.afb0;
import defpackage.b0x;
import defpackage.bmy;
import defpackage.bs9;
import defpackage.c0x;
import defpackage.cs9;
import defpackage.cyb;
import defpackage.dfb0;
import defpackage.e230;
import defpackage.g1i;
import defpackage.gaj;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hwr;
import defpackage.iel;
import defpackage.ij90;
import defpackage.ixl;
import defpackage.j8l;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.mpe0;
import defpackage.neb0;
import defpackage.o1x;
import defpackage.o8i0;
import defpackage.p45;
import defpackage.paj;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r1x;
import defpackage.r8i0;
import defpackage.saj;
import defpackage.sn5;
import defpackage.sqd;
import defpackage.ttr;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.x7l;
import defpackage.xzh;
import defpackage.yzh;
import defpackage.zzw;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/sportytv/ui/MySportyTvListFragment;", "Lwfd0;", "Lneb0;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MySportyTvListFragment extends ixl<neb0> {
    public final a380 A;
    public ConstraintLayout B;
    public ToggleButton C;
    public ConstraintLayout D;
    public final ArrayList E;
    public String F;
    public final mpe0 G;
    public int H;
    public boolean I;
    public int J;
    public final o1x K;
    public final b L;
    public final q8i0 y;
    public final mpe0 z;

    public static final /* synthetic */ class a extends saj implements gaj<LayoutInflater, ViewGroup, Boolean, neb0> {
        public static final a a = new a(3, neb0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sporty/android/sportyfm/databinding/SpmFragmentNotificationListBinding;", 0);

        @Override // defpackage.gaj
        public final neb0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            layoutInflater2.getClass();
            View viewInflate = layoutInflater2.inflate(R.layout.spm_fragment_notification_list, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.action_bar_container;
            View viewA = h5e.a(R.id.action_bar_container, viewInflate);
            if (viewA != null) {
                ij90 ij90VarA = ij90.a(viewA);
                i = R.id.list_error_view;
                View viewA2 = h5e.a(R.id.list_error_view, viewInflate);
                if (viewA2 != null) {
                    int i2 = R.id.icon;
                    if (((AppCompatImageView) h5e.a(R.id.icon, viewA2)) != null) {
                        i2 = R.id.text;
                        TextView textView = (TextView) h5e.a(R.id.text, viewA2);
                        if (textView != null) {
                            dfb0 dfb0Var = new dfb0((ConstraintLayout) viewA2, textView);
                            i = R.id.list_loading_view;
                            View viewA3 = h5e.a(R.id.list_loading_view, viewInflate);
                            if (viewA3 != null) {
                                afb0 afb0VarA = afb0.a(viewA3);
                                i = R.id.notification_tv;
                                if (((TextView) h5e.a(R.id.notification_tv, viewInflate)) != null) {
                                    i = R.id.program_layout;
                                    if (((FrameLayout) h5e.a(R.id.program_layout, viewInflate)) != null) {
                                        i = R.id.program_title_bar;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.program_title_bar, viewInflate);
                                        if (constraintLayout != null) {
                                            i = R.id.recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                                            if (recyclerView != null) {
                                                i = R.id.swipe_to_refresh;
                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_to_refresh, viewInflate);
                                                if (swipeRefreshLayout != null) {
                                                    i = R.id.toggle_button;
                                                    ToggleButton toggleButton = (ToggleButton) h5e.a(R.id.toggle_button, viewInflate);
                                                    if (toggleButton != null) {
                                                        return new neb0((ConstraintLayout) viewInflate, ij90VarA, dfb0Var, afb0VarA, constraintLayout, recyclerView, swipeRefreshLayout, toggleButton);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i2)));
                    return null;
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements e230.a {
        public b() {
        }

        @Override // e230.a
        public final void a(String str) {
            str.getClass();
            MySportyTvListFragment.this.q0().z1(str);
        }

        @Override // e230.a
        public final void b(String str) {
            str.getClass();
            MySportyTvListFragment.this.q0().A1(str);
        }

        @Override // e230.a
        public final void c(View view) {
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

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return MySportyTvListFragment.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? MySportyTvListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o1x] */
    public MySportyTvListFragment() {
        super(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.y = new q8i0(jq40.a(c0x.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        this.z = hwr.b(new bs9(1));
        this.A = new a380();
        this.E = new ArrayList();
        this.F = "";
        this.G = hwr.b(new cs9(1));
        this.I = true;
        this.K = new Runnable() { // from class: o1x
            @Override // java.lang.Runnable
            public final void run() {
                MySportyTvListFragment mySportyTvListFragment = this.a;
                if (mySportyTvListFragment.F.length() > 0) {
                    c0x c0xVarQ0 = mySportyTvListFragment.q0();
                    Object value = mySportyTvListFragment.G.getValue();
                    value.getClass();
                    c0xVarQ0.B1((String) value, mySportyTvListFragment.F);
                }
            }
        };
        this.L = new b();
    }

    @Override // defpackage.wfd0
    public final void j0() {
        ToggleButton toggleButton = this.C;
        if (toggleButton == null) {
            Intrinsics.n("toggleView");
            throw null;
        }
        toggleButton.setChecked(false);
        q0().C1(false);
    }

    @Override // defpackage.wfd0
    public final void m0() {
        q0().C1(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        r0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        VB vb = this.b;
        vb.getClass();
        neb0 neb0Var = (neb0) vb;
        this.B = neb0Var.d.a;
        this.C = neb0Var.v;
        this.D = neb0Var.e;
        VB vb2 = this.b;
        vb2.getClass();
        final SwipeRefreshLayout swipeRefreshLayout = ((neb0) vb2).i;
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(R.color.black_80);
        swipeRefreshLayout.setColorSchemeResources(R.color.white_70);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: l1x
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() {
                swipeRefreshLayout.setRefreshing(false);
                MySportyTvListFragment mySportyTvListFragment = this;
                mySportyTvListFragment.r0();
                c0x c0xVarQ0 = mySportyTvListFragment.q0();
                Object value = mySportyTvListFragment.G.getValue();
                value.getClass();
                c0xVarQ0.B1((String) value, "");
            }
        });
        RecyclerView recyclerView = neb0Var.f;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(p0());
        recyclerView.k(new r1x(neb0Var, this));
        ToggleButton toggleButton = this.C;
        if (toggleButton == null) {
            Intrinsics.n("toggleView");
            throw null;
        }
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p1x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                compoundButton.getClass();
                final MySportyTvListFragment mySportyTvListFragment = this.a;
                if (!z) {
                    mySportyTvListFragment.q0().C1(false);
                    return;
                }
                if (new t2y(mySportyTvListFragment.requireContext()).b.areNotificationsEnabled()) {
                    mySportyTvListFragment.q0().C1(true);
                    return;
                }
                b.a title = new b.a(mySportyTvListFragment.requireContext()).setTitle(sn5.d(mySportyTvListFragment, R.string.page_payment__reminder, new Object[0]));
                title.a.f = sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_reminder_content, new Object[0]);
                title.c(sn5.d(mySportyTvListFragment, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: k1x
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        MySportyTvListFragment mySportyTvListFragment2 = mySportyTvListFragment;
                        Context context = mySportyTvListFragment2.getContext();
                        intent.setData(Uri.fromParts("package", context != null ? context.getPackageName() : null, null));
                        mySportyTvListFragment2.d.b(intent);
                    }
                });
                title.f().f(-1).setAllCaps(false);
            }
        });
        ij90 ij90Var = neb0Var.b;
        ImageButton imageButton = ij90Var.e;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: q1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NavHostFragment.a.a(this.a).j();
            }
        });
        imageButton.setVisibility(0);
        ImageButton imageButton2 = ij90Var.c;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: j1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.requireActivity().finish();
            }
        });
        imageButton2.setVisibility(0);
        TextView textView = ij90Var.f;
        textView.setText(sn5.c(textView, R.string.sporty_tv__my_tv_list, new Object[0]));
        textView.setVisibility(0);
        ij90Var.b.setVisibility(8);
        ij90Var.d.setVisibility(8);
        c0x c0xVarQ0 = q0();
        c0xVarQ0.v.f(getViewLifecycleOwner(), new c(new Function1() { // from class: i1x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ConstraintLayout constraintLayout = this.a.B;
                if (zBooleanValue) {
                    if (constraintLayout == null) {
                        Intrinsics.n("programListLoading");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                } else {
                    if (constraintLayout == null) {
                        Intrinsics.n("programListLoading");
                        throw null;
                    }
                    constraintLayout.setVisibility(8);
                }
                return Unit.a;
            }
        }));
        c0xVarQ0.y.f(getViewLifecycleOwner(), new c(new Function1() { // from class: m1x
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String flag;
                vzw vzwVar = (vzw) obj;
                boolean z = vzwVar instanceof vzw.a;
                MySportyTvListFragment mySportyTvListFragment = this.a;
                if (z) {
                    BaseResponse<MyProgram> baseResponse = ((vzw.a) vzwVar).a;
                    MyProgram myProgram = baseResponse.data;
                    if (myProgram == null || (flag = myProgram.getFlag()) == null) {
                        flag = "";
                    }
                    mySportyTvListFragment.F = flag;
                    MyProgram myProgram2 = baseResponse.data;
                    List<Program> programList = myProgram2 != null ? myProgram2.getProgramList() : null;
                    boolean z2 = mySportyTvListFragment.F.length() > 0;
                    ArrayList arrayList = mySportyTvListFragment.E;
                    VB vb3 = mySportyTvListFragment.b;
                    vb3.getClass();
                    mySportyTvListFragment.p0().k();
                    a380 a380Var = mySportyTvListFragment.A;
                    a380Var.r();
                    if (programList != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : programList) {
                            Date date = new Date(((Program) obj2).getStartTime());
                            Locale locale = Locale.US;
                            locale.getClass();
                            String strL = bwf0.l(date, "yyyy-MM-dd", locale, 0, 0);
                            Object objA = linkedHashMap.get(strL);
                            if (objA == null) {
                                objA = r9i.a(strL, linkedHashMap);
                            }
                            ((List) objA).add(obj2);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayList.contains(entry.getKey())) {
                                a380Var.m(new uzw((String) entry.getKey()));
                                arrayList.add(entry.getKey());
                            }
                            for (Program program : (List) entry.getValue()) {
                                vyg vygVar = new vyg(new e230(program, false, mySportyTvListFragment.L), false);
                                vygVar.m(new c230(program, false));
                                arrayList2.add(vygVar);
                            }
                            a380Var.n(arrayList2);
                        }
                    }
                    if (z2) {
                        cxs cxsVar = new cxs();
                        int iP = a380Var.p();
                        a380Var.b = cxsVar;
                        ArrayList<w7l> arrayList3 = a380Var.c;
                        int iP2 = a380Var.p();
                        if (iP > 0) {
                            a380Var.l(j8l.a(arrayList3), iP);
                        }
                        if (iP2 > 0) {
                            a380Var.k(j8l.a(arrayList3), iP2);
                        }
                    }
                    mySportyTvListFragment.p0().i(a380Var);
                } else if (vzwVar instanceof vzw.b) {
                    mySportyTvListFragment.s0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_no_list_content, new Object[0]));
                } else {
                    mySportyTvListFragment.s0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__temporary_unavailable, new Object[0]));
                }
                return Unit.a;
            }
        }));
        c0xVarQ0.A.f(getViewLifecycleOwner(), new c(new Function1() { // from class: n1x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                wyf0 wyf0Var = (wyf0) obj;
                vyf0 vyf0Var = wyf0Var.a;
                boolean z = vyf0Var instanceof vyf0.a;
                MySportyTvListFragment mySportyTvListFragment = this.a;
                if (z) {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_add, new Object[0]));
                } else if (vyf0Var instanceof vyf0.c) {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                    mySportyTvListFragment.t0(((vyf0.c) wyf0Var.a).a, false);
                } else {
                    mySportyTvListFragment.n0(sn5.d(mySportyTvListFragment, R.string.sporty_tv__sporty_tv_notification_error, new Object[0]));
                }
                return Unit.a;
            }
        }));
        c0xVarQ0.C.f(getViewLifecycleOwner(), new c(new sqd(this, 1)));
        c0xVarQ0.E.f(getViewLifecycleOwner(), new c(new p45(this, 2)));
        c0x c0xVarQ1 = q0();
        Object value = this.G.getValue();
        value.getClass();
        c0xVarQ1.B1((String) value, "");
        c0x c0xVarQ2 = q0();
        jvd0 jvd0Var = c0xVarQ2.f;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        c0xVarQ2.f = kzh.d(new yzh(new g1i(new xzh(c0xVarQ2.e.b(), new zzw(c0xVarQ2, null)), new a0x(c0xVarQ2, null)), new b0x(c0xVarQ2, null)), o8i0.d(c0xVarQ2));
    }

    public final x7l<a9l> p0() {
        return (x7l) this.z.getValue();
    }

    public final c0x q0() {
        return (c0x) this.y.getValue();
    }

    public final void r0() {
        p0().k();
        this.E.clear();
        this.A.o();
        this.F = "";
        this.H = 0;
        this.J = 0;
        this.I = false;
    }

    public final void s0(String str) {
        VB vb = this.b;
        vb.getClass();
        neb0 neb0Var = (neb0) vb;
        dfb0 dfb0Var = neb0Var.c;
        ConstraintLayout constraintLayout = this.D;
        if (constraintLayout == null) {
            Intrinsics.n("titleBar");
            throw null;
        }
        constraintLayout.setVisibility(8);
        neb0Var.f.setVisibility(8);
        dfb0Var.a.setVisibility(0);
        dfb0Var.b.setText(str);
    }

    public final void t0(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AnalyticsParam.EVENT_PARAM_RESULT, z);
        bundle.putString(AnalyticsParam.EVENT_PARAM_ID, str);
        p0().notifyItemRangeChanged(0, j8l.a(p0().a), bundle);
    }
}
