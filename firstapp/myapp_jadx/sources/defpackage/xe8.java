package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$setupDepositBannerContent$$inlined$collectWithLifecycle$default$1", f = "CommonMobileMoneyDepositFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class xe8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ re8 d;

    @c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$setupDepositBannerContent$$inlined$collectWithLifecycle$default$1$1", f = "CommonMobileMoneyDepositFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ re8 d;

        /* JADX INFO: renamed from: xe8$a$a, reason: collision with other inner class name */
        public static final class C1290a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ re8 b;

            public C1290a(v5b v5bVar, re8 re8Var) {
                this.b = re8Var;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                String str = (String) t;
                re8.a aVar = re8.P;
                re8 re8Var = this.b;
                c8i0.o(re8Var.n0().D, !StringsKt.U(str));
                if (!StringsKt.U(str)) {
                    mla.i(re8Var.n0().D, new op8(1939221876, new ye8(str), true));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, re8 re8Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = re8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1290a c1290a = new C1290a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1290a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe8(ibs ibsVar, lyh lyhVar, v1b v1bVar, re8 re8Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new xe8(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xe8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
