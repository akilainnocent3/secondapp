package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionUiMapperImpl", f = "MissionUiMapperImpl.kt", l = {241}, m = "getTaskItem", v = 2)
public final class qwv extends x1b {
    public yvv a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mwv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwv(mwv mwvVar, x1b x1bVar) {
        super(x1bVar);
        this.c = mwvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(null, null, null, 0L, this);
    }
}
