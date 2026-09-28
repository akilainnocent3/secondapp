package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class b3c implements nck0.b {
    public final e16 a;

    public b3c(e16 e16Var) {
        this.a = e16Var;
    }

    @Override // nck0.b
    public final float b() {
        return 1.0f;
    }

    @Override // nck0.b
    public final float e() {
        Float f = (Float) this.a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // nck0.b
    public final void d() {
    }

    @Override // nck0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // nck0.b
    public final void c(jz5.a aVar) {
    }
}
