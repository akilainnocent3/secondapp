package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x6a0 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x013d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Code duplicated, block: B:88:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c A[RETURN] */
    public static w6a0 b(l4h l4hVar, boolean z, boolean z2) {
        w6a0 w6a0Var;
        int i;
        long jQ;
        int i2;
        int i3;
        int[] iArr;
        long length = l4hVar.getLength();
        long j = -1;
        int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i4 != 0 && length <= 4096) {
            j2 = length;
        }
        int i5 = (int) j2;
        nsz nszVar = new nsz(64);
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            if (i7 < i5) {
                nszVar.F(8);
                boolean z4 = true;
                if (l4hVar.c(nszVar.a, i6, 8, true)) {
                    long jY = nszVar.y();
                    int iJ = nszVar.j();
                    if (jY == 1) {
                        j = j;
                        l4hVar.m(nszVar.a, 8, 8);
                        i2 = 16;
                        nszVar.H(16);
                        jQ = nszVar.q();
                    } else {
                        j = j;
                        if (jY == 0) {
                            long length2 = l4hVar.getLength();
                            if (length2 != j) {
                                jY = (length2 - l4hVar.h()) + 8;
                            }
                        }
                        jQ = jY;
                        i2 = 8;
                    }
                    long j3 = i2;
                    if (jQ < j3) {
                        return new p11();
                    }
                    int i8 = i7 + i2;
                    w6a0Var = null;
                    if (iJ == 1836019574) {
                        i5 += (int) jQ;
                        if (i4 != 0 && i5 > length) {
                            i5 = (int) length;
                        }
                        i7 = i8;
                        i6 = 0;
                    } else if (iJ == 1836019558 || iJ == 1836475768) {
                        i = 1;
                    } else {
                        if (iJ == 1835295092) {
                            z3 = true;
                        }
                        if ((((long) i8) + jQ) - j3 >= i5) {
                            i = 0;
                        } else {
                            int i9 = (int) (jQ - j3);
                            i7 = i8 + i9;
                            if (iJ != 1718909296) {
                                i3 = 0;
                                if (i9 != 0) {
                                    l4hVar.i(i9);
                                }
                            } else {
                                if (i9 < 8) {
                                    return new p11();
                                }
                                nszVar.F(i9);
                                i3 = 0;
                                l4hVar.m(nszVar.a, 0, i9);
                                if (a(nszVar.j(), z2)) {
                                    z3 = true;
                                }
                                nszVar.J(4);
                                int iA = nszVar.a() / 4;
                                if (!z3 && iA > 0) {
                                    iArr = new int[iA];
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= iA) {
                                            z4 = z3;
                                            break;
                                        }
                                        int iJ2 = nszVar.j();
                                        iArr[i10] = iJ2;
                                        if (a(iJ2, z2)) {
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    z4 = z3;
                                    iArr = null;
                                }
                                if (!z4) {
                                    khh0 khh0Var = new khh0();
                                    if (iArr == null || iArr.length == 0) {
                                        return khh0Var;
                                    }
                                    Arrays.copyOf(iArr, iArr.length);
                                    return khh0Var;
                                }
                                z3 = z4;
                            }
                            i6 = i3;
                        }
                    }
                }
                if (!z3) {
                    return cvx.a;
                }
                if (z != i) {
                    return i != 0 ? kf9.b : kf9.c;
                }
                return w6a0Var;
            }
            w6a0Var = null;
            i = i6;
            if (!z3) {
                return cvx.a;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return w6a0Var;
        }
    }
}
