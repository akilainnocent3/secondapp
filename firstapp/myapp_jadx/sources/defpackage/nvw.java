package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.adapter.MyFavoriteAdapter;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.TeamSearchEmptyLayout;
import com.sportybet.plugin.realsports.data.MyFavoriteLeague;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class nvw extends m12 implements rww.a {
    public String B;
    public iww C;
    public TabLayout D;
    public MyFavoriteTypeEnum y;
    public MyFavoriteAdapter z;
    public final ArrayList<rww> A = new ArrayList<>();
    public int E = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList m0(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        if (i == 0) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                rww rwwVar = (rww) obj;
                T t = rwwVar.i;
                if ((t instanceof MyFavoriteLeague) && ((MyFavoriteLeague) t).isTopLeague) {
                    arrayList2.add(rwwVar);
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                rww rwwVar2 = (rww) obj2;
                T t2 = rwwVar2.i;
                if ((t2 instanceof MyFavoriteLeague) && !((MyFavoriteLeague) t2).isTopLeague) {
                    arrayList2.add(rwwVar2);
                }
            }
        }
        return arrayList2;
    }

    public final void n0() {
        this.z.setEmptyView((TeamSearchEmptyLayout) LayoutInflater.from(getContext()).inflate(R.layout.my_team_search_empty_layout, (ViewGroup) null, false));
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.y = (MyFavoriteTypeEnum) getArguments().getSerializable("favorite_type");
            this.B = getArguments().getString("sport");
        }
        this.C = jww.a(requireActivity(), this.y);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_my_favorite_base, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.my_favorite_list);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        MyFavoriteAdapter myFavoriteAdapter = new MyFavoriteAdapter();
        this.z = myFavoriteAdapter;
        recyclerView.setAdapter(myFavoriteAdapter);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R.id.category_tab);
        this.D = tabLayout;
        if (this.y != MyFavoriteTypeEnum.LEAGUE) {
            tabLayout.setVisibility(8);
            return viewInflate;
        }
        tabLayout.setTabGravity(0);
        this.D.setTabMode(0);
        this.D.setSelectedTabIndicatorHeight(zch0.a(viewInflate.getContext(), 4));
        this.D.setSelectedTabIndicatorColor(getResources().getColor(R.color.brand_secondary));
        this.D.a(new lvw(this));
        List listE = sn5.e(this, R.array.my_leauges_tab);
        this.D.n();
        int i = 0;
        while (true) {
            int size = listE.size();
            TabLayout tabLayout2 = this.D;
            if (i >= size) {
                tabLayout2.setVisibility(0);
                return viewInflate;
            }
            TabLayout.g gVarL = tabLayout2.l();
            gVarL.e((CharSequence) listE.get(i));
            this.D.b(gVarL);
            i++;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.C.a.f(getViewLifecycleOwner(), new mvw(this));
        if (this.y == MyFavoriteTypeEnum.LEAGUE) {
            this.C.d.f(getViewLifecycleOwner(), new lfy() { // from class: kvw
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    nvw nvwVar = this.a;
                    int i = nvwVar.E;
                    if (i == 0 && nvw.m0(i, nvwVar.A).isEmpty() && !nvwVar.z.hasEmptyView()) {
                        nvwVar.n0();
                        TabLayout tabLayout = nvwVar.D;
                        tabLayout.s(tabLayout.k(1), true);
                    }
                }
            });
        }
    }

    @Override // rww.a
    public final void z(int i, rww rwwVar) {
        if (i >= 0) {
            this.z.setData(i, rwwVar);
            int i2 = rwwVar.c ? 2 : 3;
            iww iwwVar = this.C;
            if (iwwVar != null) {
                String str = this.B;
                ovw ovwVar = new ovw();
                ovwVar.a = str;
                ovwVar.b = rwwVar;
                iwwVar.B1(new pvw(ovwVar, i2));
            }
        }
    }
}
