package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {410, 54, 56}, m = "onBonusVaultGameSelected", v = 1)
public final class xv4 extends x1b {
    public int a;
    public int b;
    public int c;
    public int d;
    public quw e;
    public /* synthetic */ Object f;
    public final /* synthetic */ uv4 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.i = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.d(0, 0, this);
    }
}
