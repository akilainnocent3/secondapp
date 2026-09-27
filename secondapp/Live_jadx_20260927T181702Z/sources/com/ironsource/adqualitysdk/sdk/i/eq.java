package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.signals.SignalKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class eq extends eo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1988 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1989 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1987 = {'>', 29252};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1986 = -7149399757008571783L;

    public eq(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2126(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1987[i10 + i12]) ^ (((long) i12) * f1986)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2110() {
        int i10 = f1988 + 17;
        f1989 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m2126(View.resolveSize(0, 0), (char) (KeyEvent.getMaxKeyCode() << 53), 0 % (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))) : m2126(View.resolveSize(0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1)).intern();
        f1988 = (f1989 + 57) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2119(int i10) {
        int i11 = f1989;
        int i12 = i11 + 77;
        f1988 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (i10 < 0) {
            return false;
        }
        int i13 = i11 + SignalKey.EVENT_ID;
        f1988 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
