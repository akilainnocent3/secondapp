package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager", f = "LNGiftManager.kt", l = {98}, m = "init", v = 2)
public final class sdq extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vdq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdq(vdq vdqVar, x1b x1bVar) {
        super(x1bVar);
        this.b = vdqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
