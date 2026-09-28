package defpackage;

import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class bil implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String operId;
        String deviceId;
        xnh0 user;
        xnh0 user2;
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str = "";
        Request.Builder builderAddHeader = builderNewBuilder.addHeader("sf-access-token", (sportyGamesManager == null || (user2 = sportyGamesManager.getUser()) == null) ? "" : user2.a);
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        Request.Builder builderAddHeader2 = builderAddHeader.addHeader("cookie", "accessToken=" + ((sportyGamesManager2 == null || (user = sportyGamesManager2.getUser()) == null) ? null : user.a)).addHeader("platform", u3w.a);
        SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
        if (sportyGamesManager3 == null || (operId = sportyGamesManager3.getOperId()) == null) {
            operId = "";
        }
        Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("OperId", operId);
        SportyGamesManager sportyGamesManager4 = SportyGamesManager.getInstance();
        if (sportyGamesManager4 != null && (deviceId = sportyGamesManager4.getDeviceId()) != null) {
            str = deviceId;
        }
        return chain.proceed(builderAddHeader3.addHeader("DeviceId", str).build());
    }
}
