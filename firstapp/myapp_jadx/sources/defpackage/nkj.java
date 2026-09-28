package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.helper.GameLogicHelper", f = "GameLogicHelper.kt", l = {219, 224, 225, 229, 230, 231, 235, 236}, m = "handleGameEnded", v = 1)
public final class nkj extends x1b {
    public zmd0 a;
    public double b;
    public double c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ okj f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkj(okj okjVar, x1b x1bVar) {
        super(x1bVar);
        this.f = okjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.h(null, this);
    }
}
