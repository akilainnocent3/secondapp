package com.sportybet.plugin.realsports.betslip.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.UserAddress;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.d;
import com.sportybet.plugin.realsports.betslip.widget.d.a;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.a78;
import defpackage.a8b;
import defpackage.aj90;
import defpackage.ajk;
import defpackage.bjb0;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.e9h;
import defpackage.ex4;
import defpackage.f00;
import defpackage.fdt;
import defpackage.fta;
import defpackage.gky;
import defpackage.gta;
import defpackage.hb5;
import defpackage.i2i;
import defpackage.ime;
import defpackage.ipl;
import defpackage.ita;
import defpackage.itf0;
import defpackage.iw2;
import defpackage.iym;
import defpackage.j7g;
import defpackage.j9j;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.kvo;
import defpackage.lfy;
import defpackage.lq1;
import defpackage.lrm;
import defpackage.lta;
import defpackage.muo;
import defpackage.nta;
import defpackage.ota;
import defpackage.pta;
import defpackage.py1;
import defpackage.qoy;
import defpackage.qq1;
import defpackage.r8i0;
import defpackage.rvi;
import defpackage.s0b;
import defpackage.s890;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sd7;
import defpackage.sn5;
import defpackage.t340;
import defpackage.up3;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vgb0;
import defpackage.vjk;
import defpackage.vox;
import defpackage.w1k;
import defpackage.wga;
import defpackage.y8j;
import defpackage.y8k;
import defpackage.ymy;
import defpackage.yyh;
import defpackage.yyk;
import defpackage.zik;
import defpackage.zkh;
import defpackage.zsb;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class d extends ipl implements k9j, j9j {
    public static final zsb v0 = new zsb();
    public static int w0;
    public up3 A;
    public up3 B;
    public iym C;
    public y8k D;
    public String G;
    public int I;
    public int J;
    public String L;
    public int M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TextView V;
    public Button W;
    public Button X;
    public TextView Y;
    public TextView Z;
    public TextView a0;
    public View b0;
    public TextView c0;
    public CheckBox d0;
    public TextView e0;
    public y8j f;
    public TextView f0;
    public TextView g0;
    public View h0;
    public ex4 i;
    public c j0;
    public boolean l0;
    public int m0;
    public int n0;
    public boolean o0;
    public kvo p0;
    public yyk q0;
    public aj90 r0;
    public s890 v;
    public lq1 w;
    public lrm y;
    public up3 z;
    public final String E = a8b.d().trim();
    public BigDecimal F = BigDecimal.ZERO;
    public BigDecimal H = new BigDecimal("0.0");
    public BigDecimal K = new BigDecimal("0.0");
    public TaxConfigs i0 = TaxConfigs.getDefault();
    public boolean k0 = true;
    public boolean s0 = false;
    public boolean t0 = false;
    public final b u0 = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            aj90 aj90Var;
            d dVar = d.this;
            if (!dVar.l0 || (aj90Var = dVar.r0) == null) {
                SelectedGiftData selectedGiftData = dVar.o0().C;
                if (selectedGiftData != null) {
                    dVar.q0.K1(new vjk.b(selectedGiftData.getRawGift(), selectedGiftData, d.w0));
                }
            } else {
                SelectedGiftData selectedGiftData2 = dVar.o0().C;
                String str = dVar.O;
                if (str == null) {
                    str = "0";
                }
                String str2 = dVar.P;
                aj90Var.x1(selectedGiftData2, str, str2 != null ? str2 : "0");
            }
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("source", lTGEJfVytU.lstXHI)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
            Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
            f00 f00Var = vgb0.a;
            mapUnmodifiableMap.getClass();
            vgb0.c(AnalyticsEvent.BETSLIP_GIFT_ENTRANCE_CLICK, mapUnmodifiableMap, false);
            dVar.C.c(AnalyticsEvent.BETSLIP_GIFT_ENTRANCE_CLICK, mapUnmodifiableMap, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.fragment.app.e activity;
            int id = view.getId();
            d dVar = d.this;
            if (id == R.id.cancel) {
                if (dVar.getDialog() != null) {
                    dVar.getDialog().dismiss();
                    c cVar = dVar.j0;
                    if (cVar != null) {
                        cVar.onCancel();
                        return;
                    }
                    return;
                }
                return;
            }
            if (id != R.id.confirm || (activity = dVar.getActivity()) == null) {
                return;
            }
            final py1 py1Var = (py1) activity;
            if (!py1Var.countryManager.W()) {
                dVar.n0(null);
                return;
            }
            dVar.X.setText(R.string.component_betslip__wait);
            dVar.X.setEnabled(false);
            py1Var.getLocationPermissionHelper().e = new qoy() { // from class: mta
                @Override // defpackage.qoy
                public final void a() {
                    py1Var.requestTheUserLocation(true);
                }
            };
            py1Var.getLocationPermissionHelper().i = new nta(py1Var);
            py1Var.getLocationPermissionHelper().f = new ota(this, py1Var);
            py1Var.getLocationPermissionHelper().g = new pta(py1Var);
            py1Var.getLocationPermissionHelper().h = new ymy() { // from class: qta
                @Override // defpackage.ymy
                public final void a(UserAddress userAddress) {
                    d dVar2 = d.this;
                    zsb zsbVar = d.v0;
                    dVar2.X.setText(R.string.common_functions__confirm);
                    dVar2.X.setEnabled(true);
                    dVar2.n0(userAddress);
                }
            };
            py1Var.checkAndRequestPermissions(true);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public interface c {
        void a();

        void b();

        void onCancel();
    }

    public static d q0(Bundle bundle) {
        if (TextUtils.isEmpty(bundle.getString("realPay"))) {
            v0.c().g("no stake in Confirm page", bundle.toString(), new IllegalArgumentException(), null);
        }
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return "ConfirmFragment";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    public final void m0(boolean z, SelectedGiftData selectedGiftData) {
        String strD;
        UiText resourceUiText;
        String giftValue;
        View view = this.b0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        if (!this.l0) {
            w0(sn5.d(this, R.string.gift__l_gift, new Object[0]));
            return;
        }
        aj90 aj90Var = this.r0;
        if (aj90Var != null) {
            if (selectedGiftData == null || !selectedGiftData.getChecked() || (giftValue = selectedGiftData.getGiftValue()) == null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.gift__l_gift);
            } else {
                StringUiText stringUiText2 = vch0.a;
                Iterator it = kotlin.collections.b.k(new ResourceUiText(R.string.gift__l_gift), new StringUiText(" "), vch0.d(aj90Var.e.B()), new StringUiText(" -"), new StringUiText(giftValue)).iterator();
                if (!it.hasNext()) {
                    zkh.a("Empty collection can't be reduced.");
                    return;
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((UiText) next).h((UiText) it.next());
                }
                resourceUiText = (UiText) next;
                if (resourceUiText == null) {
                    StringUiText stringUiText3 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.gift__l_gift);
                }
            }
            strD = resourceUiText.g(requireContext());
        } else {
            strD = sn5.d(this, R.string.gift__l_gift, new Object[0]);
        }
        w0(strD);
    }

    public final void n0(UserAddress userAddress) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        this.v.getClass();
        if (!vox.d(activity) || activity.isFinishing()) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null && ((e9h) activity2.getSupportFragmentManager().H("FailedFragment")) == null) {
                e9h.j0(-1000, null).show(activity2.getSupportFragmentManager(), "FailedFragment");
            }
        } else {
            c cVar = this.j0;
            if (cVar != null) {
                cVar.a();
            }
            if (activity instanceof BetslipActivity) {
                BetslipActivity betslipActivity = (BetslipActivity) activity;
                betslipActivity.U1 = true;
                betslipActivity.e2 = userAddress;
                betslipActivity.S1 = System.currentTimeMillis();
                betslipActivity.T1 = false;
                betslipActivity.getAccountHelper().demandAccount(betslipActivity, betslipActivity);
            } else {
                Intent intent = new Intent();
                intent.setAction("quick_bet_confirm");
                intent.putExtra("quick_bet_ready", true);
                if (userAddress != null) {
                    intent.putExtra("user_address", userAddress);
                }
                fdt.a(getActivity()).c(intent);
            }
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.BET_CONFIRM);
            kvo kvoVar = this.p0;
            int i = this.n0;
            muo muoVar = kvoVar.d;
            if (kvoVar.e && i == 4) {
                muoVar.a(AnalyticsEvent.BETSLIP_CONFIRM_WITH_INSURE, jpu.b(new Pair("type", "flexibet")));
            }
            if (kvoVar.f && i == 5) {
                muoVar.a(AnalyticsEvent.BETSLIP_CONFIRM_WITH_INSURE, jpu.b(new Pair("type", "onecut")));
            }
            if (kvoVar.i && i == 6) {
                muoVar.a(AnalyticsEvent.BETSLIP_CONFIRM_WITH_INSURE, jpu.b(new Pair("type", "anywin")));
            }
            if (kvoVar.v) {
                muoVar.a(AnalyticsEvent.BETSLIP_CONFIRM_WITH_INSURE, jpu.b(new Pair("type", "two_up")));
            }
        }
        if (getDialog() != null) {
            getDialog().dismiss();
        }
    }

    public final up3 o0() {
        int i = this.n0;
        if (i == 1) {
            return this.z;
        }
        if (i == 2) {
            return this.A;
        }
        if (i == 3) {
            return this.B;
        }
        if (i != 4) {
            return i != 6 ? this.B : this.A;
        }
        return this.A;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        c cVar = this.j0;
        if (cVar != null) {
            cVar.onCancel();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        if (getArguments() != null) {
            try {
                BigDecimal bigDecimal = new BigDecimal(getArguments().getString("realPay"));
                this.F = bigDecimal;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimal2.compareTo(bigDecimal) > 0) {
                    this.F = bigDecimal2;
                }
            } catch (Exception unused) {
                this.F = BigDecimal.ZERO;
            }
            if (getArguments().getString("flexiodds") != null) {
                this.H = new BigDecimal(getArguments().getString("flexiodds"));
            }
            this.I = getArguments().getInt("flexicount");
            this.J = getArguments().getInt("totalcount");
            if (getArguments().getString("potentialwin") != null) {
                this.K = new BigDecimal(getArguments().getString("potentialwin"));
            }
            this.L = getArguments().getString("key_gift_id");
            this.M = getArguments().getInt("key_gift_kind");
            w0 = getArguments().getInt("gift_count", 0);
            this.O = getArguments().getString("key_total_odds_for_gift");
            this.P = getArguments().getString("key_bonus_rate_for_gift");
            this.Q = getArguments().getString("key_max_win_for_gift");
            this.R = getArguments().getString("key_max_bonus_for_gift");
            this.S = getArguments().getBoolean("key_is_show_WHTax", false);
            String string = getArguments().getString("gift_value");
            if (!TextUtils.isEmpty(string)) {
                this.N = string.replaceAll(",", "");
            }
            String string2 = getArguments().getString("totalstake");
            if (!TextUtils.isEmpty(string2)) {
                this.G = string2.replaceAll(",", "");
            }
            this.U = getArguments().getBoolean("gift_quick_bet", false);
            this.T = getArguments().getBoolean("useBalance", true);
            this.k0 = getArguments().getBoolean("is_support_free_bet", true);
            this.l0 = getArguments().getBoolean("key_is_sim_bet", false);
            this.m0 = getArguments().getInt("key_simulated_auto_bet_times", 1);
            this.n0 = getArguments().getInt("orderType");
            this.o0 = getArguments().getBoolean("has_bet_builder_selections", false);
        }
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(kvo.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        kvo kvoVar = (kvo) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.p0 = kvoVar;
        int i2 = this.n0;
        muo muoVar = kvoVar.d;
        if (kvoVar.e && i2 == 4) {
            muoVar.a(AnalyticsEvent.BETSLIP_PLACE_BET_WITH_INSURE, jpu.b(new Pair("type", "flexibet")));
        }
        if (kvoVar.f && i2 == 5) {
            muoVar.a(AnalyticsEvent.BETSLIP_PLACE_BET_WITH_INSURE, jpu.b(new Pair("type", "onecut")));
        }
        if (kvoVar.i && i2 == 6) {
            muoVar.a(AnalyticsEvent.BETSLIP_PLACE_BET_WITH_INSURE, jpu.b(new Pair("type", "anywin")));
        }
        if (kvoVar.v) {
            muoVar.a(AnalyticsEvent.BETSLIP_PLACE_BET_WITH_INSURE, jpu.b(new Pair("type", "two_up")));
        }
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras);
        dq7 dq7VarA2 = jq40.a(yyk.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        yyk yykVar = (yyk) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.q0 = yykVar;
        yykVar.y1(0, this.U);
        this.q0.I.f(this, new lfy() { // from class: dta
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                vjk vjkVar = (vjk) obj;
                zsb zsbVar = d.v0;
                boolean z = vjkVar instanceof vjk.a;
                final d dVar = this.a;
                if (!z) {
                    if (vjkVar instanceof vjk.b) {
                        vjk.b bVar = (vjk.b) vjkVar;
                        GiftDetails giftDetails = bVar.a;
                        final SelectedGiftData selectedGiftData = bVar.b;
                        if (giftDetails == null || dVar.getActivity() == null) {
                            return;
                        }
                        jwk.a.a(dVar.E, dVar.O, dVar.P, dVar.Q, dVar.R, dVar.S, d.w0, dVar.q0.C1(), giftDetails, selectedGiftData, new Function1() { // from class: ata
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                zsb zsbVar2 = d.v0;
                                dVar.p0((SelectedGiftData) obj2, selectedGiftData);
                                return null;
                            }
                        }, new Function0() { // from class: bta
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                zsb zsbVar2 = d.v0;
                                dVar.q0.K1(vjk.a.a);
                                return null;
                            }
                        }).show(dVar.getActivity().getSupportFragmentManager(), "gift_value_edit_dialog");
                        return;
                    }
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("key_gift_id", dVar.L);
                bundle2.putInt("key_gift_kind", dVar.M);
                bundle2.putString("key_gift_value", dVar.N);
                bundle2.putBoolean("is_support_free_bet", dVar.k0);
                bundle2.putBoolean("gift_quick_bet", dVar.U);
                bundle2.putString("quick_stake", dVar.G);
                final SelectedGiftData selectedGiftData2 = dVar.o0().C;
                Function1<? super GiftDetails, Unit> function1 = new Function1() { // from class: kta
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        dVar.q0.K1(new vjk.b((GiftDetails) obj2, selectedGiftData2, d.w0));
                        return null;
                    }
                };
                rok rokVar = new rok();
                rokVar.setArguments(bundle2);
                rokVar.f = function1;
                rokVar.show(dVar.getActivity().getSupportFragmentManager(), "gifts_dialog");
            }
        });
        this.q0.K.f(this, new lfy() { // from class: eta
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean zD1;
                n780 n780Var = (n780) obj;
                zsb zsbVar = d.v0;
                if (iu2.p() || iu2.k()) {
                    return;
                }
                d dVar = this.a;
                if (dVar.n0 != 5 && (n780Var instanceof n780.b)) {
                    n780.b bVar = (n780.b) n780Var;
                    SelectedGiftData selectedGiftData = dVar.o0().C;
                    if (d.w0 == 0) {
                        d.w0 = bVar.b;
                    }
                    if (selectedGiftData == null || selectedGiftData.getRawGift() == null) {
                        zD1 = false;
                    } else {
                        yyk yykVar2 = dVar.q0;
                        GiftDetails rawGift = selectedGiftData.getRawGift();
                        List<GiftDetails> list = bVar.c;
                        yykVar2.getClass();
                        zD1 = yyk.D1(rawGift, list);
                    }
                    if (zD1) {
                        return;
                    }
                    GiftDetails giftDetails = bVar.a;
                    boolean zC1 = dVar.q0.C1();
                    if (selectedGiftData != null && zC1) {
                        zC1 = selectedGiftData.getAddToStake();
                    }
                    SelectedGiftData selectedGiftData2 = new SelectedGiftData(bjb0.W(giftDetails.getCurrentBalance()), giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), bVar.b, giftDetails, zC1, true, false, dVar.G);
                    if (!iu2.p()) {
                        Snackbar.h(dVar.h0, sn5.d(dVar, R.string.component_coupon__gift_updated_to_better_match_your_current_selection, new Object[0]), 0).j();
                    }
                    dVar.o0().D = selectedGiftData;
                    dVar.o0().b(selectedGiftData2);
                    dVar.t0 = true;
                    dVar.r0();
                }
            }
        });
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        v8i0 viewModelStore3 = eVarRequireActivity2.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = eVarRequireActivity2.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, sd7.a(eVarRequireActivity2, viewModelStore3, defaultViewModelProviderFactory3));
        dq7 dq7VarA3 = jq40.a(aj90.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        aj90 aj90Var = (aj90) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.r0 = aj90Var;
        t340 t340Var = aj90Var.c.x;
        s9s.b bVar = s9s.b.d;
        yyh.a(t340Var, this, bVar, new fta(this, i), new gta());
        yyh.a(this.r0.c.A, this, bVar, new Function1() { // from class: hta
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                xi90 xi90Var = (xi90) obj;
                zsb zsbVar = d.v0;
                d dVar = this.a;
                if (!dVar.l0) {
                    return Unit.a;
                }
                if (xi90Var != xi90.a.a) {
                    return Unit.a;
                }
                dVar.s0(false);
                return Unit.a;
            }
        }, new ita(0));
        this.r0.v.f(this, new lfy() { // from class: jta
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                n780 aVar;
                ej90 ej90Var = (ej90) obj;
                zsb zsbVar = d.v0;
                d dVar = this.a;
                if (dVar.l0 && ej90Var != null) {
                    List<GiftDetails> list = ej90Var.c;
                    boolean zD1 = false;
                    if (ej90Var.b == ipk.a) {
                        aVar = n780.f.a;
                    } else {
                        aVar = list.isEmpty() ? new n780.a(Integer.valueOf(dVar.n0)) : new n780.b(list.get(0), list.size(), list);
                    }
                    if (iu2.k() || dVar.n0 == 5) {
                        return;
                    }
                    if (dVar.m0 > 1) {
                        dVar.m0(false, dVar.o0().C);
                        return;
                    }
                    if ((aVar instanceof n780.a) || (aVar instanceof n780.f)) {
                        dVar.m0(false, null);
                        return;
                    }
                    if (aVar instanceof n780.b) {
                        n780.b bVar2 = (n780.b) aVar;
                        SelectedGiftData selectedGiftData = dVar.o0().C;
                        if (selectedGiftData != null && selectedGiftData.getRawGift() != null) {
                            yyk yykVar2 = dVar.q0;
                            GiftDetails rawGift = selectedGiftData.getRawGift();
                            List<GiftDetails> list2 = bVar2.c;
                            yykVar2.getClass();
                            zD1 = yyk.D1(rawGift, list2);
                        }
                        if (zD1) {
                            return;
                        }
                        GiftDetails giftDetails = bVar2.a;
                        boolean zC1 = dVar.q0.C1();
                        if (selectedGiftData != null && zC1) {
                            zC1 = selectedGiftData.getAddToStake();
                        }
                        SelectedGiftData selectedGiftData2 = new SelectedGiftData(bjb0.W(giftDetails.getCurrentBalance()), giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), bVar2.b, giftDetails, zC1, true, false, dVar.G);
                        dVar.o0().D = selectedGiftData;
                        dVar.o0().b(selectedGiftData2);
                        dVar.m0(true, selectedGiftData2);
                        dVar.t0 = true;
                        dVar.r0();
                    }
                }
            }
        });
        aj90 aj90Var2 = this.r0;
        if (aj90Var2 != null) {
            aj90Var2.w = true;
        }
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        int i2;
        Drawable drawableB;
        Dialog dialog = new Dialog(getActivity(), R.style.BottomDialog);
        dialog.requestWindowFeature(1);
        int i3 = 0;
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setContentView(R.layout.spr_betslip_confirm_dialog);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        window.setWindowAnimations(R.style.AnimBottom);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.g0 = (TextView) dialog.findViewById(R.id.potential_win_label);
        if (this.I != this.J) {
            dialog.findViewById(R.id.win_item).setVisibility(0);
            dialog.findViewById(R.id.odds_item).setVisibility(0);
            dialog.findViewById(R.id.options_item).setVisibility(0);
            dialog.findViewById(R.id.confirm_note).setVisibility(0);
            this.Y = (TextView) dialog.findViewById(R.id.potential_win);
            this.Z = (TextView) dialog.findViewById(R.id.total_odds);
            this.a0 = (TextView) dialog.findViewById(R.id.flexibet_options);
            TextView textView = this.Y;
            BigDecimal bigDecimal = this.K;
            Locale locale = Locale.US;
            textView.setText(bjb0.L(bigDecimal, locale));
            this.Z.setText(gky.a.a(bjb0.L(this.H, locale), false));
            j7g j7gVar = new j7g("");
            j7gVar.a(Integer.valueOf(this.I).toString());
            j7gVar.a(" of ");
            j7gVar.a(Integer.valueOf(this.J).toString());
            this.a0.setText(j7gVar);
        }
        boolean zA = qq1.a(this.w, BOConfigParam.CashoutFlexibleBetAllow, true);
        boolean zA2 = qq1.a(this.w, BOConfigParam.CashoutAnyWinAllow, true);
        int i4 = this.n0;
        if (i4 != 5 || this.l0) {
            i = 0;
            i2 = 8;
        } else {
            i = R.string.component_betslip__one_bet_confirm_note;
            i2 = 0;
        }
        if (!zA && i4 == 4 && !this.l0) {
            i = R.string.component_betslip__note_cashout_is_unavailable_with_flexibet;
            i2 = 0;
        }
        if (!zA2 && i4 == 6 && !this.l0) {
            i = R.string.component_betslip__note_cashout_is_unavailable_with_anywin;
            i2 = 0;
        }
        if (this.o0) {
            i = R.string.component_betslip__note_cashout_unavailable_bb;
            i2 = 0;
        }
        dialog.findViewById(R.id.confirm_note).setVisibility(i2);
        if (i2 == 0) {
            ((TextView) dialog.findViewById(R.id.confirm_note)).setText(i);
        }
        this.h0 = dialog.findViewById(R.id.bs_confirm_container);
        this.f0 = (TextView) dialog.findViewById(R.id.excise_tax);
        this.e0 = (TextView) dialog.findViewById(R.id.textView3);
        this.b0 = dialog.findViewById(R.id.gifts_container_v2);
        this.d0 = (CheckBox) dialog.findViewById(R.id.checkbox_gift);
        if (getContext() != null && (drawableB = s0b.b(getContext(), R.drawable.ic__gift, new a78.c(R.color.icon_brand_sub_primary_d_lighter), 20)) != null) {
            this.d0.setCompoundDrawablesRelative(drawableB, null, null, null);
        }
        this.d0.setOnCheckedChangeListener(new lta(this));
        this.c0 = (TextView) dialog.findViewById(R.id.tv_gift);
        w0(sn5.d(this, R.string.gift__l_gift, new Object[0]));
        View viewFindViewById = dialog.findViewById(R.id.bs_confirm_container);
        b bVar = this.u0;
        viewFindViewById.setOnClickListener(bVar);
        this.V = (TextView) dialog.findViewById(R.id.payValue);
        this.W = (Button) dialog.findViewById(R.id.cancel);
        this.X = (Button) dialog.findViewById(R.id.confirm);
        this.W.setOnClickListener(bVar);
        this.X.setOnClickListener(bVar);
        boolean z = this.T;
        TextView textView2 = this.e0;
        if (z) {
            textView2.setText(sn5.d(this, R.string.component_betslip__confirm_to_pay, new Object[0]));
        } else {
            textView2.setText(sn5.d(this, R.string.component_betslip__confirm_to_pay_sportycoins, new Object[0]));
        }
        v0();
        this.X.setBackgroundResource(this.l0 ? R.color.sim_theme_primary : R.drawable.spr_selector_common_0_radius_btn_bg);
        this.X.setTextColor(getResources().getColor(this.l0 ? R.color.black : R.color.brand_tertiary));
        View view = this.b0;
        if (w0 <= 0 || !iw2.d()) {
            i3 = 4;
        } else {
            int i5 = this.n0;
            if (i5 == 5 || i5 == 3) {
                i3 = 8;
            }
        }
        view.setVisibility(i3);
        m0(y0(), o0().C);
        this.f.d(ime.a(dialog), "fs-unmask");
        i2i.c(this.i.p(), null, 3).f(this, new lfy() { // from class: cta
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                zsb zsbVar = d.v0;
                d dVar = this.a;
                dVar.i0 = (TaxConfigs) obj;
                if (dVar.isAdded()) {
                    dVar.t0();
                }
            }
        });
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        aj90 aj90Var = this.r0;
        if (aj90Var != null) {
            aj90Var.w = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        new Handler().postDelayed(new Runnable() { // from class: zsa
            @Override // java.lang.Runnable
            public final void run() {
                zsb zsbVar = d.v0;
                d dVar = this.a;
                d.a aVar = dVar.new a();
                TextView textView = dVar.c0;
                if (textView != null) {
                    textView.setOnClickListener(aVar);
                }
            }
        }, 500L);
    }

    public final void p0(SelectedGiftData selectedGiftData, SelectedGiftData selectedGiftData2) {
        this.z.E = true;
        this.A.E = true;
        this.B.E = true;
        o0().b(selectedGiftData);
        o0().D = selectedGiftData2;
        this.t0 = true;
        if (this.l0) {
            m0(y0(), selectedGiftData);
        }
        r0();
    }

    public final void s0(boolean z) {
        try {
            SelectedGiftData selectedGiftData = o0().C;
            if (selectedGiftData == null) {
                return;
            }
            this.z.E = z;
            this.A.E = z;
            this.B.E = z;
            if (z) {
                SelectedGiftData selectedGiftDataCopy = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), true, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
                o0().D = selectedGiftData;
                o0().b(selectedGiftDataCopy);
                r0();
                return;
            }
            SelectedGiftData selectedGiftDataCopy2 = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
            o0().D = selectedGiftData;
            o0().b(selectedGiftDataCopy2);
            r0();
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.c(e, "onGiftChecked exception", new Object[0]);
        }
    }

    public final void t0() {
        String strD;
        Locale locale = Locale.US;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.m0);
        if (!this.i0.hasExciseTaxRate(this.l0)) {
            this.F = this.F.multiply(bigDecimalValueOf);
            this.f0.setVisibility(8);
            this.V.setText(a8b.a(bjb0.L(this.F, locale)));
            this.g0.setText(sn5.d(this, R.string.component_betslip__potential_win, new Object[0]));
            return;
        }
        boolean z = this.l0;
        TaxConfigs taxConfigs = this.i0;
        BigDecimal bigDecimal = this.F;
        BigDecimal bigDecimalMultiply = z ? taxConfigs.getExciseTax(true, bigDecimal).setScale(2, RoundingMode.HALF_UP).multiply(bigDecimalValueOf) : taxConfigs.getExciseTax(false, bigDecimal).multiply(bigDecimalValueOf);
        BigDecimal bigDecimalMultiply2 = BigDecimal.valueOf(Double.parseDouble(this.G)).multiply(bigDecimalValueOf);
        if (this.l0) {
            strD = sn5.d(this, R.string.component_betslip__excise_tax, new Object[0]) + " (" + a8b.a(bjb0.L(bigDecimalMultiply, locale)) + ")";
        } else {
            strD = sn5.d(this, R.string.component_betslip__excise_tax_confirm_dialog_bracket, a8b.a(bjb0.L(bigDecimalMultiply2, locale)), a8b.a(bjb0.L(bigDecimalMultiply, locale)));
        }
        this.f0.setText(strD);
        this.f0.setVisibility(0);
        BigDecimal bigDecimalAdd = bigDecimalMultiply.add(bigDecimalMultiply2);
        String str = this.N;
        if (!TextUtils.isEmpty(str)) {
            BigDecimal bigDecimal2 = new BigDecimal(str);
            bigDecimalAdd = bigDecimalAdd.compareTo(bigDecimal2) >= 0 ? bigDecimalAdd.subtract(bigDecimal2) : BigDecimal.ZERO;
        }
        this.V.setText(a8b.a(bjb0.P(bigDecimalAdd.toPlainString(), locale)));
        this.g0.setText(sn5.d(this, R.string.component_betslip__to_win, new Object[0]));
    }

    public final void u0(boolean z) {
        CheckBox checkBox = this.d0;
        if (checkBox == null) {
            return;
        }
        this.s0 = true;
        checkBox.setChecked(z);
        this.s0 = false;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("source", AnalyticsParam.EVENT_SOURCE_CONFIRM_SHEET), new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_STATUS, z ? AnalyticsParam.EVENT_STATUS_CHECKED : AnalyticsParam.EVENT_STATUS_UNCHECKED)};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
        }
        Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        f00 f00Var = vgb0.a;
        mapUnmodifiableMap.getClass();
        vgb0.c(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, mapUnmodifiableMap, false);
        this.C.c(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, mapUnmodifiableMap, null);
    }

    public final void v0() {
        if (y0()) {
            SelectedGiftData selectedGiftData = o0().C;
            if (selectedGiftData == null) {
                m0(true, null);
                return;
            } else {
                u0(selectedGiftData.getChecked());
                m0(true, selectedGiftData);
                return;
            }
        }
        j7g j7gVar = new j7g(sn5.d(this, R.string.component_coupon__choose_gifts_2, new Object[0]));
        int i = w0;
        if (i > 0) {
            j7gVar.e(requireContext().getColor(R.color.text_type1_primary), sn5.d(this, R.string.component_coupon__use_gifts_with_num, String.valueOf(i)));
        } else {
            j7gVar.e(requireContext().getColor(R.color.text_type1_primary), sn5.d(this, R.string.common_functions__none_with_brackets, new Object[0]));
        }
        if (TextUtils.isEmpty(this.N) || this.N.contains(GiftUtil.CLEARED_GIFT_VALUE)) {
            this.N = null;
            this.M = 0;
            this.L = null;
            if (w0 > 0 && this.n0 != 5 && iw2.d()) {
                new j7g("").e(requireContext().getColor(R.color.text_type1_primary), sn5.d(this, R.string.component_coupon__use_gifts_with_num, String.valueOf(w0)));
            }
        }
        m0(false, null);
    }

    public final void w0(String str) {
        if (this.c0 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = sn5.d(this, R.string.gift__l_gift, new Object[0]);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.c0.setText(spannableString);
    }

    public final boolean y0() {
        int i;
        return w0 > 0 && iw2.d() && (i = this.n0) != 5 && i != 3 && this.m0 <= 1;
    }

    public final void r0() {
        SelectedGiftData selectedGiftData;
        BigDecimal bigDecimal;
        if (rvi.b(this) || (selectedGiftData = o0().C) == null) {
            return;
        }
        String giftValue = selectedGiftData.getGiftValue();
        if (!TextUtils.isEmpty(giftValue)) {
            this.N = giftValue.replaceAll(",", "");
        }
        SelectedGiftData selectedGiftData2 = o0().D;
        u0(selectedGiftData.getChecked());
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.a("confirm newSelectGift: %s", selectedGiftData);
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.a("confirm oldSelectGift: %s", selectedGiftData2);
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.a(QWvyvNzGsBpRT.MeBzgFzEZOM, Boolean.valueOf(this.t0));
        try {
            yyk yykVar = this.q0;
            String str = this.G;
            boolean z = this.t0;
            yykVar.getClass();
            str.getClass();
            zik zikVar = yykVar.y;
            BigDecimal bigDecimal2 = new BigDecimal(str);
            zikVar.getClass();
            ajk.a aVarA = zik.a(bigDecimal2, selectedGiftData, selectedGiftData2, z);
            this.t0 = false;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.a(dLRYz.yTuIMqTWV, aVarA);
            this.G = aVarA.a.toString();
            this.N = aVarA.b.toString();
            this.L = selectedGiftData.getGiftId();
            this.M = selectedGiftData.getGiftKind();
            if (selectedGiftData.getChecked()) {
                this.N = selectedGiftData.getGiftValue();
            } else {
                this.N = "0";
            }
            o0().b(new SelectedGiftData(selectedGiftData.getGiftValue(), this.M, this.L, selectedGiftData.getGiftLimit(), w0, selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), selectedGiftData.getChecked(), selectedGiftData.getUserSelect(), this.G));
            BigDecimal bigDecimalA = this.D.a();
            this.X.setEnabled(new BigDecimal(this.G).compareTo(bigDecimalA) >= 0);
            v0();
            if (TextUtils.isEmpty(this.N) || this.N.contains(GiftUtil.CLEARED_GIFT_VALUE)) {
                bigDecimal = new BigDecimal(this.G);
                this.F = bigDecimal;
            } else {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(this.G) - Double.parseDouble(this.N));
                this.F = bigDecimal;
            }
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                this.F = bigDecimal3;
            }
            t0();
            if (!rvi.b(this)) {
                getParentFragmentManager().m0("key_gift_change", new Bundle());
            }
            c cVar = this.j0;
            if (cVar != null) {
                cVar.b();
            }
        } catch (Exception unused) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_BET_SLIP);
            aVar2.n("[ConfirmFragment] Error in onChangeGiftChecked", new Object[0]);
        }
    }
}
