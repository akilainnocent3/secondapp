package defpackage;

import com.sportygames.common.network.campaign.CampaignsData;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {410, 67, 87}, m = "onCampaignsDataReceived", v = 1)
public final class yv4 extends x1b {
    public CampaignsData a;
    public quw b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uv4 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.f = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
