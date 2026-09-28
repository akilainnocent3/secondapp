package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class txz {
    public float[] a;

    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0202  */
    /* JADX WARN: Code duplicated, block: B:125:0x020a  */
    /* JADX WARN: Code duplicated, block: B:132:0x021a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0220  */
    /* JADX WARN: Code duplicated, block: B:136:0x0225  */
    /* JADX WARN: Code duplicated, block: B:139:0x022f  */
    /* JADX WARN: Code duplicated, block: B:142:0x023c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0249  */
    /* JADX WARN: Code duplicated, block: B:151:0x0268  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:155:0x0277  */
    /* JADX WARN: Code duplicated, block: B:157:0x0281  */
    /* JADX WARN: Code duplicated, block: B:163:0x029a  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:209:0x039c  */
    /* JADX WARN: Code duplicated, block: B:212:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:218:0x03db  */
    /* JADX WARN: Code duplicated, block: B:222:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:328:0x03f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(txz txzVar, String str) {
        int i;
        int i2;
        char cCharAt;
        int i3;
        char c;
        int i4;
        long j;
        char cCharAt2;
        int i5;
        int i6;
        int i7;
        char c2;
        char c3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j2;
        char c4;
        long j3;
        int iFloatToRawIntBits;
        float f;
        char cCharAt3;
        int i14;
        char cCharAt4;
        long j4;
        int i15;
        char cCharAt5;
        int i16;
        int i17;
        char c5;
        char c6;
        int i18;
        char cCharAt6;
        char c7;
        char cCharAt7;
        int i19;
        int i20;
        int i21;
        char cCharAt8;
        long jFloatToRawIntBits;
        int i22;
        long jFloatToRawIntBits2;
        float fIntBitsToFloat;
        float[] fArr;
        int i23;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i24 = 0;
        while (true) {
            i = 32;
            if (i24 >= length || Intrinsics.h(str.charAt(i24), 32) > 0) {
                break;
            }
            i24++;
        }
        while (length > i24 && Intrinsics.h(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i25 = 0;
        while (i24 < length) {
            while (true) {
                i2 = i24 + 1;
                cCharAt = str.charAt(i24);
                int i26 = cCharAt | ' ';
                if ((i26 - 122) * (i26 - 97) > 0 || i26 == 101) {
                    if (i2 >= length) {
                        cCharAt = 0;
                    } else {
                        i24 = i2;
                    }
                }
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i25 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.h(str.charAt(i2), i) > 0) {
                            if (i2 == length) {
                                int i27 = i;
                                i4 = i25;
                                jFloatToRawIntBits2 = (((long) i2) << i27) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                i3 = i27;
                            } else {
                                int i28 = i;
                                i4 = i25;
                                char cCharAt9 = str.charAt(i2);
                                boolean z = cCharAt9 == '-';
                                i3 = i28;
                                if (z) {
                                    i5 = i2 + 1;
                                    if (i5 == length) {
                                        jFloatToRawIntBits2 = (((long) i5) << i3) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                    } else {
                                        c = 1;
                                        cCharAt2 = str.charAt(i5);
                                        j = 4294967295L;
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j3 = ((long) i5) << i3;
                                            jFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        jFloatToRawIntBits2 = j3 | (jFloatToRawIntBits & j);
                                        i2 = (int) (jFloatToRawIntBits2 >>> i3);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            i25 = i4;
                                        } else {
                                            fArr = txzVar.a;
                                            i23 = i4 + 1;
                                            fArr[i4] = fIntBitsToFloat;
                                            if (i23 >= fArr.length) {
                                                float[] fArr2 = new float[i23 * 2];
                                                txzVar.a = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                            i25 = i23;
                                        }
                                        while (i2 < length && str.charAt(i2) == ',') {
                                            i2++;
                                        }
                                        if (i2 >= length && !Float.isNaN(fIntBitsToFloat)) {
                                            i = i3;
                                        }
                                    }
                                } else {
                                    j = 4294967295L;
                                    c = 1;
                                    cCharAt2 = cCharAt9;
                                    i5 = i2;
                                }
                                int length2 = str.length();
                                int i29 = i5;
                                long j5 = 0;
                                while (i29 != length) {
                                    int i30 = cCharAt2 - '0';
                                    if (((char) i30) < '\n') {
                                        int i31 = i2;
                                        j5 = (j5 * 10) + ((long) i30);
                                        i29++;
                                        cCharAt2 = i29 < length2 ? str.charAt(i29) : (char) 0;
                                        i2 = i31;
                                    } else {
                                        i6 = i2;
                                        i7 = i29 - i5;
                                        if (i29 == length && cCharAt2 == '.') {
                                            int i32 = i29 + 1;
                                            i8 = i32;
                                            c2 = 16;
                                            while (true) {
                                                c3 = '0';
                                                if (length - i8 >= 4) {
                                                    i22 = i32;
                                                    long jCharAt = ((long) str.charAt(i8)) | (((long) str.charAt(i8 + 1)) << 16) | (((long) str.charAt(i8 + 2)) << i3) | (((long) str.charAt(i8 + 3)) << 48);
                                                    long j6 = jCharAt - 13511005043687472L;
                                                    int i33 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                                                    if (i33 >= 0) {
                                                        j5 = (j5 * 10000) + ((long) i33);
                                                        i8 += 4;
                                                        i32 = i22;
                                                    }
                                                } else {
                                                    i22 = i32;
                                                }
                                            }
                                            char cCharAt10 = i8 < length2 ? str.charAt(i8) : (char) 0;
                                            while (true) {
                                                cCharAt2 = cCharAt10;
                                                while (true) {
                                                    if (i8 != length) {
                                                        int i34 = cCharAt2 - '0';
                                                        if (((char) i34) < '\n') {
                                                            j5 = (j5 * 10) + ((long) i34);
                                                            i8++;
                                                            if (i8 < length2) {
                                                                cCharAt10 = str.charAt(i8);
                                                            } else {
                                                                cCharAt2 = 0;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int i35 = i22 - i8;
                                            i7 -= i35;
                                            i10 = i35;
                                            i9 = i22;
                                        } else {
                                            c2 = 16;
                                            c3 = '0';
                                            i8 = i29;
                                            i9 = i8;
                                            i10 = 0;
                                        }
                                        if (i7 == 0) {
                                            j3 = ((long) i8) << i3;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                        } else {
                                            if ((cCharAt2 | ' ') == 101) {
                                                i11 = i8 + 1;
                                                if (i11 < length2) {
                                                    cCharAt6 = str.charAt(i11);
                                                } else {
                                                    cCharAt6 = 0;
                                                }
                                                if (cCharAt6 == '-') {
                                                    c7 = c;
                                                } else {
                                                    c7 = 0;
                                                }
                                                if (c7 == 0 || cCharAt6 == '+') {
                                                    i11 = i8 + 2;
                                                }
                                                cCharAt7 = str.charAt(i11);
                                                i19 = 0;
                                                while (true) {
                                                    if (i11 != length) {
                                                        i21 = cCharAt7 - '0';
                                                        i20 = i10;
                                                        if (((char) i21) < '\n') {
                                                            if (i19 < 1024) {
                                                                i19 = (i19 * 10) + i21;
                                                            }
                                                            i11++;
                                                            if (i11 < length2) {
                                                                cCharAt8 = str.charAt(i11);
                                                            } else {
                                                                cCharAt8 = 0;
                                                            }
                                                            cCharAt7 = cCharAt8;
                                                            i10 = i20;
                                                        }
                                                    } else {
                                                        i20 = i10;
                                                    }
                                                }
                                                if (c7 != 0) {
                                                    i12 = -i19;
                                                } else {
                                                    i12 = i19;
                                                }
                                                i10 = i20 + i12;
                                            } else {
                                                i11 = i8;
                                                i12 = 0;
                                            }
                                            i13 = 19;
                                            if (i7 > 19) {
                                                cCharAt3 = str.charAt(i5);
                                                i14 = i5;
                                                while (i11 != length) {
                                                    if (cCharAt3 != c3 || cCharAt3 == '.') {
                                                        if (cCharAt3 == '0') {
                                                            i7--;
                                                        }
                                                        i18 = i14 + 1;
                                                        if (i18 < length2) {
                                                            cCharAt3 = str.charAt(i18);
                                                        } else {
                                                            cCharAt3 = 0;
                                                        }
                                                        i14 = i18;
                                                        i13 = 19;
                                                        c3 = '0';
                                                    } else {
                                                        i13 = 19;
                                                        if (i7 > i13) {
                                                            cCharAt4 = str.charAt(i5);
                                                            j4 = 0;
                                                            while (true) {
                                                                if (i5 != i29) {
                                                                    nbh0.a aVar = nbh0.b;
                                                                    i15 = i5;
                                                                    c6 = cCharAt4;
                                                                    if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                        j4 = (j4 * 10) + ((long) (c6 - '0'));
                                                                        i5 = i15 + 1;
                                                                        cCharAt4 = i5 < length2 ? str.charAt(i5) : (char) 0;
                                                                    }
                                                                } else {
                                                                    i15 = i5;
                                                                }
                                                            }
                                                            nbh0.a aVar2 = nbh0.b;
                                                            if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                                i10 = (i29 - i15) + i12;
                                                            } else {
                                                                cCharAt5 = str.charAt(i9);
                                                                i16 = i9;
                                                                while (true) {
                                                                    if (i16 != i8) {
                                                                        c5 = cCharAt5;
                                                                        i17 = i16;
                                                                        if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                            j4 = (j4 * 10) + ((long) (c5 - '0'));
                                                                            i16 = i17 + 1;
                                                                            cCharAt5 = i16 < length2 ? str.charAt(i16) : (char) 0;
                                                                        }
                                                                    } else {
                                                                        i17 = i16;
                                                                    }
                                                                }
                                                                i10 = (i9 - i17) + i12;
                                                            }
                                                            c4 = c;
                                                            j2 = j4;
                                                        } else {
                                                            j2 = j5;
                                                            c4 = 0;
                                                        }
                                                    }
                                                }
                                                if (i7 > i13) {
                                                    cCharAt4 = str.charAt(i5);
                                                    j4 = 0;
                                                    while (true) {
                                                        if (i5 != i29) {
                                                            nbh0.a aVar3 = nbh0.b;
                                                            i15 = i5;
                                                            c6 = cCharAt4;
                                                            if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j4 = (j4 * 10) + ((long) (c6 - '0'));
                                                                i5 = i15 + 1;
                                                                if (i5 < length2) {
                                                                }
                                                            }
                                                        } else {
                                                            i15 = i5;
                                                        }
                                                    }
                                                    nbh0.a aVar4 = nbh0.b;
                                                    if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i10 = (i29 - i15) + i12;
                                                    } else {
                                                        cCharAt5 = str.charAt(i9);
                                                        i16 = i9;
                                                        while (true) {
                                                            if (i16 != i8) {
                                                                c5 = cCharAt5;
                                                                i17 = i16;
                                                                if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j4 = (j4 * 10) + ((long) (c5 - '0'));
                                                                    i16 = i17 + 1;
                                                                    if (i16 < length2) {
                                                                    }
                                                                }
                                                            } else {
                                                                i17 = i16;
                                                            }
                                                        }
                                                        i10 = (i9 - i17) + i12;
                                                    }
                                                    c4 = c;
                                                    j2 = j4;
                                                } else {
                                                    j2 = j5;
                                                    c4 = 0;
                                                }
                                            } else {
                                                j2 = j5;
                                                c4 = 0;
                                            }
                                            if (-10 > i10 && i10 < 11 && c4 == 0) {
                                                nbh0.a aVar5 = nbh0.b;
                                                if (Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                    float f2 = j2;
                                                    float[] fArr3 = u9h.a;
                                                    float f3 = i10 < 0 ? f2 / fArr3[-i10] : f2 * fArr3[i10];
                                                    if (z) {
                                                        f3 = -f3;
                                                    }
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                                                } else if (j2 == 0) {
                                                    if (z) {
                                                        f = -0.0f;
                                                    } else {
                                                        f = 0.0f;
                                                    }
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(f);
                                                } else if (-126 <= i10) {
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                                } else {
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                                }
                                            } else if (j2 == 0) {
                                                if (z) {
                                                    f = -0.0f;
                                                } else {
                                                    f = 0.0f;
                                                }
                                                j3 = ((long) i11) << i3;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(f);
                                            } else if (-126 <= i10 || i10 >= 128) {
                                                j3 = ((long) i11) << i3;
                                                iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                            } else {
                                                long j7 = u9h.b[i10 + 325];
                                                nbh0.a aVar6 = nbh0.b;
                                                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                                                long j8 = j2 << iNumberOfLeadingZeros;
                                                long j9 = j8 & j;
                                                long j10 = j8 >>> i3;
                                                long j11 = j7 & j;
                                                long j12 = j7 >>> i3;
                                                long j13 = j10 * j12;
                                                long j14 = j12 * j9;
                                                long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> i3)) + (j14 & j)) >>> i3) + (j14 >>> i3);
                                                int i36 = (int) (j15 >>> 63);
                                                long j16 = j15 >>> (i36 + 9);
                                                int i37 = iNumberOfLeadingZeros + (i36 ^ 1);
                                                long j17 = j15 & 511;
                                                if (j17 == 511 || (j17 == 0 && (3 & j16) == 1)) {
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                                } else {
                                                    long j18 = (j16 + 1) >>> c;
                                                    if (j18 >= 9007199254740992L) {
                                                        i37--;
                                                        j18 = 4503599627370496L;
                                                    }
                                                    long j19 = j18 & (-4503599627370497L);
                                                    long j20 = (((((long) i10) * 217706) >> c2) + 1087) - ((long) i37);
                                                    if (j20 < 1 || j20 > 2046) {
                                                        j3 = ((long) i11) << i3;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                                    } else {
                                                        float fLongBitsToDouble = (float) Double.longBitsToDouble(j19 | (j20 << 52) | (z ? Long.MIN_VALUE : 0L));
                                                        j3 = ((long) i11) << i3;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(fLongBitsToDouble);
                                                    }
                                                }
                                            }
                                        }
                                        jFloatToRawIntBits = iFloatToRawIntBits;
                                        jFloatToRawIntBits2 = j3 | (jFloatToRawIntBits & j);
                                        i2 = (int) (jFloatToRawIntBits2 >>> i3);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            fArr = txzVar.a;
                                            i23 = i4 + 1;
                                            fArr[i4] = fIntBitsToFloat;
                                            if (i23 >= fArr.length) {
                                                float[] fArr4 = new float[i23 * 2];
                                                txzVar.a = fArr4;
                                                System.arraycopy(fArr, 0, fArr4, 0, fArr.length);
                                            }
                                            i25 = i23;
                                        } else {
                                            i25 = i4;
                                        }
                                        while (i2 < length) {
                                            i2++;
                                        }
                                        if (i2 >= length) {
                                        }
                                    }
                                }
                                i6 = i2;
                                i7 = i29 - i5;
                                if (i29 == length) {
                                    c2 = 16;
                                    c3 = '0';
                                    i8 = i29;
                                    i9 = i8;
                                    i10 = 0;
                                } else {
                                    c2 = 16;
                                    c3 = '0';
                                    i8 = i29;
                                    i9 = i8;
                                    i10 = 0;
                                }
                                if (i7 == 0) {
                                    j3 = ((long) i8) << i3;
                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN);
                                } else {
                                    if ((cCharAt2 | ' ') == 101) {
                                        i11 = i8 + 1;
                                        if (i11 < length2) {
                                            cCharAt6 = str.charAt(i11);
                                        } else {
                                            cCharAt6 = 0;
                                        }
                                        if (cCharAt6 == '-') {
                                            c7 = c;
                                        } else {
                                            c7 = 0;
                                        }
                                        if (c7 == 0) {
                                            i11 = i8 + 2;
                                        } else {
                                            i11 = i8 + 2;
                                        }
                                        cCharAt7 = str.charAt(i11);
                                        i19 = 0;
                                        while (true) {
                                            if (i11 != length) {
                                                i21 = cCharAt7 - '0';
                                                i20 = i10;
                                                if (((char) i21) < '\n') {
                                                    if (i19 < 1024) {
                                                        i19 = (i19 * 10) + i21;
                                                    }
                                                    i11++;
                                                    if (i11 < length2) {
                                                        cCharAt8 = str.charAt(i11);
                                                    } else {
                                                        cCharAt8 = 0;
                                                    }
                                                    cCharAt7 = cCharAt8;
                                                    i10 = i20;
                                                }
                                            } else {
                                                i20 = i10;
                                            }
                                        }
                                        if (c7 != 0) {
                                            i12 = -i19;
                                        } else {
                                            i12 = i19;
                                        }
                                        i10 = i20 + i12;
                                    } else {
                                        i11 = i8;
                                        i12 = 0;
                                    }
                                    i13 = 19;
                                    if (i7 > 19) {
                                        cCharAt3 = str.charAt(i5);
                                        i14 = i5;
                                        while (i11 != length) {
                                            if (cCharAt3 != c3) {
                                            }
                                            if (cCharAt3 == '0') {
                                                i7--;
                                            }
                                            i18 = i14 + 1;
                                            if (i18 < length2) {
                                                cCharAt3 = str.charAt(i18);
                                            } else {
                                                cCharAt3 = 0;
                                            }
                                            i14 = i18;
                                            i13 = 19;
                                            c3 = '0';
                                        }
                                        if (i7 > i13) {
                                            cCharAt4 = str.charAt(i5);
                                            j4 = 0;
                                            while (true) {
                                                if (i5 != i29) {
                                                    nbh0.a aVar7 = nbh0.b;
                                                    i15 = i5;
                                                    c6 = cCharAt4;
                                                    if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                        j4 = (j4 * 10) + ((long) (c6 - '0'));
                                                        i5 = i15 + 1;
                                                        if (i5 < length2) {
                                                        }
                                                    }
                                                } else {
                                                    i15 = i5;
                                                }
                                            }
                                            nbh0.a aVar8 = nbh0.b;
                                            if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                i10 = (i29 - i15) + i12;
                                            } else {
                                                cCharAt5 = str.charAt(i9);
                                                i16 = i9;
                                                while (true) {
                                                    if (i16 != i8) {
                                                        c5 = cCharAt5;
                                                        i17 = i16;
                                                        if (Long.compare(j4 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                            j4 = (j4 * 10) + ((long) (c5 - '0'));
                                                            i16 = i17 + 1;
                                                            if (i16 < length2) {
                                                            }
                                                        }
                                                    } else {
                                                        i17 = i16;
                                                    }
                                                }
                                                i10 = (i9 - i17) + i12;
                                            }
                                            c4 = c;
                                            j2 = j4;
                                        } else {
                                            j2 = j5;
                                            c4 = 0;
                                        }
                                    } else {
                                        j2 = j5;
                                        c4 = 0;
                                    }
                                    if (-10 > i10) {
                                        if (j2 == 0) {
                                            if (z) {
                                                f = -0.0f;
                                            } else {
                                                f = 0.0f;
                                            }
                                            j3 = ((long) i11) << i3;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(f);
                                        } else if (-126 <= i10) {
                                            j3 = ((long) i11) << i3;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                        } else {
                                            j3 = ((long) i11) << i3;
                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                        }
                                    } else if (j2 == 0) {
                                        if (z) {
                                            f = -0.0f;
                                        } else {
                                            f = 0.0f;
                                        }
                                        j3 = ((long) i11) << i3;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(f);
                                    } else if (-126 <= i10) {
                                        j3 = ((long) i11) << i3;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                    } else {
                                        j3 = ((long) i11) << i3;
                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(str.substring(i6, i11)));
                                    }
                                }
                                jFloatToRawIntBits = iFloatToRawIntBits;
                                jFloatToRawIntBits2 = j3 | (jFloatToRawIntBits & j);
                                i2 = (int) (jFloatToRawIntBits2 >>> i3);
                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
                                if (Float.isNaN(fIntBitsToFloat)) {
                                    fArr = txzVar.a;
                                    i23 = i4 + 1;
                                    fArr[i4] = fIntBitsToFloat;
                                    if (i23 >= fArr.length) {
                                        float[] fArr5 = new float[i23 * 2];
                                        txzVar.a = fArr5;
                                        System.arraycopy(fArr, 0, fArr5, 0, fArr.length);
                                    }
                                    i25 = i23;
                                } else {
                                    i25 = i4;
                                }
                                while (i2 < length) {
                                    i2++;
                                }
                                if (i2 >= length) {
                                }
                            }
                            j = 4294967295L;
                            c = 1;
                            i2 = (int) (jFloatToRawIntBits2 >>> i3);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j));
                            if (Float.isNaN(fIntBitsToFloat)) {
                                fArr = txzVar.a;
                                i23 = i4 + 1;
                                fArr[i4] = fIntBitsToFloat;
                                if (i23 >= fArr.length) {
                                    float[] fArr6 = new float[i23 * 2];
                                    txzVar.a = fArr6;
                                    System.arraycopy(fArr, 0, fArr6, 0, fArr.length);
                                }
                                i25 = i23;
                            } else {
                                i25 = i4;
                            }
                            while (i2 < length) {
                                i2++;
                            }
                            if (i2 >= length) {
                            }
                        } else {
                            i2++;
                        }
                    }
                } else {
                    i3 = i;
                    c = 1;
                }
                float[] fArr7 = txzVar.a;
                int i38 = 2;
                switch (cCharAt) {
                    case 'A':
                        int i39 = i25 - 7;
                        for (int i40 = 0; i40 <= i39; i40 += 7) {
                            arrayList.add(new qxz.a(fArr7[i40], fArr7[i40 + 1], fArr7[i40 + 2], Float.compare(fArr7[i40 + 3], 0.0f) != 0 ? c : 0, Float.compare(fArr7[i40 + 4], 0.0f) != 0 ? c : 0, fArr7[i40 + 5], fArr7[i40 + 6]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'C':
                        int i41 = i25 - 6;
                        for (int i42 = 0; i42 <= i41; i42 += 6) {
                            arrayList.add(new qxz.c(fArr7[i42], fArr7[i42 + 1], fArr7[i42 + 2], fArr7[i42 + 3], fArr7[i42 + 4], fArr7[i42 + 5]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'H':
                        int i43 = i25 - 1;
                        for (int i44 = 0; i44 <= i43; i44++) {
                            arrayList.add(new qxz.d(fArr7[i44]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'L':
                        int i45 = i25 - 2;
                        for (int i46 = 0; i46 <= i45; i46 += 2) {
                            arrayList.add(new qxz.e(fArr7[i46], fArr7[i46 + 1]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'M':
                        int i47 = i25 - 2;
                        if (i47 >= 0) {
                            arrayList.add(new qxz.f(fArr7[0], fArr7[c]));
                            while (i38 <= i47) {
                                arrayList.add(new qxz.e(fArr7[i38], fArr7[i38 + 1]));
                                i38 += 2;
                            }
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'Q':
                        int i48 = i25 - 4;
                        for (int i49 = 0; i49 <= i48; i49 += 4) {
                            arrayList.add(new qxz.g(fArr7[i49], fArr7[i49 + 1], fArr7[i49 + 2], fArr7[i49 + 3]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'S':
                        int i50 = i25 - 4;
                        for (int i51 = 0; i51 <= i50; i51 += 4) {
                            arrayList.add(new qxz.h(fArr7[i51], fArr7[i51 + 1], fArr7[i51 + 2], fArr7[i51 + 3]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'T':
                        int i52 = i25 - 2;
                        for (int i53 = 0; i53 <= i52; i53 += 2) {
                            arrayList.add(new qxz.i(fArr7[i53], fArr7[i53 + 1]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'V':
                        int i54 = i25 - 1;
                        for (int i55 = 0; i55 <= i54; i55++) {
                            arrayList.add(new qxz.s(fArr7[i55]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'Z':
                    case 'z':
                        arrayList.add(qxz.b.c);
                        i24 = i2;
                        i = i3;
                        break;
                    case 'a':
                        int i56 = i25 - 7;
                        for (int i57 = 0; i57 <= i56; i57 += 7) {
                            arrayList.add(new qxz.j(fArr7[i57], fArr7[i57 + 1], fArr7[i57 + 2], Float.compare(fArr7[i57 + 3], 0.0f) != 0 ? c : 0, Float.compare(fArr7[i57 + 4], 0.0f) != 0 ? c : 0, fArr7[i57 + 5], fArr7[i57 + 6]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'c':
                        int i58 = i25 - 6;
                        for (int i59 = 0; i59 <= i58; i59 += 6) {
                            arrayList.add(new qxz.k(fArr7[i59], fArr7[i59 + 1], fArr7[i59 + 2], fArr7[i59 + 3], fArr7[i59 + 4], fArr7[i59 + 5]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'h':
                        int i60 = i25 - 1;
                        for (int i61 = 0; i61 <= i60; i61++) {
                            arrayList.add(new qxz.l(fArr7[i61]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'l':
                        int i62 = i25 - 2;
                        for (int i63 = 0; i63 <= i62; i63 += 2) {
                            arrayList.add(new qxz.m(fArr7[i63], fArr7[i63 + 1]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'm':
                        int i64 = i25 - 2;
                        if (i64 >= 0) {
                            arrayList.add(new qxz.n(fArr7[0], fArr7[c]));
                            while (i38 <= i64) {
                                arrayList.add(new qxz.m(fArr7[i38], fArr7[i38 + 1]));
                                i38 += 2;
                            }
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'q':
                        int i65 = i25 - 4;
                        for (int i66 = 0; i66 <= i65; i66 += 4) {
                            arrayList.add(new qxz.o(fArr7[i66], fArr7[i66 + 1], fArr7[i66 + 2], fArr7[i66 + 3]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 's':
                        int i67 = i25 - 4;
                        for (int i68 = 0; i68 <= i67; i68 += 4) {
                            arrayList.add(new qxz.p(fArr7[i68], fArr7[i68 + 1], fArr7[i68 + 2], fArr7[i68 + 3]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 't':
                        int i69 = i25 - 2;
                        for (int i70 = 0; i70 <= i69; i70 += 2) {
                            arrayList.add(new qxz.q(fArr7[i70], fArr7[i70 + 1]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    case 'v':
                        int i71 = i25 - 1;
                        for (int i72 = 0; i72 <= i71; i72++) {
                            arrayList.add(new qxz.r(fArr7[i72]));
                        }
                        i24 = i2;
                        i = i3;
                        break;
                    default:
                        d.a(cCharAt, "Unknown command for: ");
                        return null;
                }
            } else {
                i24 = i2;
            }
        }
        return arrayList;
    }
}
