package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;

/* JADX INFO: loaded from: classes7.dex */
public final class qvj extends ViewPager2.g {
    public final /* synthetic */ GamesLobbyMainFragment a;

    public qvj(GamesLobbyMainFragment gamesLobbyMainFragment) {
        this.a = gamesLobbyMainFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        cn80 cn80Var = (cn80) this.a.b;
        if (cn80Var != null) {
            TabLayout tabLayout = cn80Var.C;
            tabLayout.s(cn80Var != null ? tabLayout.k(i) : null, true);
        }
    }
}
