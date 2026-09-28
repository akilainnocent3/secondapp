package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class duh {

    public static final class a {
        public long a;
    }

    public static boolean a(nsz nszVar, huh huhVar, int i, a aVar) {
        long jY = nszVar.y();
        long j = jY >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jY >> 12) & 15);
        int i3 = (int) ((jY >> 8) & 15);
        int i4 = (int) ((jY >> 4) & 15);
        int i5 = (int) ((jY >> 1) & 7);
        boolean z2 = (jY & 1) == 1;
        if (i4 <= 7) {
            if (i4 != huhVar.g - 1) {
                return false;
            }
        } else if (i4 > 10 || huhVar.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == huhVar.i) || z2) {
            return false;
        }
        try {
            long jD = nszVar.D();
            if (!z) {
                jD *= (long) huhVar.b;
            }
            aVar.a = jD;
            int iB = b(i2, nszVar);
            if (iB == -1 || iB > huhVar.b) {
                return false;
            }
            int i6 = huhVar.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != huhVar.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iC = nszVar.C();
                    if (i3 == 14) {
                        iC *= 10;
                    }
                    if (iC != i6) {
                        return false;
                    }
                } else if (nszVar.w() * 1000 != i6) {
                    return false;
                }
            }
            int iW = nszVar.w();
            int i7 = nszVar.b;
            byte[] bArr = nszVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = nszVar.b; i10 < i8; i10++) {
                i9 = jrh0.k[i9 ^ (bArr[i10] & 255)];
            }
            String str = jrh0.a;
            return iW == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, nsz nszVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return nszVar.w() + 1;
            case 7:
                return nszVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
