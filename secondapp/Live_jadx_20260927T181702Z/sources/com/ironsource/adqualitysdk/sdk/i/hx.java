package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import cv.z0;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hx<T> extends cz implements cl, hv<T> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2414 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2415 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field f2416;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hv f2417;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map f2418;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f2419;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Collection f2420;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2413 = {'@', 136, 139, 129, 'v', 128, 135, 129, 'e', 195, 195, 188, 178, z0.f77355t, 199, 196, '3', 'f', 'l', '`', 'W', 'h', ':', 'q', 'i', 'k', 'i', 'X', 'b', 'l', 'f', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', '^', fw.b.f85384k};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f2412 = {880806038, -1346773498, 393884870, 1928313090, -1158234337, 2087444272, -1142299011, -1576855235, -2025666139, -1576528800, -891045724, 435791960, 1629575653, -1385996207, -571437608, 532789962, 1203766405, -134582387};

    public hx(Field field, Object obj, hv hvVar) {
        this.f2416 = field;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private hv m2319() {
        int i10 = f2415;
        hv hvVar = this.f2417;
        f2414 = (i10 + 113) % 128;
        return hvVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Collection m2320() {
        int i10 = f2414 + 87;
        int i11 = i10 % 128;
        f2415 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        Collection collection = this.f2420;
        f2414 = (i11 + 31) % 128;
        return collection;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Object m2321() {
        int i10 = f2415;
        Object obj = this.f2419;
        f2414 = (i10 + 73) % 128;
        return obj;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map m2322() {
        Map map;
        int i10 = f2415;
        int i11 = i10 + 79;
        f2414 = i11 % 128;
        if (i11 % 2 != 0) {
            map = this.f2418;
            int i12 = 80 / 0;
        } else {
            map = this.f2418;
        }
        f2414 = (i10 + 45) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.f2420 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.f2420 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 39;
        com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r1 % 128;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2323() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2415
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2414 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L15
            java.util.Collection r0 = r4.f2420
            r3 = 65
            int r3 = r3 / r2
            if (r0 == 0) goto L28
            goto L19
        L15:
            java.util.Collection r0 = r4.f2420
            if (r0 == 0) goto L28
        L19:
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r0
            int r1 = r1 % 2
            r0 = 1
            if (r1 != 0) goto L27
            r1 = 48
            int r1 = r1 / r2
        L27:
            return r0
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.m2323():boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2326(T t10) {
        f2415 = (f2414 + 71) % 128;
        if (m2328()) {
            int i10 = f2415 + 19;
            f2414 = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    this.f2416.set(this.f2419, t10);
                    return;
                }
                this.f2416.set(this.f2419, t10);
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m2327() {
        int i10 = (f2415 + 105) % 128;
        f2414 = i10;
        if (this.f2418 == null) {
            return false;
        }
        f2415 = (i10 + 89) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2328() {
        int i10 = f2414 + 97;
        int i11 = i10 % 128;
        f2415 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f2416 != null) {
            return true;
        }
        int i12 = i11 + 63;
        f2414 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return (T) r2.f2416.get(r2.f2419);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (m2323() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (m2327() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = (T) r2.f2419;
        com.ironsource.adqualitysdk.sdk.i.hx.f2414 = (com.ironsource.adqualitysdk.sdk.i.hx.f2415 + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m2328() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m2328() != false) goto L21;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T mo2309() {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2414
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = r2.m2328()
            r1 = 53
            int r1 = r1 / 0
            if (r0 == 0) goto L26
            goto L1d
        L17:
            boolean r0 = r2.m2328()
            if (r0 == 0) goto L26
        L1d:
            java.lang.reflect.Field r0 = r2.f2416     // Catch: java.lang.Exception -> L33
            java.lang.Object r1 = r2.f2419     // Catch: java.lang.Exception -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L33
            return r0
        L26:
            boolean r0 = r2.m2323()
            if (r0 != 0) goto L35
            boolean r0 = r2.m2327()
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            return r0
        L35:
            java.lang.Object r0 = r2.f2419
            int r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2415
            int r1 = r1 + 35
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2414 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo2309():java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo767(String str, List<Object> list, ch chVar) {
        byte b10 = 9;
        switch (str.hashCode()) {
            case -2039060844:
                if (!str.equals(m2324(new int[]{1283097075, 1758551302, 937353964, 566080106, 1566532774, -28879227, 1835810375, -1292052829}, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -1661939189:
                if (!str.equals(m2325(new int[]{31, 11, 0, 6}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f2415 + 53;
                    f2414 = i10 % 128;
                    if (i10 % 2 != 0) {
                        b10 = 72;
                    }
                }
                break;
            case -1249356250:
                if (!str.equals(m2325(new int[]{16, 6, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001", false).intern())) {
                    b10 = -1;
                } else {
                    f2415 = (f2414 + 77) % 128;
                    b10 = 7;
                }
                break;
            case 100472786:
                if (!str.equals(m2324(new int[]{1692641417, 509377738, -624944775, 1565262419}, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f2414 + 53;
                    f2415 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (byte) 6 : (byte) 84;
                }
                break;
            case 429960040:
                if (!str.equals(m2324(new int[]{-1592022438, -1050516474, 1933567612, -396938526, 1477370371, 1041945739}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f2415 + 65;
                    f2414 = i12 % 128;
                    if (i12 % 2 == 0) {
                        b10 = 4;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case 700591008:
                if (!str.equals(m2325(new int[]{22, 9, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    f2414 = (f2415 + 61) % 128;
                    b10 = 8;
                }
                break;
            case 1406685743:
                if (!str.equals(m2325(new int[]{8, 8, 87, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                    b10 = -1;
                } else {
                    f2415 = (f2414 + 19) % 128;
                    b10 = 1;
                }
                break;
            case 1953253188:
                if (!str.equals(m2324(new int[]{864832228, -1474572175, 1156522163, 1853925576}, AndroidCharacter.getMirror('0') - '(').intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 1967798203:
                if (!str.equals(m2325(new int[]{0, 8, 27, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 2058833392:
                if (!str.equals(m2324(new int[]{-391186575, 939710401, -1430148382, -1303298305}, 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return mo2309();
            case 1:
                m2326(cz.m1806(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m2328());
            case 3:
                return mo2308();
            case 4:
                return Boolean.valueOf(m2323());
            case 5:
                return m2320();
            case 6:
                return Boolean.valueOf(m2327());
            case 7:
                return m2322();
            case 8:
                return m2319();
            case 9:
                return m2321();
            default:
                return null;
        }
    }

    public hx(Collection collection, Object obj, hv hvVar) {
        this.f2420 = collection;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﻛ */
    public final Field mo2308() {
        int i10 = f2414;
        int i11 = i10 + 101;
        f2415 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        Field field = this.f2416;
        f2415 = (i10 + 55) % 128;
        return field;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2325(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2413, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2447 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2447;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2447 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2447 = 0;
                    while (true) {
                        int i16 = i.f2447;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2447 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2447 = 0;
                    while (true) {
                        int i17 = i.f2447;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2447 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public hx(Map map, Object obj, hv hvVar) {
        this.f2418 = map;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2324(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2412.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2090(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2089(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1914;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2090(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
