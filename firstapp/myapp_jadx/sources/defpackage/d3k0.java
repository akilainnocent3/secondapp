package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.WorldCupPassRepositoryImpl", f = "WorldCupPassRepositoryImpl.kt", l = {47}, m = "purchaseFromBalance", v = 2)
public final class d3k0 extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e3k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3k0(e3k0 e3k0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = e3k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
