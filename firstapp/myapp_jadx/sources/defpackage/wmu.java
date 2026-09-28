package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.common.AssetData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl", f = "ManageAccountUiManager.kt", l = {229, 243, 248, r.d.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "deleteSavedAccount", v = 2)
public final class wmu extends x1b {
    public AssetData.AccountsBean a;
    public String b;
    public xmu c;
    public boolean d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xmu i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmu(xmu xmuVar, x1b x1bVar) {
        super(x1bVar);
        this.i = xmuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, false, this);
    }
}
