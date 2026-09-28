package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel", f = "TGAnimationViewModel.kt", l = {187}, m = "waitEventEnd", v = 1)
public final class jse0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ise0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jse0(ise0 ise0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ise0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.A1(null, this);
    }
}
