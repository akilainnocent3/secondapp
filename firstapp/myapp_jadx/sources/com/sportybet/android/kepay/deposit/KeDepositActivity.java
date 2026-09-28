package com.sportybet.android.kepay.deposit;

import android.accounts.Account;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.bb40;
import defpackage.bjb0;
import defpackage.c0e;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.e400;
import defpackage.f1i;
import defpackage.gjp;
import defpackage.hb5;
import defpackage.iip;
import defpackage.jip;
import defpackage.jq40;
import defpackage.k00;
import defpackage.kip;
import defpackage.log0;
import defpackage.mll0;
import defpackage.oke;
import defpackage.psm;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rnd;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sh8;
import defpackage.tj5;
import defpackage.ttl;
import defpackage.ujp;
import defpackage.v000;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xym;
import defpackage.yyh;
import defpackage.z200;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class KeDepositActivity extends ttl implements View.OnClickListener, TabLayout.d, vym, xym, bb40 {
    public static final /* synthetic */ int y = 0;
    public TabLayout b;
    public String c;
    public psm d;
    public rdd0 e;
    public c0e f;
    public e400 i;
    public ujp v;
    public z200 w;

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        Object obj = gVar.a;
        if (obj == null || obj.toString().isEmpty()) {
            return;
        }
        String string = gVar.a.toString();
        string.getClass();
        if (!string.equals("mobilemoney")) {
            if (string.equals("paybill")) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                aVarA.f(R.id.deposit_frame, new v000(), v000.class.getSimpleName());
                aVarA.k(true, true);
                return;
            }
            return;
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        a aVarA2 = oke.a(supportFragmentManager2, supportFragmentManager2);
        String str = this.c;
        AtomicInteger atomicInteger = gjp.r0;
        Bundle bundleA = mll0.a("phone_number", str);
        gjp gjpVar = new gjp();
        gjpVar.setArguments(bundleA);
        aVarA2.f(R.id.deposit_frame, gjpVar, gjp.class.getSimpleName());
        aVarA2.k(true, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back) {
            onBackPressed();
        } else if (id == R.id.deposit_help_center_btn) {
            sh8.c().e(bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_DEPOSIT));
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_deposit);
        Account account = getAccountHelper().getAccount();
        if (account == null) {
            finish();
            return;
        }
        this.e.a(new rnd(tj5.a(getIntent()), null, null, 12), k00.d);
        this.f.b();
        this.c = account.name;
        findViewById(R.id.deposit_help_center_btn).setOnClickListener(this);
        findViewById(R.id.back).setOnClickListener(this);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.deposit_tab);
        this.b = tabLayout;
        tabLayout.a(this);
        findViewById(R.id.home).setOnClickListener(new iip());
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ujp.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.v = (ujp) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(e400.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        e400 e400Var = (e400) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.i = e400Var;
        e400Var.e = log0.a;
        e400Var.y1();
        f1i f1iVar = new f1i(this.i.x1());
        s9s.b bVar = s9s.b.c;
        int i = 0;
        yyh.a(f1iVar, this, bVar, new jip(this, i), null);
        yyh.b(this.v.d, this, bVar, new kip(this, i));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.f.a = 0L;
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }
}
