package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$updateNotNew$2", f = "LoyaltyUseCase.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class t2u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u2u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2u(v1b v1bVar, u2u u2uVar) {
        super(2, v1bVar);
        this.b = u2uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t2u(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t2u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.c;
            Boolean bool = Boolean.FALSE;
            this.a = 1;
            if (m2lVar.a.putBoolean("key - is loyalty new feature", bool, this) == y5bVar) {
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
