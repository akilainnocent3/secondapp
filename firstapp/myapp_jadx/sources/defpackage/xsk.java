package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.components.GiftSectionHeaderKt$GiftSectionHeader$1$2$1$1$1", f = "GiftSectionHeader.kt", l = {121}, m = "invokeSuspend", v = 2)
public final class xsk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b1g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsk(b1g0 b1g0Var, v1b<? super xsk> v1bVar) {
        super(2, v1bVar);
        this.b = b1g0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xsk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xsk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b1g0 b1g0Var = this.b;
            if (b1g0Var.b()) {
                b1g0Var.a();
            } else {
                this.a = 1;
                if (b1g0Var.c(huw.a, this) == y5bVar) {
                    return y5bVar;
                }
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
