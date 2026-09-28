package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {230}, m = "resolvePartiallyUnengaged", v = 1)
public final class fw4 extends x1b {
    public long a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ uv4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.e = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(null, 0L, this);
    }
}
