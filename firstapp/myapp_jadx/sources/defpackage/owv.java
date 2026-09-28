package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionUiMapperImpl", f = "MissionUiMapperImpl.kt", l = {446}, m = "buildMultiTaskMissionProgressUiData", v = 2)
public final class owv extends x1b {
    public double a;
    public double b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ mwv e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owv(mwv mwvVar, x1b x1bVar) {
        super(x1bVar);
        this.e = mwvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, null, 0.0d, null, 0L, this);
    }
}
