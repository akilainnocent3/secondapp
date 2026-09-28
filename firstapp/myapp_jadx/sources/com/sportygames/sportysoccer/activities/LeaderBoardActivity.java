package com.sportygames.sportysoccer.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.activities.LeaderBoardActivity;
import com.sportygames.sportysoccer.activities.d;
import com.sportygames.sportysoccer.model.LeaderBoardData;
import com.sportygames.sportysoccer.widget.TitleLayout;
import defpackage.bbd0;
import defpackage.i0;
import defpackage.z7b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class LeaderBoardActivity extends com.sportygames.sportysoccer.activities.a {
    public static final /* synthetic */ int D = 0;
    public TextView A;
    public TextView B;
    public RecyclerView f;
    public a i;
    public SwipeRefreshLayout v;
    public RelativeLayout w;
    public TextView y;
    public ImageView z;
    public final ArrayList e = new ArrayList();
    public boolean C = false;

    public static class a extends RecyclerView.f<C0448a> {
        public final LayoutInflater a;
        public final List<LeaderBoardData> b;
        public final LeaderBoardActivity c;
        public LeaderBoardData d;

        /* JADX INFO: renamed from: com.sportygames.sportysoccer.activities.LeaderBoardActivity$a$a, reason: collision with other inner class name */
        public class C0448a extends RecyclerView.d0 {
            public TextView a;
            public TextView b;
            public ImageView c;
            public TextView d;
            public RelativeLayout e;
        }

        public a(LeaderBoardActivity leaderBoardActivity, ArrayList arrayList) {
            this.b = arrayList;
            this.c = leaderBoardActivity;
            this.a = LayoutInflater.from(leaderBoardActivity);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            C0448a c0448a = (C0448a) d0Var;
            LeaderBoardData leaderBoardData = this.b.get(i);
            if (leaderBoardData.getRank() == 1) {
                c0448a.a.setBackgroundResource(R.drawable.sg_coin_gold);
            } else if (leaderBoardData.getRank() == 2) {
                c0448a.a.setBackgroundResource(R.drawable.sg_coin_silver);
            } else if (leaderBoardData.getRank() == 3) {
                c0448a.a.setBackgroundResource(R.drawable.sg_coin_copper);
            } else {
                c0448a.a.setBackgroundResource(R.drawable.sg_coin_green);
            }
            LeaderBoardData leaderBoardData2 = this.d;
            if (leaderBoardData2 == null || !leaderBoardData2.getUserId().equals(leaderBoardData.getUserId())) {
                c0448a.e.setBackgroundColor(Color.rgb(255, 255, 255));
            } else {
                c0448a.e.setBackgroundColor(Color.rgb(221, 231, 249));
                if (leaderBoardData.getRank() > 3) {
                    c0448a.a.setBackgroundResource(R.drawable.sg_coin_blue);
                }
            }
            c0448a.a.setText(String.valueOf(leaderBoardData.getRank()));
            c0448a.b.setText(leaderBoardData.getUserName());
            c0448a.c.setImageResource(z7b.e(leaderBoardData.getCountry()));
            c0448a.d.setText(this.c.getResources().getString(leaderBoardData.getScore() < 2 ? R.string.sg_sporty_soccer_score_pt : R.string.sg_sporty_soccer_score_pts, Integer.valueOf(leaderBoardData.getScore())));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewInflate = this.a.inflate(R.layout.sg_ss_list_item_leader_board, viewGroup, false);
            C0448a c0448a = new C0448a(viewInflate);
            c0448a.a = (TextView) viewInflate.findViewById(R.id.rank);
            c0448a.b = (TextView) viewInflate.findViewById(R.id.name);
            c0448a.c = (ImageView) viewInflate.findViewById(R.id.country);
            c0448a.d = (TextView) viewInflate.findViewById(R.id.score);
            c0448a.e = (RelativeLayout) viewInflate.findViewById(R.id.leader_board_layout);
            return c0448a;
        }
    }

    @Override // com.sportygames.sportysoccer.activities.a, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sg_ss_activity_leaderboard);
        this.f = (RecyclerView) findViewById(R.id.recycler_view);
        this.v = (SwipeRefreshLayout) findViewById(R.id.swipeToRefresh);
        this.w = (RelativeLayout) findViewById(R.id.my_leader_board);
        this.y = (TextView) findViewById(R.id.my_rank);
        this.A = (TextView) findViewById(R.id.my_score);
        this.z = (ImageView) findViewById(R.id.my_country);
        this.B = (TextView) findViewById(R.id.my_name);
        TitleLayout titleLayout = (TitleLayout) findViewById(R.id.title_layout);
        String string = getString(R.string.sg_sporty_soccer_leaderboard);
        titleLayout.getClass();
        getWindow().addFlags(Integer.MIN_VALUE);
        titleLayout.b = this;
        titleLayout.a.setText(string);
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.C = true;
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f.setLayoutManager(new LinearLayoutManager());
        a aVar = new a(this, this.e);
        this.i = aVar;
        this.f.setAdapter(aVar);
        v1(0);
        i0.a(bbd0.b.a.B(10), 0, new d(this));
        this.v.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: d1s
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() {
                int i = LeaderBoardActivity.D;
                LeaderBoardActivity leaderBoardActivity = this.a;
                leaderBoardActivity.v1(0);
                i0.a(bbd0.b.a.B(10), 0, new d(leaderBoardActivity));
                leaderBoardActivity.v.setRefreshing(false);
            }
        });
    }
}
