package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x26 {
    public static int a(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (pgt.g(2, pgt.h("CameraOrientationUtil"))) {
            StringBuilder sbA = dy5.a("getRelativeImageRotation: destRotationDegrees=", i, i2, ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbA.append(z);
            sbA.append(", result=");
            sbA.append(i3);
            pgt.a("CameraOrientationUtil", sbA.toString());
        }
        return i3;
    }

    public static int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        hb5.a(hce0.a(i, "Unsupported surface rotation: "));
        return 0;
    }
}
