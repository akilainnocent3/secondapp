package defpackage;

import com.sportygames.compose.campaign.models.CampaignTopicResponse;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {410, 120, 129, 136}, m = "resolveFromTopicResponse", v = 1)
public final class bw4 extends x1b {
    public CampaignTopicResponse a;
    public quw b;
    public long c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ uv4 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.i = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.e(null, 0L, this);
    }
}
