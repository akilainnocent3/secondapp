package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel$showAddEmailPromptIfNeed$isEmailBound$1", f = "ResetPasswordViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class pd50 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ kd50 b;

    @c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel$showAddEmailPromptIfNeed$isEmailBound$1$1", f = "ResetPasswordViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!(lk50Var instanceof lk50.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd50(kd50 kd50Var, v1b<? super pd50> v1bVar) {
        super(2, v1bVar);
        this.b = kd50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pd50(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((pd50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yzh yzhVarA = bm50.a(this.b.w.h());
            a aVar = new a(2, null);
            this.a = 1;
            obj = s0i.d(yzhVarA, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if (lk50Var != null) {
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (cVar != null) {
                return (Boolean) cVar.a;
            }
        }
        return null;
    }
}
