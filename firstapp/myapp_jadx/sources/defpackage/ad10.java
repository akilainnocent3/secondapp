package defpackage;

import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ad10 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jme jmeVar = (jme) obj;
        jmeVar.getClass();
        return jme.a(jmeVar, false, null, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT);
    }
}
