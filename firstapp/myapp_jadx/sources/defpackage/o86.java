package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.CampaignRepository", f = "CampaignRepository.kt", l = {78, 104}, m = "toTierNotReachedData", v = 1)
public final class o86 extends x1b {
    public String a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v86 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o86(v86 v86Var, x1b x1bVar) {
        super(x1bVar);
        this.e = v86Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
