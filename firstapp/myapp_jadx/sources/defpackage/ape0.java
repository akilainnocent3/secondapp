package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ape0 {

    public static class a {
        public final od80 a;
        public final adl b;
        public final Handler c;
        public final uf6 d;
        public final yj30 e;
        public final yj30 f;

        public a(uf6 uf6Var, adl adlVar, yj30 yj30Var, yj30 yj30Var2, od80 od80Var, Handler handler) {
            this.a = od80Var;
            this.b = adlVar;
            this.c = handler;
            this.d = uf6Var;
            this.e = yj30Var;
            this.f = yj30Var2;
        }
    }

    void a();

    void b();

    int c(List list, sz5 sz5Var);

    void close();

    void d(int i);

    CameraDevice e();

    int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    List<CaptureRequest> g(CaptureRequest captureRequest);

    int h(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    g06 i();

    hpe0 j();

    nv5.d k();

    public static abstract class b {
        public void l(ape0 ape0Var) {
        }

        public void m(ape0 ape0Var) {
        }

        public void n(ape0 ape0Var) {
        }

        public void o(ape0 ape0Var) {
        }

        public void p(ape0 ape0Var) {
        }

        public void q(ape0 ape0Var) {
        }

        public void r(ape0 ape0Var) {
        }

        public void s(ape0 ape0Var, Surface surface) {
        }
    }
}
