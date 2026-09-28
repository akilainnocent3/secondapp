package com.sportybet.android.cashoutphase3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public class CashoutFloatView extends RelativeLayout {
    public TabLayout a;
    public InstantCashoutView b;
    public AutoCashoutSettingView c;
    public AutoCashoutResultView d;
    public boolean e;

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    public CashoutFloatView(Context context) {
        super(context);
        this.e = false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        InstantCashoutView instantCashoutView = (InstantCashoutView) findViewById(R.id.rc);
        this.b = instantCashoutView;
        instantCashoutView.setOnClickListener(new a());
        AutoCashoutSettingView autoCashoutSettingView = (AutoCashoutSettingView) findViewById(R.id.auto_cash_out_setting);
        this.c = autoCashoutSettingView;
        autoCashoutSettingView.setOnClickListener(new b());
        AutoCashoutResultView autoCashoutResultView = (AutoCashoutResultView) findViewById(R.id.auto_cash_out_result);
        this.d = autoCashoutResultView;
        autoCashoutResultView.setOnClickListener(new c());
        this.a = (TabLayout) findViewById(R.id.tab);
    }

    public CashoutFloatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }

    public CashoutFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
    }
}
