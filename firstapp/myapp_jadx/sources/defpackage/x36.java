package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class x36 {
    public static final k36 a;

    public static class a {
        public static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {
        public final int a;

        public b(int i, IllegalArgumentException illegalArgumentException) {
            super("Expected camera missing from device.", illegalArgumentException);
            this.a = i;
        }
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new s6s(2));
        a = new k36(linkedHashSet);
    }

    public static void a(Context context, h36 h36Var, k36 k36Var) throws b {
        Integer numB;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            pgt.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + h36Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e = null;
        if (k36Var != null) {
            try {
                numB = k36Var.b();
                if (numB == null) {
                    pgt.i("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e2) {
                pgt.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e2);
                return;
            }
        } else {
            numB = null;
        }
        pgt.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numB);
        PackageManager packageManager = context.getPackageManager();
        int i = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (k36Var == null || numB.intValue() == 1)) {
                k36.c.c(h36Var.c());
                i = 1;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            pgt.j("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (k36Var == null || numB.intValue() == 0)) {
                k36.b.c(h36Var.c());
                i++;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            pgt.j("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e);
        }
        try {
            a.c(h36Var.c());
            pgt.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (e == null) {
            return;
        }
        pgt.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + h36Var.c());
        throw new b(i, e);
    }
}
