package defpackage;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class r41 implements Interceptor {
    public final ysm a;

    public r41(ysm ysmVar) {
        this.a = ysmVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        uqm uqmVar = hp0.A.b;
        if (uqmVar != null) {
            String accessToken = uqmVar.getAccessToken();
            if (!TextUtils.isEmpty(accessToken)) {
                request = request.newBuilder().header("Authorization", accessToken).build();
            }
        }
        String strEncodedPath = httpUrlUrl.encodedPath();
        if (strEncodedPath.endsWith("patron/account") || strEncodedPath.endsWith("patron/email/auth/register") || strEncodedPath.endsWith("patron/email/auth/verify") || strEncodedPath.endsWith("patron/email/auth/token") || strEncodedPath.endsWith("patron/register/preRegister") || strEncodedPath.endsWith("patron/user/devices")) {
            ysm.a aVarA = this.a.a();
            if (!TextUtils.isEmpty(aVarA.b)) {
                request = request.newBuilder().header("Fingerprint", aVarA.b).build();
            }
        }
        return chain.proceed(request);
    }
}
