package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class iz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2645 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2646;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f2647;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String f2648;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2649;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private je f2650;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private iw f2651;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2652 = new ArrayList();

    static {
        m2520();
        f2648 = m2519(new int[]{1266975715, -1449402714, 1843604259, -697687125, 132449138, -1260791608, -576055396, 1306205703, -1866143178, 2059488178, 1207583196, 1209526275, 572684741, 1188270581, -526816565, -363126219, -799026435, 63199240, 573207097, -146954207, 1543926893, 1455605071, 1199699856, 1196792807, 1444576168, 1865948453, 1127852407, 1212879414, -1684496068, 270357911, 1266927628, 2105559770, -984470594, -1611639142, 1972910697, 1847046555}, 70 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        int i10 = f2646 + 93;
        f2645 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public iz(Context context, iw iwVar, String str) {
        this.f2650 = new je(context, m2519(new int[]{517619062, -1831862112, 686499006, 251667173, 20914338, 240550458, 1943777681, -61446972, 1548753051, 768621586, -1200815215, -414716274}, TextUtils.lastIndexOf("", '0') + 25).intern(), m2519(new int[]{-964332785, 1682472256, 2010953171, 2011532084, -1615299659, 1596623536, -504167231, -287159301, 709675888, -539290917}, TextUtils.lastIndexOf("", '0', 0) + 18).intern());
        this.f2651 = iwVar;
        this.f2649 = str;
        ar.m438().mo462(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo272() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(iz.m2517(iz.this));
                    iz.m2517(iz.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m2517(iz izVar) {
        int i10 = f2645 + 77;
        f2646 = i10 % 128;
        int i11 = i10 % 2;
        List<Runnable> list = izVar.f2652;
        if (i11 != 0) {
            int i12 = 63 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2520() {
        f2647 = new int[]{121065588, -1754757506, 784996495, -1333470162, 354179686, -1782335970, 1737442105, 1110840147, -187628996, -703601206, -1825364032, 379884011, -371244155, 1672869358, 1701816979, -663646964, 1200330019, 572066613};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ je m2522(iz izVar) {
        int i10 = f2645;
        f2646 = (i10 + 111) % 128;
        je jeVar = izVar.f2650;
        int i11 = i10 + 1;
        f2646 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ iw m2524(iz izVar) {
        int i10 = f2646;
        f2645 = (i10 + 25) % 128;
        iw iwVar = izVar.f2651;
        int i11 = i10 + 53;
        f2645 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 22 / 0;
        }
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2518(final jc jcVar, final ip ipVar) {
        String strMo2564 = jcVar.mo2564();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2525());
        sb2.append(m2519(new int[]{-587791989, 1845260723}, View.combineMeasuredStates(0, 0) + 1).intern());
        sb2.append(strMo2564);
        final String string = sb2.toString();
        final String strM2561 = jcVar.m2561();
        if (ar.m438().mo471()) {
            f2646 = (f2645 + 87) % 128;
            if (!ar.m438().mo465()) {
                int i10 = f2645 + 125;
                f2646 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f2650.m2592(strM2561);
                    throw null;
                }
                if (this.f2650.m2592(strM2561) != null) {
                    return;
                }
            }
            jx.m2737(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5

                /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
                private static int f2657 = 1;

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char f2658 = 65152;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char f2659 = 31284;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f2660 = 37033;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f2661 = 0;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static char f2662 = 33852;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
                
                    if (r5.m2469().m2472() == 200) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
                
                    if (java.nio.charset.Charset.forName(m2532("嫑맰멧㿎ᇲ풔뒃㜎", android.graphics.Color.green(0) + 8).intern()).newEncoder().canEncode(r5) == false) goto L30;
                 */
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private void m2530(java.lang.String r10, com.ironsource.adqualitysdk.sdk.i.jc r11, java.lang.String r12, com.ironsource.adqualitysdk.sdk.i.ip r13) {
                    /*
                        Method dump skipped, instruction units count: 444
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.AnonymousClass5.m2530(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jc, java.lang.String, com.ironsource.adqualitysdk.sdk.i.ip):void");
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo231() {
                    int i11 = f2657 + 101;
                    f2661 = i11 % 128;
                    if (i11 % 2 == 0) {
                        m2530(string, jcVar, strM2561, ipVar);
                    } else {
                        m2530(string, jcVar, strM2561, ipVar);
                        throw null;
                    }
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2531(String str) throws JSONException {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(m2532("\ue16b㢂츏㕆", 3 - View.MeasureSpec.getMode(0)).intern());
                    if (!TextUtils.isEmpty(strOptString)) {
                        return jx.m2734(strOptString, iz.m2523(), jSONObject.optString(m2532("酫쳉", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()), jSONObject.optString(m2532("᩸㏽䅛⦮", (Process.myTid() >> 22) + 4).intern()));
                    }
                    int i11 = f2661;
                    int i12 = i11 + 109;
                    f2657 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    int i13 = i11 + 73;
                    f2657 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 86 / 0;
                    }
                    return str;
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2532(String str, int i11) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (n.f2992) {
                        try {
                            char[] cArr2 = new char[cArr.length];
                            n.f2991 = 0;
                            char[] cArr3 = new char[2];
                            while (true) {
                                int i12 = n.f2991;
                                if (i12 < cArr.length) {
                                    cArr3[0] = cArr[i12];
                                    cArr3[1] = cArr[i12 + 1];
                                    int i13 = 58224;
                                    for (int i14 = 0; i14 < 16; i14++) {
                                        char c10 = cArr3[1];
                                        char c11 = cArr3[0];
                                        char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + f2660)) ^ ((c11 >>> 5) + f2659)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2662) ^ ((c12 + i13) ^ ((c12 << 4) + f2658))));
                                        i13 -= 40503;
                                    }
                                    int i15 = n.f2991;
                                    cArr2[i15] = cArr3[0];
                                    cArr2[i15 + 1] = cArr3[1];
                                    n.f2991 = i15 + 2;
                                } else {
                                    str2 = new String(cArr2, 0, i11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private void m2529(final jc jcVar2, final ip ipVar2) {
                    iz.m2524(iz.this).m2497().m2489(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo349() {
                            iz.m2524(iz.this).m2497().m2487(this);
                            iz.m2521(iz.this, jcVar2, ipVar2);
                        }
                    });
                    f2657 = (f2661 + 71) % 128;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2521(iz izVar, jc jcVar, ip ipVar) {
        f2646 = (f2645 + 49) % 128;
        izVar.m2518(jcVar, ipVar);
        f2646 = (f2645 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2523() {
        int i10 = (f2646 + 113) % 128;
        f2645 = i10;
        String str = f2648;
        int i11 = i10 + 57;
        f2646 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized String m2525() {
        String str;
        try {
            int i10 = f2645;
            int i11 = i10 + 33;
            f2646 = i11 % 128;
            if (i11 % 2 != 0) {
                str = this.f2649;
                int i12 = 30 / 0;
            } else {
                str = this.f2649;
            }
            f2646 = (i10 + 45) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.iz.f2646 = (com.ironsource.adqualitysdk.sdk.i.iz.f2645 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2.f2650.m2592(r3.m2561()) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.f2650.m2592(r3.m2561()) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.iz.f2645 = (com.ironsource.adqualitysdk.sdk.i.iz.f2646 + 19) % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2526(com.ironsource.adqualitysdk.sdk.i.jc r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.iz.f2646
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2645 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1d
            java.lang.String r3 = r3.m2561()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r2.f2650
            java.lang.String r3 = r0.m2592(r3)
            r0 = 64
            int r0 = r0 / r1
            if (r3 == 0) goto L33
            goto L29
        L1d:
            java.lang.String r3 = r3.m2561()
            com.ironsource.adqualitysdk.sdk.i.je r0 = r2.f2650
            java.lang.String r3 = r0.m2592(r3)
            if (r3 == 0) goto L33
        L29:
            int r3 = com.ironsource.adqualitysdk.sdk.i.iz.f2646
            int r3 = r3 + 19
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2645 = r3
            r3 = 1
            return r3
        L33:
            int r3 = com.ironsource.adqualitysdk.sdk.i.iz.f2645
            int r3 = r3 + 17
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.iz.f2646 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iz.m2526(com.ironsource.adqualitysdk.sdk.i.jc):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2528(String str, String str2, ip ipVar) {
        jc.d dVar = new jc.d(str, str2);
        if (ar.m438().mo452().m435()) {
            f2646 = (f2645 + 39) % 128;
            String strM437 = ar.m438().mo452().m437(str);
            if (TextUtils.isEmpty(strM437)) {
                int i10 = f2645 + 119;
                f2646 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 80 / 0;
                }
                return null;
            }
            dVar = new jc.b(str, str2, strM437);
        }
        return m2527(dVar, ipVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2519(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2647.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2527(final jc jcVar, final ip ipVar) {
        boolean z10;
        if (TextUtils.isEmpty(jcVar.m2559()) || TextUtils.isEmpty(jcVar.m2562())) {
            return null;
        }
        String strM2561 = jcVar.m2561();
        synchronized (this) {
            try {
                if (ar.m438().mo458()) {
                    z10 = true;
                } else {
                    this.f2652.add(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo231() {
                            iz.m2521(iz.this, jcVar, ipVar);
                        }
                    });
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            m2518(jcVar, ipVar);
        }
        return this.f2650.m2592(strM2561);
    }
}
