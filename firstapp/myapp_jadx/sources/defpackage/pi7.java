package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.twofa.domain.usecase.CheckIs2FAEnableUseCase$invoke$2", f = "CheckIs2FAEnableUseCase.kt", l = {22, 24}, m = "invokeSuspend", v = 2)
public final class pi7 extends tje0 implements Function2<v5b, v1b<? super lk50<? extends Boolean>>, Object> {
    public lk50.c a;
    public int b;
    public final /* synthetic */ qi7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi7(qi7 qi7Var, v1b<? super pi7> v1bVar) {
        super(2, v1bVar);
        this.c = qi7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pi7(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends Boolean>> v1bVar) {
        return ((pi7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.b;
        qi7 qi7Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            gcu gcuVar = qi7Var.a;
            this.b = 1;
            obj = gcuVar.d(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i != 1) {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lk50.c cVar = this.a;
            uj50.b(obj);
            return cVar;
        }
        uj50.b(obj);
        lk50 lk50VarL = bm50.l((lk50) obj, new oi7(0));
        if (lk50VarL instanceof lk50.c) {
            mgb0 mgb0Var = qi7Var.b;
            lk50.c cVar2 = (lk50.c) lk50VarL;
            boolean zBooleanValue = ((Boolean) cVar2.a).booleanValue();
            this.a = cVar2;
            this.b = 2;
            if (mgb0Var.setTwoFactorAuthEnabled(zBooleanValue, this) == y5bVar) {
                return y5bVar;
            }
        }
        return lk50VarL;
    }
}
