package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.CampaignRepository", f = "CampaignRepository.kt", l = {KYCBannerItem.STATUS_DEPRECATE, 28, 30}, m = "getTierNotReachedData", v = 1)
public final class j86 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w86 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j86(w86 w86Var, x1b x1bVar) {
        super(x1bVar);
        this.c = w86Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
