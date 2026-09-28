package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class if6 {
    public static final void a(jz5.a aVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            aVar.b(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }
}
