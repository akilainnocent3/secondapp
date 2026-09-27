package f2;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class a {
        @k.t
        public static void a(Menu menu, boolean z10) {
            menu.setGroupDividerEnabled(z10);
        }
    }

    public static void a(@NonNull Menu menu, boolean z10) {
        if (menu instanceof p1.a) {
            ((p1.a) menu).setGroupDividerEnabled(z10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z10);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }
}
