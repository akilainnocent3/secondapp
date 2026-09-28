package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class ejg0 implements Interceptor {
    public final sso<Interceptor.Chain, Response> a;
    public final obd b;

    public ejg0(sso<Interceptor.Chain, Response> ssoVar, obd obdVar) {
        this.a = ssoVar;
        this.b = obdVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        Throwable th;
        Request request = chain.request();
        m0b m0bVarCurrent = m0b.current();
        sso<Interceptor.Chain, Response> ssoVar = this.a;
        if (!ssoVar.c(m0bVarCurrent, chain)) {
            return chain.proceed(chain.request());
        }
        try {
            m0b m0bVarB = ssoVar.b(m0bVarCurrent, chain, null);
            bto.b.remove();
            Request.Builder builderNewBuilder = request.newBuilder();
            this.b.a.a(m0bVarB, builderNewBuilder, ua50.a);
            Request requestBuild = builderNewBuilder.build();
            try {
                rn70 rn70VarD = m0bVarB.d();
                try {
                    Response responseProceed = chain.proceed(requestBuild);
                    if (rn70VarD != null) {
                        try {
                            rn70VarD.close();
                        } catch (Throwable th2) {
                            th = th2;
                            chain = chain;
                            ssoVar.a(m0bVarB, chain, null, th, null);
                            throw th;
                        }
                    }
                    ssoVar.a(m0bVarB, chain, responseProceed, null, null);
                    return responseProceed;
                } catch (Throwable th3) {
                    if (rn70VarD == null) {
                        throw th3;
                    }
                    try {
                        try {
                            rn70VarD.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        ssoVar.a(m0bVarB, chain, null, th, null);
                        throw th;
                    }
                    th = th5;
                    th = th;
                    ssoVar.a(m0bVarB, chain, null, th, null);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            bto.b.remove();
            throw th7;
        }
    }
}
