package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1649 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1650 = -3665845259407612904L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1651;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 != false) goto L12;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean m1805(java.util.List<java.lang.Object> r1, int r2, java.lang.Class<T> r3) {
        /*
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L25
            int r2 = com.ironsource.adqualitysdk.sdk.i.cz.f1649
            int r2 = r2 + 85
            int r0 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1651 = r0
            int r2 = r2 % 2
            r0 = 0
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r2 == 0) goto L21
            r2 = 79
            int r2 = r2 / r0
            if (r1 == 0) goto L24
            goto L25
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            int r1 = com.ironsource.adqualitysdk.sdk.i.cz.f1651
            int r1 = r1 + 13
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1649 = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m1805(java.util.List, int, java.lang.Class):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m1806(List<Object> list, int i10, Class<T> cls) {
        T t10 = (T) list.get(i10);
        if (t10 != null) {
            f1649 = (f1651 + 99) % 128;
            if (!cls.isAssignableFrom(t10.getClass())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1807("毟䰬䟸殜\ue855憎ྦᚯ\ufbd0砠齈虂䭾袇⽼\uf7a1", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
                sb2.append(t10.getClass().getName());
                sb2.append(m1807("ݰᬰ柷ݐ뽜\ue572⾨च", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(cls.getName());
                throw new ClassCastException(sb2.toString());
            }
        }
        int i11 = f1651 + 85;
        f1649 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 40 / 0;
        }
        return t10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List<Object> m1808(List<Object> list, int i10) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i10) {
            f1651 = (f1649 + 59) % 128;
            if (m1805(list, i10, List.class)) {
                int i11 = f1651 + 21;
                f1649 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return (List) m1806(list, i10, List.class);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1807(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            try {
                char[] cArrM2198 = h.m2198(f1650, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2198.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f1650));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2198, 4, cArrM2198.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
