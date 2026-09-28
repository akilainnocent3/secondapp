package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes4.dex */
public final class fef extends AnimatorListenerAdapter {
    public final /* synthetic */ DrawerLayout a;
    public final /* synthetic */ NavigationView b;

    public fef(DrawerLayout drawerLayout, NavigationView navigationView) {
        this.a = drawerLayout;
        this.b = navigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NavigationView navigationView = this.b;
        DrawerLayout drawerLayout = this.a;
        drawerLayout.c(navigationView, false);
        drawerLayout.setScrimColor(-1728053248);
    }
}
