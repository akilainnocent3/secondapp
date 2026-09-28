package defpackage;

import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.payday.presentation.PaydayGiftViewModel$onDismissRequested$1", f = "PaydayGiftViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class k500 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j500 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k500(j500 j500Var, v1b<? super k500> v1bVar) {
        super(2, v1bVar);
        this.b = j500Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k500(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k500) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            long j = j500.i;
            this.a = 1;
            if (hkd.c(j, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        j500 j500Var = this.b;
        if (!j500Var.e) {
            t400 t400Var = j500Var.a;
            PaydayPromoModalVariantDomain variant = j500Var.d.getVariant();
            t400Var.getClass();
            variant.getClass();
            t400Var.b.a(new p500.a(variant.getValue()), k00.d);
        }
        j500Var.x1(h500.b.a);
        return Unit.a;
    }
}
