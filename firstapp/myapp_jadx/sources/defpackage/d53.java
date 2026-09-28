package defpackage;

import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.BetSlipMarketingDomainService$validateGiftService$1", f = "BetSlipMarketingDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d53 extends tje0 implements Function2<lk50<? extends List<? extends GiftGroup>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h53 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d53(h53 h53Var, v1b v1bVar, boolean z, boolean z2) {
        super(2, v1bVar);
        this.b = z;
        this.c = z2;
        this.d = h53Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d53 d53Var = new d53(this.d, v1bVar, this.b, this.c);
        d53Var.a = obj;
        return d53Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends GiftGroup>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((d53) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        if (!z) {
            return Unit.a;
        }
        boolean z2 = this.b;
        h53 h53Var = this.d;
        if (z2 || !this.c) {
            h53Var.f(z);
        } else {
            h53Var.d(z);
        }
        return Unit.a;
    }
}
