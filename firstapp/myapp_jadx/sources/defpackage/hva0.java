package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment$collectStates$$inlined$collectWithLifecycle$default$1", f = "SpeiByStpDepositFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class hva0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SpeiByStpDepositFragment b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ SpeiByStpDepositFragment d;

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment$collectStates$$inlined$collectWithLifecycle$default$1$1", f = "SpeiByStpDepositFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ SpeiByStpDepositFragment d;

        /* JADX INFO: renamed from: hva0$a$a, reason: collision with other inner class name */
        public static final class C0656a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ SpeiByStpDepositFragment b;

            public C0656a(v5b v5bVar, SpeiByStpDepositFragment speiByStpDepositFragment) {
                this.b = speiByStpDepositFragment;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                SpeiByStpDepositFragment speiByStpDepositFragment = this.b;
                if (zBooleanValue) {
                    ohp<Object>[] ohpVarArr = SpeiByStpDepositFragment.m0;
                    speiByStpDepositFragment.T0();
                } else {
                    ohp<Object>[] ohpVarArr2 = SpeiByStpDepositFragment.m0;
                    speiByStpDepositFragment.N0();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, SpeiByStpDepositFragment speiByStpDepositFragment) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = speiByStpDepositFragment;
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
                C0656a c0656a = new C0656a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0656a, this) == y5bVar) {
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
    public hva0(SpeiByStpDepositFragment speiByStpDepositFragment, lyh lyhVar, v1b v1bVar, SpeiByStpDepositFragment speiByStpDepositFragment2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = speiByStpDepositFragment;
        this.c = lyhVar;
        this.d = speiByStpDepositFragment2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new hva0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hva0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
