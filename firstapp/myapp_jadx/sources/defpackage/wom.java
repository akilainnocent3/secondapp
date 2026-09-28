package defpackage;

import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class wom<REQUEST, RESPONSE> implements o21<REQUEST, RESPONSE> {
    public static final kyo a;
    public static final kyo b;
    public static final kyo c;

    static {
        g21 g21Var = g21.c;
        a = kyo.a(g21Var, "http.request.body.size");
        b = kyo.a(g21Var, "http.response.body.size");
        c = kyo.a(g21.a, "url.template");
    }

    @Override // defpackage.o21
    public final void a(wgh0 wgh0Var, m0b m0bVar, Interceptor.Chain chain) {
        p21.a(wgh0Var, c, lom.a(m0bVar, chain));
    }

    @Override // defpackage.o21
    public final void b(wgh0 wgh0Var, m0b m0bVar, Interceptor.Chain chain, Object obj, Throwable th) {
        Long lValueOf;
        List listE = amy.a.e(chain, "content-length");
        Long lValueOf2 = null;
        String str = listE.isEmpty() ? null : (String) listE.get(0);
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                lValueOf = null;
            }
        }
        p21.a(wgh0Var, a, lValueOf);
        if (obj != null) {
            List<String> listHeaders = ((Response) obj).headers("content-length");
            String str2 = listHeaders.isEmpty() ? null : listHeaders.get(0);
            if (str2 != null) {
                try {
                    lValueOf2 = Long.valueOf(Long.parseLong(str2));
                } catch (NumberFormatException unused2) {
                }
            }
            p21.a(wgh0Var, b, lValueOf2);
        }
    }
}
