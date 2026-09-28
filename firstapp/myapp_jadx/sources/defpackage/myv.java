package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment$initViewModel$lambda$0$$inlined$collectWithLifecycle$default$3", f = "MobileMoneyDepositFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class myv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MobileMoneyDepositFragment b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ MobileMoneyDepositFragment d;

    @c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment$initViewModel$lambda$0$$inlined$collectWithLifecycle$default$3$1", f = "MobileMoneyDepositFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ MobileMoneyDepositFragment d;

        /* JADX INFO: renamed from: myv$a$a, reason: collision with other inner class name */
        public static final class C0884a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ MobileMoneyDepositFragment b;

            public C0884a(v5b v5bVar, MobileMoneyDepositFragment mobileMoneyDepositFragment) {
                this.b = mobileMoneyDepositFragment;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                this.b.D1().w.setEnabled(zBooleanValue);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, MobileMoneyDepositFragment mobileMoneyDepositFragment) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = mobileMoneyDepositFragment;
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
                C0884a c0884a = new C0884a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0884a, this) == y5bVar) {
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
    public myv(MobileMoneyDepositFragment mobileMoneyDepositFragment, lyh lyhVar, v1b v1bVar, MobileMoneyDepositFragment mobileMoneyDepositFragment2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = mobileMoneyDepositFragment;
        this.c = lyhVar;
        this.d = mobileMoneyDepositFragment2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new myv(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((myv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
