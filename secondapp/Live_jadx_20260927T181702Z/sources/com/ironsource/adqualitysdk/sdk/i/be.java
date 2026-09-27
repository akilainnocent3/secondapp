package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class be extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f780 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f781 = -6536688573272972428L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f782;

    public be(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m775(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            try {
                f.f2017 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2018 = 0;
                while (true) {
                    int i11 = f.f2018;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f781);
                        f.f2018++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo765() {
        int i10 = f782;
        int i11 = i10 + 49;
        f780 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        int i12 = i10 + 117;
        f780 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 79 / 0;
        }
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo766() {
        int i10 = f780 + 35;
        int i11 = i10 % 128;
        f782 = i11;
        boolean z10 = i10 % 2 == 0;
        int i12 = i11 + 93;
        f780 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 28 / 0;
        }
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        int i10 = f782 + 79;
        f780 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        f782 = (f780 + 3) % 128;
        String strIntern = m775("ꌱ乯禟擉ᙬƘⳎ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 60757).intern();
        int i10 = f782 + 81;
        f780 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        int i10 = (f782 + 111) % 128;
        f780 = i10;
        int i11 = i10 + 71;
        f782 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
