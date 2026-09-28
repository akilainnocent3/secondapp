package com.sportybet.android.transaction.ui.txdetails;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.pay.pix.data.dto.PixQrInfo;
import com.sporty.android.core.model.pocket.common.PLAOperatorBOConfig;
import com.sporty.android.core.model.pocket.transaction.RollbackDetail;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeActivity;
import com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;
import com.sportybet.android.widget.HintView;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.d900;
import defpackage.dq7;
import defpackage.e5h0;
import defpackage.e6m;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.lyh;
import defpackage.m1h0;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.psm;
import defpackage.pu0;
import defpackage.pwx;
import defpackage.qtr;
import defpackage.r8i0;
import defpackage.rx90;
import defpackage.s3h0;
import defpackage.s8i0;
import defpackage.t;
import defpackage.u700;
import defpackage.uqm;
import defpackage.uy0;
import defpackage.v4h0;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.w4h0;
import defpackage.wae;
import defpackage.x4h0;
import defpackage.xym;
import defpackage.z4h0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public class TxDetailsActivity extends e6m implements pwx, View.OnClickListener, vym, bb40, xym {
    public static final /* synthetic */ int D0 = 0;
    public HintView A;
    public TextView A0;
    public TextView B;
    public TextView B0;
    public TextView C;
    public TextView C0;
    public View D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public TextView X;
    public ComposeView Y;
    public TextView Z;
    public TextView a0;
    public TextView b0;
    public psm c;
    public View c0;
    public d0n d;
    public TextView d0;
    public uqm e;
    public TextView e0;
    public e f;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public azm i;
    public TextView i0;
    public TextView j0;
    public qtr k0;
    public View l0;
    public TextView m0;
    public TextView n0;
    public TextView o0;
    public TextView p0;
    public TextView q0;
    public ComposeView s0;
    public LoadingViewNew t0;
    public LoadingViewNew u0;
    public uy0 v;
    public ComposeView v0;
    public d900 w;
    public ComposeView w0;
    public TextView x0;
    public u700 y;
    public e5h0 y0;
    public SwipeRefreshLayout z;
    public View z0;
    public final SimpleDateFormat b = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.US);
    public boolean r0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.goback) {
            if (id == R.id.request_details) {
                Bundle bundle = new Bundle();
                bundle.putString("tradeId", this.Q.getText().toString());
                this.i.e(wae.REQUEST_DETAILS, bundle);
                return;
            }
            return;
        }
        s3h0 s3h0Var = (s3h0) this.y0.J.d();
        Transaction transaction = s3h0Var != null ? s3h0Var.a : null;
        String str = transaction != null ? transaction.tradeId : null;
        if (str != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_TRADE_ID", str);
            intent.putExtra("EXTRA_FINAL_STATUS", transaction.status);
            intent.putExtra("EXTRA_AMOUNT_SIGN", transaction.amountSign);
            setResult(1, intent);
        }
        finish();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_transaction_details);
        String stringExtra = getIntent().getStringExtra("data");
        int intExtra = getIntent().getIntExtra("isHistory", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra == -1) {
            finish();
            return;
        }
        findViewById(R.id.goback).setOnClickListener(this);
        this.B = (TextView) findViewById(R.id.trans_no_label);
        this.C = (TextView) findViewById(R.id.transaction);
        this.A = (HintView) findViewById(R.id.hint_view);
        this.D = findViewById(R.id.rollback_container);
        this.E = (TextView) findViewById(R.id.amount);
        this.F = (TextView) findViewById(R.id.amount_label);
        this.G = (TextView) findViewById(R.id.fee);
        this.H = (TextView) findViewById(R.id.fee_label);
        this.I = (TextView) findViewById(R.id.status);
        this.J = (TextView) findViewById(R.id.time);
        this.K = (TextView) findViewById(R.id.type);
        this.L = (TextView) findViewById(R.id.tx_source_target);
        this.M = (TextView) findViewById(R.id.tx_source_target_label);
        this.N = (TextView) findViewById(R.id.order);
        this.O = (TextView) findViewById(R.id.order_label);
        this.P = (TextView) findViewById(R.id.trade_no_label);
        this.Q = (TextView) findViewById(R.id.trade);
        this.R = (TextView) findViewById(R.id.session_label);
        this.S = (TextView) findViewById(R.id.session_id);
        this.T = (TextView) findViewById(R.id.balance_label);
        this.U = (TextView) findViewById(R.id.balance);
        this.V = (TextView) findViewById(R.id.initial_balance_label);
        this.W = (TextView) findViewById(R.id.initial_balance_content);
        this.X = (TextView) findViewById(R.id.reason);
        this.Y = (ComposeView) findViewById(R.id.contact_compose);
        this.d0 = (TextView) findViewById(R.id.game_id);
        this.e0 = (TextView) findViewById(R.id.rollback_time);
        this.f0 = (TextView) findViewById(R.id.home);
        this.g0 = (TextView) findViewById(R.id.away);
        this.h0 = (TextView) findViewById(R.id.market);
        this.i0 = (TextView) findViewById(R.id.selection);
        this.j0 = (TextView) findViewById(R.id.result);
        this.l0 = findViewById(R.id.manual_hint);
        this.m0 = (TextView) findViewById(R.id.manual_hint_text);
        TextView textView = (TextView) findViewById(R.id.manual_hint_btn);
        this.n0 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: g1h0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Transaction transaction;
                String str;
                int i = TxDetailsActivity.D0;
                e5h0 e5h0Var = this.a.y0;
                Object value = e5h0Var.I.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                if (cVar == null || (transaction = (Transaction) cVar.a) == null || (str = transaction.tradeId) == null) {
                    return;
                }
                ej5.c(o8i0.d(e5h0Var), null, null, new u4h0(e5h0Var, str, null), 3);
            }
        });
        this.o0 = (TextView) findViewById(R.id.recipient_label);
        this.p0 = (TextView) findViewById(R.id.recipient);
        this.c0 = findViewById(R.id.request_details_divider);
        TextView textView2 = (TextView) findViewById(R.id.request_details);
        this.b0 = textView2;
        textView2.setOnClickListener(this);
        this.k0 = qtr.a(findViewById(R.id.trans_details_grey_container));
        this.Z = (TextView) findViewById(R.id.barcode_label);
        this.a0 = (TextView) findViewById(R.id.barcode_btn);
        this.q0 = (TextView) findViewById(R.id.time_label);
        findViewById(R.id.home_icon).setOnClickListener(new View.OnClickListener() { // from class: k1h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TxDetailsActivity.D0;
                this.a.i.d(wae.HOME);
            }
        });
        ComposeView composeView = (ComposeView) findViewById(R.id.init_mask);
        this.s0 = composeView;
        composeView.getClass();
        int i = 1;
        composeView.setContent(new op8(162721706, new rx90(), true));
        LoadingViewNew loadingViewNew = (LoadingViewNew) findViewById(R.id.init_failed_mask);
        this.t0 = loadingViewNew;
        loadingViewNew.setOnClickListener(new View.OnClickListener() { // from class: l1h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = TxDetailsActivity.D0;
                e5h0 e5h0Var = this.a.y0;
                e5h0Var.getClass();
                ej5.c(o8i0.d(e5h0Var), null, null, new a5h0(e5h0Var, null), 3);
            }
        });
        LoadingViewNew loadingViewNew2 = (LoadingViewNew) findViewById(R.id.loading_mask);
        this.u0 = loadingViewNew2;
        loadingViewNew2.setOnClickListener(new m1h0());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_layout);
        this.z = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: n1h0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() {
                int i2 = TxDetailsActivity.D0;
                e5h0 e5h0Var = this.a.y0;
                e5h0Var.getClass();
                ej5.c(o8i0.d(e5h0Var), null, null, new a5h0(e5h0Var, null), 3);
            }
        });
        this.v0 = (ComposeView) findViewById(R.id.hubtech_additional_info_view);
        this.w0 = (ComposeView) findViewById(R.id.bet_additional_info_view);
        this.x0 = (TextView) findViewById(R.id.betslip_info_view);
        this.z0 = findViewById(R.id.winning_tax_layout);
        this.A0 = (TextView) findViewById(R.id.winnings_tax_label);
        this.B0 = (TextView) findViewById(R.id.winnings_tax_amount);
        this.C0 = (TextView) findViewById(R.id.net_payout_amount);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(e5h0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        e5h0 e5h0Var = (e5h0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.y0 = e5h0Var;
        e5h0Var.w.f(this, new lfy() { // from class: o1h0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = TxDetailsActivity.D0;
                TxDetailsActivity txDetailsActivity = this.a;
                txDetailsActivity.f.c((a) obj, txDetailsActivity, txDetailsActivity.findViewById(R.id.root), null);
            }
        });
        this.y0.B.f(this, new lfy() { // from class: p1h0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = TxDetailsActivity.D0;
                this.a.z.setRefreshing(((tzs) obj) instanceof tzs.b);
            }
        });
        this.y0.z.f(this, new lfy() { // from class: q1h0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                wgn wgnVar = (wgn) obj;
                int i2 = TxDetailsActivity.D0;
                boolean z = wgnVar instanceof wgn.c;
                TxDetailsActivity txDetailsActivity = this.a;
                if (z) {
                    txDetailsActivity.s0.setVisibility(0);
                    txDetailsActivity.t0.setVisibility(8);
                } else if (wgnVar instanceof wgn.b) {
                    txDetailsActivity.s0.setVisibility(8);
                    txDetailsActivity.t0.setVisibility(8);
                } else if (wgnVar instanceof wgn.a) {
                    txDetailsActivity.s0.setVisibility(0);
                    txDetailsActivity.t0.c(((wgn.a) wgnVar).a.e(txDetailsActivity));
                }
            }
        });
        this.y0.D.f(this, new lfy() { // from class: r1h0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = TxDetailsActivity.D0;
                this.a.u0.setVisibility(((tzs) obj) instanceof tzs.b ? 0 : 8);
            }
        });
        this.y0.J.f(this, new lfy() { // from class: s1h0
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:108:0x033f  */
            /* JADX WARN: Code duplicated, block: B:56:0x01d4  */
            /* JADX WARN: Code duplicated, block: B:66:0x0259  */
            /* JADX WARN: Code duplicated, block: B:80:0x027e  */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String cMSString;
                int i2;
                int i3;
                int i4;
                String cMSString2;
                int i5;
                int i6;
                int i7;
                int i8;
                String strF0;
                String cMSString3;
                s3h0 s3h0Var = (s3h0) obj;
                int i9 = TxDetailsActivity.D0;
                final TxDetailsActivity txDetailsActivity = this.a;
                SimpleDateFormat simpleDateFormat = txDetailsActivity.b;
                Locale locale = Locale.US;
                final Transaction transaction = s3h0Var.a;
                final PLAOperatorBOConfig pLAOperatorBOConfig = s3h0Var.d;
                final f1h0 f1h0Var = s3h0Var.c;
                boolean z = s3h0Var.e;
                boolean z2 = s3h0Var.f;
                txDetailsActivity.r0 = transaction.showFixStatus;
                i2i.b(txDetailsActivity.v.h(pu0.c.a)).f(txDetailsActivity, new lfy() { // from class: i1h0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.lfy
                    public final void u1(Object obj2) {
                        String cMSString4;
                        String cMSString5;
                        lk50 lk50Var = (lk50) obj2;
                        int i10 = TxDetailsActivity.D0;
                        if (lk50Var instanceof lk50.c) {
                            int i11 = ((AssetsInfo) ((lk50.c) lk50Var).a).auditStatus;
                            boolean zIsEmpty = TextUtils.isEmpty(transaction.comment);
                            TxDetailsActivity txDetailsActivity2 = txDetailsActivity;
                            if (!zIsEmpty) {
                                txDetailsActivity2.k0.a.setVisibility(8);
                                return;
                            }
                            if (i11 != 11 && i11 != 12 && i11 != 13) {
                                txDetailsActivity2.k0.a.setVisibility(8);
                                return;
                            }
                            txDetailsActivity2.k0.a.setVisibility(0);
                            String cMSString6 = null;
                            switch (i11) {
                                case 11:
                                    cMSString6 = txDetailsActivity2.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]);
                                    cMSString4 = txDetailsActivity2.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_tip, new Object[0]);
                                    cMSString5 = txDetailsActivity2.getCMSString(R.string.identity_verification__verify, new Object[0]);
                                    txDetailsActivity2.k0.d.setOnClickListener(new t1h0(txDetailsActivity2));
                                    break;
                                case 12:
                                    String str = txDetailsActivity2.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]) + "(" + txDetailsActivity2.getCMSString(R.string.page_transaction__pending_verification, new Object[0]) + ")";
                                    String cMSString7 = txDetailsActivity2.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip, new Object[0]);
                                    txDetailsActivity2.k0.d.setVisibility(8);
                                    txDetailsActivity2.k0.d.setOnClickListener(null);
                                    cMSString6 = str;
                                    cMSString4 = cMSString7;
                                    cMSString5 = null;
                                    break;
                                case 13:
                                    cMSString6 = txDetailsActivity2.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]) + "(" + txDetailsActivity2.getCMSString(R.string.page_payment__verification_failed, new Object[0]) + ")";
                                    cMSString4 = txDetailsActivity2.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip, new Object[0]);
                                    cMSString5 = txDetailsActivity2.getCMSString(R.string.common_functions__contact_us, new Object[0]);
                                    txDetailsActivity2.k0.d.setOnClickListener(new u1h0(txDetailsActivity2));
                                    break;
                                default:
                                    txDetailsActivity2.k0.a.setVisibility(8);
                                    cMSString4 = null;
                                    cMSString5 = null;
                                    break;
                            }
                            txDetailsActivity2.k0.c.setText(cMSString6);
                            txDetailsActivity2.k0.b.setText(cMSString4);
                            txDetailsActivity2.k0.d.setText(cMSString5);
                        }
                    }
                });
                boolean zIsEmpty = TextUtils.isEmpty(transaction.comment);
                HintView hintView = txDetailsActivity.A;
                if (zIsEmpty) {
                    hintView.setVisibility(8);
                } else {
                    hintView.setHint(transaction.comment);
                    txDetailsActivity.A.setVisibility(0);
                }
                if (TextUtils.isEmpty(transaction.payChTxId)) {
                    txDetailsActivity.C.setVisibility(8);
                    txDetailsActivity.B.setVisibility(8);
                } else {
                    txDetailsActivity.B.setText(txDetailsActivity.getCMSString(R.string.page_transaction__transaction_no, new Object[0]));
                    txDetailsActivity.B.setVisibility(0);
                    txDetailsActivity.C.setVisibility(0);
                    txDetailsActivity.C.setText(transaction.payChTxId);
                }
                if (TextUtils.isEmpty(transaction.orderId)) {
                    txDetailsActivity.N.setVisibility(8);
                    txDetailsActivity.O.setVisibility(8);
                } else {
                    if (!(f1h0Var.a instanceof q8h0.a) && txDetailsActivity.N != null && !f1h0Var.b.isEmpty()) {
                        TextView textView3 = txDetailsActivity.N;
                        textView3.setTextColor(textView3.getContext().getColor(R.color.brand_secondary));
                        txDetailsActivity.N.setOnClickListener(new View.OnClickListener() { // from class: j1h0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Intent intentB;
                                int i10 = TxDetailsActivity.D0;
                                new Intent();
                                f1h0 f1h0Var2 = f1h0Var;
                                q8h0 q8h0Var = f1h0Var2.a;
                                String str = f1h0Var2.b;
                                boolean z3 = q8h0Var instanceof r8h0;
                                TxDetailsActivity txDetailsActivity2 = txDetailsActivity;
                                if (z3) {
                                    intentB = txDetailsActivity2.y.a(txDetailsActivity2, str);
                                } else if (q8h0Var instanceof s8h0) {
                                    intentB = txDetailsActivity2.y.b(((s8h0) q8h0Var).a, txDetailsActivity2, str);
                                } else if (!(q8h0Var instanceof q8h0.b)) {
                                    return;
                                } else {
                                    intentB = txDetailsActivity2.w.b(txDetailsActivity2, str);
                                }
                                intentB.addFlags(65536);
                                txDetailsActivity2.startActivity(intentB);
                            }
                        });
                    }
                    txDetailsActivity.N.setText(transaction.orderId);
                    txDetailsActivity.N.setVisibility(0);
                    txDetailsActivity.O.setVisibility(0);
                }
                boolean zR = txDetailsActivity.c.r();
                TextView textView4 = txDetailsActivity.F;
                psm psmVar = txDetailsActivity.c;
                if (zR) {
                    textView4.setText(txDetailsActivity.getCMSString(R.string.common_functions__amount_label, psmVar.f()));
                } else {
                    textView4.setText(txDetailsActivity.getCMSString(R.string.common_functions__amount_label, psmVar.B()));
                }
                long j = transaction.amount;
                if (transaction.feeAmount != 0) {
                    j = transaction.initAmount;
                }
                int i10 = transaction.amountSign;
                if (i10 == 1 && j != 0) {
                    int color = txDetailsActivity.E.getContext().getColor(R.color.brand_quaternary);
                    txDetailsActivity.E.setText(txDetailsActivity.getCMSString(R.string.page_transaction__plus_amount, bjb0.U(j, locale)));
                    txDetailsActivity.E.setTextColor(color);
                } else if (i10 != 2 || j == 0) {
                    int color2 = txDetailsActivity.E.getContext().getColor(R.color.text_type1_primary);
                    txDetailsActivity.E.setText(bjb0.U(j, locale));
                    txDetailsActivity.E.setTextColor(color2);
                } else {
                    int color3 = txDetailsActivity.E.getContext().getColor(R.color.text_type1_secondary);
                    txDetailsActivity.E.setText(txDetailsActivity.getCMSString(R.string.page_transaction__neg_amount, bjb0.U(j, locale)));
                    txDetailsActivity.E.setTextColor(color3);
                }
                long j2 = transaction.feeAmount;
                TextView textView5 = txDetailsActivity.G;
                if (j2 == 0) {
                    textView5.setVisibility(8);
                    txDetailsActivity.H.setVisibility(8);
                } else {
                    textView5.setVisibility(0);
                    txDetailsActivity.H.setVisibility(0);
                    txDetailsActivity.G.setText(txDetailsActivity.getCMSString(R.string.page_transaction__neg_amount, bjb0.U(transaction.feeAmount, locale)));
                }
                int i11 = transaction.status;
                if (i11 != 10) {
                    if (i11 == 20) {
                        i2 = 0;
                        txDetailsActivity.I.setTextColor(txDetailsActivity.I.getContext().getColor(R.color.text_type1_primary));
                        cMSString = txDetailsActivity.getCMSString(R.string.page_transaction__succeed, new Object[0]);
                    } else if (i11 == 30) {
                        i2 = 0;
                        int color4 = txDetailsActivity.I.getContext().getColor(R.color.text_type1_secondary);
                        cMSString3 = txDetailsActivity.getCMSString(R.string.page_transaction__failed, new Object[0]);
                        txDetailsActivity.I.setTextColor(color4);
                        cMSString = cMSString3;
                    } else if (i11 == 90) {
                        int color5 = txDetailsActivity.I.getContext().getColor(R.color.text_type1_secondary);
                        i2 = 0;
                        cMSString3 = txDetailsActivity.getCMSString(R.string.page_transaction__closed, new Object[0]);
                        txDetailsActivity.I.setTextColor(color5);
                        cMSString = cMSString3;
                    } else if (i11 == 33 || i11 == 34) {
                        i2 = 0;
                        int color6 = txDetailsActivity.I.getContext().getColor(R.color.text_type1_secondary);
                        cMSString3 = txDetailsActivity.getCMSString(R.string.page_transaction__failed, new Object[0]);
                        txDetailsActivity.I.setTextColor(color6);
                        cMSString = cMSString3;
                    } else {
                        cMSString = "";
                        i3 = 1;
                        i2 = 0;
                    }
                    i3 = 1;
                } else {
                    cMSString = txDetailsActivity.getCMSString(R.string.page_transaction__pending, new Object[0]);
                    txDetailsActivity.I.setTextColor(txDetailsActivity.I.getContext().getColor(R.color.warning_primary));
                    if (!TextUtils.isEmpty(transaction.auditStatus)) {
                        String str = transaction.auditStatus;
                        str.getClass();
                        switch (str) {
                            case "11":
                                i2 = 0;
                                cMSString = txDetailsActivity.getCMSString(R.string.page_transaction__withdrawals_blocked, new Object[0]);
                                break;
                            case "12":
                                i2 = 0;
                                cMSString = txDetailsActivity.getCMSString(R.string.page_transaction__pending_verification, new Object[0]);
                                break;
                            case "13":
                                i2 = 0;
                                cMSString = txDetailsActivity.getCMSString(R.string.page_transaction__verification_failed, new Object[0]);
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        i2 = 0;
                    }
                    i3 = i2;
                }
                txDetailsActivity.I.setText(cMSString);
                boolean z3 = txDetailsActivity.r0;
                View view = txDetailsActivity.l0;
                if (z3) {
                    view.setVisibility(i2);
                    String str2 = transaction.fixStatusMsg;
                    TextView textView6 = txDetailsActivity.m0;
                    if (str2 != null) {
                        textView6.setText(str2);
                    } else {
                        textView6.setText(txDetailsActivity.getCMSString(R.string.page_transaction__deposit_status_incorrect, new Object[i2]));
                    }
                    i4 = 8;
                } else {
                    i4 = 8;
                    view.setVisibility(8);
                }
                boolean zIsEmpty2 = TextUtils.isEmpty(transaction.reason);
                TextView textView7 = txDetailsActivity.X;
                if (zIsEmpty2) {
                    textView7.setVisibility(i4);
                } else {
                    textView7.setVisibility(i2);
                    txDetailsActivity.X.setText(transaction.reason);
                }
                txDetailsActivity.J.setText(simpleDateFormat.format(new Date(transaction.createTime)));
                txDetailsActivity.K.setText(transaction.trade_refine);
                String str3 = transaction.tradeCode;
                txDetailsActivity.M.setVisibility(0);
                txDetailsActivity.L.setVisibility(0);
                if (TextUtils.isEmpty(transaction.counterFull)) {
                    cMSString2 = (TextUtils.isEmpty(transaction.counterAuthority) || TextUtils.isEmpty(transaction.counterpart)) ? null : txDetailsActivity.getCMSString(R.string.page_transaction__paystack, transaction.counterAuthority, transaction.counterpart);
                } else {
                    cMSString2 = transaction.counterFull;
                }
                str3.getClass();
                switch (str3) {
                    case "RB0001":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_payment__deposit_from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__sportybet_exclusive_offer, new Object[0]));
                        i7 = i3;
                        break;
                    case "RF0001":
                    case "RF0002":
                    case "RF0003":
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_transaction__refundto, new Object[0]));
                        int i12 = transaction.payChId;
                        c100 c100Var = c100.e;
                        if (i12 == 0) {
                            txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__balance, new Object[0]) + txDetailsActivity.getCMSString(R.string.app_common__blank_space, new Object[0]));
                        } else if (i12 == 10) {
                            txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__mpesa, transaction.counterpart));
                        } else {
                            txDetailsActivity.M.setVisibility(8);
                            txDetailsActivity.L.setVisibility(8);
                        }
                        i5 = 0;
                        i7 = i3;
                        break;
                    case "TF0001":
                        int i13 = transaction.payAction;
                        txDetailsActivity.M.setVisibility(8);
                        txDetailsActivity.L.setVisibility(8);
                        if (i13 == 30) {
                            txDetailsActivity.o0.setText(txDetailsActivity.getCMSString(R.string.page_transaction__transfer_to, new Object[0]));
                            TextView textView8 = txDetailsActivity.p0;
                            StringBuilder sb = new StringBuilder("+");
                            sb.append(transaction.recipientPhoneCountryCode);
                            sb.append(" ");
                            zug.b(sb, transaction.recipientPhone, textView8);
                            i6 = 0;
                            txDetailsActivity.o0.setVisibility(0);
                            txDetailsActivity.p0.setVisibility(0);
                        } else {
                            i6 = 0;
                            if (i13 == 32) {
                                txDetailsActivity.o0.setText(txDetailsActivity.getCMSString(R.string.page_transaction__transfer_from, new Object[0]));
                                TextView textView9 = txDetailsActivity.p0;
                                StringBuilder sb2 = new StringBuilder("+");
                                sb2.append(transaction.supporterPhoneCountryCode);
                                sb2.append(" ");
                                zug.b(sb2, transaction.supporterPhone, textView9);
                                i6 = 0;
                                txDetailsActivity.o0.setVisibility(0);
                                txDetailsActivity.p0.setVisibility(0);
                            }
                        }
                        i5 = i6;
                        i7 = i3;
                        break;
                    case "TF0005":
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_transaction__deposit_from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__partner_amount, transaction.counterpart));
                        i5 = 0;
                        i7 = i3;
                        break;
                    case "TF0007":
                        i6 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_transaction__deposit_from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__sporty_coins, new Object[0]));
                        txDetailsActivity.B.setVisibility(8);
                        txDetailsActivity.C.setVisibility(8);
                        i5 = i6;
                        i7 = i3;
                        break;
                    case "WD0001":
                        i6 = 0;
                        TextView textView10 = txDetailsActivity.M;
                        if (cMSString2 != null) {
                            textView10.setText(txDetailsActivity.getCMSString(R.string.page_transaction__withdraw_to, new Object[0]));
                            txDetailsActivity.L.setText(cMSString2);
                        } else {
                            textView10.setVisibility(8);
                            txDetailsActivity.L.setVisibility(8);
                        }
                        i5 = i6;
                        i7 = i3;
                        break;
                    case "WD0003":
                        i7 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_withdraw__withdraw_to, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__offline, new Object[0]));
                        i5 = 0;
                        break;
                    case "WD0004":
                        i6 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_withdraw__withdraw_to, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__partner_amount, transaction.counterpart));
                        int i14 = transaction.status;
                        TextView textView11 = txDetailsActivity.H;
                        if (i14 == 20) {
                            textView11.setVisibility(0);
                            txDetailsActivity.G.setVisibility(0);
                            txDetailsActivity.H.setText(txDetailsActivity.getCMSString(R.string.page_withdraw__commission_to_partner, new Object[0]));
                        } else {
                            textView11.setVisibility(8);
                            txDetailsActivity.G.setVisibility(8);
                        }
                        txDetailsActivity.b0.setVisibility(0);
                        txDetailsActivity.c0.setVisibility(0);
                        i5 = i6;
                        i7 = i3;
                        break;
                    case "WT0001":
                        txDetailsActivity.M.setVisibility(8);
                        txDetailsActivity.L.setVisibility(8);
                        txDetailsActivity.P.setVisibility(8);
                        txDetailsActivity.Q.setVisibility(8);
                        txDetailsActivity.T.setVisibility(8);
                        txDetailsActivity.U.setVisibility(8);
                        i5 = 0;
                        i7 = i3;
                        break;
                    case "AD0001":
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_transaction__transfer_from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__operator, new Object[0]));
                        i5 = 0;
                        i7 = i3;
                        break;
                    case "AD0002":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.page_transaction__transfer_to, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__operator, new Object[0]));
                        i7 = i3;
                        break;
                    case "CB0003":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.common_functions__from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__offline, new Object[0]));
                        i7 = 0;
                        break;
                    case "CB0005":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.common_functions__from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.common_functions__bookmaker, new Object[0]));
                        i7 = i3;
                        break;
                    case "CB0006":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.common_functions__from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__bookmaker_compensation_brackets, new Object[0]));
                        i7 = i3;
                        break;
                    case "CB0007":
                        i5 = 0;
                        txDetailsActivity.M.setText(txDetailsActivity.getCMSString(R.string.common_functions__from, new Object[0]));
                        txDetailsActivity.L.setText(txDetailsActivity.getCMSString(R.string.page_transaction__sportybet_exclusive_offer, new Object[0]));
                        i7 = i3;
                        break;
                    case "DP0001":
                        TextView textView12 = txDetailsActivity.M;
                        if (cMSString2 != null) {
                            textView12.setText(txDetailsActivity.getCMSString(R.string.page_transaction__deposit_from, new Object[0]));
                            txDetailsActivity.L.setText(cMSString2);
                        } else {
                            textView12.setVisibility(8);
                            txDetailsActivity.L.setVisibility(8);
                        }
                        int i15 = transaction.payChId;
                        c100 c100Var2 = c100.e;
                        if (i15 == 32001) {
                            PixQrInfo pixQrInfo = transaction.pix;
                            if ((pixQrInfo == null ? null : pixQrInfo.getQrCode()) != null) {
                                int i16 = transaction.status;
                                TextView textView13 = txDetailsActivity.a0;
                                if (i16 == 10) {
                                    textView13.setVisibility(0);
                                    txDetailsActivity.Z.setVisibility(0);
                                    txDetailsActivity.a0.setOnClickListener(new View.OnClickListener() { // from class: h1h0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i17 = TxDetailsActivity.D0;
                                            Transaction transaction2 = transaction;
                                            int i18 = transaction2.payChId;
                                            c100 c100Var3 = c100.e;
                                            if (i18 == 32001) {
                                                String str4 = transaction2.tradeId;
                                                PixQrInfo pixQrInfo2 = transaction2.pix;
                                                String qrCode = pixQrInfo2 == null ? null : pixQrInfo2.getQrCode();
                                                String strValueOf = String.valueOf(transaction2.amount);
                                                str4.getClass();
                                                qrCode.getClass();
                                                strValueOf.getClass();
                                                TxDetailsActivity txDetailsActivity2 = txDetailsActivity;
                                                Intent intent = new Intent(txDetailsActivity2, (Class<?>) PixBtgQrCodeActivity.class);
                                                intent.putExtra("PIX_QR_CODE_PARAMS_KEY", new PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams(str4, qrCode, strValueOf, null, null));
                                                txDetailsActivity2.startActivity(intent);
                                            }
                                        }
                                    });
                                } else {
                                    textView13.setVisibility(8);
                                    txDetailsActivity.Z.setVisibility(8);
                                }
                            }
                        }
                        i5 = 0;
                        i7 = i3;
                        break;
                    case "FE0001":
                        i6 = 0;
                        txDetailsActivity.b0.setVisibility(0);
                        txDetailsActivity.c0.setVisibility(0);
                        txDetailsActivity.M.setVisibility(8);
                        txDetailsActivity.L.setVisibility(8);
                        i5 = i6;
                        i7 = i3;
                        break;
                    default:
                        txDetailsActivity.M.setVisibility(8);
                        txDetailsActivity.L.setVisibility(8);
                        i5 = 0;
                        i7 = i3;
                        break;
                }
                if (transaction.bizType == 4) {
                    txDetailsActivity.B.setVisibility(i5);
                    txDetailsActivity.C.setVisibility(i5);
                    txDetailsActivity.B.setText(txDetailsActivity.getCMSString(R.string.jackpot__round_no_dot, new Object[i5]));
                    txDetailsActivity.C.setText(transaction.goodsName);
                }
                txDetailsActivity.Q.setText(transaction.tradeId);
                if (i7 != 0) {
                    txDetailsActivity.U.setText(bjb0.U(transaction.afterBal, locale));
                }
                if (!z || i7 == 0) {
                    i8 = 8;
                    txDetailsActivity.V.setVisibility(8);
                    txDetailsActivity.W.setVisibility(8);
                } else {
                    txDetailsActivity.V.setVisibility(0);
                    txDetailsActivity.W.setVisibility(0);
                    Long l = transaction.initBal;
                    if (l != null) {
                        txDetailsActivity.W.setText(bjb0.U(l.longValue(), locale));
                    }
                    i8 = 8;
                }
                View view2 = txDetailsActivity.z0;
                if (z2) {
                    view2.setVisibility(0);
                    String cMSString4 = txDetailsActivity.getCMSString(R.string.page_transaction__neg_amount, bjb0.U(transaction.taxedAmount, locale));
                    String cMSString5 = txDetailsActivity.getCMSString(R.string.page_transaction__plus_amount, bjb0.U(transaction.taxAmount, locale));
                    try {
                        strF0 = bjb0.f0(transaction.taxPercentage);
                    } catch (Exception unused) {
                        strF0 = "0";
                    }
                    txDetailsActivity.A0.setText(txDetailsActivity.getCMSString(R.string.page_transaction__winnings_tax, strF0));
                    txDetailsActivity.B0.setText(cMSString4);
                    txDetailsActivity.C0.setText(cMSString5);
                } else {
                    view2.setVisibility(i8);
                }
                RollbackDetail rollbackDetail = transaction.rollbackDetail;
                View view3 = txDetailsActivity.D;
                if (rollbackDetail != null) {
                    view3.setVisibility(0);
                    RollbackDetail rollbackDetail2 = transaction.rollbackDetail;
                    txDetailsActivity.d0.setText(rollbackDetail2.gameId);
                    txDetailsActivity.e0.setText(simpleDateFormat.format(new Date(rollbackDetail2.rollbackTime)));
                    txDetailsActivity.f0.setText(rollbackDetail2.home);
                    txDetailsActivity.g0.setText(rollbackDetail2.away);
                    txDetailsActivity.h0.setText(rollbackDetail2.market);
                    txDetailsActivity.i0.setText(rollbackDetail2.selection);
                    txDetailsActivity.j0.setText(rollbackDetail2.betStatus);
                } else {
                    view3.setVisibility(8);
                }
                if (txDetailsActivity.c.n() && ger.a(transaction.tradeCode) && !TextUtils.isEmpty(transaction.sessionId)) {
                    txDetailsActivity.R.setVisibility(0);
                    txDetailsActivity.S.setText(transaction.sessionId);
                    txDetailsActivity.S.setVisibility(0);
                } else {
                    txDetailsActivity.R.setVisibility(8);
                    txDetailsActivity.S.setVisibility(8);
                }
                ComposeView composeView2 = txDetailsActivity.Y;
                u6i0.a aVar = u6i0.a.a;
                composeView2.setViewCompositionStrategy(aVar);
                ComposeView composeView3 = txDetailsActivity.Y;
                final x0h0 x0h0VarB = as1.b(txDetailsActivity, txDetailsActivity.c.c0(), txDetailsActivity.c.L());
                int i17 = 1;
                final nbw nbwVar = new nbw(txDetailsActivity, i17);
                final r3n r3nVar = new r3n(txDetailsActivity, i17);
                composeView3.getClass();
                composeView3.setContent(new op8(201802853, new Function2() { // from class: d1h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final x0h0 x0h0Var = x0h0VarB;
                            final nbw nbwVar2 = nbwVar;
                            final r3n r3nVar2 = r3nVar;
                            or0.a(null, false, false, null, pp8.b(717198446, new Function2() { // from class: e1h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        z2h0.a(j.A(d.a.b, null, 3), x0h0Var, nbwVar2, r3nVar2, aVar3, 6);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 24576);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, true));
                if (txDetailsActivity.c.O() && transaction.bizType == 131 && transaction.additionalInfo != null) {
                    txDetailsActivity.v0.setVisibility(0);
                    txDetailsActivity.v0.setViewCompositionStrategy(aVar);
                    ComposeView composeView4 = txDetailsActivity.v0;
                    composeView4.getClass();
                    composeView4.setContent(new op8(-2127272379, new Function2() { // from class: lqm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Transaction transaction2 = transaction;
                                final PLAOperatorBOConfig pLAOperatorBOConfig2 = pLAOperatorBOConfig;
                                or0.a(null, false, false, null, pp8.b(1682419982, new Function2() { // from class: mqm
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Object[] objArr = new Object[0];
                                            Object objY = aVar3.y();
                                            if (objY == androidx.compose.runtime.a.C0041a.a) {
                                                objY = new nqm(0);
                                                aVar3.r(objY);
                                            }
                                            sqm.a((ytw) o350.e(objArr, (Function0) objY, aVar3, 48), transaction2, pLAOperatorBOConfig2, aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 24576);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                if (txDetailsActivity.c.O() && (ay0.V(new Integer[]{105, 106, 108, 112, 113, 115, 121, 122, 123, 130, 133, 134, 138, 2000, 1000, Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 2001, 2002, 1003, 1004, 2003, 2005, 1002, Integer.valueOf(WebSocketProtocol.CLOSE_NO_STATUS_CODE), 1006, 1007, 2006, 2004, 1008, 161, 2007, 2008, 166, 3000, 170, 2010, 2009, 3001, 2011}).contains(Integer.valueOf(transaction.bizType)) || ay0.V(new Integer[]{107, 116, 125, 132, 135}).contains(Integer.valueOf(transaction.bizType)))) {
                    txDetailsActivity.J.setVisibility(8);
                    txDetailsActivity.q0.setVisibility(8);
                    txDetailsActivity.x0.setVisibility(0);
                    txDetailsActivity.x0.setText(txDetailsActivity.getCMSString(R.string.page_transaction__relevant_information, new Object[0]) + " " + txDetailsActivity.getCMSString(R.string.page_transaction__relevant_information_value, new Object[0]));
                    txDetailsActivity.w0.setVisibility(0);
                    txDetailsActivity.w0.setViewCompositionStrategy(aVar);
                    ComposeView composeView5 = txDetailsActivity.w0;
                    final String userId = txDetailsActivity.e.getUserId();
                    composeView5.getClass();
                    userId.getClass();
                    composeView5.setContent(new op8(-1298488200, new Function2() { // from class: be2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Transaction transaction2 = transaction;
                                final PLAOperatorBOConfig pLAOperatorBOConfig2 = pLAOperatorBOConfig;
                                final String str4 = userId;
                                or0.a(null, false, false, null, pp8.b(903086095, new Function2() { // from class: ce2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            fe2.a(transaction2, pLAOperatorBOConfig2, str4, aVar3, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 24576);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                txDetailsActivity.K.setText(s3h0Var.b.e(txDetailsActivity));
            }
        });
        this.y0.K.f(this, new t(this, i));
        e5h0 e5h0Var2 = this.y0;
        e5h0Var2.getClass();
        stringExtra.getClass();
        e5h0Var2.f = stringExtra;
        e5h0Var2.i = intExtra;
        kzh.d(new g1i(new v4h0((lyh[]) CollectionsKt.A0(e5h0Var2.L).toArray(new lyh[0])), new w4h0(e5h0Var2, null)), o8i0.d(e5h0Var2));
        kzh.d(new g1i(e5h0Var2.c.k(), new x4h0(e5h0Var2, null)), o8i0.d(e5h0Var2));
        b.k(ej5.c(o8i0.d(e5h0Var2), null, null, new z4h0(e5h0Var2, null), 3), kzh.d(e5h0Var2.b.a(pu0.c.a), o8i0.d(e5h0Var2)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.f.a();
        super.onDestroy();
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
}
