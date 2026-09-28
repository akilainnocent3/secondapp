package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {341, 345, 348}, m = "syncRedeemReminderStateFromTopicResponse", v = 1)
public final class iw4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ uv4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.r(null, 0L, this);
    }
}
