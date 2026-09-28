package com.sportybet.plugin.jackpot.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.jackpot.data.JackpotBet;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.widget.LoadingView;
import defpackage.er30;
import defpackage.lo0;
import defpackage.ns30;
import defpackage.nt30;
import defpackage.su5;
import defpackage.t5p;
import defpackage.ty1;
import defpackage.vym;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class RSportsBetTicketDetailsActivity extends ty1 implements vym, SwipeRefreshLayout.f, View.OnClickListener {
    public static final /* synthetic */ int A = 0;
    public SwipeRefreshLayout c;
    public LoadingView d;
    public RecyclerView e;
    public er30 f;
    public Order v;
    public su5<BaseResponse<JackpotBet>> w;
    public int y;
    public su5<BaseResponse> z;
    public String a = null;
    public final lo0 b = t5p.a();
    public final ArrayList i = new ArrayList();

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        z1(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ticket_back_icon) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jap_activity_bet_ticket_details);
        Order order = (Order) getIntent().getParcelableExtra("key_order");
        this.v = order;
        if (order == null) {
            finish();
            return;
        }
        String str = order.orderId;
        this.a = str;
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        findViewById(R.id.ticket_back_icon).setOnClickListener(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.ticket_swipe_layout);
        this.c = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        LoadingView loadingView = (LoadingView) findViewById(R.id.ticket_loading_view);
        this.d = loadingView;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: ks30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = RSportsBetTicketDetailsActivity.A;
                this.a.z1(false);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ticket_recycler_view);
        this.e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        findViewById(R.id.home).setOnClickListener(new ns30());
        z1(false);
    }

    public final void z1(boolean z) {
        if (z) {
            this.c.setRefreshing(true);
        } else {
            this.d.d();
        }
        su5<BaseResponse<JackpotBet>> su5Var = this.w;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<JackpotBet>> su5VarF = this.b.f(this.a);
        this.w = su5VarF;
        su5VarF.G(new nt30(this, z));
    }
}
