package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(19)
@Deprecated
public abstract class CastPresentation extends Presentation {
    public CastPresentation(@NonNull Context context, @NonNull Display display) {
        super(context, display);
        zza();
    }

    private final void zza() {
        Window window = getWindow();
        if (window != null) {
            window.setType(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS);
            window.addFlags(268435456);
            window.addFlags(16777216);
            window.addFlags(1024);
        }
    }

    public CastPresentation(@NonNull Context context, @NonNull Display display, int i10) {
        super(context, display, i10);
        zza();
    }
}
