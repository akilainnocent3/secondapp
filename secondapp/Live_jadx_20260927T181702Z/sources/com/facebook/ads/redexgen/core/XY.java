package com.facebook.ads.redexgen.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class XY {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{c.E, 57, 54, 127, 44, a.f127263w, 60, yr.a.f159811k, 44, yr.a.f159811k, 42, 53, 49, 54, yr.a.f159811k, a.f127263w, 49, 62, a.f127263w, 57, 40, 40, a.f127263w, 49, 43, a.f127263w, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, c.f161640r, c.A, 10, 7, 94, 31, c.f161638p, c.f161638p, 68, 94, 88, 84, 86, c.f161647y, 93, 90, 88, 94, 89, 84, 84, 80, c.f161647y, 73, 94, 90, 88, 79, c.f161647y, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, c.f161643u, c.H, 28, 95, 4, 31, c.B, 5, 8, 66, c.f161647y, 95, 1, c.G, c.f161640r, 8, c.f161646x, 3, 95, 36, 31, c.B, 5, 8, 33, c.G, c.f161640r, 8, c.f161646x, 3, 48, c.f161643u, 5, c.B, 7, c.B, 5, 8};
    }

    static {
        A01();
        A02 = XY.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(T8 t10) {
        boolean z10 = false;
        try {
            PackageManager packageManager = t10.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(t10.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfo.name);
                    if (activityDeclared) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = t10.A05().AAO();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th2) {
            if (t10.A05().AAO()) {
                Log.e(A02, A00(0, 32, 79), th2);
            }
            return false;
        }
    }
}
