package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ep extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1983 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1984 = 113;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1985;

    public ep(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2125(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1984);
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
        f1983 = (f1985 + 117) % 128;
        String strIntern = m2125(wo.g.f143517x2, AndroidCharacter.getMirror('0') - '/', true, 1 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getMode(0) + 160).intern();
        int i10 = f1985 + 71;
        f1983 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 91 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2123(Number number, Number number2) {
        int i10 = f1985;
        int i11 = i10 + 25;
        f1983 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            Double dValueOf = Double.valueOf(number.doubleValue() / number2.doubleValue());
            int i12 = f1985 + 31;
            f1983 = i12 % 128;
            if (i12 % 2 != 0) {
                return dValueOf;
            }
            throw null;
        }
        if (!(number instanceof Long)) {
            f1983 = (i10 + 83) % 128;
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() / number2.intValue());
            }
        }
        Long lValueOf = Long.valueOf(number.longValue() / number2.longValue());
        f1985 = (f1983 + 69) % 128;
        return lValueOf;
    }
}
