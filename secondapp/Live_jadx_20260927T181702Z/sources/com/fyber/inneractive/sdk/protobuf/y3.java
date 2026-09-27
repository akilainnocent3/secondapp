package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y3 {
    public static boolean a(byte b10) {
        return b10 >= 0;
    }

    public static boolean b(byte b10) {
        return b10 > -65;
    }

    public static void a(byte b10, byte b11, char[] cArr, int i10) throws n1 {
        if (b10 < -62 || b(b11)) {
            throw new n1("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void a(byte b10, byte b11, byte b12, char[] cArr, int i10) throws n1 {
        if (!b(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !b(b12)))) {
            cArr[i10] = (char) (((b10 & zi.c.f161639q) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws n1 {
        if (!b(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !b(b12) && !b(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw new n1("Protocol message had invalid UTF-8.");
    }
}
