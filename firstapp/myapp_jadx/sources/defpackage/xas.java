package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.LifecycleEffectKt$CollectEffectWithLifecycle$1$1", f = "LifecycleEffect.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class xas extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ s9s.b c;
    public final /* synthetic */ lyh<Object> d;
    public final /* synthetic */ Function1<Object, Unit> e;

    @c0d(c = "com.sporty.android.compose.ui.LifecycleEffectKt$CollectEffectWithLifecycle$1$1$1", f = "LifecycleEffect.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<Object> b;
        public final /* synthetic */ Function1<Object, Unit> c;

        /* JADX INFO: renamed from: xas$a$a, reason: collision with other inner class name */
        public static final class C1283a<T> implements myh {
            public final /* synthetic */ Function1<T, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1283a(Function1<? super T, Unit> function1) {
                this.a = function1;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                this.a.invoke(t);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, lyh lyhVar, Function1 function1) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1283a c1283a = new C1283a(this.c);
                this.a = 1;
                if (this.b.collect(c1283a, this) == y5bVar) {
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
    public xas(ibs ibsVar, s9s.b bVar, lyh<Object> lyhVar, Function1<Object, Unit> function1, v1b<? super xas> v1bVar) {
        super(2, v1bVar);
        this.b = ibsVar;
        this.c = bVar;
        this.d = lyhVar;
        this.e = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xas(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xas) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            a aVar = new a(null, this.d, this.e);
            this.a = 1;
            if (m850.a(lifecycle, this.c, aVar, this) == y5bVar) {
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
