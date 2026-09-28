package defpackage;

import com.google.protobuf.DescriptorProtos;
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
public final class tkl0<T> implements ill0<T> {
    public static final int[] l = new int[0];
    public static final Unsafe m;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final lkl0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final kml0 j;
    public final fgl0 k;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new mml0());
        } catch (Throwable unused) {
            unsafe = null;
        }
        m = unsafe;
    }

    public tkl0(int[] iArr, Object[] objArr, int i, int i2, lkl0 lkl0Var, int[] iArr2, int i3, int i4, kml0 kml0Var, hgl0 hgl0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (hgl0Var != null && (lkl0Var instanceof nhl0)) {
            z = true;
        }
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = kml0Var;
        this.k = hgl0Var;
        this.e = lkl0Var;
    }

    public static int C(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof thl0) {
            return ((thl0) obj).g();
        }
        return true;
    }

    public static int j(Object obj, long j) {
        return ((Integer) rml0.h(obj, j)).intValue();
    }

    public static long k(Object obj, long j) {
        return ((Long) rml0.h(obj, j)).longValue();
    }

    public static final int r(byte[] bArr, int i, int i2, yml0 yml0Var, Class cls, iel0 iel0Var) {
        yml0 yml0Var2 = yml0.c;
        switch (yml0Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                iel0Var.c = Double.valueOf(Double.longBitsToDouble(kel0.e(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                iel0Var.c = Float.valueOf(Float.intBitsToFloat(kel0.d(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iC = kel0.c(bArr, i, iel0Var);
                iel0Var.c = Long.valueOf(iel0Var.b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iA = kel0.a(bArr, i, iel0Var);
                iel0Var.c = Integer.valueOf(iel0Var.a);
                return iA;
            case 5:
            case 15:
                int i5 = i + 8;
                iel0Var.c = Long.valueOf(kel0.e(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                iel0Var.c = Integer.valueOf(kel0.d(i, bArr));
                return i6;
            case 7:
                int iC2 = kel0.c(bArr, i, iel0Var);
                iel0Var.c = Boolean.valueOf(iel0Var.b != 0);
                return iC2;
            case 8:
                return kel0.f(bArr, i, iel0Var);
            case 9:
            default:
                b9p.a("unsupported field type.");
                return 0;
            case 10:
                ill0 ill0VarA = cll0.c.a(cls);
                thl0 thl0VarZza = ill0VarA.zza();
                int iH = kel0.h(thl0VarZza, ill0VarA, bArr, i, i2, iel0Var);
                ill0VarA.f(thl0VarZza);
                iel0Var.c = thl0VarZza;
                return iH;
            case 11:
                return kel0.g(bArr, i, iel0Var);
            case 16:
                int iA2 = kel0.a(bArr, i, iel0Var);
                iel0Var.c = Integer.valueOf(ofl0.a(iel0Var.a));
                return iA2;
            case 17:
                int iC3 = kel0.c(bArr, i, iel0Var);
                iel0Var.c = Long.valueOf(ofl0.b(iel0Var.b));
                return iC3;
        }
    }

    public static iml0 s(Object obj) {
        thl0 thl0Var = (thl0) obj;
        iml0 iml0Var = thl0Var.zzc;
        if (iml0Var != iml0.f) {
            return iml0Var;
        }
        iml0 iml0VarA = iml0.a();
        thl0Var.zzc = iml0VarA;
        return iml0VarA;
    }

    public static Field u(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            hxa.c(sb, "Field ", str, " for ", name);
            jk40.a(uf80.a(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    public final Object A(int i, int i2, Object obj) {
        ill0 ill0VarX = x(i2);
        if (!p(i, i2, obj)) {
            return ill0VarX.zza();
        }
        Object object = m.getObject(obj, B(i2) & 1048575);
        if (i(object)) {
            return object;
        }
        thl0 thl0VarZza = ill0VarX.zza();
        if (object != null) {
            ill0VarX.d(thl0VarZza, object);
        }
        return thl0VarZza;
    }

    public final int B(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ill0
    public final int a(thl0 thl0Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                int iHashCode = thl0Var.zzc.hashCode() + (i6 * 53);
                if (!this.f) {
                    return iHashCode;
                }
                return ((nhl0) thl0Var).zzb.a.hashCode() + (iHashCode * 53);
            }
            int iB = B(i5);
            int i7 = 1048575 & iB;
            int iC = C(iB);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int iHashCode2 = 37;
            switch (iC) {
                case 0:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(rml0.c.l0(thl0Var, j));
                    Charset charset = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(rml0.c.j0(thl0Var, j));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = rml0.g(thl0Var, j);
                    Charset charset2 = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = rml0.g(thl0Var, j);
                    Charset charset3 = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = rml0.g(thl0Var, j);
                    Charset charset4 = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zH0 = rml0.c.h0(thl0Var, j);
                    Charset charset5 = kil0.a;
                    if (zH0) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) rml0.h(thl0Var, j)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objH = rml0.h(thl0Var, j);
                    if (objH != null) {
                        iHashCode2 = objH.hashCode();
                    }
                    i6 = i4 + iHashCode2;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = rml0.g(thl0Var, j);
                    Charset charset6 = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.e(thl0Var, j);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = rml0.g(thl0Var, j);
                    Charset charset7 = kil0.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objH2 = rml0.h(thl0Var, j);
                    if (objH2 != null) {
                        iHashCode2 = objH2.hashCode();
                    }
                    i6 = i4 + iHashCode2;
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
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) rml0.h(thl0Var, j)).doubleValue());
                        Charset charset8 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) rml0.h(thl0Var, j)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = k(thl0Var, j);
                        Charset charset9 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = k(thl0Var, j);
                        Charset charset10 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = k(thl0Var, j);
                        Charset charset11 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (p(i8, i5, thl0Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) rml0.h(thl0Var, j)).booleanValue();
                        Charset charset12 = kil0.a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) rml0.h(thl0Var, j)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = k(thl0Var, j);
                        Charset charset13 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = j(thl0Var, j);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (p(i8, i5, thl0Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = k(thl0Var, j);
                        Charset charset14 = kil0.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (p(i8, i5, thl0Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = rml0.h(thl0Var, j).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // defpackage.ill0
    public final boolean b(thl0 thl0Var, thl0 thl0Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iB = B(i);
                long j = iB & 1048575;
                switch (C(iB)) {
                    case 0:
                        if (l(thl0Var, thl0Var2, i)) {
                            o oVar = rml0.c;
                            if (Double.doubleToLongBits(oVar.l0(thl0Var, j)) == Double.doubleToLongBits(oVar.l0(thl0Var2, j))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (l(thl0Var, thl0Var2, i)) {
                            o oVar2 = rml0.c;
                            if (Float.floatToIntBits(oVar2.j0(thl0Var, j)) == Float.floatToIntBits(oVar2.j0(thl0Var2, j))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (l(thl0Var, thl0Var2, i) && rml0.g(thl0Var, j) == rml0.g(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (l(thl0Var, thl0Var2, i) && rml0.g(thl0Var, j) == rml0.g(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (l(thl0Var, thl0Var2, i) && rml0.g(thl0Var, j) == rml0.g(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (l(thl0Var, thl0Var2, i)) {
                            o oVar3 = rml0.c;
                            if (oVar3.h0(thl0Var, j) == oVar3.h0(thl0Var2, j)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (l(thl0Var, thl0Var2, i) && lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (l(thl0Var, thl0Var2, i) && lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (l(thl0Var, thl0Var2, i) && lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (l(thl0Var, thl0Var2, i) && rml0.g(thl0Var, j) == rml0.g(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (l(thl0Var, thl0Var2, i) && rml0.e(thl0Var, j) == rml0.e(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (l(thl0Var, thl0Var2, i) && rml0.g(thl0Var, j) == rml0.g(thl0Var2, j)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (l(thl0Var, thl0Var2, i) && lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j))) {
                            continue;
                            i += 3;
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
                        zA = lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j));
                        break;
                    case 50:
                        zA = lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j));
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
                        if (rml0.e(thl0Var, j2) == rml0.e(thl0Var2, j2) && lll0.a(rml0.h(thl0Var, j), rml0.h(thl0Var2, j))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zA) {
                    i += 3;
                }
            } else if (thl0Var.zzc.equals(thl0Var2.zzc)) {
                if (this.f) {
                    return ((nhl0) thl0Var).zzb.equals(((nhl0) thl0Var2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // defpackage.ill0
    public final void c(Object obj, cnl0 cnl0Var) throws sfl0 {
        Map.Entry entry;
        int i;
        tkl0<T> tkl0Var = this;
        if (tkl0Var.f) {
            ngl0 ngl0Var = ((nhl0) obj).zzb;
            if (ngl0Var.a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) ngl0Var.b().next();
            }
        } else {
            entry = null;
        }
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = tkl0Var.a;
            if (i4 >= iArr.length) {
                if (entry == null) {
                    ((thl0) obj).zzc.b(cnl0Var);
                    return;
                } else {
                    throw null;
                }
            }
            int iB = tkl0Var.B(i4);
            int iC = C(iB);
            int i6 = iArr[i4];
            Unsafe unsafe = m;
            if (iC <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iB & i2;
            int i9 = 2;
            switch (iC) {
                case 0:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.l(i6, Double.doubleToRawLongBits(rml0.c.l0(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 1:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.j(i6, Float.floatToRawIntBits(rml0.c.j0(obj, j)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 2:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.k(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 3:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.k(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 4:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 5:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.l(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 6:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.j(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 7:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.m(i6, rml0.c.h0(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 8:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((wfl0) cnl0Var).a.n(i6, (String) object);
                        } else {
                            ((wfl0) cnl0Var).a.o(i6, (lfl0) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 9:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        ill0 ill0VarX = tkl0Var.x(i4);
                        wfl0 wfl0Var = (wfl0) cnl0Var;
                        wfl0Var.getClass();
                        lkl0 lkl0Var = (lkl0) object2;
                        qfl0 qfl0Var = wfl0Var.a;
                        qfl0Var.t((i6 << 3) | 2);
                        qfl0Var.t(((bel0) lkl0Var).f(ill0VarX));
                        ill0VarX.c(lkl0Var, qfl0Var.a);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 10:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.o(i6, (lfl0) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 11:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.i(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 12:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 13:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.j(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 14:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a.l(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 15:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((wfl0) cnl0Var).a.i(i6, (i10 >> 31) ^ (i10 + i10));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 16:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((wfl0) cnl0Var).a.k(i6, (j2 + j2) ^ (j2 >> 63));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 17:
                    if (tkl0Var.m(obj, i4, i3, i5, i)) {
                        ((wfl0) cnl0Var).a(i6, unsafe.getObject(obj, j), tkl0Var.x(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 18:
                    lll0.c(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 19:
                    lll0.d(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 20:
                    lll0.e(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 21:
                    lll0.f(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 22:
                    lll0.j(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    lll0.h(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 24:
                    lll0.m(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    lll0.p(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    kml0 kml0Var = lll0.a;
                    if (list != null && !list.isEmpty()) {
                        qfl0 qfl0Var2 = ((wfl0) cnl0Var).a;
                        if (list instanceof zil0) {
                            zil0 zil0Var = (zil0) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objZzc = zil0Var.zzc();
                                if (objZzc instanceof String) {
                                    qfl0Var2.n(i11, (String) objZzc);
                                } else {
                                    qfl0Var2.o(i11, (lfl0) objZzc);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                qfl0Var2.n(i11, (String) list.get(i13));
                            }
                        }
                    }
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    ill0 ill0VarX2 = tkl0Var.x(i4);
                    kml0 kml0Var2 = lll0.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            Object obj2 = list2.get(i15);
                            wfl0 wfl0Var2 = (wfl0) cnl0Var;
                            wfl0Var2.getClass();
                            lkl0 lkl0Var2 = (lkl0) obj2;
                            qfl0 qfl0Var3 = wfl0Var2.a;
                            qfl0Var3.t((i14 << 3) | 2);
                            qfl0Var3.t(((bel0) lkl0Var2).f(ill0VarX2));
                            ill0VarX2.c(lkl0Var2, qfl0Var3.a);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    kml0 kml0Var3 = lll0.a;
                    if (list3 != null && !list3.isEmpty()) {
                        wfl0 wfl0Var3 = (wfl0) cnl0Var;
                        wfl0Var3.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            wfl0Var3.a.o(i16, (lfl0) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    lll0.k(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 30:
                    lll0.o(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    lll0.n(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 32:
                    lll0.i(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 33:
                    lll0.l(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    lll0.g(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    tkl0Var = this;
                    break;
                case 35:
                    lll0.c(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    lll0.d(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    lll0.e(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 38:
                    lll0.f(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    lll0.j(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 40:
                    lll0.h(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 41:
                    lll0.m(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    lll0.p(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 43:
                    lll0.k(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    lll0.o(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    lll0.n(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 46:
                    lll0.i(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 47:
                    lll0.l(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 48:
                    lll0.g(iArr[i4], (List) unsafe.getObject(obj, j), cnl0Var, true);
                    break;
                case 49:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    ill0 ill0VarX3 = tkl0Var.x(i4);
                    kml0 kml0Var4 = lll0.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            ((wfl0) cnl0Var).a(i18, list4.get(i19), ill0VarX3);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        int i20 = i4 / 3;
                        vjl0 vjl0Var = ((xjl0) tkl0Var.b[i20 + i20]).a;
                        wfl0 wfl0Var4 = (wfl0) cnl0Var;
                        wfl0Var4.getClass();
                        for (Map.Entry entry2 : ((zjl0) object3).entrySet()) {
                            qfl0 qfl0Var4 = wfl0Var4.a;
                            qfl0Var4.g(i6, i9);
                            qfl0Var4.t(xjl0.b(vjl0Var, entry2.getKey(), entry2.getValue()));
                            xjl0.a(qfl0Var4, vjl0Var, entry2.getKey(), entry2.getValue());
                            i9 = i9;
                        }
                    }
                    break;
                case 51:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.l(i6, Double.doubleToRawLongBits(((Double) rml0.h(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.j(i6, Float.floatToRawIntBits(((Float) rml0.h(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.k(i6, k(obj, j));
                    }
                    break;
                case 54:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.k(i6, k(obj, j));
                    }
                    break;
                case 55:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.h(i6, j(obj, j));
                    }
                    break;
                case 56:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.l(i6, k(obj, j));
                    }
                    break;
                case 57:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.j(i6, j(obj, j));
                    }
                    break;
                case 58:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.m(i6, ((Boolean) rml0.h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (tkl0Var.p(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            ((wfl0) cnl0Var).a.n(i6, (String) object4);
                        } else {
                            ((wfl0) cnl0Var).a.o(i6, (lfl0) object4);
                        }
                    }
                    break;
                case 60:
                    if (tkl0Var.p(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        ill0 ill0VarX4 = tkl0Var.x(i4);
                        wfl0 wfl0Var5 = (wfl0) cnl0Var;
                        wfl0Var5.getClass();
                        lkl0 lkl0Var3 = (lkl0) object5;
                        qfl0 qfl0Var5 = wfl0Var5.a;
                        qfl0Var5.t((i6 << 3) | 2);
                        qfl0Var5.t(((bel0) lkl0Var3).f(ill0VarX4));
                        ill0VarX4.c(lkl0Var3, qfl0Var5.a);
                    }
                    break;
                case 61:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.o(i6, (lfl0) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.i(i6, j(obj, j));
                    }
                    break;
                case 63:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.h(i6, j(obj, j));
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.j(i6, j(obj, j));
                    }
                    break;
                case 65:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a.l(i6, k(obj, j));
                    }
                    break;
                case 66:
                    if (tkl0Var.p(i6, i4, obj)) {
                        int iJ = j(obj, j);
                        ((wfl0) cnl0Var).a.i(i6, (iJ >> 31) ^ (iJ + iJ));
                    }
                    break;
                case 67:
                    if (tkl0Var.p(i6, i4, obj)) {
                        long jK = k(obj, j);
                        ((wfl0) cnl0Var).a.k(i6, (jK >> 63) ^ (jK + jK));
                    }
                    break;
                case 68:
                    if (tkl0Var.p(i6, i4, obj)) {
                        ((wfl0) cnl0Var).a(i6, unsafe.getObject(obj, j), tkl0Var.x(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            tkl0Var = this;
        }
    }

    @Override // defpackage.ill0
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            hb5.a("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                lll0.b(obj4, obj2);
                if (!this.f || ((nhl0) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iB = B(i);
            int i2 = iB & 1048575;
            int iC = C(iB);
            int i3 = iArr[i];
            long j = i2;
            switch (iC) {
                case 0:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        o oVar = rml0.c;
                        oVar.m0(obj3, j, oVar.l0(obj2, j));
                        o(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        o oVar2 = rml0.c;
                        oVar2.k0(obj3, j, oVar2.j0(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        ((Unsafe) rml0.c.a).putLong(obj3, j, rml0.g(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        ((Unsafe) rml0.c.a).putLong(obj3, j, rml0.g(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        ((Unsafe) rml0.c.a).putLong(obj3, j, rml0.g(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        o oVar3 = rml0.c;
                        oVar3.i0(obj3, j, oVar3.h0(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.i(obj3, j, rml0.h(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    v(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.i(obj3, j, rml0.h(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        ((Unsafe) rml0.c.a).putLong(obj3, j, rml0.g(obj2, j));
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (n(i, obj2)) {
                        rml0.f(obj3, rml0.e(obj2, j), j);
                        o(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        obj3 = obj;
                        ((Unsafe) rml0.c.a).putLong(obj3, j, rml0.g(obj2, j));
                        o(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    v(i, obj, obj2);
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
                    iil0 iil0VarZzg = (iil0) rml0.h(obj, j);
                    iil0 iil0Var = (iil0) rml0.h(obj2, j);
                    int size = iil0VarZzg.size();
                    int size2 = iil0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!iil0VarZzg.zza()) {
                            iil0VarZzg = iil0VarZzg.zzg(size2 + size);
                        }
                        iil0VarZzg.addAll(iil0Var);
                    }
                    if (size > 0) {
                        iil0Var = iil0VarZzg;
                    }
                    rml0.i(obj, j, iil0Var);
                    break;
                case 50:
                    kml0 kml0Var = lll0.a;
                    rml0.i(obj, j, bkl0.a(rml0.h(obj, j), rml0.h(obj2, j)));
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
                    if (p(i3, i, obj2)) {
                        rml0.i(obj, j, rml0.h(obj2, j));
                        rml0.f(obj, i3, iArr[i + 2] & 1048575);
                    }
                    break;
                case 60:
                    w(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (p(i3, i, obj2)) {
                        rml0.i(obj, j, rml0.h(obj2, j));
                        rml0.f(obj, i3, iArr[i + 2] & 1048575);
                    }
                    break;
                case 68:
                    w(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.ill0
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iB = B(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = m.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iB) == 0 || m(obj, i6, i, i2, i10)) {
                int iC = C(iB);
                if (iC != 9 && iC != 17) {
                    if (iC != 27) {
                        if (iC == 60 || iC == 68) {
                            if (!p(i7, i6, obj) || x(i6).e(rml0.h(obj, iB & 1048575))) {
                                i4++;
                                i5 = i;
                                i3 = i2;
                            }
                        } else if (iC != 49) {
                            if (iC != 50) {
                                continue;
                            } else {
                                zjl0 zjl0Var = (zjl0) rml0.h(obj, iB & 1048575);
                                if (zjl0Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i12 = i6 / 3;
                                    if (((xjl0) this.b[i12 + i12]).a.b.a == anl0.w) {
                                        ill0 ill0VarA = null;
                                        for (Object obj2 : zjl0Var.values()) {
                                            if (ill0VarA == null) {
                                                ill0VarA = cll0.c.a(obj2.getClass());
                                            }
                                            if (!ill0VarA.e(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i4++;
                            i5 = i;
                            i3 = i2;
                        }
                    }
                    List list = (List) rml0.h(obj, iB & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ill0 ill0VarX = x(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (ill0VarX.e(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!m(obj, i6, i, i2, i10) || x(i6).e(rml0.h(obj, iB & 1048575))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        if (this.f) {
            ((nhl0) obj).zzb.c();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[SYNTHETIC] */
    @Override // defpackage.ill0
    public final void f(Object obj) {
        if (!i(obj)) {
            return;
        }
        if (obj instanceof thl0) {
            thl0 thl0Var = (thl0) obj;
            thl0Var.l();
            thl0Var.zza = 0;
            thl0Var.h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                iml0 iml0Var = ((thl0) obj).zzc;
                if (iml0Var.e) {
                    iml0Var.e = false;
                }
                if (this.f) {
                    ((hgl0) this.k).getClass();
                    ((nhl0) obj).zzb.a();
                    return;
                }
                return;
            }
            int iB = B(i);
            int i2 = 1048575 & iB;
            int iC = C(iB);
            long j = i2;
            Unsafe unsafe = m;
            if (iC != 9) {
                if (iC != 60 && iC != 68) {
                    switch (iC) {
                        case 17:
                            if (n(i, obj)) {
                                x(i).f(unsafe.getObject(obj, j));
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
                            ((iil0) rml0.h(obj, j)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zjl0) object).a = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (p(iArr[i], i, obj)) {
                    x(i).f(unsafe.getObject(obj, j));
                }
            } else if (n(i, obj)) {
                x(i).f(unsafe.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.ill0
    public final void g(Object obj, byte[] bArr, int i, int i2, iel0 iel0Var) throws oil0 {
        t(obj, bArr, i, i2, 0, iel0Var);
    }

    /* JADX WARN: Code duplicated, block: B:199:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:236:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    @Override // defpackage.ill0
    public final int h(thl0 thl0Var) {
        int i;
        int iF;
        int iA;
        int iF2;
        int iC;
        int iZ;
        int i2;
        int iF3;
        int i3;
        int iF4;
        int iF5;
        int size;
        int iR;
        int iF6;
        int iF7;
        int iF8;
        int size2;
        int iF9;
        int iF10;
        int iF11;
        int iA2;
        int iF12;
        int iC2;
        int iJ;
        int iF13;
        tkl0<T> tkl0Var = this;
        thl0 thl0Var2 = thl0Var;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iA3 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = tkl0Var.a;
            if (i5 >= iArr.length) {
                int iC3 = thl0Var2.zzc.c() + iA3;
                if (tkl0Var.f) {
                    tll0 tll0Var = ((nhl0) thl0Var2).zzb.a;
                    if (tll0Var.b > 0) {
                        ((lgl0) tll0Var.c(0).a).zzb();
                        throw null;
                    }
                    Iterator<T> it = tll0Var.d().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        lgl0 lgl0Var = (lgl0) entry.getKey();
                        entry.getValue();
                        lgl0Var.zzb();
                        throw null;
                    }
                }
                return iC3;
            }
            int iB = tkl0Var.B(i5);
            int iC4 = C(iB);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & i4;
            Unsafe unsafe = m;
            if (iC4 <= 17) {
                if (i10 != i7) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(thl0Var2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iB & i4;
            if (iC4 >= pgl0.b.a) {
                int i12 = pgl0.c.a;
            }
            long j = i11;
            switch (iC4) {
                case 0:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    break;
                case 1:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 2:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        long j2 = unsafe.getLong(thl0Var2, j);
                        iF = ufl0.f(i8 << 3);
                        iA = ufl0.a(j2);
                        iA3 += iA + iF;
                    }
                    tkl0Var = this;
                    break;
                case 3:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        long j3 = unsafe.getLong(thl0Var2, j);
                        iF = ufl0.f(i8 << 3);
                        iA = ufl0.a(j3);
                        iA3 += iA + iF;
                    }
                    tkl0Var = this;
                    break;
                case 4:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        long j4 = unsafe.getInt(thl0Var2, j);
                        iF = ufl0.f(i8 << 3);
                        iA = ufl0.a(j4);
                        iA3 += iA + iF;
                    }
                    tkl0Var = this;
                    break;
                case 5:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 6:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 7:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 1, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 8:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        int i13 = i8 << 3;
                        Object object = unsafe.getObject(thl0Var2, j);
                        if (object instanceof lfl0) {
                            iF2 = ufl0.f(i13);
                            iC = ((lfl0) object).c();
                            iA3 = rkl0.a(iC, iC, iF2, iA3);
                        } else {
                            iF = ufl0.f(i13);
                            iA = ufl0.b((String) object);
                            iA3 += iA + iF;
                        }
                    }
                    tkl0Var = this;
                    break;
                case 9:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iZ = lll0.z(i8, unsafe.getObject(thl0Var2, j), tkl0Var.x(i5));
                        iA3 += iZ;
                    }
                    break;
                case 10:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        lfl0 lfl0Var = (lfl0) unsafe.getObject(thl0Var2, j);
                        iF2 = ufl0.f(i8 << 3);
                        iC = lfl0Var.c();
                        iA3 = rkl0.a(iC, iC, iF2, iA3);
                    }
                    tkl0Var = this;
                    break;
                case 11:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        i2 = unsafe.getInt(thl0Var2, j);
                        iF3 = ufl0.f(i8 << 3);
                        iA3 = qkl0.a(i2, iF3, iA3);
                    }
                    tkl0Var = this;
                    break;
                case 12:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        long j5 = unsafe.getInt(thl0Var2, j);
                        iF = ufl0.f(i8 << 3);
                        iA = ufl0.a(j5);
                        iA3 += iA + iF;
                    }
                    tkl0Var = this;
                    break;
                case 13:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 14:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    tkl0Var = this;
                    thl0Var2 = thl0Var;
                    break;
                case 15:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        int i14 = unsafe.getInt(thl0Var2, j);
                        iF3 = ufl0.f(i8 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iA3 = qkl0.a(i2, iF3, iA3);
                    }
                    tkl0Var = this;
                    break;
                case 16:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        long j6 = unsafe.getLong(thl0Var2, j);
                        iF = ufl0.f(i8 << 3);
                        iA = ufl0.a((j6 >> 63) ^ (j6 + j6));
                        iA3 += iA + iF;
                    }
                    tkl0Var = this;
                    break;
                case 17:
                    if (tkl0Var.m(thl0Var2, i5, i7, i6, i)) {
                        lkl0 lkl0Var = (lkl0) unsafe.getObject(thl0Var2, j);
                        ill0 ill0VarX = tkl0Var.x(i5);
                        int iF14 = ufl0.f(i8 << 3);
                        i3 = iF14 + iF14;
                        iF4 = ((bel0) lkl0Var).f(ill0VarX);
                        iZ = iF4 + i3;
                        iA3 += iZ;
                    }
                    break;
                case 18:
                    iZ = lll0.y(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case 19:
                    iZ = lll0.x(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var = lll0.a;
                    if (list.size() == 0) {
                        iF5 = 0;
                    } else {
                        iF5 = (ufl0.f(i8 << 3) * list.size()) + lll0.q(list);
                    }
                    iA3 += iF5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var2 = lll0.a;
                    size = list2.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.r(list2);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var3 = lll0.a;
                    size = list3.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.u(list3);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    iZ = lll0.y(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case 24:
                    iZ = lll0.x(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    List list4 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var4 = lll0.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iF5 = 0;
                    } else {
                        iF5 = (ufl0.f(i8 << 3) + 1) * size3;
                    }
                    iA3 += iF5;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    List list5 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var5 = lll0.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iF7 = 0;
                    } else {
                        iF7 = ufl0.f(i8 << 3) * size4;
                        if (list5 instanceof zil0) {
                            zil0 zil0Var = (zil0) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object objZzc = zil0Var.zzc();
                                if (objZzc instanceof lfl0) {
                                    int iC5 = ((lfl0) objZzc).c();
                                    iF7 = qkl0.a(iC5, iC5, iF7);
                                } else {
                                    iF7 = ufl0.b((String) objZzc) + iF7;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof lfl0) {
                                    int iC6 = ((lfl0) obj).c();
                                    iF7 = qkl0.a(iC6, iC6, iF7);
                                } else {
                                    iF7 = ufl0.b((String) obj) + iF7;
                                }
                            }
                        }
                    }
                    iA3 += iF7;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    List list6 = (List) unsafe.getObject(thl0Var2, j);
                    ill0 ill0VarX2 = tkl0Var.x(i5);
                    kml0 kml0Var6 = lll0.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iF8 = 0;
                    } else {
                        iF8 = ufl0.f(i8 << 3) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            Object obj2 = list6.get(i17);
                            int iA4 = obj2 instanceof wil0 ? ((wil0) obj2).a() : ((bel0) ((lkl0) obj2)).f(ill0VarX2);
                            iF8 = qkl0.a(iA4, iA4, iF8);
                        }
                    }
                    iA3 += iF8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var7 = lll0.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iF7 = 0;
                    } else {
                        iF7 = ufl0.f(i8 << 3) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iC7 = ((lfl0) list7.get(i18)).c();
                            iF7 = qkl0.a(iC7, iC7, iF7);
                        }
                    }
                    iA3 += iF7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var8 = lll0.a;
                    size = list8.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.v(list8);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var9 = lll0.a;
                    size = list9.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.t(list9);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iZ = lll0.x(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case 32:
                    iZ = lll0.y(i8, (List) unsafe.getObject(thl0Var2, j));
                    iA3 += iZ;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var10 = lll0.a;
                    size = list10.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.w(list10);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    List list11 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var11 = lll0.a;
                    size = list11.size();
                    if (size == 0) {
                        iF7 = 0;
                    } else {
                        iR = lll0.s(list11);
                        iF6 = ufl0.f(i8 << 3);
                        iF7 = (iF6 * size) + iR;
                    }
                    iA3 += iF7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var12 = lll0.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    List list13 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var13 = lll0.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    size2 = lll0.q((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 38:
                    size2 = lll0.r((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    size2 = lll0.u((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var14 = lll0.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var15 = lll0.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    List list16 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var16 = lll0.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 43:
                    size2 = lll0.v((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    size2 = lll0.t((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    List list17 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var17 = lll0.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(thl0Var2, j);
                    kml0 kml0Var18 = lll0.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 47:
                    size2 = lll0.w((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 48:
                    size2 = lll0.s((List) unsafe.getObject(thl0Var2, j));
                    if (size2 > 0) {
                        iF9 = ufl0.f(i8 << 3);
                        iA3 = rkl0.a(size2, iF9, size2, iA3);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(thl0Var2, j);
                    ill0 ill0VarX3 = tkl0Var.x(i5);
                    kml0 kml0Var19 = lll0.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iF10 = 0;
                    } else {
                        iF10 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            lkl0 lkl0Var2 = (lkl0) list19.get(i19);
                            int iF15 = ufl0.f(i8 << 3);
                            iF10 += ((bel0) lkl0Var2).f(ill0VarX3) + iF15 + iF15;
                        }
                    }
                    iA3 += iF10;
                    break;
                case 50:
                    int i20 = i5 / 3;
                    zjl0 zjl0Var = (zjl0) unsafe.getObject(thl0Var2, j);
                    xjl0 xjl0Var = (xjl0) tkl0Var.b[i20 + i20];
                    if (zjl0Var.isEmpty()) {
                        iF7 = 0;
                    } else {
                        iF7 = 0;
                        for (Map.Entry entry2 : zjl0Var.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            vjl0 vjl0Var = xjl0Var.a;
                            int iF16 = ufl0.f(i8 << 3);
                            int iB2 = xjl0.b(vjl0Var, key, value);
                            iF7 = rkl0.a(iB2, iB2, iF16, iF7);
                        }
                    }
                    iA3 += iF7;
                    break;
                case 51:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    break;
                case 52:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    break;
                case 53:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        long jK = k(thl0Var2, j);
                        iF11 = ufl0.f(i8 << 3);
                        iA2 = ufl0.a(jK);
                        iA3 += iA2 + iF11;
                    }
                    break;
                case 54:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        long jK2 = k(thl0Var2, j);
                        iF11 = ufl0.f(i8 << 3);
                        iA2 = ufl0.a(jK2);
                        iA3 += iA2 + iF11;
                    }
                    break;
                case 55:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        long j7 = j(thl0Var2, j);
                        iF11 = ufl0.f(i8 << 3);
                        iA2 = ufl0.a(j7);
                        iA3 += iA2 + iF11;
                    }
                    break;
                case 56:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    break;
                case 57:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    break;
                case 58:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 1, iA3);
                    }
                    break;
                case 59:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        int i21 = i8 << 3;
                        Object object2 = unsafe.getObject(thl0Var2, j);
                        if (object2 instanceof lfl0) {
                            iF12 = ufl0.f(i21);
                            iC2 = ((lfl0) object2).c();
                            iA3 = rkl0.a(iC2, iC2, iF12, iA3);
                        } else {
                            iF11 = ufl0.f(i21);
                            iA2 = ufl0.b((String) object2);
                            iA3 += iA2 + iF11;
                        }
                    }
                    break;
                case 60:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iZ = lll0.z(i8, unsafe.getObject(thl0Var2, j), tkl0Var.x(i5));
                        iA3 += iZ;
                    }
                    break;
                case 61:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        lfl0 lfl0Var2 = (lfl0) unsafe.getObject(thl0Var2, j);
                        iF12 = ufl0.f(i8 << 3);
                        iC2 = lfl0Var2.c();
                        iA3 = rkl0.a(iC2, iC2, iF12, iA3);
                    }
                    break;
                case 62:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iJ = j(thl0Var2, j);
                        iF13 = ufl0.f(i8 << 3);
                        iA3 = qkl0.a(iJ, iF13, iA3);
                    }
                    break;
                case 63:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        long j8 = j(thl0Var2, j);
                        iF11 = ufl0.f(i8 << 3);
                        iA2 = ufl0.a(j8);
                        iA3 += iA2 + iF11;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 4, iA3);
                    }
                    break;
                case 65:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        iA3 = qkl0.a(i8 << 3, 8, iA3);
                    }
                    break;
                case 66:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        int iJ2 = j(thl0Var2, j);
                        iF13 = ufl0.f(i8 << 3);
                        iJ = (iJ2 >> 31) ^ (iJ2 + iJ2);
                        iA3 = qkl0.a(iJ, iF13, iA3);
                    }
                    break;
                case 67:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        long jK3 = k(thl0Var2, j);
                        iF11 = ufl0.f(i8 << 3);
                        iA2 = ufl0.a((jK3 >> 63) ^ (jK3 + jK3));
                        iA3 += iA2 + iF11;
                    }
                    break;
                case 68:
                    if (tkl0Var.p(i8, i5, thl0Var2)) {
                        lkl0 lkl0Var3 = (lkl0) unsafe.getObject(thl0Var2, j);
                        ill0 ill0VarX4 = tkl0Var.x(i5);
                        int iF17 = ufl0.f(i8 << 3);
                        i3 = iF17 + iF17;
                        iF4 = ((bel0) lkl0Var3).f(ill0VarX4);
                        iZ = iF4 + i3;
                        iA3 += iZ;
                    }
                    break;
            }
            i5 += 3;
            i4 = 1048575;
        }
    }

    public final boolean l(thl0 thl0Var, thl0 thl0Var2, int i) {
        return n(i, thl0Var) == n(i, thl0Var2);
    }

    public final boolean m(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & rml0.e(obj, j)) != 0) {
                return true;
            }
            return false;
        }
        int iB = B(i);
        long j2 = iB & 1048575;
        switch (C(iB)) {
            case 0:
                if (Double.doubleToRawLongBits(rml0.c.l0(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(rml0.c.j0(obj, j2)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (rml0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (rml0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (rml0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 7:
                return rml0.c.h0(obj, j2);
            case 8:
                Object objH = rml0.h(obj, j2);
                if (objH instanceof String) {
                    if (((String) objH).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objH instanceof lfl0)) {
                    d580.a();
                    return false;
                }
                if (lfl0.b.equals(objH)) {
                    return false;
                }
                return true;
            case 9:
                if (rml0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            case 10:
                if (lfl0.b.equals(rml0.h(obj, j2))) {
                    return false;
                }
                return true;
            case 11:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (rml0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (rml0.e(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (rml0.g(obj, j2) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (rml0.h(obj, j2) != null) {
                    return true;
                }
                return false;
            default:
                d580.a();
                return false;
        }
    }

    public final void o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        rml0.f(obj, (1 << (i2 >>> 20)) | rml0.e(obj, j), j);
    }

    public final boolean p(int i, int i2, Object obj) {
        return rml0.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final int q(int i, int i2) {
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 46641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int t(java.lang.Object r45, byte[] r46, int r47, int r48, int r49, defpackage.iel0 r50) throws defpackage.oil0 {
        /*
            Method dump skipped, instruction units count: 4664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkl0.t(java.lang.Object, byte[], int, int, int, iel0):int");
    }

    public final void v(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long jB = B(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jB);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            ill0 ill0VarX = x(i);
            if (!n(i, obj)) {
                if (i(object)) {
                    thl0 thl0VarZza = ill0VarX.zza();
                    ill0VarX.d(thl0VarZza, object);
                    unsafe.putObject(obj, jB, thl0VarZza);
                } else {
                    unsafe.putObject(obj, jB, object);
                }
                o(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jB);
            if (!i(object2)) {
                thl0 thl0VarZza2 = ill0VarX.zza();
                ill0VarX.d(thl0VarZza2, object2);
                unsafe.putObject(obj, jB, thl0VarZza2);
                object2 = thl0VarZza2;
            }
            ill0VarX.d(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (p(i2, i, obj2)) {
            long jB = B(i) & 1048575;
            Unsafe unsafe = m;
            Object object = unsafe.getObject(obj2, jB);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            ill0 ill0VarX = x(i);
            if (!p(i2, i, obj)) {
                if (i(object)) {
                    thl0 thl0VarZza = ill0VarX.zza();
                    ill0VarX.d(thl0VarZza, object);
                    unsafe.putObject(obj, jB, thl0VarZza);
                } else {
                    unsafe.putObject(obj, jB, object);
                }
                rml0.f(obj, i2, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, jB);
            if (!i(object2)) {
                thl0 thl0VarZza2 = ill0VarX.zza();
                ill0VarX.d(thl0VarZza2, object2);
                unsafe.putObject(obj, jB, thl0VarZza2);
                object2 = thl0VarZza2;
            }
            ill0VarX.d(object2, object);
        }
    }

    public final ill0 x(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        ill0 ill0Var = (ill0) objArr[i3];
        if (ill0Var != null) {
            return ill0Var;
        }
        ill0 ill0VarA = cll0.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = ill0VarA;
        return ill0VarA;
    }

    public final bil0 y(int i) {
        int i2 = i / 3;
        return (bil0) this.b[i2 + i2 + 1];
    }

    public final Object z(int i, Object obj) {
        ill0 ill0VarX = x(i);
        int iB = B(i) & 1048575;
        if (!n(i, obj)) {
            return ill0VarX.zza();
        }
        Object object = m.getObject(obj, iB);
        if (i(object)) {
            return object;
        }
        thl0 thl0VarZza = ill0VarX.zza();
        if (object != null) {
            ill0VarX.d(thl0VarZza, object);
        }
        return thl0VarZza;
    }

    @Override // defpackage.ill0
    public final thl0 zza() {
        return (thl0) ((thl0) this.e).p(4);
    }
}
