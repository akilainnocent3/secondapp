package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase", f = "PersonalSocketUseCase.kt", l = {213}, m = "validateMissionAvailability", v = 2)
public final class vq00 extends x1b {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mq00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq00(mq00 mq00Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mq00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(false, this);
    }
}
