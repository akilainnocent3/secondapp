package com.sportybet.android.instantwin.presentation.legends;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.dlc0;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.fgo;
import defpackage.fqk;
import defpackage.j8o;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.mgb0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9c0;
import defpackage.s9s;
import defpackage.t340;
import defpackage.t9c0;
import defpackage.uxo;
import defpackage.v8i0;
import defpackage.vh00;
import defpackage.vho;
import defpackage.w3m;
import defpackage.ykc0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/legends/SportyLegendsActivity;", "Lpy1;", "Lbb40;", "Lk9j;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyLegendsActivity extends w3m implements bb40, k9j {
    public static final /* synthetic */ int A = 0;
    public final q8i0 b = new q8i0(jq40.a(d.class), new b(), new a(), new c());
    public mgb0 c;
    public jlo d;
    public vho e;
    public ykc0 f;
    public dlc0 i;
    public j8o v;
    public azm w;
    public fgo y;
    public ee<fqk> z;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyLegendsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyLegendsActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyLegendsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final Intent z1(Context context, SportyLegendsInput sportyLegendsInput) {
        Intent intent = new Intent(context, (Class<?>) SportyLegendsActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("ARG_INPUT", sportyLegendsInput);
        return intent;
    }

    public final d A1() {
        return (d) this.b.getValue();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-1106079933, new vh00(this), true));
        vho vhoVar = this.e;
        if (vhoVar == null) {
            Intrinsics.n("instantWinOnlineImagePreloader");
            throw null;
        }
        vhoVar.a();
        ykc0 ykc0Var = this.f;
        if (ykc0Var == null) {
            Intrinsics.n("sportyLegendsSettlementClipsPreCacheHelper");
            throw null;
        }
        ykc0Var.a();
        dlc0 dlc0Var = this.i;
        if (dlc0Var == null) {
            Intrinsics.n("sportyLegendsSettlementLottiePreCacheHelper");
            throw null;
        }
        dlc0Var.a();
        t340 t340Var = A1().i0;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new s9c0(this, t340Var, null, this), 3);
        jlo jloVar = this.d;
        if (jloVar != null) {
            this.z = registerForActivityResult(jloVar.a(), new t9c0(this));
        } else {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        UiText uiText;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        SportyLegendsInput sportyLegendsInput = (SportyLegendsInput) ((Parcelable) uxo.a(intent, "ARG_INPUT", SportyLegendsInput.class));
        if (sportyLegendsInput == null || (uiText = sportyLegendsInput.c) == null) {
            A1().A1(com.sportybet.android.instantwin.presentation.legends.b.q.a.a);
        } else {
            A1().A1(new com.sportybet.android.instantwin.presentation.legends.b.q.C0283b(uiText));
        }
        A1().A1(com.sportybet.android.instantwin.presentation.legends.b.l.a);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        A1().c0.setValue(null);
    }
}
