package com.sportybet.plugin.realsports.activities;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.mz60;
import defpackage.oz60;
import defpackage.py1;

/* JADX INFO: loaded from: classes7.dex */
public class ScheduleActivity extends py1 implements View.OnClickListener, bb40 {
    public static final /* synthetic */ int b = 0;
    public oz60 a;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.goback) {
            finish();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_schedule);
        findViewById(R.id.goback).setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(new mz60());
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("DEFAULT_SPORT_ID", getIntent().getStringExtra("DEFAULT_SPORT_ID"));
            oz60 oz60Var = new oz60();
            this.a = oz60Var;
            oz60Var.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.e(R.id.frame, this.a, null, 1);
            aVar.d();
        }
    }
}
