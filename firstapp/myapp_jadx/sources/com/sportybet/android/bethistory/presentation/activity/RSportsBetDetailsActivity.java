package com.sportybet.android.bethistory.presentation.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.BoreDrawItem;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.RBet;
import com.sportybet.plugin.realsports.data.RSelection;
import defpackage.ap0;
import defpackage.bb40;
import defpackage.bqe;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dor;
import defpackage.dq7;
import defpackage.ej5;
import defpackage.gs30;
import defpackage.gv5;
import defpackage.hb5;
import defpackage.is30;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.kl30;
import defpackage.lfy;
import defpackage.lm2;
import defpackage.nm2;
import defpackage.o8i0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.su5;
import defpackage.u840;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xym;
import defpackage.z0m;
import defpackage.zyf0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RSportsBetDetailsActivity extends z0m implements View.OnClickListener, SwipeRefreshLayout.f, vym, k9j, bb40, xym {
    public static final /* synthetic */ int A = 0;
    public d0n b;
    public String c = null;
    public final u840 d = (u840) ap0.h.getValue();
    public SwipeRefreshLayout e;
    public LoadingView f;
    public RecyclerView i;
    public kl30 v;
    public su5<BaseResponse<List<RBet>>> w;
    public int y;
    public nm2 z;

    public class a implements gv5<BaseResponse<List<RBet>>> {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<List<RBet>>> su5Var, Throwable th) {
            RSportsBetDetailsActivity rSportsBetDetailsActivity = RSportsBetDetailsActivity.this;
            if (rSportsBetDetailsActivity.isFinishing() || su5Var.isCanceled()) {
                return;
            }
            rSportsBetDetailsActivity.e.setRefreshing(false);
            rSportsBetDetailsActivity.f.setVisibility(8);
            if (this.a) {
                zyf0.c(1, rSportsBetDetailsActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
            } else {
                rSportsBetDetailsActivity.f.I();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r1 != 19411) goto L32;
         */
        @Override // defpackage.gv5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResponse(defpackage.su5<com.sporty.android.common.network.data.BaseResponse<java.util.List<com.sportybet.plugin.realsports.data.RBet>>> r5, defpackage.bi50<com.sporty.android.common.network.data.BaseResponse<java.util.List<com.sportybet.plugin.realsports.data.RBet>>> r6) {
            /*
                r4 = this;
                com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity r0 = com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity.this
                boolean r1 = r0.isFinishing()
                if (r1 != 0) goto L7c
                boolean r1 = r5.isCanceled()
                if (r1 == 0) goto Lf
                goto L7c
            Lf:
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.e
                r2 = 0
                r1.setRefreshing(r2)
                com.sportybet.android.widget.LoadingView r1 = r0.f
                r3 = 8
                r1.setVisibility(r3)
                okhttp3.Response r1 = r6.a
                boolean r1 = r1.getIsSuccessful()
                if (r1 == 0) goto L78
                T r6 = r6.b
                if (r6 == 0) goto L78
                com.sporty.android.common.network.data.BaseResponse r6 = (com.sporty.android.common.network.data.BaseResponse) r6
                int r1 = r6.bizCode
                r3 = 10000(0x2710, float:1.4013E-41)
                if (r1 == r3) goto L35
                r3 = 19411(0x4bd3, float:2.72E-41)
                if (r1 == r3) goto L5f
                goto L78
            L35:
                T r4 = r6.data
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L5f
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L5f
                kl30 r5 = r0.v
                if (r5 != 0) goto L54
                kl30 r5 = new kl30
                int r6 = r0.y
                r5.<init>(r0, r4, r6)
                r0.v = r5
                androidx.recyclerview.widget.RecyclerView r4 = r0.i
                r4.setAdapter(r5)
                goto L59
            L54:
                r5.c = r4
                r5.notifyDataSetChanged()
            L59:
                nm2 r4 = r0.z
                r4.Q0()
                return
            L5f:
                java.lang.String r4 = r6.message
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L71
                r4 = 2132018129(0x7f1403d1, float:1.9674556E38)
                java.lang.Object[] r5 = new java.lang.Object[r2]
                java.lang.String r4 = r0.getCMSString(r4, r5)
                goto L73
            L71:
                java.lang.String r4 = r6.message
            L73:
                r5 = 1
                defpackage.zyf0.c(r5, r4)
                return
            L78:
                r6 = 0
                r4.onFailure(r5, r6)
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.bethistory.presentation.activity.RSportsBetDetailsActivity.a.onResponse(su5, bi50):void");
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        z1(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.bet_back_icon) {
            getOnBackPressedDispatcher().d();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_r_sports_bet_details);
        this.c = getIntent().getStringExtra(AnalyticsParam.SOCIAL_ORDER_ID);
        this.y = getIntent().getIntExtra("order_type", 0);
        if (TextUtils.isEmpty(this.c)) {
            finish();
            return;
        }
        findViewById(R.id.bet_back_icon).setOnClickListener(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.bet_swipe_layout);
        this.e = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.f = (LoadingView) findViewById(R.id.bet_loading_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bet_recycler_view);
        this.i = recyclerView;
        recyclerView.i(new dor(bqe.a(10.0f)));
        this.f.setOnClickListener(new is30(this));
        findViewById(R.id.home).setOnClickListener(new gs30());
        findViewById(R.id.customer_service).setOnClickListener(new View.OnClickListener() { // from class: hs30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = RSportsBetDetailsActivity.A;
                RSportsBetDetailsActivity rSportsBetDetailsActivity = this.a;
                rSportsBetDetailsActivity.b.b(rSportsBetDetailsActivity, snb0.BET_DETAIL);
            }
        });
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(nm2.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        nm2 nm2Var = (nm2) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.z = nm2Var;
        nm2Var.a.X0().f(this, new lfy() { // from class: es30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BoreDrawConfig boreDrawConfig = (BoreDrawConfig) obj;
                int i = RSportsBetDetailsActivity.A;
                kl30 kl30Var = this.a.v;
                if (kl30Var != null) {
                    kl30Var.d = boreDrawConfig;
                    if (kl30Var.c.isEmpty()) {
                        return;
                    }
                    for (int i2 = 0; i2 < kl30Var.c.size(); i2++) {
                        List<RSelection> list = kl30Var.c.get(i2).selections;
                        if (list != null && !list.isEmpty()) {
                            List<BoreDrawItem> boreDrawItems = boreDrawConfig.getBoreDrawItems();
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                RSelection rSelection = list.get(i3);
                                String string = q980.a(rSelection).toString();
                                int i4 = rSelection.status;
                                int i5 = rSelection.eventStatus;
                                String str = rSelection.marketId;
                                String str2 = rSelection.sportId;
                                String str3 = rSelection.outcomeId;
                                String str4 = rSelection.outcomeDesc;
                                wd7.a(string, str, str2, str3);
                                boolean z = i5 == 0;
                                boolean z2 = i4 == 0 && string.equals("0:0");
                                boolean z3 = i4 == 4;
                                cqu[] cquVarArr = cqu.a;
                                if ((str.equals("45") || str.equals("47")) && str2.equals("sr:sport:1") && ((z || z2 || z3) && q980.b(str, str3, str4, boreDrawItems))) {
                                    kl30Var.notifyItemChanged(i3);
                                }
                            }
                        }
                    }
                }
            }
        });
        nm2 nm2Var2 = this.z;
        nm2Var2.getClass();
        ej5.c(o8i0.d(nm2Var2), null, null, new lm2(nm2Var2, null), 3);
        this.z.d.f(this, new lfy() { // from class: fs30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i = RSportsBetDetailsActivity.A;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                RSportsBetDetailsActivity rSportsBetDetailsActivity = this.a;
                v9m.a((ViewGroup) rSportsBetDetailsActivity.findViewById(R.id.bet_detail_root_layout), rSportsBetDetailsActivity.findViewById(R.id.customer_service), null, rSportsBetDetailsActivity.getCMSString(R.string.bet_history__contact_support_about_this_ticket, new Object[0]), 256, 44, b120.b, -48, new qqg(rSportsBetDetailsActivity, 2));
            }
        });
        z1(false);
    }

    public final void z1(boolean z) {
        if (z) {
            this.e.setRefreshing(true);
        } else {
            this.f.K();
        }
        su5<BaseResponse<List<RBet>>> su5Var = this.w;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<List<RBet>>> su5VarE = this.d.e(this.c);
        this.w = su5VarE;
        su5VarE.G(new a(z));
    }
}
