package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s26 extends r26 {
    @Override // defpackage.r26, defpackage.u26, q26.b
    public final CameraCharacteristics b(String str) throws rz5 {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }

    @Override // defpackage.r26, defpackage.u26, q26.b
    public final void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws rz5 {
        try {
            this.a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }
}
