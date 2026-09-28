package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class nck0 {
    public final ow5 a;
    public final tck0 b;
    public final ssw<Object> c;
    public final b d;
    public boolean e = false;
    public final a f = new a();

    public class a implements ow5.c {
        public a() {
        }

        @Override // ow5.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            nck0.this.d.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c(jz5.a aVar);

        void d();

        float e();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public nck0(ow5 ow5Var, e16 e16Var, od80 od80Var) {
        Range range;
        b oa0Var;
        this.a = ow5Var;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) e16Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                pgt.j("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                oa0Var = new oa0(e16Var);
            } else {
                oa0Var = new b3c(e16Var);
            }
        } else {
            oa0Var = new b3c(e16Var);
        }
        this.d = oa0Var;
        tck0 tck0Var = new tck0(oa0Var.e(), oa0Var.b());
        this.b = tck0Var;
        tck0Var.e();
        this.c = new ssw<>(new xi1(tck0Var.d(), tck0Var.b(), tck0Var.c(), tck0Var.a()));
        ow5Var.j(this.f);
    }
}
