package com.sportybet.plugin.realsports.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.CommonTitleBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.jackpot.BannerPanel;
import com.sportybet.plugin.realsports.jackpot.ObservableScrollView;
import defpackage.g6p;
import defpackage.oke;
import defpackage.p7p;
import defpackage.r6p;
import defpackage.x5p;

/* JADX INFO: loaded from: classes7.dex */
public class JackpotPlaceBetActivity extends p7p implements View.OnClickListener, TabLayout.d, ObservableScrollView.a {
    public long A;
    public long B;
    public BannerPanel d;
    public x5p e;
    public r6p f;
    public g6p i;
    public CommonTitleBar v;
    public TabLayout w;
    public ObservableScrollView y;
    public float z = 56.0f;
    public boolean C = false;

    public class a implements BannerPanel.c {
        public a() {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            JackpotPlaceBetActivity jackpotPlaceBetActivity = JackpotPlaceBetActivity.this;
            jackpotPlaceBetActivity.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            jackpotPlaceBetActivity.z = jackpotPlaceBetActivity.d.getHeight() - jackpotPlaceBetActivity.v.getHeight();
            jackpotPlaceBetActivity.y.setOnObservableScrollViewListener(jackpotPlaceBetActivity);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        int i = gVar.e;
        if (i == 0) {
            if (this.e == null) {
                this.e = new x5p();
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.f(R.id.jackpot_frame, this.e, null);
            aVarA.d();
            return;
        }
        if (i == 1) {
            if (this.f == null) {
                this.f = new r6p();
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a aVarA2 = oke.a(supportFragmentManager2, supportFragmentManager2);
            aVarA2.f(R.id.jackpot_frame, this.f, null);
            aVarA2.d();
            return;
        }
        if (i != 2) {
            return;
        }
        if (this.i == null) {
            this.i = new g6p();
        }
        FragmentManager supportFragmentManager3 = getSupportFragmentManager();
        androidx.fragment.app.a aVarA3 = oke.a(supportFragmentManager3, supportFragmentManager3);
        aVarA3.f(R.id.jackpot_frame, this.i, null);
        aVarA3.d();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    @Override // defpackage.p7p, defpackage.r1k
    public final boolean onBackPressedCompat() {
        return this.C;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.back_icon) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_jackport_main_page);
        this.v = (CommonTitleBar) findViewById(R.id.title_bar);
        this.d = (BannerPanel) findViewById(R.id.jackpot_banner);
        findViewById(R.id.back_icon).setOnClickListener(this);
        ((TextView) findViewById(R.id.back_title)).setText(getCMSString(R.string.common_functions__jackpot, new Object[0]));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.jackpot_tab);
        this.w = tabLayout;
        TabLayout.g gVarL = tabLayout.l();
        gVarL.e(getCMSString(R.string.app_common__sporty_11, new Object[0]));
        tabLayout.b(gVarL);
        TabLayout tabLayout2 = this.w;
        TabLayout.g gVarL2 = tabLayout2.l();
        gVarL2.e(getCMSString(R.string.jackpot__previous_results, new Object[0]));
        tabLayout2.b(gVarL2);
        TabLayout tabLayout3 = this.w;
        TabLayout.g gVarL3 = tabLayout3.l();
        gVarL3.e(getCMSString(R.string.jackpot__how_to_play, new Object[0]));
        tabLayout3.b(gVarL3);
        this.w.a(this);
        this.y = (ObservableScrollView) findViewById(R.id.jackpot_scroll_view);
        BannerPanel bannerPanel = this.d;
        if (!bannerPanel.z) {
            bannerPanel.y.K();
            bannerPanel.z = true;
            bannerPanel.a.d().G(new com.sportybet.plugin.realsports.jackpot.a(bannerPanel));
        }
        this.d.setTimeCountListener(new a());
        this.v = (CommonTitleBar) findViewById(R.id.title_bar);
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        if (bundle == null) {
            this.e = new x5p();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.e(R.id.jackpot_frame, this.e, null, 1);
            aVarA.d();
        }
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        BannerPanel bannerPanel = this.d;
        Handler handler = bannerPanel.C;
        if (handler != null) {
            handler.removeMessages(1);
            bannerPanel.C = null;
        }
    }
}
