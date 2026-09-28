package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g06 {
    public final w06 a;

    public interface a {
        int a(CaptureRequest captureRequest, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback);

        int b(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback);

        int c(List list, od80 od80Var, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final CameraCaptureSession.CaptureCallback a;
        public final Executor b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.b = executor;
            this.a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.b.execute(new Runnable() { // from class: m06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: i06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.b.execute(new Runnable() { // from class: l06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.b.execute(new Runnable() { // from class: j06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.b.execute(new Runnable() { // from class: n06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureSequenceAborted(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.b.execute(new Runnable() { // from class: k06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.b.execute(new Runnable() { // from class: h06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    public static final class c extends CameraCaptureSession.StateCallback {
        public final CameraCaptureSession.StateCallback a;
        public final Executor b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.b = executor;
            this.a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: o06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: r06
                @Override // java.lang.Runnable
                public final void run() {
                    lm0.a(this.a.a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: p06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: u06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: s06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.b.execute(new Runnable() { // from class: t06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.b.execute(new Runnable() { // from class: q06
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onSurfacePrepared(cameraCaptureSession, surface);
                }
            });
        }
    }

    public g06(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new v06(cameraCaptureSession, null);
        } else {
            this.a = new w06(cameraCaptureSession, new w06.a(handler));
        }
    }
}
