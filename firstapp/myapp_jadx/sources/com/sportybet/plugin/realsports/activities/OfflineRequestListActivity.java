package com.sportybet.plugin.realsports.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.offlinewithdraw.OfflineRequestData;
import com.sporty.android.core.model.pocket.withdraw.offlinewithdraw.OfflineWithdraw;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;
import com.sportybet.plugin.realsports.betorder.RecyclerView.CustomLinearLayoutManager;
import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;
import defpackage.aly;
import defpackage.ap0;
import defpackage.bcp;
import defpackage.c8i0;
import defpackage.ely;
import defpackage.g0e0;
import defpackage.g8l;
import defpackage.l840;
import defpackage.mo0;
import defpackage.oyl;
import defpackage.psm;
import defpackage.pwx;
import defpackage.su5;
import defpackage.ta8;
import defpackage.uky;
import defpackage.wky;
import defpackage.x7k;
import defpackage.xdp;
import defpackage.yky;
import defpackage.zch0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class OfflineRequestListActivity extends oyl implements pwx, View.OnClickListener {
    public static final /* synthetic */ int E = 0;
    public SimpleDateFormat A;
    public boolean B;
    public psm D;
    public LoadingView b;
    public PullRefreshRecyclerView c;
    public ely d;
    public mo0 e;
    public ArrayList f;
    public su5<BaseResponse<OfflineRequestData>> i;
    public String v;
    public su5<BaseResponse<xdp>> w;
    public su5<BaseResponse<Object>> y;
    public String z = "0";
    public final Handler C = new Handler(Looper.getMainLooper());

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            OfflineRequestListActivity offlineRequestListActivity = OfflineRequestListActivity.this;
            offlineRequestListActivity.b.E();
            offlineRequestListActivity.C.postDelayed(new wky(offlineRequestListActivity), 2000L);
            offlineRequestListActivity.c.setRefreshing(false);
        }
    }

    public final void A1() {
        if (this.e == null) {
            return;
        }
        su5<BaseResponse<OfflineRequestData>> su5Var = this.i;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<OfflineRequestData>> su5VarL0 = ap0.g().l0(1, 10, this.v);
        this.i = su5VarL0;
        su5VarL0.G(new x7k(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.goback) {
            finish();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        su5<BaseResponse<Object>> su5VarC;
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_offline_request_list);
        this.e = l840.a();
        findViewById(R.id.goback).setOnClickListener(this);
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.A = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        LoadingView loadingView = (LoadingView) findViewById(R.id.loading);
        this.b = loadingView;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: tky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = OfflineRequestListActivity.E;
                OfflineRequestListActivity offlineRequestListActivity = this.a;
                offlineRequestListActivity.b.K();
                offlineRequestListActivity.A1();
            }
        });
        this.b.K();
        su5<BaseResponse<Object>> su5Var = this.y;
        if (su5Var != null) {
            su5Var.cancel();
        }
        bcp bcpVar = new bcp();
        xdp xdpVar = new xdp();
        xdpVar.i("appId", "pocket");
        xdpVar.i("namespace", "application");
        xdpVar.i("configKey", "fee.withdrawCancel.amount");
        bcpVar.h(xdpVar);
        if (this.D.r()) {
            su5VarC = ((ta8) ap0.e.getValue()).b(bcpVar.toString());
            this.y = su5VarC;
        } else {
            su5VarC = ((ta8) ap0.e.getValue()).c(bcpVar.toString());
            this.y = su5VarC;
        }
        su5VarC.G(new aly(this));
        findViewById(R.id.home).setOnClickListener(new uky());
        PullRefreshRecyclerView pullRefreshRecyclerView = (PullRefreshRecyclerView) findViewById(R.id.mPullRefreshRecyclerView);
        this.c = pullRefreshRecyclerView;
        pullRefreshRecyclerView.setOnRefreshListener(new yky(this));
        this.c.setLayoutManager(new CustomLinearLayoutManager());
        PullRefreshRecyclerView pullRefreshRecyclerView2 = this.c;
        pullRefreshRecyclerView2.l0 = true;
        pullRefreshRecyclerView2.setEnabled(true);
        this.c.n0 = true;
        g0e0 g0e0Var = g0e0.a.a(new g8l() { // from class: vky
            @Override // defpackage.g8l
            public final String a(int i) {
                int i2 = OfflineRequestListActivity.E;
                if (i < 0) {
                    return null;
                }
                OfflineRequestListActivity offlineRequestListActivity = this.a;
                if (offlineRequestListActivity.f.size() > i) {
                    return offlineRequestListActivity.A.format(new Date(((OfflineWithdraw) offlineRequestListActivity.f.get(i)).requestTime));
                }
                return null;
            }
        }).a;
        g0e0Var.b = zch0.b(getResources(), 36);
        int iD = c8i0.d(R.color.background_type1_primary, this.c);
        g0e0Var.a = iD;
        g0e0Var.i.setColor(iD);
        int iD2 = c8i0.d(R.color.text_type1_primary, this.c);
        g0e0Var.d = iD2;
        g0e0Var.h.setColor(iD2);
        int i = (int) ((14.0f * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        g0e0Var.f = i;
        g0e0Var.h.setTextSize(i);
        g0e0Var.e = zch0.b(getResources(), 16);
        g0e0Var.c = true;
        this.c.i0.i(g0e0Var);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.C.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void z1(String str) {
        new AlertDialog.Builder(this).setMessage(str).setCancelable(false).setPositiveButton(R.string.common_functions__ok, new a()).show();
    }
}
