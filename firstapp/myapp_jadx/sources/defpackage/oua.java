package defpackage;

import j$.time.Instant;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class oua implements Interceptor {
    public final sso<Interceptor.Chain, Response> a;

    public oua(sso<Interceptor.Chain, Response> ssoVar) {
        this.a = ssoVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        sso<Interceptor.Chain, Response> ssoVar = this.a;
        Request request = chain.request();
        m0b m0bVarCurrent = m0b.current();
        Instant instantNow = Instant.now();
        try {
            Response responseProceed = chain.proceed(request);
            hom homVar = (hom) m0bVarCurrent.b(hom.b);
            if ((homVar != null ? homVar.a : 0) != 0 || !ssoVar.c(m0bVarCurrent, chain)) {
                return responseProceed;
            }
            sso<Interceptor.Chain, Response> ssoVar2 = this.a;
            Instant instantNow2 = Instant.now();
            gto.a.getClass();
            try {
                m0b m0bVarB = ssoVar2.b(m0bVarCurrent, chain, instantNow);
                bto.b.remove();
                ssoVar2.a(m0bVarB, chain, responseProceed, null, instantNow2);
                return responseProceed;
            } catch (Throwable th) {
                bto.b.remove();
                throw th;
            }
        } catch (Throwable th2) {
            int i = 0;
            try {
                throw th2;
            } catch (Throwable th3) {
                hom homVar2 = (hom) m0bVarCurrent.b(hom.b);
                if (homVar2 != null) {
                    i = homVar2.a;
                }
                if (i != 0 || !ssoVar.c(m0bVarCurrent, chain)) {
                    throw th3;
                }
                sso<Interceptor.Chain, Response> ssoVar3 = this.a;
                Instant instantNow3 = Instant.now();
                gto.a.getClass();
                try {
                    m0b m0bVarB2 = ssoVar3.b(m0bVarCurrent, chain, instantNow);
                    bto.b.remove();
                    ssoVar3.a(m0bVarB2, chain, null, th2, instantNow3);
                    throw th3;
                } catch (Throwable th4) {
                    bto.b.remove();
                    throw th4;
                }
            }
        }
    }
}
