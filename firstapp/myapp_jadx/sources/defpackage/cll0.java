package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class cll0 {
    public static final cll0 c = new cll0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final tjl0 a = new tjl0();

    /* JADX WARN: Code duplicated, block: B:139:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0310  */
    /* JADX WARN: Code duplicated, block: B:145:0x0313  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:200:0x0430  */
    /* JADX WARN: Code duplicated, block: B:203:0x043a  */
    /* JADX WARN: Code duplicated, block: B:206:0x044d  */
    public final ill0 a(Class cls) {
        ill0 vkl0Var;
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        char cCharAt;
        int i11;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        Object[] objArr;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field fieldU;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldU2;
        int i33;
        Object obj2;
        Field fieldU3;
        int i34;
        char cCharAt10;
        int i35;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        Charset charset = kil0.a;
        if (cls == null) {
            bmy.a("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        ill0 ill0Var = (ill0) concurrentHashMap.get(cls);
        if (ill0Var != null) {
            return ill0Var;
        }
        kml0 kml0Var = lll0.a;
        thl0.class.isAssignableFrom(cls);
        fkl0 fkl0VarZzc = ((rjl0) this.a.a).zzc(cls);
        if (fkl0VarZzc.zza()) {
            kml0 kml0Var2 = lll0.a;
            hgl0 hgl0Var = jgl0.a;
            vkl0Var = new vkl0(kml0Var2, fkl0VarZzc.zzb());
        } else {
            int i40 = ykl0.a;
            int i41 = cjl0.a;
            kml0 kml0Var3 = lll0.a;
            hgl0 hgl0Var2 = fkl0VarZzc.zzc() + (-1) != 1 ? jgl0.a : null;
            int i42 = dkl0.a;
            int[] iArr2 = tkl0.l;
            if (!(fkl0VarZzc instanceof gll0)) {
                throw null;
            }
            gll0 gll0Var = (gll0) fkl0VarZzc;
            String str = gll0Var.b;
            int length = str.length();
            int iCharAt2 = 0;
            if (str.charAt(0) >= 55296) {
                int i43 = 1;
                while (true) {
                    i = i43 + 1;
                    if (str.charAt(i43) < 55296) {
                        break;
                    }
                    i43 = i;
                }
            } else {
                i = 1;
            }
            int i44 = i + 1;
            int iCharAt3 = str.charAt(i);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i39 = i44 + 1;
                    cCharAt13 = str.charAt(i44);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt13 & 8191) << i46;
                    i46 += 13;
                    i44 = i39;
                }
                iCharAt3 = i45 | (cCharAt13 << i46);
                i44 = i39;
            }
            if (iCharAt3 == 0) {
                i7 = 0;
                i5 = 0;
                i9 = 0;
                iCharAt = 0;
                i6 = 0;
                iArr = tkl0.l;
                i8 = 0;
            } else {
                int i47 = i44 + 1;
                int iCharAt4 = str.charAt(i44);
                if (iCharAt4 >= 55296) {
                    int i48 = iCharAt4 & 8191;
                    int i49 = 13;
                    while (true) {
                        i18 = i47 + 1;
                        cCharAt8 = str.charAt(i47);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt8 & 8191) << i49;
                        i49 += 13;
                        i47 = i18;
                    }
                    iCharAt4 = i48 | (cCharAt8 << i49);
                    i47 = i18;
                }
                int i50 = i47 + 1;
                int iCharAt5 = str.charAt(i47);
                if (iCharAt5 >= 55296) {
                    int i51 = iCharAt5 & 8191;
                    int i52 = 13;
                    while (true) {
                        i17 = i50 + 1;
                        cCharAt7 = str.charAt(i50);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt7 & 8191) << i52;
                        i52 += 13;
                        i50 = i17;
                    }
                    iCharAt5 = i51 | (cCharAt7 << i52);
                    i50 = i17;
                }
                int i53 = i50 + 1;
                int iCharAt6 = str.charAt(i50);
                if (iCharAt6 >= 55296) {
                    int i54 = iCharAt6 & 8191;
                    int i55 = 13;
                    while (true) {
                        i16 = i53 + 1;
                        cCharAt6 = str.charAt(i53);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt6 & 8191) << i55;
                        i55 += 13;
                        i53 = i16;
                    }
                    iCharAt6 = i54 | (cCharAt6 << i55);
                    i53 = i16;
                }
                int i56 = i53 + 1;
                int iCharAt7 = str.charAt(i53);
                if (iCharAt7 >= 55296) {
                    int i57 = iCharAt7 & 8191;
                    int i58 = 13;
                    while (true) {
                        i15 = i56 + 1;
                        cCharAt5 = str.charAt(i56);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i57 |= (cCharAt5 & 8191) << i58;
                        i58 += 13;
                        i56 = i15;
                    }
                    iCharAt7 = i57 | (cCharAt5 << i58);
                    i56 = i15;
                }
                int i59 = i56 + 1;
                iCharAt = str.charAt(i56);
                if (iCharAt >= 55296) {
                    int i60 = iCharAt & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i14 = i61 + 1;
                        cCharAt4 = str.charAt(i61);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i60 |= (cCharAt4 & 8191) << i62;
                        i62 += 13;
                        i61 = i14;
                    }
                    iCharAt = i60 | (cCharAt4 << i62);
                    i2 = i14;
                } else {
                    i2 = i59;
                }
                int i63 = i2 + 1;
                iCharAt2 = str.charAt(i2);
                if (iCharAt2 >= 55296) {
                    int i64 = iCharAt2 & 8191;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i13 = i65 + 1;
                        cCharAt3 = str.charAt(i65);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i64 |= (cCharAt3 & 8191) << i66;
                        i66 += 13;
                        i65 = i13;
                    }
                    iCharAt2 = i64 | (cCharAt3 << i66);
                    i3 = i13;
                } else {
                    i3 = i63;
                }
                int i67 = i3 + 1;
                int iCharAt8 = str.charAt(i3);
                if (iCharAt8 >= 55296) {
                    int i68 = iCharAt8 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i12 = i69 + 1;
                        cCharAt2 = str.charAt(i69);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i68 |= (cCharAt2 & 8191) << i70;
                        i70 += 13;
                        i69 = i12;
                    }
                    iCharAt8 = i68 | (cCharAt2 << i70);
                    i4 = i12;
                } else {
                    i4 = i67;
                }
                int i71 = i4 + 1;
                int iCharAt9 = str.charAt(i4);
                if (iCharAt9 >= 55296) {
                    int i72 = iCharAt9 & 8191;
                    int i73 = i71;
                    int i74 = 13;
                    while (true) {
                        i10 = i73 + 1;
                        cCharAt = str.charAt(i73);
                        i11 = i72;
                        if (cCharAt < 55296) {
                            break;
                        }
                        i72 = i11 | ((cCharAt & 8191) << i74);
                        i74 += 13;
                        i73 = i10;
                    }
                    iCharAt9 = i11 | (cCharAt << i74);
                    i71 = i10;
                }
                int i75 = iCharAt9 + iCharAt2 + iCharAt8;
                i5 = iCharAt4 + iCharAt4 + iCharAt5;
                int[] iArr3 = new int[i75];
                int i76 = i71;
                i6 = iCharAt4;
                i44 = i76;
                i7 = iCharAt6;
                iArr = iArr3;
                i8 = iCharAt7;
                i9 = iCharAt9;
            }
            Unsafe unsafe = tkl0.m;
            int i77 = iCharAt2;
            Object[] objArr2 = gll0Var.c;
            Class<?> cls2 = gll0Var.a.getClass();
            int i78 = i9 + i77;
            int i79 = i44;
            int i80 = iCharAt + iCharAt;
            int[] iArr4 = new int[iCharAt * 3];
            Object[] objArr3 = new Object[i80];
            int i81 = i5;
            int i82 = i79;
            int i83 = i9;
            int i84 = i78;
            int i85 = 0;
            int i86 = 0;
            while (i82 < length) {
                int i87 = i82 + 1;
                int iCharAt10 = str.charAt(i82);
                int i88 = length;
                if (iCharAt10 >= 55296) {
                    int i89 = iCharAt10 & 8191;
                    int i90 = i87;
                    int i91 = 13;
                    while (true) {
                        i38 = i90 + 1;
                        cCharAt12 = str.charAt(i90);
                        objArr = objArr3;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i89 |= (cCharAt12 & 8191) << i91;
                        i91 += 13;
                        i90 = i38;
                        objArr3 = objArr;
                    }
                    iCharAt10 = i89 | (cCharAt12 << i91);
                    i19 = i38;
                } else {
                    objArr = objArr3;
                    i19 = i87;
                }
                int i92 = i19 + 1;
                int iCharAt11 = str.charAt(i19);
                if (iCharAt11 >= 55296) {
                    int i93 = iCharAt11 & 8191;
                    int i94 = i92;
                    int i95 = 13;
                    while (true) {
                        i36 = i94 + 1;
                        cCharAt11 = str.charAt(i94);
                        i37 = i93;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i93 = i37 | ((cCharAt11 & 8191) << i95);
                        i95 += 13;
                        i94 = i36;
                    }
                    iCharAt11 = i37 | (cCharAt11 << i95);
                    i20 = i36;
                } else {
                    i20 = i92;
                }
                int i96 = i7;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i85] = i86;
                    i85++;
                }
                int i97 = iCharAt11 & 255;
                int i98 = i8;
                int i99 = iCharAt11 & 2048;
                if (i97 >= 51) {
                    int i100 = i20 + 1;
                    int iCharAt12 = str.charAt(i20);
                    if (iCharAt12 >= 55296) {
                        int i101 = iCharAt12 & 8191;
                        int i102 = i100;
                        int i103 = 13;
                        while (true) {
                            i34 = i102 + 1;
                            cCharAt10 = str.charAt(i102);
                            i35 = i101;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i101 = i35 | ((cCharAt10 & 8191) << i103);
                            i103 += 13;
                            i102 = i34;
                        }
                        iCharAt12 = i35 | (cCharAt10 << i103);
                        i29 = i34;
                    } else {
                        i29 = i100;
                    }
                    int i104 = iCharAt12;
                    int i105 = i97 - 51;
                    int i106 = i29;
                    if (i105 == 9 || i105 == 17) {
                        i30 = i81 + 1;
                        int i107 = i86 / 3;
                        objArr[i107 + i107 + 1] = objArr2[i81];
                    } else {
                        if (i105 != 12) {
                            i31 = i99;
                        } else if (gll0Var.zzc() == 1 || i99 != 0) {
                            i30 = i81 + 1;
                            int i108 = i86 / 3;
                            objArr[i108 + i108 + 1] = objArr2[i81];
                        } else {
                            i31 = 0;
                        }
                        i32 = i104 + i104;
                        obj = objArr2[i32];
                        i27 = i31;
                        if (obj instanceof Field) {
                            fieldU2 = (Field) obj;
                        } else {
                            fieldU2 = tkl0.u(cls2, (String) obj);
                            objArr2[i32] = fieldU2;
                        }
                        i21 = iCharAt10;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldU2);
                        i33 = i32 + 1;
                        obj2 = objArr2[i33];
                        if (obj2 instanceof Field) {
                            fieldU3 = (Field) obj2;
                        } else {
                            fieldU3 = tkl0.u(cls2, (String) obj2);
                            objArr2[i33] = fieldU3;
                        }
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldU3);
                        iArr = iArr;
                        i9 = i9;
                        i82 = i106;
                        i25 = 0;
                        iObjectFieldOffset2 = iObjectFieldOffset4;
                        i26 = iObjectFieldOffset3;
                    }
                    i81 = i30;
                    i31 = i99;
                    i32 = i104 + i104;
                    obj = objArr2[i32];
                    i27 = i31;
                    if (obj instanceof Field) {
                        fieldU2 = (Field) obj;
                    } else {
                        fieldU2 = tkl0.u(cls2, (String) obj);
                        objArr2[i32] = fieldU2;
                    }
                    i21 = iCharAt10;
                    int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldU2);
                    i33 = i32 + 1;
                    obj2 = objArr2[i33];
                    if (obj2 instanceof Field) {
                        fieldU3 = (Field) obj2;
                    } else {
                        fieldU3 = tkl0.u(cls2, (String) obj2);
                        objArr2[i33] = fieldU3;
                    }
                    int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldU3);
                    iArr = iArr;
                    i9 = i9;
                    i82 = i106;
                    i25 = 0;
                    iObjectFieldOffset2 = iObjectFieldOffset6;
                    i26 = iObjectFieldOffset5;
                } else {
                    i21 = iCharAt10;
                    int i109 = i81 + 1;
                    Field fieldU4 = tkl0.u(cls2, (String) objArr2[i81]);
                    if (i97 == 9 || i97 == 17) {
                        int i110 = i86 / 3;
                        objArr[i110 + i110 + 1] = fieldU4.getType();
                    } else {
                        if (i97 != 27) {
                            if (i97 == 49) {
                                i81 += 2;
                                i28 = 1;
                            } else if (i97 == 12 || i97 == 30 || i97 == 44) {
                                iArr = iArr;
                                if (gll0Var.zzc() == 1 || i99 != 0) {
                                    i81 += 2;
                                    int i111 = i86 / 3;
                                    objArr[i111 + i111 + 1] = objArr2[i109];
                                    i9 = i9;
                                    i22 = i99;
                                } else {
                                    i9 = i9;
                                    i81 = i109;
                                    i22 = 0;
                                }
                            } else if (i97 == 50) {
                                int i112 = i81 + 2;
                                i83++;
                                iArr[i83] = i86;
                                int i113 = i86 / 3;
                                int i114 = i113 + i113;
                                objArr[i114] = objArr2[i109];
                                if (i99 != 0) {
                                    i81 += 3;
                                    objArr[i114 + 1] = objArr2[i112];
                                    i22 = i99;
                                } else {
                                    i81 = i112;
                                    i22 = 0;
                                }
                                iArr = iArr;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldU4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt11 & 4096) != 0 || i97 > 17) {
                                i23 = i20;
                                i24 = 0;
                            } else {
                                int i115 = i20 + 1;
                                int iCharAt13 = str.charAt(i20);
                                if (iCharAt13 >= 55296) {
                                    int i116 = iCharAt13 & 8191;
                                    int i117 = 13;
                                    while (true) {
                                        i23 = i115 + 1;
                                        cCharAt9 = str.charAt(i115);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i116 |= (cCharAt9 & 8191) << i117;
                                        i117 += 13;
                                        i115 = i23;
                                    }
                                    iCharAt13 = i116 | (cCharAt9 << i117);
                                } else {
                                    i23 = i115;
                                }
                                int i118 = (iCharAt13 / 32) + i6 + i6;
                                Object obj3 = objArr2[i118];
                                if (obj3 instanceof Field) {
                                    fieldU = (Field) obj3;
                                } else {
                                    fieldU = tkl0.u(cls2, (String) obj3);
                                    objArr2[i118] = fieldU;
                                }
                                i24 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldU);
                            }
                            if (i97 >= 18 || i97 > 49) {
                                int i119 = i22;
                                i25 = i24;
                                i26 = iObjectFieldOffset;
                                i82 = i23;
                                i27 = i119;
                            } else {
                                int i120 = i84 + 1;
                                iArr[i84] = iObjectFieldOffset;
                                int i121 = i22;
                                i25 = i24;
                                i26 = iObjectFieldOffset;
                                i82 = i23;
                                i27 = i121;
                                i84 = i120;
                            }
                        } else {
                            i28 = 1;
                            i81 += 2;
                        }
                        int i122 = i86 / 3;
                        objArr[i122 + i122 + i28] = objArr2[i109];
                        i9 = i9;
                        i22 = i99;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldU4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0) {
                            i23 = i20;
                            i24 = 0;
                        } else {
                            i23 = i20;
                            i24 = 0;
                        }
                        if (i97 >= 18) {
                            int i1110 = i22;
                            i25 = i24;
                            i26 = iObjectFieldOffset;
                            i82 = i23;
                            i27 = i1110;
                        } else {
                            int i1111 = i22;
                            i25 = i24;
                            i26 = iObjectFieldOffset;
                            i82 = i23;
                            i27 = i1111;
                        }
                    }
                    i9 = i9;
                    i22 = i99;
                    i81 = i109;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldU4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i23 = i20;
                        i24 = 0;
                    } else {
                        i23 = i20;
                        i24 = 0;
                    }
                    if (i97 >= 18) {
                        int i1112 = i22;
                        i25 = i24;
                        i26 = iObjectFieldOffset;
                        i82 = i23;
                        i27 = i1112;
                    } else {
                        int i1113 = i22;
                        i25 = i24;
                        i26 = iObjectFieldOffset;
                        i82 = i23;
                        i27 = i1113;
                    }
                }
                int i123 = i86 + 1;
                iArr4[i86] = i21;
                int i124 = i86 + 2;
                String str2 = str;
                iArr4[i123] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i27 != 0 ? Integer.MIN_VALUE : 0) | (i97 << 20) | i26;
                i86 += 3;
                iArr4[i124] = (i25 << 20) | iObjectFieldOffset2;
                i9 = i9;
                i7 = i96;
                length = i88;
                i8 = i98;
                objArr3 = objArr;
                iArr = iArr;
                str = str2;
            }
            vkl0Var = new tkl0(iArr4, objArr3, i7, i8, gll0Var.a, iArr, i9, i78, kml0Var3, hgl0Var2);
        }
        Charset charset2 = kil0.a;
        ill0 ill0Var2 = (ill0) concurrentHashMap.putIfAbsent(cls, vkl0Var);
        return ill0Var2 != null ? ill0Var2 : vkl0Var;
    }
}
