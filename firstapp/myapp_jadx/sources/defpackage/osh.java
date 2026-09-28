package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class osh implements k730 {
    public final wnn a;
    public final m730<CoroutineContext> b;

    public osh(wnn wnnVar, wnn wnnVar2) {
        this.a = wnnVar;
        this.b = wnnVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        Context context = (Context) this.a.a;
        CoroutineContext coroutineContext = this.b.get();
        context.getClass();
        coroutineContext.getClass();
        return lsh.a(zf80.a, new h950(new lxc(1)), w5b.a(coroutineContext), new ish(context, 0));
    }
}
