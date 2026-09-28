package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxg0 {
    public static long a(nsz nszVar, int i, int i2) {
        nszVar.I(i);
        if (nszVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = nszVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i2 || (iJ & 32) == 0 || nszVar.w() < 7 || nszVar.a() < 7 || (nszVar.w() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        nszVar.h(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
