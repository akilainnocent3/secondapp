package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements nck0.b {
    public final Range<Float> a;
    public final boolean b;

    public oa0(e16 e16Var) {
        this.b = false;
        this.a = (Range) e16Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.b = e16Var.f();
    }

    @Override // nck0.b
    public final float b() {
        return ((Float) this.a.getLower()).floatValue();
    }

    @Override // nck0.b
    public final void c(jz5.a aVar) {
        aVar.b(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f));
        if (this.b) {
            if6.a(aVar);
        }
    }

    @Override // nck0.b
    public final float e() {
        return ((Float) this.a.getUpper()).floatValue();
    }

    @Override // nck0.b
    public final void d() {
    }

    @Override // nck0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }
}
