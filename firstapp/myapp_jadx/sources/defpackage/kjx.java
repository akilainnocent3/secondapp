package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kjx {
    public static final yfx a(View view) {
        view.getClass();
        yfx yfxVar = (yfx) ld80.e(ld80.j(fd80.c(view, new ijx(0)), new jjx()));
        if (yfxVar != null) {
            return yfxVar;
        }
        lx5.b(view, "View ", " does not have a NavController set");
        return null;
    }
}
