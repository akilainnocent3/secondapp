package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v06 extends w06 {
    @Override // defpackage.w06, g06.a
    public final int a(CaptureRequest captureRequest, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.setSingleRepeatingRequest(captureRequest, od80Var, captureCallback);
    }

    @Override // defpackage.w06, g06.a
    public final int b(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.setRepeatingBurstRequests(list, od80Var, captureCallback);
    }

    @Override // defpackage.w06, g06.a
    public final int c(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.captureBurstRequests(list, od80Var, captureCallback);
    }
}
