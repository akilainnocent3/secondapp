package com.sportybet.android.virtual.presentation.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorBody;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.presentation.widget.InstantWinMultipleBetBonusHint;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a5o;
import defpackage.a78;
import defpackage.azm;
import defpackage.bde0;
import defpackage.bjb0;
import defpackage.c8i0;
import defpackage.cmo;
import defpackage.ctl;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.eeo;
import defpackage.ex4;
import defpackage.fjd;
import defpackage.g8i0;
import defpackage.gbn;
import defpackage.geo;
import defpackage.gky;
import defpackage.grm;
import defpackage.hb5;
import defpackage.i5s;
import defpackage.ibs;
import defpackage.iel;
import defpackage.if30;
import defpackage.itf0;
import defpackage.j7g;
import defpackage.ji2;
import defpackage.jlo;
import defpackage.jpk;
import defpackage.jq40;
import defpackage.k00;
import defpackage.lfy;
import defpackage.ll5;
import defpackage.m4d;
import defpackage.m780;
import defpackage.mdo;
import defpackage.n4p;
import defpackage.nzm;
import defpackage.o4p;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.oxc;
import defpackage.pjo;
import defpackage.psm;
import defpackage.pvf;
import defpackage.qjo;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.s0b;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.sqf0;
import defpackage.sqo;
import defpackage.tl5;
import defpackage.tlo;
import defpackage.u0v;
import defpackage.uqm;
import defpackage.uy0;
import defpackage.v8i0;
import defpackage.w1k;
import defpackage.w8i0;
import defpackage.wae;
import defpackage.wga;
import defpackage.xho;
import defpackage.yjo;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InstantWinQuickBetView extends ctl implements eeo.a, View.OnClickListener {
    public static final /* synthetic */ int s0 = 0;
    public final EditText A;
    public final KeyboardView B;
    public Map.Entry<String, BetSlipData> C;
    public final ConstraintLayout D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final InstantWinMultipleBetBonusHint H;
    public final View I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public WeakReference<e> O;
    public final Handler P;
    public final View Q;
    public final TextView R;
    public final ImageView S;
    public boolean T;
    public final TaxConfig U;
    public mdo V;
    public azm W;
    public jlo a0;
    public ji2 b0;
    public final RelativeLayout c;
    public uqm c0;
    public b d;
    public n4p d0;
    public final TextView e;
    public uy0 e0;
    public final TextView f;
    public rdd0 f0;
    public ex4 g0;
    public i5s h0;
    public final TextView i;
    public psm i0;
    public nzm j0;
    public gbn k0;
    public JsonSerializeService l0;
    public jpk m0;
    public u0v n0;
    public cmo o0;
    public grm p0;
    public boolean q0;
    public final a r0;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    /* JADX INFO: loaded from: classes6.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InstantWinQuickBetView instantWinQuickBetView = InstantWinQuickBetView.this;
            if (instantWinQuickBetView.q0) {
                instantWinQuickBetView.h(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public interface b {
        void a(String str);

        void b(String str, String str2);

        void c();

        void d(Map.Entry<String, BetSlipData> entry);

        void e();
    }

    public InstantWinQuickBetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((yjo) generatedComponent()).o(this);
        }
        this.P = new Handler(Looper.getMainLooper());
        this.U = TaxConfig.getDefault();
        this.r0 = new a();
        View.inflate(getContext(), R.layout.iwqk_layout_quickbet, this);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(R.color.transparent_white));
        this.U = this.g0.C().getVirtualTaxConfig();
        this.c = (RelativeLayout) findViewById(R.id.single_bet_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.delete);
        ImageView imageView = (ImageView) findViewById(R.id.close_quick_bet);
        this.e = (TextView) findViewById(R.id.match_outcome_desc);
        this.f = (TextView) findViewById(R.id.market_title);
        this.i = (TextView) findViewById(R.id.bet_builder_combine_count);
        this.v = (TextView) findViewById(R.id.home_team);
        this.w = (TextView) findViewById(R.id.away_team);
        this.y = (TextView) findViewById(R.id.odds_value);
        this.A = (EditText) findViewById(R.id.amount_edit_text);
        this.z = (TextView) findViewById(R.id.warning_msg);
        this.S = (ImageView) findViewById(R.id.sports_icon);
        this.B = (KeyboardView) findViewById(R.id.custom_number_keyboard);
        this.D = (ConstraintLayout) findViewById(R.id.cl_multiple_bet);
        this.E = (TextView) findViewById(R.id.tv_multibet_count);
        this.F = (TextView) findViewById(R.id.tv_multibet_odds_value);
        this.G = findViewById(R.id.keyboard_container);
        View viewFindViewById = findViewById(R.id.pot_win_btn);
        this.I = findViewById(R.id.place_bet_btn);
        this.J = (TextView) findViewById(R.id.pot_win_amount);
        TextView textView = (TextView) findViewById(R.id.about_to_pay_amount);
        this.K = textView;
        textView.setText(sn5.c(this, R.string.component_betslip__place_bet, new Object[0]));
        this.H = (InstantWinMultipleBetBonusHint) findViewById(R.id.multiplebet_bonus_hint);
        this.L = (TextView) findViewById(R.id.wh_tax_value);
        this.N = (TextView) findViewById(R.id.wh_tax_label);
        TextView textView2 = (TextView) findViewById(R.id.excise_tax_label);
        this.M = textView2;
        textView2.setText(sn5.c(this, R.string.component_betslip__about_to_pay_vamount_lineup, "--"));
        linearLayout.setOnClickListener(this);
        imageView.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.D.setOnClickListener(this);
        viewFindViewById.setOnClickListener(this);
        this.I.setOnClickListener(this);
        View viewFindViewById2 = findViewById(R.id.gifts_container);
        this.Q = viewFindViewById2;
        g8i0.b(viewFindViewById2, this.m0.a0());
        findViewById(R.id.gifts_touch_area).setOnClickListener(this);
        this.R = (TextView) findViewById(R.id.gifts);
        this.R.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, s0b.a(getContext(), R.drawable.ic_play_arrow_green_24dp, new a78.c(R.color.custom_text_type1_primary_type1)), (Drawable) null);
    }

    private String getFinalGiftAmount() {
        this.d0.A();
        o4p o4pVar = this.d0.A().c;
        m780 m780VarT0 = this.m0.t0(SimulateBetConsts.BetslipType.SINGLE);
        if (m780VarT0 == null || o4pVar == null || o4pVar.j == null) {
            EditText editText = this.A;
            return editText.getText() != null ? editText.getText().toString() : "0";
        }
        int kind = m780VarT0.b.getKind();
        String str = m780VarT0.a;
        String strB = m780VarT0.b();
        BigDecimal bigDecimal = o4pVar.j;
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(i(str));
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalSubtract.compareTo(bigDecimal2) < 0) {
            bigDecimalSubtract = bigDecimal2;
        }
        if (kind != 2 || TextUtils.isEmpty(strB) || bigDecimal.compareTo(i(strB)) >= 0) {
            bigDecimal = bigDecimalSubtract;
        }
        return bigDecimal.toPlainString();
    }

    private String getInputData() {
        return ".".equals(this.A.getText().toString().trim()) ? "" : this.A.getText().toString();
    }

    private String getUsableGiftAmountString() {
        m780 m780VarT0;
        o4p o4pVar = this.d0.A().c;
        if (o4pVar == null || (m780VarT0 = this.m0.t0(SimulateBetConsts.BetslipType.SINGLE)) == null) {
            return null;
        }
        String string = o4pVar.j.toString();
        int kind = m780VarT0.b.getKind();
        String strB = m780VarT0.b();
        if (kind != 2 || TextUtils.isEmpty(string) || TextUtils.isEmpty(strB) || Double.parseDouble(string) >= Double.parseDouble(strB)) {
            return m780VarT0.a;
        }
        return null;
    }

    public static BigDecimal i(String str) {
        if (str == null) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(str.trim());
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    private void setInputEnabled(boolean z) {
        this.I.setEnabled(z);
        this.K.setEnabled(z);
        this.M.setEnabled(z);
    }

    public final void a(m780 m780Var) {
        EditText editText;
        o4p o4pVar = this.d0.A().c;
        if (o4pVar == null || (editText = this.A) == null || m780Var == null || m780Var.b.getKind() != 3) {
            return;
        }
        BigDecimal bigDecimal = o4pVar.j;
        String str = m780Var.a;
        if (bigDecimal.compareTo(new BigDecimal(str)) < 0) {
            editText.setText(str);
            o();
        }
    }

    @Override // eeo.a
    public final void b() {
        m(false);
        if (this.d0.N()) {
            e eVar = this.O.get();
            n4p n4pVar = this.d0;
            sqo.i(eVar, n4pVar.s, n4pVar.F());
            return;
        }
        this.q0 = true;
        Handler handler = this.P;
        a aVar = this.r0;
        handler.removeCallbacks(aVar);
        n(true);
        n4p n4pVar2 = this.d0;
        o4p o4pVar = n4pVar2.f;
        if (o4pVar == null) {
            hb5.a("no ticket data to place bet");
            return;
        }
        String strC = n4pVar2.c();
        n4p n4pVar3 = this.d0;
        this.V.x1(sqf0.b(strC, n4pVar3.t, o4pVar, n4pVar3.B, n4pVar3.C, n4pVar3.A, n4pVar3.l, n4pVar3.G, n4pVar3.q, n4pVar3.r, this.m0.t0(SimulateBetConsts.BetslipType.SINGLE)), o4pVar.j, InstantWinBetSource.QUICK_BET);
        handler.removeCallbacks(aVar);
        handler.postDelayed(aVar, 30000L);
        j("bet_and_kick_off_confirm");
    }

    public final boolean c() {
        o4p o4pVar = this.d0.A().c;
        String strA = this.h0.a(getContext(), getInputData(), this.e0.c(), o4pVar != null ? o4pVar.a : null);
        if (TextUtils.isEmpty(strA)) {
            this.T = false;
            k(strA, 0);
            return false;
        }
        this.T = TextUtils.equals(strA, sn5.c(this, R.string.page_instant_virtual__less_balanc, new Object[0]));
        k(strA, Color.parseColor("#e41827"));
        this.A.setActivated(true);
        return true;
    }

    @Override // eeo.a
    public final void d() {
        m(false);
        j("cancel_bet_confirm");
    }

    public final void e() {
        View view = this.G;
        if (view != null) {
            view.setVisibility(8);
        }
        KeyboardView keyboardView = this.B;
        if (keyboardView != null) {
            keyboardView.E();
        }
        EditText editText = this.A;
        if (editText != null) {
            editText.clearFocus();
            this.A.setCursorVisible(false);
        }
    }

    public final boolean f() {
        WeakReference<e> weakReference = this.O;
        return weakReference == null || weakReference.get() == null || this.O.get().isFinishing();
    }

    public final void g() {
        Context context = getContext();
        String strC = this.d0.c();
        mdo mdoVar = this.V;
        mdoVar.getClass();
        Intent intentL = this.a0.l(context, new InstantWinInput(strC, null, null, mdoVar.i.B(strC)));
        intentL.addFlags(65536);
        context.startActivity(intentL);
    }

    public final void h(xho xhoVar) {
        this.P.removeCallbacks(this.r0);
        n(false);
        if (xhoVar == null) {
            l();
            this.q0 = false;
            return;
        }
        if (xhoVar.a) {
            sh8.c().e(o7d.a(wae.REACHED_LIMITS));
        } else {
            String str = this.d0.f.c;
            jlo jloVar = this.a0;
            e eVar = this.O.get();
            if (str == null) {
                str = "";
            }
            jloVar.g(eVar, new OpenBetInput(str, true, InstantWinBetSource.QUICK_BET));
            this.d0.d();
        }
        this.q0 = false;
    }

    public final void k(String str, int i) {
        TextView textView = this.z;
        textView.setText(str);
        if (i != 0) {
            textView.setTextColor(i);
        } else {
            this.A.setActivated(false);
            textView.setTextColor(Color.parseColor("#9da0ab"));
        }
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public final void l() {
        sqo.j(this.O.get(), new DialogInterface.OnClickListener() { // from class: hjo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = InstantWinQuickBetView.s0;
                this.a.g();
            }
        });
    }

    public final void m(boolean z) {
        if (f()) {
            return;
        }
        eeo eeoVar = (eeo) this.O.get().getSupportFragmentManager().H("tag_confirm_dialog");
        if (!z) {
            if (eeoVar != null) {
                eeoVar.v = null;
                eeoVar.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        if (eeoVar == null) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_BETSLIP_TYPE", SimulateBetConsts.BetslipType.SINGLE);
            bundle.putParcelable("ARG_VIRTUAL_TAX_CONFIG", this.U);
            eeo eeoVar2 = new eeo();
            eeoVar2.setArguments(bundle);
            eeoVar2.v = this;
            eeoVar2.show(this.O.get().getSupportFragmentManager(), "tag_confirm_dialog");
        }
    }

    public final void n(boolean z) {
        WeakReference<e> weakReference = this.O;
        if (weakReference == null || weakReference.get() == null || this.O.get().isFinishing()) {
            return;
        }
        FragmentManager supportFragmentManager = this.O.get().getSupportFragmentManager();
        bde0 bde0Var = (bde0) supportFragmentManager.H("tag_submitting_dialog");
        if (!z) {
            if (bde0Var == null || !bde0Var.isAdded()) {
                return;
            }
            bde0Var.dismissAllowingStateLoss();
            return;
        }
        if (bde0Var == null || !bde0Var.isAdded()) {
            bde0 bde0Var2 = new bde0();
            if (supportFragmentManager.K || supportFragmentManager.V()) {
                return;
            }
            bde0Var2.show(supportFragmentManager, "tag_submitting_dialog");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    public final void o() {
        boolean z;
        String str;
        o4p.a aVar;
        ArrayList arrayList;
        BigDecimal bigDecimal;
        Map.Entry<String, BetSlipData> entry;
        boolean zC = c();
        b bVar = this.d;
        if (bVar != null && (entry = this.C) != null) {
            bVar.b(entry.getKey(), getInputData());
        }
        if (this.c.getVisibility() == 0) {
            String inputData = getInputData();
            this.d0.A();
            o4p o4pVar = this.d0.A().c;
            AssetsInfo assetsInfoC = this.e0.c();
            String usableGiftAmountString = getUsableGiftAmountString();
            String finalGiftAmount = getFinalGiftAmount();
            BigDecimal bigDecimalI = i(inputData);
            boolean z2 = bigDecimalI == null || bigDecimalI.compareTo(BigDecimal.ZERO) <= 0;
            boolean z3 = zC && !this.T;
            if (o4pVar == null || assetsInfoC == null || usableGiftAmountString == null) {
                z = false;
            } else {
                BigDecimal bigDecimalDivide = BigDecimal.valueOf(assetsInfoC.balance).divide(geo.a, 2, RoundingMode.HALF_UP);
                BigDecimal bigDecimalI2 = i(usableGiftAmountString);
                if (bigDecimalI2 == null || (bigDecimal = o4pVar.j) == null || bigDecimal.compareTo(bigDecimalDivide.add(bigDecimalI2)) > 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            boolean z4 = zC || z2;
            if (!z || zC) {
                setInputEnabled(!z4);
            } else {
                setInputEnabled(true);
                k("", 0);
            }
            TextView textView = this.J;
            TextView textView2 = this.L;
            if (o4pVar != null) {
                ArrayList arrayList2 = o4pVar.d;
                if ((z2 || z3) && !z) {
                    textView.setText("0.00");
                    textView2.setText("0.00");
                    p(finalGiftAmount);
                } else {
                    BetSlipData betSlipData = null;
                    if (arrayList2 != null && !arrayList2.isEmpty() && (arrayList = (aVar = (o4p.a) arrayList2.get(0)).b) != null && !arrayList.isEmpty()) {
                        betSlipData = ((o4p.b) aVar.b.get(0)).a;
                    }
                    if (betSlipData == null || (str = betSlipData.odds) == null) {
                        textView.setText("0.00");
                        textView2.setText("0.00");
                        p(finalGiftAmount);
                    } else {
                        BigDecimal bigDecimalI3 = i(str);
                        BigDecimal bigDecimal2 = o4pVar.j;
                        if (bigDecimal2 == null) {
                            bigDecimal2 = BigDecimal.ZERO;
                        }
                        if (bigDecimalI3 == null || bigDecimal2.compareTo(BigDecimal.ZERO) <= 0) {
                            textView.setText("0.00");
                            textView2.setText("0.00");
                            p(finalGiftAmount);
                        } else {
                            BigDecimal bigDecimalMin = bigDecimal2.multiply(bigDecimalI3).min(this.d0.l);
                            TaxConfig taxConfig = this.U;
                            BigDecimal tax = taxConfig.getTax(bigDecimalMin, bigDecimal2);
                            BigDecimal netWin = taxConfig.getNetWin(bigDecimalMin, bigDecimal2);
                            Locale locale = Locale.US;
                            textView.setText(bjb0.L(netWin, locale));
                            boolean zHasRate = taxConfig.hasRate();
                            TextView textView3 = this.N;
                            if (zHasRate) {
                                textView3.setVisibility(0);
                                textView2.setVisibility(0);
                                textView2.setText(sn5.c(this, R.string.page_transaction__neg_amount, bjb0.L(tax, locale)));
                            } else {
                                textView3.setVisibility(8);
                                textView2.setVisibility(8);
                            }
                            p(finalGiftAmount);
                        }
                    }
                }
            } else {
                textView.setText("0.00");
                textView2.setText("0.00");
                p(finalGiftAmount);
            }
            j7g j7gVar = new j7g("");
            int color = getContext().getColor(R.color.text_type1_primary);
            int color2 = getContext().getColor(R.color.brand_secondary);
            int size = this.m0.p1().getValue().size();
            TextView textView4 = this.R;
            View view = this.Q;
            if (size <= 0 || !this.m0.a0()) {
                view.setVisibility(8);
            } else {
                j7gVar.e(color, sn5.b(getContext(), R.string.component_coupon__use_gifts_with_num, String.valueOf(size)));
                view.setVisibility(0);
                textView4.setText(j7gVar);
            }
            m780 m780VarT0 = this.m0.t0(SimulateBetConsts.BetslipType.SINGLE);
            o4p o4pVar2 = this.d0.A().c;
            if (m780VarT0 != null && o4pVar2 != null) {
                String string = o4pVar2.j.toString();
                int kind = m780VarT0.b.getKind();
                String str2 = m780VarT0.a;
                String strB = m780VarT0.b();
                if (!TextUtils.isEmpty(string) && Double.parseDouble(str2) > Double.parseDouble(string)) {
                    str2 = string;
                }
                String strA = pvf.a(getContext(), kind);
                String strA2 = this.i0.B() + " -" + String.format(Locale.US, "%,.2f", Double.valueOf(Double.parseDouble(str2)));
                if (!TextUtils.isEmpty(strA)) {
                    strA2 = oxc.a(strA, ", ", strA2);
                }
                j7gVar.clear();
                j7gVar.e(color2, strA2);
                textView4.setText(j7gVar);
                if (kind != 2 || TextUtils.isEmpty(string) || TextUtils.isEmpty(strB) || Double.parseDouble(string) >= Double.parseDouble(strB)) {
                    return;
                }
            }
            if (size > 0) {
                String strB2 = sn5.b(getContext(), R.string.component_coupon__use_gifts_with_num, String.valueOf(size));
                j7gVar.clear();
                j7gVar.e(color, strB2);
                textView4.setText(j7gVar);
                g8i0.b(view, true);
            } else {
                view.setVisibility(8);
            }
            this.m0.E(SimulateBetConsts.BetslipType.SINGLE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w8i0 w8i0VarB = tl5.b(this);
        if (w8i0VarB != null) {
            v8i0 viewModelStore = w8i0VarB.getViewModelStore();
            boolean z = w8i0VarB instanceof iel;
            r8i0.c defaultViewModelProviderFactory = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : fjd.a;
            cyb defaultViewModelCreationExtras = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
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
            mdo mdoVar = (mdo) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            this.V = mdoVar;
            String strC = this.d0.c();
            mdoVar.f.y0(strC, false);
            mdoVar.e.a(o8i0.d(mdoVar), strC);
            ibs ibsVarB = ll5.b(this);
            if (ibsVarB != null) {
                this.V.y.f(ibsVarB, new lfy() { // from class: gjo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        hqc hqcVar = (hqc) obj;
                        int i = InstantWinQuickBetView.s0;
                        final InstantWinQuickBetView instantWinQuickBetView = this.a;
                        if (instantWinQuickBetView.f()) {
                            return;
                        }
                        if (hqcVar instanceof nqc) {
                            instantWinQuickBetView.h((xho) ((nqc) hqcVar).a);
                            instantWinQuickBetView.e0.g();
                            return;
                        }
                        if (hqcVar instanceof kqc) {
                            String str = ((kqc) hqcVar).d;
                            instantWinQuickBetView.P.removeCallbacks(instantWinQuickBetView.r0);
                            instantWinQuickBetView.n(false);
                            try {
                                ErrorBody errorBody = (ErrorBody) instantWinQuickBetView.l0.fromJson(str, ErrorBody.class);
                                int errorCode = errorBody.getErrorCode();
                                if (errorCode == 19000) {
                                    sqo.p(instantWinQuickBetView.O.get(), new DialogInterface.OnClickListener() { // from class: jjo
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            int i3 = InstantWinQuickBetView.s0;
                                            instantWinQuickBetView.g();
                                        }
                                    });
                                } else if (errorCode == 19106) {
                                    sqo.q(instantWinQuickBetView.O.get(), new DialogInterface.OnClickListener() { // from class: kjo
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            int i3 = InstantWinQuickBetView.s0;
                                            instantWinQuickBetView.g();
                                        }
                                    });
                                } else if (errorCode == 19110) {
                                    e eVar = instantWinQuickBetView.O.get();
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: mjo
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            int i3 = InstantWinQuickBetView.s0;
                                            instantWinQuickBetView.g();
                                        }
                                    };
                                    BigDecimal bigDecimal = sqo.a;
                                    sqo.k(eVar, "", sn5.b(eVar, R.string.component_betslip__order_pocket_frozen_message, new Object[0]), onClickListener);
                                } else if (errorCode == 19400) {
                                    uxb uxbVarA = yxb.a(errorCode, instantWinQuickBetView.d0.c(), errorBody.getCauseMessage());
                                    if (uxbVarA instanceof uxb.d) {
                                        uxb.d dVar = (uxb.d) uxbVarA;
                                        sqo.k(instantWinQuickBetView.O.get(), dVar.b, dVar.c, new DialogInterface.OnClickListener() { // from class: njo
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                                int i3 = InstantWinQuickBetView.s0;
                                                instantWinQuickBetView.m0.H0();
                                            }
                                        });
                                    } else {
                                        instantWinQuickBetView.l();
                                    }
                                } else if (errorCode == 19101) {
                                    e eVar2 = instantWinQuickBetView.O.get();
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ijo
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            int i3 = InstantWinQuickBetView.s0;
                                            InstantWinQuickBetView instantWinQuickBetView2 = instantWinQuickBetView;
                                            if (instantWinQuickBetView2.O.get() != null) {
                                                instantWinQuickBetView2.O.get().finish();
                                            }
                                        }
                                    };
                                    BigDecimal bigDecimal2 = sqo.a;
                                    try {
                                        gd8.j0(new uqo(onClickListener2)).showNow(eVar2.getSupportFragmentManager(), "dialog");
                                    } catch (Exception unused) {
                                    }
                                } else if (errorCode == 19102) {
                                    instantWinQuickBetView.h0.d(instantWinQuickBetView.O.get());
                                } else if (errorCode == 19201) {
                                    sqo.k(instantWinQuickBetView.O.get(), sn5.b(instantWinQuickBetView.getContext(), R.string.page_instant_virtual__game_unavailable, new Object[0]), sn5.b(instantWinQuickBetView.getContext(), instantWinQuickBetView.V.v, new Object[0]), new DialogInterface.OnClickListener() { // from class: ljo
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            int i3 = InstantWinQuickBetView.s0;
                                            dialogInterface.dismiss();
                                            InstantWinQuickBetView instantWinQuickBetView2 = instantWinQuickBetView;
                                            instantWinQuickBetView2.W.d(wae.VIRTUALS_LOBBY);
                                            instantWinQuickBetView2.O.get().finish();
                                        }
                                    });
                                } else if (errorCode != 19202) {
                                    instantWinQuickBetView.l();
                                } else {
                                    uxb uxbVarA2 = yxb.a(errorCode, instantWinQuickBetView.d0.c(), errorBody.getCauseMessage());
                                    if (uxbVarA2 instanceof uxb.b) {
                                        uxb.b bVar = (uxb.b) uxbVarA2;
                                        sqo.k(instantWinQuickBetView.O.get(), bVar.b, bVar.c, new ojo());
                                    } else {
                                        instantWinQuickBetView.l();
                                    }
                                }
                            } catch (Exception unused2) {
                                instantWinQuickBetView.l();
                            }
                            instantWinQuickBetView.q0 = false;
                            instantWinQuickBetView.e0.g();
                        }
                    }
                });
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eeo eeoVar;
        int id = view.getId();
        if (id == R.id.gifts_touch_area) {
            b bVar = this.d;
            if (bVar != null) {
                bVar.a(getInputData());
                return;
            }
            return;
        }
        if (id == R.id.delete) {
            b bVar2 = this.d;
            if (bVar2 != null) {
                bVar2.d(this.C);
                return;
            }
            return;
        }
        if (id == R.id.close_quick_bet) {
            b bVar3 = this.d;
            if (bVar3 == null || this.C == null) {
                return;
            }
            bVar3.e();
            return;
        }
        if (id == R.id.single_bet_container || id == R.id.cl_multiple_bet) {
            b bVar4 = this.d;
            if (bVar4 != null) {
                bVar4.c();
                return;
            }
            return;
        }
        if (id != R.id.place_bet_btn || f()) {
            return;
        }
        o4p o4pVar = this.d0.A().c;
        this.f0.a(new a5o.f0(this.d0.c()), k00.d);
        try {
            if (!this.c0.isLogin()) {
                i5s i5sVar = this.h0;
                uqm uqmVar = this.c0;
                e eVar = this.O.get();
                qjo qjoVar = new qjo(this);
                i5sVar.getClass();
                i5s.b(uqmVar, eVar, qjoVar);
                return;
            }
            AssetsInfo assetsInfoC = this.e0.c();
            if (assetsInfoC != null) {
                BigDecimal bigDecimal = new BigDecimal(assetsInfoC.balance);
                String usableGiftAmountString = getUsableGiftAmountString();
                if (usableGiftAmountString != null) {
                    bigDecimal = bigDecimal.add(BigDecimal.valueOf(Double.parseDouble(usableGiftAmountString)));
                }
                if (bigDecimal.compareTo(o4pVar.j) < 0) {
                    this.h0.d(this.O.get());
                    return;
                }
            }
            if (o4pVar == null || this.q0) {
                return;
            }
            if (!f() && (eeoVar = (eeo) this.O.get().getSupportFragmentManager().H("tag_confirm_dialog")) != null && eeoVar.isVisible()) {
                return;
            }
            this.d0.f = o4pVar;
            m(true);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INSTANT_WIN);
            aVar.g("e =" + e.getMessage(), new Object[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.P.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    public final void p(String str) {
        BigDecimal bigDecimalI = i(str);
        Locale locale = Locale.US;
        String strL = bjb0.L(bigDecimalI, locale);
        TaxConfig taxConfig = this.U;
        boolean zHasExciseTaxRate = taxConfig.hasExciseTaxRate();
        TextView textView = this.M;
        TextView textView2 = this.K;
        if (!zHasExciseTaxRate) {
            textView2.setText(sn5.c(this, R.string.component_betslip__place_bet, new Object[0]));
            textView.setText(sn5.c(this, R.string.component_betslip__about_to_pay_vamount_lineup, strL));
        } else {
            BigDecimal exciseTax = taxConfig.getExciseTax(i(str));
            textView2.setText(sn5.c(this, R.string.component_betslip__place_bet_with_excise_tax, strL));
            textView.setText(sn5.c(this, R.string.component_betslip__excise_tax_stake, bjb0.L(exciseTax, locale)));
        }
    }

    public final void q(if30 if30Var, int i) {
        String strB;
        ArrayList arrayList;
        int i2 = 0;
        TextView textView = this.z;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (if30Var == null) {
            setVisibility(8);
            return;
        }
        int i3 = if30Var.b;
        this.C = if30Var.a;
        if (i3 == 0) {
            setVisibility(8);
            return;
        }
        if (i == 1) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ConstraintLayout constraintLayout = this.D;
        RelativeLayout relativeLayout = this.c;
        bigDecimal = null;
        BigDecimal bigDecimal = null;
        String strA = "0";
        if (i3 == 1) {
            Map.Entry<String, BetSlipData> entry = this.C;
            Pair<String, String> pair = if30Var.d;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            BigDecimal bigDecimal2 = new BigDecimal(this.j0.j());
            if (this.d0.F()) {
                bigDecimal2 = this.p0.a();
            }
            if (entry == null) {
                setVisibility(8);
                return;
            }
            BetSlipData value = entry.getValue();
            String plainString = bigDecimal2.toPlainString();
            if (pair != null && !TextUtils.isEmpty((CharSequence) pair.first) && !TextUtils.isEmpty((CharSequence) pair.second) && TextUtils.equals(entry.getKey(), (CharSequence) pair.first)) {
                plainString = (String) pair.second;
            }
            EditText editText = this.A;
            if (editText != null) {
                editText.setFilters(new InputFilter[]{new m4d(String.valueOf(this.d0.k).length())});
                editText.setHint(sn5.c(this, R.string.component_betslip__min_vstake, bjb0.Z(this.d0.j, RoundingMode.CEILING)));
                editText.setCursorVisible(false);
                editText.setLongClickable(false);
                editText.setTextIsSelectable(false);
                editText.setImeOptions(268435456);
                if (TextUtils.equals(plainString, "0")) {
                    plainString = "";
                }
                editText.setText(plainString);
                editText.setInputType(0);
                if (editText.getVisibility() == 0) {
                    c();
                }
                c();
                editText.setOnTouchListener(new View.OnTouchListener() { // from class: ejo
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i4 = InstantWinQuickBetView.s0;
                        final InstantWinQuickBetView instantWinQuickBetView = this.a;
                        instantWinQuickBetView.G.setVisibility(0);
                        instantWinQuickBetView.B.N(instantWinQuickBetView.d0);
                        instantWinQuickBetView.B.L(instantWinQuickBetView.A, 3);
                        instantWinQuickBetView.A.requestFocus();
                        instantWinQuickBetView.A.setCursorVisible(true);
                        if (motionEvent.getActionMasked() != 1) {
                            return false;
                        }
                        instantWinQuickBetView.A.post(new Runnable() { // from class: fjo
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = InstantWinQuickBetView.s0;
                                EditText editText2 = instantWinQuickBetView.A;
                                editText2.setSelection(editText2.getText().length());
                            }
                        });
                        return false;
                    }
                });
                o();
            }
            String strP = bjb0.P(value.odds, Locale.US);
            TextView textView2 = this.y;
            if (textView2 != null) {
                textView2.setText(gky.a.a(strP, false));
            }
            TextView textView3 = this.e;
            if (textView3 != null) {
                textView3.setText(value.outComeDesc);
                Integer numA = this.o0.a(this.d0.c());
                this.S.setImageDrawable(numA != null ? s0b.a(getContext(), numA.intValue(), new a78.c(R.color.text_type1_primary)) : null);
            }
            boolean zB = this.b0.b(value.marketId);
            TextView textView4 = this.f;
            TextView textView5 = this.i;
            if (zB) {
                if (textView5 != null) {
                    n4p n4pVar = this.d0;
                    String str = value.outcomeId;
                    LinkedHashMap linkedHashMap = n4pVar.e;
                    textView5.setText(String.valueOf(linkedHashMap.get(str) != null ? ((Integer) linkedHashMap.get(str)).intValue() : 0));
                    textView5.setVisibility(0);
                }
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            } else {
                if (textView4 != null) {
                    textView4.setText(value.marketTitle);
                    textView4.setVisibility(0);
                }
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
            }
            TextView textView6 = this.v;
            if (textView6 != null) {
                textView6.setText(value.homeTeamName);
            }
            TextView textView7 = this.w;
            if (textView7 != null) {
                textView7.setText(value.awayTeamName);
            }
            KeyboardView keyboardView = this.B;
            if (keyboardView != null) {
                keyboardView.setOnValueChangeListener(new pjo(this));
                keyboardView.setOnDoneButtonClickListener(new View.OnClickListener() { // from class: djo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = InstantWinQuickBetView.s0;
                        InstantWinQuickBetView instantWinQuickBetView = this.a;
                        instantWinQuickBetView.o();
                        instantWinQuickBetView.e();
                        izw.a.a().d(true);
                    }
                });
            }
            e();
            return;
        }
        o4p o4pVar = if30Var.c;
        if (textView != null) {
            textView.setVisibility(8);
        }
        e();
        j7g j7gVar = new j7g();
        if (o4pVar == null) {
            setVisibility(8);
            return;
        }
        ArrayList arrayList2 = o4pVar.d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint = this.H;
        if (instantWinMultipleBetBonusHint != null) {
            o4p.d dVar = o4pVar.i.get(o4pVar.f);
            if (((o4p.a) arrayList2.get(0)).b.size() <= 2 || (dVar != null && !dVar.j)) {
                tlo tloVar = o4pVar.b;
                if (tloVar != null) {
                    tloVar.p(false);
                }
                tlo tloVar2 = o4pVar.b;
                if (tloVar2 != null) {
                    tloVar2.e(false);
                }
            }
            o4pVar.e();
            n4p n4pVar2 = this.d0;
            instantWinMultipleBetBonusHint.E(o4pVar, n4pVar2.q, n4pVar2.C || n4pVar2.B, true);
        }
        TextView textView8 = this.E;
        if (textView8 != null) {
            textView8.setText(String.valueOf(i3));
        }
        int i4 = o4pVar.g;
        Context context = getContext();
        BigDecimal bigDecimal3 = sqo.a;
        if (i4 == 1) {
            strB = sn5.b(context, R.string.component_betslip__singles, new Object[0]);
        } else if (i4 != 2) {
            strB = i4 != 3 ? sn5.b(context, R.string.component_betslip__veventsize_folds, String.valueOf(i4)) : sn5.b(context, R.string.component_betslip__trebles, new Object[0]);
        } else {
            strB = sn5.b(context, R.string.component_betslip__doubles, new Object[0]);
        }
        j7gVar.e(c8i0.c(R.color.text_type1_secondary, this), strB);
        j7gVar.a("  ");
        TextView textView9 = this.F;
        if (textView9 != null) {
            boolean zEquals = TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE);
            String str2 = o4pVar.a;
            if (!zEquals) {
                if (!TextUtils.equals(str2, SimulateBetConsts.BetslipType.MULTIPLE)) {
                    setVisibility(8);
                    return;
                }
                o4p.d dVar2 = o4pVar.i.get(o4pVar.f);
                j7gVar.g(sqo.g(dVar2.d, dVar2.e), c8i0.c(R.color.absolute_type2, this), true);
                textView9.setText(j7gVar);
                if (i3 < 3) {
                    tlo tloVar3 = o4pVar.b;
                    if (tloVar3 != null) {
                        tloVar3.e(false);
                    }
                    tlo tloVar4 = o4pVar.b;
                    if (tloVar4 != null) {
                        tloVar4.p(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (TextUtils.equals(str2, SimulateBetConsts.BetslipType.SINGLE)) {
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        o4p.a aVar = (o4p.a) obj;
                        if (aVar == null || (arrayList = aVar.b) == null || arrayList.isEmpty()) {
                            i2 = 0;
                        } else {
                            int size2 = arrayList.size();
                            int i6 = i2;
                            bigDecimalAdd = bigDecimalAdd;
                            bigDecimal = bigDecimal;
                            while (i6 < size2) {
                                Object obj2 = arrayList.get(i6);
                                i6++;
                                String str3 = ((o4p.b) obj2).a.odds;
                                if (!TextUtils.isEmpty(str3)) {
                                    BigDecimal bigDecimal4 = new BigDecimal(str3);
                                    if (bigDecimal == null || bigDecimal4.compareTo(bigDecimal) < 0) {
                                        bigDecimal = bigDecimal;
                                        bigDecimal = bigDecimal4;
                                    }
                                    bigDecimal = bigDecimal;
                                    bigDecimalAdd = bigDecimalAdd.add(bigDecimal4);
                                }
                                i2 = 0;
                                bigDecimalAdd = bigDecimalAdd;
                                bigDecimal = bigDecimal;
                            }
                        }
                    }
                }
                if (bigDecimal != null) {
                    if (bigDecimal.equals(bigDecimalAdd)) {
                        strA = gky.a(bigDecimal.toPlainString());
                    } else {
                        strA = gky.a(bigDecimal.toPlainString()) + " ~ " + gky.a(bigDecimalAdd.toPlainString());
                    }
                }
            }
            j7gVar.g(strA, c8i0.c(R.color.absolute_type2, this), true);
            textView9.setText(j7gVar);
        }
    }

    public void setQuickBetListener(e eVar, b bVar) {
        this.O = new WeakReference<>(eVar);
        this.d = bVar;
    }

    public final void j(String str) {
        rdd0 rdd0Var = this.f0;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(LhMGMAwwhzjwfz.NEsutdJSTTgO, str)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) == null) {
            rdd0Var.a(new a5o.g0(Collections.unmodifiableMap(map)), k00.b, k00.a, k00.c);
        } else {
            hb5.a(wga.a(key, "duplicate key: "));
        }
    }

    public InstantWinQuickBetView(Context context) {
        this(context, null);
    }

    public InstantWinQuickBetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
