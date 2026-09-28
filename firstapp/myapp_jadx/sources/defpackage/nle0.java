package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.f;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class nle0 implements l7 {
    public final /* synthetic */ SwipeDismissBehavior a;

    public nle0(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.l7
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        f fVar = swipeDismissBehavior.b;
        if (fVar != null) {
            fVar.a(view);
        }
        return true;
    }
}
