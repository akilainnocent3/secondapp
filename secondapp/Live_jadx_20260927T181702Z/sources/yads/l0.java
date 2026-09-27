package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f151784a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void a(int i10, jb2 jb2Var) {
        jb2Var.c(7);
        byte[] bArr = jb2Var.f151001a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    public static k0 a(ib2 ib2Var) {
        int i10;
        int i11;
        int iA = ib2Var.a(16);
        int iA2 = ib2Var.a(16);
        if (iA2 == 65535) {
            iA2 = ib2Var.a(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iA2 + i10;
        if (iA == 44097) {
            i12 += 2;
        }
        if (ib2Var.a(2) == 3) {
            do {
                ib2Var.a(2);
            } while (ib2Var.e());
        }
        int iA3 = ib2Var.a(10);
        if (ib2Var.e() && ib2Var.a(3) > 0) {
            ib2Var.c(2);
        }
        int i13 = ib2Var.e() ? 48000 : 44100;
        int iA4 = ib2Var.a(4);
        if (i13 == 44100 && iA4 == 13) {
            i11 = f151784a[iA4];
        } else if (i13 == 48000) {
            int[] iArr = f151784a;
            if (iA4 < 14) {
                int i14 = iArr[iA4];
                int i15 = iA3 % 5;
                if (i15 == 1) {
                    if (iA4 != 3 || iA4 == 8) {
                        i11 = i14 + 1;
                    } else {
                        i11 = i14;
                    }
                } else if (i15 != 2) {
                    if (i15 == 3) {
                        if (iA4 != 3) {
                        }
                        i11 = i14 + 1;
                    } else if (i15 == 4 && (iA4 == 3 || iA4 == 8 || iA4 == 11)) {
                        i11 = i14 + 1;
                    } else {
                        i11 = i14;
                    }
                } else if (iA4 == 8 || iA4 == 11) {
                    i11 = i14 + 1;
                } else {
                    i11 = i14;
                }
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        return new k0(i13, i12, i11);
    }
}
