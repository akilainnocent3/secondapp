package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.GetUsernameEditResultUseCase", f = "GetUsernameEditResultUseCase.kt", l = {14}, m = "invoke-IoAF18A", v = 2)
public final class ngk extends x1b {
    public ogk a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ogk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngk(ogk ogkVar, x1b x1bVar) {
        super(x1bVar);
        this.c = ogkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objA = this.c.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
