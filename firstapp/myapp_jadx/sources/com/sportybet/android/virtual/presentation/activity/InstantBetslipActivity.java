package com.sportybet.android.virtual.presentation.activity;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.viewpager.widget.ViewPager;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.virtual.presentation.activity.InstantBetslipActivity;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.bb40;
import defpackage.bqe;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.dvi;
import defpackage.fpn;
import defpackage.g9i0;
import defpackage.gfo;
import defpackage.grm;
import defpackage.hb5;
import defpackage.i2i;
import defpackage.i5s;
import defpackage.itf0;
import defpackage.jdo;
import defpackage.jlo;
import defpackage.jp3;
import defpackage.jpk;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lt3;
import defpackage.m780;
import defpackage.mdo;
import defpackage.msl;
import defpackage.n4p;
import defpackage.n8j0;
import defpackage.nzm;
import defpackage.o4p;
import defpackage.pu0;
import defpackage.qoa0;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rgd;
import defpackage.rlf;
import defpackage.s8i0;
import defpackage.sqf0;
import defpackage.sqo;
import defpackage.tlf;
import defpackage.uqm;
import defpackage.uwd0;
import defpackage.v8i0;
import defpackage.y03;
import defpackage.yfo;
import defpackage.yui;
import defpackage.z3p;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class InstantBetslipActivity extends msl implements View.OnClickListener, View.OnTouchListener, y03, bb40, rlf {
    public static final /* synthetic */ int Y = 0;
    public ViewPager B;
    public Button D;
    public Button E;
    public Button F;
    public LinearLayout G;
    public TextView H;
    public TextView I;
    public View J;
    public TextView K;
    public View L;
    public ConstraintLayout M;
    public View N;
    public mdo P;
    public jlo Q;
    public n4p R;
    public nzm S;
    public jpk T;
    public jdo U;
    public grm V;
    public String W;
    public float X;
    public final ArrayList C = new ArrayList();
    public final HashMap O = new HashMap();

    public class a extends ViewPager.l {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void N0(int i) {
            InstantBetslipActivity instantBetslipActivity = InstantBetslipActivity.this;
            if (instantBetslipActivity.R.d.size() > 1) {
                instantBetslipActivity.U.j0(i, instantBetslipActivity.R.c());
            }
        }
    }

    public static boolean I1(int i, o4p o4pVar, o4p o4pVar2) {
        if (i != 0) {
            if (i == 1) {
                if (o4pVar == null || o4pVar.o) {
                    return false;
                }
            } else if (i != 2 || o4pVar2 == null || o4pVar2.o || o4pVar2.e.size() <= 1) {
                return false;
            }
        }
        return true;
    }

    public final void G1() {
        if (this.R.d.size() <= 1 || this.R.H()) {
            this.G.setVisibility(8);
        } else {
            this.G.setVisibility(0);
        }
    }

    public final void H1() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jp3 jp3Var = (jp3) obj;
            if (jp3Var != null && jp3Var.isAdded()) {
                jp3Var.p0();
            }
        }
    }

    public final void J1() {
        String strC = this.R.c();
        mdo mdoVar = this.P;
        mdoVar.getClass();
        Intent intentL = this.Q.l(this, new InstantWinInput(strC, null, null, mdoVar.i.B(strC)));
        intentL.addFlags(65536);
        startActivity(intentL);
    }

    public final void K1(boolean z) {
        i5s i5sVar = this.v;
        uqm uqmVar = this.accountHelper;
        yfo yfoVar = new yfo() { // from class: dpn
            @Override // defpackage.yfo
            public final void b(boolean z2) {
                int i = InstantBetslipActivity.Y;
                InstantBetslipActivity instantBetslipActivity = this.a;
                if (!z2) {
                    instantBetslipActivity.J1();
                } else {
                    instantBetslipActivity.L1();
                    instantBetslipActivity.w.g();
                }
            }
        };
        i5sVar.getClass();
        i5s.c(uqmVar, this, yfoVar, z);
    }

    public final void L1() {
        boolean zIsLogin = this.accountHelper.isLogin();
        this.I.setVisibility(zIsLogin ? 0 : 8);
        this.J.setVisibility(zIsLogin ? 8 : 0);
    }

    @Override // defpackage.y03
    public final void M0(int i, String str) {
        HashMap map = this.O;
        int iIntValue = map.containsKey(str) ? ((Integer) map.get(str)).intValue() : 0;
        int size = this.R.d.size();
        ArrayList arrayList = this.C;
        if (size == 1) {
            Q1(((jp3) arrayList.get(0)).m0(1) - ((int) bqe.b.getDimension(R.dimen.iwqk_bet_slip_tab_layout_height_36_dp)));
            return;
        }
        if (this.R.d.size() == 2 && str.equals("system")) {
            Q1(((jp3) arrayList.get(1)).m0(2));
        } else if (iIntValue == this.B.getCurrentItem()) {
            Q1(i);
        }
    }

    public final void M1() {
        if (this.R.d.size() == 0) {
            H1();
            P1(0);
        }
        BigDecimal bigDecimal = new BigDecimal(this.S.j());
        o4p o4pVarA = sqo.a(SimulateBetConsts.BetslipType.SINGLE, this.W, bigDecimal, this.R.d.values(), this.R);
        o4p o4pVarA2 = sqo.a(SimulateBetConsts.BetslipType.MULTIPLE, this.W, bigDecimal, this.R.d.values(), this.R);
        o4p o4pVarA3 = sqo.a("system", this.W, bigDecimal, this.R.d.values(), this.R);
        this.R.M(SimulateBetConsts.BetslipType.SINGLE, o4pVarA);
        this.R.M(SimulateBetConsts.BetslipType.MULTIPLE, o4pVarA2);
        this.R.M("system", o4pVarA3);
        N1(o4pVarA);
        N1(o4pVarA2);
        N1(o4pVarA3);
        ArrayList arrayList = this.C;
        ((jp3) arrayList.get(0)).D0();
        boolean z = (o4pVarA2 == null || o4pVarA2.o) ? false : true;
        if (z) {
            O1(1, true);
            ((jp3) arrayList.get(1)).D0();
        } else {
            O1(1, false);
            if (this.E.isSelected()) {
                P1(0);
            }
        }
        G1();
        this.H.setText(String.valueOf(this.R.d.size()));
        R1();
        if (o4pVarA3 == null || ((o4pVarA2 != null && o4pVarA2.o) || o4pVarA3.e.size() == 1)) {
            O1(2, false);
            if (this.F.isSelected()) {
                P1(0);
            }
        } else {
            O1(2, true);
            ((jp3) arrayList.get(2)).D0();
        }
        n4p n4pVar = this.R;
        if (z) {
            o4pVarA = o4pVarA2;
        }
        n4pVar.x(o4pVarA);
    }

    public final void N1(o4p o4pVar) {
        String str;
        m780 m780VarT0;
        if (o4pVar == null || (m780VarT0 = this.T.t0((str = o4pVar.a))) == null) {
            return;
        }
        n4p n4pVar = this.R;
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, n4pVar.B, n4pVar.C, this.f, null);
        if (instantWinGiftApplicabilityContextA == null || gfo.a(m780VarT0.b, instantWinGiftApplicabilityContextA.a)) {
            return;
        }
        this.T.E(str);
    }

    public final void O1(int i, boolean z) {
        if (i == 0) {
            this.D.setEnabled(z);
            this.D.getPaint().setFlags(z ? 0 : 16);
        } else if (i == 1) {
            this.E.setEnabled(z);
            this.E.getPaint().setFlags(z ? 0 : 16);
        } else if (i == 2) {
            this.F.setEnabled(z);
            this.F.getPaint().setFlags(z ? 0 : 16);
        }
    }

    public final void P1(int i) {
        if (i == 0) {
            this.D.setSelected(true);
            this.E.setSelected(false);
            this.F.setSelected(false);
        } else if (i == 1) {
            this.D.setSelected(false);
            this.E.setSelected(true);
            this.F.setSelected(false);
        } else if (i == 2) {
            this.D.setSelected(false);
            this.E.setSelected(false);
            this.F.setSelected(true);
        }
        this.B.setCurrentItem(i);
    }

    public final void Q1(int i) {
        if (this.R.s() && this.R.d.size() == 0) {
            H1();
        }
        int iMax = Math.max((getResources().getDisplayMetrics().heightPixels - i) - bqe.a(126.0f), (int) bqe.b.getDimension(R.dimen.iwqk_betslip_top_grey_area_mini_height_68_dp));
        ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
        layoutParams.height = iMax;
        this.N.setLayoutParams(layoutParams);
    }

    public final void R1() {
        if (this.K == null || !this.R.s()) {
            return;
        }
        boolean z = this.R.d.size() > 0;
        this.K.setEnabled(z);
        this.K.setClickable(z);
        int color = getColor(z ? R.color.text_type2_primary : R.color.text_disabled_action);
        this.K.setTextColor(color);
        for (Drawable drawable : this.K.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.mutate().setTint(color);
            }
        }
    }

    @Override // defpackage.y03
    public final void W() {
        sqo.p(this, new DialogInterface.OnClickListener() { // from class: epn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = InstantBetslipActivity.Y;
                this.a.J1();
            }
        });
    }

    @Override // defpackage.y03
    public final void X() {
        i5s i5sVar = this.v;
        uqm uqmVar = this.accountHelper;
        i5sVar.getClass();
        i5s.b(uqmVar, this, null);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        this.L.setBackground(getDrawable(R.drawable.bg_iv_betslip_enter));
        overridePendingTransition(R.anim.activity_slide_exit_bottom_without_change, R.anim.activity_slide_exit_bottom);
    }

    @Override // defpackage.y03
    public final void n0() {
        if (this.R.s() && this.R.d.size() == 0) {
            this.T.b0();
            n4p n4pVar = this.R;
            n4pVar.A.h = 0;
            n4pVar.C = false;
            n4pVar.B = false;
        }
        M1();
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.i8
    public final void onAccountChange(Account account) {
        E1();
        L1();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [yon] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.single_tab) {
            P1(0);
            return;
        }
        if (id == R.id.multiple_tab) {
            P1(1);
            return;
        }
        if (id == R.id.system_tab) {
            P1(2);
            return;
        }
        if (id == R.id.translucent_background || id == R.id.collapse_icon) {
            finish();
            return;
        }
        FragmentManager supportFragmentManager = null;
        if (id != R.id.iwqk_remove_all) {
            if (id == R.id.bet_settings) {
                try {
                    Context contextB = dvi.b(this);
                    contextB.getClass();
                    supportFragmentManager = ((e) contextB).getSupportFragmentManager();
                    if (supportFragmentManager.H("BetSettingDlg") != null) {
                        itf0.a aVar = itf0.a;
                        aVar.q("BetSettingDlg");
                        aVar.a("a dialog is already on the screen", new Object[0]);
                        return;
                    }
                } catch (ClassCastException unused) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q("BetSettingDlg");
                    aVar2.a("Can't get fragment manager", new Object[0]);
                }
                if (supportFragmentManager == null || supportFragmentManager.K) {
                    return;
                }
                z3p z3pVar = new z3p();
                z3pVar.setCancelable(true);
                z3pVar.show(supportFragmentManager, "BetSettingDlg");
                return;
            }
            return;
        }
        boolean zS = this.R.s();
        n4p n4pVar = this.R;
        if (!zS) {
            sqo.o(this, n4pVar, this.T, null);
            return;
        }
        int size = n4pVar.d.size();
        if (size == 0) {
            return;
        }
        if (size != 1) {
            sqo.o(this, this.R, this.T, new Runnable() { // from class: yon
                @Override // java.lang.Runnable
                public final void run() {
                    int i = InstantBetslipActivity.Y;
                    InstantBetslipActivity instantBetslipActivity = this.a;
                    instantBetslipActivity.H1();
                    instantBetslipActivity.P1(0);
                    instantBetslipActivity.M1();
                }
            });
            return;
        }
        H1();
        this.T.b0();
        this.R.d();
        n4p n4pVar2 = this.R;
        n4pVar2.A.h = 0;
        n4pVar2.C = false;
        n4pVar2.B = false;
        H1();
        P1(0);
        M1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n8j0.g cVar;
        HashMap map = this.O;
        ArrayList arrayList = this.C;
        super.onCreate(bundle);
        setContentView(R.layout.activity_iwqk_betslip_layout);
        findViewById(R.id.layout_container).setSystemUiVisibility(1280);
        int i = 0;
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i2 >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i2 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(false);
            cVar.c(false);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, null == true ? 1 : 0);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        findViewById(R.id.collapse_icon).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.iwqk_remove_all);
        this.K = textView;
        textView.setOnClickListener(this);
        findViewById(R.id.bet_settings).setOnClickListener(this);
        this.I = (TextView) findViewById(R.id.tv_balance);
        this.J = findViewById(R.id.guest_auth_layout);
        TextView textView2 = (TextView) findViewById(R.id.tv_register);
        TextView textView3 = (TextView) findViewById(R.id.tv_login);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: zon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = InstantBetslipActivity.Y;
                this.a.K1(true);
            }
        });
        textView3.setOnClickListener(new rgd(this, 1));
        this.B = (ViewPager) findViewById(R.id.view_pager);
        this.D = (Button) findViewById(R.id.single_tab);
        this.E = (Button) findViewById(R.id.multiple_tab);
        this.F = (Button) findViewById(R.id.system_tab);
        this.G = (LinearLayout) findViewById(R.id.tab_layout);
        this.H = (TextView) findViewById(R.id.bet_number);
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.N = findViewById(R.id.view_top_empty_area);
        getWindow().setSoftInputMode(2);
        this.W = getIntent().getStringExtra("ARG_ROUND_ID");
        try {
            BigDecimal bigDecimal = new BigDecimal(this.S.j());
            if (this.R.F()) {
                bigDecimal = this.V.a();
            }
            o4p o4pVarA = sqo.a(SimulateBetConsts.BetslipType.SINGLE, this.W, bigDecimal, this.R.d.values(), this.R);
            final o4p o4pVarA2 = this.R.A().c;
            if (o4pVarA2 == null || !TextUtils.equals(o4pVarA2.a, SimulateBetConsts.BetslipType.MULTIPLE)) {
                o4pVarA2 = sqo.a(SimulateBetConsts.BetslipType.MULTIPLE, this.W, bigDecimal, this.R.d.values(), this.R);
            }
            final o4p o4pVarA3 = sqo.a("system", this.W, bigDecimal, this.R.d.values(), this.R);
            if (o4pVarA != null) {
                n4p n4pVar = this.R;
                if (!TextUtils.isEmpty((CharSequence) n4pVar.u.first) && !TextUtils.isEmpty((CharSequence) n4pVar.u.second)) {
                    o4pVarA.h(new BigDecimal(this.R.B()), this.R.C());
                }
            }
            this.R.M(SimulateBetConsts.BetslipType.SINGLE, o4pVarA);
            this.R.M(SimulateBetConsts.BetslipType.MULTIPLE, o4pVarA2);
            this.R.M("system", o4pVarA3);
            arrayList.clear();
            arrayList.add(jp3.C0(SimulateBetConsts.BetslipType.SINGLE));
            arrayList.add(jp3.C0(SimulateBetConsts.BetslipType.MULTIPLE));
            arrayList.add(jp3.C0("system"));
            map.put(SimulateBetConsts.BetslipType.SINGLE, 0);
            map.put(SimulateBetConsts.BetslipType.MULTIPLE, 1);
            map.put("system", 2);
            G1();
            this.H.setText(String.valueOf(this.R.d.size()));
            if (o4pVarA2 == null || o4pVarA2.o) {
                O1(1, false);
            }
            if (o4pVarA3 == null || o4pVarA3.o || o4pVarA3.e.size() == 1) {
                O1(2, false);
            }
            this.B.setAdapter(new yui(getSupportFragmentManager(), arrayList, null));
            this.B.setOffscreenPageLimit(2);
            this.B.b(new a());
            if (o4pVarA2 != null) {
                i = 1;
            }
            P1(i);
            i2i.b(this.U.F(this.R.c())).f(this, new lfy() { // from class: apn
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    int i3 = InstantBetslipActivity.Y;
                    if (num == null) {
                        return;
                    }
                    boolean zI1 = InstantBetslipActivity.I1(num.intValue(), o4pVarA2, o4pVarA3);
                    InstantBetslipActivity instantBetslipActivity = this.a;
                    if (zI1) {
                        instantBetslipActivity.P1(num.intValue());
                    } else {
                        instantBetslipActivity.U.j0(-1, instantBetslipActivity.R.c());
                    }
                }
            });
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INSTANT_WIN);
            aVar.g("Bet slip error :%s", e.getMessage());
            sqo.j(this, new fpn(this));
        }
        this.M = (ConstraintLayout) findViewById(R.id.layout_betslip_container);
        findViewById(R.id.layout_top_area).setOnTouchListener(this);
        View viewFindViewById2 = findViewById(R.id.translucent_background);
        this.L = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.L.setOnTouchListener(this);
        ((TransitionDrawable) this.L.getBackground()).startTransition(300);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.activity_slide_enter_bottom);
        animationLoadAnimation.reset();
        this.M.clearAnimation();
        this.M.startAnimation(animationLoadAnimation);
        i2i.b(this.w.h(pu0.b.a)).f(this, new lfy() { // from class: bpn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                int i3 = InstantBetslipActivity.Y;
                boolean z = lk50Var instanceof lk50.c;
                InstantBetslipActivity instantBetslipActivity = this.a;
                if (z) {
                    instantBetslipActivity.I.setText(instantBetslipActivity.getCMSString(R.string.app_common__var_var, a8b.d(), bjb0.U(((AssetsInfo) ((lk50.c) lk50Var).a).balance, Locale.US)));
                }
                instantBetslipActivity.L1();
            }
        });
        L1();
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(mdo.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.P = (mdo) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        if (this.R.s()) {
            uwd0<lt3> uwd0VarY = this.P.f.y();
            uwd0VarY.getClass();
            i2i.c(uwd0VarY, null, 3).f(this, new lfy() { // from class: cpn
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    int i3 = InstantBetslipActivity.Y;
                    this.a.G1();
                }
            });
        }
        R1();
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.R.w();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.w.g();
        L1();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == R.id.layout_top_area || view.getId() == R.id.translucent_background) {
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.X = y;
            } else if (action == 1) {
                float f = y - this.X;
                if (Math.abs(f) > 10.0f && f > 0.0f) {
                    finish();
                }
            }
        }
        return view.getId() != R.id.translucent_background;
    }

    @Override // defpackage.y03
    public final void y0() {
        BigDecimal bigDecimal = new BigDecimal(this.S.j());
        o4p o4pVarA = sqo.a(SimulateBetConsts.BetslipType.SINGLE, this.W, bigDecimal, this.R.d.values(), this.R);
        o4p o4pVarA2 = sqo.a(SimulateBetConsts.BetslipType.MULTIPLE, this.W, bigDecimal, this.R.d.values(), this.R);
        o4p o4pVarA3 = sqo.a("system", this.W, bigDecimal, this.R.d.values(), this.R);
        this.R.M(SimulateBetConsts.BetslipType.SINGLE, o4pVarA);
        this.R.M(SimulateBetConsts.BetslipType.MULTIPLE, o4pVarA2);
        this.R.M("system", o4pVarA3);
        boolean z = (o4pVarA2 == null || o4pVarA2.o) ? false : true;
        boolean z2 = (o4pVarA3 == null || o4pVarA3.o || o4pVarA3.e.size() <= 1) ? false : true;
        O1(1, z);
        O1(2, z2);
        int size = this.R.d.size();
        int currentItem = this.B.getCurrentItem();
        if (size <= 1) {
            currentItem = 0;
        } else if ((currentItem == 0 && size == 2) || !I1(currentItem, o4pVarA2, o4pVarA3)) {
            currentItem = z;
        }
        ArrayList arrayList = this.C;
        ((jp3) arrayList.get(currentItem)).D0();
        if (currentItem != 0) {
            ((jp3) arrayList.get(0)).D0();
        }
        if (z && currentItem != 1) {
            ((jp3) arrayList.get(1)).D0();
        }
        if (z2 && currentItem != 2) {
            ((jp3) arrayList.get(2)).D0();
        }
        P1(currentItem);
        G1();
        this.H.setText(String.valueOf(this.R.d.size()));
        R1();
        n4p n4pVar = this.R;
        if (z) {
            o4pVarA = o4pVarA2;
        }
        n4pVar.x(o4pVarA);
    }
}
