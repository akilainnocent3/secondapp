package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {355, 359}, m = "getOrCreateRedeemReminderCandidate", v = 1)
public final class vv4 extends x1b {
    public sp40 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uv4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.d = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.i(null, 0L, this);
    }
}
