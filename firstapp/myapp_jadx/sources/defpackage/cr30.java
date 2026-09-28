package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.SportBet;
import com.sportybet.plugin.jackpot.widget.NavigationBarLoadingView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class cr30 extends h42 implements SwipeRefreshLayout.f {
    public su5<BaseResponse<SportBet>> A;
    public View e;
    public SwipeRefreshLayout f;
    public NavigationBarLoadingView i;
    public RecyclerView v;
    public kr30 w;
    public final lo0 d = t5p.a();
    public final ArrayList y = new ArrayList();
    public int z = -1;

    public static cr30 n0(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_is_settled", i);
        cr30 cr30Var = new cr30();
        cr30Var.setArguments(bundle);
        return cr30Var;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        m0(true);
    }

    @Override // defpackage.h42
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
                this.i.b();
                return;
            }
        }
        if (z) {
            this.f.setRefreshing(true);
        } else {
            this.i.c();
        }
        su5<BaseResponse<SportBet>> su5Var = this.A;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<SportBet>> su5VarG = this.d.g(this.z, null, 10);
        this.A = su5VarG;
        su5VarG.G(new zq30(this, z));
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
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.jap_fragment_r_jackpot_bet_history, viewGroup, false);
        this.e = viewInflate;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.swipe_layout);
        this.f = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        NavigationBarLoadingView navigationBarLoadingView = (NavigationBarLoadingView) this.e.findViewById(R.id.loading_view);
        this.i = navigationBarLoadingView;
        navigationBarLoadingView.setOnClickListener(new View.OnClickListener() { // from class: xq30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.m0(false);
            }
        });
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

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.z <= 0 || !getUserVisibleHint()) {
            return;
        }
        m0(false);
    }

    @Override // defpackage.h42, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        su5<BaseResponse<SportBet>> su5Var;
        super.setUserVisibleHint(z);
        NavigationBarLoadingView navigationBarLoadingView = this.i;
        if (navigationBarLoadingView != null) {
            navigationBarLoadingView.c();
        }
        if (z || (su5Var = this.A) == null) {
            return;
        }
        su5Var.cancel();
        this.A = null;
    }
}
