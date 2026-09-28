package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportygames.commons.SportyGamesManager;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ail implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        String deviceId;
        String operId;
        xnh0 user;
        chain.getClass();
        Request request = chain.request();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str2 = "";
        if (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) {
            str = "";
        } else {
            str = user.a;
        }
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        if (sportyGamesManager2 == null || (deviceId = sportyGamesManager2.getDeviceId()) == null) {
            deviceId = "";
        }
        SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
        if (sportyGamesManager3 != null && (operId = sportyGamesManager3.getOperId()) != null) {
            str2 = operId;
        }
        return chain.proceed(request.newBuilder().addHeader(QQWMbKFOuTf.VPBxEhvuNN, lx5.a("accessToken=", str, "; deviceId=", deviceId)).addHeader("x-platform", u3w.a).addHeader("OperId", str2).build());
    }
}
