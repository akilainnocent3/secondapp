package com.startapp.simple.bloomfilter.creation;

import cv.k;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
class StringManipulations {
    private static final char[] HEX_CHARS = k.f77221a.toCharArray();

    private boolean encodedLenghtIsNotEven(String str) {
        return str.length() % 2 != 0;
    }

    public String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            char[] cArr2 = HEX_CHARS;
            byte b10 = bArr[i10];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & c.f161639q];
        }
        return new String(cArr);
    }

    public byte[] hexToByte(String str) {
        if (encodedLenghtIsNotEven(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }
}
