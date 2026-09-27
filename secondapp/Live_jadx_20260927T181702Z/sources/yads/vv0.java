package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class vv0 {
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb A[LOOP:0: B:63:0x00c9->B:64:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[RETURN] */
    public static boolean a(jb2 jb2Var, bw0 bw0Var, int i10, uv0 uv0Var) {
        int i11;
        int i12;
        int i13;
        int iM;
        int iM2;
        byte[] bArr;
        int i14;
        int i15;
        long jN = jb2Var.n();
        long j10 = jN >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i16 = (int) ((jN >> 12) & 15);
        int i17 = (int) ((jN >> 8) & 15);
        int i18 = (int) ((jN >> 4) & 15);
        int i19 = (int) ((jN >> 1) & 7);
        boolean z11 = (jN & 1) == 1;
        if (i18 > 7 ? !(i18 > 10 || bw0Var.f147372g != 2) : i18 == bw0Var.f147372g - 1) {
            if ((i19 == 0 || i19 == bw0Var.f147374i) && !z11) {
                try {
                    long jS = jb2Var.s();
                    if (!z10) {
                        jS *= (long) bw0Var.f147367b;
                    }
                    uv0Var.f156652a = jS;
                    switch (i16) {
                        case 1:
                            i11 = 192;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            i12 = i16 - 2;
                            i13 = 576;
                            i11 = i13 << i12;
                            break;
                        case 6:
                            iM = jb2Var.m();
                            i11 = iM + 1;
                            break;
                        case 7:
                            iM = jb2Var.r();
                            i11 = iM + 1;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            i12 = i16 - 8;
                            i13 = 256;
                            i11 = i13 << i12;
                            break;
                        default:
                            i11 = -1;
                            break;
                    }
                    if (i11 != -1 && i11 <= bw0Var.f147367b) {
                        int i20 = bw0Var.f147370e;
                        if (i17 == 0) {
                            iM2 = jb2Var.m();
                            int i21 = jb2Var.f151002b;
                            bArr = jb2Var.f151001a;
                            i14 = i21 - 1;
                            i15 = 0;
                            for (int i22 = jb2Var.f151002b; i22 < i14; i22++) {
                                i15 = ib3.f150530o[i15 ^ (bArr[i22] & 255)];
                            }
                            int i23 = ib3.f150516a;
                            if (iM2 == i15) {
                                return true;
                            }
                        } else if (i17 <= 11) {
                            if (i17 == bw0Var.f147371f) {
                                iM2 = jb2Var.m();
                                int i24 = jb2Var.f151002b;
                                bArr = jb2Var.f151001a;
                                i14 = i24 - 1;
                                i15 = 0;
                                while (i22 < i14) {
                                    i15 = ib3.f150530o[i15 ^ (bArr[i22] & 255)];
                                }
                                int i25 = ib3.f150516a;
                                if (iM2 == i15) {
                                    return true;
                                }
                            }
                        } else if (i17 == 12) {
                            if (jb2Var.m() * 1000 == i20) {
                                iM2 = jb2Var.m();
                                int i26 = jb2Var.f151002b;
                                bArr = jb2Var.f151001a;
                                i14 = i26 - 1;
                                i15 = 0;
                                while (i22 < i14) {
                                    i15 = ib3.f150530o[i15 ^ (bArr[i22] & 255)];
                                }
                                int i27 = ib3.f150516a;
                                if (iM2 == i15) {
                                    return true;
                                }
                            }
                        } else if (i17 <= 14) {
                            int iR = jb2Var.r();
                            if (i17 == 14) {
                                iR *= 10;
                            }
                            if (iR == i20) {
                                iM2 = jb2Var.m();
                                int i28 = jb2Var.f151002b;
                                bArr = jb2Var.f151001a;
                                i14 = i28 - 1;
                                i15 = 0;
                                while (i22 < i14) {
                                    i15 = ib3.f150530o[i15 ^ (bArr[i22] & 255)];
                                }
                                int i29 = ib3.f150516a;
                                if (iM2 == i15) {
                                    return true;
                                }
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }
}
