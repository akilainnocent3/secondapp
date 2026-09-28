package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.GameLogicManager", f = "GameLogicManager.kt", l = {127, 128, 137}, m = "startGame", v = 1)
public final class vkj extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wkj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkj(wkj wkjVar, x1b x1bVar) {
        super(x1bVar);
        this.b = wkjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(this);
    }
}
