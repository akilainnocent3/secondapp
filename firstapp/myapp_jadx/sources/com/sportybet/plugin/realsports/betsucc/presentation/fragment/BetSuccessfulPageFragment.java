package com.sportybet.plugin.realsports.betsucc.presentation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.GenericPairButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.aa3;
import defpackage.ac3;
import defpackage.aj40;
import defpackage.azm;
import defpackage.b1z;
import defpackage.b9i0;
import defpackage.ba3;
import defpackage.bb3;
import defpackage.be;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.ca3;
import defpackage.ce;
import defpackage.cyb;
import defpackage.d2t;
import defpackage.da3;
import defpackage.dq7;
import defpackage.e0y;
import defpackage.ee;
import defpackage.ej5;
import defpackage.eja0;
import defpackage.erb;
import defpackage.f2p;
import defpackage.fe00;
import defpackage.fkl;
import defpackage.fks;
import defpackage.fse;
import defpackage.fz4;
import defpackage.g08;
import defpackage.gaj;
import defpackage.ge00;
import defpackage.gku;
import defpackage.gr0;
import defpackage.gy4;
import defpackage.h5e;
import defpackage.ha3;
import defpackage.hb5;
import defpackage.hu2;
import defpackage.i2i;
import defpackage.i420;
import defpackage.ime;
import defpackage.itf0;
import defpackage.ix1;
import defpackage.iym;
import defpackage.j9j;
import defpackage.ja3;
import defpackage.jq40;
import defpackage.k130;
import defpackage.k650;
import defpackage.k9j;
import defpackage.ka3;
import defpackage.kc3;
import defpackage.ktr;
import defpackage.l2u;
import defpackage.lc3;
import defpackage.lfy;
import defpackage.lq1;
import defpackage.m1u;
import defpackage.mc3;
import defpackage.mie0;
import defpackage.na3;
import defpackage.o0b;
import defpackage.o8i0;
import defpackage.oa3;
import defpackage.of20;
import defpackage.oml;
import defpackage.op8;
import defpackage.pfd;
import defpackage.psm;
import defpackage.qa3;
import defpackage.qq1;
import defpackage.qy4;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.rb3;
import defpackage.rdd0;
import defpackage.rws;
import defpackage.s8i0;
import defpackage.s93;
import defpackage.sa3;
import defpackage.sa90;
import defpackage.sch;
import defpackage.sd7;
import defpackage.sj5;
import defpackage.sn5;
import defpackage.szx;
import defpackage.t2y;
import defpackage.tch;
import defpackage.u2u;
import defpackage.u93;
import defpackage.ua3;
import defpackage.ud;
import defpackage.uqm;
import defpackage.v8i0;
import defpackage.va3;
import defpackage.vd;
import defpackage.via0;
import defpackage.vz80;
import defpackage.w1k;
import defpackage.wa3;
import defpackage.wga;
import defpackage.wsm;
import defpackage.wz80;
import defpackage.xa3;
import defpackage.y8j;
import defpackage.ya3;
import defpackage.yf3;
import defpackage.yie0;
import defpackage.yy4;
import defpackage.zch0;
import defpackage.zie;
import defpackage.zu7;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public class BetSuccessfulPageFragment extends oml implements k9j, j9j, fe00 {
    public static final /* synthetic */ int m0 = 0;
    public u2u A;
    public k650 B;
    public uqm C;
    public psm D;
    public azm E;
    public b1z F;
    public rdd0 G;
    public zie H;
    public of20 I;
    public u93 J;
    public tch K;
    public rws L;
    public sa90 M;
    public via0 N;
    public String O;
    public Order Q;
    public String R;
    public boolean S;
    public boolean T;
    public yf3 U;
    public yy4 W;
    public final AnimationSet Y;
    public eja0 Z;
    public b c0;
    public final ee<fkl.a> d0;
    public final ee<Intent> e0;
    public y8j f;
    public final ee<wz80> f0;
    public final ee<Unit> g0;
    public String h0;
    public erb i;
    public Boolean i0;
    public final ee<String> j0;
    public final a k0;
    public ge00 l0;
    public wsm v;
    public iym w;
    public lq1 y;
    public e z;
    public final long P = System.currentTimeMillis();
    public Long V = 0L;
    public boolean X = false;
    public boolean a0 = false;
    public boolean b0 = false;

    public class a extends ee<String> {
        public a() {
        }

        @Override // defpackage.ee
        public final vd<String, ?> a() {
            return BetSuccessfulPageFragment.this.j0.a();
        }

        @Override // defpackage.ee
        public final void b(Object obj) {
            String str = (String) obj;
            BetSuccessfulPageFragment betSuccessfulPageFragment = BetSuccessfulPageFragment.this;
            betSuccessfulPageFragment.h0 = str;
            if ("android.permission.POST_NOTIFICATIONS".equals(str) && Build.VERSION.SDK_INT >= 33) {
                betSuccessfulPageFragment.i0 = Boolean.valueOf(o0b.a(betSuccessfulPageFragment.requireContext(), str) == 0);
            }
            betSuccessfulPageFragment.j0.b(str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final /* synthetic */ b[] i;

        static {
            b bVar = new b("OK", 0);
            a = bVar;
            b bVar2 = new b("RE_BET", 1);
            b = bVar2;
            b bVar3 = new b("CANCEL", 2);
            c = bVar3;
            b bVar4 = new b("BET_HISTORY", 3);
            d = bVar4;
            b bVar5 = new b("LOYALTY", 4);
            e = bVar5;
            b bVar6 = new b("ERROR", 5);
            f = bVar6;
            i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) i.clone();
        }
    }

    public BetSuccessfulPageFragment() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        AnimationSet animationSet = new AnimationSet(true);
        this.Y = animationSet;
        animationSet.addAnimation(alphaAnimation);
        this.d0 = registerForActivityResult(new fkl(), new ud() { // from class: x93
            @Override // defpackage.ud
            public final void a(Object obj) {
                if (((fkl.b) obj) instanceof fkl.b.a) {
                    this.a.o0(BetSuccessfulPageFragment.b.c);
                }
            }
        });
        this.e0 = registerForActivityResult(new ce(), new ud() { // from class: ia3
            @Override // defpackage.ud
            public final void a(Object obj) {
                BetSuccessfulPageFragment betSuccessfulPageFragment;
                String str;
                if (-1 != ((ActivityResult) obj).a || (str = (betSuccessfulPageFragment = this.a).O) == null) {
                    return;
                }
                via0 via0Var = betSuccessfulPageFragment.N;
                via0Var.getClass();
                lyh<BaseResponse<List<GiftGroup>>> lyhVarR = via0Var.a.r(str);
                StringUiText stringUiText = vch0.a;
                kzh.d(new pia0(bm50.b(lyhVarR, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again))), o8i0.d(via0Var));
            }
        });
        this.f0 = registerForActivityResult(new vz80(), new ud() { // from class: ta3
            @Override // defpackage.ud
            public final void a(Object obj) {
                vz80.a aVar = (vz80.a) obj;
                boolean z = aVar instanceof vz80.a.b;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (z || (aVar instanceof vz80.a.d)) {
                    betSuccessfulPageFragment.o0(BetSuccessfulPageFragment.b.c);
                } else if (aVar instanceof vz80.a.c) {
                    betSuccessfulPageFragment.K.D1(false);
                    ViewPager2 viewPager2 = betSuccessfulPageFragment.H.a0;
                    viewPager2.setCurrentItem((viewPager2.getCurrentItem() + 1) % viewPager2.getChildCount(), false);
                }
            }
        });
        this.g0 = registerForActivityResult(new m1u(), new ud() { // from class: eb3
            @Override // defpackage.ud
            public final void a(Object obj) {
                boolean z = ((m1u.a) obj) instanceof m1u.a.C0852a;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                BetSuccessfulPageFragment.b bVar = betSuccessfulPageFragment.c0;
                if (z) {
                    betSuccessfulPageFragment.y0(bVar);
                } else {
                    betSuccessfulPageFragment.o0(bVar);
                }
            }
        });
        this.h0 = null;
        this.i0 = null;
        this.j0 = registerForActivityResult(new be(), new ud() { // from class: pb3
            @Override // defpackage.ud
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if ("android.permission.POST_NOTIFICATIONS".equals(betSuccessfulPageFragment.h0)) {
                    Boolean bool2 = betSuccessfulPageFragment.i0;
                    if (bool2 == null || bool2 != bool) {
                        boolean zBooleanValue = bool.booleanValue();
                        iym iymVar = betSuccessfulPageFragment.w;
                        if (zBooleanValue) {
                            iymVar.getClass();
                            gym.a(iymVar, l0y.a);
                        } else {
                            iymVar.getClass();
                            gym.a(iymVar, k0y.a);
                        }
                    }
                    betSuccessfulPageFragment.i0 = null;
                }
                ge00 ge00Var = betSuccessfulPageFragment.l0;
                if (ge00Var != null) {
                    ge00Var.a(bool.booleanValue());
                }
            }
        });
        this.k0 = new a();
        this.l0 = null;
    }

    public static BetSuccessfulPageFragment p0(Order order, boolean z, long j, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_ORDER", order);
        bundle.putBoolean("ARG_QUICK_BET", z);
        bundle.putLong("ARG_BET_DURATION", j);
        bundle.putBoolean("ARG_HAS_JOKER_SELECTIONS", z2);
        BetSuccessfulPageFragment betSuccessfulPageFragment = new BetSuccessfulPageFragment();
        betSuccessfulPageFragment.setArguments(bundle);
        return betSuccessfulPageFragment;
    }

    public static void s0(TextView textView, int i) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[1];
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setBounds(0, 0, i, i);
            textView.setCompoundDrawablesRelative(null, drawableMutate, null, null);
        }
    }

    public static void t0(int i, View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.removeRule(3);
        layoutParams.addRule(3, i);
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.k0;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return "BetSuccessfulPageFragment";
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.l0 = ge00Var;
    }

    public final g08 m0() {
        String stringExtra = requireActivity().getIntent().getStringExtra("action_load_booking_code_from");
        g08 g08Var = g08.UNKNOWN;
        if (!"FEATURED_CODE_HOME_PLACE_BET".equals(stringExtra)) {
            g08 g08Var2 = g08.UNKNOWN;
            if (!"FEATURED_CODE_HOME_REBET".equals(stringExtra)) {
                return g08.REBET_SUCCESSFUL_SAME;
            }
        }
        return g08.FEATURED_CODE_HOME_REBET;
    }

    public final void n0() {
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(of20.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.I = (of20) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(u93.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.J = (u93) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(tch.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.K = (tch) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarA4 = jq40.a(rws.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.L = (rws) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        v8i0 viewModelStore5 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory5 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras5 = getDefaultViewModelCreationExtras();
        viewModelStore5.getClass();
        defaultViewModelProviderFactory5.getClass();
        defaultViewModelCreationExtras5.getClass();
        s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, defaultViewModelCreationExtras5);
        dq7 dq7VarA5 = jq40.a(eja0.class);
        String strI5 = dq7VarA5.i();
        if (strI5 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.Z = (eja0) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
        v8i0 viewModelStore6 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory6 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras6 = getDefaultViewModelCreationExtras();
        viewModelStore6.getClass();
        defaultViewModelProviderFactory6.getClass();
        defaultViewModelCreationExtras6.getClass();
        s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory6, defaultViewModelCreationExtras6);
        dq7 dq7VarA6 = jq40.a(d2t.class);
        String strI6 = dq7VarA6.i();
        if (strI6 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        final d2t d2tVar = (d2t) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore7 = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory7 = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory7, sd7.a(eVarRequireActivity, viewModelStore7, defaultViewModelProviderFactory7));
        dq7 dq7VarA7 = jq40.a(sa90.class);
        String strI7 = dq7VarA7.i();
        if (strI7 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.M = (sa90) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
        v8i0 viewModelStore8 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory8 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras7 = getDefaultViewModelCreationExtras();
        viewModelStore8.getClass();
        defaultViewModelProviderFactory8.getClass();
        defaultViewModelCreationExtras7.getClass();
        s8i0 s8i0Var8 = new s8i0(viewModelStore8, defaultViewModelProviderFactory8, defaultViewModelCreationExtras7);
        dq7 dq7VarA8 = jq40.a(via0.class);
        String strI8 = dq7VarA8.i();
        if (strI8 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.N = (via0) s8i0Var8.a(dq7VarA8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI8));
        this.M.z1();
        this.M.C.f(this, new lfy() { // from class: la3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Object value;
                Map<String, ? extends Object> mapUnmodifiableMap;
                krv krvVar = (krv) obj;
                boolean z = krvVar instanceof krv.c;
                final BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (!z) {
                    hxv.c(betSuccessfulPageFragment.H.I, false, null, new Function0() { // from class: vb3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            betSuccessfulPageFragment.E.k(wae.LOYALTY, new Pair[]{new Pair("tab", "mission")}, null);
                            return Unit.a;
                        }
                    });
                    return;
                }
                ftv.b bVar = ((krv.c) krvVar).a;
                tch tchVar = betSuccessfulPageFragment.K;
                tchVar.getClass();
                tchVar.C1();
                wwd0 wwd0Var = tchVar.E;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, krvVar));
                hxv.c(betSuccessfulPageFragment.H.I, true, bVar, new Function0() { // from class: ub3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Map<String, ? extends Object> map = Collections.EMPTY_MAP;
                        f00 f00Var = vgb0.a;
                        map.getClass();
                        vgb0.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_INFO_LINK_CLICK, map, false);
                        BetSuccessfulPageFragment betSuccessfulPageFragment2 = betSuccessfulPageFragment;
                        betSuccessfulPageFragment2.w.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_INFO_LINK_CLICK, map, null);
                        betSuccessfulPageFragment2.E.k(wae.LOYALTY, new Pair[]{new Pair("tab", "mission")}, null);
                        return Unit.a;
                    }
                });
                betSuccessfulPageFragment.M.getClass();
                String strX1 = sa90.x1(bVar);
                if (strX1.isEmpty()) {
                    Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("from", AnalyticsEvent.BET_SUCCESSFUL_POPUP)};
                    HashMap map = new HashMap(1);
                    Map.Entry entry = entryArr[0];
                    Object key = entry.getKey();
                    if (w1k.a(key, entry, map, key) != null) {
                        hb5.a(wga.a(key, "duplicate key: "));
                        return;
                    }
                    mapUnmodifiableMap = Collections.unmodifiableMap(map);
                } else {
                    Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("from", AnalyticsEvent.BET_SUCCESSFUL_POPUP), new AbstractMap.SimpleEntry("mission_detail", strX1)};
                    HashMap map2 = new HashMap(2);
                    for (int i = 0; i < 2; i++) {
                        Map.Entry entry2 = entryArr2[i];
                        Object key2 = entry2.getKey();
                        if (w1k.a(key2, entry2, map2, key2) != null) {
                            hb5.a(wga.a(key2, "duplicate key: "));
                            return;
                        }
                    }
                    mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                }
                f00 f00Var = vgb0.a;
                mapUnmodifiableMap.getClass();
                vgb0.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_SECTION_VIEW, mapUnmodifiableMap, false);
                betSuccessfulPageFragment.w.c(AnalyticsEvent.BETSLIP_MISSION_REMINDER_SECTION_VIEW, mapUnmodifiableMap, null);
            }
        });
        int i = 0;
        i2i.b(this.J.i).f(this, new xa3(this, i));
        this.Z.w.f(this, new bb3(this, i));
        i2i.b(this.J.i).f(this, new lfy() { // from class: cb3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                betSuccessfulPageFragment.z.c((a) obj, betSuccessfulPageFragment.requireActivity(), betSuccessfulPageFragment.H.c0, betSuccessfulPageFragment);
            }
        });
        r5b r5bVarB = i2i.b(this.J.w);
        ee<wz80> eeVar = this.f0;
        Objects.requireNonNull(eeVar);
        r5bVarB.f(this, new wa3(eeVar, i));
        i2i.b(this.J.B).f(this, new lfy() { // from class: db3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                boolean z = ((tzs) obj) instanceof tzs.b;
                betSuccessfulPageFragment.H.e0.setVisibility(z ? 0 : 8);
                betSuccessfulPageFragment.H.d0.setVisibility(z ? 8 : 0);
            }
        });
        i2i.b(this.N.v).f(this, new lfy() { // from class: fb3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                dha0 dha0Var = (dha0) obj;
                boolean z = dha0Var instanceof dha0.e;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (z) {
                    androidx.fragment.app.e eVarRequireActivity2 = betSuccessfulPageFragment.requireActivity();
                    eVarRequireActivity2.getClass();
                    wha0.d(eVarRequireActivity2, (dha0.e) dha0Var, null);
                    return;
                }
                if (dha0Var instanceof dha0.g) {
                    dha0.g gVar = (dha0.g) dha0Var;
                    betSuccessfulPageFragment.O = gVar.c;
                    wha0.b(betSuccessfulPageFragment.requireActivity(), gVar, betSuccessfulPageFragment.e0);
                    return;
                }
                if (dha0Var instanceof dha0.a) {
                    wha0.a(betSuccessfulPageFragment.requireActivity(), (dha0.a) dha0Var);
                    return;
                }
                if (dha0Var instanceof dha0.f) {
                    Context contextRequireContext = betSuccessfulPageFragment.requireContext();
                    contextRequireContext.getClass();
                    String strB = ((dha0.f) dha0Var).a;
                    if (StringsKt.U(strB)) {
                        strB = sn5.b(contextRequireContext, R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
                    }
                    if (StringsKt.U(strB)) {
                        return;
                    }
                    Toast.makeText(contextRequireContext, strB, 0).show();
                    return;
                }
                if (dha0Var instanceof dha0.d) {
                    Context contextRequireContext2 = betSuccessfulPageFragment.requireContext();
                    List listSingletonList = Collections.singletonList(((dha0.d) dha0Var).a);
                    contextRequireContext2.getClass();
                    listSingletonList.getClass();
                    PermissionActivity.z1(contextRequireContext2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ebn(contextRequireContext2, listSingletonList));
                    return;
                }
                if (dha0Var instanceof dha0.b) {
                    yrh0.e(((dha0.b) dha0Var).a);
                } else if (dha0Var instanceof dha0.c) {
                    wha0.e(betSuccessfulPageFragment.requireActivity(), (dha0.c) dha0Var);
                }
            }
        });
        i2i.b(this.J.G).f(this, new lfy() { // from class: gb3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                dln dlnVar = (dln) obj;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                long j = betSuccessfulPageFragment.P;
                wz80 wz80Var = dlnVar.b;
                cln clnVar = dlnVar.a;
                wz80Var.getClass();
                String str = wz80Var.a;
                Uri uri = str.length() > 0 ? Uri.parse(str) : null;
                String str2 = wz80Var.c;
                String str3 = wz80Var.k;
                String str4 = wz80Var.d;
                String str5 = wz80Var.j;
                String str6 = wz80Var.l;
                x190 x190Var = new x190(str2, str3, str4, str5, null, uri, null, null, str6, !(str6 == null || StringsKt.U(str6)), wz80Var.g, q190.a, null, null, null);
                via0 via0Var = betSuccessfulPageFragment.N;
                via0Var.getClass();
                via0Var.w = x190Var;
                if (clnVar instanceof cln.d) {
                    via0 via0Var2 = betSuccessfulPageFragment.N;
                    aga0 aga0Var = ((cln.d) clnVar).a;
                    via0Var2.getClass();
                    ej5.c(o8i0.d(via0Var2), null, null, new tia0(via0Var2, aga0Var, j, false, null), 3);
                    return;
                }
                if (clnVar instanceof cln.a) {
                    via0 via0Var3 = betSuccessfulPageFragment.N;
                    via0Var3.getClass();
                    ej5.c(o8i0.d(via0Var3), null, null, new qia0(via0Var3, j, null), 3);
                } else if (clnVar instanceof cln.c) {
                    via0 via0Var4 = betSuccessfulPageFragment.N;
                    via0Var4.getClass();
                    ej5.c(o8i0.d(via0Var4), null, null, new sia0(via0Var4, j, null), 3);
                } else if (clnVar instanceof cln.b) {
                    via0 via0Var5 = betSuccessfulPageFragment.N;
                    via0Var5.getClass();
                    ej5.c(o8i0.d(via0Var5), null, null, new ria0(via0Var5, j, null), 3);
                }
            }
        });
        this.J.z.f(this, new lfy() { // from class: hb3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    betSuccessfulPageFragment.g0.b(Unit.a);
                }
                BetSuccessfulPageFragment.b bVar = betSuccessfulPageFragment.c0;
                boolean zBooleanValue = bool.booleanValue();
                if (bVar == BetSuccessfulPageFragment.b.a) {
                    int i2 = 0;
                    ((br3) mmc.a(hp0.A, br3.class)).U().x(false);
                    of20 of20Var = betSuccessfulPageFragment.I;
                    if (of20Var != null) {
                        ae20 ae20Var = of20Var.C;
                        HashMap map = ae20Var.b;
                        try {
                            if (map.size() > 0) {
                                ArrayList arrayList = new ArrayList(map.values());
                                int size = arrayList.size();
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    ae20Var.a((Selection) obj2);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!zBooleanValue) {
                        betSuccessfulPageFragment.y0(bVar);
                        return;
                    }
                }
                betSuccessfulPageFragment.o0(bVar);
            }
        });
        i2i.b(this.J.C).f(this, new lfy() { // from class: ib3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                TaxConfig taxConfig = (TaxConfig) obj;
                boolean zHasRate = taxConfig.hasRate();
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (zHasRate) {
                    boolean zP = betSuccessfulPageFragment.D.p();
                    zie zieVar = betSuccessfulPageFragment.H;
                    if (zP) {
                        zieVar.J.setText(sn5.d(betSuccessfulPageFragment, R.string.component_betslip__net_amount, new Object[0]));
                    } else {
                        zieVar.J.setText(sn5.d(betSuccessfulPageFragment, R.string.component_betslip__to_win, new Object[0]));
                    }
                    boolean zP2 = betSuccessfulPageFragment.D.p();
                    zie zieVar2 = betSuccessfulPageFragment.H;
                    String strTrim = zP2 ? sn5.c(zieVar2.k0, R.string.component_betslip__winnings_tax, Integer.valueOf(taxConfig.getRateAsPercentage())).trim() : sn5.c(zieVar2.k0, R.string.bet_history__wh_tax, new Object[0]);
                    betSuccessfulPageFragment.H.k0.setVisibility(0);
                    betSuccessfulPageFragment.H.k0.setText(strTrim);
                    betSuccessfulPageFragment.H.l0.setVisibility(0);
                } else {
                    betSuccessfulPageFragment.H.J.setText(sn5.d(betSuccessfulPageFragment, R.string.component_betslip__potential_win, new Object[0]));
                    betSuccessfulPageFragment.H.k0.setVisibility(8);
                    betSuccessfulPageFragment.H.l0.setVisibility(8);
                }
                Order order = betSuccessfulPageFragment.Q;
                if (order == null || TextUtils.isEmpty(order.totalStake)) {
                    return;
                }
                TextView textView = betSuccessfulPageFragment.H.h0;
                String str = betSuccessfulPageFragment.Q.totalStake;
                Locale locale = Locale.US;
                textView.setText(bjb0.P(str, locale));
                if (TextUtils.isEmpty(betSuccessfulPageFragment.Q.maxPTWin) || TextUtils.isEmpty(betSuccessfulPageFragment.Q.maxWHTax)) {
                    BigDecimal bigDecimalDivide = new BigDecimal(betSuccessfulPageFragment.Q.longPotWinning).divide(BigDecimal.valueOf(10000L));
                    BigDecimal bigDecimal = new BigDecimal(betSuccessfulPageFragment.Q.totalStake);
                    BigDecimal tax = taxConfig.getTax(bigDecimalDivide, bigDecimal);
                    BigDecimal bigDecimalSubtract = bigDecimalDivide.subtract(tax);
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_COMMON);
                    StringBuilder sb = new StringBuilder("[showWHTaxandNetWin][S] type = ");
                    sb.append(taxConfig.getType());
                    sb.append(", wh tax =");
                    sb.append(tax);
                    sb.append(", net win =");
                    iib0.b(sb, bigDecimalSubtract, ", pt win =", bigDecimalDivide, ", stake =");
                    sb.append(bigDecimal);
                    aVar.g(sb.toString(), new Object[0]);
                    betSuccessfulPageFragment.v0(bjb0.L(bigDecimalSubtract, locale), bjb0.L(tax.multiply(new BigDecimal(-1)), locale));
                } else {
                    Order order2 = betSuccessfulPageFragment.Q;
                    betSuccessfulPageFragment.v0(order2.maxPTWin, order2.maxWHTax);
                }
                String str2 = betSuccessfulPageFragment.Q.cutbetWinningAmount;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    BigDecimal bigDecimalDivide2 = new BigDecimal(betSuccessfulPageFragment.Q.cutbetWinningAmount).divide(BigDecimal.valueOf(10000L));
                    betSuccessfulPageFragment.H.N.setText(bjb0.L(bigDecimalDivide2.subtract(taxConfig.getTax(bigDecimalDivide2, new BigDecimal(betSuccessfulPageFragment.Q.totalStake))), locale));
                    betSuccessfulPageFragment.H.N.setVisibility(0);
                    betSuccessfulPageFragment.H.M.setVisibility(0);
                }
                String str3 = betSuccessfulPageFragment.Q.exciseTax;
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.g("[showExciseTax] exciseTax=%s", str3);
                int i2 = taxConfig.hasExciseTaxRate() ? 0 : 8;
                betSuccessfulPageFragment.H.A.setVisibility(i2);
                betSuccessfulPageFragment.H.z.setVisibility(i2);
                betSuccessfulPageFragment.H.A.setText(str3);
            }
        });
        i2i.b(this.K.H).f(this, new lfy() { // from class: ma3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    d2t d2tVar2 = d2tVar;
                    ej5.c(o8i0.d(d2tVar2), null, null, new b2t(d2tVar2, null), 3);
                } else {
                    BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    betSuccessfulPageFragment.H.Q.setVisibility(8);
                    betSuccessfulPageFragment.H.P.setVisibility(8);
                }
            }
        });
        fks.b(i2i.b(this.K.U), i2i.b(this.K.G), new na3(this)).f(this, new oa3());
        fks.a(i2i.b(d2tVar.e), i2i.b(this.K.T), this.M.C, new gaj() { // from class: pa3
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                final List list = (List) obj;
                jj40 jj40Var = (jj40) obj2;
                krv krvVar = (krv) obj3;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (list == null || list.isEmpty() || (krvVar instanceof krv.c) || (krvVar instanceof krv.a)) {
                    betSuccessfulPageFragment.H.Q.setVisibility(8);
                    betSuccessfulPageFragment.H.P.setVisibility(8);
                    return Unit.a;
                }
                betSuccessfulPageFragment.H.Q.setVisibility(0);
                betSuccessfulPageFragment.f.e(betSuccessfulPageFragment.H.Q, AnalyticsParam.GAMES_RECOMMENDATION_SECTION_HEADER);
                betSuccessfulPageFragment.f.e(betSuccessfulPageFragment.H.R, AnalyticsParam.GAMES_RECOMMENDATION_SECTION);
                hj40.c(betSuccessfulPageFragment.H.Q, jj40Var, new kb3(0, betSuccessfulPageFragment, jj40Var));
                ComposeView composeView = betSuccessfulPageFragment.H.P;
                final lb3 lb3Var = new lb3(betSuccessfulPageFragment);
                composeView.setViewCompositionStrategy(u6i0.b.a);
                composeView.setContent(new op8(-2134931700, new Function2() { // from class: dmh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final List list2 = list;
                            final lb3 lb3Var2 = lb3Var;
                            o0z.a(null, null, null, null, null, pp8.b(-828128773, new Function2() { // from class: hmh0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        imh0.a(d.a.b, null, list2, lb3Var2, aVar2, 6, 2);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar), aVar, 196608);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                boolean z = jj40Var instanceof jj40.b;
                zie zieVar = betSuccessfulPageFragment.H;
                if (z) {
                    zieVar.P.setVisibility(0);
                } else {
                    zieVar.P.setVisibility(8);
                }
                if (!betSuccessfulPageFragment.X) {
                    betSuccessfulPageFragment.G.a(txj.a, k00.c, k00.d);
                    betSuccessfulPageFragment.X = true;
                }
                return Unit.a;
            }
        }).f(this, new qa3());
        i2i.b(this.K.V).f(this, new lfy() { // from class: ra3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    final BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    betSuccessfulPageFragment.W.j((List) ((lk50.c) lk50Var).a, new Runnable() { // from class: fc3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BetSuccessfulPageFragment betSuccessfulPageFragment2 = betSuccessfulPageFragment;
                            if (betSuccessfulPageFragment2.W.getItemCount() <= 1 || betSuccessfulPageFragment2.H.a0.getCurrentItem() != 0) {
                                return;
                            }
                            betSuccessfulPageFragment2.H.a0.setCurrentItem(1, false);
                        }
                    });
                }
            }
        });
        i2i.b(this.K.X).f(this, new sa3(this, 0));
        i2i.b(this.K.w).f(this, new ua3(this, i));
        i2i.b(this.K.z).f(this, new va3(this, i));
        i2i.b(this.K.B).f(this, new wa3(eeVar, i));
        tch tchVar = this.K;
        aj40.a aVar = new aj40.a(Integer.valueOf(R.drawable.spr_ic_related_bets), true);
        sch schVar = sch.a;
        g08 g08Var = g08.UNKNOWN;
        tchVar.A1(aVar, schVar, false, false, "RECOMMENDED_BOOKING_CODE_SUCCESSFUL");
        this.K.x1();
        i2i.b(this.L.e).f(this, new ya3(this, i));
        i2i.b(this.L.i).f(this, new lfy() { // from class: za3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mws mwsVar = (mws) obj;
                boolean z = mwsVar instanceof mws.a;
                BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (z) {
                    mws.a aVar2 = (mws.a) mwsVar;
                    betSuccessfulPageFragment.o0(BetSuccessfulPageFragment.b.b);
                    if (!betSuccessfulPageFragment.S) {
                        Intent intent = new Intent(betSuccessfulPageFragment.requireContext(), (Class<?>) BetslipActivity.class);
                        yt5.g(intent, aVar2.a.name(), aVar2.b, null);
                        yrh0.s(betSuccessfulPageFragment.requireContext(), intent, true);
                    }
                    zyf0.b(R.string.component_betslip__successful_loaded, 1);
                    return;
                }
                if (mwsVar instanceof mws.c) {
                    mws.c cVar = (mws.c) mwsVar;
                    String str = cVar.a;
                    List<Event> list = cVar.b;
                    if (str == null || list == null) {
                        return;
                    }
                    betSuccessfulPageFragment.d0.b(ekl.a(betSuccessfulPageFragment.requireContext(), str, list, betSuccessfulPageFragment.m0().name(), cVar.d));
                }
            }
        });
        i2i.b(this.L.w).f(this, new lfy() { // from class: ab3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean z = ((tzs) obj) instanceof tzs.b;
                zie zieVar = this.a.H;
                if (z) {
                    zieVar.G.d();
                } else {
                    zieVar.G.a();
                }
            }
        });
        i2i.b(this.J.E).f(this, new lfy() { // from class: jb3
            /* JADX WARN: Type inference failed for: r1v1, types: [gc3] */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                oc3 oc3Var = (oc3) obj;
                final BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                if (betSuccessfulPageFragment.H == null) {
                    return;
                }
                String str = oc3Var.a;
                int length = str.length();
                int i2 = 0;
                int iCharCount = 0;
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        ComposeView composeView = betSuccessfulPageFragment.H.H;
                        final String str2 = oc3Var.a;
                        final ?? r1 = new Function0() { // from class: gc3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BetSuccessfulPageFragment betSuccessfulPageFragment2 = betSuccessfulPageFragment;
                                betSuccessfulPageFragment2.E.d(wae.LOYALTY);
                                betSuccessfulPageFragment2.dismiss();
                                return Unit.a;
                            }
                        };
                        final hc3 hc3Var = new hc3(betSuccessfulPageFragment, i2);
                        str2.getClass();
                        mla.i(composeView, new op8(647229358, new Function2() { // from class: k93
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qqt.a(null, str2, r1, hc3Var, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                        return;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                betSuccessfulPageFragment.H.H.setVisibility(8);
            }
        });
    }

    public final void o0(b bVar) {
        itf0.a aVar = itf0.a;
        aVar.q("TAG_BET_SUCCESS");
        aVar.g("Leaving : %s", bVar);
        yf3 yf3Var = this.U;
        if (yf3Var != null) {
            BetslipActivity betslipActivity = (BetslipActivity) yf3Var.a;
            Set<g08> set = BetslipActivity.X2;
            betslipActivity.finish();
        }
        this.V = 0L;
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        o0(b.c);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.Q = (Order) sj5.a(getArguments(), "ARG_ORDER", Order.class);
            this.S = getArguments().getBoolean("ARG_QUICK_BET", false);
            this.T = getArguments().getBoolean("ARG_HAS_JOKER_SELECTIONS", false);
            this.V = Long.valueOf(getArguments().getLong("ARG_BET_DURATION", 0L));
        }
        yie0.b(this, mie0.d);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        AtomicBoolean atomicBoolean = i420.F;
        i420.a.a(false);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_bet_successful, (ViewGroup) null, false);
        int i = R.id.banner_ad;
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) h5e.a(R.id.banner_ad, viewInflate);
        if (aspectRatioImageView != null) {
            i = R.id.booking_code_info;
            ImageView imageView = (ImageView) h5e.a(R.id.booking_code_info, viewInflate);
            if (imageView != null) {
                i = R.id.booking_code_left_container;
                if (((LinearLayout) h5e.a(R.id.booking_code_left_container, viewInflate)) != null) {
                    i = R.id.booking_code_row;
                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.booking_code_row, viewInflate);
                    if (linearLayout != null) {
                        i = R.id.booking_code_value;
                        TextView textView = (TextView) h5e.a(R.id.booking_code_value, viewInflate);
                        if (textView != null) {
                            i = R.id.cashout_gift_info;
                            TextView textView2 = (TextView) h5e.a(R.id.cashout_gift_info, viewInflate);
                            if (textView2 != null) {
                                i = R.id.compose_custom_code_sheet;
                                CustomCodeComposeUtil customCodeComposeUtil = (CustomCodeComposeUtil) h5e.a(R.id.compose_custom_code_sheet, viewInflate);
                                if (customCodeComposeUtil != null) {
                                    i = R.id.copy_btn;
                                    ImageView imageView2 = (ImageView) h5e.a(R.id.copy_btn, viewInflate);
                                    if (imageView2 != null) {
                                        i = R.id.custom_code_label;
                                        TextView textView3 = (TextView) h5e.a(R.id.custom_code_label, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.custom_code_value;
                                            TextView textView4 = (TextView) h5e.a(R.id.custom_code_value, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.excise_tax;
                                                TextView textView5 = (TextView) h5e.a(R.id.excise_tax, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.excise_tax_value;
                                                    TextView textView6 = (TextView) h5e.a(R.id.excise_tax_value, viewInflate);
                                                    if (textView6 != null) {
                                                        i = R.id.full_winning_title;
                                                        TextView textView7 = (TextView) h5e.a(R.id.full_winning_title, viewInflate);
                                                        if (textView7 != null) {
                                                            i = R.id.full_winning_value;
                                                            TextView textView8 = (TextView) h5e.a(R.id.full_winning_value, viewInflate);
                                                            if (textView8 != null) {
                                                                i = R.id.gift_type;
                                                                TextView textView9 = (TextView) h5e.a(R.id.gift_type, viewInflate);
                                                                if (textView9 != null) {
                                                                    i = R.id.gift_value;
                                                                    TextView textView10 = (TextView) h5e.a(R.id.gift_value, viewInflate);
                                                                    if (textView10 != null) {
                                                                        i = R.id.guide_line_top;
                                                                        if (((Guideline) h5e.a(R.id.guide_line_top, viewInflate)) != null) {
                                                                            i = R.id.guideline_10;
                                                                            if (((Guideline) h5e.a(R.id.guideline_10, viewInflate)) != null) {
                                                                                i = R.id.info_container;
                                                                                if (((RelativeLayout) h5e.a(R.id.info_container, viewInflate)) != null) {
                                                                                    i = R.id.joker_selections_view;
                                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.joker_selections_view, viewInflate);
                                                                                    if (composeView != null) {
                                                                                        i = R.id.loading_view;
                                                                                        LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.loading_view, viewInflate);
                                                                                        if (loadingViewNew != null) {
                                                                                            i = R.id.loyalty_progress_hint_compose_view;
                                                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.loyalty_progress_hint_compose_view, viewInflate);
                                                                                            if (composeView2 != null) {
                                                                                                i = R.id.mission_bet_success_view;
                                                                                                ComposeView composeView3 = (ComposeView) h5e.a(R.id.mission_bet_success_view, viewInflate);
                                                                                                if (composeView3 != null) {
                                                                                                    i = R.id.net_win;
                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.net_win, viewInflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i = R.id.net_win_value;
                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.net_win_value, viewInflate);
                                                                                                        if (textView12 != null) {
                                                                                                            i = R.id.note_on_bet_view;
                                                                                                            ComposeView composeView4 = (ComposeView) h5e.a(R.id.note_on_bet_view, viewInflate);
                                                                                                            if (composeView4 != null) {
                                                                                                                i = R.id.one_cut;
                                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.one_cut, viewInflate);
                                                                                                                if (appCompatTextView != null) {
                                                                                                                    i = R.id.one_cut_win_value;
                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.one_cut_win_value, viewInflate);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.open_bets_label;
                                                                                                                        if (((TextView) h5e.a(R.id.open_bets_label, viewInflate)) != null) {
                                                                                                                            i = R.id.pairButton;
                                                                                                                            GenericPairButton genericPairButton = (GenericPairButton) h5e.a(R.id.pairButton, viewInflate);
                                                                                                                            if (genericPairButton != null) {
                                                                                                                                i = R.id.post_bet_upsell_banner_compose_view;
                                                                                                                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.post_bet_upsell_banner_compose_view, viewInflate);
                                                                                                                                if (composeView5 != null) {
                                                                                                                                    i = R.id.post_bet_upsell_header_compose_view;
                                                                                                                                    ComposeView composeView6 = (ComposeView) h5e.a(R.id.post_bet_upsell_header_compose_view, viewInflate);
                                                                                                                                    if (composeView6 != null) {
                                                                                                                                        i = R.id.post_bet_upsell_section;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.post_bet_upsell_section, viewInflate);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i = R.id.publish_btn;
                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.publish_btn, viewInflate);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i = R.id.publish_btn_loading;
                                                                                                                                                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.publish_btn_loading, viewInflate);
                                                                                                                                                if (progressBar != null) {
                                                                                                                                                    i = R.id.publish_state_container;
                                                                                                                                                    if (((FrameLayout) h5e.a(R.id.publish_state_container, viewInflate)) != null) {
                                                                                                                                                        i = R.id.recommended_code_header_compose_view;
                                                                                                                                                        ComposeView composeView7 = (ComposeView) h5e.a(R.id.recommended_code_header_compose_view, viewInflate);
                                                                                                                                                        if (composeView7 != null) {
                                                                                                                                                            i = R.id.recommended_code_pager_bottom_space;
                                                                                                                                                            View viewA = h5e.a(R.id.recommended_code_pager_bottom_space, viewInflate);
                                                                                                                                                            if (viewA != null) {
                                                                                                                                                                i = R.id.recommended_code_pager_group;
                                                                                                                                                                Group group = (Group) h5e.a(R.id.recommended_code_pager_group, viewInflate);
                                                                                                                                                                if (group != null) {
                                                                                                                                                                    i = R.id.recommended_code_spin_button;
                                                                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.recommended_code_spin_button, viewInflate);
                                                                                                                                                                    if (constraintLayout != null) {
                                                                                                                                                                        i = R.id.recommended_code_spin_card;
                                                                                                                                                                        View viewA2 = h5e.a(R.id.recommended_code_spin_card, viewInflate);
                                                                                                                                                                        if (viewA2 != null) {
                                                                                                                                                                            f2p f2pVarA = f2p.a(viewA2);
                                                                                                                                                                            i = R.id.recommended_code_spin_group;
                                                                                                                                                                            Group group2 = (Group) h5e.a(R.id.recommended_code_spin_group, viewInflate);
                                                                                                                                                                            if (group2 != null) {
                                                                                                                                                                                i = R.id.recommended_code_spin_icon;
                                                                                                                                                                                if (((AppCompatImageView) h5e.a(R.id.recommended_code_spin_icon, viewInflate)) != null) {
                                                                                                                                                                                    i = R.id.recommended_code_spin_text;
                                                                                                                                                                                    if (((TextView) h5e.a(R.id.recommended_code_spin_text, viewInflate)) != null) {
                                                                                                                                                                                        i = R.id.recommended_code_view_pager;
                                                                                                                                                                                        ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.recommended_code_view_pager, viewInflate);
                                                                                                                                                                                        if (viewPager2 != null) {
                                                                                                                                                                                            i = R.id.reward_progress_label;
                                                                                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.reward_progress_label, viewInflate);
                                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                                i = R.id.scrollView;
                                                                                                                                                                                                if (((ScrollView) h5e.a(R.id.scrollView, viewInflate)) != null) {
                                                                                                                                                                                                    i = R.id.share_btn;
                                                                                                                                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.share_btn, viewInflate);
                                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                                        i = R.id.share_btn_loading;
                                                                                                                                                                                                        ProgressBar progressBar2 = (ProgressBar) h5e.a(R.id.share_btn_loading, viewInflate);
                                                                                                                                                                                                        if (progressBar2 != null) {
                                                                                                                                                                                                            i = R.id.share_state_container;
                                                                                                                                                                                                            if (((FrameLayout) h5e.a(R.id.share_state_container, viewInflate)) != null) {
                                                                                                                                                                                                                i = R.id.social_share_divider;
                                                                                                                                                                                                                View viewA3 = h5e.a(R.id.social_share_divider, viewInflate);
                                                                                                                                                                                                                if (viewA3 != null) {
                                                                                                                                                                                                                    i = R.id.social_share_section;
                                                                                                                                                                                                                    View viewA4 = h5e.a(R.id.social_share_section, viewInflate);
                                                                                                                                                                                                                    if (viewA4 != null) {
                                                                                                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) viewA4;
                                                                                                                                                                                                                        int i2 = R.id.tv_social_copy_link;
                                                                                                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.tv_social_copy_link, viewA4);
                                                                                                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                                                                                                            i2 = R.id.tv_social_facebook;
                                                                                                                                                                                                                            TextView textView16 = (TextView) h5e.a(R.id.tv_social_facebook, viewA4);
                                                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                                                i2 = R.id.tv_social_more;
                                                                                                                                                                                                                                TextView textView17 = (TextView) h5e.a(R.id.tv_social_more, viewA4);
                                                                                                                                                                                                                                if (textView17 != null) {
                                                                                                                                                                                                                                    i2 = R.id.tv_social_save_image;
                                                                                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.tv_social_save_image, viewA4);
                                                                                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                                                                                        i2 = R.id.tv_social_telegram;
                                                                                                                                                                                                                                        TextView textView18 = (TextView) h5e.a(R.id.tv_social_telegram, viewA4);
                                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                                            i2 = R.id.tv_social_whatsapp;
                                                                                                                                                                                                                                            TextView textView19 = (TextView) h5e.a(R.id.tv_social_whatsapp, viewA4);
                                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                                i2 = R.id.tv_social_x;
                                                                                                                                                                                                                                                TextView textView20 = (TextView) h5e.a(R.id.tv_social_x, viewA4);
                                                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                                                    ktr ktrVar = new ktr(linearLayout3, linearLayout4, textView16, textView17, linearLayout5, textView18, textView19, textView20);
                                                                                                                                                                                                                                                    i = R.id.succ_icon_image_view;
                                                                                                                                                                                                                                                    if (((ImageView) h5e.a(R.id.succ_icon_image_view, viewInflate)) != null) {
                                                                                                                                                                                                                                                        i = R.id.succ_title_text_view;
                                                                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.succ_title_text_view, viewInflate)) != null) {
                                                                                                                                                                                                                                                            i = R.id.textView11;
                                                                                                                                                                                                                                                            if (((TextView) h5e.a(R.id.textView11, viewInflate)) != null) {
                                                                                                                                                                                                                                                                i = R.id.total_stake_value;
                                                                                                                                                                                                                                                                TextView textView21 = (TextView) h5e.a(R.id.total_stake_value, viewInflate);
                                                                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                                                                    i = R.id.view_open_bets_button;
                                                                                                                                                                                                                                                                    TextView textView22 = (TextView) h5e.a(R.id.view_open_bets_button, viewInflate);
                                                                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                                                                        i = R.id.view_publish_btn;
                                                                                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.view_publish_btn, viewInflate)) != null) {
                                                                                                                                                                                                                                                                            i = R.id.view_reward_progress_button;
                                                                                                                                                                                                                                                                            TextView textView23 = (TextView) h5e.a(R.id.view_reward_progress_button, viewInflate);
                                                                                                                                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                                                                                                                                i = R.id.wh_tax;
                                                                                                                                                                                                                                                                                TextView textView24 = (TextView) h5e.a(R.id.wh_tax, viewInflate);
                                                                                                                                                                                                                                                                                if (textView24 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.wh_tax_value;
                                                                                                                                                                                                                                                                                    TextView textView25 = (TextView) h5e.a(R.id.wh_tax_value, viewInflate);
                                                                                                                                                                                                                                                                                    if (textView25 != null) {
                                                                                                                                                                                                                                                                                        this.H = new zie(constraintLayout2, aspectRatioImageView, imageView, linearLayout, textView, textView2, customCodeComposeUtil, imageView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, composeView, loadingViewNew, composeView2, composeView3, textView11, textView12, composeView4, appCompatTextView, textView13, genericPairButton, composeView5, composeView6, linearLayout2, textView14, progressBar, composeView7, viewA, group, constraintLayout, f2pVarA, group2, viewPager2, textView15, constraintLayout2, imageView3, progressBar2, viewA3, ktrVar, textView21, textView22, textView23, textView24, textView25);
                                                                                                                                                                                                                                                                                        Dialog dialog = new Dialog(requireContext(), R.style.BottomDialog);
                                                                                                                                                                                                                                                                                        dialog.requestWindowFeature(1);
                                                                                                                                                                                                                                                                                        if (dialog.getWindow() != null && this.V.longValue() != 0) {
                                                                                                                                                                                                                                                                                            long jCurrentTimeMillis = System.currentTimeMillis() - this.V.longValue();
                                                                                                                                                                                                                                                                                            if (jCurrentTimeMillis > 0 && jCurrentTimeMillis <= 20000) {
                                                                                                                                                                                                                                                                                                iym iymVar = this.w;
                                                                                                                                                                                                                                                                                                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.KEY_BI_DURATION, Long.valueOf(jCurrentTimeMillis))};
                                                                                                                                                                                                                                                                                                HashMap map = new HashMap(1);
                                                                                                                                                                                                                                                                                                Map.Entry entry = entryArr[0];
                                                                                                                                                                                                                                                                                                Object key = entry.getKey();
                                                                                                                                                                                                                                                                                                if (w1k.a(key, entry, map, key) != null) {
                                                                                                                                                                                                                                                                                                    hb5.a(wga.a(key, "duplicate key: "));
                                                                                                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
                                                                                                                                                                                                                                                                                                PageMeta.INSTANCE.getClass();
                                                                                                                                                                                                                                                                                                iymVar.c(AnalyticsEvent.BETSLIP_SUCCESS, mapUnmodifiableMap, new PageMeta("betslip", null));
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            this.w.d(AnalyticsEvent.BET_SUCCESSFUL_POPUP_SHOW);
                                                                                                                                                                                                                                                                                            this.f.f(AnalyticsEvent.BET_SUCCESSFUL_POPUP_SHOW, Collections.EMPTY_MAP);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (dialog.getWindow() != null) {
                                                                                                                                                                                                                                                                                            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        dialog.setCancelable(true);
                                                                                                                                                                                                                                                                                        dialog.setCanceledOnTouchOutside(true);
                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                            dialog.setContentView(this.H.a);
                                                                                                                                                                                                                                                                                            Window window = dialog.getWindow();
                                                                                                                                                                                                                                                                                            if (window != null) {
                                                                                                                                                                                                                                                                                                window.setWindowAnimations(R.style.AnimBottom);
                                                                                                                                                                                                                                                                                                WindowManager.LayoutParams attributes = window.getAttributes();
                                                                                                                                                                                                                                                                                                attributes.gravity = 80;
                                                                                                                                                                                                                                                                                                attributes.width = -1;
                                                                                                                                                                                                                                                                                                attributes.height = -1;
                                                                                                                                                                                                                                                                                                window.setAttributes(attributes);
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            q0(dialog);
                                                                                                                                                                                                                                                                                            n0();
                                                                                                                                                                                                                                                                                            return dialog;
                                                                                                                                                                                                                                                                                        } catch (RuntimeException e) {
                                                                                                                                                                                                                                                                                            if ((e instanceof BadParcelableException) || (e.getMessage() != null && e.getMessage().contains("Parcel"))) {
                                                                                                                                                                                                                                                                                                w0();
                                                                                                                                                                                                                                                                                                str = "ParcelableException crash in BetSuccessfulPageFragment";
                                                                                                                                                                                                                                                                                            } else if ((e instanceof Resources.NotFoundException) || (e instanceof InflateException)) {
                                                                                                                                                                                                                                                                                                this.i.a(requireContext());
                                                                                                                                                                                                                                                                                                str = "Detect Resources.NotFoundException or InflateException in BetSuccessfulPageFragment";
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                w0();
                                                                                                                                                                                                                                                                                                str = "Runtime crash in BetSuccessfulPageFragment";
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            this.v.g(str, "", e, null);
                                                                                                                                                                                                                                                                                            return dialog;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i2)));
                                                                                                                                                                                                                        return null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.V = 0L;
    }

    public final void q0(Dialog dialog) {
        String strD;
        if (getActivity() != null || isAdded()) {
            Context context = this.H.a.getContext();
            int i = 0;
            this.H.c0.setOnClickListener(new ac3(this, i));
            this.H.G.setOnClickListener(new aa3());
            this.H.O.setButtonClickListener(new com.sportybet.plugin.realsports.betsucc.presentation.fragment.a(this));
            Drawable drawableA = gr0.a(context, R.drawable.spr_info);
            if (drawableA != null) {
                drawableA.setBounds(0, 0, zch0.a(context, 16), zch0.b(context.getResources(), 16));
            }
            double dD0 = bjb0.d0(this.Q.favorAmount);
            zie zieVar = this.H;
            if (dD0 > 0.0d) {
                zieVar.D.setVisibility(0);
                this.H.E.setVisibility(0);
                TextView textView = this.H.D;
                int i2 = this.Q.favorType;
                if (i2 == 1) {
                    strD = sn5.d(this, R.string.common_functions__cash_gift, new Object[0]);
                } else if (i2 != 2) {
                    strD = i2 != 3 ? "" : sn5.d(this, R.string.common_functions__free_bet_gift, new Object[0]);
                } else {
                    strD = sn5.d(this, R.string.common_functions__discount_gift, new Object[0]);
                }
                textView.setText(strD);
                this.H.E.setText(sn5.d(this, R.string.app_common__minus_prefix, bjb0.P(this.Q.favorAmount, Locale.US)));
                int i3 = this.Q.favorType;
                if (!qq1.a(this.y, BOConfigParam.CashoutSupportGiftEnabled, false) || i3 != 3) {
                    this.H.f.setVisibility(0);
                }
            } else {
                zieVar.f.setVisibility(8);
            }
            this.H.c.setOnClickListener(new ba3(this, i));
            this.H.S.setOnClickListener(new ca3(this, i));
            this.H.e.setText(this.Q.shareCode);
            this.H.v.setOnClickListener(new da3(this, 0));
            this.H.d0.setOnClickListener(new View.OnClickListener() { // from class: ea3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    u93 u93Var = betSuccessfulPageFragment.J;
                    Order order = betSuccessfulPageFragment.Q;
                    String str = order.shareCode;
                    String str2 = order.orderId;
                    String str3 = betSuccessfulPageFragment.R;
                    u93Var.getClass();
                    ej5.c(o8i0.d(u93Var), null, null, new q93(str, u93Var, null, str2, str3, null), 3);
                }
            });
            this.H.y.setOnClickListener(new View.OnClickListener() { // from class: fa3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    betSuccessfulPageFragment.H.i.A();
                    betSuccessfulPageFragment.H.i.setOnCurrentCode(betSuccessfulPageFragment.Q.shareCode);
                }
            });
            this.H.i.setOnCodeConfirmedListener(new CustomCodeComposeUtil.a() { // from class: ga3
                @Override // com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil.a
                public final void a(String str) {
                    BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    betSuccessfulPageFragment.H.i.z();
                    betSuccessfulPageFragment.H.i.setVisibility(8);
                    u93 u93Var = betSuccessfulPageFragment.J;
                    Order order = betSuccessfulPageFragment.Q;
                    String str2 = order.shareCode;
                    String str3 = order.orderId;
                    String str4 = betSuccessfulPageFragment.R;
                    u93Var.getClass();
                    ej5.c(o8i0.d(u93Var), null, null, new q93(str2, u93Var, str, str3, str4, null), 3);
                }
            });
            u2u u2uVar = this.A;
            ha3 ha3Var = new ha3(this, i);
            u2uVar.getClass();
            zu7.a aVar = zu7.a;
            pfd pfdVar = fse.a;
            ej5.c(zu7.b(gku.a), null, null, new l2u(u2uVar, ha3Var, null), 3);
            this.H.i0.setOnClickListener(new ja3(this, i));
            this.W = new yy4(null);
            this.H.a0.setOffscreenPageLimit(getResources().getConfiguration().screenWidthDp < 600 ? 1 : 2);
            this.H.a0.setAdapter(this.W);
            this.H.a0.c(new mc3(this));
            final int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start);
            int dimensionPixelSize2 = requireContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_start_small);
            final int dimensionPixelSize3 = requireContext().getResources().getDimensionPixelSize(R.dimen.featured_match_padding_end);
            b9i0.a(this.H.a0, true, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
            if (getResources().getConfiguration().screenWidthDp >= 600) {
                this.H.a0.post(new Runnable() { // from class: dc3
                    @Override // java.lang.Runnable
                    public final void run() {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        View childAt = betSuccessfulPageFragment.H.a0.getChildAt(0);
                        if (childAt instanceof RecyclerView) {
                            RecyclerView recyclerView = (RecyclerView) childAt;
                            int width = betSuccessfulPageFragment.H.a0.getWidth();
                            if (width <= 0) {
                                return;
                            }
                            int i4 = dimensionPixelSize;
                            int i5 = width - i4;
                            recyclerView.setPadding(i4, 0, i5 - ((i5 - dimensionPixelSize3) / 2), 0);
                        }
                    }
                });
            }
            this.W.b = new fz4() { // from class: ic3
                @Override // defpackage.fz4
                public final void a(ez4 ez4Var) {
                    this.a.K.B1(ez4Var);
                }
            };
            gy4.b(this.H.Y, new qy4(null), this.Y, new Function0() { // from class: jc3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                    BookingCodeInfoDto bookingCodeInfoDtoZ1 = betSuccessfulPageFragment.K.z1();
                    if (bookingCodeInfoDtoZ1 != null) {
                        betSuccessfulPageFragment.K.B1(new ez4.c(bookingCodeInfoDtoZ1.getBookingCode()));
                    }
                    return Unit.a;
                }
            }, new kc3(this, i), new lc3());
            this.H.X.setOnClickListener(new View.OnClickListener() { // from class: y93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.K.D1(true);
                }
            });
            this.H.b.setAspectRatio(0.22222222f);
            new ix1(this.H.b).a();
            this.H.L.setVisibility(0);
            szx.b(this.H.L, null, this.Q.orderId, e0y.BetSuccessful, new Function1() { // from class: z93
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    this.a.R = (String) obj;
                    return Unit.a;
                }
            });
            if (this.T) {
                ComposeView composeView = this.H.F;
                final String str = this.Q.orderId;
                str.getClass();
                composeView.setContent(new op8(1907145940, new Function2() { // from class: wap
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final String str2 = str;
                            scv.b(null, null, null, pp8.b(1337947304, new Function2() { // from class: xap
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        ebp.c(str2, aVar3, 0);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 3072, 7);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, true));
                this.H.F.setVisibility(0);
            }
            if (this.D.F()) {
                this.H.f0.setVisibility(0);
                this.H.g0.a.setVisibility(0);
                t0(R.id.one_cut, this.H.w);
                t0(R.id.open_bets_label, this.H.f0);
                t0(R.id.social_share_divider, this.H.d);
                t0(R.id.booking_code_row, this.H.g0.a);
                t0(R.id.social_share_section, this.H.F);
                int iA = zch0.a(requireContext(), 24);
                s0(this.H.g0.i, iA);
                s0(this.H.g0.c, iA);
                s0(this.H.g0.f, iA);
                s0(this.H.g0.v, iA);
                s0(this.H.g0.d, iA);
                this.H.g0.i.setOnClickListener(new View.OnClickListener() { // from class: mb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.d dVar = new cln.d(aga0.c);
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(dVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
                this.H.g0.c.setOnClickListener(new View.OnClickListener() { // from class: nb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.d dVar = new cln.d(aga0.a);
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(dVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
                this.H.g0.f.setOnClickListener(new View.OnClickListener() { // from class: ob3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.d dVar = new cln.d(aga0.b);
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(dVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
                this.H.g0.v.setOnClickListener(new View.OnClickListener() { // from class: qb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.d dVar = new cln.d(aga0.d);
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(dVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
                this.H.g0.b.setOnClickListener(new rb3(this, i));
                this.H.g0.e.setOnClickListener(new View.OnClickListener() { // from class: sb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.c cVar = cln.c.a;
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(cVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
                this.H.g0.d.setOnClickListener(new View.OnClickListener() { // from class: tb3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
                        u93 u93Var = betSuccessfulPageFragment.J;
                        cln.b bVar = cln.b.a;
                        Order order = betSuccessfulPageFragment.Q;
                        u93Var.y1(bVar, order.shareCode, order.orderId, betSuccessfulPageFragment.R);
                    }
                });
            }
            this.f.d(ime.a(dialog), "fs-unmask");
        }
    }

    public final void r0() {
        String str;
        uqm uqmVar = this.C;
        if (uqmVar == null) {
            return;
        }
        String lastNickName = uqmVar.getLastNickName();
        String str2 = "";
        String str3 = lastNickName == null ? "" : lastNickName;
        boolean nicknameVerified = this.C.getAccountInfo() != null ? this.C.getAccountInfo().getNicknameVerified() : false;
        Order order = this.Q;
        if (order != null && !TextUtils.isEmpty(order.shareCode)) {
            str2 = this.Q.shareCode;
        }
        String str4 = str2;
        Context contextRequireContext = requireContext();
        boolean z = !nicknameVerified;
        boolean z2 = this.a0;
        if (z2) {
            k130 k130Var = k130.a;
            str = "BOOKING_CODES";
        } else {
            str = null;
        }
        String str5 = str;
        int i = SocialActivity.b;
        startActivity(SocialActivity.a.a(contextRequireContext, str3, z, str4, z2, false, str5));
    }

    public final void u0(boolean z) {
        this.b0 = z;
        zie zieVar = this.H;
        if (zieVar == null) {
            return;
        }
        zieVar.T.setVisibility(z ? 0 : 8);
        this.H.S.setVisibility(z ? 8 : 0);
    }

    public final void v0(String str, String str2) {
        if (this.D.p()) {
            this.H.B.setVisibility(0);
            this.H.C.setVisibility(0);
            this.H.C.setText(hu2.f(str2, str, null));
        }
        this.H.K.setText(str);
        this.H.l0.setText(str2);
    }

    public final void w0() {
        this.i.b(requireContext(), sn5.b(requireContext(), R.string.app_common__system_crash_dialog_error_title, new Object[0]), sn5.b(requireContext(), R.string.app_common__system_crash_dialog_error_message, new Object[0]));
    }

    public final void y0(b bVar) {
        boolean zAreNotificationsEnabled;
        int i = 0;
        if (Build.VERSION.SDK_INT < 33) {
            zAreNotificationsEnabled = new t2y(requireContext()).b.areNotificationsEnabled();
        } else {
            zAreNotificationsEnabled = o0b.a(requireContext(), "android.permission.POST_NOTIFICATIONS") == 0;
        }
        if (zAreNotificationsEnabled) {
            o0(bVar);
            return;
        }
        u93 u93Var = this.J;
        ka3 ka3Var = new ka3(i, this, bVar);
        u93Var.getClass();
        ej5.c(o8i0.d(u93Var), u93Var.e, null, new s93(u93Var, ka3Var, null), 2);
    }

    public final void z0() {
        zie zieVar = this.H;
        if (zieVar == null) {
            return;
        }
        zieVar.S.setText(sn5.d(this, this.a0 ? R.string.common_functions__view : R.string.common_functions__publish, new Object[0]));
    }
}
