package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase", f = "CMSUpdateUseCase.kt", l = {50}, m = "fetchCMS-IoAF18A", v = 2)
public final class tp5 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xp5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp5(xp5 xp5Var, x1b x1bVar) {
        super(x1bVar);
        this.b = xp5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
