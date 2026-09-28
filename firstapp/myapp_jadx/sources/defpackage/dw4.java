package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {215}, m = "resolveFullyUnengaged", v = 1)
public final class dw4 extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uv4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(null, 0L, this);
    }
}
