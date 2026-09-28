package defpackage;

import java.net.URI;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class g0j0 {
    public static final m2g a = m2g.a;

    public static f0j0 a(String str, String str2) {
        if (str == null || StringsKt.U(str)) {
            return new f0j0(e0j0.b, null, false, t3g.a, false, false, null);
        }
        if (!StringsKt.U(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (c.u(lowerCase, "about:", false) || c.u(lowerCase, "data:", false) || c.u(lowerCase, "file:", false)) {
                e0j0 e0j0Var = e0j0.a;
                t3g t3gVar = t3g.a;
                t3gVar.getClass();
                return new f0j0(e0j0Var, null, true, t3gVar, false, true, null);
            }
        }
        String strA0 = null;
        if (!StringsKt.U(str)) {
            try {
                String host = new URI(str).getHost();
                if (host != null) {
                    String lowerCase2 = host.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    strA0 = StringsKt.a0(lowerCase2, "www.");
                }
            } catch (Exception unused) {
            }
        }
        String str3 = strA0;
        if (d0j0.b(str, str2)) {
            return new f0j0(e0j0.a, str3, true, t3g.a, true, true, null);
        }
        a.getClass();
        l2g.a.getClass();
        return new f0j0(e0j0.b, str3, false, t3g.a, false, false, null);
    }
}
