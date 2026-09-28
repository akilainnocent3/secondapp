package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.repository.BonusVaultRepository", f = "BonusVaultRepository.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "selectGame", v = 1)
public final class hv4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iv4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv4(iv4 iv4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = iv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, null, this);
    }
}
