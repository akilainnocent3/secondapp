package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$closeForever$2", f = "PaymentDataStoreImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class c700 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d700 b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$closeForever$2$1", f = "PaymentDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            zn20.a<Boolean> aVarA = co20.a(this.b);
            Boolean bool = Boolean.FALSE;
            jtwVar.getClass();
            jtwVar.h(aVarA, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c700(d700 d700Var, String str, v1b<? super c700> v1bVar) {
        super(2, v1bVar);
        this.b = d700Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c700(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c700) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sqc<zn20> sqcVarA = q700.a(this.b.a);
            a aVar = new a(this.c, null);
            this.a = 1;
            if (do20.a(sqcVarA, aVar, this) == y5bVar) {
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
