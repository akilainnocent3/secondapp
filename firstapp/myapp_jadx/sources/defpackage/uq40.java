package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.domain.usecase.RefreshNonFtdEngagementUseCase", f = "RefreshNonFtdEngagementUseCase.kt", l = {29, 32}, m = "invoke", v = 2)
public final class uq40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vq40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq40(vq40 vq40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = vq40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
