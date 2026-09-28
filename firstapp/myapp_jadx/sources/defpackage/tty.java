package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpSelectionAttributionDispatcher", f = "OneUpSelectionAttributionDispatcher.kt", l = {104, 105}, m = "drainPendingMutations", v = 2)
public final class tty extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ sty b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tty(sty styVar, x1b x1bVar) {
        super(x1bVar);
        this.b = styVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
