package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class jov<T> implements an70<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final wnv e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final kqx l;
    public final ohs m;
    public final agh0<?, ?> n;
    public final s3h<?> o;
    public final lou p;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zgh0());
        } catch (Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public jov(int[] iArr, Object[] objArr, int i, int i2, wnv wnvVar, boolean z, int[] iArr2, int i3, int i4, kqx kqxVar, ohs ohsVar, agh0 agh0Var, s3h s3hVar, lou louVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = wnvVar instanceof n1k;
        this.h = z;
        this.f = s3hVar != null && s3hVar.e(wnvVar);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = kqxVar;
        this.m = ohsVar;
        this.n = agh0Var;
        this.o = s3hVar;
        this.e = wnvVar;
        this.p = louVar;
    }

    public static Field H(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = he.a("Field ", str, " for ");
            sbA.append(cls.getName());
            sbA.append(" not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int N(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void Q(int i, Object obj, y7k0 y7k0Var) throws r08.b {
        if (obj instanceof String) {
            ((t08) y7k0Var).a.u0(i, (String) obj);
        } else {
            ((t08) y7k0Var).a(i, (ql5) obj);
        }
    }

    public static void h(Object obj) {
        if (o(obj)) {
            return;
        }
        hb5.a(wga.a(obj, "Mutating immutable message: "));
    }

    public static cgh0 m(Object obj) {
        n1k n1kVar = (n1k) obj;
        cgh0 cgh0Var = n1kVar.unknownFields;
        if (cgh0Var != cgh0.f) {
            return cgh0Var;
        }
        cgh0 cgh0Var2 = new cgh0();
        n1kVar.unknownFields = cgh0Var2;
        return cgh0Var2;
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n1k) {
            return ((n1k) obj).n();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0368  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c7  */
    public static jov v(snv snvVar, kqx kqxVar, ohs ohsVar, agh0 agh0Var, s3h s3hVar, lou louVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i15;
        int i16;
        int iObjectFieldOffset3;
        int i17;
        int i18;
        Field fieldH;
        int i19;
        char cCharAt9;
        int i20;
        int i21;
        Field fieldH2;
        Field fieldH3;
        int i22;
        char cCharAt10;
        int i23;
        int i24;
        char cCharAt11;
        int i25;
        int i26;
        char cCharAt12;
        int i27;
        int i28;
        char cCharAt13;
        if (!(snvVar instanceof s040)) {
            throw null;
        }
        s040 s040Var = (s040) snvVar;
        int i29 = 0;
        boolean z = s040Var.getSyntax() == s630.b;
        String str = s040Var.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt5 = str.charAt(i);
        if (iCharAt5 >= 55296) {
            int i32 = iCharAt5 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                cCharAt13 = str.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            iCharAt5 = i32 | (cCharAt13 << i33);
            i31 = i28;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iCharAt4 = 0;
            iArr = q;
            i3 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt6 = str.charAt(i31);
            if (iCharAt6 >= 55296) {
                int i35 = iCharAt6 & 8191;
                int i36 = 13;
                while (true) {
                    i11 = i34 + 1;
                    cCharAt8 = str.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i11;
                }
                iCharAt6 = i35 | (cCharAt8 << i36);
                i34 = i11;
            }
            int i37 = i34 + 1;
            int iCharAt7 = str.charAt(i34);
            if (iCharAt7 >= 55296) {
                int i38 = iCharAt7 & 8191;
                int i39 = 13;
                while (true) {
                    i10 = i37 + 1;
                    cCharAt7 = str.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i10;
                }
                iCharAt7 = i38 | (cCharAt7 << i39);
                i37 = i10;
            }
            int i40 = i37 + 1;
            iCharAt = str.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i9 = i40 + 1;
                    cCharAt6 = str.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i9;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i9;
            }
            int i43 = i40 + 1;
            iCharAt2 = str.charAt(i40);
            if (iCharAt2 >= 55296) {
                int i44 = iCharAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i8 = i43 + 1;
                    cCharAt5 = str.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i8;
                }
                iCharAt2 = i44 | (cCharAt5 << i45);
                i43 = i8;
            }
            int i46 = i43 + 1;
            int iCharAt8 = str.charAt(i43);
            if (iCharAt8 >= 55296) {
                int i47 = iCharAt8 & 8191;
                int i48 = 13;
                while (true) {
                    i7 = i46 + 1;
                    cCharAt4 = str.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i7;
                }
                iCharAt8 = i47 | (cCharAt4 << i48);
                i46 = i7;
            }
            int i49 = i46 + 1;
            iCharAt3 = str.charAt(i46);
            if (iCharAt3 >= 55296) {
                int i50 = iCharAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i6 = i49 + 1;
                    cCharAt3 = str.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i6;
                }
                iCharAt3 = i50 | (cCharAt3 << i51);
                i49 = i6;
            }
            int i52 = i49 + 1;
            int iCharAt9 = str.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i5 = i52 + 1;
                    cCharAt2 = str.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i5;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i5;
            }
            int i55 = i52 + 1;
            iCharAt4 = str.charAt(i52);
            if (iCharAt4 >= 55296) {
                int i56 = iCharAt4 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i4 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i57 = i4;
                }
                iCharAt4 = i56 | (cCharAt << i58);
                i55 = i4;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt3 + iCharAt9];
            i2 = (iCharAt6 * 2) + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i29 = iCharAt6;
            i31 = i55;
        }
        Object[] objArr = s040Var.c;
        Class<?> cls = s040Var.a.getClass();
        int[] iArr3 = new int[i3 * 3];
        int i59 = i29;
        Object[] objArr2 = new Object[i3 * 2];
        int i60 = iCharAt3 + iCharAt4;
        int i61 = i60;
        int i62 = iCharAt4;
        int i63 = 0;
        int i64 = 0;
        while (i31 < length) {
            int i65 = i31 + 1;
            int iCharAt10 = str.charAt(i31);
            int i66 = length;
            if (iCharAt10 >= 55296) {
                int i67 = iCharAt10 & 8191;
                int i68 = i65;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt12 = str.charAt(i68);
                    i27 = i67;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i67 = i27 | ((cCharAt12 & 8191) << i69);
                    i69 += 13;
                    i68 = i26;
                }
                iCharAt10 = i27 | (cCharAt12 << i69);
                i12 = i26;
            } else {
                i12 = i65;
            }
            int i70 = i12 + 1;
            int iCharAt11 = str.charAt(i12);
            int i71 = iCharAt10;
            if (iCharAt11 >= 55296) {
                int i72 = iCharAt11 & 8191;
                int i73 = i70;
                int i74 = 13;
                while (true) {
                    i24 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i25 = i72;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 = i25 | ((cCharAt11 & 8191) << i74);
                    i74 += 13;
                    i73 = i24;
                }
                iCharAt11 = i25 | (cCharAt11 << i74);
                i13 = i24;
            } else {
                i13 = i70;
            }
            int[] iArr4 = iArr3;
            int i75 = iCharAt11 & 255;
            Object[] objArr3 = objArr2;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            Unsafe unsafe = r;
            Object[] objArr4 = objArr;
            if (i75 >= 51) {
                int i76 = i13 + 1;
                int iCharAt12 = str.charAt(i13);
                if (iCharAt12 >= 55296) {
                    int i77 = iCharAt12 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i22 = i78 + 1;
                        cCharAt10 = str.charAt(i78);
                        i23 = i77;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i77 = i23 | ((cCharAt10 & 8191) << i79);
                        i79 += 13;
                        i78 = i22;
                    }
                    iCharAt12 = i23 | (cCharAt10 << i79);
                    i21 = i22;
                } else {
                    i21 = i76;
                }
                int i80 = iCharAt12;
                int i81 = i75 - 51;
                int i82 = i21;
                if (i81 == 9 || i81 == 17) {
                    objArr3[iov.a(i63, 3, 2, 1)] = objArr4[i2];
                    i2++;
                } else if (i81 == 12 && !z) {
                    objArr3[iov.a(i63, 3, 2, 1)] = objArr4[i2];
                    i2++;
                }
                int i83 = i80 * 2;
                Object obj = objArr4[i83];
                if (obj instanceof Field) {
                    fieldH2 = (Field) obj;
                } else {
                    fieldH2 = H(cls, (String) obj);
                    objArr4[i83] = fieldH2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldH2);
                int i84 = i83 + 1;
                Object obj2 = objArr4[i84];
                if (obj2 instanceof Field) {
                    fieldH3 = (Field) obj2;
                } else {
                    fieldH3 = H(cls, (String) obj2);
                    objArr4[i84] = fieldH3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldH3);
                i63 = i63;
                i18 = iObjectFieldOffset4;
                iCharAt2 = iCharAt2;
                z = z;
                i17 = i2;
                i15 = i82;
                i16 = 0;
                cls = cls;
            } else {
                iCharAt = iCharAt;
                int i85 = i2 + 1;
                Field fieldH4 = H(cls, (String) objArr4[i2]);
                if (i75 == 9 || i75 == 17) {
                    objArr3[iov.a(i63, 3, 2, 1)] = fieldH4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i20 = i2 + 2;
                        objArr3[iov.a(i63, 3, 2, 1)] = objArr4[i85];
                    } else if (i75 != 12 && i75 != 30 && i75 != 44) {
                        if (i75 == 50) {
                            int i86 = i62 + 1;
                            iArr[i62] = i63;
                            int i87 = (i63 / 3) * 2;
                            int i88 = i2 + 2;
                            objArr3[i87] = objArr4[i85];
                            i62 = i86;
                            if ((iCharAt11 & 2048) != 0) {
                                i14 = i2 + 3;
                                objArr3[i87 + 1] = objArr4[i88];
                            } else {
                                i14 = i88;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                        if ((iCharAt11 & 4096) == 4096 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i15 = i13;
                            i16 = 0;
                        } else {
                            i15 = i13 + 1;
                            int iCharAt13 = str.charAt(i13);
                            if (iCharAt13 >= 55296) {
                                int i89 = iCharAt13 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i19 = i15 + 1;
                                    cCharAt9 = str.charAt(i15);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i89 |= (cCharAt9 & 8191) << i90;
                                    i90 += 13;
                                    i15 = i19;
                                }
                                iCharAt13 = i89 | (cCharAt9 << i90);
                                i15 = i19;
                            }
                            int i91 = (iCharAt13 / 32) + (i59 * 2);
                            Object obj3 = objArr4[i91];
                            if (obj3 instanceof Field) {
                                fieldH = (Field) obj3;
                            } else {
                                fieldH = H(cls, (String) obj3);
                                objArr4[i91] = fieldH;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldH);
                            i16 = iCharAt13 % 32;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset2;
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        i17 = i14;
                        i18 = iObjectFieldOffset;
                    } else if (!z) {
                        i20 = i2 + 2;
                        objArr3[iov.a(i63, 3, 2, 1)] = objArr4[i85];
                    }
                    i14 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i13;
                        i16 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i15 = i13;
                        i16 = 0;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    if (i75 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    i17 = i14;
                    i18 = iObjectFieldOffset;
                }
                i14 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldH4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i13;
                    i16 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i15 = i13;
                    i16 = 0;
                }
                iObjectFieldOffset3 = iObjectFieldOffset2;
                if (i75 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                i17 = i14;
                i18 = iObjectFieldOffset;
            }
            int i92 = i63 + 1;
            iArr4[i63] = i71;
            int i93 = i63 + 2;
            iArr4[i92] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i75 << 20) | i18;
            iArr4[i93] = (i16 << 20) | iObjectFieldOffset3;
            i31 = i15;
            cls = cls;
            iCharAt2 = iCharAt2;
            iArr3 = iArr4;
            objArr2 = objArr3;
            z = z;
            objArr = objArr4;
            iCharAt = iCharAt;
            i2 = i17;
            i63 += 3;
            length = i66;
        }
        return new jov(iArr3, objArr2, iCharAt, iCharAt2, s040Var.a, z, iArr, iCharAt4, i60, kqxVar, ohsVar, agh0Var, s3hVar, louVar);
    }

    public static long w(int i) {
        return i & 1048575;
    }

    public static <T> int x(T t, long j) {
        return ((Integer) chh0.j(t, j)).intValue();
    }

    public static <T> long y(T t, long j) {
        return ((Long) chh0.j(t, j)).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int A(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, fx0.a aVar) throws f0p {
        int i9;
        long j2 = this.a[i8 + 2] & 1048575;
        Unsafe unsafe = r;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(fx0.c(bArr, i))));
                int i10 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(fx0.b(bArr, i))));
                int i11 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iK = fx0.k(bArr, i, aVar);
                unsafe.putObject(t, j, Long.valueOf(aVar.b));
                unsafe.putInt(t, j2, i4);
                return iK;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int i12 = fx0.i(bArr, i, aVar);
                unsafe.putObject(t, j, Integer.valueOf(aVar.a));
                unsafe.putInt(t, j2, i4);
                return i12;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(fx0.c(bArr, i)));
                int i13 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i13;
            case 57:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(fx0.b(bArr, i)));
                int i14 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i14;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iK2 = fx0.k(bArr, i, aVar);
                unsafe.putObject(t, j, Boolean.valueOf(aVar.b != 0));
                unsafe.putInt(t, j2, i4);
                return iK2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int i15 = fx0.i(bArr, i, aVar);
                int i16 = aVar.a;
                if (i16 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!yqh0.a.c(bArr, i15, i15 + i16)) {
                            throw f0p.b();
                        }
                    }
                    unsafe.putObject(t, j, new String(bArr, i15, i16, gyo.a));
                    i15 += i16;
                }
                unsafe.putInt(t, j2, i4);
                return i15;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object objU = u(t, i4, i8);
                    int iL = fx0.l(objU, l(i8), bArr, i9, i2, aVar);
                    M(t, i4, i8, objU);
                    return iL;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int iA = fx0.a(bArr, i9, aVar);
                    unsafe.putObject(t, j, aVar.c);
                    unsafe.putInt(t, j2, i4);
                    return iA;
                }
                return i9;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int i17 = fx0.i(bArr, i9, aVar);
                    int i18 = aVar.a;
                    gyo.b bVarJ = j(i8);
                    if (bVarJ != null && !bVarJ.a()) {
                        m(t).c(i3, Long.valueOf(i18));
                        return i17;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i18));
                    unsafe.putInt(t, j2, i4);
                    return i17;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int i19 = fx0.i(bArr, i9, aVar);
                    unsafe.putObject(t, j, Integer.valueOf(m08.b(aVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return i19;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int iK3 = fx0.k(bArr, i9, aVar);
                    unsafe.putObject(t, j, Long.valueOf(m08.c(aVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return iK3;
                }
                return i9;
            case 68:
                if (i5 == 3) {
                    Object objU2 = u(t, i4, i8);
                    int iB = ((jov) l(i8)).B(objU2, bArr, i, i2, (i3 & (-8)) | 4, aVar);
                    aVar.c = objU2;
                    M(t, i4, i8, objU2);
                    return iB;
                }
            default:
                return i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int B(T r31, byte[] r32, int r33, int r34, int r35, fx0.a r36) throws defpackage.f0p {
        /*
            Method dump skipped, instruction units count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jov.B(java.lang.Object, byte[], int, int, int, fx0$a):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int C(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, fx0.a aVar) throws f0p {
        int iJ;
        Unsafe unsafe = r;
        gyo.c cVarMutableCopyWithCapacity = (gyo.c) unsafe.getObject(t, j2);
        if (!cVarMutableCopyWithCapacity.isModifiable()) {
            int size = cVarMutableCopyWithCapacity.size();
            cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, cVarMutableCopyWithCapacity);
        }
        gyo.c cVar = cVarMutableCopyWithCapacity;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    aze azeVar = (aze) cVar;
                    int i8 = fx0.i(bArr, i, aVar);
                    int i9 = aVar.a + i8;
                    while (i8 < i9) {
                        azeVar.addDouble(Double.longBitsToDouble(fx0.c(bArr, i8)));
                        i8 += 8;
                    }
                    if (i8 == i9) {
                        return i8;
                    }
                    throw f0p.g();
                }
                if (i5 == 1) {
                    aze azeVar2 = (aze) cVar;
                    azeVar2.addDouble(Double.longBitsToDouble(fx0.c(bArr, i)));
                    int i10 = i + 8;
                    while (i10 < i2) {
                        int i11 = fx0.i(bArr, i10, aVar);
                        if (i3 != aVar.a) {
                            return i10;
                        }
                        azeVar2.addDouble(Double.longBitsToDouble(fx0.c(bArr, i11)));
                        i10 = i11 + 8;
                    }
                    return i10;
                }
                return i;
            case 19:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i5 == 2) {
                    rwh rwhVar = (rwh) cVar;
                    int i12 = fx0.i(bArr, i, aVar);
                    int i13 = aVar.a + i12;
                    while (i12 < i13) {
                        rwhVar.addFloat(Float.intBitsToFloat(fx0.b(bArr, i12)));
                        i12 += 4;
                    }
                    if (i12 == i13) {
                        return i12;
                    }
                    throw f0p.g();
                }
                if (i5 == 5) {
                    rwh rwhVar2 = (rwh) cVar;
                    rwhVar2.addFloat(Float.intBitsToFloat(fx0.b(bArr, i)));
                    int i14 = i + 4;
                    while (i14 < i2) {
                        int i15 = fx0.i(bArr, i14, aVar);
                        if (i3 != aVar.a) {
                            return i14;
                        }
                        rwhVar2.addFloat(Float.intBitsToFloat(fx0.b(bArr, i15)));
                        i14 = i15 + 4;
                    }
                    return i14;
                }
                return i;
            case 20:
            case 21:
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i5 == 2) {
                    ljt ljtVar = (ljt) cVar;
                    int i16 = fx0.i(bArr, i, aVar);
                    int i17 = aVar.a + i16;
                    while (i16 < i17) {
                        i16 = fx0.k(bArr, i16, aVar);
                        ljtVar.addLong(aVar.b);
                    }
                    if (i16 == i17) {
                        return i16;
                    }
                    throw f0p.g();
                }
                if (i5 == 0) {
                    ljt ljtVar2 = (ljt) cVar;
                    int iK = fx0.k(bArr, i, aVar);
                    ljtVar2.addLong(aVar.b);
                    while (iK < i2) {
                        int i18 = fx0.i(bArr, iK, aVar);
                        if (i3 != aVar.a) {
                            return iK;
                        }
                        iK = fx0.k(bArr, i18, aVar);
                        ljtVar2.addLong(aVar.b);
                    }
                    return iK;
                }
                return i;
            case 22:
            case 29:
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i5 != 2) {
                    if (i5 == 0) {
                        return fx0.j(i3, bArr, i, i2, cVar, aVar);
                    }
                    return i;
                }
                rvo rvoVar = (rvo) cVar;
                int i19 = fx0.i(bArr, i, aVar);
                int i20 = aVar.a + i19;
                while (i19 < i20) {
                    i19 = fx0.i(bArr, i19, aVar);
                    rvoVar.addInt(aVar.a);
                }
                if (i19 == i20) {
                    return i19;
                }
                throw f0p.g();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    ljt ljtVar3 = (ljt) cVar;
                    int i21 = fx0.i(bArr, i, aVar);
                    int i22 = aVar.a + i21;
                    while (i21 < i22) {
                        ljtVar3.addLong(fx0.c(bArr, i21));
                        i21 += 8;
                    }
                    if (i21 == i22) {
                        return i21;
                    }
                    throw f0p.g();
                }
                if (i5 == 1) {
                    ljt ljtVar4 = (ljt) cVar;
                    ljtVar4.addLong(fx0.c(bArr, i));
                    int i23 = i + 8;
                    while (i23 < i2) {
                        int i24 = fx0.i(bArr, i23, aVar);
                        if (i3 != aVar.a) {
                            return i23;
                        }
                        ljtVar4.addLong(fx0.c(bArr, i24));
                        i23 = i24 + 8;
                    }
                    return i23;
                }
                return i;
            case 24:
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 41:
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i5 == 2) {
                    rvo rvoVar2 = (rvo) cVar;
                    int i25 = fx0.i(bArr, i, aVar);
                    int i26 = aVar.a + i25;
                    while (i25 < i26) {
                        rvoVar2.addInt(fx0.b(bArr, i25));
                        i25 += 4;
                    }
                    if (i25 == i26) {
                        return i25;
                    }
                    throw f0p.g();
                }
                if (i5 == 5) {
                    rvo rvoVar3 = (rvo) cVar;
                    rvoVar3.addInt(fx0.b(bArr, i));
                    int i27 = i + 4;
                    while (i27 < i2) {
                        int i28 = fx0.i(bArr, i27, aVar);
                        if (i3 != aVar.a) {
                            return i27;
                        }
                        rvoVar3.addInt(fx0.b(bArr, i28));
                        i27 = i28 + 4;
                    }
                    return i27;
                }
                return i;
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                if (i5 == 2) {
                    t15 t15Var = (t15) cVar;
                    int i29 = fx0.i(bArr, i, aVar);
                    int i30 = aVar.a + i29;
                    while (i29 < i30) {
                        i29 = fx0.k(bArr, i29, aVar);
                        t15Var.addBoolean(aVar.b != 0);
                    }
                    if (i29 == i30) {
                        return i29;
                    }
                    throw f0p.g();
                }
                if (i5 == 0) {
                    t15 t15Var2 = (t15) cVar;
                    int iK2 = fx0.k(bArr, i, aVar);
                    t15Var2.addBoolean(aVar.b != 0);
                    while (iK2 < i2) {
                        int i31 = fx0.i(bArr, iK2, aVar);
                        if (i3 != aVar.a) {
                            return iK2;
                        }
                        iK2 = fx0.k(bArr, i31, aVar);
                        t15Var2.addBoolean(aVar.b != 0);
                    }
                    return iK2;
                }
                return i;
            case RuntimeVersion.MINOR /* 26 */:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int i32 = fx0.i(bArr, i, aVar);
                        int i33 = aVar.a;
                        if (i33 < 0) {
                            throw f0p.e();
                        }
                        if (i33 == 0) {
                            cVar.add("");
                        } else {
                            cVar.add(new String(bArr, i32, i33, gyo.a));
                            i32 += i33;
                        }
                        while (i32 < i2) {
                            int i34 = fx0.i(bArr, i32, aVar);
                            if (i3 != aVar.a) {
                                return i32;
                            }
                            i32 = fx0.i(bArr, i34, aVar);
                            int i35 = aVar.a;
                            if (i35 < 0) {
                                throw f0p.e();
                            }
                            if (i35 == 0) {
                                cVar.add("");
                            } else {
                                cVar.add(new String(bArr, i32, i35, gyo.a));
                                i32 += i35;
                            }
                        }
                        return i32;
                    }
                    int i36 = fx0.i(bArr, i, aVar);
                    int i37 = aVar.a;
                    if (i37 < 0) {
                        throw f0p.e();
                    }
                    if (i37 == 0) {
                        cVar.add("");
                    } else {
                        int i38 = i36 + i37;
                        if (!yqh0.a.c(bArr, i36, i38)) {
                            throw f0p.b();
                        }
                        cVar.add(new String(bArr, i36, i37, gyo.a));
                        i36 = i38;
                    }
                    while (i36 < i2) {
                        int i39 = fx0.i(bArr, i36, aVar);
                        if (i3 != aVar.a) {
                            return i36;
                        }
                        i36 = fx0.i(bArr, i39, aVar);
                        int i40 = aVar.a;
                        if (i40 < 0) {
                            throw f0p.e();
                        }
                        if (i40 == 0) {
                            cVar.add("");
                        } else {
                            int i41 = i36 + i40;
                            if (!yqh0.a.c(bArr, i36, i41)) {
                                throw f0p.b();
                            }
                            cVar.add(new String(bArr, i36, i40, gyo.a));
                            i36 = i41;
                        }
                    }
                    return i36;
                }
                return i;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i5 == 2) {
                    return fx0.d(l(i6), i3, bArr, i, i2, cVar, aVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int i42 = fx0.i(bArr, i, aVar);
                    int i43 = aVar.a;
                    if (i43 < 0) {
                        throw f0p.e();
                    }
                    if (i43 > bArr.length - i42) {
                        throw f0p.g();
                    }
                    if (i43 == 0) {
                        cVar.add(ql5.b);
                    } else {
                        cVar.add(ql5.c(bArr, i42, i43));
                        i42 += i43;
                    }
                    while (i42 < i2) {
                        int i44 = fx0.i(bArr, i42, aVar);
                        if (i3 != aVar.a) {
                            return i42;
                        }
                        i42 = fx0.i(bArr, i44, aVar);
                        int i45 = aVar.a;
                        if (i45 < 0) {
                            throw f0p.e();
                        }
                        if (i45 > bArr.length - i42) {
                            throw f0p.g();
                        }
                        if (i45 == 0) {
                            cVar.add(ql5.b);
                        } else {
                            cVar.add(ql5.c(bArr, i42, i45));
                            i42 += i45;
                        }
                    }
                    return i42;
                }
                return i;
            case 30:
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iJ = fx0.j(i3, bArr, i, i2, cVar, aVar);
                    }
                    return i;
                }
                rvo rvoVar4 = (rvo) cVar;
                iJ = fx0.i(bArr, i, aVar);
                int i46 = aVar.a + iJ;
                while (iJ < i46) {
                    iJ = fx0.i(bArr, iJ, aVar);
                    rvoVar4.addInt(aVar.a);
                }
                if (iJ != i46) {
                    throw f0p.g();
                }
                nn70.w(t, i4, cVar, j(i6), null, this.n);
                return iJ;
            case 33:
            case 47:
                if (i5 == 2) {
                    rvo rvoVar5 = (rvo) cVar;
                    int i47 = fx0.i(bArr, i, aVar);
                    int i48 = aVar.a + i47;
                    while (i47 < i48) {
                        i47 = fx0.i(bArr, i47, aVar);
                        rvoVar5.addInt(m08.b(aVar.a));
                    }
                    if (i47 == i48) {
                        return i47;
                    }
                    throw f0p.g();
                }
                if (i5 == 0) {
                    rvo rvoVar6 = (rvo) cVar;
                    int i49 = fx0.i(bArr, i, aVar);
                    rvoVar6.addInt(m08.b(aVar.a));
                    while (i49 < i2) {
                        int i50 = fx0.i(bArr, i49, aVar);
                        if (i3 != aVar.a) {
                            return i49;
                        }
                        i49 = fx0.i(bArr, i50, aVar);
                        rvoVar6.addInt(m08.b(aVar.a));
                    }
                    return i49;
                }
                return i;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 48:
                if (i5 == 2) {
                    ljt ljtVar5 = (ljt) cVar;
                    int i51 = fx0.i(bArr, i, aVar);
                    int i52 = aVar.a + i51;
                    while (i51 < i52) {
                        i51 = fx0.k(bArr, i51, aVar);
                        ljtVar5.addLong(m08.c(aVar.b));
                    }
                    if (i51 == i52) {
                        return i51;
                    }
                    throw f0p.g();
                }
                if (i5 == 0) {
                    ljt ljtVar6 = (ljt) cVar;
                    int iK3 = fx0.k(bArr, i, aVar);
                    ljtVar6.addLong(m08.c(aVar.b));
                    while (iK3 < i2) {
                        int i53 = fx0.i(bArr, iK3, aVar);
                        if (i3 != aVar.a) {
                            return iK3;
                        }
                        iK3 = fx0.k(bArr, i53, aVar);
                        ljtVar6.addLong(m08.c(aVar.b));
                    }
                    return iK3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    an70 an70VarL = l(i6);
                    int i54 = (i3 & (-8)) | 4;
                    Object objNewInstance = an70VarL.newInstance();
                    jov jovVar = (jov) an70VarL;
                    int iB = jovVar.B(objNewInstance, bArr, i, i2, i54, aVar);
                    int i55 = i54;
                    aVar.c = objNewInstance;
                    an70VarL.makeImmutable(objNewInstance);
                    aVar.c = objNewInstance;
                    cVar.add(objNewInstance);
                    while (iB < i2) {
                        int i56 = fx0.i(bArr, iB, aVar);
                        if (i3 != aVar.a) {
                            return iB;
                        }
                        Object objNewInstance2 = an70VarL.newInstance();
                        int i57 = i55;
                        iB = jovVar.B(objNewInstance2, bArr, i56, i2, i57, aVar);
                        aVar.c = objNewInstance2;
                        an70VarL.makeImmutable(objNewInstance2);
                        aVar.c = objNewInstance2;
                        cVar.add(objNewInstance2);
                        i55 = i57;
                    }
                    return iB;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(Object obj, long j, o08 o08Var, an70 an70Var, r3h r3hVar) throws f0p.a {
        int iW;
        List listC = this.m.c(obj, j);
        m08 m08Var = o08Var.a;
        int i = o08Var.b;
        if ((i & 7) != 3) {
            throw f0p.c();
        }
        do {
            Object objNewInstance = an70Var.newInstance();
            o08Var.b(objNewInstance, an70Var, r3hVar);
            an70Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (m08Var.e() || o08Var.d != 0) {
                return;
            } else {
                iW = m08Var.w();
            }
        } while (iW == i);
        o08Var.d = iW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(Object obj, int i, o08 o08Var, an70 an70Var, r3h r3hVar) throws f0p {
        int iW;
        List listC = this.m.c(obj, i & 1048575);
        m08 m08Var = o08Var.a;
        int i2 = o08Var.b;
        if ((i2 & 7) != 2) {
            throw f0p.c();
        }
        do {
            Object objNewInstance = an70Var.newInstance();
            o08Var.c(objNewInstance, an70Var, r3hVar);
            an70Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (m08Var.e() || o08Var.d != 0) {
                return;
            } else {
                iW = m08Var.w();
            }
        } while (iW == i2);
        o08Var.d = iW;
    }

    public final void F(Object obj, int i, o08 o08Var) throws f0p.a {
        m08 m08Var = o08Var.a;
        if ((536870912 & i) != 0) {
            o08Var.v(2);
            chh0.q(obj, i & 1048575, m08Var.v());
        } else if (!this.g) {
            chh0.q(obj, i & 1048575, o08Var.e());
        } else {
            o08Var.v(2);
            chh0.q(obj, i & 1048575, m08Var.u());
        }
    }

    public final void G(Object obj, int i, o08 o08Var) throws f0p.a {
        boolean z = (536870912 & i) != 0;
        ohs ohsVar = this.m;
        if (z) {
            o08Var.r(ohsVar.c(obj, i & 1048575), true);
        } else {
            o08Var.r(ohsVar.c(obj, i & 1048575), false);
        }
    }

    public final void I(T t, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        chh0.o(t, j, (1 << (i2 >>> 20)) | chh0.h(t, j));
    }

    public final void J(T t, int i, int i2) {
        chh0.o(t, this.a[i2 + 2] & 1048575, i);
    }

    public final int K(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void L(T t, int i, Object obj) {
        r.putObject(t, O(i) & 1048575, obj);
        I(t, i);
    }

    public final void M(T t, int i, int i2, Object obj) {
        r.putObject(t, O(i2) & 1048575, obj);
        J(t, i, i2);
    }

    public final int O(int i) {
        return this.a[i + 1];
    }

    public final <K, V> void P(y7k0 y7k0Var, int i, Object obj, int i2) throws r08.b {
        if (obj != null) {
            Object objK = k(i2);
            lou louVar = this.p;
            louVar.forMapMetadata(objK);
            jou jouVarForMapData = louVar.forMapData(obj);
            r08.a aVar = ((t08) y7k0Var).a;
            Iterator<Map.Entry<K, V>> it = jouVarForMapData.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                aVar.v0(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:174:0x0750  */
    /* JADX WARN: Code duplicated, block: B:8:0x0032  */
    @Override // defpackage.an70
    public final void a(T t, y7k0 y7k0Var) throws Throwable {
        Map.Entry entry;
        int i;
        boolean z;
        char c;
        Map.Entry entry2;
        Throwable th;
        y7k0Var.getClass();
        agh0<?, ?> agh0Var = this.n;
        boolean z2 = this.f;
        int[] iArr = this.a;
        Throwable th2 = null;
        boolean z3 = true;
        boolean z4 = this.h;
        s3h<?> s3hVar = this.o;
        if (!z4) {
            if (z2) {
                njh<T> njhVarC = s3hVar.c(t);
                if (njhVarC.a.isEmpty()) {
                    entry = null;
                } else {
                    entry = (Map.Entry) njhVarC.f().next();
                }
            } else {
                entry = null;
            }
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            int i4 = 1048575;
            while (i2 < length) {
                int iO = O(i2);
                int i5 = iArr[i2];
                int iN = N(iO);
                boolean z5 = z3;
                Unsafe unsafe = r;
                if (iN <= 17) {
                    int i6 = iArr[i2 + 2];
                    int i7 = i6 & 1048575;
                    if (i7 != i4) {
                        i3 = unsafe.getInt(t, i7);
                        i4 = i7;
                    }
                    i = (z5 ? 1 : 0) << (i6 >>> 20);
                } else {
                    i = 0;
                }
                if (entry != null) {
                    s3hVar.a(entry);
                    if (i5 >= 0) {
                        s3hVar.j(entry);
                        throw null;
                    }
                }
                long j = iO & 1048575;
                switch (iN) {
                    case 0:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.p0(i5, Double.doubleToRawLongBits(chh0.c.c(t, j)));
                        }
                        break;
                    case 1:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.n0(i5, Float.floatToRawIntBits(chh0.c.d(t, j)));
                        }
                        break;
                    case 2:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.y0(i5, unsafe.getLong(t, j));
                        }
                        break;
                    case 3:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.y0(i5, unsafe.getLong(t, j));
                        }
                        break;
                    case 4:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.r0(i5, unsafe.getInt(t, j));
                        }
                        break;
                    case 5:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.p0(i5, unsafe.getLong(t, j));
                        }
                        break;
                    case 6:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.n0(i5, unsafe.getInt(t, j));
                        }
                        break;
                    case 7:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.l0(i5, chh0.c.a(t, j));
                        }
                        break;
                    case 8:
                        z = false;
                        c = 2;
                        if ((i & i3) != 0) {
                            Q(i5, unsafe.getObject(t, j), y7k0Var);
                        }
                        break;
                    case 9:
                        z = false;
                        if ((i & i3) == 0) {
                            c = 2;
                        } else {
                            Object object = unsafe.getObject(t, j);
                            an70 an70VarL = l(i2);
                            r08.a aVar = ((t08) y7k0Var).a;
                            wnv wnvVar = (wnv) object;
                            c = 2;
                            aVar.v0(i5, 2);
                            aVar.x0(((d4) wnvVar).c(an70VarL));
                            an70VarL.a(wnvVar, aVar.c);
                        }
                        break;
                    case 10:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a(i5, (ql5) unsafe.getObject(t, j));
                        }
                        c = 2;
                        break;
                    case 11:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.w0(i5, unsafe.getInt(t, j));
                        }
                        c = 2;
                        break;
                    case 12:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.r0(i5, unsafe.getInt(t, j));
                        }
                        c = 2;
                        break;
                    case 13:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.n0(i5, unsafe.getInt(t, j));
                        }
                        c = 2;
                        break;
                    case 14:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).a.p0(i5, unsafe.getLong(t, j));
                        }
                        c = 2;
                        break;
                    case 15:
                        z = false;
                        if ((i & i3) != 0) {
                            int i8 = unsafe.getInt(t, j);
                            ((t08) y7k0Var).a.w0(i5, (i8 >> 31) ^ (i8 << 1));
                        }
                        c = 2;
                        break;
                    case 16:
                        z = false;
                        if ((i & i3) != 0) {
                            long j2 = unsafe.getLong(t, j);
                            z5 = true;
                            ((t08) y7k0Var).a.y0(i5, (j2 << 1) ^ (j2 >> 63));
                        } else {
                            z5 = true;
                        }
                        c = 2;
                        break;
                    case 17:
                        z = false;
                        if ((i & i3) != 0) {
                            ((t08) y7k0Var).b(i5, unsafe.getObject(t, j), l(i2));
                        }
                        c = 2;
                        z5 = true;
                        break;
                    case 18:
                        z = false;
                        nn70.D(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 19:
                        z = false;
                        nn70.H(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 20:
                        z = false;
                        nn70.K(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 21:
                        z = false;
                        nn70.S(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 22:
                        z = false;
                        nn70.J(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        z = false;
                        nn70.G(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 24:
                        z = false;
                        nn70.F(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                        z = false;
                        nn70.B(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case RuntimeVersion.MINOR /* 26 */:
                        nn70.Q(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var);
                        z = false;
                        c = 2;
                        z5 = true;
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        nn70.L(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, l(i2));
                        z = false;
                        c = 2;
                        z5 = true;
                        break;
                    case 28:
                        nn70.C(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var);
                        z = false;
                        c = 2;
                        z5 = true;
                        break;
                    case 29:
                        z = false;
                        nn70.R(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 30:
                        z = false;
                        nn70.E(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        z = false;
                        nn70.M(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 32:
                        z = false;
                        nn70.N(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 33:
                        z = false;
                        nn70.O(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        z = false;
                        nn70.P(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, false);
                        c = 2;
                        z5 = true;
                        break;
                    case 35:
                        nn70.D(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        nn70.H(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        nn70.K(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 38:
                        nn70.S(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        nn70.J(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 40:
                        nn70.G(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 41:
                        nn70.F(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        nn70.B(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 43:
                        nn70.R(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        nn70.E(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        nn70.M(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 46:
                        nn70.N(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 47:
                        nn70.O(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 48:
                        nn70.P(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, z5);
                        z = false;
                        c = 2;
                        break;
                    case 49:
                        nn70.I(iArr[i2], (List) unsafe.getObject(t, j), y7k0Var, l(i2));
                        z = false;
                        c = 2;
                        break;
                    case 50:
                        P(y7k0Var, i5, unsafe.getObject(t, j), i2);
                        z = false;
                        c = 2;
                        break;
                    case 51:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.p0(i5, Double.doubleToRawLongBits(((Double) chh0.j(t, j)).doubleValue()));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 52:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.n0(i5, Float.floatToRawIntBits(((Float) chh0.j(t, j)).floatValue()));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 53:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.y0(i5, y(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 54:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.y0(i5, y(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 55:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.r0(i5, x(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 56:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.p0(i5, y(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 57:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.n0(i5, x(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 58:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.l0(i5, ((Boolean) chh0.j(t, j)).booleanValue());
                        }
                        z = false;
                        c = 2;
                        break;
                    case 59:
                        if (p(t, i5, i2)) {
                            Q(i5, unsafe.getObject(t, j), y7k0Var);
                        }
                        z = false;
                        c = 2;
                        break;
                    case 60:
                        if (p(t, i5, i2)) {
                            Object object2 = unsafe.getObject(t, j);
                            an70 an70VarL2 = l(i2);
                            r08.a aVar2 = ((t08) y7k0Var).a;
                            wnv wnvVar2 = (wnv) object2;
                            aVar2.v0(i5, 2);
                            aVar2.x0(((d4) wnvVar2).c(an70VarL2));
                            an70VarL2.a(wnvVar2, aVar2.c);
                        }
                        z = false;
                        c = 2;
                        break;
                    case 61:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a(i5, (ql5) unsafe.getObject(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 62:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.w0(i5, x(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 63:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.r0(i5, x(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.n0(i5, x(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 65:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).a.p0(i5, y(t, j));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 66:
                        if (p(t, i5, i2)) {
                            int iX = x(t, j);
                            ((t08) y7k0Var).a.w0(i5, (iX >> 31) ^ (iX << 1));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 67:
                        if (p(t, i5, i2)) {
                            long jY = y(t, j);
                            ((t08) y7k0Var).a.y0(i5, (jY << (z5 ? 1L : 0L)) ^ (jY >> 63));
                        }
                        z = false;
                        c = 2;
                        break;
                    case 68:
                        if (p(t, i5, i2)) {
                            ((t08) y7k0Var).b(i5, unsafe.getObject(t, j), l(i2));
                        }
                        z = false;
                        c = 2;
                        break;
                    default:
                        z = false;
                        c = 2;
                        break;
                }
                i2 += 3;
                z3 = z5;
                length = length;
                iArr = iArr;
            }
            if (entry == null) {
                agh0Var.r(agh0Var.g(t), y7k0Var);
                return;
            } else {
                s3hVar.j(entry);
                throw null;
            }
        }
        if (z2) {
            njh<T> njhVarC2 = s3hVar.c(t);
            if (njhVarC2.a.isEmpty()) {
                entry2 = null;
            } else {
                entry2 = (Map.Entry) njhVarC2.f().next();
            }
        } else {
            entry2 = null;
        }
        int length2 = iArr.length;
        int i9 = 0;
        while (i9 < length2) {
            int iO2 = O(i9);
            int i10 = iArr[i9];
            if (entry2 != null) {
                s3hVar.a(entry2);
                if (i10 >= 0) {
                    s3hVar.j(entry2);
                    throw th2;
                }
            }
            switch (N(iO2)) {
                case 0:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.p0(i10, Double.doubleToRawLongBits(chh0.c.c(t, iO2 & 1048575)));
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 1:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.n0(i10, Float.floatToRawIntBits(chh0.c.d(t, iO2 & 1048575)));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 2:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.y0(i10, chh0.i(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 3:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.y0(i10, chh0.i(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 4:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.r0(i10, chh0.h(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 5:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.p0(i10, chh0.i(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 6:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.n0(i10, chh0.h(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 7:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.l0(i10, chh0.c.a(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 8:
                    th = th2;
                    if (n(t, i9)) {
                        Q(i10, chh0.j(t, iO2 & 1048575), y7k0Var);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 9:
                    th = th2;
                    if (n(t, i9)) {
                        Object objJ = chh0.j(t, iO2 & 1048575);
                        an70 an70VarL3 = l(i9);
                        r08.a aVar3 = ((t08) y7k0Var).a;
                        wnv wnvVar3 = (wnv) objJ;
                        aVar3.v0(i10, 2);
                        aVar3.x0(((d4) wnvVar3).c(an70VarL3));
                        an70VarL3.a(wnvVar3, aVar3.c);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 10:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a(i10, (ql5) chh0.j(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 11:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.w0(i10, chh0.h(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 12:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.r0(i10, chh0.h(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 13:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.n0(i10, chh0.h(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 14:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).a.p0(i10, chh0.i(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 15:
                    th = th2;
                    if (n(t, i9)) {
                        int iH = chh0.h(t, iO2 & 1048575);
                        ((t08) y7k0Var).a.w0(i10, (iH >> 31) ^ (iH << 1));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 16:
                    th = th2;
                    if (n(t, i9)) {
                        long jI = chh0.i(t, iO2 & 1048575);
                        ((t08) y7k0Var).a.y0(i10, (jI << 1) ^ (jI >> 63));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 17:
                    th = th2;
                    if (n(t, i9)) {
                        ((t08) y7k0Var).b(i10, chh0.j(t, iO2 & 1048575), l(i9));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 18:
                    th = th2;
                    nn70.D(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 19:
                    th = th2;
                    nn70.H(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 20:
                    th = th2;
                    nn70.K(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 21:
                    th = th2;
                    nn70.S(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 22:
                    th = th2;
                    nn70.J(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    th = th2;
                    nn70.G(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 24:
                    th = th2;
                    nn70.F(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    th = th2;
                    nn70.B(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    th = th2;
                    nn70.Q(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    th = th2;
                    nn70.L(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, l(i9));
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 28:
                    th = th2;
                    nn70.C(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 29:
                    th = th2;
                    nn70.R(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 30:
                    th = th2;
                    nn70.E(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    th = th2;
                    nn70.M(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 32:
                    th = th2;
                    nn70.N(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 33:
                    th = th2;
                    nn70.O(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    th = th2;
                    nn70.P(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, false);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 35:
                    th = th2;
                    nn70.D(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    th = th2;
                    nn70.H(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    th = th2;
                    nn70.K(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 38:
                    th = th2;
                    nn70.S(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    th = th2;
                    nn70.J(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 40:
                    th = th2;
                    nn70.G(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 41:
                    th = th2;
                    nn70.F(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    th = th2;
                    nn70.B(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 43:
                    th = th2;
                    nn70.R(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    th = th2;
                    nn70.E(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    th = th2;
                    nn70.M(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 46:
                    th = th2;
                    nn70.N(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 47:
                    th = th2;
                    nn70.O(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 48:
                    th = th2;
                    nn70.P(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, true);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 49:
                    th = th2;
                    nn70.I(iArr[i9], (List) chh0.j(t, iO2 & 1048575), y7k0Var, l(i9));
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 50:
                    th = th2;
                    P(y7k0Var, i10, chh0.j(t, iO2 & 1048575), i9);
                    continue;
                    i9 += 3;
                    th2 = th;
                    break;
                case 51:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.p0(i10, Double.doubleToRawLongBits(((Double) chh0.j(t, iO2 & 1048575)).doubleValue()));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 52:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.n0(i10, Float.floatToRawIntBits(((Float) chh0.j(t, iO2 & 1048575)).floatValue()));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 53:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.y0(i10, y(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 54:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.y0(i10, y(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 55:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.r0(i10, x(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 56:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.p0(i10, y(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 57:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.n0(i10, x(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 58:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.l0(i10, ((Boolean) chh0.j(t, iO2 & 1048575)).booleanValue());
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 59:
                    th = th2;
                    if (p(t, i10, i9)) {
                        Q(i10, chh0.j(t, iO2 & 1048575), y7k0Var);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 60:
                    th = th2;
                    if (p(t, i10, i9)) {
                        Object objJ2 = chh0.j(t, iO2 & 1048575);
                        an70 an70VarL4 = l(i9);
                        r08.a aVar4 = ((t08) y7k0Var).a;
                        wnv wnvVar4 = (wnv) objJ2;
                        aVar4.v0(i10, 2);
                        aVar4.x0(((d4) wnvVar4).c(an70VarL4));
                        an70VarL4.a(wnvVar4, aVar4.c);
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 61:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a(i10, (ql5) chh0.j(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 62:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.w0(i10, x(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 63:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.r0(i10, x(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.n0(i10, x(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 65:
                    th = th2;
                    if (p(t, i10, i9)) {
                        ((t08) y7k0Var).a.p0(i10, y(t, iO2 & 1048575));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 66:
                    th = th2;
                    if (p(t, i10, i9)) {
                        int iX2 = x(t, iO2 & 1048575);
                        ((t08) y7k0Var).a.w0(i10, (iX2 >> 31) ^ (iX2 << 1));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 67:
                    th = th2;
                    if (p(t, i10, i9)) {
                        long jY2 = y(t, iO2 & 1048575);
                        ((t08) y7k0Var).a.y0(i10, (jY2 << 1) ^ (jY2 >> 63));
                    } else {
                        continue;
                    }
                    i9 += 3;
                    th2 = th;
                    break;
                case 68:
                    if (p(t, i10, i9)) {
                        th = th2;
                        ((t08) y7k0Var).b(i10, chh0.j(t, iO2 & 1048575), l(i9));
                    }
                    i9 += 3;
                    th2 = th;
                    break;
            }
            th = th2;
            i9 += 3;
            th2 = th;
        }
        Throwable th3 = th2;
        if (entry2 != null) {
            s3hVar.j(entry2);
            throw th3;
        }
        agh0Var.r(agh0Var.g(t), y7k0Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.an70
    public final void b(java.lang.Object r21, defpackage.o08 r22, defpackage.r3h r23) {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jov.b(java.lang.Object, o08, r3h):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.an70
    public final boolean c(n1k n1kVar, n1k n1kVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int iO = O(i);
                long j = iO & 1048575;
                switch (N(iO)) {
                    case 0:
                        if (!g(n1kVar, n1kVar2, i)) {
                            z = false;
                        } else {
                            chh0.d dVar = chh0.c;
                            if (Double.doubleToLongBits(dVar.c(n1kVar, j)) != Double.doubleToLongBits(dVar.c(n1kVar2, j))) {
                                z = false;
                            }
                        }
                        break;
                    case 1:
                        if (!g(n1kVar, n1kVar2, i)) {
                            z = false;
                        } else {
                            chh0.d dVar2 = chh0.c;
                            if (Float.floatToIntBits(dVar2.d(n1kVar, j)) != Float.floatToIntBits(dVar2.d(n1kVar2, j))) {
                                z = false;
                            }
                        }
                        break;
                    case 2:
                        if (!g(n1kVar, n1kVar2, i) || chh0.i(n1kVar, j) != chh0.i(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 3:
                        if (!g(n1kVar, n1kVar2, i) || chh0.i(n1kVar, j) != chh0.i(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 4:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 5:
                        if (!g(n1kVar, n1kVar2, i) || chh0.i(n1kVar, j) != chh0.i(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 6:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 7:
                        if (!g(n1kVar, n1kVar2, i)) {
                            z = false;
                        } else {
                            chh0.d dVar3 = chh0.c;
                            if (dVar3.a(n1kVar, j) != dVar3.a(n1kVar2, j)) {
                                z = false;
                            }
                        }
                        break;
                    case 8:
                        if (!g(n1kVar, n1kVar2, i) || !nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j))) {
                            z = false;
                        }
                        break;
                    case 9:
                        if (!g(n1kVar, n1kVar2, i) || !nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j))) {
                            z = false;
                        }
                        break;
                    case 10:
                        if (!g(n1kVar, n1kVar2, i) || !nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j))) {
                            z = false;
                        }
                        break;
                    case 11:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 12:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 13:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 14:
                        if (!g(n1kVar, n1kVar2, i) || chh0.i(n1kVar, j) != chh0.i(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 15:
                        if (!g(n1kVar, n1kVar2, i) || chh0.h(n1kVar, j) != chh0.h(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 16:
                        if (!g(n1kVar, n1kVar2, i) || chh0.i(n1kVar, j) != chh0.i(n1kVar2, j)) {
                            z = false;
                        }
                        break;
                    case 17:
                        if (!g(n1kVar, n1kVar2, i) || !nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j))) {
                            z = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    case 24:
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    case RuntimeVersion.MINOR /* 26 */:
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case 30:
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 38:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case 41:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j));
                        break;
                    case 50:
                        z = nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (chh0.h(n1kVar, j2) != chh0.h(n1kVar2, j2) || !nn70.z(chh0.j(n1kVar, j), chh0.j(n1kVar2, j))) {
                            z = false;
                        }
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                agh0<?, ?> agh0Var = this.n;
                if (agh0Var.g(n1kVar).equals(agh0Var.g(n1kVar2))) {
                    if (!this.f) {
                        return true;
                    }
                    s3h<?> s3hVar = this.o;
                    return s3hVar.c(n1kVar).equals(s3hVar.c(n1kVar2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.an70
    public final int d(n1k n1kVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iO = O(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iO;
            int i6 = 1237;
            int iHashCode = 37;
            switch (N(iO)) {
                case 0:
                    i = i3 * 53;
                    iB = gyo.b(Double.doubleToLongBits(chh0.c.c(n1kVar, j)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(chh0.c.d(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = gyo.b(chh0.i(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = gyo.b(chh0.i(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = gyo.b(chh0.i(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = chh0.c.a(n1kVar, j);
                    Charset charset = gyo.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) chh0.j(n1kVar, j)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objJ = chh0.j(n1kVar, j);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = chh0.j(n1kVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = gyo.b(chh0.i(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = chh0.h(n1kVar, j);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = gyo.b(chh0.i(n1kVar, j));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objJ2 = chh0.j(n1kVar, j);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 24:
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                case RuntimeVersion.MINOR /* 26 */:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = chh0.j(n1kVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = chh0.j(n1kVar, j).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(Double.doubleToLongBits(((Double) chh0.j(n1kVar, j)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) chh0.j(n1kVar, j)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(y(n1kVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(y(n1kVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(y(n1kVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (p(n1kVar, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) chh0.j(n1kVar, j)).booleanValue();
                        Charset charset2 = gyo.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = ((String) chh0.j(n1kVar, j)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = chh0.j(n1kVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = chh0.j(n1kVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(y(n1kVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = x(n1kVar, j);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = gyo.b(y(n1kVar, j));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (p(n1kVar, i5, i4)) {
                        i = i3 * 53;
                        iB = chh0.j(n1kVar, j).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.n.g(n1kVar).hashCode() + (i3 * 53);
        if (!this.f) {
            return iHashCode2;
        }
        return this.o.c(n1kVar).a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x047a A[PHI: r9 r21
      0x047a: PHI (r9v18 sun.misc.Unsafe) = (r9v3 sun.misc.Unsafe), (r9v19 sun.misc.Unsafe) binds: [B:204:0x05a7, B:159:0x0478] A[DONT_GENERATE, DONT_INLINE]
      0x047a: PHI (r21v17 int) = (r21v2 int), (r21v18 int) binds: [B:204:0x05a7, B:159:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x048a A[PHI: r9 r21
      0x048a: PHI (r9v16 sun.misc.Unsafe) = (r9v4 sun.misc.Unsafe), (r9v17 sun.misc.Unsafe) binds: [B:201:0x059b, B:162:0x0488] A[DONT_GENERATE, DONT_INLINE]
      0x048a: PHI (r21v15 int) = (r21v3 int), (r21v16 int) binds: [B:201:0x059b, B:162:0x0488] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:225:0x060d A[PHI: r7
      0x060d: PHI (r7v5 int) = 
      (r7v1 int)
      (r7v1 int)
      (r7v22 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v27 int)
      (r7v1 int)
     binds: [B:219:0x05f4, B:254:0x06b2, B:258:0x06ca, B:251:0x069e, B:248:0x068c, B:245:0x067d, B:242:0x066a, B:239:0x065c, B:236:0x064a, B:232:0x0631, B:229:0x0618, B:224:0x060c, B:222:0x05fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:267:0x06f4 A[PHI: r7
      0x06f4: PHI (r7v19 int) = 
      (r7v1 int)
      (r7v10 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v11 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v12 int)
      (r7v1 int)
      (r7v13 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v1 int)
      (r7v16 int)
      (r7v1 int)
      (r7v1 int)
     binds: [B:390:0x0a00, B:394:0x0a14, B:387:0x09ee, B:384:0x09de, B:381:0x09d0, B:378:0x09be, B:375:0x09b8, B:372:0x09b2, B:369:0x099b, B:366:0x0982, B:363:0x096e, B:354:0x0915, B:339:0x0884, B:336:0x0872, B:333:0x0860, B:330:0x084e, B:327:0x083c, B:324:0x082a, B:321:0x0819, B:318:0x0808, B:315:0x07f5, B:312:0x07e4, B:309:0x07d3, B:306:0x07c2, B:303:0x07b1, B:301:0x07a1, B:299:0x079b, B:297:0x078e, B:288:0x0750, B:285:0x0744, B:282:0x0731, B:278:0x071d, B:274:0x0709, B:271:0x06fe, B:266:0x06f3, B:264:0x06ed, B:261:0x06de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:286:0x0746  */
    /* JADX WARN: Code duplicated, block: B:289:0x0752  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.an70
    public final int e(d4 d4Var) {
        agh0<?, ?> agh0Var;
        int i;
        int i2;
        int iF0;
        int iI0;
        int iC0;
        int iF1;
        int iE0;
        int iL;
        int iF2;
        int iC1;
        int iF3;
        int iI1;
        int iG;
        int iF4;
        int iB0;
        int iE1;
        int iL2;
        int iF5;
        int iC2;
        int i3;
        Unsafe unsafe;
        int iF6;
        int iI2;
        int iA0;
        int iG2;
        int iF7;
        int iB1;
        int serializedSize;
        int iF8;
        int iI3;
        agh0<?, ?> agh0Var2 = this.n;
        lou louVar = this.p;
        Unsafe unsafe2 = r;
        int i4 = 1048575;
        int i5 = 1;
        boolean z = this.h;
        int[] iArr = this.a;
        if (!z) {
            int i6 = 1048575;
            int i7 = 0;
            int iA = 0;
            int i8 = 0;
            while (i7 < iArr.length) {
                int iO = O(i7);
                int i9 = iArr[i7];
                int iN = N(iO);
                int i10 = i5;
                if (iN <= 17) {
                    int i11 = iArr[i7 + 2];
                    int i12 = i11 & 1048575;
                    i = i10 << (i11 >>> 20);
                    agh0Var = agh0Var2;
                    if (i12 != i6) {
                        i8 = unsafe2.getInt(d4Var, i12);
                        i6 = i12;
                    }
                } else {
                    agh0Var = agh0Var2;
                    i = 0;
                }
                long j = iO & 1048575;
                switch (iN) {
                    case 0:
                        i2 = i10;
                        if ((i8 & i) != 0) {
                            iA = hov.a(i9, 8, iA);
                        }
                        break;
                    case 1:
                        i2 = i10;
                        if ((i8 & i) != 0) {
                            iA = hov.a(i9, 4, iA);
                        }
                        break;
                    case 2:
                        i2 = i10;
                        if ((i & i8) != 0) {
                            long j2 = unsafe2.getLong(d4Var, j);
                            iF0 = r08.f0(i9);
                            iI0 = r08.i0(j2);
                            iC0 = iI0 + iF0;
                            iA += iC0;
                        }
                        break;
                    case 3:
                        i2 = i10;
                        if ((i & i8) != 0) {
                            long j3 = unsafe2.getLong(d4Var, j);
                            iF0 = r08.f0(i9);
                            iI0 = r08.i0(j3);
                            iC0 = iI0 + iF0;
                            iA += iC0;
                        }
                        break;
                    case 4:
                        i2 = i10;
                        if ((i & i8) != 0) {
                            iC0 = r08.c0(unsafe2.getInt(d4Var, j)) + r08.f0(i9);
                            iA += iC0;
                        }
                        break;
                    case 5:
                        i2 = i10;
                        if ((i8 & i) != 0) {
                            iC0 = r08.a0(i9);
                            iA += iC0;
                        }
                        break;
                    case 6:
                        i2 = i10;
                        if ((i8 & i) != 0) {
                            iC0 = r08.Z(i9);
                            iA += iC0;
                        }
                        break;
                    case 7:
                        i2 = 1;
                        if ((i8 & i) != 0) {
                            iA = hov.a(i9, 1, iA);
                        }
                        break;
                    case 8:
                        if ((i8 & i) != 0) {
                            Object object = unsafe2.getObject(d4Var, j);
                            if (object instanceof ql5) {
                                iF1 = r08.f0(i9);
                                iE0 = r08.Y((ql5) object);
                            } else {
                                iF1 = r08.f0(i9);
                                iE0 = r08.e0((String) object);
                            }
                            iA = iE0 + iF1 + iA;
                        }
                        i2 = 1;
                        break;
                    case 9:
                        if ((i8 & i) != 0) {
                            iL = nn70.l(i9, unsafe2.getObject(d4Var, j), l(i7));
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 10:
                        if ((i8 & i) != 0) {
                            iL = r08.X(i9, (ql5) unsafe2.getObject(d4Var, j));
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 11:
                        if ((i8 & i) != 0) {
                            iL = r08.g0(i9, unsafe2.getInt(d4Var, j));
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 12:
                        if ((i8 & i) != 0) {
                            int i13 = unsafe2.getInt(d4Var, j);
                            iF2 = r08.f0(i9);
                            iC1 = r08.c0(i13);
                            iL = iC1 + iF2;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 13:
                        if ((i8 & i) != 0) {
                            iA = hov.a(i9, 4, iA);
                        }
                        i2 = 1;
                        break;
                    case 14:
                        if ((i8 & i) != 0) {
                            iA = hov.a(i9, 8, iA);
                        }
                        i2 = 1;
                        break;
                    case 15:
                        if ((i8 & i) != 0) {
                            int i14 = unsafe2.getInt(d4Var, j);
                            iF2 = r08.f0(i9);
                            iC1 = r08.h0((i14 >> 31) ^ (i14 << 1));
                            iL = iC1 + iF2;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 16:
                        if ((i8 & i) != 0) {
                            long j4 = unsafe2.getLong(d4Var, j);
                            iF3 = r08.f0(i9);
                            iI1 = r08.i0((j4 >> 63) ^ (j4 << 1));
                            iL = iI1 + iF3;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 17:
                        if ((i8 & i) != 0) {
                            iL = r08.b0(i9, (wnv) unsafe2.getObject(d4Var, j), l(i7));
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 18:
                        iL = nn70.f(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 19:
                        iL = nn70.d(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 20:
                        iL = nn70.j(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 21:
                        iL = nn70.u(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 22:
                        iL = nn70.h(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        iL = nn70.f(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 24:
                        iL = nn70.d(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                        List list = (List) unsafe2.getObject(d4Var, j);
                        Class<?> cls = nn70.a;
                        int size = list.size();
                        iA += size == 0 ? 0 : (r08.f0(i9) + 1) * size;
                        i2 = 1;
                        break;
                    case RuntimeVersion.MINOR /* 26 */:
                        iL = nn70.r(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        iL = nn70.m(i9, (List) unsafe2.getObject(d4Var, j), l(i7));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 28:
                        iL = nn70.a(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 29:
                        iL = nn70.s(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 30:
                        iL = nn70.b(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        iL = nn70.d(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 32:
                        iL = nn70.f(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 33:
                        iL = nn70.n(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        iL = nn70.p(i9, (List) unsafe2.getObject(d4Var, j));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 35:
                        iG = nn70.g((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        iG = nn70.e((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        iG = nn70.k((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 38:
                        iG = nn70.v((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        iG = nn70.i((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 40:
                        iG = nn70.g((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 41:
                        iG = nn70.e((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        List list2 = (List) unsafe2.getObject(d4Var, j);
                        Class<?> cls2 = nn70.a;
                        iG = list2.size();
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 43:
                        iG = nn70.t((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        iG = nn70.c((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        iG = nn70.e((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 46:
                        iG = nn70.g((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 47:
                        iG = nn70.o((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 48:
                        iG = nn70.q((List) unsafe2.getObject(d4Var, j));
                        if (iG > 0) {
                            iF4 = r08.f0(i9);
                            iA = agc.a(iG, iF4, iG, iA);
                        }
                        i2 = 1;
                        break;
                    case 49:
                        List list3 = (List) unsafe2.getObject(d4Var, j);
                        an70 an70VarL = l(i7);
                        Class<?> cls3 = nn70.a;
                        int size2 = list3.size();
                        if (size2 == 0) {
                            iB0 = 0;
                        } else {
                            iB0 = 0;
                            for (int i15 = 0; i15 < size2; i15++) {
                                iB0 += r08.b0(i9, (wnv) list3.get(i15), an70VarL);
                            }
                        }
                        iA += iB0;
                        i2 = 1;
                        break;
                    case 50:
                        iL = louVar.getSerializedSize(i9, unsafe2.getObject(d4Var, j), k(i7));
                        iA += iL;
                        i2 = 1;
                        break;
                    case 51:
                        if (p(d4Var, i9, i7)) {
                            iA = hov.a(i9, 8, iA);
                        }
                        i2 = 1;
                        break;
                    case 52:
                        if (p(d4Var, i9, i7)) {
                            iA = hov.a(i9, 4, iA);
                        }
                        i2 = 1;
                        break;
                    case 53:
                        if (p(d4Var, i9, i7)) {
                            long jY = y(d4Var, j);
                            iF3 = r08.f0(i9);
                            iI1 = r08.i0(jY);
                            iL = iI1 + iF3;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 54:
                        if (p(d4Var, i9, i7)) {
                            long jY2 = y(d4Var, j);
                            iF3 = r08.f0(i9);
                            iI1 = r08.i0(jY2);
                            iL = iI1 + iF3;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 55:
                        if (p(d4Var, i9, i7)) {
                            int iX = x(d4Var, j);
                            iF2 = r08.f0(i9);
                            iC1 = r08.c0(iX);
                            iL = iC1 + iF2;
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 56:
                        if (p(d4Var, i9, i7)) {
                            iL = r08.a0(i9);
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 57:
                        if (p(d4Var, i9, i7)) {
                            iL = r08.Z(i9);
                            iA += iL;
                        }
                        i2 = 1;
                        break;
                    case 58:
                        if (p(d4Var, i9, i7)) {
                            iA = hov.a(i9, i10, iA);
                            i2 = i10;
                        }
                        i2 = 1;
                        break;
                    case 59:
                        if (p(d4Var, i9, i7)) {
                            Object object2 = unsafe2.getObject(d4Var, j);
                            if (object2 instanceof ql5) {
                                int iF9 = r08.f0(i9);
                                int size3 = ((ql5) object2).size();
                                iE1 = agc.a(size3, size3, iF9, iA);
                            } else {
                                iE1 = r08.e0((String) object2) + r08.f0(i9) + iA;
                            }
                            iA = iE1;
                        }
                        i2 = i10;
                        break;
                    case 60:
                        if (p(d4Var, i9, i7)) {
                            iL2 = nn70.l(i9, unsafe2.getObject(d4Var, j), l(i7));
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case 61:
                        if (p(d4Var, i9, i7)) {
                            iL2 = r08.X(i9, (ql5) unsafe2.getObject(d4Var, j));
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case 62:
                        if (p(d4Var, i9, i7)) {
                            iL2 = r08.g0(i9, x(d4Var, j));
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case 63:
                        if (p(d4Var, i9, i7)) {
                            int iX2 = x(d4Var, j);
                            iF5 = r08.f0(i9);
                            iC2 = r08.c0(iX2);
                            iL2 = iC2 + iF5;
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        if (p(d4Var, i9, i7)) {
                            iA = hov.a(i9, 4, iA);
                            i2 = i10;
                        } else {
                            i2 = i10;
                        }
                        break;
                    case 65:
                        if (p(d4Var, i9, i7)) {
                            iA = hov.a(i9, 8, iA);
                            i2 = i10;
                        } else {
                            i2 = i10;
                        }
                        break;
                    case 66:
                        if (p(d4Var, i9, i7)) {
                            int iX3 = x(d4Var, j);
                            iF5 = r08.f0(i9);
                            iC2 = r08.h0((iX3 >> 31) ^ (iX3 << 1));
                            iL2 = iC2 + iF5;
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case 67:
                        if (p(d4Var, i9, i7)) {
                            long jY3 = y(d4Var, j);
                            iL2 = r08.i0((jY3 >> 63) ^ (jY3 << i10)) + r08.f0(i9);
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    case 68:
                        if (p(d4Var, i9, i7)) {
                            iL2 = r08.b0(i9, (wnv) unsafe2.getObject(d4Var, j), l(i7));
                            iA += iL2;
                        }
                        i2 = i10;
                        break;
                    default:
                        i2 = i10;
                        break;
                }
                i7 += 3;
                i5 = i2;
                agh0Var2 = agh0Var;
            }
            agh0<?, ?> agh0Var3 = agh0Var2;
            int iH = agh0Var3.h(agh0Var3.g(d4Var)) + iA;
            if (!this.f) {
                return iH;
            }
            p1a0 p1a0Var = this.o.c(d4Var).a;
            int iB = 0;
            for (int i16 = 0; i16 < p1a0Var.b.size(); i16++) {
                Map.Entry<Object, Object> entryD = p1a0Var.d(i16);
                iB = njh.b((njh.a) entryD.getKey(), entryD.getValue()) + iB;
            }
            for (Map.Entry<Object, Object> entry : p1a0Var.e()) {
                iB = njh.b((njh.a) entry.getKey(), entry.getValue()) + iB;
            }
            return iH + iB;
        }
        int i17 = 0;
        int iA2 = 0;
        while (i17 < iArr.length) {
            int iO2 = O(i17);
            int iN2 = N(iO2);
            int i18 = iArr[i17];
            Unsafe unsafe3 = unsafe2;
            long j5 = iO2 & i4;
            if (iN2 >= qjh.b.a && iN2 <= qjh.c.a) {
                int i19 = iArr[i17 + 2];
            }
            switch (iN2) {
                case 0:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA2 = hov.a(i18, 8, iA2);
                    }
                    break;
                case 1:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA2 = hov.a(i18, 4, iA2);
                    }
                    break;
                case 2:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        long jI = chh0.i(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.i0(jI);
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 3:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        long jI2 = chh0.i(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.i0(jI2);
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 4:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        int iH2 = chh0.h(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.c0(iH2);
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 5:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = r08.a0(i18);
                        iA2 += iA0;
                    }
                    break;
                case 6:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = r08.Z(i18);
                        iA2 += iA0;
                    }
                    break;
                case 7:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA2 = hov.a(i18, 1, iA2);
                    }
                    break;
                case 8:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        Object objJ = chh0.j(d4Var, j5);
                        if (objJ instanceof ql5) {
                            int iF10 = r08.f0(i18);
                            int size4 = ((ql5) objJ).size();
                            iA2 = agc.a(size4, size4, iF10, iA2);
                        } else {
                            iA2 = r08.e0((String) objJ) + r08.f0(i18) + iA2;
                        }
                    }
                    break;
                case 9:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = nn70.l(i18, chh0.j(d4Var, j5), l(i17));
                        iA2 += iA0;
                    }
                    break;
                case 10:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = r08.X(i18, (ql5) chh0.j(d4Var, j5));
                        iA2 += iA0;
                    }
                    break;
                case 11:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = r08.g0(i18, chh0.h(d4Var, j5));
                        iA2 += iA0;
                    }
                    break;
                case 12:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        int iH3 = chh0.h(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.c0(iH3);
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 13:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA2 = hov.a(i18, 4, iA2);
                    }
                    break;
                case 14:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA2 = hov.a(i18, 8, iA2);
                    }
                    break;
                case 15:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        int iH4 = chh0.h(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.h0((iH4 >> 31) ^ (iH4 << 1));
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 16:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        long jI3 = chh0.i(d4Var, j5);
                        iF6 = r08.f0(i18);
                        iI2 = r08.i0((jI3 >> 63) ^ (jI3 << 1));
                        iA2 += iI2 + iF6;
                    }
                    break;
                case 17:
                    i3 = i4;
                    unsafe = unsafe3;
                    if (n(d4Var, i17)) {
                        iA0 = r08.b0(i18, (wnv) chh0.j(d4Var, j5), l(i17));
                        iA2 += iA0;
                    }
                    break;
                case 18:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.f(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 19:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.d(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 20:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.j(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 21:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.u(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 22:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.h(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.f(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 24:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.d(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    List list4 = (List) chh0.j(d4Var, j5);
                    Class<?> cls4 = nn70.a;
                    int size5 = list4.size();
                    iA0 = size5 == 0 ? 0 : (r08.f0(i18) + 1) * size5;
                    iA2 += iA0;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.r(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.m(i18, (List) chh0.j(d4Var, j5), l(i17));
                    iA2 += iA0;
                    break;
                case 28:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.a(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 29:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.s(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 30:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.b(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.d(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 32:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.f(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 33:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.n(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iA0 = nn70.p(i18, (List) chh0.j(d4Var, j5));
                    iA2 += iA0;
                    break;
                case 35:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.g((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.e((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.k((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 38:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.v((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.i((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 40:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.g((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 41:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.e((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    List list5 = (List) unsafe.getObject(d4Var, j5);
                    Class<?> cls5 = nn70.a;
                    iG2 = list5.size();
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 43:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.t((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.c((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.e((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 46:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.g((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 47:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.o((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 48:
                    i3 = i4;
                    unsafe = unsafe3;
                    iG2 = nn70.q((List) unsafe.getObject(d4Var, j5));
                    if (iG2 > 0) {
                        iF7 = r08.f0(i18);
                        iA2 = agc.a(iG2, iF7, iG2, iA2);
                    }
                    break;
                case 49:
                    List list6 = (List) chh0.j(d4Var, j5);
                    an70 an70VarL2 = l(i17);
                    Class<?> cls6 = nn70.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iB1 = 0;
                    } else {
                        int i20 = 0;
                        iB1 = 0;
                        while (i20 < size6) {
                            iB1 = r08.b0(i18, (wnv) list6.get(i20), an70VarL2) + iB1;
                            i20++;
                            i4 = i4;
                        }
                    }
                    i3 = i4;
                    iA2 = iB1 + iA2;
                    unsafe = unsafe3;
                    break;
                case 50:
                    serializedSize = louVar.getSerializedSize(i18, chh0.j(d4Var, j5), k(i17));
                    iA2 += serializedSize;
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 51:
                    if (p(d4Var, i18, i17)) {
                        iA2 = hov.a(i18, 8, iA2);
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 52:
                    if (p(d4Var, i18, i17)) {
                        iA2 = hov.a(i18, 4, iA2);
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 53:
                    if (p(d4Var, i18, i17)) {
                        long jY4 = y(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.i0(jY4);
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 54:
                    if (p(d4Var, i18, i17)) {
                        long jY5 = y(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.i0(jY5);
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 55:
                    if (p(d4Var, i18, i17)) {
                        int iX4 = x(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.c0(iX4);
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 56:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = r08.a0(i18);
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 57:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = r08.Z(i18);
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 58:
                    if (p(d4Var, i18, i17)) {
                        iA2 = hov.a(i18, 1, iA2);
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 59:
                    if (p(d4Var, i18, i17)) {
                        Object objJ2 = chh0.j(d4Var, j5);
                        if (objJ2 instanceof ql5) {
                            int iF11 = r08.f0(i18);
                            int size7 = ((ql5) objJ2).size();
                            iA2 = agc.a(size7, size7, iF11, iA2);
                        } else {
                            iA2 = r08.e0((String) objJ2) + r08.f0(i18) + iA2;
                        }
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 60:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = nn70.l(i18, chh0.j(d4Var, j5), l(i17));
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 61:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = r08.X(i18, (ql5) chh0.j(d4Var, j5));
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 62:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = r08.g0(i18, x(d4Var, j5));
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 63:
                    if (p(d4Var, i18, i17)) {
                        int iX5 = x(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.c0(iX5);
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (p(d4Var, i18, i17)) {
                        iA2 = hov.a(i18, 4, iA2);
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 65:
                    if (p(d4Var, i18, i17)) {
                        iA2 = hov.a(i18, 8, iA2);
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 66:
                    if (p(d4Var, i18, i17)) {
                        int iX6 = x(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.h0((iX6 >> 31) ^ (iX6 << 1));
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 67:
                    if (p(d4Var, i18, i17)) {
                        long jY6 = y(d4Var, j5);
                        iF8 = r08.f0(i18);
                        iI3 = r08.i0((jY6 >> 63) ^ (jY6 << 1));
                        iA2 += iI3 + iF8;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                case 68:
                    if (p(d4Var, i18, i17)) {
                        serializedSize = r08.b0(i18, (wnv) chh0.j(d4Var, j5), l(i17));
                        iA2 += serializedSize;
                    }
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
                default:
                    i3 = i4;
                    unsafe = unsafe3;
                    break;
            }
            i17 += 3;
            unsafe2 = unsafe;
            i4 = i3;
        }
        return agh0Var2.h(agh0Var2.g(d4Var)) + iA2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0095. Please report as an issue. */
    @Override // defpackage.an70
    public final void f(T t, byte[] bArr, int i, int i2, fx0.a aVar) throws f0p {
        int i3;
        int iK;
        T t2;
        int i4;
        int i5;
        int i6;
        int i7;
        T t3;
        int i8;
        int i9;
        T t4;
        int i10;
        int i11;
        int i12;
        int i13;
        this = this;
        T t5 = t;
        byte[] bArr2 = bArr;
        i2 = i2;
        aVar = aVar;
        if (!this.h) {
            B(t5, bArr, i, i2, 0, aVar);
            return;
        }
        h(t5);
        int iG = i;
        int i14 = -1;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (true) {
            Unsafe unsafe = r;
            if (iG >= i2) {
                T t6 = t5;
                int i18 = i2;
                int i19 = i16;
                int i20 = i17;
                if (i19 != 1048575) {
                    unsafe.putInt(t6, i19, i20);
                }
                if (iG != i18) {
                    throw f0p.f();
                }
                return;
            }
            int iH = iG + 1;
            int i21 = bArr2[iG];
            if (i21 < 0) {
                iH = fx0.h(i21, bArr2, iH, aVar);
                i21 = aVar.a;
            }
            int i22 = i21 >>> 3;
            int i23 = i21 & 7;
            int i24 = this.d;
            int i25 = this.c;
            if (i22 > i14) {
                iK = (i22 < i25 || i22 > i24) ? -1 : this.K(i22, i15 / 3);
                i3 = 0;
            } else if (i22 < i25 || i22 > i24) {
                i3 = 0;
                iK = -1;
            } else {
                i3 = 0;
                iK = this.K(i22, 0);
            }
            i15 = iK;
            if (i15 == -1) {
                t2 = t5;
                i4 = i21;
                i5 = iH;
                i6 = i22;
                i7 = i3;
            } else {
                int[] iArr = this.a;
                int i26 = iArr[i15 + 1];
                int iN = N(i26);
                int i27 = i21;
                long j = i26 & 1048575;
                if (iN <= 17) {
                    int i28 = iArr[i15 + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 != i16) {
                        if (i16 != 1048575) {
                            unsafe.putInt(t5, i16, i17);
                        }
                        if (i30 != 1048575) {
                            i17 = unsafe.getInt(t5, i30);
                        }
                        i16 = i30;
                    }
                    switch (iN) {
                        case 0:
                            i9 = iH;
                            if (i23 != 1) {
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                t4 = t;
                                chh0.c.g(t4, j, Double.longBitsToDouble(fx0.c(bArr2, i9)));
                                t5 = t4;
                                iG = i9 + 8;
                                i17 |= i29;
                                i14 = i22;
                            }
                            break;
                        case 1:
                            i9 = iH;
                            if (i23 != 5) {
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                chh0.c.h(t5, j, Float.intBitsToFloat(fx0.b(bArr2, i9)));
                                iG = i9 + 4;
                                i17 |= i29;
                                i14 = i22;
                            }
                            break;
                        case 2:
                        case 3:
                            i9 = iH;
                            if (i23 != 0) {
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                int iK2 = fx0.k(bArr2, i9, aVar);
                                T t7 = t5;
                                unsafe.putLong(t7, j, aVar.b);
                                t5 = t7;
                                i17 |= i29;
                                i2 = i2;
                                iG = iK2;
                                i14 = i22;
                            }
                            break;
                        case 4:
                        case 11:
                            i9 = iH;
                            if (i23 != 0) {
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                int i31 = fx0.i(bArr2, i9, aVar);
                                unsafe.putInt(t5, j, aVar.a);
                                i17 |= i29;
                                iG = i31;
                                i14 = i22;
                            }
                            break;
                        case 5:
                        case 14:
                            t3 = t5;
                            i8 = iH;
                            if (i23 != 1) {
                                t5 = t3;
                                i9 = i8;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                i9 = i8;
                                t4 = t3;
                                unsafe.putLong(t4, j, fx0.c(bArr2, i8));
                                t5 = t4;
                                iG = i9 + 8;
                                i17 |= i29;
                                i14 = i22;
                            }
                            break;
                        case 6:
                        case 13:
                            t3 = t5;
                            i8 = iH;
                            if (i23 != 5) {
                                t5 = t3;
                                i9 = i8;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                unsafe.putInt(t3, j, fx0.b(bArr2, i8));
                                iG = i8 + 4;
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 7:
                            t3 = t5;
                            i8 = iH;
                            if (i23 != 0) {
                                t5 = t3;
                                i9 = i8;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                iG = fx0.k(bArr2, i8, aVar);
                                chh0.c.e(t3, j, aVar.b != 0);
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 8:
                            t3 = t5;
                            i8 = iH;
                            if (i23 != 2) {
                                t5 = t3;
                                i9 = i8;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                iG = (i26 & 536870912) == 0 ? fx0.e(bArr2, i8, aVar) : fx0.f(bArr2, i8, aVar);
                                unsafe.putObject(t3, j, aVar.c);
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 9:
                            t3 = t5;
                            if (i23 != 2) {
                                t5 = t3;
                                i9 = iH;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                Object objT = this.t(t3, i15);
                                iG = fx0.l(objT, this.l(i15), bArr2, iH, i2, aVar);
                                this.L(t3, i15, objT);
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 10:
                            t3 = t5;
                            if (i23 != 2) {
                                t5 = t3;
                                i9 = iH;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                iG = fx0.a(bArr2, iH, aVar);
                                unsafe.putObject(t3, j, aVar.c);
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 12:
                            t3 = t5;
                            if (i23 != 0) {
                                t5 = t3;
                                i9 = iH;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                iG = fx0.i(bArr2, iH, aVar);
                                unsafe.putInt(t3, j, aVar.a);
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 15:
                            t3 = t5;
                            if (i23 != 0) {
                                t5 = t3;
                                i9 = iH;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                iG = fx0.i(bArr2, iH, aVar);
                                unsafe.putInt(t3, j, m08.b(aVar.a));
                                i17 |= i29;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        case 16:
                            if (i23 != 0) {
                                i9 = iH;
                                i4 = i27 == true ? 1 : 0;
                                i7 = i15;
                                i6 = i22;
                                i5 = i9;
                                t2 = t5;
                            } else {
                                int iK3 = fx0.k(bArr2, iH, aVar);
                                T t8 = t5;
                                unsafe.putLong(t8, j, m08.c(aVar.b));
                                t3 = t8;
                                i17 |= i29;
                                iG = iK3;
                                i14 = i22;
                                t5 = t3;
                            }
                            break;
                        default:
                            i9 = iH;
                            i4 = i27 == true ? 1 : 0;
                            i7 = i15;
                            i6 = i22;
                            i5 = i9;
                            t2 = t5;
                            break;
                    }
                } else {
                    int i32 = iH;
                    int i33 = i17;
                    if (iN != 27) {
                        if (iN <= 49) {
                            i7 = i15;
                            i11 = i16;
                            i13 = i33;
                            int iC = this.C(t, bArr, i32, i2, i27 == true ? 1 : 0, i22, i23, i7, i26, iN, j, aVar);
                            i10 = i27 == true ? 1 : 0;
                            i12 = i22;
                            if (iC != i32) {
                                t5 = t;
                                iG = iC;
                                i15 = i7;
                                i14 = i12;
                            } else {
                                i5 = iC;
                                i6 = i12;
                                i4 = i10;
                                i16 = i11;
                                i17 = i13;
                                t2 = t;
                            }
                        } else {
                            i11 = i16;
                            i7 = i15;
                            i12 = i22;
                            i13 = i33;
                            i10 = i27 == true ? 1 : 0;
                            if (iN == 50) {
                                if (i23 == 2) {
                                    z(t, bArr, i32, i2, i7, j, aVar);
                                    throw null;
                                }
                                i5 = i32;
                                i6 = i12;
                                i4 = i10;
                                i16 = i11;
                                i17 = i13;
                                t2 = t;
                            } else {
                                i6 = i12;
                                i4 = i10 == true ? 1 : 0;
                                int iA = A(t, bArr, i32, i2, i4 == true ? 1 : 0, i6, i23, i26, iN, j, i7, aVar);
                                t2 = t;
                                if (iA != i32) {
                                    i7 = i7;
                                    i14 = i6;
                                    iG = iA;
                                    i15 = i7;
                                    t5 = t2;
                                } else {
                                    i7 = i7;
                                    i5 = iA;
                                    i16 = i11;
                                    i17 = i13;
                                }
                            }
                        }
                        i16 = i11;
                        i17 = i13;
                        bArr2 = bArr;
                        i2 = i2;
                    } else if (i23 == 2) {
                        gyo.c cVarMutableCopyWithCapacity = (gyo.c) unsafe.getObject(t5, j);
                        if (!cVarMutableCopyWithCapacity.isModifiable()) {
                            int size = cVarMutableCopyWithCapacity.size();
                            cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe.putObject(t5, j, cVarMutableCopyWithCapacity);
                        }
                        iG = fx0.d(this.l(i15), i27 == true ? 1 : 0, bArr2, i32, i2, cVarMutableCopyWithCapacity, aVar);
                        t5 = t;
                        bArr2 = bArr;
                        i2 = i2;
                        aVar = aVar;
                        i15 = i15;
                        i14 = i22;
                        i17 = i33;
                    } else {
                        i10 = i27 == true ? 1 : 0;
                        i7 = i15;
                        i11 = i16;
                        i12 = i22;
                        i13 = i33;
                        i5 = i32;
                        i6 = i12;
                        i4 = i10;
                        i16 = i11;
                        i17 = i13;
                        t2 = t;
                    }
                }
            }
            iG = fx0.g(i4 == true ? 1 : 0, bArr, i5, i2, m(t2), aVar);
            this = this;
            bArr2 = bArr;
            aVar = aVar;
            i15 = i7;
            t5 = t2;
            i2 = i2;
            i14 = i6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(n1k n1kVar, n1k n1kVar2, int i) {
        return n(n1kVar, i) == n(n1kVar2, i);
    }

    public final void i(Object obj, int i, Object obj2, agh0 agh0Var, Object obj3) {
        gyo.b bVarJ;
        int i2 = this.a[i];
        Object objJ = chh0.j(obj, O(i) & 1048575);
        if (objJ == null || (bVarJ = j(i)) == null) {
            return;
        }
        lou louVar = this.p;
        jou jouVarForMutableMapData = louVar.forMutableMapData(objJ);
        louVar.forMapMetadata(k(i));
        for (Map.Entry entry : jouVarForMutableMapData.entrySet()) {
            ((Integer) entry.getValue()).getClass();
            if (!bVarJ.a()) {
                if (obj2 == null) {
                    agh0Var.f(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.an70
    public final boolean isInitialized(T t) {
        int iN;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean zN = true;
            if (i2 >= this.j) {
                if (this.f) {
                    this.o.c(t).d();
                }
                return true;
            }
            int i4 = this.i[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int iO = O(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = r.getInt(t, i7);
                }
                i = i7;
            }
            if ((268435456 & iO) == 0) {
                iN = N(iO);
                if (iN != 9 || iN == 17) {
                    if (i == 1048575) {
                        zN = n(t, i4);
                    } else if ((i8 & i3) == 0) {
                        zN = false;
                    }
                    if (!zN || l(i4).isInitialized(chh0.j(t, iO & 1048575))) {
                        i2++;
                    }
                } else {
                    if (iN != 27) {
                        if (iN == 60 || iN == 68) {
                            if (!p(t, i5, i4) || l(i4).isInitialized(chh0.j(t, iO & 1048575))) {
                            }
                        } else if (iN != 49) {
                            if (iN != 50) {
                                continue;
                            } else {
                                Object objJ = chh0.j(t, iO & 1048575);
                                lou louVar = this.p;
                                if (!louVar.forMapData(objJ).isEmpty()) {
                                    louVar.forMapMetadata(k(i4));
                                    throw null;
                                }
                            }
                        }
                        i2++;
                    }
                    List list = (List) chh0.j(t, iO & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        an70 an70VarL = l(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (an70VarL.isInitialized(list.get(i9))) {
                            }
                        }
                    }
                    i2++;
                }
            } else {
                if (i == 1048575 ? n(t, i4) : (i3 & i8) != 0) {
                    iN = N(iO);
                    if (iN != 9) {
                    }
                    if (i == 1048575) {
                        zN = n(t, i4);
                    } else if ((i8 & i3) == 0) {
                        zN = false;
                    }
                    if (!zN) {
                        continue;
                    }
                    i2++;
                }
            }
            return false;
        }
    }

    public final gyo.b j(int i) {
        return (gyo.b) this.b[iov.a(i, 3, 2, 1)];
    }

    public final Object k(int i) {
        return this.b[(i / 3) * 2];
    }

    public final an70 l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        an70 an70Var = (an70) objArr[i2];
        if (an70Var != null) {
            return an70Var;
        }
        an70<T> an70VarA = u630.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = an70VarA;
        return an70VarA;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.an70
    public final void makeImmutable(T t) {
        if (o(t)) {
            if (t instanceof n1k) {
                n1k n1kVar = (n1k) t;
                n1kVar.e(Reader.READ_DONE);
                n1kVar.memoizedHashCode = 0;
                n1kVar.o();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int iO = O(i);
                long j = 1048575 & iO;
                int iN = N(iO);
                Unsafe unsafe = r;
                if (iN != 9) {
                    switch (iN) {
                        case 17:
                            if (n(t, i)) {
                                l(i).makeImmutable(unsafe.getObject(t, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        case 24:
                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                        case RuntimeVersion.MINOR /* 26 */:
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        case 28:
                        case 29:
                        case 30:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        case 38:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case 40:
                        case 41:
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        case 43:
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.m.a(t, j);
                            break;
                        case 50:
                            Object object = unsafe.getObject(t, j);
                            if (object != null) {
                                unsafe.putObject(t, j, this.p.toImmutable(object));
                            }
                            break;
                    }
                } else if (n(t, i)) {
                    l(i).makeImmutable(unsafe.getObject(t, j));
                }
            }
            this.n.j(t);
            if (this.f) {
                this.o.f(t);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.an70
    public final void mergeFrom(T t, T t2) {
        T t3;
        h(t);
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                T t4 = t;
                Class<?> cls = nn70.a;
                agh0<?, ?> agh0Var = this.n;
                agh0Var.o(t4, agh0Var.k(agh0Var.g(t4), agh0Var.g(t2)));
                if (this.f) {
                    nn70.y(this.o, t4, t2);
                    return;
                }
                return;
            }
            int iO = O(i);
            long j = 1048575 & iO;
            int i2 = iArr[i];
            switch (N(iO)) {
                case 0:
                    if (!n(t2, i)) {
                        t3 = t;
                    } else {
                        chh0.d dVar = chh0.c;
                        t3 = t;
                        dVar.g(t3, j, dVar.c(t2, j));
                        I(t3, i);
                    }
                    break;
                case 1:
                    if (n(t2, i)) {
                        chh0.d dVar2 = chh0.c;
                        dVar2.h(t, j, dVar2.d(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 2:
                    if (n(t2, i)) {
                        chh0.p(t, j, chh0.i(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 3:
                    if (n(t2, i)) {
                        chh0.p(t, j, chh0.i(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 4:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 5:
                    if (n(t2, i)) {
                        chh0.p(t, j, chh0.i(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 6:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 7:
                    if (n(t2, i)) {
                        chh0.d dVar3 = chh0.c;
                        dVar3.e(t, j, dVar3.a(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 8:
                    if (n(t2, i)) {
                        chh0.q(t, j, chh0.j(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 9:
                    r(t, t2, i);
                    t3 = t;
                    break;
                case 10:
                    if (n(t2, i)) {
                        chh0.q(t, j, chh0.j(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 11:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 12:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 13:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 14:
                    if (n(t2, i)) {
                        chh0.p(t, j, chh0.i(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 15:
                    if (n(t2, i)) {
                        chh0.o(t, j, chh0.h(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 16:
                    if (n(t2, i)) {
                        chh0.p(t, j, chh0.i(t2, j));
                        I(t, i);
                    }
                    t3 = t;
                    break;
                case 17:
                    r(t, t2, i);
                    t3 = t;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 24:
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                case RuntimeVersion.MINOR /* 26 */:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case 30:
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case 43:
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.m.b(t, t2, j);
                    t3 = t;
                    break;
                case 50:
                    Class<?> cls2 = nn70.a;
                    chh0.q(t, j, this.p.mergeFrom(chh0.j(t, j), chh0.j(t2, j)));
                    t3 = t;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(t2, i2, i)) {
                        chh0.q(t, j, chh0.j(t2, j));
                        J(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 60:
                    s(t, t2, i);
                    t3 = t;
                    break;
                case 61:
                case 62:
                case 63:
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (p(t2, i2, i)) {
                        chh0.q(t, j, chh0.j(t2, j));
                        J(t, i2, i);
                    }
                    t3 = t;
                    break;
                case 68:
                    s(t, t2, i);
                    t3 = t;
                    break;
                default:
                    t3 = t;
                    break;
            }
            i += 3;
            t = t3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean n(T t, int i) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & chh0.h(t, j)) != 0) {
                return true;
            }
            return false;
        }
        int iO = O(i);
        long j2 = iO & 1048575;
        switch (N(iO)) {
            case 0:
                if (Double.doubleToRawLongBits(chh0.c.c(t, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(chh0.c.d(t, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (chh0.i(t, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (chh0.i(t, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (chh0.i(t, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return chh0.c.a(t, j2);
            case 8:
                Object objJ = chh0.j(t, j2);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof ql5) {
                    return !ql5.b.equals(objJ);
                }
                d580.a();
                return false;
            case 9:
                if (chh0.j(t, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                return !ql5.b.equals(chh0.j(t, j2));
            case 11:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (chh0.i(t, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (chh0.h(t, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (chh0.i(t, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (chh0.j(t, j2) != null) {
                    return true;
                }
                return false;
            default:
                d580.a();
                return false;
        }
    }

    @Override // defpackage.an70
    public final T newInstance() {
        return (T) this.l.newInstance(this.e);
    }

    public final boolean p(T t, int i, int i2) {
        return chh0.h(t, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void q(Object obj, int i, Object obj2, o08 o08Var) throws f0p.a {
        long jO = O(i) & 1048575;
        Object objJ = chh0.j(obj, jO);
        lou louVar = this.p;
        if (objJ == null) {
            objJ = louVar.a();
            chh0.q(obj, jO, objJ);
        } else if (louVar.isImmutable(objJ)) {
            jou jouVarA = louVar.a();
            louVar.mergeFrom(jouVarA, objJ);
            chh0.q(obj, jO, jouVarA);
            objJ = jouVarA;
        }
        louVar.forMutableMapData(objJ);
        louVar.forMapMetadata(obj2);
        o08Var.v(2);
        m08 m08Var = o08Var.a;
        m08Var.g(m08Var.x());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(T t, T t2, int i) {
        if (n(t2, i)) {
            long jO = O(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(t2, jO);
            if (object == null) {
                xfc.b(this.a[i], t2);
                return;
            }
            an70 an70VarL = l(i);
            if (!n(t, i)) {
                if (o(object)) {
                    Object objNewInstance = an70VarL.newInstance();
                    an70VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jO, objNewInstance);
                } else {
                    unsafe.putObject(t, jO, object);
                }
                I(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jO);
            if (!o(object2)) {
                Object objNewInstance2 = an70VarL.newInstance();
                an70VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jO, objNewInstance2);
                object2 = objNewInstance2;
            }
            an70VarL.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(T t, T t2, int i) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (p(t2, i2, i)) {
            long jO = O(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(t2, jO);
            if (object == null) {
                xfc.b(iArr[i], t2);
                return;
            }
            an70 an70VarL = l(i);
            if (!p(t, i2, i)) {
                if (o(object)) {
                    Object objNewInstance = an70VarL.newInstance();
                    an70VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jO, objNewInstance);
                } else {
                    unsafe.putObject(t, jO, object);
                }
                J(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jO);
            if (!o(object2)) {
                Object objNewInstance2 = an70VarL.newInstance();
                an70VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jO, objNewInstance2);
                object2 = objNewInstance2;
            }
            an70VarL.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(T t, int i) {
        an70 an70VarL = l(i);
        long jO = O(i) & 1048575;
        if (!n(t, i)) {
            return an70VarL.newInstance();
        }
        Object object = r.getObject(t, jO);
        if (o(object)) {
            return object;
        }
        Object objNewInstance = an70VarL.newInstance();
        if (object != null) {
            an70VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object u(T t, int i, int i2) {
        an70 an70VarL = l(i2);
        if (!p(t, i, i2)) {
            return an70VarL.newInstance();
        }
        Object object = r.getObject(t, O(i2) & 1048575);
        if (o(object)) {
            return object;
        }
        Object objNewInstance = an70VarL.newInstance();
        if (object != null) {
            an70VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void z(Object obj, byte[] bArr, int i, int i2, int i3, long j, fx0.a aVar) throws f0p {
        Object objK = k(i3);
        Unsafe unsafe = r;
        Object object = unsafe.getObject(obj, j);
        lou louVar = this.p;
        if (louVar.isImmutable(object)) {
            jou jouVarA = louVar.a();
            louVar.mergeFrom(jouVarA, object);
            unsafe.putObject(obj, j, jouVarA);
            object = jouVarA;
        }
        louVar.forMapMetadata(objK);
        louVar.forMutableMapData(object);
        int i4 = fx0.i(bArr, i, aVar);
        int i5 = aVar.a;
        if (i5 >= 0 && i5 <= i2 - i4) {
            throw null;
        }
        throw f0p.g();
    }
}
