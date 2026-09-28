package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class sn50 implements Call.Factory {
    public final mpe0 a;

    public sn50(final str<OkHttpClient> strVar, final Function0<? extends kym> function0) {
        this.a = hwr.b(new Function0() { // from class: rn50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = strVar.get();
                obj.getClass();
                OkHttpClient okHttpClient = (OkHttpClient) obj;
                Function0 function1 = function0;
                if (function1 == null) {
                    return okHttpClient;
                }
                kym kymVar = (kym) function1.invoke();
                if (!kymVar.isEnabled()) {
                    return okHttpClient;
                }
                rmy rmyVarB = kymVar.b();
                OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
                builderNewBuilder.interceptors().add(0, new u0b());
                List<Interceptor> listInterceptors = builderNewBuilder.interceptors();
                sso<Interceptor.Chain, Response> ssoVar = rmyVarB.a;
                listInterceptors.add(1, new oua(ssoVar));
                builderNewBuilder.networkInterceptors().add(0, new ejg0(ssoVar, rmyVarB.b));
                return new djg0(builderNewBuilder.build());
            }
        });
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        request.getClass();
        return ((Call.Factory) this.a.getValue()).newCall(request);
    }
}
