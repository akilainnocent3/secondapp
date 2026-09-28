package defpackage;

import java.util.Iterator;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {49, 62, WebSocketProtocol.B0_FLAG_RSV1}, m = "updateGame", v = 1)
public final class gl4 extends x1b {
    public float a;
    public zk4.a b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zk4 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl4(zk4 zk4Var, x1b x1bVar) {
        super(x1bVar);
        this.f = zk4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(0.0f, this);
    }
}
