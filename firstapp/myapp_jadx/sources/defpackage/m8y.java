package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.nuvei.withdraw.NuveiWithdrawScreenKt$NuveiWithdrawScreen$1$1", f = "NuveiWithdrawScreen.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class m8y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y9y b;
    public final /* synthetic */ Function1<String, Unit> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function1<String, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super String, Unit> function1) {
            this.a = function1;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            w8y w8yVar = (w8y) obj;
            if (!(w8yVar instanceof w8y.a)) {
                uhc.a();
                return null;
            }
            this.a.invoke(((w8y.a) w8yVar).a);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m8y(y9y y9yVar, Function1<? super String, Unit> function1, v1b<? super m8y> v1bVar) {
        super(2, v1bVar);
        this.b = y9yVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m8y(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m8y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ku90 ku90Var = this.b.Z;
        a aVar = new a(this.c);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
