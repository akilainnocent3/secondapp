package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class je {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler f2760 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2761 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2762 = 6080386998049583536L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2763;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ib f2764;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        void mo2597(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo2598();
    }

    public je(Context context, String str, String str2) {
        this.f2764 = new ib(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Handler m2585() {
        Handler handler;
        synchronized (je.class) {
            try {
                if (f2760 == null) {
                    HandlerThread handlerThread = new HandlerThread(m2583("\u0efb퇕롮\udb97ະ\ue000\udb77仑졚⧉鈻耢茨溑䣡掠嫚呂ྫ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
                    handlerThread.start();
                    f2760 = new Handler(handlerThread.getLooper());
                }
                handler = f2760;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2586(je jeVar, d dVar) {
        f2761 = (f2763 + 113) % 128;
        jeVar.m2584(dVar);
        f2761 = (f2763 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2587(final String str, final b bVar) {
        m2585().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo231() {
                final String strM2592 = je.this.m2592(str);
                t.m2955(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo231() {
                        bVar.mo2597(strM2592);
                    }
                });
            }
        });
        f2763 = (f2761 + 55) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2591(final String str, final String str2, final d dVar) {
        m2585().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo231() {
                je.this.m2593(str, str2);
                je.m2586(je.this, dVar);
            }
        });
        f2763 = (f2761 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2592(String str) {
        f2761 = (f2763 + 73) % 128;
        String strM2413 = this.f2764.m2413(str);
        int i10 = f2763 + 115;
        f2761 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM2413;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2588(String str, String str2) {
        int i10 = f2761 + 61;
        f2763 = i10 % 128;
        if (i10 % 2 == 0) {
            m2593(str, str2);
            m2593(m2582(str), Long.toString(jx.m2735()));
        } else {
            m2593(str, str2);
            m2593(m2582(str), Long.toString(jx.m2735()));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2593(String str, String str2) {
        int i10 = f2761 + 93;
        f2763 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2764.m2416(str, str2);
        } else {
            this.f2764.m2416(str, str2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2594(String str) {
        int i10 = f2763 + 65;
        f2761 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2764.m2415(str);
            throw null;
        }
        int iM2415 = this.f2764.m2415(str);
        f2761 = (f2763 + 73) % 128;
        return iM2415;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m2595(String str, int i10) {
        f2763 = (f2761 + 67) % 128;
        HashMap<String, String> mapM2414 = this.f2764.m2414(str, i10);
        int i11 = f2761 + 11;
        f2763 = i11 % 128;
        if (i11 % 2 == 0) {
            return mapM2414;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2596(String str, String str2) {
        int i10 = f2763 + 103;
        f2761 = i10 % 128;
        int i11 = i10 % 2;
        m2591(str, str2, null);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f2763 + 71;
        f2761 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2582(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m2583("Ό⟥啚\ue3c0\u03a2ᘹ㙛皣씸\udfe0缊롴蹭颡ꗟ", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        String string = sb2.toString();
        f2763 = (f2761 + 85) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2584(d dVar) {
        f2761 = (f2763 + 7) % 128;
        if (dVar != null) {
            t.m2955(new ir(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.je.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo231() {
                }
            });
            f2763 = (f2761 + 7) % 128;
        }
        int i10 = f2763 + 17;
        f2761 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2589(String str) {
        f2761 = (f2763 + SignalKey.EVENT_ID) % 128;
        this.f2764.m2412(str);
        int i10 = f2761 + 21;
        f2763 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2583(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            try {
                char[] cArrM2198 = h.m2198(f2762, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2198.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f2762));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2590(final String str, final String str2, final d dVar) {
        m2585().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.je.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo231() {
                je.this.m2588(str, str2);
                je.m2586(je.this, dVar);
            }
        });
        f2761 = (f2763 + 53) % 128;
    }
}
