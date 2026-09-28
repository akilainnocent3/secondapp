package com.sportybet.plugin.jackpot.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.plugin.jackpot.widget.BannerPanel;
import com.sportybet.plugin.jackpot.widget.CommonTitleBar;
import com.sportybet.plugin.jackpot.widget.ObservableScrollView;
import defpackage.bag;
import defpackage.bb40;
import defpackage.c7p;
import defpackage.eag;
import defpackage.f6p;
import defpackage.ktl;
import defpackage.o7p;
import defpackage.oke;
import defpackage.q5p;
import defpackage.s6p;
import defpackage.tj5;

/* JADX INFO: loaded from: classes4.dex */
public class JackpotMainActivity extends ktl implements View.OnClickListener, TabLayout.d, ObservableScrollView.a, bb40 {
    public static final /* synthetic */ int C = 0;
    public q5p B;
    public BannerPanel b;
    public c7p c;
    public s6p d;
    public f6p e;
    public CommonTitleBar f;
    public TabLayout i;
    public ObservableScrollView v;
    public long y;
    public long z;
    public float w = 56.0f;
    public boolean A = false;

    public class a implements BannerPanel.d {
        public a() {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            JackpotMainActivity jackpotMainActivity = JackpotMainActivity.this;
            jackpotMainActivity.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            jackpotMainActivity.w = jackpotMainActivity.b.getHeight() - jackpotMainActivity.f.getHeight();
            jackpotMainActivity.v.setOnObservableScrollViewListener(jackpotMainActivity);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Sender.values().length];
            a = iArr;
            try {
                iArr[Sender.DIRECT_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Sender.AZ_MENU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Sender.HOMEPAGE_SPORTY_STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Sender.HOMEPAGE_TOP_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Sender.HOMEPAGE_SPORTY_BANNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Sender.HOMEPAGE_POPULAR_BANNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Sender.HOMEPAGE_POPUP_BANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Sender.HOMEPAGE_FEATUREDGAMES_SECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Sender.GIFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Sender.APP_LINK_FROM_GAME_LOBBY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Sender.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[Sender.LUCKY_NUMBER_WINNING_POPUP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[Sender.HOMEPAGE_FEATURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[Sender.HOMEPAGE_LUCKY_NUMBER_HIGH_ODDS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[Sender.OPEN_BETS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        int i = gVar.e;
        if (i == 0) {
            q5p q5pVar = this.B;
            q5pVar.getClass();
            q5pVar.b(o7p.b.a);
            if (this.c == null) {
                this.c = new c7p();
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.f(R.id.jackpot_frame, this.c, null);
            aVarA.d();
            return;
        }
        if (i == 1) {
            q5p q5pVar2 = this.B;
            q5pVar2.getClass();
            q5pVar2.b(o7p.h.a);
            if (this.d == null) {
                this.d = new s6p();
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a aVarA2 = oke.a(supportFragmentManager2, supportFragmentManager2);
            aVarA2.f(R.id.jackpot_frame, this.d, null);
            aVarA2.d();
            return;
        }
        if (i != 2) {
            return;
        }
        q5p q5pVar3 = this.B;
        q5pVar3.getClass();
        q5pVar3.b(o7p.c.a);
        if (this.e == null) {
            this.e = new f6p();
        }
        FragmentManager supportFragmentManager3 = getSupportFragmentManager();
        androidx.fragment.app.a aVarA3 = oke.a(supportFragmentManager3, supportFragmentManager3);
        aVarA3.f(R.id.jackpot_frame, this.e, null);
        aVarA3.d();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return this.A;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.back_icon) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strK0;
        super.onCreate(bundle);
        setContentView(R.layout.jap_activity_main_page);
        this.f = (CommonTitleBar) findViewById(R.id.title_bar);
        this.b = (BannerPanel) findViewById(R.id.jackpot_banner);
        findViewById(R.id.back_icon).setOnClickListener(this);
        ((TextView) findViewById(R.id.back_title)).setText(getCMSString(R.string.common_functions__jackpot, new Object[0]));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.jackpot_tab);
        this.i = tabLayout;
        TabLayout.g gVarL = tabLayout.l();
        gVarL.e(getCMSString(R.string.jackpot__sporty, new Object[0]));
        tabLayout.b(gVarL);
        TabLayout tabLayout2 = this.i;
        TabLayout.g gVarL2 = tabLayout2.l();
        gVarL2.e(getCMSString(R.string.jackpot__previous_results, new Object[0]));
        tabLayout2.b(gVarL2);
        TabLayout tabLayout3 = this.i;
        TabLayout.g gVarL3 = tabLayout3.l();
        gVarL3.e(getCMSString(R.string.jackpot__how_to_play, new Object[0]));
        tabLayout3.b(gVarL3);
        this.i.a(this);
        this.v = (ObservableScrollView) findViewById(R.id.jackpot_scroll_view);
        this.b.b();
        this.b.setTimeCountListener(new a());
        this.f = (CommonTitleBar) findViewById(R.id.title_bar);
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        if (bundle == null) {
            this.c = new c7p();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.e(R.id.jackpot_frame, this.c, null, 1);
            aVarA.d();
            q5p q5pVar = this.B;
            bag bagVarA = tj5.a(getIntent());
            q5pVar.getClass();
            if (bagVarA == null || (strK0 = bagVarA.K0()) == null) {
                eag eagVar = eag.AZ_MENU;
                strK0 = "unknown";
            }
            q5pVar.b(new o7p.d(strK0));
        }
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        BannerPanel bannerPanel = this.b;
        Handler handler = bannerPanel.B;
        if (handler != null) {
            handler.removeMessages(1);
            bannerPanel.B = null;
        }
    }
}
