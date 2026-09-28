package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;

/* JADX INFO: loaded from: classes7.dex */
public final class nvj extends ViewPager2.g {
    public boolean a;
    public final /* synthetic */ GamesLobbyMainFragment b;
    public final /* synthetic */ int c;

    public nvj(GamesLobbyMainFragment gamesLobbyMainFragment, int i) {
        this.b = gamesLobbyMainFragment;
        this.c = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i) {
        cn80 cn80Var;
        if (i == 1) {
            this.a = false;
        }
        if (i == 2) {
            this.a = true;
        }
        if (i != 0 || this.a) {
            return;
        }
        GamesLobbyMainFragment gamesLobbyMainFragment = this.b;
        int i2 = gamesLobbyMainFragment.F;
        int i3 = this.c - 1;
        if (i2 == i3) {
            cn80 cn80Var2 = (cn80) gamesLobbyMainFragment.b;
            if (cn80Var2 != null) {
                cn80Var2.z.setCurrentItem(0, false);
                return;
            }
            return;
        }
        if (i2 != 0 || (cn80Var = (cn80) gamesLobbyMainFragment.b) == null) {
            return;
        }
        cn80Var.z.setCurrentItem(i3, false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        GamesLobbyMainFragment gamesLobbyMainFragment = this.b;
        gamesLobbyMainFragment.E = i;
        gamesLobbyMainFragment.F = i;
    }
}
