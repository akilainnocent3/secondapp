package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$setMethodPartialRate$2", f = "PaymentDataStoreImpl.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class i700 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ log0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d700 d;
    public final /* synthetic */ Integer e;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$setMethodPartialRate$2$1", f = "PaymentDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Integer num, v1b v1bVar) {
            super(2, v1bVar);
            this.b = num;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.b, v1bVar);
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
            Integer num = this.b;
            String str = this.c;
            if (num == null) {
                jtwVar.f(new zn20.a(str));
            } else {
                zn20.a<?> aVar = new zn20.a<>(str);
                jtwVar.getClass();
                jtwVar.h(aVar, num);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i700(log0 log0Var, String str, d700 d700Var, Integer num, v1b<? super i700> v1bVar) {
        super(2, v1bVar);
        this.b = log0Var;
        this.c = str;
        this.d = d700Var;
        this.e = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i700(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i700) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String strName = this.b.name();
            d700 d700Var = this.d;
            String str = "PREF_KEY_METHOD_PARTIAL_RATE" + strName + this.c + d700Var.b.getCountryCode();
            sqc<zn20> sqcVarA = q700.a(d700Var.a);
            a aVar = new a(str, this.e, null);
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
