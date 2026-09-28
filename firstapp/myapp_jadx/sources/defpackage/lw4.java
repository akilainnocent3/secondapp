package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastStore", f = "BonusVaultToastStore.kt", l = {38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "clearRedeemReminder", v = 1)
public final class lw4 extends x1b {
    public sp40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mw4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw4(mw4 mw4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = mw4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
