package com.google.android.recaptcha.internal;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import defpackage.d580;
import defpackage.dsl0;
import defpackage.hb5;
import defpackage.ux5;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zztv<T> implements zzug<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzvc.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzts zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzuv zzm;
    private final zzrz zzn;

    private zztv(int[] iArr, Object[] objArr, int i, int i2, zzts zztsVar, boolean z, int[] iArr2, int i3, int i4, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zztsVar instanceof zzsn;
        boolean z2 = false;
        if (zzrzVar != null && (zztsVar instanceof zzsk)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzuvVar;
        this.zzn = zzrzVar;
        this.zzg = zztsVar;
    }

    private final Object zzA(Object obj, int i) {
        zzug zzugVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzugVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzugVarZzx.zze();
        if (object != null) {
            zzugVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzug zzugVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzugVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzugVarZzx.zze();
        if (object != null) {
            zzugVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbA = ux5.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString(), e);
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        hb5.a("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzug zzugVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzugVarZzx.zze();
                    zzugVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzugVarZzx.zze();
                zzugVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzugVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzug zzugVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzugVarZzx.zze();
                    zzugVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzugVarZzx.zze();
                zzugVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzugVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzuf zzufVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzvc.zzs(obj, j, zzufVar.zzs());
        } else if (this.zzi) {
            zzvc.zzs(obj, j, zzufVar.zzr());
        } else {
            zzvc.zzs(obj, j, zzufVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzvc.zzq(obj, j, (1 << (iZzr >>> 20)) | zzvc.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzvc.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return ((1 << (iZzr >>> 20)) & zzvc.zzc(obj, j)) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzvc.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzvc.zzb(obj, j2)) != 0;
            case 2:
                return zzvc.zzd(obj, j2) != 0;
            case 3:
                return zzvc.zzd(obj, j2) != 0;
            case 4:
                return zzvc.zzc(obj, j2) != 0;
            case 5:
                return zzvc.zzd(obj, j2) != 0;
            case 6:
                return zzvc.zzc(obj, j2) != 0;
            case 7:
                return zzvc.zzw(obj, j2);
            case 8:
                Object objZzf = zzvc.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzqm) {
                    return !zzqm.zzb.equals(objZzf);
                }
                d580.a();
                return false;
            case 9:
                return zzvc.zzf(obj, j2) != null;
            case 10:
                return !zzqm.zzb.equals(zzvc.zzf(obj, j2));
            case 11:
                return zzvc.zzc(obj, j2) != 0;
            case 12:
                return zzvc.zzc(obj, j2) != 0;
            case 13:
                return zzvc.zzc(obj, j2) != 0;
            case 14:
                return zzvc.zzd(obj, j2) != 0;
            case 15:
                return zzvc.zzc(obj, j2) != 0;
            case 16:
                return zzvc.zzd(obj, j2) != 0;
            case 17:
                return zzvc.zzf(obj, j2) != null;
            default:
                d580.a();
                return false;
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzug zzugVar) {
        return zzugVar.zzl(zzvc.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzsn) {
            return ((zzsn) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzvc.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzvc.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzvi zzviVar) {
        if (obj instanceof String) {
            zzviVar.zzG(i, (String) obj);
        } else {
            zzviVar.zzd(i, (zzqm) obj);
        }
    }

    public static zzuw zzd(Object obj) {
        zzsn zzsnVar = (zzsn) obj;
        zzuw zzuwVar = zzsnVar.zzc;
        if (zzuwVar != zzuw.zzc()) {
            return zzuwVar;
        }
        zzuw zzuwVarZzf = zzuw.zzf();
        zzsnVar.zzc = zzuwVarZzf;
        return zzuwVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zztv zzm(Class cls, zztp zztpVar, zzty zztyVar, zztf zztfVar, zzuv zzuvVar, zzrz zzrzVar, zztn zztnVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzC2;
        int i27;
        Object obj2;
        Field fieldZzC3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zztpVar instanceof zzue)) {
            throw null;
        }
        zzue zzueVar = (zzue) zztpVar;
        String strZzd = zzueVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzueVar.zze();
        Class<?> cls2 = zzueVar.zza().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strZzd.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strZzd.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i76 = iCharAt11 & 255;
            zzue zzueVar2 = zzueVar;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i66 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (zzueVar2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i66 / 3;
                        objArr[i85 + i85 + 1] = objArrZze[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i26] = fieldZzC2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    strZzd = strZzd;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i26] = fieldZzC2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i66 / 3;
                    objArr[i91 + i91 + 1] = fieldZzC4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zzueVar2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i66 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i66;
                            int i95 = i66 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = (iCharAt13 / 32) + i18 + i18;
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzC;
                            }
                            i19 = iCharAt13 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i101 = i66 / 3;
                    objArr[i101 + i101 + i22] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i102 = i66 + 1;
            iArr3[i66] = iCharAt10;
            int i103 = i66 + 2;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i103] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strZzd = strZzd;
            c2 = c;
            zzueVar = zzueVar2;
            length = length;
            i7 = i18;
        }
        return new zztv(iArr3, objArr, i2, i4, zzueVar.zza(), false, iArr, i5, i62, zztyVar, zztfVar, zzuvVar, zzrzVar, zztnVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzvc.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzvc.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzvc.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzvc.zzf(obj, j)).longValue();
    }

    private final zzsr zzw(int i) {
        int i2 = i / 3;
        return (zzsr) this.zzd[i2 + i2 + 1];
    }

    private final zzug zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzug zzugVar = (zzug) objArr[i3];
        if (zzugVar != null) {
            return zzugVar;
        }
        zzug zzugVarZzb = zzuc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzugVarZzb;
        return zzugVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzuv zzuvVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzvc.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:139:0x038c  */
    /* JADX WARN: Code duplicated, block: B:196:0x04de  */
    @Override // com.google.android.recaptcha.internal.zzug
    public final int zza(Object obj) {
        int i;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int iZzw;
        int iZzA4;
        int size;
        int iZzl;
        int iZzA5;
        int iZzA6;
        int iZzA7;
        int iZze;
        int iZzA8;
        int iZzA9;
        int iZzw2;
        int iZzA10;
        int iZzB2;
        zztv<T> zztvVar = this;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iA = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = zztvVar.zzc;
            if (i3 >= iArr.length) {
                int iZza = ((zzsn) obj).zzc.zza() + iA;
                if (!zztvVar.zzh) {
                    return iZza;
                }
                zzuo zzuoVar = ((zzsk) obj).zzb.zza;
                int iZzc = zzuoVar.zzc();
                int iZza2 = 0;
                for (int i6 = 0; i6 < iZzc; i6++) {
                    Map.Entry entryZzg = zzuoVar.zzg(i6);
                    iZza2 += zzsd.zza((zzsc) ((zzuk) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzuoVar.zzd()) {
                    iZza2 += zzsd.zza((zzsc) entry.getKey(), entry.getValue());
                }
                return iZza + iZza2;
            }
            int iZzu = zztvVar.zzu(i3);
            int iZzt = zzt(iZzu);
            int i7 = iArr[i3];
            int i8 = iArr[i3 + 2];
            int i9 = i8 & i2;
            if (iZzt <= 17) {
                if (i9 != i5) {
                    i4 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i5 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iZzu & i2;
            if (iZzt >= zzse.zzJ.zza()) {
                zzse.zzW.zza();
            }
            long j = i10;
            switch (iZzt) {
                case 0:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA = zzqv.zzA(i7 << 3);
                        iZzB = zzqv.zzB(j2);
                        iA += iZzB + iZzA;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA = zzqv.zzA(i7 << 3);
                        iZzB = zzqv.zzB(j3);
                        iA += iZzB + iZzA;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzA = zzqv.zzA(i7 << 3);
                        iZzB = zzqv.zzB(j4);
                        iA += iZzB + iZzA;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 1, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzqm) {
                            iZzA2 = zzqv.zzA(i11);
                            iZzd = ((zzqm) object).zzd();
                            iZzA3 = zzqv.zzA(iZzd);
                            iA += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzqv.zzA(i11);
                            iZzB = zzqv.zzz((String) object);
                            iA += iZzB + iZzA;
                        }
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iZzh = zzui.zzh(i7, unsafe.getObject(obj, j), zztvVar.zzx(i3));
                        iA += iZzh;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        zzqm zzqmVar = (zzqm) unsafe.getObject(obj, j);
                        iZzA2 = zzqv.zzA(i7 << 3);
                        iZzd = zzqmVar.zzd();
                        iZzA3 = zzqv.zzA(iZzd);
                        iA += iZzA3 + iZzd + iZzA2;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(unsafe.getInt(obj, j), zzqv.zzA(i7 << 3), iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzA = zzqv.zzA(i7 << 3);
                        iZzB = zzqv.zzB(j5);
                        iA += iZzB + iZzA;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iA = dsl0.a((i12 >> 31) ^ (i12 + i12), zzqv.zzA(i7 << 3), iA);
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzA = zzqv.zzA(i7 << 3);
                        iZzB = zzqv.zzB((j6 >> 63) ^ (j6 + j6));
                        iA += iZzB + iZzA;
                    }
                    zztvVar = this;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (zztvVar.zzO(obj, i3, i5, i4, i)) {
                        iZzw = zzqv.zzw(i7, (zzts) unsafe.getObject(obj, j), zztvVar.zzx(i3));
                        iA += iZzw;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzui.zza;
                    if (list.size() == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzqv.zzA(i7 << 3) * list.size()) + zzui.zzg(list);
                    }
                    iA += iZzA4;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zzui.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zzl(list2);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzui.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zzf(list3);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zzui.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzqv.zzA(i7 << 3) + 1) * size2;
                    }
                    iA += iZzA4;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i17 = zzui.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzqv.zzA(i7 << 3) * size3;
                        if (list5 instanceof zzte) {
                            zzte zzteVar = (zzte) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object objZzc = zzteVar.zzc();
                                if (objZzc instanceof zzqm) {
                                    int iZzd2 = ((zzqm) objZzc).zzd();
                                    iZzA6 = dsl0.a(iZzd2, iZzd2, iZzA6);
                                } else {
                                    iZzA6 = zzqv.zzz((String) objZzc) + iZzA6;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof zzqm) {
                                    int iZzd3 = ((zzqm) obj2).zzd();
                                    iZzA6 = dsl0.a(iZzd3, iZzd3, iZzA6);
                                } else {
                                    iZzA6 = zzqv.zzz((String) obj2) + iZzA6;
                                }
                            }
                        }
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzug zzugVarZzx = zztvVar.zzx(i3);
                    int i20 = zzui.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzqv.zzA(i7 << 3) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj3 = list6.get(i21);
                            if (obj3 instanceof zztd) {
                                int iZza3 = ((zztd) obj3).zza();
                                iZzA7 = dsl0.a(iZza3, iZza3, iZzA7);
                            } else {
                                iZzA7 = zzqv.zzy((zzts) obj3, zzugVarZzx) + iZzA7;
                            }
                        }
                    }
                    iA += iZzA7;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zzui.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzqv.zzA(i7 << 3) * size5;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd4 = ((zzqm) list7.get(i23)).zzd();
                            iZzA6 = dsl0.a(iZzd4, iZzd4, iZzA6);
                        }
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzui.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zzk(list8);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzui.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zza(list9);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iZzh = zzui.zzb(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    iZzh = zzui.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iA += iZzh;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i26 = zzui.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zzi(list10);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i27 = zzui.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzl = zzui.zzj(list11);
                        iZzA5 = zzqv.zzA(i7 << 3);
                        iZzA6 = (iZzA5 * size) + iZzl;
                    }
                    iA += iZzA6;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    iZze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    iZze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    iZze = zzui.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 38:
                    iZze = zzui.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    iZze = zzui.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 40:
                    iZze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 41:
                    iZze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i28 = zzui.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 43:
                    iZze = zzui.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    iZze = zzui.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iZze = zzui.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 46:
                    iZze = zzui.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 47:
                    iZze = zzui.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 48:
                    iZze = zzui.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzA8 = zzqv.zzA(i7 << 3);
                        iZzA9 = zzqv.zzA(iZze);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzug zzugVarZzx2 = zztvVar.zzx(i3);
                    int i29 = zzui.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw2 = 0;
                    } else {
                        iZzw2 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iZzw2 += zzqv.zzw(i7, (zzts) list13.get(i30), zzugVarZzx2);
                        }
                    }
                    iA += iZzw2;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 50:
                    zztm zztmVar = (zztm) unsafe.getObject(obj, j);
                    if (zztmVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zztmVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 51:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 52:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 53:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        long jZzv = zzv(obj, j);
                        iZzA10 = zzqv.zzA(i7 << 3);
                        iZzB2 = zzqv.zzB(jZzv);
                        iA += iZzB2 + iZzA10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 54:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        long jZzv2 = zzv(obj, j);
                        iZzA10 = zzqv.zzA(i7 << 3);
                        iZzB2 = zzqv.zzB(jZzv2);
                        iA += iZzB2 + iZzA10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 55:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        long jZzp = zzp(obj, j);
                        iZzA10 = zzqv.zzA(i7 << 3);
                        iZzB2 = zzqv.zzB(jZzp);
                        iA += iZzB2 + iZzA10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 56:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 57:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 58:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 1, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 59:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        int i31 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzqm) {
                            iZze = zzqv.zzA(i31);
                            iZzA8 = ((zzqm) object2).zzd();
                            iZzA9 = zzqv.zzA(iZzA8);
                            iA += iZzA9 + iZzA8 + iZze;
                        } else {
                            iZzA10 = zzqv.zzA(i31);
                            iZzB2 = zzqv.zzz((String) object2);
                            iA += iZzB2 + iZzA10;
                        }
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 60:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iZzh = zzui.zzh(i7, unsafe.getObject(obj, j), zztvVar.zzx(i3));
                        iA += iZzh;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 61:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        zzqm zzqmVar2 = (zzqm) unsafe.getObject(obj, j);
                        iZze = zzqv.zzA(i7 << 3);
                        iZzA8 = zzqmVar2.zzd();
                        iZzA9 = zzqv.zzA(iZzA8);
                        iA += iZzA9 + iZzA8 + iZze;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 62:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(zzp(obj, j), zzqv.zzA(i7 << 3), iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 63:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        long jZzp2 = zzp(obj, j);
                        iZzA10 = zzqv.zzA(i7 << 3);
                        iZzB2 = zzqv.zzB(jZzp2);
                        iA += iZzB2 + iZzA10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 4, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 65:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iA = dsl0.a(i7 << 3, 8, iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 66:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        int iZzp = zzp(obj, j);
                        iA = dsl0.a((iZzp >> 31) ^ (iZzp + iZzp), zzqv.zzA(i7 << 3), iA);
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 67:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        long jZzv3 = zzv(obj, j);
                        iZzA10 = zzqv.zzA(i7 << 3);
                        iZzB2 = zzqv.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iA += iZzB2 + iZzA10;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 68:
                    if (zztvVar.zzR(obj, i7, i3)) {
                        iZzw = zzqv.zzw(i7, (zzts) unsafe.getObject(obj, j), zztvVar.zzx(i3));
                        iA += iZzw;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                default:
                    i3 += 3;
                    i2 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int iHashCode = ((zzsn) obj).zzc.hashCode() + (i5 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzsk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzu = zzu(i4);
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i4];
            long j = i6;
            int iHashCode2 = 37;
            switch (iZzt) {
                case 0:
                    i = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzvc.zza(obj, j));
                    byte[] bArr = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzvc.zzb(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    jDoubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr2 = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 3:
                    i = i5 * 53;
                    jDoubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr3 = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 4:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 5:
                    i = i5 * 53;
                    jDoubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr4 = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 6:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 7:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzsv.zza(zzvc.zzw(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object objZzf = zzvc.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i5 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 12:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 13:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 14:
                    i = i5 * 53;
                    jDoubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr5 = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 15:
                    i = i5 * 53;
                    iZzc = zzvc.zzc(obj, j);
                    i5 = i + iZzc;
                    break;
                case 16:
                    i = i5 * 53;
                    jDoubleToLongBits = zzvc.zzd(obj, j);
                    byte[] bArr6 = zzsv.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzc;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object objZzf2 = zzvc.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i5 = i3 + iHashCode2;
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
                    i2 = i5 * 53;
                    iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzsv.zza(zzS(obj, j));
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) zzvc.zzf(obj, j)).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        iZzc = zzp(obj, j);
                        i5 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i7, i4)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzsv.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i4)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzvc.zzf(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i4 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzqb r38) {
        /*
            Method dump skipped, instruction units count: 3748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zztv.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzqb):int");
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final Object zze() {
        return ((zzsn) this.zzg).zzv();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzsn) {
                zzsn zzsnVar = (zzsn) obj;
                zzsnVar.zzJ(Reader.READ_DONE);
                zzsnVar.zza = 0;
                zzsnVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
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
                                ((zzsu) zzvc.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zztm) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, iArr[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzui.zzq(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzui.zzp(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzvc.zzo(obj, j, zzvc.zza(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzvc.zzp(obj, j, zzvc.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzvc.zzm(obj, j, zzvc.zzw(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzvc.zzq(obj, j, zzvc.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzvc.zzr(obj, j, zzvc.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    zzsu zzsuVarZzd = (zzsu) zzvc.zzf(obj, j);
                    zzsu zzsuVar = (zzsu) zzvc.zzf(obj2, j);
                    int size = zzsuVarZzd.size();
                    int size2 = zzsuVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzsuVarZzd.zzc()) {
                            zzsuVarZzd = zzsuVarZzd.zzd(size2 + size);
                        }
                        zzsuVarZzd.addAll(zzsuVar);
                    }
                    if (size > 0) {
                        zzsuVar = zzsuVarZzd;
                    }
                    zzvc.zzs(obj, j, zzsuVar);
                    break;
                case 50:
                    int i4 = zzui.zza;
                    zzvc.zzs(obj, j, zztn.zzb(zzvc.zzf(obj, j), zzvc.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzvc.zzs(obj, j, zzvc.zzf(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:229:0x0823 A[LOOP:2: B:227:0x081f->B:229:0x0823, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0832  */
    /* JADX WARN: Code duplicated, block: B:239:0x0843 A[LOOP:3: B:237:0x083f->B:239:0x0843, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0854  */
    /* JADX WARN: Code duplicated, block: B:251:0x0810 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x081d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b A[Catch: all -> 0x005d, TryCatch #12 {all -> 0x005d, blocks: (B:20:0x0054, B:24:0x0064, B:26:0x006c, B:27:0x0070, B:60:0x015e, B:68:0x0183, B:65:0x016b, B:67:0x0171, B:29:0x0076, B:30:0x0080, B:31:0x008a, B:32:0x0094, B:33:0x009e, B:34:0x00a5, B:35:0x00a6, B:36:0x00b0, B:37:0x00b6, B:39:0x00be, B:41:0x00d3, B:42:0x00de, B:43:0x00e3, B:44:0x00e4, B:46:0x00ec, B:48:0x0101, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:70:0x018a, B:71:0x018d, B:73:0x0190), top: B:255:0x0054 }] */
    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzh(Object obj, zzuf zzufVar, zzry zzryVar) throws Throwable {
        Object obj2;
        zztv<T> zztvVar;
        Object obj3;
        int i;
        zzuv zzuvVar;
        Object obj4;
        zzuv zzuvVar2;
        Object obj5;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        int i2;
        Object obj6;
        zztv<T> zztvVar2 = this;
        zzryVar.getClass();
        zzD(obj);
        zzuv zzuvVar3 = zztvVar2.zzm;
        Object objZza = null;
        zzsd zzsdVarZzi = null;
        while (true) {
            try {
                int iZzc = zzufVar.zzc();
                int iZzq = zztvVar2.zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzuvVar2 = zzuvVar3;
                    obj4 = objZza;
                    try {
                        int iZzu = zztvVar2.zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzo(obj5, iZzu & 1048575, zzufVar.zza());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 1:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzp(obj5, iZzu & 1048575, zzufVar.zzb());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 2:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzl());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 3:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzo());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 4:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzg());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 5:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzk());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 6:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzf());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 7:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzm(obj5, iZzu & 1048575, zzufVar.zzN());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 8:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zztvVar.zzG(obj5, iZzu, zzufVar);
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 9:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzts zztsVar = (zzts) zztvVar.zzA(obj5, iZzq);
                                    zzufVar.zzu(zztsVar, zztvVar.zzx(iZzq), zzryVar);
                                    zztvVar.zzJ(obj5, iZzq, zztsVar);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 10:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzs(obj5, iZzu & 1048575, zzufVar.zzp());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 11:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzj());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 12:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    int iZze = zzufVar.zze();
                                    zzsr zzsrVarZzw = zztvVar.zzw(iZzq);
                                    if (zzsrVarZzw == null || zzsrVarZzw.zza(iZze)) {
                                        zzvc.zzq(obj5, iZzu & 1048575, iZze);
                                        zztvVar.zzH(obj5, iZzq);
                                        objZza = obj3;
                                    } else {
                                        objZza = zzui.zzo(obj5, iZzc, iZze, obj3, zzuvVar3);
                                    }
                                    zztvVar2 = zztvVar;
                                    break;
                                case 13:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzh());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 14:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzm());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 15:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzq(obj5, iZzu & 1048575, zzufVar.zzi());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 16:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzvc.zzr(obj5, iZzu & 1048575, zzufVar.zzn());
                                    zztvVar.zzH(obj5, iZzq);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 17:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzts zztsVar2 = (zzts) zztvVar.zzA(obj5, iZzq);
                                    zzufVar.zzt(zztsVar2, zztvVar.zzx(iZzq), zzryVar);
                                    zztvVar.zzJ(obj5, iZzq, zztsVar2);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 18:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzx(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 19:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzB(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 20:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzE(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 21:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzM(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 22:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzD(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzA(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 24:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzz(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzv(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case RuntimeVersion.MINOR /* 26 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    if (zzM(iZzu)) {
                                        ((zzqr) zzufVar).zzK(zztf.zza(obj5, iZzu & 1048575), true);
                                    } else {
                                        ((zzqr) zzufVar).zzK(zztf.zza(obj5, iZzu & 1048575), false);
                                    }
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzF(zztf.zza(obj5, iZzu & 1048575), zztvVar.zzx(iZzq), zzryVar);
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 28:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzw(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 29:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzL(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 30:
                                    zztvVar = zztvVar2;
                                    List listZza = zztf.zza(obj5, iZzu & 1048575);
                                    zzufVar.zzy(listZza);
                                    objZza = zzui.zzn(obj5, iZzc, listZza, zztvVar.zzw(iZzq), obj4, zzuvVar2);
                                    zzuvVar3 = zzuvVar2;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzG(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 32:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzH(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 33:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzI(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzJ(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 35:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzx(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzB(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzE(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 38:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzM(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzD(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 40:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzA(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 41:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzz(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    zzufVar.zzv(zztf.zza(obj5, iZzu & 1048575));
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 43:
                                    zztvVar = zztvVar2;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar2;
                                    obj2 = obj5;
                                    try {
                                        zzufVar.zzL(zztf.zza(obj2, iZzu & 1048575));
                                        objZza = obj3;
                                    } catch (zzsw unused) {
                                        objZza = obj3;
                                        if (objZza == null) {
                                            try {
                                                objZza = zzuvVar3.zza(obj2);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                        if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
                                            for (i2 = zztvVar.zzk; i2 < zztvVar.zzl; i2++) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzuvVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objZza = obj3;
                                        i = zztvVar.zzk;
                                        while (i < zztvVar.zzl) {
                                            zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
                                            i++;
                                            zztvVar = this;
                                        }
                                        if (objZza != null) {
                                            zzuvVar3.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    zztvVar = zztvVar2;
                                    List listZza2 = zztf.zza(obj5, iZzu & 1048575);
                                    zzufVar.zzy(listZza2);
                                    objZza = zzui.zzn(obj5, iZzc, listZza2, zztvVar.zzw(iZzq), obj4, zzuvVar2);
                                    zzuvVar3 = zzuvVar2;
                                    zztvVar2 = zztvVar;
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzufVar.zzG(zztf.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 46:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzufVar.zzH(zztf.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 47:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzufVar.zzI(zztf.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 48:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzufVar.zzJ(zztf.zza(obj6, iZzu & 1048575));
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 49:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzufVar.zzC(zztf.zza(obj6, iZzu & 1048575), zztvVar.zzx(iZzq), zzryVar);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 50:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    Object objZzz = zztvVar.zzz(iZzq);
                                    long jZzu = zztvVar.zzu(iZzq) & 1048575;
                                    Object objZzf = zzvc.zzf(obj6, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zztm.zza().zzb();
                                        zzvc.zzs(obj6, jZzu, objZzf);
                                    } else if (zztn.zza(objZzf)) {
                                        Object objZzb = zztm.zza().zzb();
                                        zztn.zzb(objZzb, objZzf);
                                        zzvc.zzs(obj6, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Double.valueOf(zzufVar.zza()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 52:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Float.valueOf(zzufVar.zzb()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 53:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzl()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 54:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzo()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 55:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzg()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 56:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzk()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 57:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzf()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 58:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Boolean.valueOf(zzufVar.zzN()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 59:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zztvVar.zzG(obj6, iZzu, zzufVar);
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 60:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzts zztsVar3 = (zzts) zztvVar.zzB(obj6, iZzc, iZzq);
                                    zzufVar.zzu(zztsVar3, zztvVar.zzx(iZzq), zzryVar);
                                    zztvVar.zzK(obj6, iZzc, iZzq, zztsVar3);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 61:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, zzufVar.zzp());
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 62:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzj()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 63:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    int iZze2 = zzufVar.zze();
                                    zzsr zzsrVarZzw2 = zztvVar.zzw(iZzq);
                                    if (zzsrVarZzw2 != null && !zzsrVarZzw2.zza(iZze2)) {
                                        objZza = zzui.zzo(obj6, iZzc, iZze2, obj4, zzuvVar);
                                        zzuvVar3 = zzuvVar;
                                        zztvVar2 = zztvVar;
                                    }
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzh()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 65:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzm()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 66:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Integer.valueOf(zzufVar.zzi()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 67:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    zzvc.zzs(obj6, iZzu & 1048575, Long.valueOf(zzufVar.zzn()));
                                    zztvVar.zzI(obj6, iZzc, iZzq);
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    zztvVar2 = zztvVar;
                                    break;
                                case 68:
                                    zztvVar = zztvVar2;
                                    obj6 = obj5;
                                    zzuvVar = zzuvVar2;
                                    try {
                                        zzts zztsVar4 = (zzts) zztvVar.zzB(obj6, iZzc, iZzq);
                                        zzufVar.zzt(zztsVar4, zztvVar.zzx(iZzq), zzryVar);
                                        zztvVar.zzK(obj6, iZzc, iZzq, zztsVar4);
                                        obj3 = obj4;
                                        zzuvVar3 = zzuvVar;
                                        objZza = obj3;
                                    } catch (zzsw unused2) {
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzuvVar3 = zzuvVar;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzuvVar3.zza(obj2);
                                        }
                                        if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
                                            while (i2 < zztvVar.zzl) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzuvVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj6;
                                        obj3 = obj4;
                                        zzuvVar3 = zzuvVar;
                                        objZza = obj3;
                                        i = zztvVar.zzk;
                                        while (i < zztvVar.zzl) {
                                            zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
                                            i++;
                                            zztvVar = this;
                                        }
                                        if (objZza != null) {
                                            zzuvVar3.zzj(obj2, objZza);
                                        }
                                        throw th;
                                    }
                                    zztvVar2 = zztvVar;
                                    break;
                                default:
                                    objZza = obj4 == null ? zzuvVar2.zza(obj5) : obj4;
                                    try {
                                        if (zzuvVar2.zzk(objZza, zzufVar, 0)) {
                                            zztvVar = zztvVar2;
                                            zzuvVar = zzuvVar2;
                                            zzuvVar3 = zzuvVar;
                                            zztvVar2 = zztvVar;
                                        } else {
                                            int i3 = zztvVar2.zzk;
                                            while (i3 < zztvVar2.zzl) {
                                                zzuv zzuvVar4 = zzuvVar2;
                                                zztvVar2.zzy(obj, zztvVar2.zzj[i3], objZza, zzuvVar4, obj);
                                                i3++;
                                                obj5 = obj;
                                                zztvVar2 = zztvVar2;
                                                zzuvVar2 = zzuvVar4;
                                            }
                                            obj2 = obj5;
                                            zzuvVar3 = zzuvVar2;
                                        }
                                    } catch (zzsw unused3) {
                                        zztvVar = zztvVar2;
                                        obj2 = obj5;
                                        zzuvVar3 = zzuvVar2;
                                        if (objZza == null) {
                                            objZza = zzuvVar3.zza(obj2);
                                        }
                                        if (!zzuvVar3.zzk(objZza, zzufVar, 0)) {
                                            while (i2 < zztvVar.zzl) {
                                                zztvVar.zzy(obj2, zztvVar.zzj[i2], objZza, zzuvVar3, obj);
                                            }
                                            if (objZza != null) {
                                                zzuvVar3.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zztvVar = zztvVar2;
                                        obj2 = obj5;
                                        zzuvVar3 = zzuvVar2;
                                    }
                                    break;
                            }
                        } catch (zzsw unused4) {
                            zztvVar = zztvVar2;
                            obj3 = obj4;
                            zzuvVar3 = zzuvVar2;
                            obj2 = obj5;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zzuv zzuvVar5 = zzuvVar2;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar3 = zzuvVar5;
                        obj2 = obj5;
                        objZza = obj3;
                        i = zztvVar.zzk;
                        while (i < zztvVar.zzl) {
                            zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
                            i++;
                            zztvVar = this;
                        }
                        if (objZza != null) {
                            zzuvVar3.zzj(obj2, objZza);
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i4 = zztvVar2.zzk;
                    while (i4 < zztvVar2.zzl) {
                        zztvVar2.zzy(obj, zztvVar2.zzj[i4], objZza, zzuvVar3, obj);
                        i4++;
                        zzuvVar3 = zzuvVar3;
                    }
                    obj2 = obj;
                    zzuvVar3 = zzuvVar3;
                } else {
                    Object obj7 = obj;
                    zzuvVar = zzuvVar3;
                    obj4 = objZza;
                    try {
                        zzsm zzsmVarZza = !zztvVar2.zzh ? null : zzryVar.zza(zztvVar2.zzg, iZzc);
                        if (zzsmVarZza != null) {
                            if (zzsdVarZzi == null) {
                                try {
                                    zzsdVarZzi = ((zzsk) obj7).zzi();
                                } catch (Throwable th6) {
                                    th = th6;
                                    zztvVar = zztvVar2;
                                    obj2 = obj7;
                                    obj3 = obj4;
                                    zzuvVar3 = zzuvVar;
                                    objZza = obj3;
                                    i = zztvVar.zzk;
                                    while (i < zztvVar.zzl) {
                                        zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
                                        i++;
                                        zztvVar = this;
                                    }
                                    if (objZza != null) {
                                        zzuvVar3.zzj(obj2, objZza);
                                    }
                                    throw th;
                                }
                            }
                            zzsl zzslVar = zzsmVarZza.zza;
                            zzvg zzvgVar = zzvg.zzn;
                            zzvg zzvgVar2 = zzslVar.zzb;
                            if (zzvgVar2 == zzvgVar) {
                                zzufVar.zzg();
                                throw null;
                            }
                            switch (zzvgVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzufVar.zza());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzsdVarZzi.zze(zzslVar)) != null) {
                                        byte[] bArr = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzufVar.zzb());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr3 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 2:
                                    objValueOf = Long.valueOf(zzufVar.zzl());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr4 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr5 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 3:
                                    objValueOf = Long.valueOf(zzufVar.zzo());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr6 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr7 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 4:
                                    objValueOf = Integer.valueOf(zzufVar.zzg());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr8 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr9 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 5:
                                    objValueOf = Long.valueOf(zzufVar.zzk());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr10 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr11 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 6:
                                    objValueOf = Integer.valueOf(zzufVar.zzf());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr12 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr13 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 7:
                                    objValueOf = Boolean.valueOf(zzufVar.zzN());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr14 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr15 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 8:
                                    objValueOf = zzufVar.zzr();
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr16 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr17 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 9:
                                    Object objZze2 = zzsdVarZzi.zze(zzslVar);
                                    if (!(objZze2 instanceof zzsn)) {
                                        throw null;
                                    }
                                    zzug zzugVarZzb = zzuc.zza().zzb(objZze2.getClass());
                                    if (!((zzsn) objZze2).zzL()) {
                                        Object objZze3 = zzugVarZzb.zze();
                                        zzugVarZzb.zzg(objZze3, objZze2);
                                        zzsdVarZzi.zzi(zzslVar, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzufVar.zzt(objZze2, zzugVarZzb, zzryVar);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                    break;
                                case 10:
                                    Object objZze4 = zzsdVarZzi.zze(zzslVar);
                                    if (!(objZze4 instanceof zzsn)) {
                                        throw null;
                                    }
                                    zzug zzugVarZzb2 = zzuc.zza().zzb(objZze4.getClass());
                                    if (!((zzsn) objZze4).zzL()) {
                                        Object objZze5 = zzugVarZzb2.zze();
                                        zzugVarZzb2.zzg(objZze5, objZze4);
                                        zzsdVarZzi.zzi(zzslVar, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzufVar.zzu(objZze4, zzugVarZzb2, zzryVar);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                    break;
                                case 11:
                                    objValueOf = zzufVar.zzp();
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr18 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr19 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzufVar.zzj());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr110 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr111 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzufVar.zzh());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr112 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr113 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzufVar.zzm());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr114 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr115 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzufVar.zzi());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr116 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr117 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzufVar.zzn());
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr118 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr119 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                                default:
                                    objValueOf = null;
                                    iOrdinal = zzvgVar2.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr1110 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    } else {
                                        byte[] bArr1111 = zzsv.zzb;
                                        objValueOf = ((zzts) objZze).zzag().zzc((zzts) objValueOf).zzl();
                                    }
                                    zzsdVarZzi.zzi(zzslVar, objValueOf);
                                    objZza = obj4;
                                    zzuvVar3 = zzuvVar;
                                    break;
                            }
                        } else {
                            objZza = obj4 == null ? zzuvVar.zza(obj7) : obj4;
                            try {
                                if (zzuvVar.zzk(objZza, zzufVar, 0)) {
                                    zzuvVar3 = zzuvVar;
                                } else {
                                    int i5 = zztvVar2.zzk;
                                    while (i5 < zztvVar2.zzl) {
                                        zzuv zzuvVar6 = zzuvVar;
                                        Object obj8 = obj7;
                                        zztvVar2.zzy(obj8, zztvVar2.zzj[i5], objZza, zzuvVar6, obj);
                                        i5++;
                                        obj7 = obj8;
                                        zzuvVar = zzuvVar6;
                                    }
                                    zzuvVar2 = zzuvVar;
                                    obj2 = obj7;
                                    zzuvVar3 = zzuvVar2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj7;
                                zzuvVar3 = zzuvVar;
                                zztvVar = zztvVar2;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzuvVar2 = zzuvVar;
                        obj5 = obj7;
                        zzuv zzuvVar7 = zzuvVar2;
                        zztvVar = zztvVar2;
                        obj3 = obj4;
                        zzuvVar3 = zzuvVar7;
                        obj2 = obj5;
                        objZza = obj3;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                obj2 = obj;
                zztvVar = zztvVar2;
                obj3 = objZza;
            }
            i = zztvVar.zzk;
            while (i < zztvVar.zzl) {
                zztvVar.zzy(obj2, zztvVar.zzj[i], objZza, zzuvVar3, obj);
                i++;
                zztvVar = this;
            }
            if (objZza != null) {
                zzuvVar3.zzj(obj2, objZza);
            }
            throw th;
        }
        if (objZza != null) {
            zzuvVar3.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzqb zzqbVar) {
        zzc(obj, bArr, i, i2, 0, zzqbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzug
    public final void zzj(Object obj, zzvi zzviVar) {
        Map.Entry entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        zztv<T> zztvVar = this;
        if (zztvVar.zzh) {
            zzsd zzsdVar = ((zzsk) obj).zzb;
            if (zzsdVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzsdVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zztvVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr.length) {
            int iZzu = zztvVar.zzu(i7);
            int iZzt = zzt(iZzu);
            int i9 = iArr[i7];
            if (iZzt <= 17) {
                int i10 = iArr[i7 + 2];
                z = true;
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = i6;
                i2 = i8;
                i3 = 1 << (i10 >>> 20);
            } else {
                z = true;
                i = i6;
                i2 = i8;
                i3 = 0;
            }
            while (true) {
                if (entry != null) {
                    zzrz zzrzVar = zztvVar.zzn;
                    i4 = i5;
                    if (((zzsl) entry.getKey()).zza <= i9) {
                        zzrzVar.zzb(zzviVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        i5 = i4;
                    }
                } else {
                    i4 = i5;
                }
            }
            long j = iZzu & i4;
            switch (iZzt) {
                case 0:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzf(i9, zzvc.zza(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 1:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzo(i9, zzvc.zzb(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 2:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzt(i9, unsafe.getLong(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 3:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzK(i9, unsafe.getLong(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 4:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzr(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 5:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzm(i9, unsafe.getLong(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 6:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzk(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 7:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzb(i9, zzvc.zzw(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 8:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzT(i9, unsafe.getObject(obj, j), zzviVar);
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 9:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 10:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 11:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzI(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 12:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzi(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 13:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzx(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 14:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzz(i9, unsafe.getLong(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 15:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzB(i9, unsafe.getInt(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 16:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzD(i9, unsafe.getLong(obj, j));
                    }
                    zztvVar = this;
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 17:
                    if (zztvVar.zzO(obj, i7, i, i2, i3)) {
                        zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 18:
                    zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 19:
                    zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 20:
                    zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 21:
                    zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 22:
                    zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 24:
                    zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    int i12 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzui.zza;
                    if (list != null && !list.isEmpty()) {
                        zzviVar.zzH(i12, list);
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    int i14 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzug zzugVarZzx = zztvVar.zzx(i7);
                    int i15 = zzui.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((zzqw) zzviVar).zzv(i14, list2.get(i16), zzugVarZzx);
                        }
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 28:
                    int i17 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i18 = zzui.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzviVar.zze(i17, list3);
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 29:
                    zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 30:
                    zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 32:
                    zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 33:
                    zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, false);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 35:
                    zzui.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzui.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zzui.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 38:
                    zzui.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzui.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 40:
                    zzui.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 41:
                    zzui.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    zzui.zzr(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 43:
                    zzui.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzui.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zzui.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 46:
                    zzui.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 47:
                    zzui.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 48:
                    zzui.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzviVar, z);
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 49:
                    int i19 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzug zzugVarZzx2 = zztvVar.zzx(i7);
                    int i20 = zzui.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ((zzqw) zzviVar).zzq(i19, list4.get(i21), zzugVarZzx2);
                        }
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 51:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzf(i9, zzn(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 52:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzo(i9, zzo(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 53:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzt(i9, zzv(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 54:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzK(i9, zzv(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 55:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzr(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 56:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzm(i9, zzv(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 57:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzk(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 58:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzb(i9, zzS(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 59:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzT(i9, unsafe.getObject(obj, j), zzviVar);
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 60:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzv(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 61:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzd(i9, (zzqm) unsafe.getObject(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 62:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzI(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 63:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzi(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzx(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 65:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzz(i9, zzv(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 66:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzB(i9, zzp(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 67:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzD(i9, zzv(obj, j));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                case 68:
                    if (zztvVar.zzR(obj, i9, i7)) {
                        zzviVar.zzq(i9, unsafe.getObject(obj, j), zztvVar.zzx(i7));
                    }
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
                default:
                    i7 += 3;
                    i8 = i2;
                    i5 = i4;
                    i6 = i;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zztvVar.zzn.zzb(zzviVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzsn) obj).zzc.zzl(zzviVar);
    }

    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzvc.zza(obj, j)) != Double.doubleToLongBits(zzvc.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzvc.zzb(obj, j)) != Float.floatToIntBits(zzvc.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzvc.zzw(obj, j) != zzvc.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzvc.zzc(obj, j) != zzvc.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzvc.zzd(obj, j) != zzvc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzvc.zzc(obj, jZzr) != zzvc.zzc(obj2, jZzr) || !zzui.zzF(zzvc.zzf(obj, j), zzvc.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zzsn) obj).zzc.equals(((zzsn) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzsk) obj).zzb.equals(((zzsk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzug
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzug zzugVarZzx;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i12;
            }
            if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i7, i, i2, i11) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzvc.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzugVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzugVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzvc.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzugVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzugVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zztm) zzvc.zzf(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzsk) obj).zzb.zzk();
    }
}
