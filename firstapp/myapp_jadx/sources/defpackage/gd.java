package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.sportygames.commons.components.SGHamburgerMenu;

/* JADX INFO: loaded from: classes7.dex */
public final class gd implements g6i0 {
    public final CoordinatorLayout a;
    public final DrawerLayout b;
    public final SGHamburgerMenu c;
    public final NavigationView d;
    public final RelativeLayout e;

    public gd(CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout, SGHamburgerMenu sGHamburgerMenu, NavigationView navigationView, RelativeLayout relativeLayout) {
        this.a = coordinatorLayout;
        this.b = drawerLayout;
        this.c = sGHamburgerMenu;
        this.d = navigationView;
        this.e = relativeLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
