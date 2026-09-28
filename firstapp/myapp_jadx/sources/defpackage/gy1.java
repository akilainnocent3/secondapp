package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* JADX INFO: loaded from: classes5.dex */
public final class gy1 implements fy1 {
    public final Activity a;

    public gy1(Activity activity) {
        activity.getClass();
        this.a = activity;
    }

    @Override // defpackage.fy1
    public final irm a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof irm) {
            return (irm) componentCallbacks2;
        }
        return null;
    }
}
