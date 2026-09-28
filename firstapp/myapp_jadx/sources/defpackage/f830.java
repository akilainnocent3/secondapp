package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f830 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final zxf0 a = new zxf0(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final nsz b = new nsz();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(nsz nszVar) {
        int i = nszVar.b;
        if (nszVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        nszVar.h(bArr, 0, 9);
        nszVar.I(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return ((j2 & 3) << 13) | ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public final void a(l4h l4hVar) {
        byte[] bArr = jrh0.b;
        this.b.G(bArr.length, bArr);
        this.c = true;
        l4hVar.e();
    }
}
