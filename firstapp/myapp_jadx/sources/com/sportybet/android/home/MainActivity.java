package com.sportybet.android.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import androidx.camera.camera2.WgU.PSAHO;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTabHost;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.pairip.VMRunner;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sporty.android.core.model.pocket.globalpay.HNZU.MiEqxQsUF;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.globalpay.pixBtg.Uhb.alfXM;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.router.Sender;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.core.segmentation.HomeSegment;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import com.sportybet.plugin.realsports.activities.AlertDialogActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedDisplayData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import com.sportygames.goldmine.collections.data.model.Xl.geREyionyDzWw;
import defpackage.aj90;
import defpackage.b1z;
import defpackage.bb40;
import defpackage.br3;
import defpackage.cw;
import defpackage.cyb;
import defpackage.d1f0;
import defpackage.d2t;
import defpackage.d740;
import defpackage.dfm;
import defpackage.dlc0;
import defpackage.dq7;
import defpackage.erb;
import defpackage.f00;
import defpackage.f1z;
import defpackage.fb90;
import defpackage.fbe0;
import defpackage.h3a0;
import defpackage.hb5;
import defpackage.hp0;
import defpackage.i2i;
import defpackage.i420;
import defpackage.ibs;
import defpackage.iim;
import defpackage.ilk;
import defpackage.iv6;
import defpackage.iym;
import defpackage.jox;
import defpackage.jq40;
import defpackage.jrm;
import defpackage.juj;
import defpackage.jwl;
import defpackage.jxf0;
import defpackage.k650;
import defpackage.lfy;
import defpackage.lit;
import defpackage.lwj0;
import defpackage.m0t;
import defpackage.mc40;
import defpackage.miu;
import defpackage.mlk;
import defpackage.mll0;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.n0z;
import defpackage.nkb;
import defpackage.nnf;
import defpackage.nym;
import defpackage.nzm;
import defpackage.o7d;
import defpackage.oke;
import defpackage.oku;
import defpackage.omh0;
import defpackage.ov6;
import defpackage.psm;
import defpackage.py1;
import defpackage.r0b;
import defpackage.r7d;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rym;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.snx;
import defpackage.tzf0;
import defpackage.u420;
import defpackage.u43;
import defpackage.v0;
import defpackage.v420;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vsm;
import defpackage.vym;
import defpackage.vzy;
import defpackage.wae;
import defpackage.wsm;
import defpackage.xyd0;
import defpackage.xym;
import defpackage.y1k0;
import defpackage.y8j;
import defpackage.ydv;
import defpackage.ykc0;
import defpackage.yrh0;
import defpackage.ys6;
import defpackage.zch0;
import defpackage.zyf0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends jwl implements fb90, xym, juj, v420, vym, cw, u43, lit, FeaturedContainer.b, bb40 {
    public static final /* synthetic */ int m0 = 0;
    public String A;
    public TextView C;
    public ImageView D;
    public n0z F;
    public d740 G;
    public aj90 H;
    public oku I;
    public ov6 J;
    public nnf K;
    public snx L;
    public mc40 O;
    public y8j P;
    public psm Q;
    public erb R;
    public vsm S;
    public nym T;
    public rdd0 U;
    public rym V;
    public i420 W;
    public jrm X;
    public nzm Y;
    public iym Z;
    public ys6 a0;
    public k650 b0;
    public PopupWindow c;
    public lwj0 c0;
    public FragmentTabHost d;
    public wsm d0;
    public TabWidget e;
    public ykc0 e0;
    public LayoutInflater f;
    public dlc0 f0;
    public b1z g0;
    public y1k0 h0;
    public jxf0 i0;
    public miu j0;
    public boolean v;
    public boolean w;
    public boolean y;
    public String z;
    public boolean b = false;
    public final ArrayList<d1f0> i = new ArrayList<>(4);
    public int B = -1;
    public boolean E = true;
    public int M = -1;
    public boolean N = true;
    public final a k0 = new a();
    public final b l0 = new b();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("mRhHHErV9hAN5GYE", new Object[]{this, context, intent});
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MainActivity.this.y = false;
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HomeSegment.values().length];
            a = iArr;
            try {
                iArr[HomeSegment.Sports.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HomeSegment.SportsDominant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HomeSegment.Games.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HomeSegment.GamesDominant.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final iv6 A1() {
        String cMSString;
        if (this.Q.W() || this.Q.F()) {
            cMSString = getCMSString(R.string.default_game_tab_img_url_br, new Object[0]);
        } else {
            cMSString = this.Q.O() ? getCMSString(R.string.default_game_tab_img_url_za, new Object[0]) : getCMSString(R.string.default_game_tab_img_url, new Object[0]);
        }
        return new iv6(o7d.a(wae.GAMES_LOBBY), cMSString, C1());
    }

    public final int B1() {
        if (this.Q.W() || this.Q.F()) {
            return R.drawable.tab_games_color_br;
        }
        return this.Q.O() ? R.drawable.tab_games_selector_colored_za : R.drawable.tab_games_color;
    }

    public final String C1() {
        return getCMSString(this.Q.O() ? R.string.wap_home__games__ZA : R.string.wap_home__games, new Object[0]);
    }

    @Override // defpackage.u43
    public final void D() {
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int D1(String str) {
        int i;
        if (str.equals("Home")) {
            HomeSegment homeSegment = (HomeSegment) this.I.r0.d();
            if (homeSegment == null || (i = c.a[homeSegment.ordinal()]) == 1 || i == 2) {
                str = "Sports";
            } else if (i == 3 || i == 4) {
                str = "Game";
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList<d1f0> arrayList = this.i;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (arrayList.get(i2).a.equals(str)) {
                return i2;
            }
            i2++;
        }
    }

    @Override // defpackage.v420
    public final u420 E() {
        FragmentTabHost fragmentTabHost = this.d;
        if (fragmentTabHost == null) {
            return u420.i.a;
        }
        int currentTab = fragmentTabHost.getCurrentTab();
        if (currentTab == D1("Sports")) {
            return u420.d.a;
        }
        if (currentTab == D1("AZ Menu")) {
            return u420.a.a;
        }
        if (currentTab == D1("Open Bets")) {
            n0z n0zVar = this.F;
            return (n0zVar == null || n0zVar.D.a.getValue() != f1z.BetHistory) ? u420.h.a : u420.b.a;
        }
        if (currentTab == D1("Me")) {
            return u420.g.a;
        }
        return currentTab == D1("Game") ? u420.c.a : u420.i.a;
    }

    @Override // defpackage.fb90
    public final void F(boolean z) {
        this.b = z;
    }

    public final void F1(Intent intent) {
        if (this.I.Z) {
            if (intent.getStringExtra("tab_tag") == null) {
                FragmentTabHost fragmentTabHost = this.d;
                String currentTabTag = fragmentTabHost != null ? fragmentTabHost.getCurrentTabTag() : null;
                if (!TextUtils.isEmpty(currentTabTag)) {
                    intent.putExtra("tab_tag", currentTabTag);
                }
            }
            finish();
            intent.removeExtra(py1.PENDING_RECREATE_ACTIVITY);
            this.I.Z = false;
            startActivity(intent);
        }
    }

    public final void G1() {
        int iB1 = B1();
        d1f0 d1f0Var = new d1f0(R.drawable.tab_today, dfm.class, "Sports", getCMSString(R.string.wap_main_bottom_nav__home, new Object[0]));
        d1f0 d1f0Var2 = new d1f0(R.drawable.tab_az_menu, v0.class, "AZ Menu", getCMSString(R.string.wap_main_bottom_nav__az_menu, new Object[0]));
        d1f0 d1f0Var3 = new d1f0(R.drawable.tab_cashout, vzy.class, "Open Bets", getCMSString(R.string.wap_main_bottom_nav__open_bets, new Object[0]));
        d1f0 d1f0Var4 = new d1f0(R.drawable.tab_me, ydv.class, "Me", getCMSString(R.string.wap_main_bottom_nav__me, new Object[0]));
        ArrayList<d1f0> arrayList = this.i;
        arrayList.add(d1f0Var);
        arrayList.add(d1f0Var2);
        iv6 iv6VarZ1 = z1();
        String str = iv6VarZ1.a;
        this.z = str;
        this.A = iv6VarZ1.b;
        if (str.toLowerCase().contains("games")) {
            arrayList.add(new d1f0(iB1, m0t.class, "Game", C1()));
        } else {
            arrayList.add(new d1f0(0, fbe0.class, "Promote", iv6VarZ1.c));
        }
        arrayList.add(d1f0Var3);
        arrayList.add(d1f0Var4);
        this.d.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        this.f = getLayoutInflater();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            d1f0 d1f0Var5 = arrayList.get(i);
            i++;
            d1f0 d1f0Var6 = d1f0Var5;
            TabHost.TabSpec tabSpecNewTabSpec = this.d.newTabSpec(d1f0Var6.a);
            int i2 = size;
            View viewInflate = this.f.inflate(R.layout.tab_indicator, (ViewGroup) null);
            K1(viewInflate, d1f0Var6);
            tabSpecNewTabSpec.setIndicator(viewInflate);
            try {
                this.d.a(tabSpecNewTabSpec, d1f0Var6.d);
            } catch (Exception unused) {
            }
            size = i2;
        }
        this.d.getTabWidget().setShowDividers(0);
        if (!str.toLowerCase().contains("games")) {
            this.d.getTabWidget().getChildAt(D1("Promote")).setOnClickListener(new View.OnClickListener() { // from class: hiu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = MainActivity.m0;
                    sh8.c().e(this.a.z);
                }
            });
        }
        this.C = (TextView) this.d.getTabWidget().getChildAt(D1("Open Bets")).findViewById(R.id.count);
        this.D = (ImageView) this.d.getTabWidget().getChildAt(D1("Me")).findViewById(R.id.red_dot);
        oku okuVar = this.I;
        if (okuVar != null) {
            boolean zEquals = Boolean.TRUE.equals(okuVar.b0.d());
            ImageView imageView = this.D;
            if (zEquals) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        this.F.A.f(this, new lfy() { // from class: tiu
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i3 = MainActivity.m0;
                int i4 = ((wyy) obj).a;
                MainActivity mainActivity = this.a;
                if (mainActivity.C == null) {
                    return;
                }
                if (mainActivity.getAccountHelper().getAccount() == null || i4 <= 0) {
                    mainActivity.C.setVisibility(8);
                } else {
                    mainActivity.C.setVisibility(0);
                    String strValueOf = String.valueOf(i4);
                    if (strValueOf.length() >= 3) {
                        strValueOf = "99+";
                    }
                    mainActivity.C.setText(strValueOf);
                }
                tzf0.j(mainActivity, i4);
            }
        });
        I1();
        J1();
        this.d.setOnTabChangedListener(new TabHost.OnTabChangeListener() { // from class: eju
            @Override // android.widget.TabHost.OnTabChangeListener
            public final void onTabChanged(String str2) {
                String str3;
                MainActivity mainActivity = this.a;
                int i3 = MainActivity.m0;
                mainActivity.V.d(mainActivity.E());
                mainActivity.J1();
                int iD1 = mainActivity.D1("Game");
                int currentTab = mainActivity.d.getCurrentTab();
                if (mainActivity.M == iD1 && currentTab != iD1) {
                    if (currentTab == mainActivity.D1("Sports")) {
                        str3 = AnalyticsParam.EVENT_PARAM_SPORTY_SPORTS_TAB;
                    } else if (currentTab == mainActivity.D1("AZ Menu")) {
                        str3 = AnalyticsParam.EVENT_PARAM_AZ_MENU;
                    } else if (currentTab == mainActivity.D1("Open Bets")) {
                        str3 = AnalyticsParam.EVENT_PARAM_OPEN_BETS;
                    } else {
                        str3 = currentTab == mainActivity.D1("Me") ? AnalyticsParam.EVENT_PARAM_ME_BOTTOM : "UnknownTab";
                    }
                    Bundle bundleA = mll0.a(AnalyticsParam.EVENT_KEY_BOTTOM_TAB, str3);
                    f00 f00Var = vgb0.a;
                    vgb0.b(AnalyticsEvent.EVENT_LOBBY_EXIT, bundleA);
                    mainActivity.a0.logEvent(AnalyticsEvent.EVENT_LOBBY_EXIT, bundleA);
                }
                if (mainActivity.d.getCurrentTab() == mainActivity.D1("Me")) {
                    PopupWindow popupWindow = mainActivity.c;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                    wwd0 wwd0Var = mainActivity.I.a0;
                    Boolean bool = Boolean.FALSE;
                    wwd0Var.getClass();
                    wwd0Var.k(null, bool);
                }
                if (mainActivity.d.getCurrentTab() == mainActivity.D1("Game")) {
                    ((br3) mmc.a(hp0.A, br3.class)).U().a(mainActivity, false);
                    if (mainActivity.N) {
                        mainActivity.a0.logEvent(AnalyticsEvent.EVENT_LOBBY_LAUNCH, mll0.a(AnalyticsParam.EVENT_KEY_GAMES_ENTRY_POINT, AnalyticsParam.EVENT_PARAM_CENTER_TAB));
                    }
                    mainActivity.N = true;
                }
                oku okuVar2 = mainActivity.I;
                if (okuVar2 != null) {
                    okuVar2.z1();
                }
                if (mainActivity.d.getCurrentTab() == mainActivity.D1("Open Bets")) {
                    mainActivity.g0.n(b1z.b.NavBar);
                    mainActivity.g0.k();
                }
                mainActivity.M = mainActivity.d.getCurrentTab();
                mainActivity.I.r0.l(mainActivity);
            }
        });
        this.d.getTabWidget().getChildAt(D1("Open Bets")).setOnTouchListener(new View.OnTouchListener() { // from class: lju
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i3 = MainActivity.m0;
                MainActivity mainActivity = this.a;
                boolean zD = mainActivity.X.D();
                if (zD) {
                    mainActivity.K.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
                }
                if (!zD) {
                    try {
                        if (motionEvent.getAction() == 1) {
                            mainActivity.H1("Open Bets");
                        }
                    } catch (Exception unused2) {
                    }
                }
                return zD;
            }
        });
        try {
            this.d.getTabWidget().getChildAt(D1("Sports")).setOnTouchListener(new View.OnTouchListener() { // from class: nju
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i3 = MainActivity.m0;
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    this.a.H1("Sports");
                    return false;
                }
            });
            this.d.getTabWidget().getChildAt(D1("AZ Menu")).setOnTouchListener(new View.OnTouchListener() { // from class: pju
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i3 = MainActivity.m0;
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    this.a.H1("AZ Menu");
                    return false;
                }
            });
            this.d.getTabWidget().getChildAt(D1("Me")).setOnTouchListener(new View.OnTouchListener() { // from class: rju
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i3 = MainActivity.m0;
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    this.a.H1("Me");
                    return false;
                }
            });
            if (str.toLowerCase().contains("games")) {
                this.d.getTabWidget().getChildAt(D1("Game")).setOnTouchListener(new View.OnTouchListener() { // from class: tju
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i3 = MainActivity.m0;
                        if (motionEvent.getAction() != 1) {
                            return false;
                        }
                        this.a.H1("Game");
                        return false;
                    }
                });
            }
        } catch (Exception unused2) {
        }
        E1(getIntent());
        this.i0.b(this.d);
        this.I.r0.f(this, new lfy() { // from class: vju
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                HomeSegment homeSegment = (HomeSegment) obj;
                int i3 = MainActivity.m0;
                if (homeSegment != null) {
                    int i4 = MainActivity.c.a[homeSegment.ordinal()];
                    MainActivity mainActivity = this.a;
                    if (i4 == 1 || i4 == 2) {
                        mainActivity.d.setCurrentTab(mainActivity.D1("Sports"));
                    } else if (i4 == 3 || i4 == 4) {
                        mainActivity.d.setCurrentTab(mainActivity.D1("Game"));
                    }
                }
            }
        });
    }

    public final void H1(String str) {
        String str2;
        int currentTab = -1;
        switch (str) {
            case "Sports":
                str2 = AnalyticsEvent.BOTTOM_NAV_SPORTS_CLICK;
                break;
            case "Open Bets":
                str2 = AnalyticsEvent.BOTTOM_NAV_OPEN_BETS_CLICK;
                break;
            case "Me":
                str2 = AnalyticsEvent.BOTTOM_NAV_ME_CLICK;
                break;
            case "Game":
                str2 = AnalyticsEvent.BOTTOM_NAV_CASINO_CLICK;
                break;
            case "AZ Menu":
                str2 = AnalyticsEvent.BOTTOM_NAV_AZ_CLICK;
                break;
            default:
                str2 = AnalyticsEvent.BOTTOM_NAV_NA;
                break;
        }
        try {
            int iD1 = D1(str);
            if (!AnalyticsEvent.BOTTOM_NAV_NA.equals(str2) && iD1 != -1) {
                int i = this.M;
                if (i != -1) {
                    currentTab = i;
                } else {
                    FragmentTabHost fragmentTabHost = this.d;
                    if (fragmentTabHost != null) {
                        currentTab = fragmentTabHost.getCurrentTab();
                    }
                }
                if (currentTab != iD1) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(str2);
                    this.Z.d(str2);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.juj
    public final FeaturedContainer I0(Context context, ibs ibsVar) {
        final FeaturedContainer featuredContainer = new FeaturedContainer(context, (AttributeSet) null, 0, true);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(iim.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return null;
        }
        i2i.b(((iim) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).n0).f(ibsVar, new lfy() { // from class: cju
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                FeaturedDisplayData featuredDisplayData = (FeaturedDisplayData) obj;
                int i = MainActivity.m0;
                if (featuredDisplayData == null) {
                    return;
                }
                featuredContainer.T(featuredDisplayData, null, false);
            }
        });
        featuredContainer.setActionListener(this);
        return featuredContainer;
    }

    public final void I1() {
        if (this.C == null) {
            return;
        }
        if (getAccountHelper().getAccount() != null) {
            this.F.A1();
        } else {
            this.C.setVisibility(8);
            tzf0.j(this, 0);
        }
    }

    @Override // defpackage.fb90
    public final boolean J0() {
        return this.b;
    }

    public final void J1() {
        for (int i = 0; i < this.i.size(); i++) {
            View childAt = this.d.getTabWidget().getChildAt(i);
            int currentTab = this.d.getCurrentTab();
            View viewFindViewById = childAt.findViewById(R.id.tab_im_bottom);
            TextView textView = (TextView) childAt.findViewById(R.id.tab_txt);
            if (currentTab == i) {
                viewFindViewById.setVisibility(0);
                textView.setVisibility(4);
            } else {
                viewFindViewById.setVisibility(4);
                textView.setVisibility(0);
            }
        }
    }

    public final void K1(View view, d1f0 d1f0Var) {
        ImageView imageView = (ImageView) view.findViewById(R.id.tab_img);
        TextView textView = (TextView) view.findViewById(R.id.tab_txt);
        StringBuilder sb = new StringBuilder("tab_");
        String str = d1f0Var.a;
        sb.append(str.trim().toLowerCase(Locale.ROOT).replace(' ', '_'));
        String string = sb.toString();
        view.setContentDescription(string);
        imageView.setContentDescription(string.concat("_img"));
        textView.setContentDescription(string.concat("_txt"));
        int i = d1f0Var.b;
        if (i > 0) {
            imageView.setImageResource(i);
        } else {
            sh8.a().a(this.A, imageView);
        }
        if (!TextUtils.isEmpty(d1f0Var.c)) {
            textView.setText(d1f0Var.c);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (str.equalsIgnoreCase("Game") && this.Q.O()) {
            layoutParams.width = zch0.b(getResources(), 28);
            layoutParams.height = zch0.b(getResources(), 28);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            layoutParams.width = zch0.b(getResources(), 22);
            layoutParams.height = zch0.b(getResources(), 22);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void a(Event event) {
        Sport sport;
        String str;
        String str2 = event.eventId;
        if (str2 == null || (sport = event.sport) == null || (str = sport.id) == null) {
            return;
        }
        xyd0 xyd0VarA = xyd0.a.a(str2, str, event.isLiveOrFinished(), event.eventSource);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        aVarA.e(0, xyd0VarA, "StatisticsDialogFragment", 1);
        aVarA.k(true, true);
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void c(Event event) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        ilk ilkVar = new ilk();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
        aVar.c("GiftGrabPromotionDialogFragment");
        aVar.d();
        LinkedHashSet linkedHashSet = mlk.a;
        if (mlk.a(event.eventId)) {
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        FragmentTabHost fragmentTabHost = this.d;
        b bVar = this.l0;
        fragmentTabHost.removeCallbacks(bVar);
        if (((Boolean) this.G.G.a.getValue()).booleanValue()) {
            this.G.A1(new nkb(this, 1));
            return true;
        }
        if (this.y) {
            if (this.d.getCurrentTab() != D1("AZ Menu")) {
                return false;
            }
            finish();
            return true;
        }
        zyf0.b(R.string.app_common__press_once_again_to_exit, 0);
        this.y = true;
        this.d.postDelayed(bVar, 2000L);
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        geREyionyDzWw.bNvk.invoke(null, this, bundle);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.KooavzlPqM.invoke(null, this);
    }

    @Override // defpackage.lit
    public final void onLogin() {
        iym iymVar = this.Z;
        PageMeta.INSTANCE.getClass();
        iymVar.f(AnalyticsEvent.VISITOR_INIT, PageMeta.Companion.b());
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.B = -1;
        setIntent(intent);
        E1(intent);
        F1(intent);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() throws IllegalAccessException, InvocationTargetException {
        PSAHO.FlnECRXo.invoke(null, this);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        alfXM.spYIctwROGppkpP.invoke(null, this);
    }

    @Override // androidx.fragment.app.e
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.v = true;
        if (this.w) {
            this.w = false;
            G1();
        } else {
            I1();
        }
        D1("Open Bets");
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FragmentTabHost fragmentTabHost = this.d;
        bundle.putInt("selected_tab", fragmentTabHost != null ? fragmentTabHost.getCurrentTab() : -1);
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void s(Event event, String str, String str2) {
    }

    @Override // defpackage.py1
    public final void saveDataBeforeRecreate() {
        if (getLifecycle().b().compareTo(s9s.b.e) >= 0) {
            return;
        }
        getIntent().putExtra(py1.PENDING_RECREATE_ACTIVITY, true);
        this.I.Z = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final iv6 z1() {
        ov6 ov6Var = this.J;
        if (ov6Var == null) {
            return A1();
        }
        jox joxVar = (jox) ov6Var.d.d();
        if (joxVar == null) {
            return A1();
        }
        return joxVar instanceof jox.a ? (iv6) ((jox.a) joxVar).a : A1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E1(Intent intent) {
        int iD1;
        int i;
        if (intent == null) {
            return;
        }
        Object[] objArr = {"utm_source", "utm_campaign", "utm_medium", "utm_content", "utm_term"};
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        LinkedHashMap linkedHashMapA = omh0.a(intent.getDataString(), Collections.unmodifiableList(arrayList));
        if (linkedHashMapA != null && !linkedHashMapA.isEmpty()) {
            mpe0 mpe0Var = r7d.a;
            ArrayList arrayList2 = new ArrayList(linkedHashMapA.size());
            for (Map.Entry entry : linkedHashMapA.entrySet()) {
                arrayList2.add(entry.getKey() + "=" + entry.getValue());
            }
            String strA0 = CollectionsKt.a0(arrayList2, "&", null, null, null, 62);
            r7d.b = strA0;
            ((r7d.a) r7d.a.getValue()).e.a(r7d.a.f[0], strA0);
        }
        Uri data = intent.getData();
        if (data != null) {
            String stringExtra = intent.getStringExtra("tab_tag");
            if (this.d != null && !TextUtils.isEmpty(stringExtra)) {
                this.d.setCurrentTab(D1(stringExtra));
                intent.removeExtra("tab_tag");
            }
            this.i0.a();
            sh8.c().d(data, null, Sender.DIRECT_URL);
            intent.setData(null);
            return;
        }
        if (this.d != null) {
            String stringExtra2 = intent.getStringExtra("tab_tag");
            if (TextUtils.isEmpty(stringExtra2)) {
                int i3 = this.B;
                if (i3 != -1) {
                    this.d.setCurrentTab(i3);
                    return;
                }
                String str = dqvOSm.tQKSlJPJQDBhR;
                int intExtra = intent.getIntExtra(str, 0);
                if (intExtra == 1) {
                    iD1 = D1("AZ Menu");
                } else if (intExtra == 2) {
                    iD1 = D1("Game");
                    Bundle extras = intent.getExtras();
                    v8i0 viewModelStore = getViewModelStore();
                    r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
                    cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                    dq7 dq7VarA = jq40.a(d2t.class);
                    String strI = dq7VarA.i();
                    if (strI == null) {
                        hb5.a("Local and anonymous classes can not be ViewModels");
                        return;
                    }
                    d2t d2tVar = (d2t) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                    if (extras != null) {
                        d2tVar.b.m(extras);
                        if (extras.size() == 1 && extras.containsKey(str) && extras.getInt(str, -1) == 2) {
                            this.a0.logEvent(AnalyticsEvent.EVENT_LOBBY_LAUNCH, mll0.a(AnalyticsParam.EVENT_KEY_GAMES_ENTRY_POINT, AnalyticsParam.EVENT_PARAM_SPORTS_BANNER));
                            this.N = false;
                        }
                    }
                } else if (intExtra != 3) {
                    iD1 = intExtra != 4 ? D1("Home") : D1("Me");
                } else {
                    iD1 = D1("Open Bets");
                    n0z n0zVar = this.F;
                    if (n0zVar != null) {
                        n0zVar.F.m(Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_TO_OPENBET", false)));
                        this.F.G.m(Integer.valueOf(getIntent().getIntExtra("tab_index", 10)));
                        this.F.getClass();
                    }
                }
                intent.removeExtra(str);
                this.d.setCurrentTab(iD1);
            } else if (stringExtra2.equals("Home")) {
                HomeSegment homeSegment = (HomeSegment) this.I.r0.d();
                if (homeSegment == null || (i = c.a[homeSegment.ordinal()]) == 1 || i == 2) {
                    this.d.setCurrentTab(D1("Sports"));
                } else if (i == 3 || i == 4) {
                    this.d.setCurrentTab(D1("Game"));
                }
            } else {
                this.d.setCurrentTabByTag(stringExtra2);
                intent.removeExtra("tab_tag");
            }
        }
        int intExtra2 = intent.getIntExtra("extra_uncaught_exception", -1);
        if (intExtra2 == 3001) {
            String cMSString = getCMSString(R.string.common_functions__later, new Object[0]);
            SpannableString spannableString = new SpannableString(cMSString);
            spannableString.setSpan(new ForegroundColorSpan(-7829368), 0, cMSString.length(), 0);
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this);
            aVar.d(R.string.common_functions__attention);
            aVar.a(R.string.app_common__chrome_outdated);
            androidx.appcompat.app.b.a positiveButton = aVar.setPositiveButton(R.string.common_functions__update, new DialogInterface.OnClickListener() { // from class: qiu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    int i5 = MainActivity.m0;
                    this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.android.chrome")));
                }
            });
            positiveButton.b(spannableString, null);
            androidx.appcompat.app.b bVarCreate = positiveButton.create();
            bVarCreate.setCanceledOnTouchOutside(false);
            bVarCreate.show();
        } else if (intExtra2 == 3002) {
            Intent intent2 = new Intent(this, (Class<?>) AlertDialogActivity.class);
            intent2.putExtra("EXTRA_MESSAGE", R.string.install_update_android_system_webview);
            yrh0.s(this, intent2, true);
        }
        if (getIntent() == null || !getIntent().getBooleanExtra("show_deposit_successful_message", false)) {
            return;
        }
        getIntent().removeExtra("show_deposit_successful_message");
        View viewFindViewById = findViewById(android.R.id.tabhost);
        viewFindViewById.getClass();
        Context context = viewFindViewById.getContext();
        context.getClass();
        h3a0 h3a0Var = new h3a0(viewFindViewById);
        h3a0Var.b = sn5.b(context, R.string.page_payment__your_deposit_was_successful, new Object[0]);
        Snackbar snackbarA = h3a0Var.a();
        if (snackbarA != null) {
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarA.i;
            snackbarBaseLayout.getClass();
            ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int iA = r0b.a(context, 12);
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin + iA, marginLayoutParams.topMargin, marginLayoutParams.rightMargin + iA, marginLayoutParams.bottomMargin);
                snackbarBaseLayout.setLayoutParams(marginLayoutParams);
            }
        }
        if (snackbarA != null) {
            snackbarA.j();
        }
    }
}
