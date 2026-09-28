package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.FlexiBetDomainService$fetchFlexiBetConfig$2", f = "FlexiBetDomainService.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class ivh extends tje0 implements Function2<BetTypeFlexiBetConfig, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jvh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivh(jvh jvhVar, v1b<? super ivh> v1bVar) {
        super(2, v1bVar);
        this.c = jvhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ivh ivhVar = new ivh(this.c, v1bVar);
        ivhVar.b = obj;
        return ivhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BetTypeFlexiBetConfig betTypeFlexiBetConfig, v1b<? super Unit> v1bVar) {
        return ((ivh) create(betTypeFlexiBetConfig, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            w43 w43Var = this.c.b;
            this.b = null;
            this.a = 1;
            if (w43Var.b(betTypeFlexiBetConfig, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
