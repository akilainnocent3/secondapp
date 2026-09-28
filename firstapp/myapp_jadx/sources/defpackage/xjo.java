package defpackage;

import java.util.Map;
import okhttp3.OkHttpClient;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes8.dex */
public final class xjo {
    public static final /* synthetic */ int a = 0;

    public static StompClient a(String str, Map map, OkHttpClient okHttpClient) {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        return new StompClient(new fmy(str, map, okHttpClient));
    }
}
