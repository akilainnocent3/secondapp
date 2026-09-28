package com.sportybet.android.openbet.presentation.activity;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.n0z;
import defpackage.oke;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.syl;
import defpackage.v8i0;
import defpackage.vzy;

/* JADX INFO: loaded from: classes4.dex */
public class OpenBetActivity extends syl implements k9j, bb40 {
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_open_bets);
        if (bundle == null) {
            vzy vzyVar = new vzy();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.e(R.id.frame, vzyVar, null, 1);
            aVarA.d();
        }
        if (getIntent().getStringExtra("ARG_OPEN_BETS_FROM") != null) {
            String stringExtra = getIntent().getStringExtra("ARG_OPEN_BETS_FROM");
            v8i0 viewModelStore = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            dq7 dq7VarA = jq40.a(n0z.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            n0z n0zVar = (n0z) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            n0zVar.E.m(Boolean.FALSE);
            n0zVar.F.m(Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_TO_OPENBET", false)));
            n0zVar.G.m(Integer.valueOf(getIntent().getIntExtra("tab_index", 10)));
            n0zVar.A1();
            stringExtra.getClass();
        }
    }
}
