package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ocf0 {
    public final boolean a;
    public final boolean b;

    public ocf0(yj30 yj30Var) {
        ArrayList arrayListC = yj30Var.c(CaptureIntentPreviewQuirk.class);
        int size = arrayListC.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            if (((CaptureIntentPreviewQuirk) obj).b()) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.b = yj30Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
