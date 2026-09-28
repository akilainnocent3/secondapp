package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* JADX INFO: loaded from: classes8.dex */
public final class fmy extends x2 {
    public final String c;
    public final Map<String, String> d;
    public final OkHttpClient e;
    public WebSocket f;

    public fmy(String str, Map<String, String> map, OkHttpClient okHttpClient) {
        this.c = str;
        this.d = map == null ? new HashMap<>() : map;
        this.e = okHttpClient;
    }

    @Override // defpackage.x2
    public final void a() {
        Request.Builder builderUrl = new Request.Builder().url(this.c);
        for (Map.Entry<String, String> entry : this.d.entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        this.f = this.e.newWebSocket(builderUrl.build(), new a());
    }

    @Override // defpackage.x2
    public final Object e() {
        return this.f;
    }

    @Override // defpackage.x2
    public final void g() {
        WebSocket webSocket = this.f;
        if (webSocket != null) {
            webSocket.close(1000, "");
        }
    }

    @Override // defpackage.x2
    public final void h(String str) {
        this.f.send(str);
    }

    public class a extends WebSocketListener {
        public a() {
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosed(WebSocket webSocket, int i, String str) {
            fmy fmyVar = fmy.this;
            fmyVar.f = null;
            fmyVar.c(new bbs(bbs.a.b));
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosing(WebSocket webSocket, int i, String str) {
            webSocket.close(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
            bbs bbsVar = new bbs(new Exception(th));
            fmy fmyVar = fmy.this;
            fmyVar.c(bbsVar);
            fmyVar.f = null;
            fmyVar.c(new bbs(bbs.a.b));
        }

        @Override // okhttp3.WebSocketListener
        public final void onMessage(WebSocket webSocket, rl5 rl5Var) {
            fmy.this.d(rl5Var.s());
        }

        @Override // okhttp3.WebSocketListener
        public final void onOpen(WebSocket webSocket, Response response) {
            bbs bbsVar = new bbs(bbs.a.a);
            TreeMap treeMap = new TreeMap();
            Headers headers = response.headers();
            for (String str : headers.names()) {
                treeMap.put(str, headers.get(str));
            }
            fmy.this.c(bbsVar);
        }

        @Override // okhttp3.WebSocketListener
        public final void onMessage(WebSocket webSocket, String str) {
            fmy.this.d(str);
        }
    }
}
