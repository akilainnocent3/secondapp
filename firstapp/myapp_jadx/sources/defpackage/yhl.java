package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class yhl implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String deviceId;
        String screenName;
        xnh0 user;
        chain.getClass();
        Request request = chain.request();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str = "";
        String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? "" : user.a;
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        if (sportyGamesManager2 == null || (deviceId = sportyGamesManager2.getDeviceId()) == null) {
            deviceId = "";
        }
        Request.Builder builderAddHeader = request.newBuilder().addHeader("cookie", lx5.a("accessToken=", str2, "; deviceId=", deviceId)).addHeader("x-platform", u3w.a).addHeader("platform", u3w.a);
        String property = System.getProperty("http.agent");
        String strConcat = property != null ? property.concat("-") : "";
        SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
        Request.Builder builderAddHeader2 = builderAddHeader.addHeader("User-Agent", strConcat + (sportyGamesManager3 != null ? Long.valueOf(sportyGamesManager3.getVersionCode()) : null));
        SportyGamesManager sportyGamesManager4 = SportyGamesManager.getInstance();
        if (sportyGamesManager4 != null && (screenName = sportyGamesManager4.getScreenName()) != null) {
            str = screenName;
        }
        Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("Referer", str);
        try {
            Context applicationContext = SportyGamesManager.getApplicationContext();
            if (applicationContext != null) {
                builderAddHeader3.addHeader("download-source", SportyGamesManager.getInstance().isSideLoading(applicationContext) ? "external-link" : "google-play-store");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chain.proceed(builderAddHeader3.build());
    }
}
