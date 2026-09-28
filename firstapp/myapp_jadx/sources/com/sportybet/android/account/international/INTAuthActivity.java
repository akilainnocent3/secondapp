package com.sportybet.android.account.international;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.au7;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.c8i0;
import defpackage.cyb;
import defpackage.dsl;
import defpackage.ej5;
import defpackage.h5e;
import defpackage.h7n;
import defpackage.i7n;
import defpackage.j6c;
import defpackage.jdt;
import defpackage.jq40;
import defpackage.num;
import defpackage.odd;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.to20;
import defpackage.v8i0;
import defpackage.vvo;
import defpackage.zu7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/account/international/INTAuthActivity;", "Lcom/sportybet/android/auth/BaseAccountAuthenticatorActivity;", "Lto20;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class INTAuthActivity extends dsl implements to20, bb40 {
    public vvo b;
    public final q8i0 c = new q8i0(jq40.a(au7.class), new b(), new a(), new c());
    public final q8i0 d = new q8i0(jq40.a(i7n.class), new e(), new d(), new f());
    public num e;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return INTAuthActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return INTAuthActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return INTAuthActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return INTAuthActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return INTAuthActivity.this.getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return INTAuthActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // com.sportybet.android.auth.BaseAccountAuthenticatorActivity, android.app.Activity
    public final void finish() {
        if (getIntent().getBooleanExtra(AuthActivity.KEY_IS_IDENTITY_VERIFY, false)) {
            i7n i7nVar = (i7n) this.d.getValue();
            if (!i7nVar.b) {
                odd oddVar = zu7.f;
                ej5.c(zu7.b(oddVar), null, null, new h7n(i7nVar, null), 3);
            }
        }
        super.finish();
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        num numVar = this.e;
        if (numVar != null) {
            numVar.a(new jdt(jdt.a.a));
            return false;
        }
        Intrinsics.n("localEvents");
        throw null;
    }

    @Override // com.sportybet.android.auth.BaseAccountAuthenticatorActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        keepActivity();
        View viewInflate = getLayoutInflater().inflate(R.layout.int_auth_activity, (ViewGroup) null, false);
        if (((FragmentContainerView) h5e.a(R.id.container, viewInflate)) == null) {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.container)));
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.b = new vvo(frameLayout);
        setContentView(frameLayout);
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra(AuthActivity.KEY_IS_SIGN_UP, false)) {
            return;
        }
        ((au7) this.c.getValue()).x1(j6c.INT_REGISTER);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        vvo vvoVar = this.b;
        if (vvoVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = vvoVar.a;
        frameLayout.getClass();
        c8i0.g(frameLayout);
        super.onPause();
    }
}
