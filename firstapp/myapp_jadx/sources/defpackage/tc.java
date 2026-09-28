package defpackage;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class tc {
    public static Rect a(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
