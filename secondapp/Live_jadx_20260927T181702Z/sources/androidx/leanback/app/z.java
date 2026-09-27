package androidx.leanback.app;

import android.annotation.SuppressLint;
import android.app.Fragment;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class z {
    @SuppressLint({"ReferencesDeprecated"})
    public static void a(Fragment fragment, String[] strArr, int i10) {
        fragment.requestPermissions(strArr, i10);
    }
}
