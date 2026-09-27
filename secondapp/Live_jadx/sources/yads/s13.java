package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f155226a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(nq0 nq0Var, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        long length = nq0Var.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        jb2 jb2Var = new jb2(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 < i12) {
                jb2Var.c(8);
                if (nq0Var.b(jb2Var.f151001a, i13, 8, true)) {
                    long jN = jb2Var.n();
                    int iB = jb2Var.b();
                    if (jN == 1) {
                        nq0Var.a(jb2Var.f151001a, 8, 8);
                        jb2Var.d(16);
                        i10 = 16;
                        jN = jb2Var.i();
                    } else {
                        if (jN == 0) {
                            long length2 = nq0Var.getLength();
                            if (length2 != j10) {
                                jN = (length2 - nq0Var.c()) + ((long) 8);
                            }
                        }
                        i10 = 8;
                    }
                    long j12 = i10;
                    if (jN < j12) {
                        return i13;
                    }
                    int i15 = i14 + i10;
                    boolean z14 = i13;
                    if (iB == 1836019574) {
                        i12 += (int) jN;
                        if (i11 != 0 && i12 > length) {
                            i12 = (int) length;
                        }
                        i14 = i15;
                        i13 = z14 ? 1 : 0;
                        j10 = -1;
                    } else {
                        if (iB == 1836019558 || iB == 1836475768) {
                            z12 = true;
                            return z13 && z10 == z12;
                        }
                        int i16 = i11;
                        if ((((long) i15) + jN) - j12 < i12) {
                            int i17 = (int) (jN - j12);
                            i14 = i15 + i17;
                            if (iB == 1718909296) {
                                if (i17 < 8) {
                                    return z14;
                                }
                                jb2Var.c(i17);
                                nq0Var.a(jb2Var.f151001a, z14 ? 1 : 0, i17);
                                int i18 = i17 / 4;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if (i19 != 1) {
                                        int iB2 = jb2Var.b();
                                        if ((iB2 >>> 8) != 3368816 && (iB2 != 1751476579 || !z11)) {
                                            int[] iArr = f155226a;
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 >= 29) {
                                                    continue;
                                                } else if (iArr[i20] != iB2) {
                                                    i20++;
                                                }
                                            }
                                        }
                                        z13 = true;
                                        break;
                                    }
                                    jb2Var.e(jb2Var.f151002b + 4);
                                }
                                if (!z13) {
                                    return false;
                                }
                            } else if (i17 != 0) {
                                nq0Var.b(i17);
                            }
                            i11 = i16;
                            j10 = -1;
                            i13 = 0;
                        }
                    }
                }
            }
            z12 = false;
            if (z13) {
                return false;
            }
        }
    }
}
