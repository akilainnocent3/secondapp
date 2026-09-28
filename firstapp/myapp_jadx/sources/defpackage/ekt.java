package defpackage;

import android.os.Bundle;
import kotlin.text.CharsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class ekt extends djx<Long> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return Long.valueOf(j);
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "long";
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Long h(String str) {
        str.getClass();
        String strSubstring = c.k(str, "L", false) ? str.substring(0, str.length() - 1) : str;
        return Long.valueOf(c.u(str, "0x", false) ? Long.parseLong(strSubstring.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(strSubstring));
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Long l) {
        long jLongValue = l.longValue();
        str.getClass();
        bundle.putLong(str, jLongValue);
    }
}
