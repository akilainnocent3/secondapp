package defpackage;

import com.sportybet.feature.gift.gift.presentation.k;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel", f = "GiftViewModel.kt", l = {438}, m = "handleGiftNavigation", v = 2)
public final class wyk extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyk(k kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.z1(this, null, null);
    }
}
