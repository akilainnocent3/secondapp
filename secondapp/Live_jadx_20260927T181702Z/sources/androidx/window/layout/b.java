package androidx.window.layout;

import android.app.Activity;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(24)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f19915a = new b();

    public final boolean a(@oy.l Activity activity) {
        m0.p(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
