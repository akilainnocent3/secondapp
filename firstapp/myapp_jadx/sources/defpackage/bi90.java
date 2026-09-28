package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import androidx.window.layout.SidecarCompat;

/* JADX INFO: loaded from: classes.dex */
public final class bi90 implements ComponentCallbacks {
    public final /* synthetic */ SidecarCompat a;
    public final /* synthetic */ Activity b;

    public bi90(SidecarCompat sidecarCompat, Activity activity) {
        this.a = sidecarCompat;
        this.b = activity;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        SidecarCompat sidecarCompat = this.a;
        SidecarCompat.b bVar = sidecarCompat.e;
        if (bVar == null) {
            return;
        }
        Activity activity = this.b;
        bVar.a(activity, sidecarCompat.c(activity));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
