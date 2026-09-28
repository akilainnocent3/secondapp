package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.promotion.PromotionRepositoryImpl", f = "PromotionRepositoryImpl.kt", l = {98}, m = "getPromotionInfo", v = 2)
public final class m530 extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j530 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m530(j530 j530Var, x1b x1bVar) {
        super(x1bVar);
        this.c = j530Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(0, this, null);
    }
}
