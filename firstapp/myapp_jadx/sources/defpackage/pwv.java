package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionUiMapperImpl", f = "MissionUiMapperImpl.kt", l = {482}, m = "currencyTarget", v = 2)
public final class pwv extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mwv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwv(mwv mwvVar, x1b x1bVar) {
        super(x1bVar);
        this.b = mwvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0.0d, null, this);
    }
}
