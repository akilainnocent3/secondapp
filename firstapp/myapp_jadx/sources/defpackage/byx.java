package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class byx implements ujt, kze {
    public static final byx a = new byx();

    public static String c(String str) {
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    if (str.length() == 1) {
                        return str.toUpperCase();
                    }
                    return str.substring(0, 1).toUpperCase() + str.substring(1);
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        return str;
    }

    public static final tae d(q4 q4Var, dma dmaVar, String str) {
        tae taeVarA = q4Var.a(dmaVar, str);
        if (taeVarA != null) {
            return taeVarA;
        }
        r4.d(q4Var.c(), str);
        throw null;
    }

    public static final he80 e(q4 q4Var, f4g f4gVar, Object obj) {
        obj.getClass();
        he80 he80VarB = q4Var.b(f4gVar, obj);
        if (he80VarB != null) {
            return he80VarB;
        }
        dq7 dq7VarA = jq40.a(obj.getClass());
        ygp ygpVarC = q4Var.c();
        ygpVarC.getClass();
        String strK = dq7VarA.k();
        if (strK == null) {
            strK = String.valueOf(dq7VarA);
        }
        r4.d(ygpVarC, strK);
        throw null;
    }

    public static boolean f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    @Override // defpackage.ujt
    public void a(long j, m21 m21Var, m0b m0bVar) {
    }

    @Override // defpackage.kze
    public void b(double d, m21 m21Var, m0b m0bVar) {
    }
}
