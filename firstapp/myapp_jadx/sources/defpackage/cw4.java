package defpackage;

import com.sportygames.common.network.campaign.Campaign;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {410, 97, 104, 111}, m = "resolveFromUserJourney", v = 1)
public final class cw4 extends x1b {
    public Campaign a;
    public quw b;
    public long c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ uv4 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.i = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.f(null, 0L, this);
    }
}
