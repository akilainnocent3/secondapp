package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.GetDepositPaybillItemsUseCase", f = "GetDepositPaybillItemsUseCase.kt", l = {58, 69}, m = "provideTzPayBillItems", v = 2)
public final class n5k extends x1b {
    public Collection a;
    public Iterator b;
    public jah0.b c;
    public Collection d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l5k f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5k(l5k l5kVar, x1b x1bVar) {
        super(x1bVar);
        this.f = l5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
