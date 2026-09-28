package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class w16 extends v16 {
    @Override // defpackage.v16, p16.a
    public final void a(ag80 ag80Var) throws rz5 {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) ag80Var.a.m();
        sessionConfiguration.getClass();
        try {
            this.a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }
}
