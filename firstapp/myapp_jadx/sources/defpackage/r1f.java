package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingFlowHandlerImpl", f = "DoubleOrNothingFlowHandlerImpl.kt", l = {225}, m = "takeTheShot", v = 2)
public final class r1f extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ q1f b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1f(q1f q1fVar, x1b x1bVar) {
        super(x1bVar);
        this.b = q1fVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(this);
    }
}
