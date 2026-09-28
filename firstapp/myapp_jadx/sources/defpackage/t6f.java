package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.lobby.DownloadSessionCardsUseCase", f = "DownloadSessionCardsUseCase.kt", l = {12, 13}, m = "invoke", v = 1)
public final class t6f extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u6f b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6f(u6f u6fVar, x1b x1bVar) {
        super(x1bVar);
        this.b = u6fVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
