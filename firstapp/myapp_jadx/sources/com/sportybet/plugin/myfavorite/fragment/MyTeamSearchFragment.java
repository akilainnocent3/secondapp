package com.sportybet.plugin.myfavorite.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.adapter.MyFavoriteAdapter;
import com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.BottomLayout;
import com.sportybet.plugin.myfavorite.widget.TeamSearchEmptyLayout;
import com.sportybet.plugin.myfavorite.widget.TeamSearchLayout;
import defpackage.iww;
import defpackage.j9j;
import defpackage.jww;
import defpackage.l2x;
import defpackage.lfy;
import defpackage.lop;
import defpackage.m12;
import defpackage.pvw;
import defpackage.rjs;
import defpackage.rww;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MyTeamSearchFragment extends m12 implements TeamSearchLayout.b, rww.a, BottomLayout.a, j9j {
    public MyFavoriteAdapter A;
    public iww B;
    public LoadingViewNew C;
    public a D;
    public BottomLayout E;
    public TeamSearchLayout z;
    public String y = null;
    public int F = 0;

    public interface a {
        void U0();

        void Z();
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void S() {
        iww iwwVar = this.B;
        if (iwwVar != null) {
            iwwVar.B1(new pvw(null, 1));
        }
    }

    @Override // com.sportybet.plugin.myfavorite.widget.BottomLayout.a
    public final void Z() {
        if (this.F > 0) {
            this.B.x1();
        } else {
            if (this.D == null || getView() == null) {
                return;
            }
            lop.a(getView());
            this.D.U0();
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getB() {
        return "MyTeamSearchFragment";
    }

    public final void m0(List<rww> list) {
        if (list != null && list.size() > 0) {
            for (rww rwwVar : list) {
                if (rwwVar.g == null) {
                    rwwVar.g = this;
                }
            }
        }
        this.A.setList(list);
    }

    public final void n0() {
        m0(null);
        this.A.setEmptyView((ConstraintLayout) LayoutInflater.from(getContext()).inflate(R.layout.white_space_layout, (ViewGroup) null, false));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof a) {
            this.D = (a) getActivity();
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = jww.a(requireActivity(), MyFavoriteTypeEnum.SEARCH_TEAM);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l2x l2xVarFromBundle;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_team_search, viewGroup, false);
        if (getArguments() != null && (l2xVarFromBundle = l2x.fromBundle(getArguments())) != null) {
            this.y = l2xVarFromBundle.a;
        }
        this.z = (TeamSearchLayout) viewInflate.findViewById(R.id.search_layout);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.my_favorite_list);
        this.C = (LoadingViewNew) viewInflate.findViewById(R.id.loading);
        this.E = (BottomLayout) viewInflate.findViewById(R.id.bottom_layout);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        MyFavoriteAdapter myFavoriteAdapter = new MyFavoriteAdapter();
        this.A = myFavoriteAdapter;
        recyclerView.setAdapter(myFavoriteAdapter);
        this.z.setCallBackListener(this);
        this.E.setCallBackListener(this);
        if (!TextUtils.isEmpty(this.y)) {
            this.E.setRightButtonText(this.y);
        }
        if (!TextUtils.equals(this.y, "Next")) {
            this.E.setEnableButton(this.F > 0);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        TeamSearchLayout teamSearchLayout = this.z;
        ((InputMethodManager) teamSearchLayout.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(teamSearchLayout.a.getWindowToken(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.B.C1();
        this.B.a.f(getViewLifecycleOwner(), new lfy() { // from class: k2x
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                hqc hqcVar = (hqc) obj;
                boolean z = hqcVar instanceof nqc;
                MyTeamSearchFragment myTeamSearchFragment = this.a;
                if (!z) {
                    boolean z2 = hqcVar instanceof lqc;
                    LoadingViewNew loadingViewNew = myTeamSearchFragment.C;
                    if (z2) {
                        loadingViewNew.d();
                        return;
                    } else if (hqcVar instanceof kqc) {
                        loadingViewNew.a();
                        zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                        return;
                    } else {
                        loadingViewNew.a();
                        zyf0.a(R.string.common_feedback__sorry_something_went_wrong);
                        return;
                    }
                }
                myTeamSearchFragment.C.a();
                f0x f0xVar = (f0x) ((nqc) hqcVar).a;
                myTeamSearchFragment.m0(f0xVar.a);
                myTeamSearchFragment.F = f0xVar.c;
                if (TextUtils.isEmpty(myTeamSearchFragment.z.a.getText())) {
                    myTeamSearchFragment.n0();
                } else {
                    TeamSearchEmptyLayout teamSearchEmptyLayout = (TeamSearchEmptyLayout) LayoutInflater.from(myTeamSearchFragment.getContext()).inflate(R.layout.my_team_search_empty_layout, (ViewGroup) null, false);
                    teamSearchEmptyLayout.setText(sn5.d(myTeamSearchFragment, R.string.common_feedback__no_results_found, new Object[0]));
                    myTeamSearchFragment.A.setEmptyView(teamSearchEmptyLayout);
                }
                if (TextUtils.equals(myTeamSearchFragment.y, "Next")) {
                    return;
                }
                myTeamSearchFragment.E.setEnableButton(myTeamSearchFragment.F > 0);
            }
        });
        this.B.b.f(getViewLifecycleOwner(), new rjs(this, 1));
    }

    @Override // rww.a
    public final void z(int i, rww rwwVar) {
        if (i >= 0) {
            this.A.setData(i, rwwVar);
            boolean z = rwwVar.c;
            iww iwwVar = this.B;
            if (z) {
                iwwVar.B1(new pvw(rwwVar, 2));
            } else {
                iwwVar.B1(new pvw(rwwVar, 3));
            }
        }
    }
}
