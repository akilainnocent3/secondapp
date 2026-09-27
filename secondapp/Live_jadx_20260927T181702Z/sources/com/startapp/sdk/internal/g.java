package com.startapp.sdk.internal;

import android.net.Uri;
import android.util.Base64;
import com.ironsource.C4235d4;
import com.startapp.sdk.common.utils.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f74843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f74844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f74845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f74846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f74847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f74848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f74849g;

    static {
        int i10 = p0.f75355a;
        "startapp.".concat(g.class.getSimpleName());
        f74843a = new byte[]{10, zi.c.H, 84, 95, 101, zi.c.f161646x, 0, zi.c.f161638p, zi.c.f161639q, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, zi.c.f161639q, 42, 10, 51, 44, 32};
        f74844b = "ts";
        f74845c = "tsh";
        f74846d = "afh";
        f74847e = "MD5";
        f74848f = "UTF-8";
        f74849g = new byte[]{zi.c.f161636n, 31, 86, 96, 103, 10, 28, zi.c.f161639q, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, zi.c.f161643u, zi.c.f161640r, zi.c.f161643u, zi.c.f161635m, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return "&" + f74844b + C4235d4.j.f61456b + ((String) pair.first) + "&" + f74846d + C4235d4.j.f61456b + ((String) pair.second);
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static Pair c(String str) {
        String strDecode = "";
        if (str != null) {
            try {
                strDecode = URLDecoder.decode(str, f74848f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String strA = a();
        return new Pair(strA, a(strDecode + strA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair pairC = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(f74844b, (String) pairC.first).appendQueryParameter(f74846d, (String) pairC.second).build().toString();
        } catch (Throwable unused) {
            return str + a(pairC);
        }
    }

    public static String a() {
        int iHashCode = Arrays.hashCode(f74843a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iHashCode > 0) {
            int i10 = (int) ((((jCurrentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-iHashCode) & iHashCode) == iHashCode ? (int) ((((long) iHashCode) * ((long) i10)) >> 31) : i10 % iHashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f74843a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bytes[i10];
            byte b11 = bArr[i10];
        }
        byte[] bytes2 = str.getBytes();
        byte b12 = f74843a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b12)];
        for (int i11 = 0; i11 < bytes2.length; i11++) {
            int i12 = i11 % b12;
            bArr2[i12] = (byte) (bArr2[i12] ^ bytes2[i11]);
        }
        byte[] bArr3 = f74843a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f74847e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f74848f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f74849g;
        int iHashCode = bArr2.hashCode();
        long jHashCode = bArr.hashCode();
        if (iHashCode > jHashCode) {
            int i10 = (int) ((((jHashCode * 29509871405L) + 11) & 16777215) >>> 17);
            if (iHashCode >= 1000) {
                int i11 = i10 % iHashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }
}
