package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g1t extends yxi {
    public Bundle A;
    public final List<CategoriesResponse> B;
    public final boolean C;
    public final ArrayList D;
    public final GamesLobbyMainFragment y;
    public final TabLayout z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1t(GamesLobbyMainFragment gamesLobbyMainFragment, GamesLobbyMainFragment gamesLobbyMainFragment2, TabLayout tabLayout, Bundle bundle, ArrayList arrayList, boolean z, ArrayList arrayList2) {
        super(gamesLobbyMainFragment);
        arrayList.getClass();
        this.y = gamesLobbyMainFragment2;
        this.z = tabLayout;
        this.A = bundle;
        this.B = arrayList;
        this.C = z;
        this.D = arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.z.getTabCount();
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        List<CategoriesResponse> list = this.B;
        ArrayList arrayList = this.D;
        GamesLobbyMainFragment gamesLobbyMainFragment = this.y;
        TabLayout tabLayout = this.z;
        try {
            if (i >= list.size()) {
                Bundle bundle = this.A;
                tabLayout.getClass();
                arrayList.getClass();
                d1t d1tVar = new d1t();
                d1tVar.c = tabLayout;
                d1tVar.d = bundle;
                d1tVar.v = null;
                d1tVar.w = "";
                d1tVar.i = arrayList;
                d1tVar.s0(gamesLobbyMainFragment);
                return d1tVar;
            }
            if (i == 0) {
                Bundle bundle2 = this.A;
                tabLayout.getClass();
                arrayList.getClass();
                d1t d1tVar2 = new d1t();
                d1tVar2.c = tabLayout;
                d1tVar2.d = bundle2;
                d1tVar2.v = null;
                d1tVar2.w = "";
                d1tVar2.i = arrayList;
                d1tVar2.s0(gamesLobbyMainFragment);
                return d1tVar2;
            }
            if (i == 1) {
                if (this.C) {
                    bbh bbhVar = new bbh();
                    gamesLobbyMainFragment.getClass();
                    bbhVar.A = gamesLobbyMainFragment;
                    return bbhVar;
                }
                Bundle bundle3 = this.A;
                String id = list.get(i).getId();
                String name = list.get(i).getName();
                tabLayout.getClass();
                arrayList.getClass();
                d1t d1tVar3 = new d1t();
                d1tVar3.c = tabLayout;
                d1tVar3.d = bundle3;
                d1tVar3.v = id;
                d1tVar3.w = name;
                d1tVar3.i = arrayList;
                d1tVar3.s0(gamesLobbyMainFragment);
                return d1tVar3;
            }
            int tabCount = tabLayout.getTabCount();
            Bundle bundle4 = this.A;
            if (tabCount == 1) {
                arrayList.getClass();
                d1t d1tVar4 = new d1t();
                d1tVar4.c = tabLayout;
                d1tVar4.d = bundle4;
                d1tVar4.v = null;
                d1tVar4.w = "";
                d1tVar4.i = arrayList;
                d1tVar4.s0(gamesLobbyMainFragment);
                return d1tVar4;
            }
            String id2 = list.get(i).getId();
            String name2 = list.get(i).getName();
            arrayList.getClass();
            d1t d1tVar5 = new d1t();
            d1tVar5.c = tabLayout;
            d1tVar5.d = bundle4;
            d1tVar5.v = id2;
            d1tVar5.w = name2;
            d1tVar5.i = arrayList;
            d1tVar5.s0(gamesLobbyMainFragment);
            return d1tVar5;
        } catch (Exception unused) {
            Bundle bundle5 = this.A;
            tabLayout.getClass();
            arrayList.getClass();
            d1t d1tVar6 = new d1t();
            d1tVar6.c = tabLayout;
            d1tVar6.d = bundle5;
            d1tVar6.v = null;
            d1tVar6.w = "";
            d1tVar6.i = arrayList;
            d1tVar6.s0(gamesLobbyMainFragment);
            return d1tVar6;
        }
    }
}
