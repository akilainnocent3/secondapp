package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class xhl implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String screenName;
        xnh0 user;
        xnh0 user2;
        chain.getClass();
        Request request = chain.request();
        try {
            Request.Builder builderNewBuilder = request.newBuilder();
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            Request.Builder builderAddHeader = builderNewBuilder.addHeader("cookie", "accessToken=" + ((sportyGamesManager == null || (user2 = sportyGamesManager.getUser()) == null) ? null : user2.a));
            SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
            String str = "";
            Request.Builder builderAddHeader2 = builderAddHeader.addHeader("accessToken", (sportyGamesManager2 == null || (user = sportyGamesManager2.getUser()) == null) ? "" : user.a);
            String upperCase = SportyGamesManager.getInstance().getCountry().toString().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("countrycode", upperCase).addHeader("platform", "wap");
            String deviceId = SportyGamesManager.getInstance().getDeviceId();
            deviceId.getClass();
            Request.Builder builderAddHeader4 = builderAddHeader3.addHeader("device-id", deviceId);
            SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
            if (sportyGamesManager3 != null && (screenName = sportyGamesManager3.getScreenName()) != null) {
                str = screenName;
            }
            Request.Builder builderAddHeader5 = builderAddHeader4.addHeader("Referer", str);
            if (SportyGamesManager.getInstance().getPatronId() != null) {
                String patronId = SportyGamesManager.getInstance().getPatronId();
                patronId.getClass();
                builderAddHeader5.addHeader("userId", patronId);
            } else {
                String userId = SportyGamesManager.getInstance().getUserId();
                userId.getClass();
                builderAddHeader5.addHeader("userId", userId);
            }
            request = builderAddHeader5.build();
            return chain.proceed(request);
        } catch (Exception unused) {
            return chain.proceed(request);
        }
    }
}
