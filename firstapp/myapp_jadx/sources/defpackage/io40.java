package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.repositories.RedBlackRepository", f = "RedBlackRepository.kt", l = {41}, m = "placeBet", v = 1)
public final class io40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mo40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io40(mo40 mo40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mo40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
