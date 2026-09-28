package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class se6 extends tz5 {
    public final CameraCaptureSession.CaptureCallback a;

    public se6(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
        } else {
            bmy.a("captureCallback is null");
            throw null;
        }
    }
}
