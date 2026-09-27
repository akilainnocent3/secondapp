package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static Drawable a(View view) {
        return view.getForeground();
    }

    public static void b(View view, Drawable drawable) {
        view.setForeground(drawable);
    }

    public static boolean c() {
        return true;
    }
}
