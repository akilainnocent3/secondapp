package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bf extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f784 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f786;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f785 = {'E', 33080, 685, 33824, 1428, 34571, 2176};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f783 = -4211819825991155338L;

    public bf(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo766() {
        int i10 = (f786 + 51) % 128;
        f784 = i10;
        f786 = (i10 + 71) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        f786 = (f784 + 9) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        f786 = (f784 + 117) % 128;
        String strIntern = m776(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.indexOf("", "", 0), (KeyEvent.getMaxKeyCode() >> 16) + 7).intern();
        f784 = (f786 + 61) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        int i10 = f786 + 75;
        f784 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m776(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f785[i10 + i12]) ^ (((long) i12) * f783)) ^ ((long) c10));
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
}
