package com.sportybet.android.basepay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.transition.nfj.CaBJCMnsV;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sporty.android.core.model.pocket.common.WhTaxData;
import com.sportybet.android.basepay.TransactionSuccessActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.a8b;
import defpackage.aqg0;
import defpackage.bb40;
import defpackage.bcp;
import defpackage.bjb0;
import defpackage.ct90;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.ema;
import defpackage.hb5;
import defpackage.i2k0;
import defpackage.jq40;
import defpackage.k00;
import defpackage.lfy;
import defpackage.o7d;
import defpackage.psm;
import defpackage.pwx;
import defpackage.qgj0;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rgj0;
import defpackage.ru90;
import defpackage.s2k0;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.t5m;
import defpackage.v8i0;
import defpackage.vnd;
import defpackage.vu60;
import defpackage.vym;
import defpackage.wae;
import defpackage.xdp;
import defpackage.xqg0;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TransactionSuccessActivity extends t5m implements pwx, View.OnClickListener, vym, bb40 {
    public static final /* synthetic */ int C = 0;
    public psm A;
    public rdd0 B;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public WhTaxData i;
    public String v;
    public boolean w;
    public rgj0 y;
    public xqg0 z;

    public static void z1(Activity activity, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) TransactionSuccessActivity.class);
        intent.putExtra("amount", str);
        intent.putExtra("paymentTo", str2);
        intent.putExtra("number", str3);
        intent.putExtra("tradeNo", str4);
        intent.putExtra("type", i);
        intent.putExtra("wh_tax_data", (Parcelable) null);
        intent.putExtra("fee", str5);
        intent.putExtra("EXTRA_FROM_GAME", z);
        activity.startActivity(intent);
        if (z) {
            activity.finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.check_status) {
            Bundle bundle = new Bundle();
            if (this.b == 1) {
                bundle.putInt("key_param_tx_category", aqg0.e.c.a);
            } else {
                bundle.putInt("key_param_tx_category", aqg0.j.c.a);
            }
            sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
            finish();
            return;
        }
        if (id != R.id.done_btn) {
            if (id == R.id.wh_tax_help) {
                sh8.c().e(bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_WITHHOLDING_TAX));
                return;
            }
            return;
        }
        Boolean bool = (Boolean) this.z.c.b("isWorldCupPassDepositFlow");
        if (bool != null ? bool.booleanValue() : false) {
            this.B.a(s2k0.a.a, k00.d);
            Intent intent = new Intent(this, (Class<?>) WorldCupPassActivity.class);
            intent.putExtra("source", "deposit_success");
            startActivity(intent);
        } else if (this.w) {
            finish();
        } else if (this.A.r() || this.A.O()) {
            sh8.c().e(o7d.a(wae.HOME));
        }
        finish();
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

    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        i2k0 i2k0Var;
        i2k0.a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_transaction_success);
        if (getIntent() != null) {
            this.c = getIntent().getStringExtra("amount");
            this.d = getIntent().getStringExtra("paymentTo");
            this.e = getIntent().getStringExtra("number");
            this.f = getIntent().getStringExtra("tradeNo");
            this.b = getIntent().getIntExtra("type", 0);
            this.i = (WhTaxData) getIntent().getParcelableExtra("wh_tax_data");
            this.v = getIntent().getStringExtra("fee");
            this.w = getIntent().getBooleanExtra("EXTRA_FROM_GAME", false);
        }
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(xqg0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        xqg0 xqg0Var = (xqg0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.z = xqg0Var;
        boolean z2 = this.b == 1;
        if (!xqg0Var.c.a("isWorldCupPassDepositFlow")) {
            vu60 vu60Var = xqg0Var.c;
            if (z2 && xqg0Var.a.O() && (aVar = (i2k0Var = xqg0Var.b).a) != null) {
                i2k0Var.a = null;
                long jCurrentTimeMillis = System.currentTimeMillis() - aVar.a;
                if (0 > jCurrentTimeMillis || jCurrentTimeMillis > 900000) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            vu60Var.e(Boolean.valueOf(z), "isWorldCupPassDepositFlow");
        }
        TextView textView = (TextView) findViewById(R.id.amount);
        TextView textView2 = (TextView) findViewById(R.id.amount_label);
        TextView textView3 = (TextView) findViewById(R.id.fee);
        TextView textView4 = (TextView) findViewById(R.id.fee_label);
        TextView textView5 = (TextView) findViewById(R.id.payment_to);
        TextView textView6 = (TextView) findViewById(R.id.payment_to_label);
        TextView textView7 = (TextView) findViewById(R.id.info1);
        TextView textView8 = (TextView) findViewById(R.id.tradeNo);
        TextView textView9 = (TextView) findViewById(R.id.tradeNo_label);
        TextView textView10 = (TextView) findViewById(R.id.submission_tip);
        TextView textView11 = (TextView) findViewById(R.id.title);
        TextView textView12 = (TextView) findViewById(R.id.info_label1);
        TextView textView13 = (TextView) findViewById(R.id.title_bar);
        textView12.setVisibility(0);
        textView7.setVisibility(0);
        if (this.A.r() || this.A.O()) {
            textView12.setText(getCMSString(R.string.page_payment__account_number, new Object[0]));
            textView13.setVisibility(4);
        } else {
            textView12.setText(getCMSString(R.string.page_payment__mobile_number, new Object[0]));
        }
        textView2.setText(getCMSString(R.string.common_functions__amount_label, a8b.d().trim()));
        textView.setText(this.c);
        textView5.setText(this.d);
        String str = this.e;
        if (str != null) {
            int length = str.length();
            String str2 = this.e;
            if (length >= 5) {
                textView7.setText(getCMSString(R.string.app_common__star_number, str2.substring(4)));
            } else {
                textView7.setText(str2);
            }
        } else {
            textView12.setVisibility(8);
            textView7.setVisibility(8);
        }
        String str3 = this.f;
        if (str3 != null) {
            textView8.setText(str3);
        } else {
            textView9.setVisibility(8);
            textView8.setVisibility(8);
        }
        if (this.v != null) {
            textView3.setVisibility(0);
            textView4.setVisibility(0);
            textView3.setText(this.v);
        } else {
            textView3.setVisibility(8);
            textView4.setVisibility(8);
        }
        TextView textView14 = (TextView) findViewById(R.id.check_status);
        textView14.setOnClickListener(this);
        if (this.A.O()) {
            textView14.setText(getCMSString(R.string.common_functions__transactions, new Object[0]) + TEFcJcMqR.mVh);
        }
        CommonButton commonButton = (CommonButton) findViewById(R.id.done_btn);
        commonButton.setOnClickListener(this);
        Boolean bool = (Boolean) this.z.c.b("isWorldCupPassDepositFlow");
        if (bool != null ? bool.booleanValue() : false) {
            commonButton.setText(getCMSString(R.string.world_cup_mission__wc_pass_deposit_continue_cta, new Object[0]));
            this.B.a(s2k0.b.a, k00.d);
        }
        String str4 = this.c;
        WhTaxData whTaxData = this.i;
        if (whTaxData != null && whTaxData.isActive) {
            BigDecimal bigDecimalCalculateWhTax = whTaxData.calculateWhTax(str4);
            if (bigDecimalCalculateWhTax.compareTo(BigDecimal.ZERO) > 0) {
                findViewById(R.id.amount_group).setVisibility(8);
                findViewById(R.id.wh_tax_group).setVisibility(0);
                findViewById(R.id.wh_tax_help).setOnClickListener(this);
                BigDecimal bigDecimalSubtract = new BigDecimal(str4).subtract(bigDecimalCalculateWhTax);
                TextView textView15 = (TextView) findViewById(R.id.net_payout);
                Locale locale = Locale.US;
                textView15.setText(bjb0.L(bigDecimalSubtract, locale));
                ((TextView) findViewById(R.id.wh_tax)).setText(bjb0.L(bigDecimalCalculateWhTax, locale));
            }
        }
        int i = this.b;
        if (i == 1) {
            textView11.setText(getCMSString(R.string.page_payment__deposit_succeeded, new Object[0]));
            textView6.setText(getCMSString(R.string.page_payment__deposit_from, new Object[0]));
        } else if (i == 2) {
            textView11.setText(getCMSString(R.string.page_withdraw__withdrawal_succeeded, new Object[0]));
            textView6.setText(getCMSString(R.string.page_withdraw__withdraw_to, new Object[0]));
        } else if (i == 3) {
            textView11.setText(getCMSString(R.string.page_payment__submission_succeeded, new Object[0]));
            textView10.setVisibility(0);
        }
        if (this.b == 1) {
            v8i0 viewModelStore2 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory2.getClass();
            defaultViewModelCreationExtras2.getClass();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
            dq7 dq7VarA2 = jq40.a(rgj0.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            rgj0 rgj0Var = (rgj0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
            this.y = rgj0Var;
            rgj0Var.v.f(this, new lfy() { // from class: vqg0
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    WhTaxData whTaxData2 = (WhTaxData) obj;
                    int i2 = TransactionSuccessActivity.C;
                    if (whTaxData2 == null || !whTaxData2.isActive) {
                        return;
                    }
                    TransactionSuccessActivity transactionSuccessActivity = this.a;
                    TextView textView16 = (TextView) transactionSuccessActivity.findViewById(R.id.wh_tax_description);
                    textView16.setVisibility(0);
                    textView16.setText(transactionSuccessActivity.getCMSString(R.string.page_payment__deposit_gh_tax_info, String.valueOf(whTaxData2.effectiveDays)));
                }
            });
            if (this.A.x()) {
                rgj0 rgj0Var2 = this.y;
                rgj0Var2.getClass();
                bcp bcpVar = new bcp();
                xdp xdpVar = new xdp();
                xdpVar.i("appId", "pocket");
                xdpVar.i(CaBJCMnsV.yuz, "application");
                xdpVar.i("configKey", "wht.settings");
                bcpVar.h(xdpVar);
                ema emaVarY1 = rgj0Var2.y1();
                ct90 ct90VarA = ru90.a(rgj0Var2.d.i(bcpVar.toString()), rgj0Var2.a);
                qgj0 qgj0Var = new qgj0(rgj0Var2);
                ct90VarA.a(qgj0Var);
                emaVarY1.b(qgj0Var);
            }
            rgj0 rgj0Var3 = this.y;
            vnd vndVar = new vnd(this.A.getCountryCode().getCode());
            k00[] k00VarArr = {k00.d, k00.c};
            rgj0Var3.getClass();
            rgj0Var3.e.a(vndVar, (k00[]) Arrays.copyOf(k00VarArr, 2));
        }
    }
}
