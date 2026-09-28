package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.allpayments.compose.AllPaymentsScreenKt$AllPaymentsScreen$3$1", f = "AllPaymentsScreen.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class gv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sv b;
    public final /* synthetic */ Function0<Unit> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function0<Unit> a;

        public a(Function0<Unit> function0) {
            this.a = function0;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((lv) obj) instanceof lv.a) {
                this.a.invoke();
                return Unit.a;
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(sv svVar, Function0<Unit> function0, v1b<? super gv> v1bVar) {
        super(2, v1bVar);
        this.b = svVar;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gv(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((gv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ku90<lv> ku90Var = this.b.w;
        a aVar = new a(this.c);
        this.a = 1;
        ku90Var.collect(aVar, this);
        return y5bVar;
    }
}
