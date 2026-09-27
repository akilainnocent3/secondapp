package com.bykv.vk.openvk.hww.hww.hww.vgm;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {
    private static final MessageDigest hww = hww();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final char[] f31589tq = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private tq() {
    }

    private static MessageDigest hww() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String hww(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = hww;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (tq.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return hww(bArrDigest);
    }

    public static String hww(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f31589tq;
            cArr[i10] = cArr2[(b10 & 240) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & c.f161639q];
        }
        return new String(cArr);
    }
}
