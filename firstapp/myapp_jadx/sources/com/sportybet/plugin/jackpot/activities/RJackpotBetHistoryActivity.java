package com.sportybet.plugin.jackpot.activities;

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
import defpackage.cr30;
import defpackage.ml30;
import defpackage.ty1;
import defpackage.vym;
import defpackage.wq30;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class RJackpotBetHistoryActivity extends ty1 implements View.OnClickListener, ViewPager.i, vym, bb40 {
    public static final /* synthetic */ int i = 0;
    public int b;
    public View c;
    public ViewPager d;
    public int e;
    public final ArrayList a = new ArrayList(3);
    public final TextView[] f = new TextView[3];

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        int i4 = this.b;
        if (i4 == i2) {
            int i5 = this.e;
            layoutParams.leftMargin = (int) ((((((double) i5) * 1.0d) / 3.0d) * ((double) f)) + ((double) ((i5 / 3) * i4)));
        } else if (i4 == i2 + 1) {
            int i6 = this.e;
            layoutParams.leftMargin = (int) ((((((double) i6) * 1.0d) / 3.0d) * ((double) (-(1.0f - f)))) + ((double) ((i6 / 3) * i4)));
        }
        this.c.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i2) {
        this.b = i2;
        int i3 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i3 >= textViewArr.length) {
                return;
            }
            textViewArr[i3].setTypeface(i3 == i2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            i3++;
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
            this.d.setCurrentItem(0);
        } else if (id == R.id.id_settled_tab_ll) {
            this.d.setCurrentItem(1);
        } else if (id == R.id.id_unsettled_tab_ll) {
            this.d.setCurrentItem(2);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jap_activity_jackpot_history);
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("tab_index", 10);
            if (intExtra == 1 || intExtra == 2) {
                this.b = intExtra;
            } else {
                this.b = 0;
            }
        }
        findViewById(R.id.back_icon).setOnClickListener(this);
        findViewById(R.id.id_all_tab_ll).setOnClickListener(this);
        findViewById(R.id.id_settled_tab_ll).setOnClickListener(this);
        findViewById(R.id.id_unsettled_tab_ll).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.tab1);
        TextView[] textViewArr = this.f;
        textViewArr[0] = textView;
        textViewArr[1] = (TextView) findViewById(R.id.tab2);
        textViewArr[2] = (TextView) findViewById(R.id.tab3);
        this.c = findViewById(R.id.id_tab_line_iv);
        this.d = (ViewPager) findViewById(R.id.view_pager);
        findViewById(R.id.home).setOnClickListener(new wq30());
        cr30 cr30VarN0 = cr30.n0(10);
        cr30 cr30VarN1 = cr30.n0(1);
        cr30 cr30VarN2 = cr30.n0(0);
        ArrayList arrayList = this.a;
        arrayList.add(cr30VarN0);
        arrayList.add(cr30VarN1);
        arrayList.add(cr30VarN2);
        ml30 ml30Var = new ml30(getSupportFragmentManager());
        ml30Var.h = arrayList;
        this.d.setAdapter(ml30Var);
        this.d.b(this);
        this.d.setCurrentItem(this.b);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.e = displayMetrics.widthPixels;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.width = this.e / 3;
        this.c.setLayoutParams(layoutParams);
    }
}
