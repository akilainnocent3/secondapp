package com.sportybet.android.kepay;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.a;
import com.sportybet.android.gp.tz.R;
import defpackage.a8b;
import defpackage.aqg0;
import defpackage.k9j;
import defpackage.o7d;
import defpackage.sh8;
import defpackage.uy0;
import defpackage.v5m;
import defpackage.vym;
import defpackage.wae;
import defpackage.y8j;
import defpackage.zug;

/* JADX INFO: loaded from: classes.dex */
public class TransactionSuccessfulActivity extends v5m implements View.OnClickListener, vym, k9j {
    public uy0 b;
    public y8j c;
    public String d;
    public String e;
    public String f;
    public String i;
    public String v;
    public int w;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.check_status) {
            if (id == R.id.done_btn) {
                finish();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        int i = this.w;
        if (i == 1) {
            bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        } else if (i == 2 || i == 3) {
            bundle.putInt("key_param_tx_category", aqg0.j.c.a);
        }
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        finish();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.transaction_successful);
        this.d = getIntent().getStringExtra("trade_id");
        this.e = getIntent().getStringExtra("phone_number");
        this.f = getIntent().getStringExtra("trade_amount");
        this.w = getIntent().getIntExtra("transaction_type", -1);
        this.i = getIntent().getStringExtra("withdraw_fee");
        this.v = getIntent().getStringExtra("channel_icon_url");
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || this.e.length() <= 4 || TextUtils.isEmpty(this.f) || this.w == -1) {
            finish();
            return;
        }
        findViewById(R.id.check_status).setOnClickListener(this);
        findViewById(R.id.done_btn).setOnClickListener(this);
        ((TextView) findViewById(R.id.amount)).setText(this.f);
        TextView textView = (TextView) findViewById(R.id.deposit);
        String str = this.v;
        int i = (str == null || str.isEmpty()) ? R.string.page_payment__m_pesa_prefix : R.string.app_common__star_number;
        String str2 = this.e;
        textView.setText(getCMSString(i, str2.substring(str2.length() - 4)));
        ((TextView) findViewById(R.id.transaction)).setText(this.d);
        TextView textView2 = (TextView) findViewById(R.id.title);
        TextView textView3 = (TextView) findViewById(R.id.submission_tip);
        TextView textView4 = (TextView) findViewById(R.id.fees_amount);
        TextView textView5 = (TextView) findViewById(R.id.fees);
        TextView textView6 = (TextView) findViewById(R.id.deposit_info);
        ImageView imageView = (ImageView) findViewById(R.id.momo_telecom_icon);
        String str3 = this.v;
        if (str3 != null && !str3.isEmpty()) {
            a.b(this).e(this).p(this.v).j().M(imageView);
        }
        int i2 = this.w;
        int i3 = 8;
        if (i2 == 1) {
            textView2.setText(getCMSString(R.string.page_payment__deposit_succeeded, new Object[0]));
            textView3.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView6.setText(getCMSString(R.string.page_payment__deposit_from, new Object[0]));
            String str4 = this.v;
            if (str4 != null && !str4.isEmpty()) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        } else if (i2 == 2) {
            textView2.setText(getCMSString(R.string.page_withdraw__withdrawal_succeeded, new Object[0]));
            textView3.setVisibility(8);
            if (!TextUtils.isEmpty(this.i)) {
                textView4.setText(this.i);
            }
            textView4.setVisibility(0);
            textView6.setText(getCMSString(R.string.page_transaction__withdraw_to, new Object[0]));
            textView5.setVisibility(0);
            String str5 = this.v;
            if (str5 != null && !str5.isEmpty()) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
        } else if (i2 == 3) {
            textView2.setText(getCMSString(R.string.page_payment__submission_succeeded, new Object[0]));
            textView3.setVisibility(0);
            if (!TextUtils.isEmpty(this.i)) {
                textView4.setText(this.i);
            }
            textView4.setVisibility(0);
            textView5.setVisibility(0);
            textView6.setText(getCMSString(R.string.page_transaction__withdraw_to, new Object[0]));
        }
        TextView textView7 = (TextView) findViewById(R.id.amount_info);
        StringBuilder sb = new StringBuilder();
        sb.append(getCMSString(R.string.common_functions__amount, new Object[0]));
        sb.append(" (");
        sb.append(a8b.d().trim());
        zug.b(sb, ")", textView7);
        this.c.e(findViewById(R.id.done_btn), "deposit__done_btn");
        this.c.e(findViewById(R.id.check_status), "deposit__check_transaction_btn");
        this.b.g();
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
