package androidx.activity;

import android.view.View;
import android.view.Window;
import f2.p2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(21)
public final class u extends d0 {
    @Override // androidx.activity.d0, androidx.activity.e0
    @k.t
    public void b(@oy.l s0 statusBarStyle, @oy.l s0 navigationBarStyle, @oy.l Window window, @oy.l View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.m0.p(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.m0.p(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.m0.p(window, "window");
        kotlin.jvm.internal.m0.p(view, "view");
        p2.c(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
