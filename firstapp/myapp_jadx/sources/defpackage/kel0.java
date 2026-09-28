package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kel0 {
    public static int a(byte[] bArr, int i, iel0 iel0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return b(b, bArr, i2, iel0Var);
        }
        iel0Var.a = b;
        return i2;
    }

    public static int b(int i, byte[] bArr, int i2, iel0 iel0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            iel0Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            iel0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            iel0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            iel0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                iel0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i, iel0 iel0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            iel0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        iel0Var.b = j2;
        return i3;
    }

    public static int d(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long e(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
      0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
    public static int f(byte[] bArr, int i, iel0 iel0Var) {
        int iA = a(bArr, i, iel0Var);
        int i2 = iel0Var.a;
        if (i2 < 0) {
            hrh.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            iel0Var.c = "";
            return iA;
        }
        int i3 = wml0.a;
        int length = bArr.length;
        if ((((length - iA) - i2) | iA | i2) < 0) {
            vqh0.a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i2)});
            return 0;
        }
        int i4 = iA + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iA < i4) {
            byte b = bArr[iA];
            if (b < 0) {
                break;
            }
            iA++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iA < i4) {
            int i6 = iA + 1;
            byte b2 = bArr[iA];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iA = i6;
                while (iA < i4) {
                    byte b3 = bArr[iA];
                    if (b3 < 0) {
                        break;
                    }
                    iA++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            hrh.b("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = iA + 3;
                        byte b5 = bArr[iA + 2];
                        iA += 4;
                        byte b6 = bArr[i7];
                        if (!sml0.a(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !sml0.a(b5) && !sml0.a(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        hrh.b("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        hrh.b("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = iA + 2;
                    byte b7 = bArr[i6];
                    iA += 3;
                    byte b8 = bArr[i10];
                    if (!sml0.a(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!sml0.a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!sml0.a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!sml0.a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!sml0.a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    hrh.b("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    hrh.b("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                iA += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || sml0.a(b9)) {
                    hrh.b("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        iel0Var.c = new String(cArr, 0, i5);
        return i4;
    }

    public static int g(byte[] bArr, int i, iel0 iel0Var) {
        int iA = a(bArr, i, iel0Var);
        int i2 = iel0Var.a;
        if (i2 < 0) {
            hrh.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iA) {
            hrh.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            iel0Var.c = lfl0.b;
            return iA;
        }
        iel0Var.c = lfl0.h(bArr, iA, i2);
        return iA + i2;
    }

    public static int h(Object obj, ill0 ill0Var, byte[] bArr, int i, int i2, iel0 iel0Var) {
        int iB = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iB = b(i3, bArr, iB, iel0Var);
            i3 = iel0Var.a;
        }
        int i4 = iB;
        if (i3 < 0 || i3 > i2 - i4) {
            hrh.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = iel0Var.e + 1;
        iel0Var.e = i5;
        if (i5 >= 100) {
            hrh.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        ill0Var.g(obj, bArr, i4, i6, iel0Var);
        iel0Var.e--;
        iel0Var.c = obj;
        return i6;
    }

    public static int i(Object obj, ill0 ill0Var, byte[] bArr, int i, int i2, int i3, iel0 iel0Var) {
        tkl0 tkl0Var = (tkl0) ill0Var;
        int i4 = iel0Var.e + 1;
        iel0Var.e = i4;
        if (i4 >= 100) {
            hrh.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iT = tkl0Var.t(obj, bArr, i, i2, i3, iel0Var);
        iel0Var.e--;
        iel0Var.c = obj;
        return iT;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, iil0 iil0Var, iel0 iel0Var) {
        vhl0 vhl0Var = (vhl0) iil0Var;
        int iA = a(bArr, i2, iel0Var);
        vhl0Var.zzh(iel0Var.a);
        while (iA < i3) {
            int iA2 = a(bArr, iA, iel0Var);
            if (i != iel0Var.a) {
                break;
            }
            iA = a(bArr, iA2, iel0Var);
            vhl0Var.zzh(iel0Var.a);
        }
        return iA;
    }

    public static int k(byte[] bArr, int i, iil0 iil0Var, iel0 iel0Var) {
        vhl0 vhl0Var = (vhl0) iil0Var;
        int iA = a(bArr, i, iel0Var);
        int i2 = iel0Var.a + iA;
        while (iA < i2) {
            iA = a(bArr, iA, iel0Var);
            vhl0Var.zzh(iel0Var.a);
        }
        if (iA == i2) {
            return iA;
        }
        hrh.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int l(ill0 ill0Var, int i, byte[] bArr, int i2, int i3, iil0 iil0Var, iel0 iel0Var) {
        thl0 thl0VarZza = ill0Var.zza();
        ill0 ill0Var2 = ill0Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        iel0 iel0Var2 = iel0Var;
        int iH = h(thl0VarZza, ill0Var2, bArr2, i2, i4, iel0Var2);
        ill0Var2.f(thl0VarZza);
        iel0Var2.c = thl0VarZza;
        iil0Var.add(thl0VarZza);
        while (iH < i4) {
            iel0 iel0Var3 = iel0Var2;
            int i5 = i4;
            int iA = a(bArr2, iH, iel0Var3);
            if (i != iel0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            ill0 ill0Var3 = ill0Var2;
            thl0 thl0VarZza2 = ill0Var3.zza();
            iH = h(thl0VarZza2, ill0Var3, bArr3, iA, i5, iel0Var3);
            ill0Var2 = ill0Var3;
            bArr2 = bArr3;
            i4 = i5;
            iel0Var2 = iel0Var3;
            ill0Var2.f(thl0VarZza2);
            iel0Var2.c = thl0VarZza2;
            iil0Var.add(thl0VarZza2);
        }
        return iH;
    }

    public static int m(int i, byte[] bArr, int i2, int i3, iml0 iml0Var, iel0 iel0Var) {
        if ((i >>> 3) == 0) {
            hrh.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iC = c(bArr, i2, iel0Var);
            iml0Var.d(i, Long.valueOf(iel0Var.b));
            return iC;
        }
        if (i4 == 1) {
            iml0Var.d(i, Long.valueOf(e(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iA = a(bArr, i2, iel0Var);
            int i5 = iel0Var.a;
            if (i5 < 0) {
                hrh.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iA) {
                hrh.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                iml0Var.d(i, lfl0.b);
            } else {
                iml0Var.d(i, lfl0.h(bArr, iA, i5));
            }
            return iA + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                iml0Var.d(i, Integer.valueOf(d(i2, bArr)));
                return i2 + 4;
            }
            hrh.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        iml0 iml0VarA = iml0.a();
        int i7 = iel0Var.e + 1;
        iel0Var.e = i7;
        if (i7 >= 100) {
            hrh.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iA2 = a(bArr, i2, iel0Var);
            int i9 = iel0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iA2;
                break;
            }
            i2 = m(i9, bArr, iA2, i3, iml0VarA, iel0Var);
            i8 = i9;
        }
        iel0Var.e--;
        if (i2 > i3 || i8 != i6) {
            hrh.b("Failed to parse the message.");
            return 0;
        }
        iml0Var.d(i, iml0VarA);
        return i2;
    }

    public static int n(int i, byte[] bArr, int i2, int i3, iel0 iel0Var) {
        if ((i >>> 3) == 0) {
            hrh.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return c(bArr, i2, iel0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return a(bArr, i2, iel0Var) + iel0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            hrh.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = a(bArr, i2, iel0Var);
            i6 = iel0Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = n(i6, bArr, i2, i3, iel0Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        hrh.b("Failed to parse the message.");
        return 0;
    }
}
