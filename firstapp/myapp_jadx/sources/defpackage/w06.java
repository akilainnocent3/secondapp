package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class w06 implements g06.a {
    public final CameraCaptureSession a;
    public final Object b;

    public static class a {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }
    }

    public w06(CameraCaptureSession cameraCaptureSession, a aVar) {
        cameraCaptureSession.getClass();
        this.a = cameraCaptureSession;
        this.b = aVar;
    }

    @Override // g06.a
    public int a(CaptureRequest captureRequest, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.setRepeatingRequest(captureRequest, new g06.b(od80Var, captureCallback), ((a) this.b).a);
    }

    @Override // g06.a
    public int b(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.setRepeatingBurst(list, new g06.b(od80Var, captureCallback), ((a) this.b).a);
    }

    @Override // g06.a
    public int c(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.a.captureBurst(list, new g06.b(od80Var, captureCallback), ((a) this.b).a);
    }
}
