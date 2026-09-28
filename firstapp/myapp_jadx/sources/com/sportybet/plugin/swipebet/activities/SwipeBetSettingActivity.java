package com.sportybet.plugin.swipebet.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import defpackage.bb40;
import defpackage.ble0;
import defpackage.cru;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.gky;
import defpackage.hb5;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.jq40;
import defpackage.k53;
import defpackage.py1;
import defpackage.r8i0;
import defpackage.s2s;
import defpackage.s8i0;
import defpackage.uke0;
import defpackage.v8i0;
import defpackage.vke0;
import defpackage.wke0;
import defpackage.xke0;
import defpackage.yke0;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetSettingActivity extends py1 implements bb40 {
    public static final String[] D = {"1", "1.1", "1.2", "1.3", "1.4", "1.5", "2", "2.5", "3", "3.5", "4", "5", "10", "20", "Max"};
    public View A;
    public LoadingViewNew B;
    public final DecimalFormat C = new DecimalFormat("##.#");
    public RangeSeekBar a;
    public TextView b;
    public float c;
    public float d;
    public RecyclerView e;
    public RecyclerView f;
    public s2s i;
    public cru v;
    public ble0 w;
    public View y;
    public View z;

    public static float A1(int i) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("interval = %s", Float.valueOf(7.142857f));
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("getValue = %d", Integer.valueOf(i));
        if (i == 0) {
            return 0.0f;
        }
        if (i == 14) {
            return 100.0f;
        }
        return i * 7.142857f;
    }

    public static int z1(double d) {
        double dRound = Math.round(7.142857142857143d);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("interval = %s", Double.valueOf(dRound));
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("getIndex = %s", Double.valueOf(d));
        if (d >= 0.0d && d < dRound) {
            return 0;
        }
        if (d >= dRound && d < dRound * 2.0d) {
            return 1;
        }
        if (d >= 2.0d * dRound && d < dRound * 3.0d) {
            return 2;
        }
        if (d >= 3.0d * dRound && d < dRound * 4.0d) {
            return 3;
        }
        if (d >= 4.0d * dRound && d < dRound * 5.0d) {
            return 4;
        }
        if (d >= 5.0d * dRound && d < dRound * 6.0d) {
            return 5;
        }
        if (d >= 6.0d * dRound && d < dRound * 7.0d) {
            return 6;
        }
        if (d >= 7.0d * dRound && d < dRound * 8.0d) {
            return 7;
        }
        if (d >= 8.0d * dRound && d < dRound * 9.0d) {
            return 8;
        }
        if (d >= 9.0d * dRound && d < dRound * 10.0d) {
            return 9;
        }
        if (d >= 10.0d * dRound && d < dRound * 11.0d) {
            return 10;
        }
        if (d >= 11.0d * dRound && d < dRound * 12.0d) {
            return 11;
        }
        if (d < 12.0d * dRound || d >= dRound * 13.0d) {
            return (d < 13.0d * dRound || d >= dRound * 14.0d) ? 14 : 13;
        }
        return 12;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_swipe_bet_setting);
        this.B = (LoadingViewNew) findViewById(R.id.loading);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ble0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ble0 ble0Var = (ble0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.w = ble0Var;
        ble0Var.b.f(this, new wke0(this));
        this.w.c.f(this, new xke0(this));
        findViewById(R.id.close_btn).setOnClickListener(new uke0(this));
        this.a = (RangeSeekBar) findViewById(R.id.range_slider);
        RangeSeekBar rangeSeekBar = (RangeSeekBar) findViewById(R.id.range_slider);
        this.a = rangeSeekBar;
        rangeSeekBar.setOnRangeChangedListener(new vke0(this));
        this.c = 0.0f;
        this.d = 100.0f;
        TextView textView = (TextView) findViewById(R.id.odds_range_value);
        this.b = textView;
        StringBuilder sb = new StringBuilder();
        int iZ1 = z1(this.c);
        String[] strArr = D;
        sb.append(gky.a(strArr[iZ1]));
        sb.append(" - ");
        sb.append(gky.a(strArr[z1(this.d)]));
        textView.setText(sb.toString());
        ((TextView) findViewById(R.id.filter_min)).setText(gky.a(strArr[z1(this.c)]));
        ((TextView) findViewById(R.id.filter_max)).setText(gky.a(strArr[z1(this.d)]));
        this.a.setProgress(0.0f, 100.0f);
        this.e = (RecyclerView) findViewById(R.id.league_recycler_view);
        ble0 ble0Var2 = this.w;
        s2s s2sVar = new s2s();
        s2sVar.b = new ArrayList();
        s2sVar.a = ble0Var2;
        this.i = s2sVar;
        this.e.setAdapter(s2sVar);
        this.e.setLayoutManager(new LinearLayoutManager(0, false));
        this.f = (RecyclerView) findViewById(R.id.market_recycler_view);
        ble0 ble0Var3 = this.w;
        cru cruVar = new cru();
        cruVar.b = new ArrayList();
        cruVar.a = ble0Var3;
        this.v = cruVar;
        this.f.setAdapter(cruVar);
        this.f.setLayoutManager(new LinearLayoutManager(0, false));
        View viewFindViewById = findViewById(R.id.btn_apply);
        this.y = viewFindViewById;
        viewFindViewById.setOnClickListener(new yke0(this));
        this.A = findViewById(R.id.btn_apply_loading);
        this.z = findViewById(R.id.btn_apply_text);
        iu2.a.j().r0(k53.REAL);
    }
}
