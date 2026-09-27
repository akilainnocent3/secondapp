package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(26)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f6063a = new b();

    public final void a(@oy.l Activity activity, @oy.l Rect hint) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(hint, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(hint).build());
    }
}
