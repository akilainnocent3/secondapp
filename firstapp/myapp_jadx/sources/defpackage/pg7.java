package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.SocketStatus;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class pg7 {
    public static StompClient d;
    public static boolean e;
    public static final pg7 a = new pg7();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final mep c = new mep();
    public static final ssw<DefaultCommand> f = new ssw<>();
    public static final ssw<SocketStatus> g = new ssw<>();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static void a() {
        boolean zIsConnected;
        StompClient stompClient;
        itf0.a aVar = itf0.a;
        aVar.q("SPORTY_CHAT_SOCKET");
        aVar.a("request to disconnect", new Object[0]);
        try {
            StompClient stompClient2 = d;
            zIsConnected = stompClient2 != null ? stompClient2.isConnected() : false;
        } catch (Exception e2) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("SPORTY_CHAT_SOCKET");
            aVar2.p(e2, "Failed to check if connected or not", new Object[0]);
        }
        if (zIsConnected && (stompClient = d) != null) {
            stompClient.disconnect();
        }
        e = false;
        d = null;
    }
}
