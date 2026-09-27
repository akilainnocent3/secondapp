package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class dr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1837 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1838 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1839 = {17};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1840;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1841;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f1842;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1843;

    public dr(Object obj) {
        this.f1842 = obj;
    }

    public final String toString() {
        int i10 = f1837 + 41;
        f1838 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f1842 instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2040(new int[]{0, 1, 0, 1}, wo.g.f143517x2, true).intern());
            sb2.append(this.f1842);
            sb2.append(m2040(new int[]{0, 1, 0, 1}, wo.g.f143517x2, true).intern());
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f1842);
        String string = sb3.toString();
        int i11 = f1838 + 55;
        f1837 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 46 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2041() {
        int i10 = (f1838 + 87) % 128;
        f1837 = i10;
        boolean z10 = this.f1843;
        f1838 = (i10 + 41) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final dr m2042() {
        int i10 = f1838 + 17;
        f1837 = i10 % 128;
        this.f1843 = i10 % 2 == 0;
        return this;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dr m2043() {
        int i10 = f1838 + 73;
        int i11 = i10 % 128;
        f1837 = i11;
        this.f1841 = i10 % 2 == 0;
        int i12 = i11 + 85;
        f1838 = i12 % 128;
        if (i12 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m2044() {
        int i10 = f1838;
        Object obj = this.f1842;
        f1837 = (i10 + 93) % 128;
        return obj;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Number m2045() {
        Object obj = this.f1842;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            f1837 = (f1838 + 39) % 128;
            return num;
        }
        if (obj instanceof Long) {
            f1838 = (f1837 + 103) % 128;
            return (Long) obj;
        }
        if (obj instanceof Double) {
            f1838 = (f1837 + 9) % 128;
            return (Double) obj;
        }
        int i10 = f1838 + 33;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2046() {
        Object obj = this.f1842;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 0) {
                return true;
            }
            f1838 = (f1837 + 35) % 128;
            return false;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            f1837 = (f1838 + 3) % 128;
            return true;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        f1838 = (f1837 + 97) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2048() {
        int i10 = f1837;
        boolean z10 = this.f1840;
        int i11 = i10 + 43;
        f1838 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 44 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2049() {
        int i10 = f1837;
        boolean z10 = this.f1841;
        f1838 = (i10 + 35) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr m2047(boolean z10) {
        int i10 = f1838;
        int i11 = i10 + 115;
        f1837 = i11 % 128;
        if (i11 % 2 != 0) {
            this.f1840 = z10;
            throw null;
        }
        this.f1840 = z10;
        int i12 = i10 + 89;
        f1837 = i12 % 128;
        if (i12 % 2 == 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2040(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1839, i10, cArr, 0, i11);
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
}
