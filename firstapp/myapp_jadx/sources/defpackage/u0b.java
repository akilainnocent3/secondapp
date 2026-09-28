package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class u0b implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        Request request = chain.request();
        m0b m0bVarA = (m0b) djg0.b.a(request);
        if (m0bVarA == null) {
            m0bVarA = m0b.current();
        }
        nbd nbdVar = hom.b;
        if (m0bVarA.b(nbdVar) == null) {
            m0bVarA = m0bVarA.a(nbdVar, new hom());
        }
        rn70 rn70VarD = m0bVarA.d();
        try {
            Response responseProceed = chain.proceed(request);
            if (rn70VarD != null) {
                rn70VarD.close();
            }
            return responseProceed;
        } catch (Throwable th) {
            if (rn70VarD != null) {
                try {
                    rn70VarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
