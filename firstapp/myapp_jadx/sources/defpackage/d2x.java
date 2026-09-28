package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.adapter.MyFavoriteAdapter;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public class d2x extends m12 implements rww.a, View.OnClickListener, j9j {
    public a A;
    public ijs B;
    public MyFavoriteAdapter y;
    public iww z;

    public interface a {
        void b(MyFavoriteTypeEnum myFavoriteTypeEnum);
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getA() {
        return "MyTeamActionBarSearchFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof a) {
            this.A = (a) getActivity();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.search_layout) {
            this.z.x1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_team_action_bar_search, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.my_favorite_list);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.search_layout);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        MyFavoriteAdapter myFavoriteAdapter = new MyFavoriteAdapter();
        this.y = myFavoriteAdapter;
        recyclerView.setAdapter(myFavoriteAdapter);
        relativeLayout.setOnClickListener(this);
        if (this.z == null) {
            iww iwwVarA = jww.a(requireActivity(), MyFavoriteTypeEnum.TEAM);
            this.z = iwwVarA;
            iwwVarA.C1();
            this.B = new ijs(this, 1);
            this.z.b.f(getViewLifecycleOwner(), new c2x(this));
            this.z.a.f(requireActivity(), this.B);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ijs ijsVar;
        super.onDestroy();
        iww iwwVar = this.z;
        if (iwwVar == null || (ijsVar = this.B) == null) {
            return;
        }
        iwwVar.a.k(ijsVar);
    }

    @Override // rww.a
    public final void z(int i, rww rwwVar) {
        if (i >= 0) {
            this.y.setData(i, rwwVar);
            boolean z = rwwVar.c;
            iww iwwVar = this.z;
            if (z) {
                iwwVar.B1(new pvw(rwwVar, 9));
            } else {
                iwwVar.B1(new pvw(rwwVar, 11));
            }
        }
    }
}
