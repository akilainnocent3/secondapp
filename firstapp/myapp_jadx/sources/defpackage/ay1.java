package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ay1 extends o32 {
    public static final byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    public static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    public static final byte[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    public static final byte[] f = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    public final byte[] a;
    public final int b;

    public ay1() {
        byte[] bArr = d == f ? e : c;
        this.a = bArr;
        this.b = 8;
        if ((61 >= bArr.length || bArr[61] == -1) && !Character.isWhitespace(61)) {
            return;
        }
        hb5.a("pad must not be in alphabet or whitespace");
        throw null;
    }

    public final void b(byte[] bArr, int i, o32.a aVar) {
        byte b;
        if (aVar.e) {
            return;
        }
        if (i < 0) {
            aVar.e = true;
        }
        int i2 = this.b - 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == 61) {
                aVar.e = true;
                break;
            }
            byte[] bArrA = o32.a(i2, aVar);
            if (b2 >= 0) {
                byte[] bArr2 = this.a;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (aVar.f + 1) % 8;
                    aVar.f = i6;
                    long j = (aVar.a << 5) + ((long) b);
                    aVar.a = j;
                    if (i6 == 0) {
                        int i7 = aVar.c;
                        int i8 = i7 + 1;
                        aVar.c = i8;
                        bArrA[i7] = (byte) ((j >> 32) & 255);
                        int i9 = i7 + 2;
                        aVar.c = i9;
                        bArrA[i8] = (byte) ((j >> 24) & 255);
                        int i10 = i7 + 3;
                        aVar.c = i10;
                        bArrA[i9] = (byte) ((j >> 16) & 255);
                        int i11 = i7 + 4;
                        aVar.c = i11;
                        bArrA[i10] = (byte) ((j >> 8) & 255);
                        aVar.c = i7 + 5;
                        bArrA[i11] = (byte) (j & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
        }
        if (!aVar.e || aVar.f <= 0) {
            return;
        }
        byte[] bArrA2 = o32.a(i2, aVar);
        switch (aVar.f) {
            case 1:
            case 2:
                int i12 = aVar.c;
                aVar.c = i12 + 1;
                bArrA2[i12] = (byte) ((aVar.a >> 2) & 255);
                break;
            case 3:
                int i13 = aVar.c;
                aVar.c = i13 + 1;
                bArrA2[i13] = (byte) ((aVar.a >> 7) & 255);
                break;
            case 4:
                long j2 = aVar.a;
                long j3 = j2 >> 4;
                aVar.a = j3;
                int i14 = aVar.c;
                int i15 = i14 + 1;
                aVar.c = i15;
                bArrA2[i14] = (byte) ((j2 >> 12) & 255);
                aVar.c = i14 + 2;
                bArrA2[i15] = (byte) (j3 & 255);
                break;
            case 5:
                long j4 = aVar.a;
                long j5 = j4 >> 1;
                aVar.a = j5;
                int i16 = aVar.c;
                int i17 = i16 + 1;
                aVar.c = i17;
                bArrA2[i16] = (byte) ((j4 >> 17) & 255);
                int i18 = i16 + 2;
                aVar.c = i18;
                bArrA2[i17] = (byte) ((j4 >> 9) & 255);
                aVar.c = i16 + 3;
                bArrA2[i18] = (byte) (j5 & 255);
                break;
            case 6:
                long j6 = aVar.a;
                long j7 = j6 >> 6;
                aVar.a = j7;
                int i19 = aVar.c;
                int i20 = i19 + 1;
                aVar.c = i20;
                bArrA2[i19] = (byte) ((j6 >> 22) & 255);
                int i21 = i19 + 2;
                aVar.c = i21;
                bArrA2[i20] = (byte) ((j6 >> 14) & 255);
                aVar.c = i19 + 3;
                bArrA2[i21] = (byte) (j7 & 255);
                break;
            case 7:
                long j8 = aVar.a;
                long j9 = j8 >> 3;
                aVar.a = j9;
                int i22 = aVar.c;
                int i23 = i22 + 1;
                aVar.c = i23;
                bArrA2[i22] = (byte) ((j8 >> 27) & 255);
                int i24 = i22 + 2;
                aVar.c = i24;
                bArrA2[i23] = (byte) ((j8 >> 19) & 255);
                int i25 = i22 + 3;
                aVar.c = i25;
                bArrA2[i24] = (byte) ((j8 >> 11) & 255);
                aVar.c = i22 + 4;
                bArrA2[i25] = (byte) (j9 & 255);
                break;
            default:
                iyi.a(aVar.f, "Impossible modulus ");
                break;
        }
    }
}
