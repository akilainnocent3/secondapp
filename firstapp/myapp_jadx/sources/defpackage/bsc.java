package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bsc implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            if (Intrinsics.g(kmh0Var.c, "data")) {
                return new bsc(kmh0Var, u2zVar);
            }
            return null;
        }
    }

    public bsc(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        char c;
        int i5;
        kmh0 kmh0Var = this.a;
        String str = kmh0Var.a;
        int iT = StringsKt.T(str, ";base64,", 0, false, 6);
        if (iT == -1) {
            dmy.a(kmh0Var, "invalid data uri: ");
            return null;
        }
        int iS = StringsKt.S(str, ':', 0, 6);
        if (iS == -1) {
            dmy.a(kmh0Var, "invalid data uri: ");
            return null;
        }
        int i6 = 1;
        String strSubstring = str.substring(iS + 1, iT);
        cy1.a aVar = cy1.e;
        int i7 = iT + 8;
        int length = str.length();
        aVar.getClass();
        boolean z = aVar.b;
        int length2 = str.length();
        q3.Companion companion = q3.INSTANCE;
        companion.getClass();
        q3.Companion.a(i7, length, length2);
        byte[] bytes = str.substring(i7, length).getBytes(Charsets.e);
        bytes.getClass();
        int length3 = bytes.length;
        int length4 = bytes.length;
        companion.getClass();
        q3.Companion.a(0, length3, length4);
        int i8 = -2;
        if (length3 == 0) {
            i = 1;
            i3 = 0;
        } else {
            if (length3 == 1) {
                hb5.a(hce0.a(length3, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z) {
                i2 = length3;
                int i9 = 0;
                while (true) {
                    i = i6;
                    if (i9 >= length3) {
                        break;
                    }
                    int i10 = dy1.b[bytes[i9] & 255];
                    if (i10 < 0) {
                        if (i10 == -2) {
                            i2 -= length3 - i9;
                            break;
                        }
                        i2--;
                    }
                    i9++;
                    i6 = i;
                }
            } else {
                i = 1;
                if (bytes[length3 - 1] == 61) {
                    i2 = length3 - 1;
                    if (bytes[length3 - 2] == 61) {
                        i2 = length3 - 2;
                    }
                } else {
                    i2 = length3;
                }
            }
            i3 = (int) ((((long) i2) * 6) / 8);
        }
        byte[] bArr2 = new byte[i3];
        int[] iArr = aVar.a ? dy1.d : dy1.b;
        int i11 = -8;
        int i12 = 0;
        int i13 = -8;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= length3) {
                bArr = bytes;
                i4 = 0;
                break;
            }
            if (i13 != i11 || (i5 = i14 + 3) >= length3) {
                bArr = bytes;
            } else {
                bArr = bytes;
                int i16 = i14 + 4;
                int i17 = (iArr[bArr[i14 + 2] & 255] << 6) | (iArr[bytes[i14 + 1] & 255] << 12) | (iArr[bytes[i14] & 255] << 18) | iArr[bArr[i5] & 255];
                if (i17 >= 0) {
                    bArr2[i15] = (byte) (i17 >> 16);
                    int i18 = i15 + 2;
                    bArr2[i15 + 1] = (byte) (i17 >> 8);
                    i15 += 3;
                    bArr2[i18] = (byte) i17;
                    bytes = bArr;
                    i14 = i16;
                }
                i8 = -2;
                i11 = -8;
            }
            int i19 = bArr[i14] & 255;
            int i20 = iArr[i19];
            if (i20 >= 0) {
                c = '=';
                i14++;
                i12 = (i12 << 6) | i20;
                int i21 = i13 + 6;
                if (i21 >= 0) {
                    bArr2[i15] = (byte) (i12 >>> i21);
                    i12 &= (i << i21) - 1;
                    i13 -= 2;
                    i15++;
                } else {
                    i13 = i21;
                }
            } else {
                if (i20 == -2) {
                    if (i13 == -8) {
                        hb5.a(hce0.a(i14, "Redundant pad character at index "));
                        return null;
                    }
                    if (i13 != -6) {
                        if (i13 == -4) {
                            cy1.b[] bVarArr = cy1.b.a;
                            int i22 = i14 + 1;
                            if (z) {
                                while (i22 < length3) {
                                    if (dy1.b[bArr[i22] & 255] != -1) {
                                        break;
                                    }
                                    i22++;
                                }
                            }
                            if (i22 == length3 || bArr[i22] != 61) {
                                hb5.a(hce0.a(i22, "Missing one pad character at index "));
                                return null;
                            }
                            i14 = i22 + 1;
                        } else if (i13 != -2) {
                            ib5.a(vZBMKENANSz.IXYwPKMRIkfLPyu);
                            return null;
                        }
                        i4 = i;
                        i8 = -2;
                        break;
                    }
                    cy1.b[] bVarArr2 = cy1.b.a;
                    i14++;
                    i4 = i;
                    i8 = -2;
                    break;
                }
                c = '=';
                if (!z) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i19);
                    sb.append("'(");
                    String string = Integer.toString(i19, CharsKt.checkRadix(8));
                    string.getClass();
                    sb.append(string);
                    hb5.a(t7l.b(i14, ") at index ", sb));
                    return null;
                }
                i14++;
            }
            bytes = bArr;
            i8 = -2;
            i11 = -8;
        }
        if (i13 == i8) {
            hb5.a("The last unit of input does not have enough bits");
            return null;
        }
        if (i13 != -8 && i4 == 0) {
            cy1.b[] bVarArr3 = cy1.b.a;
            hb5.a("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i12 != 0) {
            hb5.a("The pad bits must be zeros");
            return null;
        }
        if (z) {
            while (i14 < length3) {
                if (dy1.b[bArr[i14] & 255] != -1) {
                    break;
                }
                i14++;
            }
        }
        if (i14 >= length3) {
            if (i15 != i3) {
                ib5.a("Check failed.");
                return null;
            }
            lb5 lb5Var = new lb5();
            lb5Var.m104write(bArr2, 0, i3);
            return new aqa0(obn.b(lb5Var, this.b.f), strSubstring, bqc.b);
        }
        int i23 = bArr[i14] & 255;
        char c2 = (char) i23;
        String string2 = Integer.toString(i23, CharsKt.checkRadix(8));
        string2.getClass();
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append(c2);
        sb2.append("'(");
        sb2.append(string2);
        sb2.append(") at index ");
        sb2.append(i14 - 1);
        sb2.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb2.toString());
    }
}
