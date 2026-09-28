package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p16 {
    public final v16 a;

    public interface a {
        void a(ag80 ag80Var);
    }

    public static final class b extends CameraDevice.StateCallback {
        public final CameraDevice.StateCallback a;
        public final Executor b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.b = executor;
            this.a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: q16
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: s16
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(final CameraDevice cameraDevice, final int i) {
            this.b.execute(new Runnable() { // from class: r16
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onError(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(final CameraDevice cameraDevice) {
            this.b.execute(new Runnable() { // from class: t16
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.onOpened(cameraDevice);
                }
            });
        }
    }

    public p16(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new v16(cameraDevice, new x16.a(handler));
        } else {
            cameraDevice.getClass();
            this.a = new w16(cameraDevice, null);
        }
    }
}
