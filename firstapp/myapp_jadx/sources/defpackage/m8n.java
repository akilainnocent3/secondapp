package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class m8n {
    public static void a(int i, jz5.a aVar) {
        if (((ImageCapturePixelHDRPlusQuirk) zhe.a.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i == 0) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
            Boolean bool = Boolean.TRUE;
            aVar.a.Y(jz5.U(key), bool);
            return;
        }
        if (i != 1) {
            return;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
        Boolean bool2 = Boolean.FALSE;
        aVar.a.Y(jz5.U(key2), bool2);
    }
}
