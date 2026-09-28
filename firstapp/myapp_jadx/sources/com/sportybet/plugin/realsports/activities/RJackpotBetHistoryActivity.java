package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.ll30;
import defpackage.p7p;
import defpackage.vym;
import defpackage.yq30;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class RJackpotBetHistoryActivity extends p7p implements View.OnClickListener, ViewPager.i, vym, bb40 {
    public int e;
    public View f;
    public ViewPager i;
    public int v;
    public final ArrayList d = new ArrayList(3);
    public final TextView[] w = new TextView[3];

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        int i3 = this.e;
        if (i3 == i) {
            int i4 = this.v;
            layoutParams.leftMargin = (int) ((((((double) i4) * 1.0d) / 3.0d) * ((double) f)) + ((double) ((i4 / 3) * i3)));
        } else if (i3 == i + 1) {
            int i5 = this.v;
            layoutParams.leftMargin = (int) ((((((double) i5) * 1.0d) / 3.0d) * ((double) (-(1.0f - f)))) + ((double) ((i5 / 3) * i3)));
        }
        this.f.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i) {
        this.e = i;
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.w;
            if (i2 >= textViewArr.length) {
                return;
            }
            textViewArr[i2].setTypeface(i2 == i ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            i2++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_icon) {
            getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.id_all_tab_ll) {
            this.i.setCurrentItem(0);
        } else if (id == R.id.id_settled_tab_ll) {
            this.i.setCurrentItem(1);
        } else if (id == R.id.id_unsettled_tab_ll) {
            this.i.setCurrentItem(2);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_jackpot_history);
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("tab_index", 10);
            if (intExtra == 1 || intExtra == 2) {
                this.e = intExtra;
            } else {
                this.e = 0;
            }
        }
        findViewById(R.id.back_icon).setOnClickListener(this);
        findViewById(R.id.id_all_tab_ll).setOnClickListener(this);
        findViewById(R.id.id_settled_tab_ll).setOnClickListener(this);
        findViewById(R.id.id_unsettled_tab_ll).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tab1);
        TextView[] textViewArr = this.w;
        textViewArr[0] = textView;
        textViewArr[1] = (TextView) findViewById(R.id.tab2);
        textViewArr[2] = (TextView) findViewById(R.id.tab3);
        this.f = findViewById(R.id.id_tab_line_iv);
        this.i = (ViewPager) findViewById(R.id.view_pager);
        yq30 yq30VarN0 = yq30.n0(10);
        yq30 yq30VarN1 = yq30.n0(1);
        yq30 yq30VarN2 = yq30.n0(0);
        ArrayList arrayList = this.d;
        arrayList.add(yq30VarN1);
        arrayList.add(yq30VarN2);
        arrayList.add(yq30VarN0);
        ll30 ll30Var = new ll30(getSupportFragmentManager());
        new ArrayList();
        ll30Var.h = arrayList;
        this.i.setAdapter(ll30Var);
        this.i.b(this);
        this.i.setCurrentItem(this.e);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.v = displayMetrics.widthPixels;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.width = this.v / 3;
        this.f.setLayoutParams(layoutParams);
    }
}
