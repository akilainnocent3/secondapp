package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb {
    private static final byte[] hww = hww("VP8X");

    private static byte[] hww(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean hww(byte[] bArr, int i10) {
        try {
            boolean zHww = hww(bArr, i10 + 12, hww);
            int i11 = i10 + 20;
            if (bArr.length <= i11) {
                return false;
            }
            boolean z10 = (bArr[i11] & 2) == 2;
            if (zHww && z10) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean hww(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
