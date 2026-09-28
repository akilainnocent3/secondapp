package defpackage;

import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xc10 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jme jmeVar = (jme) obj;
                jmeVar.getClass();
                return jme.a(jmeVar, true, null, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            default:
                return new q5z.h(null);
        }
    }
}
