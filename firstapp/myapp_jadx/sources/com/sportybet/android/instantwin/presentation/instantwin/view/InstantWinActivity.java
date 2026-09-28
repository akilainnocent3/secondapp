package com.sportybet.android.instantwin.presentation.instantwin.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.widget.LoadingView;
import defpackage.bmy;
import defpackage.bro;
import defpackage.cyb;
import defpackage.dlc0;
import defpackage.ebs;
import defpackage.fd;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.h8o;
import defpackage.i8o;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.kzh;
import defpackage.n4p;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.sqo;
import defpackage.uxo;
import defpackage.v8i0;
import defpackage.vho;
import defpackage.vsl;
import defpackage.wdo;
import defpackage.ykc0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/instantwin/view/InstantWinActivity;", "Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Lk9j;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InstantWinActivity extends vsl implements k9j {
    public static final /* synthetic */ int I = 0;
    public final q8i0 B = new q8i0(jq40.a(wdo.class), new b(), new a(), new c());
    public final q8i0 C = new q8i0(jq40.a(bro.class), new e(), new d(), new f());
    public fd D;
    public n4p E;
    public vho F;
    public ykc0 G;
    public dlc0 H;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return InstantWinActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return InstantWinActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return InstantWinActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return InstantWinActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return InstantWinActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return InstantWinActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final InstantWinInput G1() {
        Intent intent = getIntent();
        intent.getClass();
        return (InstantWinInput) ((Parcelable) uxo.a(intent, "ARG_INPUT", InstantWinInput.class));
    }

    public final void H1() {
        sqo.k(this, getCMSString(R.string.page_instant_virtual__game_unavailable, new Object[0]), getCMSString(((bro) this.C.getValue()).a, new Object[0]), new DialogInterface.OnClickListener() { // from class: f8o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = InstantWinActivity.I;
                this.a.finish();
            }
        });
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_iwqk_main, (ViewGroup) null, false);
        int i = R.id.action_bar;
        ActionBar actionBar = (ActionBar) h5e.a(R.id.action_bar, viewInflate);
        if (actionBar != null) {
            i = R.id.loading;
            LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
            if (loadingView != null) {
                i = R.id.sub_title_bar;
                View viewA = h5e.a(R.id.sub_title_bar, viewInflate);
                if (viewA != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.D = new fd(constraintLayout, actionBar, loadingView, viewA);
                    setContentView(constraintLayout);
                    vho vhoVar = this.F;
                    if (vhoVar == null) {
                        Intrinsics.n("instantWinOnlineImagePreloader");
                        throw null;
                    }
                    vhoVar.a();
                    ykc0 ykc0Var = this.G;
                    if (ykc0Var == null) {
                        Intrinsics.n("sportyLegendsSettlementClipsPreCacheHelper");
                        throw null;
                    }
                    ykc0Var.a();
                    dlc0 dlc0Var = this.H;
                    if (dlc0Var == null) {
                        Intrinsics.n("sportyLegendsSettlementLottiePreCacheHelper");
                        throw null;
                    }
                    dlc0Var.a();
                    fd fdVar = this.D;
                    if (fdVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    n4p n4pVar = (n4p) C1();
                    n4pVar.i = null;
                    InstantWinInput instantWinInputG1 = G1();
                    String str = instantWinInputG1 != null ? instantWinInputG1.a : null;
                    if (str == null) {
                        str = "";
                    }
                    n4pVar.m = str;
                    E0(fdVar.b, i0(), false, true, false, null);
                    q8i0 q8i0Var = this.B;
                    ((wdo) q8i0Var.getValue()).t1();
                    kzh.d(new g1i(((wdo) q8i0Var.getValue()).z, new h8o(this, null)), ebs.a(getLifecycle()));
                    kzh.d(new g1i(((wdo) q8i0Var.getValue()).B, new i8o(this, null)), ebs.a(getLifecycle()));
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        n4p n4pVar = this.E;
        if (n4pVar == null) {
            Intrinsics.n("sharedConfig");
            throw null;
        }
        n4pVar.B = false;
        super.onDestroy();
    }
}
