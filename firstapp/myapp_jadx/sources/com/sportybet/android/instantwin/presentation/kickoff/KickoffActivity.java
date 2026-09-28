package com.sportybet.android.instantwin.presentation.kickoff;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.kickoff.KickoffInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import defpackage.bb40;
import defpackage.cny;
import defpackage.h3a0;
import defpackage.i3n;
import defpackage.kss;
import defpackage.m3n;
import defpackage.n4p;
import defpackage.oke;
import defpackage.uxo;
import defpackage.uy0;
import defpackage.vj5;
import defpackage.xtl;
import defpackage.yd3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/kickoff/KickoffActivity;", "Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Lm3n;", "Lbb40;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KickoffActivity extends xtl implements m3n, bb40 {
    public static final /* synthetic */ int B = 0;

    public static final class a extends cny {
        @Override // defpackage.cny
        public final void b() {
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment yd3Var;
        super.onCreate(bundle);
        setContentView(R.layout.activity_iwqk_kick_off);
        Intent intent = getIntent();
        intent.getClass();
        KickoffInput kickoffInput = (KickoffInput) ((Parcelable) uxo.a(intent, "ARG_INPUT", KickoffInput.class));
        getOnBackPressedDispatcher().a(this, new a(true));
        if (bundle == null) {
            String str = kickoffInput != null ? kickoffInput.a : null;
            if (str == null) {
                str = "";
            }
            SportyLegendsSettlementInput sportyLegendsSettlementInput = kickoffInput != null ? kickoffInput.c : null;
            if (((n4p) C1()).F() && str.length() > 0) {
                yd3Var = new i3n();
            } else if (!((n4p) C1()).H() || str.length() <= 0 || sportyLegendsSettlementInput == null) {
                yd3Var = new yd3();
            } else {
                yd3Var = new kss();
                yd3Var.setArguments(vj5.a(new Pair("ARG_INPUT", sportyLegendsSettlementInput)));
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(R.id.fragment_container, yd3Var, null);
            aVar.d();
        }
        if (kickoffInput != null ? kickoffInput.b : false) {
            View rootView = getWindow().getDecorView().getRootView();
            rootView.getClass();
            h3a0 h3a0Var = new h3a0(rootView);
            String cMSString = getCMSString(R.string.page_instant_virtual__animation_controller_fallback_toast_text, new Object[0]);
            cMSString.getClass();
            h3a0Var.b = cMSString;
            Snackbar snackbarB = h3a0Var.b(this, 20.0f, 68.0f);
            if (snackbarB != null) {
                snackbarB.j();
            }
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        uy0 uy0Var = this.w;
        if (uy0Var != null) {
            uy0Var.g();
        } else {
            Intrinsics.n("assetsInfoRepository");
            throw null;
        }
    }

    @Override // defpackage.m3n
    public final void q0() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        aVarA.f(R.id.fragment_container, new yd3(), null);
        aVarA.k(true, true);
    }
}
