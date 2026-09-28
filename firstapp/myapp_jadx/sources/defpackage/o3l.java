package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$onViewInitialized$1", f = "GlobalWithdrawViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class o3l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;

    public static final class a<T> implements myh {
        public static final a<T> a = new a<>();

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            z600.a().b();
            return Unit.a;
        }
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o3l(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o3l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ssw<Boolean> sswVar = z600.a().f;
            sswVar.getClass();
            lyh lyhVarA = i2i.a(sswVar);
            this.a = 1;
            if (lyhVarA.collect(a.a, this) == y5bVar) {
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
