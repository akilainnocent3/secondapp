package defpackage;

import android.util.Base64;
import com.sporty.android.core.model.MyLog;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class m5d implements Interceptor {
    public final l8 a;
    public final zj5 b;

    public m5d(l8 l8Var, zj5 zj5Var) {
        this.a = l8Var;
        this.b = zj5Var;
    }

    public final Response a(Response response, o oVar) throws IOException {
        boolean z;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return response;
        }
        try {
            MediaType b = responseBodyBody.getB();
            String strString = responseBodyBody.string();
            z = true;
            try {
                Charset charset = StandardCharsets.UTF_8;
                ResponseBody responseBodyCreate = ResponseBody.create(b, oVar.F(Base64.decode(strString.getBytes(charset), 2)));
                String strI1 = responseBodyCreate.getD().e().g().i1(charset);
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_DECRYPT_BODY);
                aVar.a(strI1, new Object[0]);
                return response.newBuilder().body(responseBodyCreate).build();
            } catch (Exception e) {
                e = e;
                if (z) {
                    l8 l8Var = this.a;
                    t5g t5gVar = l8Var.c;
                    if (!hp0.A.getSharedPreferences("com.sportybet.key", 0).getAll().isEmpty()) {
                        vn20.a("com.sportybet.key").edit().remove(l8Var.e()).remove("com.sportybet.ursid").commit();
                    }
                    Map<String, ?> all = t5gVar.b().getAll();
                    all.getClass();
                    if (!all.isEmpty()) {
                        t5gVar.c(l8Var.e(), "com.sportybet.ursid");
                    }
                    zj5 zj5Var = this.b;
                    t5g t5gVar2 = zj5Var.c;
                    if (!hp0.A.getSharedPreferences("com.sportybet.key", 0).getAll().isEmpty()) {
                        vn20.a("com.sportybet.key").edit().remove(zj5Var.e()).remove("com.sportybet.transId").commit();
                    }
                    Map<String, ?> all2 = t5gVar2.b().getAll();
                    all2.getClass();
                    if (!all2.isEmpty()) {
                        t5gVar2.c(zj5Var.e(), "com.sportybet.transId");
                    }
                }
                e.printStackTrace();
                i08.a("Please check your internet connection and try again.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (u5g.b(request)) {
            return a(responseProceed, this.a.c());
        }
        return u5g.c(request) ? a(responseProceed, this.b.c()) : responseProceed;
    }
}
