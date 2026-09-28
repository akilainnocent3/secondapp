package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.domain.ResolveLiveStreamPlaybackStateUseCase", f = "ResolveLiveStreamPlaybackStateUseCase.kt", l = {16, 20}, m = "invoke", v = 2)
public final class fg50 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ gg50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg50(gg50 gg50Var, x1b x1bVar) {
        super(x1bVar);
        this.b = gg50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
