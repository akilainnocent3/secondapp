package com.sportybet.plugin.realsports.activities;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.sporty.android.book.data.entity.UserPref;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.plugin.webcontainer.widget.AlertMessage;
import defpackage.b320;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.e320;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.j7g;
import defpackage.jq40;
import defpackage.ki80;
import defpackage.kzh;
import defpackage.n8j0;
import defpackage.o8i0;
import defpackage.ozh;
import defpackage.qoa0;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.tlf;
import defpackage.ull;
import defpackage.uqm;
import defpackage.v8i0;
import defpackage.yzh;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AlertBannerActivity extends ull implements View.OnClickListener {
    public String b;
    public String c;
    public e320 d;
    public uqm e;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.banner_close) {
            finish();
            return;
        }
        if (id != R.id.banner_opt_out) {
            if (id == R.id.banner_img) {
                sh8.c().f(getIntent().getStringExtra("link"), null, Sender.HOMEPAGE_POPUP_BANNER);
                finish();
                return;
            }
            return;
        }
        e320 e320Var = this.d;
        String str = this.b;
        e320Var.getClass();
        str.getClass();
        ki80 ki80Var = e320Var.b;
        ki80Var.getClass();
        kzh.d(new yzh(ozh.c(ki80Var.a.e(new UserPref(str, String.valueOf(true))), ki80Var.b), new b320(3, null)), o8i0.d(e320Var));
        String cMSString = getCMSString(R.string.component_pop_dialog__opted_out_settings, new Object[0]);
        String cMSString2 = getCMSString(R.string.component_pop_dialog__opted_out, this.c, cMSString);
        int iIndexOf = cMSString2.indexOf(cMSString);
        int length = cMSString.length() + iIndexOf;
        j7g j7gVar = new j7g();
        j7gVar.a(cMSString2);
        j7gVar.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.highlight)), iIndexOf, length, 17);
        AlertMessage.show((Context) this, (CharSequence) j7gVar, true, true);
        finish();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_alert_banner);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(e320.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d = (e320) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(true);
            cVar.c(true);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, true);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        findViewById(R.id.banner_close).setOnClickListener(this);
        this.b = getIntent().getStringExtra("configKey");
        this.c = getIntent().getStringExtra("configName");
        TextView textView = (TextView) findViewById(R.id.banner_opt_out);
        textView.setVisibility((this.b == null || !this.e.isLogin()) ? 8 : 0);
        textView.setOnClickListener(this);
        j7g j7gVar = new j7g();
        j7gVar.a(getCMSString(R.string.component_pop_dialog__opt_out, this.c));
        j7gVar.n(j7gVar);
        textView.setText(j7gVar);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.banner_img);
        aspectRatioImageView.setAspectRatio(getIntent().getFloatExtra("ratio", 1.0f));
        aspectRatioImageView.setOnClickListener(this);
        sh8.a().a(getIntent().getStringExtra("img"), aspectRatioImageView);
    }
}
