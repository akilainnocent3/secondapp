package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class htf0<T> {
    public T[] a;
    public inf0 b;
    public int e;
    public int c = 7;
    public int f = 0;
    public T[] d = (T[]) new Object[256];
    public final int[] g = new int[40];
    public final int[] h = new int[40];

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object[] objArr, int i, int i2, int i3, inf0 inf0Var) {
        if (i3 == i) {
            i3++;
        }
        while (i3 < i2) {
            Object obj = objArr[i3];
            int i4 = i;
            int i5 = i3;
            while (i4 < i5) {
                int i6 = (i4 + i5) >>> 1;
                if (inf0Var.compare(obj, objArr[i6]) < 0) {
                    i5 = i6;
                } else {
                    i4 = i6 + 1;
                }
            }
            int i7 = i3 - i4;
            if (i7 == 1) {
                objArr[i4 + 1] = objArr[i4];
            } else if (i7 != 2) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i7);
            } else {
                objArr[i4 + 2] = objArr[i4 + 1];
                objArr[i4 + 1] = objArr[i4];
            }
            objArr[i4] = obj;
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Object[] objArr, int i, int i2, inf0 inf0Var) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i + 2;
        if (inf0Var.compare(objArr[i3], objArr[i]) < 0) {
            while (i4 < i2 && inf0Var.compare(objArr[i4], objArr[i4 - 1]) < 0) {
                i4++;
            }
            int i5 = i4 - 1;
            for (int i6 = i; i6 < i5; i6++) {
                Object obj = objArr[i6];
                objArr[i6] = objArr[i5];
                objArr[i5] = obj;
                i5--;
            }
        } else {
            while (i4 < i2 && inf0Var.compare(objArr[i4], objArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(Object obj, Object[] objArr, int i, int i2, int i3, inf0 inf0Var) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (inf0Var.compare(obj, objArr[i6]) > 0) {
            int i7 = i2 - i3;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && inf0Var.compare(obj, objArr[i6 + i9]) > 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i4 = i8 + i3;
            i5 = i7 + i3;
        } else {
            int i12 = i3 + 1;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && inf0Var.compare(obj, objArr[i6 - i14]) <= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i3 - i12;
            int i18 = i3 - i13;
            i4 = i17;
            i5 = i18;
        }
        int i19 = i4 + 1;
        while (i19 < i5) {
            int i20 = ((i5 - i19) >>> 1) + i19;
            if (inf0Var.compare(obj, objArr[i + i20]) > 0) {
                i19 = i20 + 1;
            } else {
                i5 = i20;
            }
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(Object obj, Object[] objArr, int i, int i2, int i3, inf0 inf0Var) {
        int i4;
        int i5;
        int i6 = i + i3;
        if (inf0Var.compare(obj, objArr[i6]) < 0) {
            int i7 = i3 + 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 < i7 && inf0Var.compare(obj, objArr[i6 - i9]) < 0) {
                int i10 = (i9 << 1) + 1;
                if (i10 <= 0) {
                    i8 = i9;
                    i9 = i7;
                } else {
                    int i11 = i9;
                    i9 = i10;
                    i8 = i11;
                }
            }
            if (i9 <= i7) {
                i7 = i9;
            }
            i5 = i3 - i7;
            i4 = i3 - i8;
        } else {
            int i12 = i2 - i3;
            int i13 = 0;
            int i14 = 1;
            while (i14 < i12 && inf0Var.compare(obj, objArr[i6 + i14]) >= 0) {
                int i15 = (i14 << 1) + 1;
                if (i15 <= 0) {
                    i13 = i14;
                    i14 = i12;
                } else {
                    int i16 = i14;
                    i14 = i15;
                    i13 = i16;
                }
            }
            if (i14 <= i12) {
                i12 = i14;
            }
            int i17 = i13 + i3;
            i4 = i3 + i12;
            i5 = i17;
        }
        int i18 = i5 + 1;
        while (i18 < i4) {
            int i19 = ((i4 - i18) >>> 1) + i18;
            if (inf0Var.compare(obj, objArr[i + i19]) < 0) {
                i4 = i19;
            } else {
                i18 = i19 + 1;
            }
        }
        return i4;
    }

    public final T[] c(int i) {
        this.e = Math.max(this.e, i);
        T[] tArr = this.d;
        if (tArr.length >= i) {
            return tArr;
        }
        int i2 = (i >> 1) | i;
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        int i6 = (i5 | (i5 >> 16)) + 1;
        if (i6 >= 0) {
            i = Math.min(i6, this.a.length >>> 1);
        }
        T[] tArr2 = (T[]) new Object[i];
        this.d = tArr2;
        return tArr2;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x011a A[EDGE_INSN: B:148:0x011a->B:55:0x011a BREAK  A[LOOP:0: B:21:0x007c->B:77:0x0147, LOOP_LABEL: LOOP:0: B:21:0x007c->B:77:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[LOOP:1: B:22:0x007e->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[PHI: r3 r6 r12
      0x00d8: PHI (r3v23 int) = (r3v22 int), (r3v33 int) binds: [B:38:0x00cd, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r6v24 int) = (r6v23 int), (r6v26 int) binds: [B:38:0x00cd, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r12v17 int) = (r12v16 int), (r12v21 int) binds: [B:38:0x00cd, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x0152 A[LOOP:2: B:37:0x00b7->B:78:0x0152, LOOP_END] */
    public final void f(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        T[] tArr;
        int i7;
        inf0 inf0Var;
        int iE;
        int i8;
        int i9;
        int i10;
        int iD;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        int i13;
        int[] iArr = this.g;
        int i14 = iArr[i];
        int[] iArr2 = this.h;
        int i15 = iArr2[i];
        int i16 = i + 1;
        int i17 = iArr[i16];
        int i18 = iArr2[i16];
        iArr2[i] = i15 + i18;
        int i19 = this.f;
        if (i == i19 - 3) {
            int i20 = i + 2;
            iArr[i16] = iArr[i20];
            iArr2[i16] = iArr2[i20];
        }
        int i21 = 1;
        this.f = i19 - 1;
        T[] tArr2 = this.a;
        int iE2 = e(tArr2[i17], tArr2, i14, i15, 0, this.b);
        int i22 = i14 + iE2;
        int i23 = i15 - iE2;
        if (i23 == 0) {
            return;
        }
        T[] tArr3 = this.a;
        int i24 = i22 + i23;
        int i25 = i24 - 1;
        int iD2 = d(tArr3[i25], tArr3, i17, i18, i18 - 1, this.b);
        if (iD2 == 0) {
            return;
        }
        T[] tArr4 = this.a;
        int i26 = 0;
        if (i23 > iD2) {
            T[] tArrC = c(iD2);
            System.arraycopy(tArr4, i17, tArrC, 0, iD2);
            int i27 = iD2 - 1;
            int i28 = i17 + iD2;
            int i29 = i28 - 1;
            int i30 = i28 - 2;
            int i31 = i24 - 2;
            tArr4[i29] = tArr4[i25];
            int i32 = i23 - 1;
            if (i32 == 0) {
                System.arraycopy(tArrC, 0, tArr4, i30 - i27, iD2);
                return;
            }
            if (iD2 == 1) {
                int i33 = i30 - i32;
                System.arraycopy(tArr4, (i31 - i32) + 1, tArr4, i33 + 1, i32);
                tArr4[i33] = tArrC[i27];
                return;
            }
            inf0 inf0Var2 = this.b;
            int i34 = this.c;
            loop3: while (true) {
                int i35 = i30;
                int i36 = 0;
                int i37 = 0;
                while (true) {
                    int i38 = i21;
                    if (inf0Var2.compare(tArrC[i27], tArr4[i31]) >= 0) {
                        i2 = i35 - 1;
                        i3 = i27 - 1;
                        tArr4[i35] = tArrC[i27];
                        i36++;
                        iD2--;
                        i4 = i38;
                        if (iD2 != i4) {
                            i27 = i3;
                            i37 = 0;
                        }
                        i5 = i4;
                        i27 = i3;
                        break loop3;
                    }
                    i2 = i35 - 1;
                    tArr4[i35] = tArr4[i31];
                    i37++;
                    i32--;
                    i31--;
                    if (i32 == 0) {
                        i5 = i38;
                        break loop3;
                    }
                    i36 = 0;
                    i35 = i2;
                    if ((i37 | i36) >= i34) {
                        int i39 = i32;
                        i2 = i35;
                        while (true) {
                            T[] tArr5 = tArr4;
                            inf0 inf0Var3 = inf0Var2;
                            tArr4 = tArr5;
                            int iE3 = i39 - e(tArrC[i27], tArr5, i22, i39, i39 - 1, inf0Var3);
                            if (iE3 != 0) {
                                i2 -= iE3;
                                i31 -= iE3;
                                i32 = i39 - iE3;
                                System.arraycopy(tArr4, i31 + 1, tArr4, i2 + 1, iE3);
                                if (i32 == 0) {
                                }
                                i5 = 1;
                                break loop3;
                            }
                            i32 = i39;
                            int i40 = i2 - 1;
                            i3 = i27 - 1;
                            tArr4[i2] = tArrC[i27];
                            int i41 = iD2 - 1;
                            i4 = 1;
                            if (i41 == 1) {
                                iD2 = i41;
                                i2 = i40;
                                i5 = i4;
                                i27 = i3;
                                break loop3;
                            }
                            int iD3 = i41 - d(tArr4[i31], tArrC, 0, i41, iD2 - 2, inf0Var3);
                            if (iD3 != 0) {
                                int i42 = i40 - iD3;
                                i27 = i3 - iD3;
                                int i43 = i41 - iD3;
                                System.arraycopy(tArrC, i27 + 1, tArr4, i42 + 1, iD3);
                                if (i43 <= 1) {
                                    i2 = i42;
                                    iD2 = i43;
                                    i5 = 1;
                                    break loop3;
                                }
                                i40 = i42;
                                iD2 = i43;
                            } else {
                                i27 = i3;
                                iD2 = i41;
                            }
                            int i44 = i40 - 1;
                            int i45 = i31 - 1;
                            tArr4[i40] = tArr4[i31];
                            i39 = i32 - 1;
                            if (i39 == 0) {
                                i2 = i44;
                                i31 = i45;
                                i32 = i39;
                                i5 = 1;
                                break loop3;
                            }
                            i34--;
                            if (!(iD3 >= 7) && !(iE3 >= 7)) {
                                if (i34 < 0) {
                                    i34 = 0;
                                }
                                i34 += 2;
                                i21 = 1;
                                i30 = i44;
                                i31 = i45;
                                i32 = i39;
                                inf0Var2 = inf0Var3;
                            } else {
                                i2 = i44;
                                i31 = i45;
                                inf0Var2 = inf0Var3;
                            }
                        }
                    } else {
                        i21 = 1;
                    }
                }
            }
            if (i34 < i5) {
                i34 = i5;
            }
            this.c = i34;
            if (iD2 == i5) {
                int i46 = i2 - i32;
                System.arraycopy(tArr4, (i31 - i32) + i5, tArr4, i46 + 1, i32);
                tArr4[i46] = tArrC[i27];
                return;
            } else if (iD2 != 0) {
                System.arraycopy(tArrC, 0, tArr4, i2 - (iD2 - 1), iD2);
                return;
            } else {
                hb5.a("Comparison method violates its general contract!");
                return;
            }
        }
        T[] tArrC2 = c(i23);
        System.arraycopy(tArr4, i22, tArrC2, 0, i23);
        int i47 = i22 + 1;
        int i48 = i17 + 1;
        tArr4[i22] = tArr4[i17];
        int i49 = iD2 - 1;
        if (i49 == 0) {
            System.arraycopy(tArrC2, 0, tArr4, i47, i23);
            return;
        }
        if (i23 == 1) {
            System.arraycopy(tArr4, i48, tArr4, i47, i49);
            tArr4[i47 + i49] = tArrC2[0];
            return;
        }
        inf0 inf0Var4 = this.b;
        int i50 = this.c;
        int i51 = 0;
        loop0: while (true) {
            int i52 = i26;
            int i53 = i52;
            while (true) {
                if (inf0Var4.compare(tArr4[i48], tArrC2[i51]) < 0) {
                    i6 = i47 + 1;
                    int i54 = i48 + 1;
                    tArr4[i47] = tArr4[i48];
                    i53++;
                    i49--;
                    if (i49 == 0) {
                        i47 = i6;
                        i48 = i54;
                        tArr = tArrC2;
                        break loop0;
                    }
                    i48 = i54;
                    i52 = 0;
                    i47 = i6;
                    if ((i52 | i53) >= i50) {
                        i7 = i51;
                        while (true) {
                            int i55 = i23;
                            T[] tArr6 = tArrC2;
                            inf0Var = inf0Var4;
                            iE = e(tArr4[i48], tArr6, i7, i55, 0, inf0Var);
                            tArr = tArr6;
                            i51 = i7;
                            i23 = i55;
                            if (iE != 0) {
                                System.arraycopy(tArr, i51, tArr4, i47, iE);
                                i47 += iE;
                                i51 += iE;
                                i23 -= iE;
                                if (i23 <= 1) {
                                    break loop0;
                                }
                                i8 = i47 + 1;
                                i9 = i48 + 1;
                                tArr4[i47] = tArr4[i48];
                                i10 = i49 - 1;
                                if (i10 == 0) {
                                    i47 = i8;
                                    i48 = i9;
                                    i49 = i10;
                                    break loop0;
                                }
                                iD = d(tArr[i51], tArr4, i9, i10, 0, inf0Var);
                                i48 = i9;
                                if (iD != 0) {
                                    System.arraycopy(tArr4, i48, tArr4, i8, iD);
                                    i12 = i8 + iD;
                                    i48 += iD;
                                    i13 = i10 - iD;
                                    if (i13 == 0) {
                                        i47 = i12;
                                        i49 = i13;
                                        break loop0;
                                    } else {
                                        i8 = i12;
                                        i49 = i13;
                                    }
                                } else {
                                    i49 = i10;
                                }
                                i11 = i8 + 1;
                                i7 = i51 + 1;
                                tArr4[i8] = tArr[i51];
                                i23--;
                                if (i23 == 1) {
                                    i47 = i11;
                                    i51 = i7;
                                    break loop0;
                                }
                                i50--;
                                if (iE >= 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (iD >= 7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z && !z2) {
                                    break;
                                }
                                tArrC2 = tArr;
                                i47 = i11;
                                inf0Var4 = inf0Var;
                            } else {
                                i8 = i47 + 1;
                                i9 = i48 + 1;
                                tArr4[i47] = tArr4[i48];
                                i10 = i49 - 1;
                                if (i10 == 0) {
                                    i47 = i8;
                                    i48 = i9;
                                    i49 = i10;
                                    break loop0;
                                }
                                iD = d(tArr[i51], tArr4, i9, i10, 0, inf0Var);
                                i48 = i9;
                                if (iD != 0) {
                                    System.arraycopy(tArr4, i48, tArr4, i8, iD);
                                    i12 = i8 + iD;
                                    i48 += iD;
                                    i13 = i10 - iD;
                                    if (i13 == 0) {
                                        i47 = i12;
                                        i49 = i13;
                                        break loop0;
                                    } else {
                                        i8 = i12;
                                        i49 = i13;
                                    }
                                } else {
                                    i49 = i10;
                                }
                                i11 = i8 + 1;
                                i7 = i51 + 1;
                                tArr4[i8] = tArr[i51];
                                i23--;
                                if (i23 == 1) {
                                    i47 = i11;
                                    i51 = i7;
                                    break loop0;
                                }
                                i50--;
                                if (iE >= 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (iD >= 7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z && !z2) {
                                    break;
                                }
                                tArrC2 = tArr;
                                i47 = i11;
                                inf0Var4 = inf0Var;
                            }
                        }
                        if (i50 < 0) {
                            i50 = 0;
                        }
                        i50 += 2;
                        tArrC2 = tArr;
                        i47 = i11;
                        i51 = i7;
                        inf0Var4 = inf0Var;
                        i26 = 0;
                    }
                } else {
                    i6 = i47 + 1;
                    int i56 = i51 + 1;
                    tArr4[i47] = tArrC2[i51];
                    i52++;
                    i23--;
                    if (i23 == 1) {
                        i47 = i6;
                        i51 = i56;
                        tArr = tArrC2;
                        break loop0;
                    }
                    i51 = i56;
                    i53 = 0;
                    i47 = i6;
                    if ((i52 | i53) >= i50) {
                        i7 = i51;
                        while (true) {
                            int i57 = i23;
                            T[] tArr7 = tArrC2;
                            inf0Var = inf0Var4;
                            iE = e(tArr4[i48], tArr7, i7, i57, 0, inf0Var);
                            tArr = tArr7;
                            i51 = i7;
                            i23 = i57;
                            if (iE != 0) {
                                System.arraycopy(tArr, i51, tArr4, i47, iE);
                                i47 += iE;
                                i51 += iE;
                                i23 -= iE;
                                if (i23 <= 1) {
                                    break loop0;
                                    break loop0;
                                }
                                i8 = i47 + 1;
                                i9 = i48 + 1;
                                tArr4[i47] = tArr4[i48];
                                i10 = i49 - 1;
                                if (i10 == 0) {
                                    i47 = i8;
                                    i48 = i9;
                                    i49 = i10;
                                    break loop0;
                                }
                                iD = d(tArr[i51], tArr4, i9, i10, 0, inf0Var);
                                i48 = i9;
                                if (iD != 0) {
                                    System.arraycopy(tArr4, i48, tArr4, i8, iD);
                                    i12 = i8 + iD;
                                    i48 += iD;
                                    i13 = i10 - iD;
                                    if (i13 == 0) {
                                        i47 = i12;
                                        i49 = i13;
                                        break loop0;
                                    } else {
                                        i8 = i12;
                                        i49 = i13;
                                    }
                                } else {
                                    i49 = i10;
                                }
                                i11 = i8 + 1;
                                i7 = i51 + 1;
                                tArr4[i8] = tArr[i51];
                                i23--;
                                if (i23 == 1) {
                                    i47 = i11;
                                    i51 = i7;
                                    break loop0;
                                }
                                i50--;
                                if (iE >= 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (iD >= 7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z && !z2) {
                                    break;
                                }
                                tArrC2 = tArr;
                                i47 = i11;
                                inf0Var4 = inf0Var;
                            } else {
                                i8 = i47 + 1;
                                i9 = i48 + 1;
                                tArr4[i47] = tArr4[i48];
                                i10 = i49 - 1;
                                if (i10 == 0) {
                                    i47 = i8;
                                    i48 = i9;
                                    i49 = i10;
                                    break loop0;
                                }
                                iD = d(tArr[i51], tArr4, i9, i10, 0, inf0Var);
                                i48 = i9;
                                if (iD != 0) {
                                    System.arraycopy(tArr4, i48, tArr4, i8, iD);
                                    i12 = i8 + iD;
                                    i48 += iD;
                                    i13 = i10 - iD;
                                    if (i13 == 0) {
                                        i47 = i12;
                                        i49 = i13;
                                        break loop0;
                                    } else {
                                        i8 = i12;
                                        i49 = i13;
                                    }
                                } else {
                                    i49 = i10;
                                }
                                i11 = i8 + 1;
                                i7 = i51 + 1;
                                tArr4[i8] = tArr[i51];
                                i23--;
                                if (i23 == 1) {
                                    i47 = i11;
                                    i51 = i7;
                                    break loop0;
                                }
                                i50--;
                                if (iE >= 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (iD >= 7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z && !z2) {
                                    break;
                                }
                                tArrC2 = tArr;
                                i47 = i11;
                                inf0Var4 = inf0Var;
                            }
                        }
                        if (i50 < 0) {
                            i50 = 0;
                        }
                        i50 += 2;
                        tArrC2 = tArr;
                        i47 = i11;
                        i51 = i7;
                        inf0Var4 = inf0Var;
                        i26 = 0;
                    }
                }
            }
        }
        if (i50 < 1) {
            i50 = 1;
        }
        this.c = i50;
        if (i23 == 1) {
            System.arraycopy(tArr4, i48, tArr4, i47, i49);
            tArr4[i47 + i49] = tArr[i51];
        } else if (i23 != 0) {
            System.arraycopy(tArr, i51, tArr4, i47, i23);
        } else {
            hb5.a("Comparison method violates its general contract!");
        }
    }
}
