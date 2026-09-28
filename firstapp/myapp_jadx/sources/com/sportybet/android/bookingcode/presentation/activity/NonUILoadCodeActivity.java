package com.sportybet.android.bookingcode.presentation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import defpackage.arr;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.g08;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.jq40;
import defpackage.kc;
import defpackage.lws;
import defpackage.m290;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rws;
import defpackage.s9s;
import defpackage.txx;
import defpackage.uxx;
import defpackage.v8i0;
import defpackage.yxl;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/activity/NonUILoadCodeActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NonUILoadCodeActivity extends yxl {
    public String b;
    public String c;
    public boolean d;
    public kc f;
    public e i;
    public boolean e = true;
    public final q8i0 v = new q8i0(jq40.a(rws.class), new b(), new a(), new c());

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NonUILoadCodeActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NonUILoadCodeActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NonUILoadCodeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        lws lwsVar;
        this.b = getIntent().getStringExtra("extra_data_booking_code");
        this.c = getIntent().getStringExtra("action_load_booking_code_from");
        this.d = getIntent().getBooleanExtra("EXTRA_IS_REPLACE", false);
        Intent intent = getIntent();
        String str = YAzniTbXHYQ.YBExwhNKtQpvQe;
        this.e = intent.getBooleanExtra(str, true);
        getIntent().removeExtra("extra_data_booking_code");
        getIntent().removeExtra("action_load_booking_code_from");
        getIntent().removeExtra("EXTRA_IS_REPLACE");
        getIntent().removeExtra(str);
        super.onCreate(bundle);
        Object obj = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_betslip_prepare_data, (ViewGroup) null, false);
        LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
        if (loadingView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            this.f = new kc(relativeLayout, loadingView);
            setContentView(relativeLayout);
            kc kcVar = this.f;
            if (kcVar != null) {
                kcVar.b.K();
                q8i0 q8i0Var = this.v;
                g1i g1iVar = new g1i(((rws) q8i0Var.getValue()).e, new txx(this, null));
                s9s lifecycle = getLifecycle();
                lifecycle.getClass();
                s9s.b bVar = s9s.b.d;
                arr.a(g1iVar, lifecycle, bVar);
                g1i g1iVar2 = new g1i(((rws) q8i0Var.getValue()).i, new uxx(this, null));
                s9s lifecycle2 = getLifecycle();
                lifecycle2.getClass();
                arr.a(g1iVar2, lifecycle2, bVar);
                rws rwsVar = (rws) q8i0Var.getValue();
                String str2 = this.b;
                Set<g08> set = m290.a;
                String str3 = this.c;
                for (Object obj2 : g08.W) {
                    if (Intrinsics.g(((g08) obj2).name(), str3)) {
                        obj = obj2;
                        break;
                    }
                }
                g08 g08Var = (g08) obj;
                if (g08Var == null) {
                    g08Var = g08.UNKNOWN;
                }
                g08 g08Var2 = g08Var;
                boolean z = this.e;
                if (this.d) {
                    lwsVar = lws.b;
                } else {
                    lwsVar = lws.a;
                }
                rwsVar.x1(str2, g08Var2, z, true, lwsVar);
                return;
            }
            Intrinsics.n("binding");
            throw null;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.loading)));
    }
}
