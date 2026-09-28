package com.sportygames.sportysoccer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.activities.TutorialActivity;
import com.sportygames.sportysoccer.adapter.IndicatorController;
import com.sportygames.sportysoccer.widget.FullButtonLayout;
import defpackage.czg0;
import defpackage.fxi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class TutorialActivity extends com.sportygames.sportysoccer.activities.a implements ViewPager.i {
    public static final /* synthetic */ int y = 0;
    public final ArrayList e = new ArrayList();
    public ViewPager f;
    public FrameLayout i;
    public FullButtonLayout v;
    public IndicatorController w;

    /* JADX INFO: loaded from: classes.dex */
    public class a extends fxi {
        public final FragmentManager f;
        public final List<Fragment> g;

        public a(FragmentManager fragmentManager, ArrayList arrayList) {
            super(fragmentManager);
            this.f = fragmentManager;
            this.g = arrayList;
        }

        @Override // defpackage.fxi, defpackage.loz
        public final void a(ViewPager viewPager, int i, Object obj) {
            Fragment fragment = this.g.get(i);
            FragmentManager fragmentManager = this.f;
            fragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.o(fragment);
            aVar.d();
        }

        @Override // defpackage.loz
        public final int c() {
            return this.g.size();
        }

        @Override // defpackage.fxi, defpackage.loz
        public final Object f(ViewPager viewPager, int i) {
            Fragment fragment = (Fragment) super.f(viewPager, i);
            FragmentManager fragmentManager = this.f;
            fragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.s(fragment);
            aVar.k(true, true);
            return fragment;
        }

        @Override // defpackage.fxi
        public final Fragment l(int i) {
            return this.g.get(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i, int i2) {
        if (i == 0) {
            this.i.setVisibility(0);
            this.v.setVisibility(4);
        } else if (i == 1) {
            this.i.setVisibility(0);
            this.v.setVisibility(4);
        } else {
            if (i != 2) {
                return;
            }
            this.i.setVisibility(4);
            this.v.setVisibility(0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i) {
        this.w.a(i);
    }

    @Override // com.sportygames.sportysoccer.activities.a, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sg_ss_activity_tutorial);
        this.f = (ViewPager) findViewById(R.id.tutorial_view_pager);
        this.i = (FrameLayout) findViewById(R.id.indicator_container);
        FullButtonLayout fullButtonLayout = (FullButtonLayout) findViewById(R.id.btn_start);
        this.v = fullButtonLayout;
        fullButtonLayout.a.setText(getString(R.string.sg_common_functions_start));
        this.v.setOnClickListener(new View.OnClickListener() { // from class: myg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = TutorialActivity.y;
                wij wijVarA = wij.a();
                TutorialActivity tutorialActivity = this.a;
                wijVarA.b(tutorialActivity);
                hpa0 hpa0Var = wijVarA.c;
                if (hpa0Var != null) {
                    hpa0Var.b();
                }
                if (TextUtils.equals("action_from_entrance", tutorialActivity.getIntent().getAction())) {
                    tutorialActivity.startActivity(new Intent("action_tutorial", null, tutorialActivity, GameActivity.class));
                }
                tutorialActivity.finish();
            }
        });
        czg0 czg0VarJ0 = czg0.j0(0, getIntent().getAction());
        ArrayList arrayList = this.e;
        arrayList.add(czg0VarJ0);
        arrayList.add(czg0.j0(1, getIntent().getAction()));
        arrayList.add(czg0.j0(2, getIntent().getAction()));
        this.f.setAdapter(new a(getSupportFragmentManager(), arrayList));
        this.f.b(this);
        IndicatorController indicatorController = new IndicatorController(this);
        this.w = indicatorController;
        FrameLayout frameLayout = this.i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        indicatorController.setLayoutParams(layoutParams);
        indicatorController.setOrientation(0);
        indicatorController.setGravity(17);
        frameLayout.addView(indicatorController);
        IndicatorController indicatorController2 = this.w;
        indicatorController2.a = 3;
        for (int i = 0; i < 3; i++) {
            ImageView imageView = new ImageView(indicatorController2.getContext());
            imageView.setImageDrawable(indicatorController2.getContext().getDrawable(R.drawable.sg_ic_appintro_indicator_selected));
            indicatorController2.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        }
        indicatorController2.a(0);
        this.w.a(0);
    }
}
