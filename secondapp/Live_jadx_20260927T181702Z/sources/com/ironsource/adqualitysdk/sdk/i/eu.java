package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class eu extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1999 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2000 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2001 = 76;

    public eu(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2129(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            try {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f2001);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2110() {
        int i10 = f2000 + 87;
        f1999 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m2129(wo.g.f143517x2, 1 >>> (ViewConfiguration.getEdgeSlop() * 78), true, Drawable.resolveOpacity(1, 1), 8695 >> TextUtils.indexOf((CharSequence) "", 'T', 1, 1)) : m2129(wo.g.f143517x2, (ViewConfiguration.getEdgeSlop() >> 16) + 1, true, Drawable.resolveOpacity(0, 0) + 1, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 137)).intern();
        f2000 = (f1999 + 117) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo2119(int i10) {
        int i11 = f2000;
        f1999 = (i11 + 9) % 128;
        if (i10 >= 0) {
            return false;
        }
        f1999 = (i11 + 33) % 128;
        return true;
    }
}
