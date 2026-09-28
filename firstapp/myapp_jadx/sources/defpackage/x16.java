package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class x16 implements p16.a {
    public final CameraDevice a;
    public final Object b;

    public static class a {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }
    }

    public x16(CameraDevice cameraDevice, a aVar) {
        cameraDevice.getClass();
        this.a = cameraDevice;
        this.b = aVar;
    }
}
