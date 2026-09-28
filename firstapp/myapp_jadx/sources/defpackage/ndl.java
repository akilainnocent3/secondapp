package defpackage;

import com.sporty.android.core.model.watchdog.HangWatchdogConfigData;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.performance.watchdog.HangWatchdogStarter", f = "HangWatchdogStarter.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 69, 72}, m = "refresh", v = 2)
public final class ndl extends x1b {
    public boolean a;
    public HangWatchdogConfigData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qdl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndl(qdl qdlVar, x1b x1bVar) {
        super(x1bVar);
        this.d = qdlVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, this);
    }
}
