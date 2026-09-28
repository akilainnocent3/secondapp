package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel", f = "RefsCallViewModel.kt", l = {389, 394}, m = "handleError", v = 1)
public final class fs40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zr40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs40(zr40 zr40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = zr40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(null, this);
    }
}
