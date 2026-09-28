package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class vv5 implements e06 {
    public final c4f0 a;
    public final CaptureResult b;

    public vv5(c4f0 c4f0Var, TotalCaptureResult totalCaptureResult) {
        this.a = c4f0Var;
        this.b = totalCaptureResult;
    }

    @Override // defpackage.e06
    public final void a(wug.a aVar) {
        String strValueOf;
        CaptureResult captureResult = this.b;
        super.a(aVar);
        ArrayList arrayList = aVar.a;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                aVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            pgt.i("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            aVar.c("ExposureTime", String.valueOf(l.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            aVar.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            aVar.c("SensitivityType", String.valueOf(3), arrayList);
            aVar.c("PhotographicSensitivity", String.valueOf(Math.min(Settings.DEFAULT_INITIAL_WINDOW_SIZE, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            aVar.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            int iOrdinal = (num3.intValue() == 0 ? wug.b.b : wug.b.a).ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            aVar.c("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // defpackage.e06
    public final c06 b() {
        Integer num = (Integer) this.b.get(CaptureResult.FLASH_STATE);
        c06 c06Var = c06.a;
        if (num == null) {
            return c06Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return c06.b;
        }
        if (iIntValue == 2) {
            return c06.c;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return c06.d;
        }
        pgt.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return c06Var;
    }

    @Override // defpackage.e06
    public final c4f0 c() {
        return this.a;
    }

    @Override // defpackage.e06
    public final long d() {
        Long l = (Long) this.b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.e06
    public final CaptureResult e() {
        return this.b;
    }

    @Override // defpackage.e06
    public final zz5 f() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AF_STATE);
        zz5 zz5Var = zz5.a;
        if (num == null) {
            return zz5Var;
        }
        switch (num.intValue()) {
            case 0:
                return zz5.b;
            case 1:
            case 3:
                return zz5.c;
            case 2:
                return zz5.d;
            case 4:
                return zz5.f;
            case 5:
                return zz5.i;
            case 6:
                return zz5.e;
            default:
                pgt.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return zz5Var;
        }
    }

    @Override // defpackage.e06
    public final b06 g() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AWB_STATE);
        b06 b06Var = b06.a;
        if (num == null) {
            return b06Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return b06.b;
        }
        if (iIntValue == 1) {
            return b06.c;
        }
        if (iIntValue == 2) {
            return b06.d;
        }
        if (iIntValue == 3) {
            return b06.e;
        }
        pgt.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return b06Var;
    }

    @Override // defpackage.e06
    public final xz5 h() {
        Integer num = (Integer) this.b.get(CaptureResult.CONTROL_AE_STATE);
        xz5 xz5Var = xz5.a;
        if (num == null) {
            return xz5Var;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return xz5.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return xz5.e;
            }
            if (iIntValue == 3) {
                return xz5.f;
            }
            if (iIntValue == 4) {
                return xz5.d;
            }
            if (iIntValue != 5) {
                pgt.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return xz5Var;
            }
        }
        return xz5.c;
    }
}
