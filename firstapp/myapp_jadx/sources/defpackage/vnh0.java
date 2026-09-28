package defpackage;

import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* JADX INFO: loaded from: classes.dex */
public final class vnh0 {
    public final TorchFlashRequiredFor3aUpdateQuirk a;

    public vnh0(yj30 yj30Var) {
        this.a = (TorchFlashRequiredFor3aUpdateQuirk) yj30Var.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public final boolean a() {
        boolean z = false;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.a;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(Build.VERSION.SDK_INT >= 28 && ow5.n(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        pgt.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z);
        return z;
    }
}
