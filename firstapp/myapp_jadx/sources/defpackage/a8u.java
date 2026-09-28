package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$2", f = "LuckyNumberViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class a8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f8u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8u(f8u f8uVar, v1b<? super a8u> v1bVar) {
        super(2, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a8u(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f8u f8uVar = this.b;
            xjh0 xjh0Var = f8uVar.c;
            b390 b390Var = f8uVar.B;
            this.a = 1;
            xjh0Var.getClass();
            Object objD = w5b.d(new zjh0(xjh0Var, b390Var, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
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
