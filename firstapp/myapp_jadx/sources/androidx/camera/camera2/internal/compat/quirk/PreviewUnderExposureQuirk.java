package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.uj30;
import kotlin.Metadata;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/internal/compat/quirk/PreviewUnderExposureQuirk;", "Luj30;", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewUnderExposureQuirk implements uj30 {
    public static final PreviewUnderExposureQuirk a = new PreviewUnderExposureQuirk();
    public static final boolean b = c.l(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }
}
