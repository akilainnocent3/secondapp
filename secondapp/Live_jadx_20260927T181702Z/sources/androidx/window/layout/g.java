package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(17)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final g f19930a = new g();

    public final void a(@oy.l Display display, @oy.l Point point) {
        m0.p(display, "display");
        m0.p(point, "point");
        display.getRealSize(point);
    }
}
