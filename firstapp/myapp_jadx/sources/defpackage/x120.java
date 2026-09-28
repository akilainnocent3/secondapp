package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {392, 396, 410, 410, 410}, m = JsPluginCommon.GAMES_TRANSACTION)
public final class x120<R> extends x1b {
    public Object a;
    public Throwable b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ u120 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x120(u120 u120Var, x1b x1bVar) {
        super(x1bVar);
        this.e = u120Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(null, null, this);
    }
}
