package defpackage;

import android.text.TextUtils;
import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class dbd0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        String strEncodedPath = request.url().encodedPath();
        if (cbd0.a.contains(strEncodedPath)) {
            String sportySoccerToken = SportyGamesManager.getInstance().getSportySoccerToken();
            if (TextUtils.isEmpty(sportySoccerToken)) {
                trh0.a("no access token", builderNewBuilder.build().url().getI(), new IllegalArgumentException("Unable to add header"));
            } else {
                builderNewBuilder.addHeader("Authorization", "User " + sportySoccerToken);
            }
        }
        if (cbd0.b.contains(strEncodedPath)) {
            String sportySoccerGameActivityToken = SportyGamesManager.getInstance().getSportySoccerGameActivityToken();
            if (TextUtils.isEmpty(sportySoccerGameActivityToken)) {
                trh0.a("no game session id", builderNewBuilder.build().url().getI(), new IllegalArgumentException("Unable to add header"));
            } else {
                builderNewBuilder.addHeader("Game-Session-ID", sportySoccerGameActivityToken);
            }
        }
        if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getScreenName() != null) {
            builderNewBuilder.addHeader("Referer", SportyGamesManager.getInstance().getScreenName());
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
