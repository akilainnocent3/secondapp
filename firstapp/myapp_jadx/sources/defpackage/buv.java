package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.mappers.MissionRewardUiMapper", f = "MissionRewardUiMapper.kt", l = {132}, m = "toUiModel", v = 2)
public final class buv extends x1b {
    public rtv.b a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ytv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buv(ytv ytvVar, x1b x1bVar) {
        super(x1bVar);
        this.d = ytvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, this);
    }
}
