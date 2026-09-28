package defpackage;

import com.sportygames.common.network.campaign.Campaign;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {244}, m = "resolveCampaignEnding", v = 1)
public final class aw4 extends x1b {
    public Campaign a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uv4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, null, this);
    }
}
