package defpackage;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d0p {
    public final LargeJpegImageQuirk a = (LargeJpegImageQuirk) xhe.a.b(LargeJpegImageQuirk.class);

    /* JADX WARN: Code duplicated, block: B:35:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    public final int a(byte[] bArr) {
        int i;
        byte b;
        if (this.a == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.c() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i2 = 2;
        while (i2 + 4 <= bArr.length && (b = bArr[i2]) == -1) {
            int i3 = i2 + 2;
            int i4 = ((bArr[i3] & 255) << 8) | (bArr[i2 + 3] & 255);
            if (b == -1 && bArr[i2 + 1] == -38) {
                while (true) {
                    i = i3 + 2;
                    if (i > bArr.length) {
                        break;
                    }
                    if (bArr[i3] != -1 || bArr[i3 + 1] != -39) {
                        i3++;
                    }
                    if (i != -1) {
                        return i;
                    }
                    return bArr.length;
                }
            }
            i2 += i4 + 2;
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return bArr.length;
    }
}
