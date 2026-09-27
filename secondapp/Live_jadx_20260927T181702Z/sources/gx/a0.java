package gx;

import cv.k0;
import dr.w2;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n67#3:77\n73#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class a0 {
    @oy.l
    public static final byte[] a(@oy.l String str) {
        int i10;
        char cCharAt;
        m0.p(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (m0.t(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i12 = i11;
                while (i11 < length2) {
                    char cCharAt3 = str.charAt(i11);
                    if (m0.t(cCharAt3, 128) < 0) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) cCharAt3;
                        i11++;
                        while (true) {
                            i12 = i13;
                            if (i11 >= length2 || m0.t(str.charAt(i11), 128) >= 0) {
                                break;
                            }
                            i13 = i12 + 1;
                            bArr[i12] = (byte) str.charAt(i11);
                            i11++;
                        }
                    } else {
                        if (m0.t(cCharAt3, 2048) < 0) {
                            bArr[i12] = (byte) ((cCharAt3 >> 6) | 192);
                            i12 += 2;
                            bArr[i12 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i12] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i12 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i12 += 3;
                            bArr[i12 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (m0.t(cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt >= 57344) {
                            bArr[i12] = 63;
                            i11++;
                            i12++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i10)) - 56613888;
                            bArr[i12] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i12 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i12 + 3] = (byte) ((iCharAt & 63) | 128);
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
                m0.o(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i11] = (byte) cCharAt2;
            i11++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        m0.o(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    @oy.l
    public static final String b(@oy.l byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        m0.p(bArr, "<this>");
        if (i18 < 0 || i11 > bArr.length || i18 > i11) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i18 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i18];
        int i19 = 0;
        while (i18 < i11) {
            byte b10 = bArr[i18];
            if (b10 >= 0) {
                i12 = i19 + 1;
                cArr[i19] = (char) b10;
                i18++;
                while (i18 < i11) {
                    byte b11 = bArr[i18];
                    if (b11 < 0) {
                        break;
                    }
                    i18++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                w2 w2Var = w2.f79517a;
            } else if ((b10 >> 5) == -2) {
                int i20 = i18 + 1;
                if (i11 <= i20) {
                    i12 = i19 + 1;
                    cArr[i19] = (char) 65533;
                } else {
                    byte b12 = bArr[i20];
                    if ((b12 & l3.a.f103436o7) == 128) {
                        int i21 = (b10 << 6) ^ (b12 ^ 3968);
                        if (i21 < 128) {
                            i12 = i19 + 1;
                            cArr[i19] = (char) 65533;
                        } else {
                            i12 = i19 + 1;
                            cArr[i19] = (char) i21;
                        }
                        w2 w2Var2 = w2.f79517a;
                        i13 = 2;
                    } else {
                        i12 = i19 + 1;
                        cArr[i19] = (char) 65533;
                    }
                    i18 += i13;
                    w2 w2Var3 = w2.f79517a;
                }
                w2 w2Var4 = w2.f79517a;
                i13 = 1;
                i18 += i13;
                w2 w2Var5 = w2.f79517a;
            } else if ((b10 >> 4) == -2) {
                int i22 = i18 + 2;
                if (i11 <= i22) {
                    i12 = i19 + 1;
                    cArr[i19] = (char) 65533;
                    w2 w2Var6 = w2.f79517a;
                    int i23 = i18 + 1;
                    i14 = (i11 <= i23 || (bArr[i23] & l3.a.f103436o7) != 128) ? 1 : 2;
                } else {
                    byte b13 = bArr[i18 + 1];
                    if ((b13 & l3.a.f103436o7) == 128) {
                        byte b14 = bArr[i22];
                        if ((b14 & l3.a.f103436o7) == 128) {
                            int i24 = (b10 << zi.c.f161636n) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                            if (i24 < 2048) {
                                i12 = i19 + 1;
                                cArr[i19] = (char) 65533;
                            } else if (55296 > i24 || i24 >= 57344) {
                                i12 = i19 + 1;
                                cArr[i19] = (char) i24;
                            } else {
                                i12 = i19 + 1;
                                cArr[i19] = (char) 65533;
                            }
                            w2 w2Var7 = w2.f79517a;
                            i14 = 3;
                        } else {
                            i12 = i19 + 1;
                            cArr[i19] = (char) 65533;
                            w2 w2Var8 = w2.f79517a;
                        }
                    } else {
                        i12 = i19 + 1;
                        cArr[i19] = (char) 65533;
                        w2 w2Var9 = w2.f79517a;
                    }
                }
                i18 += i14;
                w2 w2Var10 = w2.f79517a;
            } else {
                if ((b10 >> 3) == -2) {
                    int i25 = i18 + 3;
                    if (i11 <= i25) {
                        i15 = i19 + 1;
                        cArr[i19] = 65533;
                        w2 w2Var11 = w2.f79517a;
                        int i26 = i18 + 1;
                        if (i11 <= i26 || (bArr[i26] & l3.a.f103436o7) != 128) {
                            i17 = 1;
                        } else {
                            int i27 = i18 + 2;
                            i17 = (i11 <= i27 || (bArr[i27] & l3.a.f103436o7) != 128) ? 2 : 3;
                        }
                    } else {
                        byte b15 = bArr[i18 + 1];
                        if ((b15 & l3.a.f103436o7) == 128) {
                            byte b16 = bArr[i18 + 2];
                            if ((b16 & l3.a.f103436o7) == 128) {
                                byte b17 = bArr[i25];
                                if ((b17 & l3.a.f103436o7) == 128) {
                                    int i28 = (b10 << zi.c.f161643u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << zi.c.f161636n));
                                    if (i28 > 1114111) {
                                        i15 = i19 + 1;
                                        cArr[i19] = 65533;
                                    } else {
                                        if ((55296 > i28 || i28 >= 57344) && i28 >= 65536) {
                                            if (i28 != 65533) {
                                                cArr[i19] = (char) ((i28 >>> 10) + 55232);
                                                i16 = i19 + 2;
                                                cArr[i19 + 1] = (char) ((i28 & 1023) + 56320);
                                            } else {
                                                cArr[i19] = 65533;
                                                i16 = i19 + 1;
                                            }
                                            w2 w2Var12 = w2.f79517a;
                                            i15 = i16;
                                        } else {
                                            i15 = i19 + 1;
                                            cArr[i19] = 65533;
                                        }
                                        i17 = 4;
                                    }
                                    w2 w2Var13 = w2.f79517a;
                                    i17 = 4;
                                } else {
                                    i15 = i19 + 1;
                                    cArr[i19] = 65533;
                                    w2 w2Var14 = w2.f79517a;
                                }
                            } else {
                                i15 = i19 + 1;
                                cArr[i19] = 65533;
                                w2 w2Var15 = w2.f79517a;
                            }
                        } else {
                            i15 = i19 + 1;
                            cArr[i19] = 65533;
                            w2 w2Var16 = w2.f79517a;
                            i17 = 1;
                        }
                    }
                    i18 += i17;
                    w2 w2Var17 = w2.f79517a;
                } else {
                    i15 = i19 + 1;
                    cArr[i19] = 65533;
                    i18++;
                }
                i19 = i15;
            }
            i19 = i12;
        }
        return k0.M1(cArr, 0, i19);
    }

    public static /* synthetic */ String c(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return b(bArr, i10, i11);
    }
}
