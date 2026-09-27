package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public final class g {
    public static void a(View view, Drawable drawable) {
        if (view.getBackground() != null) {
            drawable.setAlpha(view.getBackground().getAlpha());
        }
        view.setBackground(drawable);
    }
}
