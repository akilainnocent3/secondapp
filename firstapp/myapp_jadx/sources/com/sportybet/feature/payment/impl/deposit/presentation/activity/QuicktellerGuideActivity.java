package com.sportybet.feature.payment.impl.deposit.presentation.activity;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.eg30;
import defpackage.pal;
import defpackage.py1;
import defpackage.tj30;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class QuicktellerGuideActivity extends py1 implements View.OnClickListener, bb40 {
    public static final /* synthetic */ int c = 0;
    public int a;
    public final ArrayList b = new ArrayList();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.goback) {
            onBackPressed();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_quickteller_guide);
        if (getIntent() != null) {
            this.a = getIntent().getIntExtra("guideType", -1);
        }
        TextView textView = (TextView) findViewById(R.id.title_name);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        int i = this.a;
        ArrayList arrayList = this.b;
        if (i == 0) {
            Account account = getAccountHelper().getAccount();
            if (account != null) {
                str = "234" + account.name;
            } else {
                str = null;
            }
            arrayList.add(new pal("1", getCMSString(R.string.common_payment_providers__atm_deposit_desc_1__NG, new Object[0]), R.drawable.quickteller_atm_step1));
            arrayList.add(new pal("2", getCMSString(R.string.common_payment_providers__atm_deposit_desc_2__NG, new Object[0]), R.drawable.quickteller_atm_step2));
            arrayList.add(new pal("3", getCMSString(R.string.common_payment_providers__atm_deposit_desc_3__NG, new Object[0]), R.drawable.quickteller_atm_step3));
            arrayList.add(new pal("4", getCMSString(R.string.common_payment_providers__atm_deposit_desc_4__NG, new Object[0]), R.drawable.quickteller_atm_step4));
            arrayList.add(new pal("5", getCMSString(R.string.common_payment_providers__atm_deposit_desc_5__NG, new Object[0]), R.drawable.quickteller_atm_step5));
            arrayList.add(new pal("6", getCMSString(R.string.common_payment_providers__atm_deposit_desc_6__NG, str), R.drawable.quickteller_atm_step6));
            arrayList.add(new pal("7", getCMSString(R.string.common_payment_providers__atm_deposit_desc_7__NG, new Object[0]), R.drawable.quickteller_atm_step7));
            arrayList.add(new pal("8", getCMSString(R.string.common_payment_providers__atm_deposit_desc_8__NG, new Object[0]), R.drawable.quickteller_atm_step8));
            arrayList.add(new pal("9", getCMSString(R.string.common_payment_providers__atm_deposit_desc_9__NG, new Object[0]), R.drawable.quickteller_atm_step9));
        } else if (i == 1) {
            arrayList.add(new pal("1", getCMSString(R.string.common_payment_providers__ussd_deposit_desc_1__NG, new Object[0]), -1));
            arrayList.add(new pal("2", getCMSString(R.string.common_payment_providers__ussd_deposit_desc_2__NG, new Object[0]), R.drawable.quickteller_ussd_step1));
            arrayList.add(new pal("3", getCMSString(R.string.common_payment_providers__ussd_deposit_desc_3__NG, new Object[0]), R.drawable.quickteller_ussd_step2));
            arrayList.add(new pal("4", getCMSString(R.string.common_payment_providers__ussd_deposit_desc_4__NG, new Object[0]), R.drawable.quickteller_ussd_step3));
            arrayList.add(new pal("5", getCMSString(R.string.common_payment_providers__ussd_deposit_desc_5__NG, new Object[0]), -1));
        }
        eg30 eg30Var = new eg30();
        eg30Var.a = arrayList;
        eg30Var.b = LayoutInflater.from(this);
        recyclerView.setAdapter(eg30Var);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        int i2 = this.a;
        if (i2 == 0) {
            textView.setText(getCMSString(R.string.common_payment_providers__atm_deposit_guide__NG, new Object[0]));
        } else if (i2 == 1) {
            textView.setText(getCMSString(R.string.common_payment_providers__ussd_deposit_guid__NG, new Object[0]));
        }
        findViewById(R.id.goback).setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(new tj30());
    }
}
