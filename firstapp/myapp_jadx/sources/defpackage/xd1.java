package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class xd1 {
    public final boolean a;
    public final boolean b;

    public xd1(yj30 yj30Var) {
        this.a = yj30Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = zhe.a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
