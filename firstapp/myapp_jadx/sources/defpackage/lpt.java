package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class lpt {
    public final Object a;
    public boolean b;

    public lpt(ow5 ow5Var, e16 e16Var, od80 od80Var) {
        new AtomicInteger(-1);
        this.a = new Object();
        boolean zA = a(e16Var);
        new ssw(-1);
        kpt kptVar = new kpt();
        if (zA) {
            ow5Var.j(kptVar);
        }
    }

    public static boolean a(e16 e16Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) e16Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }
}
