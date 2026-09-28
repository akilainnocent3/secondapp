package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.survey.SurveyRepositoryImpl", f = "SurveyRepositoryImpl.kt", l = {90, 100}, m = "emitSurveyRequestData", v = 2)
public final class tie0 extends x1b {
    public mie0 a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sie0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tie0(sie0 sie0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = sie0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
