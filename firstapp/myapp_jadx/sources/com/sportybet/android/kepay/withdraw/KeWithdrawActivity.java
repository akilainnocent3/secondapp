package com.sportybet.android.kepay.withdraw;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.bumptech.glide.a;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.kepay.TransactionSuccessfulActivity;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import defpackage.a8b;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bjb0;
import defpackage.bkp;
import defpackage.bx1;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dlp;
import defpackage.dq7;
import defpackage.ekp;
import defpackage.f00;
import defpackage.hb5;
import defpackage.i2i;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.lif;
import defpackage.log0;
import defpackage.lop;
import defpackage.lyh;
import defpackage.op8;
import defpackage.p54;
import defpackage.pkp;
import defpackage.psm;
import defpackage.pu0;
import defpackage.pwx;
import defpackage.qkp;
import defpackage.qpg0;
import defpackage.qtr;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sc00;
import defpackage.sh8;
import defpackage.skp;
import defpackage.su5;
import defpackage.u6i0;
import defpackage.ujp;
import defpackage.uy0;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vkp;
import defpackage.vo6;
import defpackage.vtl;
import defpackage.vw;
import defpackage.vym;
import defpackage.w1k;
import defpackage.wga;
import defpackage.wjp;
import defpackage.wkp;
import defpackage.wwd0;
import defpackage.xym;
import defpackage.yyh;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class KeWithdrawActivity extends vtl implements pwx, View.OnClickListener, SwipeRefreshLayout.f, TextWatcher, TextView.OnEditorActionListener, vym, xym, a.b, bb40 {
    public static final /* synthetic */ int Z = 0;
    public BigDecimal A;
    public String B;
    public BigDecimal C;
    public su5<BaseResponse<BankTradeResponse>> D;
    public ProgressDialog E;
    public su5<BaseResponse<BankTradeData>> F;
    public LoadingViewNew G;
    public AspectRatioImageView H;
    public int I;
    public qtr J;
    public TextView K;
    public ImageView L;
    public BigDecimal M;
    public ComposeView N;
    public ComposeView O;
    public dlp P;
    public RelativeLayout Q;
    public ujp R;
    public qpg0 S;
    public BigDecimal T;
    public psm U;
    public d0n V;
    public uy0 W;
    public e X;
    public azm Y;
    public TextView b;
    public SwipeRefreshLayout c;
    public TextView d;
    public ClearEditText e;
    public LinearLayout f;
    public TextView i;
    public LinearLayout v;
    public ImageView w;
    public String y;
    public BigDecimal z;

    public KeWithdrawActivity() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.z = bigDecimal;
        this.A = bigDecimal;
        this.T = bigDecimal;
    }

    public final void A1(String str) {
        if (isFinishing()) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) TransactionSuccessfulActivity.class);
        intent.putExtra("trade_id", str);
        intent.putExtra("phone_number", this.B);
        dlp dlpVar = this.P;
        intent.putExtra("trade_amount", String.valueOf(p54.b(dlpVar == null ? BigDecimal.ZERO : (BigDecimal) dlpVar.V0.getValue())));
        intent.putExtra("transaction_type", 2);
        intent.putExtra("withdraw_fee", bjb0.Y(this.T));
        intent.putExtra("channel_icon_url", this.y);
        startActivity(intent);
        finish();
    }

    @Override // com.sportybet.android.kepay.withdraw.a.b
    public final void a1(int i, String str) {
        z1(i, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        dlp dlpVar = this.P;
        if (dlpVar != null) {
            dlpVar.F1();
        }
        if (getAccountHelper().getAccount() == null) {
            this.c.setRefreshing(false);
        } else {
            i2i.b(this.W.h(pu0.c.a)).f(this, new qkp(this));
        }
    }

    @Override // com.sportybet.android.kepay.withdraw.a.b
    public final void m0(String str) {
        A1(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String cMSString;
        String cMSString2;
        int id = view.getId();
        if (id == R.id.back) {
            lop.a(this.e);
            getOnBackPressedDispatcher().d();
            return;
        }
        if (id != R.id.withdraw_btn) {
            if (id != R.id.withdraw_help_center_btn) {
                lop.a(this.e);
                return;
            } else {
                sh8.c().e(bjb0.S("/m/help#/how-to-play/others/how-to-withdraw"));
                lop.a(this.e);
                return;
            }
        }
        int i = this.I;
        if (i == 0) {
            lop.a(this.e);
            dlp dlpVar = this.P;
            if (dlpVar == null) {
                return;
            }
            long jN1 = dlpVar.N1();
            long jO1 = this.P.O1();
            dlp dlpVar2 = this.P;
            long jLongValue = (dlpVar2 == null ? BigDecimal.ZERO : (BigDecimal) dlpVar2.V0.getValue()).longValue();
            long jLongValue2 = p54.c(this.C).longValue();
            String str = this.B;
            int iIntValue = ((Number) this.P.L0.a.getValue()).intValue();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putLong("withdraw_amount", jLongValue);
            bundle.putLong("remain_amount", jLongValue2);
            bundle.putString("phone_number", str);
            bundle.putLong("additional_fee", jN1);
            bundle.putLong("tax_amount", jO1);
            bundle.putInt("payChId", iIntValue);
            aVar.setArguments(bundle);
            aVar.show(getSupportFragmentManager(), "WithDrawConfirmFragment");
            return;
        }
        String cMSString3 = getCMSString(R.string.common_functions__cancel, new Object[0]);
        DialogInterface.OnClickListener wjpVar = null;
        switch (i) {
            case 11:
                cMSString = getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_tip, new Object[0]);
                cMSString2 = getCMSString(R.string.identity_verification__verify, new Object[0]);
                break;
            case 12:
                cMSString = getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip, new Object[0]);
                cMSString2 = getCMSString(R.string.common_functions__ok, new Object[0]);
                cMSString3 = null;
                break;
            case 13:
                cMSString = getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip, new Object[0]);
                cMSString2 = getCMSString(R.string.common_functions__contact_us, new Object[0]);
                break;
            default:
                cMSString = null;
                cMSString2 = null;
                break;
        }
        b.a aVar2 = new b.a(this);
        aVar2.setTitle(getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]));
        aVar2.a.f = cMSString;
        if (!TextUtils.isEmpty(cMSString)) {
            if (i == 11) {
                wjpVar = new wjp();
            } else if (i == 13) {
                wjpVar = new DialogInterface.OnClickListener() { // from class: gkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        int i3 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        keWithdrawActivity.V.b(keWithdrawActivity, snb0.WITHDRAW);
                    }
                };
            }
            aVar2.c(cMSString2, wjpVar);
        }
        if (!TextUtils.isEmpty(cMSString3)) {
            aVar2.b(cMSString3, new pkp());
        }
        aVar2.f();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_withdraw_ke);
        findViewById(R.id.back).setOnClickListener(this);
        this.b = (TextView) findViewById(R.id.balance_account);
        this.c = (SwipeRefreshLayout) findViewById(R.id.withdraw_swipe);
        TextView textView = (TextView) findViewById(R.id.withdraw_btn);
        this.d = textView;
        textView.setOnClickListener(this);
        int i = 0;
        this.d.setEnabled(false);
        this.c.setOnRefreshListener(this);
        ClearEditText clearEditText = (ClearEditText) findViewById(R.id.amount_edit_text);
        this.e = clearEditText;
        clearEditText.setErrorView((TextView) findViewById(R.id.error));
        this.e.addTextChangedListener(this);
        int i2 = 1;
        this.e.setFilters(new InputFilter[]{new vo6()});
        this.B = getIntent().getStringExtra("phone_number");
        TextView textView2 = (TextView) findViewById(R.id.number);
        String str = this.B;
        if (str != null && str.length() > 4) {
            String str2 = this.B;
            textView2.setText(getCMSString(R.string.app_common__star_number, str2.substring(str2.length() - 4)));
        }
        this.w = (ImageView) findViewById(R.id.momo_telecom_icon);
        findViewById(R.id.content_root).setOnClickListener(this);
        findViewById(R.id.withdraw_activity_root).setOnClickListener(this);
        findViewById(R.id.withdraw_help_center_btn).setOnClickListener(this);
        ProgressDialog progressDialog = new ProgressDialog(this, R.style.BrandProgressDialogTheme);
        this.E = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.E.setMessage(getCMSString(R.string.page_payment__being_processed_dot, new Object[0]));
        this.E.setIndeterminate(true);
        this.E.setCanceledOnTouchOutside(false);
        this.E.setCancelable(false);
        this.E.setOnCancelListener(null);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.withdraw_banner);
        this.H = aspectRatioImageView;
        aspectRatioImageView.setAspectRatio(0.17777778f);
        LoadingViewNew loadingViewNew = (LoadingViewNew) findViewById(R.id.loading);
        this.G = loadingViewNew;
        loadingViewNew.setOnClickListener(new View.OnClickListener() { // from class: rkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = KeWithdrawActivity.Z;
                this.a.i();
            }
        });
        this.f = (LinearLayout) findViewById(R.id.top_container);
        this.i = (TextView) findViewById(R.id.top_view);
        this.v = (LinearLayout) findViewById(R.id.description_container);
        this.J = qtr.a(findViewById(R.id.draw_grey_container));
        this.K = (TextView) findViewById(R.id.withdrawable_balance);
        this.L = (ImageView) findViewById(R.id.withdrawable_balance_hint);
        this.Q = (RelativeLayout) findViewById(R.id.withdrawable_balance_layout);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(dlp.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.P = (dlp) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(ujp.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.R = (ujp) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(qpg0.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.S = (qpg0) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        ujp ujpVar = this.R;
        log0 log0Var = log0.b;
        ujpVar.getClass();
        ujpVar.b = log0Var;
        this.P.D1();
        qpg0 qpg0Var = this.S;
        qpg0Var.getClass();
        qpg0Var.f = log0Var;
        qpg0Var.x1();
        wwd0 wwd0Var = this.P.D;
        s9s.b bVar = s9s.b.c;
        yyh.b(wwd0Var, this, bVar, new vkp(this, i));
        yyh.b(this.S.A, this, bVar, new wkp(this, i));
        yyh.b(this.P.X, this, bVar, new Function1() { // from class: xjp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Ads ads = (Ads) obj;
                int i3 = KeWithdrawActivity.Z;
                if (ads == null || TextUtils.isEmpty(ads.getLinkUrl()) || TextUtils.isEmpty(ads.getImgUrl())) {
                    return null;
                }
                gbn gbnVarA = sh8.a();
                String imgUrl = ads.getImgUrl();
                KeWithdrawActivity keWithdrawActivity = this.a;
                gbnVarA.a(imgUrl, keWithdrawActivity.H);
                keWithdrawActivity.H.setVisibility(0);
                keWithdrawActivity.H.setOnClickListener(new okp(ads, 0));
                return null;
            }
        });
        yyh.b(this.P.H0, this, bVar, new lif(this, i2));
        i2i.b(this.P.F0).f(this, new lfy() { // from class: yjp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                int i3 = KeWithdrawActivity.Z;
                if (channel == null || channel.getChannelIconUrl() == null || channel.getChannelIconUrl().isEmpty()) {
                    return;
                }
                String channelIconUrl = channel.getChannelIconUrl();
                KeWithdrawActivity keWithdrawActivity = this.a;
                keWithdrawActivity.y = channelIconUrl;
                a.b(keWithdrawActivity).e(keWithdrawActivity).p(keWithdrawActivity.y).j().M(keWithdrawActivity.w);
            }
        });
        i2i.b(this.P.i).f(this, new lfy() { // from class: zjp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i3 = KeWithdrawActivity.Z;
                KeWithdrawActivity keWithdrawActivity = this.a;
                keWithdrawActivity.X.c((com.sporty.android.common.uievent.a) obj, keWithdrawActivity, keWithdrawActivity.findViewById(R.id.root), null);
            }
        });
        i2i.b(this.P.O).f(this, new lfy() { // from class: akp
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String str3;
                PayHintData payHintData = (PayHintData) obj;
                int i3 = KeWithdrawActivity.Z;
                if (payHintData == null || (str3 = payHintData.alert) == null) {
                    return;
                }
                boolean zIsEmpty = TextUtils.isEmpty(str3);
                KeWithdrawActivity keWithdrawActivity = this.a;
                LinearLayout linearLayout = keWithdrawActivity.f;
                if (zIsEmpty) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    keWithdrawActivity.i.setText(payHintData.alert);
                }
                List<String> list = payHintData.descriptionLines;
                if (list == null || list.size() <= 0) {
                    return;
                }
                keWithdrawActivity.v.removeAllViews();
                for (String str4 : payHintData.descriptionLines) {
                    if (!TextUtils.isEmpty(str4)) {
                        TextView textView3 = new TextView(keWithdrawActivity.v.getContext());
                        textView3.setText(str4);
                        textView3.setTextColor(Color.parseColor("#9ca0ab"));
                        textView3.setTextSize(12.0f);
                        keWithdrawActivity.v.addView(textView3);
                    }
                }
            }
        });
        findViewById(R.id.home).setOnClickListener(new skp());
        ((TextView) findViewById(R.id.withdrawable_balance_label)).setText(getCMSString(R.string.common_functions__withdrawable_balance_label, a8b.d().trim()));
        ((TextView) findViewById(R.id.withdraw_amount_text)).setText(getCMSString(R.string.common_functions__amount, new Object[0]) + " (" + a8b.d().trim() + ")");
        ((TextView) findViewById(R.id.balance_info)).setText(getCMSString(R.string.common_functions__balance_label, a8b.d().trim()));
        ComposeView composeView = (ComposeView) findViewById(R.id.compose_order_container);
        this.N = composeView;
        composeView.setVisibility(8);
        ComposeView composeView2 = this.N;
        u6i0.a aVar = u6i0.a.a;
        composeView2.setViewCompositionStrategy(aVar);
        ComposeView composeView3 = this.N;
        dlp dlpVar = this.P;
        composeView3.getClass();
        dlpVar.getClass();
        composeView3.setContent(new op8(-1273922213, new bx1(dlpVar), true));
        ComposeView composeView4 = (ComposeView) findViewById(R.id.compose_withdraw_alert_hint);
        this.O = composeView4;
        composeView4.setViewCompositionStrategy(aVar);
        ComposeView composeView5 = this.O;
        final dlp dlpVar2 = this.P;
        composeView5.getClass();
        dlpVar2.getClass();
        composeView5.setContent(new op8(14819043, new Function2() { // from class: jhj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 2;
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(-1091428806, new erp(dlpVar2, i3), aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
        lop.a(this.e);
        wwd0 wwd0Var = this.P.u0;
        Boolean bool = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
        i2i.b(this.W.h(pu0.c.a)).f(this, new qkp(this));
        wwd0 wwd0Var = this.P.u0;
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    public final void z1(int i, String str) {
        if (isFinishing()) {
        }
        this.E.dismiss();
        int i2 = 0;
        switch (i) {
            case 0:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_withdraw__your_withdrawal_request_has_been_submitted_tip, new Object[0]);
                }
                sc00.b(this, str, false, new bkp(this, i2), new ekp(this, i2)).show();
                break;
            case 61100:
                b.a aVar = new b.a(this);
                AlertController.b bVar = aVar.a;
                bVar.f = str;
                bVar.k = false;
                aVar.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: fkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        keWithdrawActivity.e.setText("");
                        keWithdrawActivity.i();
                    }
                }).f();
                break;
            case 61300:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_withdraw__account_already_frozen, new Object[0]);
                }
                b.a aVar2 = new b.a(this);
                AlertController.b bVar2 = aVar2.a;
                bVar2.f = str;
                bVar2.k = false;
                aVar2.setPositiveButton(R.string.common_functions__ok, new pkp()).f();
                break;
            case 62100:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_payment__maximum_daily_transaction_value_is_vcurrency_vthreshold_tip, "₦", "9999999");
                }
                b.a aVar3 = new b.a(this);
                AlertController.b bVar3 = aVar3.a;
                bVar3.f = str;
                bVar3.k = false;
                aVar3.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: hkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        keWithdrawActivity.e.setText("");
                        keWithdrawActivity.i();
                    }
                }).f();
                break;
            case 62200:
                b.a aVar4 = new b.a(this);
                AlertController.b bVar4 = aVar4.a;
                bVar4.f = str;
                bVar4.k = false;
                aVar4.setPositiveButton(R.string.common_functions__continue, new DialogInterface.OnClickListener() { // from class: ikp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        if (!vox.d(keWithdrawActivity)) {
                            zyf0.c(1, keWithdrawActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
                            return;
                        }
                        if (!keWithdrawActivity.E.isShowing()) {
                            keWithdrawActivity.E.show();
                        }
                        BigDecimal bigDecimal = new BigDecimal(keWithdrawActivity.P.N1());
                        BigDecimal bigDecimal2 = new BigDecimal(keWithdrawActivity.P.O1());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("phoneNo", "254".concat(keWithdrawActivity.B.substring(1)));
                            dlp dlpVar = keWithdrawActivity.P;
                            jSONObject.put("payAmount", dlpVar == null ? BigDecimal.ZERO : (BigDecimal) dlpVar.V0.getValue());
                            jSONObject.put("feeAmount", bigDecimal);
                            jSONObject.put("taxAmount", bigDecimal2);
                            jSONObject.put("payChId", ((Number) keWithdrawActivity.P.L0.a.getValue()).intValue());
                            jSONObject.put("isConfirmAudit", 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        su5<BaseResponse<BankTradeResponse>> su5Var = keWithdrawActivity.D;
                        if (su5Var != null) {
                            su5Var.cancel();
                        }
                        su5<BaseResponse<BankTradeResponse>> su5VarN0 = ap0.g().n0(jSONObject.toString());
                        keWithdrawActivity.D = su5VarN0;
                        su5VarN0.G(new ykp(keWithdrawActivity));
                    }
                }).setNegativeButton(R.string.common_functions__cancel, new DialogInterface.OnClickListener() { // from class: jkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        this.a.i();
                    }
                }).f();
                break;
            case 66215:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                }
                b.a title = new b.a(this).setTitle(getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]));
                AlertController.b bVar5 = title.a;
                bVar5.f = str;
                bVar5.k = false;
                title.setPositiveButton(R.string.common_functions__home, new DialogInterface.OnClickListener() { // from class: kkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        this.a.Y.d(wae.HOME);
                    }
                }).setNegativeButton(R.string.self_exclusion__contact_customer_service, new DialogInterface.OnClickListener() { // from class: lkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        keWithdrawActivity.V.b(keWithdrawActivity, snb0.WITHDRAW);
                    }
                }).f();
                break;
            case 66217:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                }
                b.a title2 = new b.a(this).setTitle(getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]));
                AlertController.b bVar6 = title2.a;
                bVar6.f = str;
                bVar6.k = false;
                title2.setPositiveButton(R.string.common_functions__home, new DialogInterface.OnClickListener() { // from class: mkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        this.a.Y.d(wae.HOME);
                    }
                }).setNegativeButton(R.string.common_functions__transactions, new DialogInterface.OnClickListener() { // from class: ckp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        this.a.Y.d(wae.ME_TRANSACTIONS);
                    }
                }).f();
                break;
            default:
                if (TextUtils.isEmpty(str)) {
                    str = getCMSString(R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                }
                b.a aVar5 = new b.a(this);
                aVar5.a.f = str;
                b.a title3 = aVar5.setTitle(getCMSString(R.string.page_payment__error_during_transaction, new Object[0]));
                title3.a.k = false;
                title3.setPositiveButton(R.string.common_functions__ok, new DialogInterface.OnClickListener() { // from class: dkp
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = KeWithdrawActivity.Z;
                        KeWithdrawActivity keWithdrawActivity = this.a;
                        keWithdrawActivity.e.setText("");
                        keWithdrawActivity.i();
                    }
                }).f();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2;
        this.N.setVisibility(8);
        vw vwVar = (vw) i2i.b((lyh) this.R.e.getValue()).d();
        String string = charSequence.toString();
        if (TextUtils.isEmpty(string)) {
            BigDecimal bigDecimal = this.M;
            if (bigDecimal != null) {
                this.K.setText(bjb0.Y(bigDecimal));
            }
            dlp dlpVar = this.P;
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            dlpVar.getClass();
            bigDecimal2.getClass();
            wwd0 wwd0Var = dlpVar.U0;
            wwd0Var.getClass();
            wwd0Var.k(null, bigDecimal2);
            this.e.setError((String) null);
            this.d.setEnabled(false);
            this.N.setVisibility(8);
            return;
        }
        try {
            if (string.charAt(0) == '.') {
                String str = "0" + ((Object) charSequence);
                this.e.setText(str);
                this.e.setSelection(2);
                charSequence2 = str;
            } else {
                charSequence2 = charSequence;
            }
            if (string.contains(".")) {
                if ((charSequence2.length() - 1) - charSequence2.toString().indexOf(".") > 2) {
                    CharSequence charSequenceSubSequence = string.subSequence(0, string.indexOf(".") + 3);
                    this.e.setText(charSequenceSubSequence);
                    this.e.setSelection(charSequenceSubSequence.length());
                }
                if (string.charAt(string.length() - 1) == '.' && string.indexOf(46) != string.lastIndexOf(46)) {
                    String strSubstring = string.substring(0, string.length() - 1);
                    this.e.setText(strSubstring);
                    this.e.setSelection(strSubstring.length());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (string.contains(".")) {
            this.e.setError(getCMSString(R.string.page_withdraw__due_to_mpesas_policy_your_withdrawal_amount_must_be_an_integer__KE, new Object[0]));
            this.d.setEnabled(false);
            return;
        }
        if (string.length() == 1 && string.equals("0")) {
            BigDecimal bigDecimal3 = this.M;
            TextView textView = this.K;
            if (bigDecimal3 != null) {
                textView.setText(bjb0.Y(bigDecimal3));
            } else {
                textView.setText(getCMSString(R.string.app_common__no_cash, new Object[0]));
            }
            this.e.setError((String) null);
            this.e.setText("");
            this.d.setEnabled(false);
            return;
        }
        BigDecimal bigDecimal4 = new BigDecimal(string);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimal4.setScale(2, roundingMode);
        dlp dlpVar2 = this.P;
        BigDecimal bigDecimalC = p54.c(scale);
        dlpVar2.getClass();
        bigDecimalC.getClass();
        wwd0 wwd0Var2 = dlpVar2.U0;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bigDecimalC);
        long jN1 = this.P.N1();
        BigDecimal bigDecimalDivide = new BigDecimal(jN1).divide(BigDecimal.valueOf(10000L), 2, roundingMode);
        this.T = bigDecimalDivide;
        BigDecimal bigDecimal5 = this.M;
        if (bigDecimal5 != null) {
            this.K.setText(bjb0.Y(bigDecimal5.subtract(bigDecimalDivide).compareTo(BigDecimal.ZERO) > 0 ? bigDecimal5.subtract(bigDecimalDivide) : new BigDecimal("0.00")));
        }
        this.A = this.z.subtract(BigDecimal.valueOf(jN1).divide(BigDecimal.valueOf(10000L)).setScale(2, roundingMode));
        if (vwVar == null) {
            itf0.a.a("get amount from viewmodel null", new Object[0]);
            return;
        }
        T t = vwVar.b;
        BigDecimal bigDecimal6 = (BigDecimal) vwVar.a;
        if (scale.compareTo(bigDecimal6) < 0) {
            this.e.setError(getCMSString(R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, a8b.e(), bjb0.L(bigDecimal6, Locale.US)));
            this.d.setEnabled(false);
            return;
        }
        BigDecimal bigDecimal7 = (BigDecimal) t;
        if (scale.compareTo(bigDecimal7) > 0) {
            this.e.setError(getCMSString(R.string.page_withdraw__the_maximum_withdrawal_amount_is_vcurrency_vnum, a8b.e(), bjb0.L(bigDecimal7, Locale.US)));
            this.d.setEnabled(false);
            return;
        }
        BigDecimal scale2 = this.A.subtract(scale).setScale(2, roundingMode);
        this.C = scale2;
        BigDecimal bigDecimal8 = BigDecimal.ZERO;
        if (scale2.compareTo(bigDecimal8) < 0) {
            this.e.setError(getCMSString(R.string.common_feedback__your_balance_is_insufficient, new Object[0]));
            this.d.setEnabled(false);
            return;
        }
        BigDecimal bigDecimal9 = this.M;
        if (bigDecimal9 == null || bigDecimal9.subtract(bigDecimalDivide).compareTo(scale) >= 0) {
            this.e.setError((String) null);
            this.d.setEnabled(true);
            this.N.setVisibility(0);
            return;
        }
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(TEFcJcMqR.rlHIYMPfYhEuTKm, "display_withdrawable_balance_error")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
            return;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        vgb0.c("sporty_withdraw", mapUnmodifiableMap, false);
        ClearEditText clearEditText = this.e;
        String strE = a8b.e();
        BigDecimal bigDecimal10 = this.M;
        clearEditText.setError(getCMSString(R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, strE, bjb0.L(bigDecimal10.subtract(bigDecimalDivide).compareTo(bigDecimal8) > 0 ? bigDecimal10.subtract(bigDecimalDivide) : new BigDecimal("0.00"), Locale.US)));
        this.d.setEnabled(false);
    }
}
