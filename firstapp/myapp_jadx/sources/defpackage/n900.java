package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.PaymentScreenHostKt$PaymentScreenHost$3$1", f = "PaymentScreenHost.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class n900 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n000 b;
    public final /* synthetic */ Function1<h000, Unit> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function1<h000, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super h000, Unit> function1) {
            this.a = function1;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.invoke((h000) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n900(n000 n000Var, Function1<? super h000, Unit> function1, v1b<? super n900> v1bVar) {
        super(2, v1bVar);
        this.b = n000Var;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n900(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n900) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        ku90 ku90Var = this.b.w;
        a aVar = new a(this.c);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
