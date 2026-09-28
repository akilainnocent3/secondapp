package defpackage;

import android.graphics.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class uel {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final double a(long j, long j2) {
        int iL = r58.l(j2);
        int iL2 = r58.l(j);
        ThreadLocal<double[]> threadLocal = b78.a;
        if (Color.alpha(iL2) != 255) {
            hoc.a(Integer.toHexString(iL2), "background can not be translucent: #");
            return 0.0d;
        }
        if (Color.alpha(iL) < 255) {
            iL = b78.d(iL, iL2);
        }
        double dC = b78.c(iL) + 0.05d;
        double dC2 = b78.c(iL2) + 0.05d;
        return Math.max(dC, dC2) / Math.min(dC, dC2);
    }

    public static final long b(long j) {
        int i = j58.n;
        long j2 = j58.b;
        double dA = a(j, j2);
        long j3 = j58.f;
        return dA > a(j, j3) ? j2 : j3;
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return d(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b & 240) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
