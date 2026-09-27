package jf;

import eh.t0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f100045a = 1903435808;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100046b = 1751476579;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100047c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f100048d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f100048d) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(af.n nVar) throws IOException {
        return c(nVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(af.n nVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        int i10;
        long length = nVar.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i11 != 0 && length <= 4096) {
            j11 = length;
        }
        int i12 = (int) j11;
        t0 t0Var = new t0(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 < i12) {
                t0Var.U(8);
                if (nVar.peekFully(t0Var.e(), i13, 8, true)) {
                    long jN = t0Var.N();
                    int iS = t0Var.s();
                    if (jN == 1) {
                        nVar.peekFully(t0Var.e(), 8, 8);
                        t0Var.X(16);
                        i10 = 16;
                        jN = t0Var.E();
                    } else {
                        if (jN == 0) {
                            long length2 = nVar.getLength();
                            if (length2 != j10) {
                                jN = (length2 - nVar.getPeekPosition()) + ((long) 8);
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
                    if (iS == 1836019574) {
                        i12 += (int) jN;
                        if (i11 != 0 && i12 > length) {
                            i12 = (int) length;
                        }
                        i14 = i15;
                        i13 = z14 ? 1 : 0;
                        j10 = -1;
                    } else {
                        if (iS == 1836019558 || iS == 1836475768) {
                            z12 = true;
                            return z13 && z10 == z12;
                        }
                        int i16 = i11;
                        if ((((long) i15) + jN) - j12 < i12) {
                            int i17 = (int) (jN - j12);
                            i14 = i15 + i17;
                            if (iS == 1718909296) {
                                if (i17 < 8) {
                                    return z14;
                                }
                                t0Var.U(i17);
                                nVar.peekFully(t0Var.e(), z14 ? 1 : 0, i17);
                                int i18 = i17 / 4;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if (i19 != 1) {
                                        if (a(t0Var.s(), z11)) {
                                            z13 = true;
                                            break;
                                        }
                                    } else {
                                        t0Var.Z(4);
                                    }
                                }
                                if (!z13) {
                                    return false;
                                }
                            } else if (i17 != 0) {
                                nVar.advancePeekPosition(i17);
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

    public static boolean d(af.n nVar) throws IOException {
        return c(nVar, false, false);
    }

    public static boolean e(af.n nVar, boolean z10) throws IOException {
        return c(nVar, false, z10);
    }
}
