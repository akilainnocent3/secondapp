package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class jc1 {
    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        try {
            return String.format(Locale.US, "%.2f", Double.valueOf(Double.parseDouble(str)));
        } catch (Exception unused) {
            return "";
        }
    }
}
