package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m0e0 {
    public final boolean a;

    public m0e0() {
        this.a = ((StillCaptureFlashStopRepeatingQuirk) zhe.a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z) {
        if (this.a && z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                int iIntValue = ((Integer) ((CaptureRequest) obj).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
