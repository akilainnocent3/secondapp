package defpackage;

import com.sportybet.core.gift.domain.DobGift;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.domain.usecase.ProcessDobGiftUseCase", f = "ProcessDobGiftUseCase.kt", l = {20, 18}, m = "processDobGift", v = 2)
public final class fx20 extends x1b {
    public DobGift a;
    public prk b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gx20 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx20(gx20 gx20Var, x1b x1bVar) {
        super(x1bVar);
        this.e = gx20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
