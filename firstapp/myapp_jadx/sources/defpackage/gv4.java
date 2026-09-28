package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.repository.BonusVaultRepository", f = "BonusVaultRepository.kt", l = {14}, m = "searchEligibleGamesForCampaign", v = 1)
public final class gv4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iv4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv4(iv4 iv4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = iv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
