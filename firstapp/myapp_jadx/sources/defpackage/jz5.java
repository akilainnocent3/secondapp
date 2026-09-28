package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class jz5 extends hf6 {
    public static final wg1 O = hoa.a.a(Integer.TYPE, "camera2.captureRequest.templateType");
    public static final wg1 P = hoa.a.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");
    public static final wg1 Q = hoa.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");
    public static final wg1 R = hoa.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");
    public static final wg1 S = hoa.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");
    public static final wg1 T;

    public static final class a implements v1h<jz5> {
        public final ftw a = ftw.V();

        @Override // defpackage.v1h
        public final csw a() {
            throw null;
        }

        public final void b(CaptureRequest.Key key, Object obj) {
            this.a.X(jz5.U(key), hoa.b.c, obj);
        }
    }

    static {
        hoa.a.a(Object.class, "camera2.captureRequest.tag");
        T = hoa.a.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");
    }

    public static wg1 U(CaptureRequest.Key key) {
        return new wg1("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
