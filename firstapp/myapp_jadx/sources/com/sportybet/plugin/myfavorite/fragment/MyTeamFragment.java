package com.sportybet.plugin.myfavorite.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.adapter.MyFavoriteAdapter;
import com.sportybet.plugin.myfavorite.adapter.MyTeamLeftAdapter;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.BottomLayout;
import com.sportybet.plugin.myfavorite.widget.TeamSearchEmptyLayout;
import defpackage.i2x;
import defpackage.iww;
import defpackage.j9j;
import defpackage.jww;
import defpackage.m12;
import defpackage.pjs;
import defpackage.pvw;
import defpackage.rww;
import defpackage.sn5;

/* JADX INFO: loaded from: classes6.dex */
public class MyTeamFragment extends m12 implements BottomLayout.a, rww.a, j9j {
    public MyTeamLeftAdapter A;
    public iww C;
    public LoadingViewNew D;
    public BottomLayout E;
    public String F;
    public a G;
    public RecyclerView y;
    public MyFavoriteAdapter z;
    public String B = null;
    public boolean H = false;

    public interface a {
        void b(MyFavoriteTypeEnum myFavoriteTypeEnum);
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void S() {
        iww iwwVar = this.C;
        if (iwwVar != null) {
            iwwVar.B1(new pvw(null, 1));
        }
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void Z() {
        iww iwwVar;
        if (this.H || (iwwVar = this.C) == null) {
            return;
        }
        iwwVar.x1();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getV() {
        return "MyTeamFragment";
    }

    public final void m0() {
        TeamSearchEmptyLayout teamSearchEmptyLayout = (TeamSearchEmptyLayout) LayoutInflater.from(getContext()).inflate(R.layout.my_team_empty_layout, (ViewGroup) null, false);
        teamSearchEmptyLayout.setText(sn5.d(this, R.string.my_favourites_settings__no_results_found_in_this_league, new Object[0]));
        this.z.setEmptyView(teamSearchEmptyLayout);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof a) {
            this.G = (a) getActivity();
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = jww.a(requireActivity(), MyFavoriteTypeEnum.TEAM);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i2x i2xVarFromBundle;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_team, viewGroup, false);
        if (getArguments() != null && (i2xVarFromBundle = i2x.fromBundle(getArguments())) != null) {
            this.B = i2xVarFromBundle.a;
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.left_list);
        this.y = (RecyclerView) viewInflate.findViewById(R.id.right_list);
        this.E = (BottomLayout) viewInflate.findViewById(R.id.bottom_layout);
        this.D = (LoadingViewNew) viewInflate.findViewById(R.id.loading);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.y;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        MyFavoriteAdapter myFavoriteAdapter = new MyFavoriteAdapter();
        this.z = myFavoriteAdapter;
        this.y.setAdapter(myFavoriteAdapter);
        MyTeamLeftAdapter myTeamLeftAdapter = new MyTeamLeftAdapter();
        this.A = myTeamLeftAdapter;
        recyclerView.setAdapter(myTeamLeftAdapter);
        this.E.setCallBackListener(this);
        if (!TextUtils.isEmpty(this.B)) {
            this.E.setRightButtonText(this.B);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.C.C1();
        this.C.a.f(getViewLifecycleOwner(), new pjs(this, 1));
        this.C.b.f(getViewLifecycleOwner(), new b(this));
        this.C.z1();
    }

    @Override // rww.a
    public final void z(int i, rww rwwVar) {
        if (i >= 0) {
            this.z.setData(i, rwwVar);
            this.C.B1(new pvw(rwwVar, 2));
        }
    }
}
