package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel", f = "RefsCallViewModel.kt", l = {584}, m = "safeAwait", v = 1)
public final class gs40<T> extends x1b {
    public ojd a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zr40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs40(zr40 zr40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zr40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.D1(null, this);
    }
}
