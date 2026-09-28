package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel", f = "BonusCupViewModel.kt", l = {293, 295, 297}, m = "playCountdownSounds", v = 1)
public final class mq4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qq4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq4(qq4 qq4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(this);
    }
}
