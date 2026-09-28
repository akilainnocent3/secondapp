package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignsData;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {148, 149, 150, 151, 152, 154}, m = "resolveAndMark", v = 1)
public final class zv4 extends x1b {
    public CampaignsData a;
    public Campaign b;
    public uv4.a c;
    public nw4 d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ uv4 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.i = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.k(null, null, null, null, 0L, this);
    }
}
