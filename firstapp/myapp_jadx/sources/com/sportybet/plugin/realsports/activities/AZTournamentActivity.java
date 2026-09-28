package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.AZTournamentActivity;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import defpackage.ap0;
import defpackage.bi50;
import defpackage.f00;
import defpackage.gv5;
import defpackage.kgb0;
import defpackage.lfb0;
import defpackage.o1;
import defpackage.py1;
import defpackage.q1;
import defpackage.su5;
import defpackage.vgb0;
import defpackage.yrh0;
import defpackage.zyf0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class AZTournamentActivity extends py1 implements View.OnClickListener, SwipeRefreshLayout.f {
    public static final /* synthetic */ int D = 0;
    public TextView A;
    public String B;
    public ArrayList<Tournaments> b;
    public SwipeRefreshLayout c;
    public LoadingView d;
    public RecyclerView e;
    public TextView f;
    public q1 i;
    public String v;
    public boolean w;
    public String y;
    public int z;
    public final ArrayList<String> a = new ArrayList<>();
    public final ArrayList C = new ArrayList();

    /* JADX INFO: loaded from: classes7.dex */
    public class a implements gv5<BaseResponse<List<Sport>>> {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<List<Sport>>> su5Var, Throwable th) {
            AZTournamentActivity aZTournamentActivity = AZTournamentActivity.this;
            aZTournamentActivity.w = false;
            if (aZTournamentActivity.isFinishing()) {
                return;
            }
            if (!this.a) {
                aZTournamentActivity.d.I();
            } else {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                aZTournamentActivity.c.setRefreshing(false);
            }
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<List<Sport>>> su5Var, bi50<BaseResponse<List<Sport>>> bi50Var) {
            List<Categories> list;
            List<Tournaments> list2;
            AZTournamentActivity aZTournamentActivity = AZTournamentActivity.this;
            ArrayList arrayList = aZTournamentActivity.C;
            ArrayList<String> arrayList2 = aZTournamentActivity.a;
            aZTournamentActivity.w = false;
            if (aZTournamentActivity.isFinishing()) {
                return;
            }
            Response response = bi50Var.a;
            BaseResponse<List<Sport>> baseResponse = bi50Var.b;
            boolean isSuccessful = response.getIsSuccessful();
            boolean z = this.a;
            if (!isSuccessful || baseResponse == null) {
                if (!z) {
                    aZTournamentActivity.d.I();
                    return;
                } else {
                    zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                    aZTournamentActivity.c.setRefreshing(false);
                    return;
                }
            }
            ArrayList arrayListF = lfb0.d().f(baseResponse.data);
            arrayList.clear();
            if (arrayListF.size() != 0 && (list = ((Sport) arrayListF.get(0)).categories) != null && list.size() != 0 && (list2 = list.get(0).tournaments) != null && list2.size() != 0) {
                arrayList.addAll(list2);
                ArrayList arrayList3 = new ArrayList();
                Iterator<Tournaments> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().id);
                }
                ArrayList arrayList4 = new ArrayList(arrayList2);
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    String str = arrayList2.get(i);
                    i++;
                    String str2 = str;
                    if (!arrayList3.contains(str2)) {
                        arrayList4.remove(str2);
                    }
                }
                if (arrayList4.size() != arrayList2.size()) {
                    aZTournamentActivity.A1();
                }
            }
            ArrayList arrayListA = kgb0.a(arrayList, arrayList2);
            if (arrayListA == null) {
                aZTournamentActivity.A.setVisibility(8);
                aZTournamentActivity.f.setVisibility(0);
                arrayListA = new ArrayList(0);
            } else {
                aZTournamentActivity.f.setVisibility(8);
                aZTournamentActivity.A.setVisibility(0);
            }
            q1 q1Var = aZTournamentActivity.i;
            if (q1Var == null) {
                q1 q1Var2 = new q1();
                q1Var2.a = arrayListA;
                aZTournamentActivity.i = q1Var2;
                q1Var2.b = aZTournamentActivity;
                aZTournamentActivity.e.setAdapter(q1Var2);
            } else {
                q1Var.a = arrayListA;
                q1Var.notifyDataSetChanged();
            }
            if (z) {
                aZTournamentActivity.c.setRefreshing(false);
            } else {
                aZTournamentActivity.d.E();
            }
        }
    }

    public final void A1() {
        int color = getColor(R.color.brand_tertiary);
        int color2 = getColor(R.color.text_disable_type1_primary);
        TextView textView = this.A;
        ArrayList<String> arrayList = this.a;
        textView.setEnabled(arrayList.size() > 0);
        TextView textView2 = this.A;
        if (arrayList.size() <= 0) {
            color = color2;
        }
        textView2.setTextColor(color);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        z1(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_icon) {
            onBackPressed();
            return;
        }
        if (id == R.id.az_tour_display_btn) {
            Intent intent = new Intent(this, (Class<?>) (this.z == 1 ? LiveTournamentActivity.class : PreMatchSportActivity.class));
            intent.putStringArrayListExtra("key_tournament_ids", this.a);
            intent.putExtra("key_category_name", this.y);
            intent.putExtra("is_az_menu", true);
            intent.putExtra("key_sport_id", this.v);
            yrh0.s(this, intent, true);
            HashMap map = new HashMap();
            map.put("type", this.y);
            map.put(AnalyticsParam.EVENT_PARAM_ID, this.v);
            f00 f00Var = vgb0.a;
            vgb0.c("AZ_Display", map, false);
        }
    }

    public final void z1(boolean z) {
        ArrayList<Tournaments> arrayList;
        ArrayList arrayListA;
        if (!z && (arrayList = this.b) != null && arrayList.size() > 0 && (arrayListA = kgb0.a(this.b, this.a)) != null) {
            q1 q1Var = this.i;
            if (q1Var == null) {
                q1 q1Var2 = new q1();
                q1Var2.a = arrayListA;
                this.i = q1Var2;
                q1Var2.b = this;
                this.e.setAdapter(q1Var2);
            } else {
                q1Var.a = arrayListA;
                q1Var.notifyDataSetChanged();
            }
            this.d.E();
            return;
        }
        String str = this.B;
        if (str != null) {
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            if (!TextUtils.equals(str, "sr:category:top")) {
                if (!z) {
                    this.d.K();
                }
                if (this.w) {
                    return;
                }
                this.w = true;
                ap0.b().f0(this.v, this.z, null, null, this.B, false).G(new a(z));
                return;
            }
        }
        this.c.setRefreshing(false);
        this.d.E();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spr_az_tournament);
        Intent intent = getIntent();
        if (intent != null) {
            this.v = intent.getStringExtra("key_sport_id");
            this.y = intent.getStringExtra(QWvyvNzGsBpRT.rSkOjBmwsAvo);
            this.B = intent.getStringExtra("key_category_id");
            this.z = intent.getIntExtra("key_product_id", 0);
            this.b = intent.getParcelableArrayListExtra("key_tournament_list");
            if (!TextUtils.isEmpty(this.v) && !TextUtils.isEmpty(this.y) && this.z != 0) {
                this.c = (SwipeRefreshLayout) findViewById(R.id.az_tour_swipe_refresh_layout);
                this.e = (RecyclerView) findViewById(R.id.az_tour_recycler_view);
                this.f = (TextView) findViewById(R.id.az_no_match);
                findViewById(R.id.back_icon).setOnClickListener(this);
                ((TextView) findViewById(R.id.back_title)).setText(this.y);
                this.c.setOnRefreshListener(this);
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.az_tour_frame);
                LoadingView loadingView = new LoadingView(this);
                this.d = loadingView;
                frameLayout.addView(loadingView);
                this.e.getItemAnimator().f = 0L;
                TextView textView = (TextView) findViewById(R.id.az_tour_display_btn);
                this.A = textView;
                textView.setOnClickListener(this);
                findViewById(R.id.home).setOnClickListener(new o1());
                z1(false);
                this.d.setOnClickListener(new View.OnClickListener() { // from class: n1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = AZTournamentActivity.D;
                        AZTournamentActivity aZTournamentActivity = this.a;
                        aZTournamentActivity.d.K();
                        aZTournamentActivity.z1(false);
                    }
                });
                return;
            }
        }
        finish();
    }
}
