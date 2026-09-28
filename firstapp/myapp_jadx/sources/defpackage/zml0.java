package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class zml0 extends lml0 {
    public static final boolean j(String str) {
        String str2 = (String) v2l0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.F().q()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xml0 h(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zml0.h(java.lang.String):xml0");
    }

    public final String i(String str) {
        e7l0 e7l0Var = this.b.a;
        iol0.U(e7l0Var);
        String strT = e7l0Var.t(str);
        if (TextUtils.isEmpty(strT)) {
            return (String) v2l0.r.a(null);
        }
        Uri uri = Uri.parse((String) v2l0.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 1 + String.valueOf(authority).length());
        sb.append(strT);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
