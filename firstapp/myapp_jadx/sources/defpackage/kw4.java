package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastStore", f = "BonusVaultToastStore.kt", l = {106, 107, 108, 109}, m = "clearLegacyRedeemReminderState", v = 1)
public final class kw4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mw4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw4(mw4 mw4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mw4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(this);
    }
}
