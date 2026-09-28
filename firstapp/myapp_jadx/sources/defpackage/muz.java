package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = JsPluginCommon.GAMES_TRANSACTION)
public final class muz<R> extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ luz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muz(luz luzVar, x1b x1bVar) {
        super(x1bVar);
        this.c = luzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, null, this);
    }
}
