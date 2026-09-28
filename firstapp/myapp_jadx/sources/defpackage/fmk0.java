package defpackage;

import android.content.Context;
import android.os.Looper;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class fmk0 extends sl0.a {
    @Override // sl0.a
    public final sl0.f b(Context context, Looper looper, hs7 hs7Var, Object obj, kgk0 kgk0Var, kgk0 kgk0Var2) {
        return new itl0(context, looper, WebSocketProtocol.PAYLOAD_SHORT, hs7Var, kgk0Var, kgk0Var2);
    }
}
