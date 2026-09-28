package defpackage;

import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes8.dex */
public final class lrc0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strHeader$default;
        RequestBody requestBodyBody;
        chain.getClass();
        Request request = chain.request();
        if (!"gh".equals(SportyGamesManager.getInstance().getCountry())) {
            return chain.proceed(request);
        }
        Response responseProceed = chain.proceed(request);
        if (responseProceed.code() != 307 || (strHeader$default = Response.header$default(responseProceed, "Location", null, 2, null)) == null || strHeader$default.length() <= 0 || (requestBodyBody = request.body()) == null) {
            return responseProceed;
        }
        Request.Builder builderPost = request.newBuilder().url(strHeader$default).post(requestBodyBody);
        _UtilCommonKt.closeQuietly(responseProceed);
        return chain.proceed(builderPost.build());
    }
}
