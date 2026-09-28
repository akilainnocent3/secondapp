package com.sportybet.android.instantwin.presentation.instantwin.view;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.instantwin.view.a;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.LoadingLayout;
import defpackage.c0d;
import defpackage.ebs;
import defpackage.g1i;
import defpackage.gbn;
import defpackage.gr0;
import defpackage.i5s;
import defpackage.itf0;
import defpackage.ji2;
import defpackage.jlo;
import defpackage.kzh;
import defpackage.lk50;
import defpackage.n4p;
import defpackage.pu0;
import defpackage.q4p;
import defpackage.sb0;
import defpackage.tje0;
import defpackage.tlo;
import defpackage.uj50;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.xsl;
import defpackage.xzf0;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Lpy1;", "Li8;", "Lxzf0;", "<init>", "()V", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class a extends xsl implements xzf0 {
    public LoadingLayout b;
    public ActionBar c;
    public gbn d;
    public jlo e;
    public ji2 f;
    public n4p i;
    public i5s v;
    public uy0 w;
    public final Handler y = new Handler(Looper.getMainLooper());
    public InterfaceC0272a z;

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.instantwin.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0272a {
        default void a() {
        }

        default void b() {
        }

        default void c(boolean z) {
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinBaseActivity$onCreate$1", f = "InstantWinBaseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends AssetsInfo>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = a.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends AssetsInfo> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            a aVar = a.this;
            ActionBar actionBar = aVar.c;
            if (actionBar == null) {
                return Unit.a;
            }
            if (lk50Var instanceof lk50.c) {
                actionBar.F((AssetsInfo) ((lk50.c) lk50Var).a, aVar.getCountryManager().f());
            } else {
                actionBar.F(null, aVar.getCountryManager().f());
            }
            return Unit.a;
        }
    }

    public final jlo A1() {
        jlo jloVar = this.e;
        if (jloVar != null) {
            return jloVar;
        }
        Intrinsics.n("instantWinRouter");
        throw null;
    }

    public final i5s B1() {
        i5s i5sVar = this.v;
        if (i5sVar != null) {
            return i5sVar;
        }
        Intrinsics.n("legacyInstantWinUtil");
        throw null;
    }

    public final tlo C1() {
        n4p n4pVar = this.i;
        if (n4pVar != null) {
            return n4pVar;
        }
        Intrinsics.n("sharedData");
        throw null;
    }

    public final void D1() {
        this.y.postDelayed(new sb0(this, 1), 50L);
    }

    @Override // defpackage.xzf0
    public final void E0(ActionBar actionBar, String str, boolean z, boolean z2, boolean z3, InterfaceC0272a interfaceC0272a) {
        str.getClass();
        if (actionBar == null) {
            return;
        }
        q4p q4pVar = actionBar.F;
        this.z = interfaceC0272a;
        if (z2) {
            q4pVar.b.setVisibility(0);
            q4pVar.b.setImageDrawable(gr0.a(actionBar.getContext(), R.drawable.ic_action_bar_back));
        } else {
            q4pVar.b.setVisibility(4);
            q4pVar.b.setImageDrawable(null);
        }
        if (z3 && getAccountHelper().isLogin()) {
            q4pVar.i.setVisibility(0);
        } else {
            q4pVar.i.setVisibility(8);
        }
        actionBar.setBackButton(new View.OnClickListener() { // from class: v8o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.InterfaceC0272a interfaceC0272a2 = this.a.z;
                if (interfaceC0272a2 != null) {
                    interfaceC0272a2.b();
                }
            }
        });
        actionBar.setHistoryButton(new View.OnClickListener() { // from class: w8o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.InterfaceC0272a interfaceC0272a2 = this.a.z;
                if (interfaceC0272a2 != null) {
                    interfaceC0272a2.a();
                }
            }
        });
        actionBar.setTitle(str);
        if (z) {
            q4pVar.d.setVisibility(8);
            q4pVar.y.setVisibility(0);
        } else {
            q4pVar.y.setVisibility(8);
        }
        this.c = actionBar;
        E1();
    }

    public final void E1() {
        ActionBar actionBar = this.c;
        if (actionBar != null) {
            uy0 uy0Var = this.w;
            if (uy0Var == null) {
                Intrinsics.n("assetsInfoRepository");
                throw null;
            }
            actionBar.F(uy0Var.c(), getCountryManager().f());
            if (getAccountHelper().getAccount() != null) {
                actionBar.setUserInfoButton(null);
                actionBar.E();
                actionBar.G(true);
                return;
            }
            actionBar.setUserInfoButton(new View.OnClickListener() { // from class: x8o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.InterfaceC0272a interfaceC0272a = this.a.z;
                    if (interfaceC0272a != null) {
                        interfaceC0272a.c(false);
                    }
                }
            });
            actionBar.G(false);
            q4p q4pVar = actionBar.F;
            q4pVar.c.setVisibility(0);
            q4pVar.f.setVisibility(0);
            q4pVar.e.setVisibility(0);
            actionBar.setLoginListeners(new View.OnClickListener() { // from class: y8o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.InterfaceC0272a interfaceC0272a = this.a.z;
                    if (interfaceC0272a != null) {
                        interfaceC0272a.c(true);
                    }
                }
            }, new View.OnClickListener() { // from class: z8o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.InterfaceC0272a interfaceC0272a = this.a.z;
                    if (interfaceC0272a != null) {
                        interfaceC0272a.c(false);
                    }
                }
            });
        }
    }

    public final synchronized void F1(int i) {
        try {
            this.y.removeCallbacksAndMessages(null);
            ViewGroup contentView = getContentView();
            if (contentView == null) {
                return;
            }
            if (this.b == null) {
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.iwqk_layout_loading, contentView, false);
                viewInflate.getClass();
                LoadingLayout loadingLayout = (LoadingLayout) viewInflate;
                this.b = loadingLayout;
                contentView.addView(loadingLayout);
            }
            LoadingLayout loadingLayout2 = this.b;
            if (loadingLayout2 != null && loadingLayout2.getVisibility() != 0) {
                View viewFindViewById = loadingLayout2.findViewById(R.id.lottie_view);
                viewFindViewById.getClass();
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                ((ProgressBar) viewFindViewById).setAnimation(alphaAnimation);
                loadingLayout2.setVisibility(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.xzf0
    public String i0() {
        String strC = ((n4p) C1()).c();
        switch (strC.hashCode()) {
            case -715617392:
                return !strC.equals("sr:sport:1") ? "" : getCMSString(R.string.common_functions__instant_virtuals, new Object[0]);
            case -715617391:
                return !strC.equals("sr:sport:2") ? "" : getCMSString(R.string.common_functions__instant_basketball, new Object[0]);
            case -715617390:
                return !strC.equals("sr:sport:3") ? "" : getCMSString(R.string.common_functions__sporty_legends, new Object[0]);
            case 404585818:
                return !strC.equals("sr:sport:1-3-1") ? "" : getCMSString(R.string.common_functions__sporty_african_cup, new Object[0]);
            case 404585819:
                return !strC.equals("sr:sport:1-3-2") ? "" : getCMSString(R.string.common_functions__instant_world_cup, new Object[0]);
            default:
                return "";
        }
    }

    @Override // defpackage.py1, defpackage.i8
    public void onAccountChange(Account account) {
        E1();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setRequestedOrientation(1);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_IV_BASE_ACTIVITY);
            aVar.f(e, "Failed to set Portrait Orientation", new Object[0]);
        }
        getAccountHelper().addAccountChangeListener(this);
        uy0 uy0Var = this.w;
        if (uy0Var != null) {
            kzh.d(new g1i(uy0Var.h(pu0.b.a), new b(null)), ebs.a(getLifecycle()));
        } else {
            Intrinsics.n("assetsInfoRepository");
            throw null;
        }
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        this.c = null;
        getAccountHelper().removeAccountChangeListener(this);
        super.onDestroy();
    }

    public final ji2 z1() {
        ji2 ji2Var = this.f;
        if (ji2Var != null) {
            return ji2Var;
        }
        Intrinsics.n("betBuilderUtil");
        throw null;
    }
}
