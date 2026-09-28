package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class pf6 extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ qf6 a;

    public pf6(qf6 qf6Var) {
        this.a = qf6Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.a.a) {
            try {
                wf80 wf80Var = this.a.f;
                if (wf80Var == null) {
                    return;
                }
                ue6 ue6Var = wf80Var.g;
                pgt.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                qf6 qf6Var = this.a;
                qf6Var.o.getClass();
                qf6Var.a(Collections.singletonList(v3g0.a(ue6Var)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
