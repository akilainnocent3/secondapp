package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.SportBet;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.NavigationBarLoadingView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class yq30 extends g42 implements SwipeRefreshLayout.f {
    public su5<BaseResponse<SportBet>> A;
    public View e;
    public SwipeRefreshLayout f;
    public NavigationBarLoadingView i;
    public RecyclerView v;
    public lr30 w;
    public final h3z d = ap0.f();
    public final ArrayList y = new ArrayList();
    public int z = -1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yq30.this.m0(false);
        }
    }

    public static yq30 n0(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_is_settled", i);
        yq30 yq30Var = new yq30();
        yq30Var.setArguments(bundle);
        return yq30Var;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        m0(true);
    }

    @Override // defpackage.g42
    public final void j0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.z = arguments.getInt("key_is_settled", -1);
            m0(false);
        }
    }

    public final void m0(boolean z) {
        if (this.z == -1) {
            this.f.setRefreshing(false);
            if (z) {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                return;
            } else {
                this.i.c();
                return;
            }
        }
        if (z) {
            this.f.setRefreshing(true);
        } else {
            this.i.d();
        }
        su5<BaseResponse<SportBet>> su5Var = this.A;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<SportBet>> su5VarG = this.d.g(this.z, null, 10);
        this.A = su5VarG;
        su5VarG.G(new br30(this, z));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.e;
        if (view != null) {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.e);
            }
            return this.e;
        }
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.spr_fragment_r_jackpot_bet_history, viewGroup, false);
        this.e = viewInflate;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.swipe_layout);
        this.f = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        NavigationBarLoadingView navigationBarLoadingView = (NavigationBarLoadingView) this.e.findViewById(R.id.loading_view);
        this.i = navigationBarLoadingView;
        navigationBarLoadingView.setOnClickListener(new a());
        RecyclerView recyclerView = (RecyclerView) this.e.findViewById(R.id.recycler_view);
        this.v = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        return this.e;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        su5<BaseResponse<SportBet>> su5Var = this.A;
        if (su5Var != null) {
            su5Var.cancel();
        }
    }

    @Override // defpackage.g42, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        su5<BaseResponse<SportBet>> su5Var;
        super.setUserVisibleHint(z);
        NavigationBarLoadingView navigationBarLoadingView = this.i;
        if (navigationBarLoadingView != null) {
            navigationBarLoadingView.d();
        }
        if (z || (su5Var = this.A) == null) {
            return;
        }
        su5Var.cancel();
        this.A = null;
    }
}
