package androidx.window.layout;

import android.view.DisplayCutout;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(28)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final l f19938a = new l();

    public final int a(@oy.l DisplayCutout displayCutout) {
        m0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(@oy.l DisplayCutout displayCutout) {
        m0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(@oy.l DisplayCutout displayCutout) {
        m0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(@oy.l DisplayCutout displayCutout) {
        m0.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
