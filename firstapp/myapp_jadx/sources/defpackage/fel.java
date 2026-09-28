package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.domain.HasCompletedFTDForLiveStreamUseCase", f = "HasCompletedFTDForLiveStreamUseCase.kt", l = {16}, m = "getRemoteFTDStatus", v = 2)
public final class fel extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hel b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fel(hel helVar, x1b x1bVar) {
        super(x1bVar);
        this.b = helVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
