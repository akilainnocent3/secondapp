package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class xyk0 {
    public final dbl0 a;

    public xyk0(dbl0 dbl0Var) {
        this.a = dbl0Var;
    }

    public static xyk0 a(String str) {
        return new xyk0((TextUtils.isEmpty(str) || str.length() > 1) ? dbl0.UNINITIALIZED : jbl0.e(str.charAt(0)));
    }
}
