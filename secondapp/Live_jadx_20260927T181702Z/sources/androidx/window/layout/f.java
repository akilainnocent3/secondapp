package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(30)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final f f19928a = new f();

    @oy.l
    public final Rect a(@oy.l Activity activity) {
        m0.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        m0.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @oy.l
    public final Rect b(@oy.l Activity activity) {
        m0.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        m0.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
