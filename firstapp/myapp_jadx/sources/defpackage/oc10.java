package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment$onLoadedStatePropertyChanged$$inlined$collectWithLifecycle$default$1", f = "PixBtgWithdrawFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class oc10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PixBtgWithdrawFragment b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ Function1 d;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment$onLoadedStatePropertyChanged$$inlined$collectWithLifecycle$default$1$1", f = "PixBtgWithdrawFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ Function1 d;

        /* JADX INFO: renamed from: oc10$a$a, reason: collision with other inner class name */
        public static final class C0923a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ Function1 b;

            public C0923a(v5b v5bVar, Function1 function1) {
                this.b = function1;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                this.b.invoke(t);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, lyh lyhVar, Function1 function1) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c, this.d);
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
                C0923a c0923a = new C0923a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0923a, this) == y5bVar) {
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
    public oc10(PixBtgWithdrawFragment pixBtgWithdrawFragment, lyh lyhVar, v1b v1bVar, Function1 function1) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = pixBtgWithdrawFragment;
        this.c = lyhVar;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new oc10(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oc10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(null, this.c, this.d);
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
