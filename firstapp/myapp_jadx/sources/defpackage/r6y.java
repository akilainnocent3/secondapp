package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositScreenKt$NuveiDepositScreen$1$1", f = "NuveiDepositScreen.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class r6y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c8y b;
    public final /* synthetic */ Function1<String, Unit> c;
    public final /* synthetic */ Function0<Unit> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ Function0<Unit> b;

        public a(Function0 function0, Function1 function1) {
            this.a = function1;
            this.b = function0;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a7y a7yVar = (a7y) obj;
            if (a7yVar instanceof a7y.a) {
                this.a.invoke(((a7y.a) a7yVar).a);
            } else {
                if (!Intrinsics.g(a7yVar, a7y.b.a)) {
                    uhc.a();
                    return null;
                }
                this.b.invoke();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r6y(c8y c8yVar, Function1<? super String, Unit> function1, Function0<Unit> function0, v1b<? super r6y> v1bVar) {
        super(2, v1bVar);
        this.b = c8yVar;
        this.c = function1;
        this.d = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r6y(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r6y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        ku90 ku90Var = this.b.j0;
        a aVar = new a(this.d, this.c);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
