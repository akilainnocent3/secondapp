package defpackage;

import android.content.Context;
import com.sportygames.commons.SportyGamesManager;
import com.twilio.voice.Constants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class uyi0 implements g0n {
    public final Context a;

    public uyi0(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.g0n
    public final LinkedHashMap a() {
        String strValueOf;
        xnh0 user;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? "" : user.a;
        if (SportyGamesManager.getInstance().getUser() != null) {
            linkedHashMap.put("cookie", "accessToken=".concat(str));
        }
        linkedHashMap.put("content-type", Constants.APP_JSON_PAYLOAD_TYPE);
        linkedHashMap.put("accept-encoding", "gzip");
        String country = SportyGamesManager.getInstance().getCountry();
        if (country != null) {
            linkedHashMap.put("country-code", country);
        }
        String property = System.getProperty("http.agent");
        if (property != null) {
            String strConcat = property.concat("-");
            SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
            strValueOf = strConcat + (sportyGamesManager2 != null ? Long.valueOf(sportyGamesManager2.getVersionCode()) : null);
        } else {
            SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
            strValueOf = String.valueOf(sportyGamesManager3 != null ? Long.valueOf(sportyGamesManager3.getVersionCode()) : null);
        }
        linkedHashMap.put("user-agent", strValueOf);
        linkedHashMap.put("x-platform", u3w.a);
        linkedHashMap.put("download-source", SportyGamesManager.getInstance().isSideLoading(this.a) ? "external-link" : "google-play-store");
        return linkedHashMap;
    }

    @Override // defpackage.g0n
    public final String b() {
        String baseUrlSocket = SportyGamesManager.getInstance().getBaseUrlSocket();
        return baseUrlSocket == null ? "" : baseUrlSocket;
    }

    @Override // defpackage.g0n
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("download-source", SportyGamesManager.getInstance().isSideLoading(this.a) ? "external-link" : "google-play-store");
        return linkedHashMap;
    }
}
