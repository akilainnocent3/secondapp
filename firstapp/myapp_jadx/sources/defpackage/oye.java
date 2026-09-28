package defpackage;

import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class oye {
    public static boolean a(String str, String str2) {
        if (!c.u(str2, "*.", false)) {
            return str.equals(str2);
        }
        String strA0 = StringsKt.a0(str2, "*.");
        return str.equals(strA0) || c.k(str, ".".concat(strA0), false);
    }
}
